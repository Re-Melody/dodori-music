package com.musicmap.car

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MainActivity : Activity() {
    private val state get() = (application as MusicMapApplication).state
    private val background = Color.rgb(247, 248, 243)
    private val panel = Color.rgb(233, 239, 230)
    private val mint = Color.rgb(37, 104, 79)
    private val muted = Color.rgb(108, 126, 116)
    private lateinit var map: MusicMapView
    private lateinit var regionText: TextView
    private lateinit var sourceText: TextView
    private lateinit var messageText: TextView
    private lateinit var currentText: TextView
    private lateinit var detailText: TextView
    private lateinit var timeText: TextView
    private lateinit var playButton: Button
    private lateinit var favorite: Button
    private lateinit var tracks: LinearLayout
    private lateinit var progress: ProgressBar
    private lateinit var jump: Button
    private lateinit var genres: List<Button>
    private lateinit var explore: LinearLayout
    private lateinit var pageTitle: TextView
    private lateinit var listTitle: TextView
    private lateinit var navButtons: List<Button>
    private var playerDialog: android.app.AlertDialog? = null
    private var dialogTitle: TextView? = null
    private var dialogPlay: Button? = null
    private var renderedList = ""
    private var favoritesOnly = false
    private var uxGuard: CarUxGuard? = null
    private var restricted = false
    private val parkedControls = mutableListOf<View>()
    private val update: () -> Unit = { render() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        favoritesOnly = savedInstanceState?.getBoolean("favoritesOnly") ?: false
        window.statusBarColor = background; window.navigationBarColor = background
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        buildUi()
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_AUTOMOTIVE)) {
            uxGuard = CarUxGuard(this) { value -> runOnUiThread { restricted = value; render() } }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED)
            requestPermissions(arrayOf(Manifest.permission.POST_NOTIFICATIONS), 20)
    }
    override fun onStart() { super.onStart(); state.listeners.add(update); render() }
    override fun onStop() { state.listeners.remove(update); super.onStop() }
    override fun onDestroy() { playerDialog?.dismiss(); uxGuard?.close(); map.close(); super.onDestroy() }
    override fun onSaveInstanceState(outState: Bundle) { outState.putBoolean("favoritesOnly", favoritesOnly); super.onSaveInstanceState(outState) }
    private fun dp(value: Int) = (value * resources.displayMetrics.density).toInt()
    private fun shape(color: Int, radius: Float = 18f) = GradientDrawable().apply {
        setColor(color); cornerRadius = dp(radius.toInt()).toFloat()
    }
    private fun column() = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
    private fun row() = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL; gravity = Gravity.CENTER_VERTICAL }
    private fun text(value: String, size: Float, color: Int = Color.rgb(28, 48, 44)) = TextView(this).apply {
        text = value; textSize = size; setTextColor(color); setPadding(0, dp(3), 0, dp(3))
    }
    private fun button(label: String, action: () -> Unit) = Button(this).apply {
        text = label; isAllCaps = false; textSize = 13f; minHeight = dp(48)
        stateListAnimator = null; elevation = 0f
        setTextColor(mint); background = android.graphics.drawable.RippleDrawable(android.content.res.ColorStateList.valueOf(0x22000000), shape(panel, 16f), null); setPadding(dp(12), 0, dp(12), 0)
        setOnClickListener { action() }
    }
    private fun addButton(container: LinearLayout, label: String, weight: Float = 1f, action: () -> Unit): Button {
        val b = button(label, action)
        container.addView(b, LinearLayout.LayoutParams(0, dp(56), weight).apply { setMargins(dp(3), dp(3), dp(3), dp(3)) })
        return b
    }
    private fun command(action: String, key: String? = null, value: String? = null) {
        val intent = Intent(this, PlaybackService::class.java).setAction(action)
        if (key != null) intent.putExtra(key, value)
        startForegroundService(intent)
    }
    private fun liveLocation() {
        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
            checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            requestPermissions(arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), 10)
        else command("live")
    }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 10) {
            if (grantResults.any { it == PackageManager.PERMISSION_GRANTED }) command("live")
            else Toast.makeText(this, "위치 권한 없이도 시연 경로를 사용할 수 있어요", Toast.LENGTH_LONG).show()
        }
    }
    private fun buildUi() {
        val root = column().apply { setBackgroundColor(this@MainActivity.background) }
        setContentView(root)
        val scroll = ScrollView(this).apply { isFillViewport = true; clipToPadding = false }
        root.addView(scroll, LinearLayout.LayoutParams(-1, 0, 1f))
        val content = column().apply { setPadding(dp(24), dp(16), dp(24), dp(24)) }
        scroll.addView(content)
        val header = row()
        header.addView(text("길 위의 음악", 16f, mint).apply { typeface = Typeface.DEFAULT_BOLD }, LinearLayout.LayoutParams(0, -2, 1f))
        header.addView(text("MUSIC MAP", 10f, muted).apply { letterSpacing = .12f })
        content.addView(header)
        pageTitle = text("어디로 떠나볼까요?", 25f).apply { typeface = Typeface.DEFAULT_BOLD; setPadding(0, dp(12), 0, dp(4)) }
        content.addView(pageTitle)
        content.addView(text("지금 있는 곳에서, 새로운 음악을 만나세요.", 13f, muted))
        explore = column(); content.addView(explore)
        val mapWrap = FrameLayout(this).apply { background = shape(panel, 24f); clipToOutline = true }
        map = MusicMapView(this)
        mapWrap.addView(map, FrameLayout.LayoutParams(-1, -1))
        val badge = column().apply { background = shape(this@MainActivity.background, 14f); setPadding(dp(14), dp(8), dp(14), dp(8)); elevation = dp(2).toFloat() }
        badge.addView(text("지금 듣기 좋은 곳", 10f, mint))
        regionText = text("나의 음악 지도", 17f).apply { typeface = Typeface.DEFAULT_BOLD }; badge.addView(regionText)
        mapWrap.addView(badge, FrameLayout.LayoutParams(-2, -2, Gravity.TOP or Gravity.START).apply { setMargins(dp(12), dp(12), 0, 0) })
        val zoomControls = column(); parkedControls.add(zoomControls)
        zoomControls.addView(button("＋") { map.zoom = (map.zoom + 1).coerceAtMost(14); map.invalidate() }, LinearLayout.LayoutParams(dp(48), dp(48)))
        zoomControls.addView(button("−") { map.zoom = (map.zoom - 1).coerceAtLeast(7); map.invalidate() }, LinearLayout.LayoutParams(dp(48), dp(48)).apply { topMargin = dp(4) })
        mapWrap.addView(zoomControls, FrameLayout.LayoutParams(dp(48), -2, Gravity.TOP or Gravity.END).apply { topMargin = dp(12); rightMargin = dp(12) })
        explore.addView(mapWrap, LinearLayout.LayoutParams(-1, dp(180)).apply { topMargin = dp(14); bottomMargin = dp(8) })
        val sources = row(); parkedControls.add(sources)
        addButton(sources, "◎  현재 위치") { liveLocation() }
        addButton(sources, "경로 둘러보기") { command("demo") }.contentDescription = "시연 시작"
        explore.addView(sources)
        sourceText = text("", 11f, muted); explore.addView(sourceText)
        val listHeader = row().apply { setPadding(0, dp(18), 0, dp(6)) }
        listTitle = text("이곳의 사운드", 21f).apply { typeface = Typeface.DEFAULT_BOLD }
        listHeader.addView(listTitle, LinearLayout.LayoutParams(0, -2, 1f))
        jump = button("다음 지역 →") { command("jump") }
        listHeader.addView(jump, LinearLayout.LayoutParams(dp(108), dp(48))); parkedControls.add(jump)
        content.addView(listHeader)
        val filters = row(); parkedControls.add(filters)
        genres = listOf("전체", "차분하게", "경쾌하게").map { genre ->
            button(genre) { command("genre", "value", genre) }.also { filters.addView(it, LinearLayout.LayoutParams(-2, dp(44)).apply { rightMargin = dp(8) }) }
        }
        content.addView(filters)
        tracks = column(); content.addView(tracks, LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(12) })
        messageText = text("", 11f, muted).apply { setPadding(0, dp(14), 0, 0) }; content.addView(messageText)
        val nowPlaying = column().apply { background = shape(Color.rgb(28, 48, 44), 20f); setPadding(dp(12), dp(8), dp(6), dp(4)) }
        root.addView(nowPlaying, LinearLayout.LayoutParams(-1, -2).apply { setMargins(dp(12), dp(4), dp(12), dp(6)) })
        val controls = row()
        controls.addView(albumArt(0), LinearLayout.LayoutParams(dp(44), dp(44)).apply { rightMargin = dp(10) })
        val songInfo = column().apply { isFocusable = true; contentDescription = "재생 화면 열기"; setOnClickListener { showPlayer() } }
        currentText = text("오늘의 첫 곡을 찾아보세요", 14f, Color.WHITE).apply { maxLines = 1; ellipsize = android.text.TextUtils.TruncateAt.END }; songInfo.addView(currentText)
        detailText = text("음악을 선택하면 여기에 표시돼요", 10f, Color.rgb(181, 201, 191)).apply { maxLines = 1 }; songInfo.addView(detailText)
        controls.addView(songInfo, LinearLayout.LayoutParams(0, -2, 1f))
        playButton = button("▶") { command("play") }.apply { setTextColor(Color.WHITE); background = shape(Color.TRANSPARENT); textSize = 22f }
        controls.addView(playButton, LinearLayout.LayoutParams(dp(48), dp(48)))
        controls.addView(button("⋯") { showPlayer() }.apply { setTextColor(Color.WHITE); background = shape(Color.TRANSPARENT); textSize = 24f; contentDescription = "재생 메뉴" }, LinearLayout.LayoutParams(dp(48), dp(48)))
        nowPlaying.addView(controls)
        progress = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply { max = 1000; progressTintList = android.content.res.ColorStateList.valueOf(Color.rgb(169, 233, 199)) }
        nowPlaying.addView(progress, LinearLayout.LayoutParams(-1, dp(6)).apply { topMargin = dp(4) })
        val nav = row().apply { setPadding(dp(24), 0, dp(24), dp(4)) }
        navButtons = listOf("◎\n탐색", "♡\n보관함").mapIndexed { index, label ->
            button(label) { favoritesOnly = index == 1; renderedList = ""; render(); scroll.smoothScrollTo(0, 0) }.also {
                nav.addView(it, LinearLayout.LayoutParams(0, dp(52), 1f)); parkedControls.add(it)
            }
        }
        root.addView(nav)
        favorite = button("♡  보관함에 저장") { state.current?.let { command("favorite", "id", it.id) } }
        timeText = text("", 12f, muted)
    }
    private fun albumArt(index: Int): View = object : View(this) {
        private val paint = android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG)
        private val colors = intArrayOf(0xFFBFD6B4.toInt(), 0xFFE6C597.toInt(), 0xFFBCCDD8.toInt())
        init { background = shape(colors[index % colors.size], 12f); clipToOutline = true; importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO }
        override fun onDraw(canvas: android.graphics.Canvas) {
            paint.color = 0x3325684F; canvas.drawCircle(width * .82f, height * .18f, width * .55f, paint)
            paint.color = 0x5525684F; canvas.drawCircle(width * .1f, height * 1.1f, width * .8f, paint)
            paint.color = Color.rgb(28, 48, 44); paint.textSize = width * .48f
            canvas.drawText("♪", width * .31f, height * .67f, paint)
        }
    }
    private fun showPlayer() {
        if (playerDialog?.isShowing == true) return
        val body = column().apply { setPadding(dp(24), dp(22), dp(24), dp(16)) }
        body.addView(text("지금 재생 중", 12f, mint))
        body.addView(albumArt(state.current?.let { Catalog.tracks.indexOf(it) } ?: 0), LinearLayout.LayoutParams(-1, dp(156)).apply { topMargin = dp(16); bottomMargin = dp(16) })
        dialogTitle = text("", 23f).apply { typeface = Typeface.DEFAULT_BOLD }; body.addView(dialogTitle)
        (timeText.parent as? ViewGroup)?.removeView(timeText); body.addView(timeText)
        val controls = row()
        addButton(controls, "이전") { command("previous") }
        dialogPlay = addButton(controls, "재생") { command("play") }
        addButton(controls, "다음") { command("next") }; body.addView(controls)
        (favorite.parent as? ViewGroup)?.removeView(favorite); body.addView(favorite)
        body.addView(button("재생 종료") { command("stop") })
        playerDialog = android.app.AlertDialog.Builder(this).setView(body).setPositiveButton("닫기", null).create().apply {
            setOnDismissListener { dialogTitle = null; dialogPlay = null }
            show(); window?.setBackgroundDrawable(shape(this@MainActivity.background, 28f))
        }
        render()
    }
    private fun render() {
        pageTitle.text = if (favoritesOnly) "나의 음악 보관함" else "어디로 떠나볼까요?"
        explore.visibility = if (favoritesOnly) View.GONE else View.VISIBLE
        listTitle.text = if (favoritesOnly) "저장한 음악" else "이곳의 사운드"
        navButtons.forEachIndexed { i, b -> b.background = shape(Color.TRANSPARENT); b.setTextColor(if (favoritesOnly == (i == 1)) mint else muted); b.typeface = if (favoritesOnly == (i == 1)) Typeface.DEFAULT_BOLD else Typeface.DEFAULT }
        regionText.text = state.region?.name ?: "나의 음악 지도"
        sourceText.text = "●  ${state.source}"
        map.point = state.point; map.regionId = state.region?.id; map.invalidate()
        jump.visibility = if (state.demo && !favoritesOnly && !restricted) View.VISIBLE else View.GONE
        genres.forEach { it.setTextColor(if (it.text.toString() == state.genre) Color.WHITE else muted); it.background = shape(if (it.text.toString() == state.genre) mint else panel, 22f) }
        val list = if (favoritesOnly) Catalog.tracks.filter { it.id in state.favorites && (state.genre == "전체" || it.genre == state.genre) } else state.recommendations
        val listKey = list.joinToString { it.id } + state.current?.id + state.favorites.sorted().joinToString() + favoritesOnly
        if (listKey != renderedList) {
            renderedList = listKey; tracks.removeAllViews()
            if (list.isEmpty()) {
                val empty = column().apply { background = shape(panel, 20f); setPadding(dp(20), dp(20), dp(20), dp(20)) }
                empty.addView(text(if (favoritesOnly) "좋아하는 음악을 모아보세요" else "여행의 시작에 음악을 더해요", 17f).apply { typeface = Typeface.DEFAULT_BOLD })
                empty.addView(text(if (favoritesOnly) "재생 메뉴에서 ♡를 누르면 여기에 담겨요." else "현재 위치를 켜거나 경로를 둘러보세요.\n서울·수원·용인의 시연곡을 만날 수 있어요.", 13f, muted).apply { setLineSpacing(dp(4).toFloat(), 1f) })
                tracks.addView(empty)
            }
            list.forEach { track ->
                val card = row().apply {
                    background = android.graphics.drawable.RippleDrawable(android.content.res.ColorStateList.valueOf(0x22000000), shape(if (state.current?.id == track.id) panel else Color.WHITE, 18f), null)
                    setPadding(dp(12), dp(12), dp(12), dp(12)); minimumHeight = dp(84)
                    isFocusable = true; contentDescription = "${track.title}, ${track.reason}, 재생"
                    setOnClickListener { command("select", "id", track.id) }
                }
                card.addView(albumArt(Catalog.tracks.indexOf(track)), LinearLayout.LayoutParams(dp(56), dp(56)).apply { rightMargin = dp(14) })
                val info = column()
                info.addView(text(track.title + if (track.id in state.favorites) "  ♥" else "", 16f).apply { typeface = Typeface.DEFAULT_BOLD })
                info.addView(text("${Catalog.regions.first { it.id == track.regionId }.name} · ${track.genre}", 11f, muted))
                info.addView(text(track.reason, 11f, muted).apply { maxLines = 2 })
                card.addView(info, LinearLayout.LayoutParams(0, -2, 1f))
                card.addView(text(if (state.current?.id == track.id) "♫" else "›", 22f, mint).apply { setPadding(dp(8), 0, 0, 0) })
                tracks.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(8) })
            }
        }
        messageText.text = if (restricted) "주행 중에는 목록·지도 조작을 제한합니다" else state.message
        fun enableControls(view: View) {
            view.isEnabled = !restricted
            if (view is ViewGroup) for (i in 0 until view.childCount) enableControls(view.getChildAt(i))
        }
        parkedControls.forEach { enableControls(it); it.alpha = if (restricted) .4f else 1f }
        for (i in 0 until tracks.childCount) tracks.getChildAt(i).isEnabled = !restricted
        currentText.text = state.current?.title ?: "오늘의 첫 곡을 찾아보세요"
        detailText.text = state.current?.let { "${it.artist} · ${it.genre}" } ?: "음악을 선택하면 여기에 표시돼요"
        playButton.text = if (state.playing) "Ⅱ" else "▶"
        playButton.contentDescription = if (state.playing) "일시정지" else "재생"
        dialogPlay?.text = if (state.playing) "일시정지" else "재생"
        dialogTitle?.text = state.current?.title ?: "음악을 선택해 주세요"
        favorite.text = if (state.current?.id in state.favorites) "♥  보관함에 저장됨" else "♡  보관함에 저장"
        favorite.isEnabled = state.current != null && !restricted
        progress.progress = (1000L * state.positionMs / state.durationMs.coerceAtLeast(1)).toInt()
        fun clock(ms: Int) = "%d:%02d".format(ms / 60000, ms / 1000 % 60)
        timeText.text = "${clock(state.positionMs)} / ${clock(state.durationMs)}"
    }
}
