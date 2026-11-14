package com.musicmap.car

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.*

/** Account setup and browsing are parked-only; playback continues in the existing vehicle service. */
class AppleMusicActivity : Activity() {
    private val app get() = application as MusicMapApplication
    private val repository get() = app.appleMusic
    private lateinit var kit: UiKit
    private lateinit var status: TextView
    private lateinit var feedback: TextView
    private lateinit var nowPlaying: TextView
    private lateinit var connect: Button
    private lateinit var query: EditText
    private lateinit var actions: LinearLayout
    private lateinit var rows: LinearLayout
    private lateinit var more: Button
    private var page = emptyList<Track>()
    private var next: String? = null
    private var busy = false
    private var signingIn = false
    private var requestId = 0
    private var restricted = false
    private var guard: CarUxGuard? = null
    private val update: () -> Unit = { renderState() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signingIn = savedInstanceState?.getBoolean("signingIn") ?: false
        val config = resources.configuration
        kit = UiKit(this, (minOf(config.screenWidthDp, config.screenHeightDp) / 600f).coerceIn(1f, 1.5f))
        window.statusBarColor = Ui.BASE; window.navigationBarColor = Ui.BASE
        buildUi()
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_AUTOMOTIVE)) {
            restricted = true
            guard = CarUxGuard(this) { value -> runOnUiThread { restricted = value; renderState() } }
        }
        renderState()
        // Debug builds only: accept a Music User Token obtained outside the app (MusicKit on the web).
        val supplied = if (BuildConfig.DEBUG) intent.getStringExtra("mut")?.trim() else null
        if (!supplied.isNullOrEmpty()) {
            busy = true; feedback.text = "Apple Music 계정을 확인하고 있어요…"
            val id = ++requestId
            repository.connect(supplied) { result ->
                if (id != requestId || isDestroyed) return@connect
                busy = false
                result.onSuccess { feedback.text = "Apple Music에 연결했어요. 곡을 선택하면 전체 곡을 재생합니다."; loadLibrary() }
                    .onFailure { feedback.text = failureMessage(it) }
                renderState()
            }
        } else if (repository.connected && !signingIn) loadLibrary()
        else if (!restricted && repository.catalogReady) feedback.text = "곡이나 아티스트를 검색하면 30초 미리듣기로 바로 들을 수 있어요"
        renderState()
    }
    override fun onStart() { super.onStart(); app.state.listeners.add(update); renderState() }
    override fun onStop() { app.state.listeners.remove(update); super.onStop() }
    override fun onDestroy() { requestId++; guard?.close(); super.onDestroy() }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean("signingIn", signingIn); super.onSaveInstanceState(outState)
    }

    private fun buildUi() {
        val root = FrameLayout(this).apply { setBackgroundColor(Ui.BASE) }
        setContentView(root)
        // One readable column instead of controls stretched across a wide car display.
        val column = kit.column().apply { setPadding(kit.u(24f), kit.u(16f), kit.u(24f), kit.u(16f)) }
        val maxWidth = kit.u(760f)
        val screenW = kit.dp(resources.configuration.screenWidthDp.toFloat())
        root.addView(column, FrameLayout.LayoutParams(minOf(maxWidth, screenW), -1, Gravity.CENTER_HORIZONTAL))

        val header = kit.row()
        header.addView(kit.circle(Icon.BACK, 48f, Ui.RAISED, Ui.TEXT_SOFT, "돌아가기") { finish() }, kit.lp(kit.u(48f), kit.u(48f)))
        header.addView(kit.text("Apple Music", T.TITLE), kit.lp(0, -2, 1f) { leftMargin = kit.u(16f) })
        column.addView(header)

        val account = kit.row()
        status = kit.text("", T.BODY, Ui.TEXT_SOFT)
        account.addView(status, kit.lp(0, -2, 1f) { rightMargin = kit.u(16f) })
        connect = kit.button("연결", Tone.PRIMARY) { if (repository.connected) disconnect() else signIn() }
        account.addView(connect, kit.lp(-2, kit.u(48f)))
        column.addView(account, kit.lp(-1, -2) { topMargin = kit.u(24f) })

        actions = kit.row()
        query = EditText(this).apply {
            hint = "곡 또는 아티스트"; contentDescription = "Apple Music 곡 또는 아티스트 검색"
            setTextColor(Ui.TEXT); setHintTextColor(Ui.TEXT_MUTED); textSize = 16f * kit.s
            background = kit.shape(Ui.RAISED, 10f, Ui.HAIRLINE); setPadding(kit.u(16f), 0, kit.u(16f), 0)
            setSingleLine(); imeOptions = EditorInfo.IME_ACTION_SEARCH; inputType = android.text.InputType.TYPE_CLASS_TEXT
            setOnEditorActionListener { _, action, _ -> if (action == EditorInfo.IME_ACTION_SEARCH) { search(); true } else false }
        }
        actions.addView(query, kit.lp(0, kit.u(48f), 1f))
        actions.addView(kit.button("검색", Tone.QUIET, Icon.SEARCH) { search() }, kit.lp(-2, kit.u(48f)) { leftMargin = kit.u(8f) })
        actions.addView(kit.button("내 보관함", Tone.QUIET) { loadLibrary() }, kit.lp(-2, kit.u(48f)) { leftMargin = kit.u(8f) })
        column.addView(actions, kit.lp(-1, -2) { topMargin = kit.u(16f) })

        feedback = kit.text("", T.CAPTION, Ui.TEXT_MUTED).apply { accessibilityLiveRegion = View.ACCESSIBILITY_LIVE_REGION_POLITE }
        column.addView(feedback, kit.lp(-1, -2) { topMargin = kit.u(16f) })
        val scroll = ScrollView(this).apply { isFillViewport = true; isVerticalScrollBarEnabled = false }
        rows = kit.column(); scroll.addView(rows)
        column.addView(scroll, kit.lp(-1, 0, 1f) { topMargin = kit.u(12f); leftMargin = -kit.u(8f); rightMargin = -kit.u(8f) })
        more = kit.button("더 불러오기", Tone.OUTLINE) { next?.let { path -> fetch(append = true) { callback -> repository.more(path, callback) } } }
        column.addView(more, kit.lp(-1, kit.u(48f)) { topMargin = kit.u(8f) })
        nowPlaying = kit.oneLine(kit.text("", T.CAPTION, Ui.TEXT_SOFT))
        column.addView(nowPlaying, kit.lp(-1, -2) { topMargin = kit.u(12f) })
    }

    private fun signIn() {
        if (restricted || busy || signingIn) return
        (AppleMusicConfig.tokenProblem() ?: MusicKitBridge.problem())?.let { feedback.text = it; return }
        runCatching {
            signingIn = true; renderState()
            startActivityForResult(MusicKitBridge.signInIntent(this), SIGN_IN)
        }.onFailure { signingIn = false; feedback.text = "Apple Music 인증 화면을 열 수 없어요. Apple Music 설치와 연결 설정을 확인해 주세요."; renderState() }
    }
    @Deprecated("Platform Activity result API is used to match the MusicKit authentication contract")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode != SIGN_IN) return
        signingIn = false
        if (resultCode != RESULT_OK || data == null) { feedback.text = "Apple Music 연결을 취소했어요. 연결 버튼으로 다시 시도할 수 있어요."; renderState(); return }
        if (restricted) { feedback.text = "주차 후 Apple Music을 다시 연결해 주세요."; renderState(); return }
        runCatching { MusicKitBridge.userToken(this, data) }.onSuccess { token ->
            busy = true; feedback.text = "Apple Music 계정을 확인하고 있어요…"; renderState()
            val id = ++requestId
            repository.connect(token) { result ->
                if (id != requestId || isDestroyed) return@connect
                busy = false
                result.onSuccess { feedback.text = "Apple Music에 연결했어요. 곡을 선택하면 재생됩니다."; loadLibrary() }
                    .onFailure { feedback.text = failureMessage(it) }
                renderState()
            }
        }.onFailure { feedback.text = "Apple Music 인증을 완료하지 못했어요. 다시 연결해 주세요."; renderState() }
    }

    private fun disconnect() {
        if (restricted || busy) return
        requestId++
        repository.disconnect(); page = emptyList(); next = null; rows.removeAllViews()
        if (app.state.current?.id?.startsWith("apple:") == true)
            startForegroundService(Intent(this, PlaybackService::class.java).setAction("apple_disconnect"))
        feedback.text = "이 앱에서 Apple Music 연결을 해제했어요."; renderState()
    }
    private fun search() {
        if (query.text.toString().isBlank()) { feedback.text = "검색할 곡이나 아티스트를 입력해 주세요."; return }
        fetch { callback -> repository.search(query.text.toString(), callback) }
    }
    private fun loadLibrary() = fetch { callback -> repository.library(callback) }
    private fun fetch(append: Boolean = false, request: ((Result<AppleMusicPage>) -> Unit) -> Unit) {
        if (restricted || busy || signingIn) return
        if (!repository.connected && !repository.catalogReady) { feedback.text = AppleMusicConfig.tokenProblem() ?: "Apple Music에 먼저 연결해 주세요."; return }
        busy = true; feedback.text = "음악을 불러오고 있어요…"; renderState()
        val id = ++requestId
        request { result ->
            if (id != requestId || isDestroyed) return@request
            busy = false
            result.onSuccess { response ->
                page = (if (append) page + response.tracks else response.tracks).distinctBy { it.id }
                next = response.next; drawTracks()
                feedback.text = if (page.isEmpty()) "표시할 음악이 없어요. 다른 검색어를 입력하거나 Apple Music 보관함에 곡을 추가해 주세요."
                    else if (fullPlayback()) "${page.size}곡 · 곡을 선택하면 전체 곡을 재생합니다"
                    else "${page.size}곡 · 곡을 선택하면 30초 미리듣기가 재생됩니다"
            }.onFailure { feedback.text = failureMessage(it) }
            renderState()
        }
    }
    private fun drawTracks() {
        rows.removeAllViews()
        page.forEach { track ->
            val view = kit.row().apply {
                background = kit.surface(Color.TRANSPARENT, 10f)
                setPadding(kit.u(8f), kit.u(8f), kit.u(12f), kit.u(8f)); minimumHeight = kit.u(72f)
                isFocusable = true; contentDescription = "${track.title}, ${track.artist}, ${if (playable(track)) "재생" else "재생 불가"}"
                setOnClickListener {
                    if (!restricted && playable(track)) {
                        repository.selectList(page.filter(::playable))
                        startForegroundService(Intent(this@AppleMusicActivity, PlaybackService::class.java)
                            .setAction("select").putExtra("id", track.id))
                        finish()
                    }
                }
                tag = playable(track)
            }
            view.addView(kit.art(track), kit.lp(kit.u(56f), kit.u(56f)) { rightMargin = kit.u(16f) })
            val info = kit.column()
            info.addView(kit.oneLine(kit.text(track.title, T.BODY_STRONG)))
            info.addView(kit.oneLine(kit.text("${track.artist} · ${track.reason}", T.CAPTION, Ui.TEXT_MUTED)), kit.lp(-1, -2) { topMargin = kit.u(4f) })
            view.addView(info, kit.lp(0, -2, 1f))
            rows.addView(view, kit.lp(-1, -2) { bottomMargin = kit.u(4f) })
        }
    }
    private fun fullPlayback() = repository.connected && MusicKitBridge.problem() == null
    private fun playable(track: Track) = if (fullPlayback()) track.appleMusicId != null else track.previewUrl != null
    private fun failureMessage(error: Throwable) = if (error is AppleMusicFailure) error.message
        else "음악을 불러오지 못했어요. 인터넷 연결을 확인하고 다시 시도해 주세요."
    private fun renderState() {
        if (!::status.isInitialized) return
        status.text = when {
            restricted -> "주차 후 계정 연결과 검색을 이용해 주세요"
            repository.connected -> "연결됨 · ${repository.account.storefront.uppercase()}"
            repository.catalogReady -> "검색과 30초 미리듣기를 바로 쓸 수 있어요\n계정을 연결하면 내 보관함과 전체 곡 재생이 열려요"
            else -> "계정을 연결하면 내 보관함과 검색을 쓸 수 있어요\n전체 곡 재생에는 구독이 필요해요"
        }
        connect.text = if (signingIn) "연결 중…" else if (repository.connected) "연결 해제" else "Apple Music 연결"
        kit.tone(connect, if (repository.connected) Tone.OUTLINE else Tone.PRIMARY)
        connect.isEnabled = !restricted && !busy && !signingIn
        connect.alpha = if (connect.isEnabled) 1f else .4f
        query.isEnabled = !restricted && !busy && !signingIn && (repository.connected || repository.catalogReady)
        for (i in 0 until actions.childCount) actions.getChildAt(i).apply {
            isEnabled = query.isEnabled && (i < 2 || repository.connected); alpha = if (isEnabled) 1f else .4f
        }
        feedback.visibility = if (feedback.text.isEmpty()) View.GONE else View.VISIBLE
        more.visibility = if (next == null) View.GONE else View.VISIBLE
        more.isEnabled = query.isEnabled
        for (i in 0 until rows.childCount) rows.getChildAt(i).apply { isEnabled = !restricted && !busy && tag == true; alpha = if (isEnabled) 1f else .45f }
        nowPlaying.text = app.state.current?.let { "${if (app.state.playing) "재생 중" else "선택한 곡"} · ${it.title} — ${it.artist}" } ?: ""
        nowPlaying.visibility = if (nowPlaying.text.isEmpty()) View.GONE else View.VISIBLE
    }
    companion object { private const val SIGN_IN = 310 }
}
