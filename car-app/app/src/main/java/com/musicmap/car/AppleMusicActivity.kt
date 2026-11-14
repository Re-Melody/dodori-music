package com.musicmap.car

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.*

/** Account setup and browsing are parked-only; playback continues in the existing vehicle service. */
class AppleMusicActivity : Activity() {
    private val app get() = application as MusicMapApplication
    private val repository get() = app.appleMusic
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
        window.statusBarColor = Ui.BASE; window.navigationBarColor = Ui.BASE
        buildUi()
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_AUTOMOTIVE)) {
            restricted = true
            guard = CarUxGuard(this) { value -> runOnUiThread { restricted = value; renderState() } }
        }
        renderState()
        if (repository.connected && !signingIn) loadLibrary()
    }
    override fun onStart() { super.onStart(); app.state.listeners.add(update); renderState() }
    override fun onStop() { app.state.listeners.remove(update); super.onStop() }
    override fun onDestroy() { requestId++; guard?.close(); super.onDestroy() }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean("signingIn", signingIn); super.onSaveInstanceState(outState)
    }

    private fun dp(value: Int) = (value * resources.displayMetrics.density).toInt()
    private fun column() = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
    private fun label(value: String, size: Float = 16f, color: Int = Ui.TEXT) = TextView(this).apply {
        text = value; textSize = size; setTextColor(color)
    }
    private fun button(value: String, action: () -> Unit) = Button(this).apply {
        text = value; isAllCaps = false; textSize = 16f; minHeight = dp(48)
        setTextColor(Ui.TEXT); backgroundTintList = ColorStateList.valueOf(Ui.RAISED)
        setOnClickListener { action() }
    }
    private fun buildUi() {
        val root = column().apply { setBackgroundColor(Ui.BASE); setPadding(dp(24), dp(16), dp(24), dp(16)) }
        setContentView(root)
        val header = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL }
        header.addView(button("돌아가기") { finish() }, LinearLayout.LayoutParams(-2, dp(56)))
        header.addView(label("Apple Music", 26f).apply {
            typeface = Typeface.DEFAULT_BOLD; setPadding(dp(16), 0, 0, 0)
        }, LinearLayout.LayoutParams(0, -2, 1f))
        root.addView(header)
        root.addView(label("계정을 연결하고, 좋아하는 음악을 여기서 들어보세요.", 16f, Ui.TEXT_MUTED).apply {
            setPadding(0, dp(16), 0, dp(8))
        })
        val accountRow = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL }
        status = label("", 16f, Ui.TEXT_MUTED)
        accountRow.addView(status, LinearLayout.LayoutParams(0, -2, 1f))
        connect = button("연결") { if (repository.connected) disconnect() else signIn() }
        accountRow.addView(connect, LinearLayout.LayoutParams(-2, dp(56)))
        root.addView(accountRow)
        query = EditText(this).apply {
            hint = "곡 또는 아티스트 검색"; contentDescription = "Apple Music 곡 또는 아티스트 검색"
            setTextColor(Ui.TEXT); setHintTextColor(Ui.TEXT_MUTED); textSize = 18f
            setSingleLine(); imeOptions = EditorInfo.IME_ACTION_SEARCH; inputType = android.text.InputType.TYPE_CLASS_TEXT
            setOnEditorActionListener { _, action, _ -> if (action == EditorInfo.IME_ACTION_SEARCH) { search(); true } else false }
        }
        root.addView(query, LinearLayout.LayoutParams(-1, dp(64)))
        actions = LinearLayout(this)
        actions.addView(button("검색") { search() }, LinearLayout.LayoutParams(0, dp(56), 1f))
        actions.addView(button("내 Apple Music 보관함") { loadLibrary() }, LinearLayout.LayoutParams(0, dp(56), 1f))
        root.addView(actions)
        feedback = label("", 16f, Ui.TEXT_MUTED).apply { setPadding(0, dp(12), 0, dp(12)); accessibilityLiveRegion = View.ACCESSIBILITY_LIVE_REGION_POLITE }
        root.addView(feedback)
        val scroll = ScrollView(this).apply { isFillViewport = true }
        rows = column(); scroll.addView(rows)
        root.addView(scroll, LinearLayout.LayoutParams(-1, 0, 1f))
        more = button("더 불러오기") { next?.let { path -> fetch(append = true) { callback -> repository.more(path, callback) } } }
        root.addView(more, LinearLayout.LayoutParams(-1, dp(56)))
        nowPlaying = label("", 16f, Ui.TEXT_SOFT).apply { setPadding(0, dp(12), 0, 0) }
        root.addView(nowPlaying)
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
        if (!repository.connected) { feedback.text = "Apple Music에 먼저 연결해 주세요."; return }
        busy = true; feedback.text = "음악을 불러오고 있어요…"; renderState()
        val id = ++requestId
        request { result ->
            if (id != requestId || isDestroyed) return@request
            busy = false
            result.onSuccess { response ->
                page = (if (append) page + response.tracks else response.tracks).distinctBy { it.id }
                next = response.next; drawTracks()
                feedback.text = if (page.isEmpty()) "표시할 음악이 없어요. 다른 검색어를 입력하거나 Apple Music 보관함에 곡을 추가해 주세요."
                    else "${page.size}곡 · 곡을 선택하면 전체 곡을 재생합니다. Apple Music 구독이 필요해요."
            }.onFailure { feedback.text = failureMessage(it) }
            renderState()
        }
    }
    private fun drawTracks() {
        rows.removeAllViews()
        page.forEach { track ->
            val view = column().apply {
                setPadding(dp(16), dp(12), dp(16), dp(12)); minimumHeight = dp(80)
                background = GradientDrawable().apply { setColor(Ui.RAISED); cornerRadius = dp(8).toFloat() }
                addView(label(track.title, 18f).apply { typeface = Typeface.DEFAULT_BOLD })
                addView(label("${track.artist} · ${track.reason}", 16f, Ui.TEXT_MUTED))
                isFocusable = true; contentDescription = "${track.title}, ${track.artist}, ${if (track.appleMusicId == null) "재생 불가" else "재생"}"
                setOnClickListener {
                    if (!restricted && repository.connected && track.appleMusicId != null) {
                        repository.selectList(page.filter { it.appleMusicId != null })
                        startForegroundService(Intent(this@AppleMusicActivity, PlaybackService::class.java)
                            .setAction("select").putExtra("id", track.id))
                        finish()
                    }
                }
                tag = track.appleMusicId != null
            }
            rows.addView(view, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(8) })
        }
    }
    private fun failureMessage(error: Throwable) = if (error is AppleMusicFailure) error.message
        else "음악을 불러오지 못했어요. 인터넷 연결을 확인하고 다시 시도해 주세요."
    private fun renderState() {
        if (!::status.isInitialized) return
        status.text = when {
            restricted -> "주차 후 계정 연결과 검색을 이용해 주세요."
            repository.connected -> "연결됨 · ${repository.account.storefront.uppercase()}"
            else -> "연결되지 않음 · 전체 곡 재생에는 구독이 필요해요."
        }
        connect.text = if (signingIn) "연결 중…" else if (repository.connected) "연결 해제" else "Apple Music 연결"
        connect.isEnabled = !restricted && !busy && !signingIn
        query.isEnabled = !restricted && !busy && !signingIn && repository.connected
        for (i in 0 until actions.childCount) actions.getChildAt(i).isEnabled = query.isEnabled
        more.visibility = if (next == null) View.GONE else View.VISIBLE
        more.isEnabled = query.isEnabled
        for (i in 0 until rows.childCount) rows.getChildAt(i).apply { isEnabled = !restricted && !busy && tag == true; alpha = if (isEnabled) 1f else .45f }
        nowPlaying.text = app.state.current?.let { "${if (app.state.playing) "재생 중" else "선택한 곡"} · ${it.title} — ${it.artist}" } ?: "곡을 선택하기 전에는 자동 재생하지 않습니다."
    }
    companion object { private const val SIGN_IN = 310 }
}
