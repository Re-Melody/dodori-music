package com.musicmap.car

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*

/**
 * One idea per screen: the place you are driving through, and the music that belongs to it.
 * - wide (Pleos vehicle display): the map fills the screen; a place panel and a now-playing bar float on it.
 *   While the vehicle requires distraction optimization the panels give way to a large drive view.
 * - compact (portrait phone): place header, map card, list, mini player, tabs.
 */
class MainActivity : Activity() {
    private val state get() = (application as MusicMapApplication).state
    private var wide = false
    private lateinit var kit: UiKit
    private lateinit var map: MusicMapView
    private lateinit var eyebrow: TextView
    private lateinit var placeTitle: TextView
    private lateinit var contextText: TextView
    private lateinit var sourceText: TextView
    private lateinit var messageText: TextView
    private lateinit var currentText: TextView
    private lateinit var detailText: TextView
    private lateinit var timeText: TextView
    private lateinit var tracks: LinearLayout
    private lateinit var progress: ProgressBar
    private lateinit var routeButton: Button
    private lateinit var jump: Button
    private lateinit var favorite: Button
    private lateinit var voice: ImageButton
    private lateinit var genres: List<Button>
    private lateinit var tabs: List<Button>
    private lateinit var listScroll: ScrollView
    private lateinit var nowArt: FrameLayout
    private lateinit var sources: LinearLayout
    private lateinit var filterBar: View
    private val playButtons = mutableListOf<ImageButton>()
    private var panel: View? = null
    private var bar: View? = null
    private var zoom: View? = null
    private var drive: View? = null
    private var drivePlace: TextView? = null
    private var driveTitle: TextView? = null
    private var driveDetail: TextView? = null
    private var explore: View? = null
    private var caption: TextView? = null
    private var nowArtFor: String? = "unset"
    private var playerDialog: android.app.AlertDialog? = null
    private var dialogTitle: TextView? = null
    private var renderedList = ""
    private var favoritesOnly = false
    private var uxGuard: CarUxGuard? = null
    private var restricted = false
    private var driveShown: Boolean? = null
    private val parkedControls = mutableListOf<View>()
    private val update: () -> Unit = { render() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        favoritesOnly = savedInstanceState?.getBoolean("favoritesOnly") ?: false
        val config = resources.configuration
        wide = config.screenWidthDp >= 840 && config.screenWidthDp > config.screenHeightDp
        // Car displays are read at arm's length: the whole scale grows with the short side.
        kit = UiKit(this, (minOf(config.screenWidthDp, config.screenHeightDp) / 600f).coerceIn(1f, 1.5f))
        window.statusBarColor = Ui.BASE; window.navigationBarColor = Ui.BASE
        window.decorView.systemUiVisibility = 0
        buildUi()
        if (BuildConfig.DEBUG && intent.getBooleanExtra("drive", false)) {
            restricted = true // Debug builds only: preview the drive view without a moving vehicle.
        } else if (packageManager.hasSystemFeature(PackageManager.FEATURE_AUTOMOTIVE)) {
            uxGuard = CarUxGuard(this) { value -> runOnUiThread { restricted = value; render() } }
        }
        val wanted = buildList {
            if (android.os.Build.VERSION.SDK_INT >= 33) add(Manifest.permission.POST_NOTIFICATIONS)
            addAll(drivePermissions())
        }.filter { checkSelfPermission(it) != PackageManager.PERMISSION_GRANTED }
        if (wanted.isNotEmpty()) requestPermissions(wanted.toTypedArray(), 20)
    }
    override fun onStart() { super.onStart(); state.listeners.add(update); render() }
    override fun onStop() { state.listeners.remove(update); super.onStop() }
    override fun onDestroy() { playerDialog?.dismiss(); uxGuard?.close(); map.close(); super.onDestroy() }
    override fun onSaveInstanceState(outState: Bundle) { outState.putBoolean("favoritesOnly", favoritesOnly); super.onSaveInstanceState(outState) }

    // ---- Commands ---------------------------------------------------------------------------
    private fun command(action: String, key: String? = null, value: String? = null) {
        val intent = Intent(this, PlaybackService::class.java).setAction(action)
        if (key != null) intent.putExtra(key, value)
        startForegroundService(intent)
    }
    private fun liveLocation() {
        if (!hasPositionPermission(this)) requestPermissions(positionPermissions(), 10)
        else command("live")
    }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 10) {
            if (hasPositionPermission(this)) command("live")
            else Toast.makeText(this, "위치 권한 없이도 경로 둘러보기는 쓸 수 있어요", Toast.LENGTH_LONG).show()
        }
    }

    // ---- Shared building blocks -------------------------------------------------------------
    private fun buildUi() {
        eyebrow = kit.text("지금 지나는 곳", T.CAPTION, Ui.TEXT_MUTED)
        placeTitle = kit.text("", if (wide) T.DISPLAY else T.TITLE).apply { maxLines = 2 }
        contextText = kit.oneLine(kit.text("", T.CAPTION, Ui.TEXT_SOFT))
        sourceText = kit.oneLine(kit.text("", T.SMALL, Ui.TEXT_MUTED))
        messageText = kit.text("", T.SMALL, Ui.TEXT_MUTED)
        tracks = kit.column()
        currentText = kit.oneLine(kit.text("", T.BODY_STRONG))
        detailText = kit.oneLine(kit.text("", T.CAPTION, Ui.TEXT_MUTED))
        timeText = kit.text("", T.SMALL, Ui.TEXT_MUTED).apply { fontFeatureSettings = "tnum" }
        progress = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
            max = 1000
            progressTintList = ColorStateList.valueOf(Ui.TEXT)
            progressBackgroundTintList = ColorStateList.valueOf(Ui.TRACK)
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }
        favorite = kit.button("저장", Tone.OUTLINE, Icon.HEART) { state.current?.let { command("favorite", "id", it.id) } }
        voice = kit.circle(Icon.VOICE, 40f, Color.TRANSPARENT, Ui.TEXT_SOFT, "음성 안내", .5f) { command("voice") }
        nowArt = FrameLayout(this)
        routeButton = kit.button("경로 둘러보기", Tone.QUIET, Icon.ROUTE) { command("demo") }.apply { contentDescription = "시연 시작" }
        jump = kit.button("다음 지역", Tone.QUIET, Icon.ARROW, iconEnd = true) { command("jump") }
        if (wide) buildWide() else buildCompact()
    }
    private fun buildTabs(): LinearLayout {
        val row = kit.row()
        tabs = listOf("탐색", "보관함", "Apple Music").mapIndexed { index, label ->
            kit.tab(label) {
                if (index == 2) startActivity(Intent(this, AppleMusicActivity::class.java))
                else { favoritesOnly = index == 1; renderedList = ""; render(); listScroll.smoothScrollTo(0, 0) }
            }.also { parkedControls.add(it) }
        }
        return row
    }
    private fun buildSources(): LinearLayout {
        sources = kit.row(); parkedControls.add(sources)
        sources.addView(kit.button("현재 위치", Tone.QUIET, Icon.LOCATE) { liveLocation() }, kit.lp(0, kit.u(48f), 1f))
        sources.addView(routeButton, kit.lp(0, kit.u(48f), 1f) { leftMargin = kit.u(8f) })
        sources.addView(jump, kit.lp(0, kit.u(48f), 1f) { leftMargin = kit.u(8f) })
        return sources
    }
    private fun buildFilters(): View {
        val filters = kit.row(); parkedControls.add(filters)
        genres = listOf("전체", Catalog.CALM, Catalog.LIVELY).map { genre ->
            kit.button(genre, Tone.QUIET) { command("genre", "value", genre) }
                .also { filters.addView(it, kit.lp(-2, kit.u(40f)) { rightMargin = kit.u(8f) }) }
        }
        filterBar = HorizontalScrollView(this).apply { isHorizontalScrollBarEnabled = false; addView(filters) }
        return filterBar
    }
    private fun playButton(size: Float) = kit.circle(Icon.PLAY, size, Ui.ACCENT, Ui.ON_ACCENT, "재생") { command("play") }.also { playButtons.add(it) }
    private fun skipButton(icon: Icon, size: Float, label: String, action: String) =
        kit.circle(icon, size, Color.TRANSPARENT, Ui.TEXT_SOFT, label) { command(action) }
    private fun <V : View> floating(view: V, radius: Float = 16f): V = view.apply { background = kit.shape(0xF216191B.toInt(), radius, Ui.HAIRLINE) }

    // ---- Wide: vehicle display --------------------------------------------------------------
    private fun buildWide() {
        val root = FrameLayout(this).apply { setBackgroundColor(Ui.BASE) }
        setContentView(root)
        val m = kit.u(16f)
        val screenW = kit.dp(resources.configuration.screenWidthDp.toFloat())
        val panelW = minOf(kit.u(460f), (screenW * .36f).toInt())
        map = MusicMapView(this).apply { scale = kit.s; insetLeft = panelW + m }
        root.addView(map, FrameLayout.LayoutParams(-1, -1))

        val place = floating(kit.column()).apply { setPadding(kit.u(24f), kit.u(16f), kit.u(24f), kit.u(16f)); clipToPadding = false }
        val top = buildTabs()
        tabs.forEachIndexed { i, tab -> top.addView(tab, kit.lp(-2, kit.u(40f)) { if (i > 0) leftMargin = kit.u(4f) }) }
        top.addView(View(this), kit.lp(0, 1, 1f))
        top.addView(voice, kit.lp(kit.u(40f), kit.u(40f)))
        place.addView(top, kit.lp(-1, -2) { leftMargin = -kit.u(12f); rightMargin = -kit.u(8f) })
        place.addView(eyebrow, kit.lp(-1, -2) { topMargin = kit.u(24f) })
        place.addView(placeTitle, kit.lp(-1, -2) { topMargin = kit.u(8f) })
        place.addView(contextText, kit.lp(-1, -2) { topMargin = kit.u(8f) })
        place.addView(kit.laneRule(), kit.lp(kit.u(72f), kit.u(4f)) { topMargin = kit.u(20f) })
        place.addView(buildFilters(), kit.lp(-1, -2) { topMargin = kit.u(20f) })
        listScroll = ScrollView(this).apply { isVerticalScrollBarEnabled = false }
        val listBody = kit.column(); listScroll.addView(listBody)
        listBody.addView(tracks); listBody.addView(messageText, kit.lp(-1, -2) { topMargin = kit.u(12f); leftMargin = kit.u(8f) })
        place.addView(listScroll, kit.lp(-1, 0, 1f) { topMargin = kit.u(12f); leftMargin = -kit.u(8f); rightMargin = -kit.u(8f) })
        place.addView(sourceText, kit.lp(-1, -2) { topMargin = kit.u(8f) })
        place.addView(buildSources(), kit.lp(-1, -2) { topMargin = kit.u(8f) })
        root.addView(place, FrameLayout.LayoutParams(panelW, -1).apply { setMargins(m, m, 0, m) })
        panel = place

        val player = floating(kit.column()).apply { setPadding(kit.u(16f), kit.u(16f), kit.u(16f), kit.u(12f)) }
        val line = kit.row()
        line.addView(nowArt, kit.lp(kit.u(56f), kit.u(56f)) { rightMargin = kit.u(16f) })
        val info = kit.column().apply { addView(currentText); addView(detailText, kit.lp(-1, -2) { topMargin = kit.u(4f) }) }
        line.addView(info, kit.lp(0, -2, 1f))
        line.addView(skipButton(Icon.PREV, 48f, "이전 곡", "previous"), kit.lp(kit.u(48f), kit.u(48f)) { leftMargin = kit.u(16f) })
        line.addView(playButton(64f), kit.lp(kit.u(64f), kit.u(64f)) { leftMargin = kit.u(16f); rightMargin = kit.u(16f) })
        line.addView(skipButton(Icon.NEXT, 48f, "다음 곡", "next"), kit.lp(kit.u(48f), kit.u(48f)))
        val side = kit.row().apply { gravity = Gravity.CENTER_VERTICAL or Gravity.END }
        side.addView(favorite, kit.lp(-2, kit.u(48f)))
        line.addView(side, kit.lp(0, -2, 1f))
        player.addView(line)
        val seek = kit.row()
        seek.addView(progress, kit.lp(0, kit.u(4f), 1f))
        seek.addView(timeText, kit.lp(-2, -2) { leftMargin = kit.u(12f) })
        player.addView(seek, kit.lp(-1, -2) { topMargin = kit.u(12f) })
        root.addView(player, FrameLayout.LayoutParams(-1, -2, Gravity.BOTTOM).apply { setMargins(panelW + m * 2, 0, m, m) })
        bar = player

        val zoomColumn = kit.column(); parkedControls.add(zoomColumn)
        zoomColumn.addView(kit.circle(Icon.PLUS, 48f, Ui.SURFACE, Ui.TEXT_SOFT, "지도 확대") { map.zoom = (map.zoom + 1).coerceAtMost(14); map.invalidate() }
            .apply { background = kit.surface(Ui.SURFACE, 0f, Ui.HAIRLINE, oval = true) }, kit.lp(kit.u(48f), kit.u(48f)))
        zoomColumn.addView(kit.circle(Icon.MINUS, 48f, Ui.SURFACE, Ui.TEXT_SOFT, "지도 축소") { map.zoom = (map.zoom - 1).coerceAtLeast(7); map.invalidate() }
            .apply { background = kit.surface(Ui.SURFACE, 0f, Ui.HAIRLINE, oval = true) }, kit.lp(kit.u(48f), kit.u(48f)) { topMargin = kit.u(8f) })
        root.addView(zoomColumn, FrameLayout.LayoutParams(-2, -2, Gravity.TOP or Gravity.END).apply { setMargins(0, m, m, 0) })
        zoom = zoomColumn

        caption = floating(kit.text("", T.BODY, Ui.TEXT), 12f).apply {
            setPadding(kit.u(20f), kit.u(14f), kit.u(20f), kit.u(14f)); visibility = View.GONE
            accessibilityLiveRegion = View.ACCESSIBILITY_LIVE_REGION_POLITE
        }
        root.addView(caption, FrameLayout.LayoutParams(-2, -2, Gravity.TOP or Gravity.START).apply { setMargins(panelW + m * 2, m, kit.u(80f), 0) })
        root.addView(buildDrive(), FrameLayout.LayoutParams(-1, -2, Gravity.BOTTOM).apply { setMargins(m, 0, m, m) })
        player.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ -> syncMapInsets() }
        drive?.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ -> syncMapInsets() }
    }
    /** Shown instead of the panels while the vehicle is moving: large type, three controls, nothing to browse. */
    private fun buildDrive(): View {
        val view = floating(kit.row(), 20f).apply { setPadding(kit.u(32f), kit.u(28f), kit.u(32f), kit.u(28f)); visibility = View.GONE }
        val words = kit.column()
        words.addView(kit.text("지금 지나는 곳", T.BODY, Ui.TEXT_MUTED))
        drivePlace = kit.oneLine(kit.text("", T.HERO)).also { words.addView(it, kit.lp(-1, -2) { topMargin = kit.u(8f) }) }
        words.addView(kit.laneRule(), kit.lp(kit.u(96f), kit.u(4f)) { topMargin = kit.u(20f) })
        driveTitle = kit.oneLine(kit.text("", T.TITLE)).also { words.addView(it, kit.lp(-1, -2) { topMargin = kit.u(20f) }) }
        driveDetail = kit.oneLine(kit.text("", T.BODY, Ui.TEXT_SOFT)).also { words.addView(it, kit.lp(-1, -2) { topMargin = kit.u(8f) }) }
        view.addView(words, kit.lp(0, -2, 1f))
        view.addView(skipButton(Icon.PREV, 80f, "이전 곡", "previous").apply { background = kit.surface(Ui.RAISED, 0f, oval = true) }, kit.lp(kit.u(80f), kit.u(80f)) { leftMargin = kit.u(24f) })
        view.addView(playButton(112f), kit.lp(kit.u(112f), kit.u(112f)) { leftMargin = kit.u(24f); rightMargin = kit.u(24f) })
        view.addView(skipButton(Icon.NEXT, 80f, "다음 곡", "next").apply { background = kit.surface(Ui.RAISED, 0f, oval = true) }, kit.lp(kit.u(80f), kit.u(80f)))
        drive = view
        return view
    }
    private fun syncMapInsets() {
        val m = kit.u(16f)
        val driving = drive?.visibility == View.VISIBLE
        val left = if (driving) 0 else (panel?.width ?: 0) + m
        val bottom = (if (driving) drive?.height ?: 0 else bar?.height ?: 0) + m
        if (map.insetLeft != left || map.insetBottom != bottom) { map.insetLeft = left; map.insetBottom = bottom; map.invalidate() }
    }

    // ---- Compact: portrait ------------------------------------------------------------------
    private fun buildCompact() {
        val root = kit.column().apply { setBackgroundColor(Ui.BASE) }
        setContentView(root)
        listScroll = ScrollView(this).apply { isFillViewport = true; isVerticalScrollBarEnabled = false }
        root.addView(listScroll, kit.lp(-1, 0, 1f))
        val content = kit.column().apply { setPadding(kit.u(16f), kit.u(20f), kit.u(16f), kit.u(16f)); clipToPadding = false }
        listScroll.addView(content)
        val head = kit.row()
        head.addView(eyebrow, kit.lp(0, -2, 1f))
        head.addView(voice, kit.lp(kit.u(40f), kit.u(40f)))
        content.addView(head)
        content.addView(placeTitle, kit.lp(-1, -2) { topMargin = kit.u(4f) })
        content.addView(contextText, kit.lp(-1, -2) { topMargin = kit.u(8f) })
        content.addView(kit.laneRule(), kit.lp(kit.u(56f), kit.u(4f)) { topMargin = kit.u(16f) })
        val exploring = kit.column()
        val card = FrameLayout(this).apply { background = kit.shape(Ui.RAISED, 12f); clipToOutline = true }
        map = MusicMapView(this).apply { scale = kit.s; zoom = 9 }
        card.addView(map, FrameLayout.LayoutParams(-1, -1))
        exploring.addView(card, kit.lp(-1, kit.u(220f)) { topMargin = kit.u(16f) })
        exploring.addView(buildSources(), kit.lp(-1, -2) { topMargin = kit.u(12f) })
        exploring.addView(sourceText, kit.lp(-1, -2) { topMargin = kit.u(8f) })
        content.addView(exploring); explore = exploring
        content.addView(buildFilters(), kit.lp(-1, -2) { topMargin = kit.u(20f) })
        content.addView(tracks, kit.lp(-1, -2) { topMargin = kit.u(12f); leftMargin = -kit.u(8f); rightMargin = -kit.u(8f) })
        content.addView(messageText, kit.lp(-1, -2) { topMargin = kit.u(12f) })

        val mini = floating(kit.column(), 12f).apply { setPadding(kit.u(8f), kit.u(8f), kit.u(8f), kit.u(8f)) }
        val controls = kit.row()
        controls.addView(nowArt, kit.lp(kit.u(44f), kit.u(44f)) { rightMargin = kit.u(12f) })
        val info = kit.column().apply {
            addView(currentText); addView(detailText, kit.lp(-1, -2) { topMargin = kit.u(4f) })
            isFocusable = true; contentDescription = "재생 화면 열기"; setOnClickListener { showPlayer() }
        }
        controls.addView(info, kit.lp(0, -2, 1f))
        controls.addView(playButton(48f), kit.lp(kit.u(48f), kit.u(48f)) { leftMargin = kit.u(8f) })
        mini.addView(controls)
        mini.addView(progress, kit.lp(-1, kit.u(2f)) { topMargin = kit.u(8f) })
        root.addView(mini, kit.lp(-1, -2) { setMargins(kit.u(8f), kit.u(4f), kit.u(8f), kit.u(4f)) })

        val nav = buildTabs().apply { setPadding(kit.u(8f), 0, kit.u(8f), kit.u(4f)) }
        tabs.forEach { nav.addView(it, kit.lp(0, kit.u(52f), 1f)) }
        root.addView(nav)
    }
    private fun showPlayer() {
        if (wide || playerDialog?.isShowing == true) return
        val body = kit.column().apply { setPadding(kit.u(24f), kit.u(24f), kit.u(24f), kit.u(20f)) }
        body.addView(kit.text("지금 재생 중", T.CAPTION, Ui.TEXT_MUTED))
        body.addView(kit.art(state.current, 12f), kit.lp(-1, kit.u(200f)) { topMargin = kit.u(16f); bottomMargin = kit.u(16f) })
        dialogTitle = kit.text("", T.TITLE); body.addView(dialogTitle)
        (timeText.parent as? ViewGroup)?.removeView(timeText); body.addView(timeText, kit.lp(-2, -2) { topMargin = kit.u(8f) })
        val controls = kit.row().apply { gravity = Gravity.CENTER }
        controls.addView(skipButton(Icon.PREV, 56f, "이전 곡", "previous"), kit.lp(kit.u(56f), kit.u(56f)))
        val dialogPlay = playButton(72f)
        controls.addView(dialogPlay, kit.lp(kit.u(72f), kit.u(72f)) { leftMargin = kit.u(24f); rightMargin = kit.u(24f) })
        controls.addView(skipButton(Icon.NEXT, 56f, "다음 곡", "next"), kit.lp(kit.u(56f), kit.u(56f)))
        body.addView(controls, kit.lp(-1, -2) { topMargin = kit.u(16f); bottomMargin = kit.u(16f) })
        (favorite.parent as? ViewGroup)?.removeView(favorite); body.addView(favorite, kit.lp(-1, kit.u(48f)))
        body.addView(kit.button("닫기", Tone.QUIET) { playerDialog?.dismiss() }, kit.lp(-1, kit.u(48f)) { topMargin = kit.u(8f) })
        playerDialog = android.app.AlertDialog.Builder(this).setView(body).create().apply {
            setOnDismissListener { dialogTitle = null; playButtons.remove(dialogPlay) }
            show(); window?.setBackgroundDrawable(kit.shape(Ui.SURFACE, 16f, Ui.HAIRLINE))
        }
        render()
    }

    // ---- Render -----------------------------------------------------------------------------
    private fun trackRow(track: Track): View {
        val current = state.current?.id == track.id
        val saved = track.id in state.favorites
        val row = kit.row().apply {
            background = kit.surface(if (current) Ui.CARD else Color.TRANSPARENT, 10f, if (current) Ui.HAIRLINE else null)
            setPadding(kit.u(8f), kit.u(8f), kit.u(12f), kit.u(8f)); minimumHeight = kit.u(72f)
            isFocusable = true; contentDescription = "${track.title}, ${track.reason}, 재생"
            setOnClickListener { command("select", "id", track.id) }
        }
        row.addView(kit.art(track), kit.lp(kit.u(56f), kit.u(56f)) { rightMargin = kit.u(16f) })
        val info = kit.column()
        info.addView(kit.oneLine(kit.text(track.title, T.BODY_STRONG, if (current) Ui.ACCENT else Ui.TEXT)))
        val place = Catalog.regions.firstOrNull { it.id == track.regionId }?.name
        val detail = if (favoritesOnly && place != null) "$place · ${track.reason}" else track.reason
        info.addView(kit.oneLine(kit.text(detail, T.CAPTION, Ui.TEXT_MUTED)), kit.lp(-1, -2) { topMargin = kit.u(4f) })
        row.addView(info, kit.lp(0, -2, 1f))
        if (saved) row.addView(ImageView(this).apply { setImageDrawable(IconDrawable(Icon.HEART_FILLED, Ui.TEXT_MUTED)); contentDescription = "보관함에 저장됨" }, kit.lp(kit.u(18f), kit.u(18f)) { leftMargin = kit.u(12f) })
        if (current) row.addView(ImageView(this).apply { setImageDrawable(IconDrawable(if (state.playing) Icon.EQ else Icon.PAUSE, Ui.ACCENT)); importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO }, kit.lp(kit.u(18f), kit.u(18f)) { leftMargin = kit.u(12f) })
        return row
    }
    private fun emptyState(): View = kit.column().apply {
        setPadding(kit.u(8f), kit.u(16f), kit.u(8f), kit.u(8f))
        addView(kit.text(if (favoritesOnly) "아직 저장한 곡이 없어요" else "이 길에는 아직 음악이 없어요", T.BODY_STRONG, Ui.TEXT_SOFT))
        addView(kit.text(if (favoritesOnly) "재생 중인 곡에서 저장을 누르면 여기에 모여요" else "서울 한강, 수원 화성, 용인 호수를 지나면\n그곳의 곡이 채워져요", T.CAPTION, Ui.TEXT_MUTED).apply { setLineSpacing(kit.u(4f).toFloat(), 1f) },
            kit.lp(-1, -2) { topMargin = kit.u(8f) })
    }
    private fun render() {
        val region = state.region
        val current = state.current
        val driving = wide && restricted
        if (driveShown != driving) {
            driveShown = driving
            listOfNotNull(panel, bar, zoom).forEach { it.visibility = if (driving) View.GONE else View.VISIBLE }
            drive?.visibility = if (driving) View.VISIBLE else View.GONE
            if (wide) syncMapInsets()
        }
        eyebrow.text = if (favoritesOnly) "보관함" else "지금 지나는 곳"
        placeTitle.text = if (favoritesOnly) "저장한 음악" else region?.name ?: "어디로 갈까요"
        explore?.visibility = if (favoritesOnly) View.GONE else View.VISIBLE
        if (wide) { sources.visibility = if (favoritesOnly) View.GONE else View.VISIBLE }
        tabs.forEachIndexed { i, tab ->
            val active = i < 2 && favoritesOnly == (i == 1)
            tab.setTextColor(if (active) Ui.TEXT else Ui.TEXT_MUTED); tab.typeface = kit.weight(if (active) 600 else 400)
        }
        routeButton.visibility = if (state.demo) View.GONE else View.VISIBLE
        jump.visibility = if (state.demo) View.VISIBLE else View.GONE
        (voice.drawable as? IconDrawable)?.icon = if (state.voiceOn) Icon.VOICE else Icon.VOICE_OFF
        voice.contentDescription = if (state.voiceOn) "음성 안내 켜짐" else "음성 안내 꺼짐"
        map.point = state.point; map.regionId = region?.id; map.invalidate()
        genres.forEach { kit.tone(it, if (it.text.toString() == state.genre) Tone.SELECTED else Tone.QUIET) }

        val list = if (favoritesOnly) Catalog.tracks.filter { it.id in state.favorites && (state.genre == "전체" || it.genre == state.genre) } else state.recommendations
        contextText.text = when {
            favoritesOnly -> if (list.isEmpty()) "" else "${list.size}곡"
            state.drive.line.isNotBlank() -> state.drive.line
            region != null -> "이곳에 어울리는 곡 ${list.size}곡"
            else -> "현재 위치를 켜거나 경로를 둘러보세요"
        }
        val waiting = state.point == null && !state.demo
        sourceText.text = if (favoritesOnly || (waiting && state.source == "위치 수신 대기")) "" else state.source
        sourceText.visibility = if (sourceText.text.isEmpty()) View.GONE else View.VISIBLE

        filterBar.visibility = if (favoritesOnly || region != null) View.VISIBLE else View.GONE
        val listKey = list.joinToString { it.id } + current?.id + state.playing + state.favorites.sorted().joinToString() + favoritesOnly + (state.point != null)
        if (listKey != renderedList) {
            renderedList = listKey; tracks.removeAllViews()
            if (list.isEmpty() && (favoritesOnly || state.point != null)) tracks.addView(emptyState())
            list.forEach { tracks.addView(trackRow(it), kit.lp(-1, -2) { bottomMargin = kit.u(4f) }) }
        }
        caption?.let {
            it.text = state.caption; it.visibility = if (state.caption.isEmpty()) View.GONE else View.VISIBLE
            (it.layoutParams as FrameLayout.LayoutParams).let { lp ->
                val start = if (driving) kit.u(16f) else (panel?.layoutParams?.width ?: 0) + kit.u(32f)
                if (lp.leftMargin != start) { lp.leftMargin = start; it.requestLayout() }
            }
        }
        messageText.text = if (restricted && !wide) "주행 중에는 목록과 지도 조작을 쉬어요" else if (!wide && state.caption.isNotEmpty()) state.caption else state.message
        messageText.visibility = if (messageText.text.isEmpty()) View.GONE else View.VISIBLE
        fun enableControls(view: View) {
            view.isEnabled = !restricted
            if (view is ViewGroup) for (i in 0 until view.childCount) enableControls(view.getChildAt(i))
        }
        parkedControls.forEach { enableControls(it); it.alpha = if (restricted) .4f else 1f }
        for (i in 0 until tracks.childCount) tracks.getChildAt(i).isEnabled = !restricted

        if (nowArtFor != current?.id) {
            nowArtFor = current?.id; nowArt.removeAllViews()
            nowArt.addView(kit.art(current), FrameLayout.LayoutParams(-1, -1))
        }
        currentText.text = current?.title ?: "재생 중인 곡이 없어요"
        val artistLine = current?.let { if (state.buffering) "재생 준비 중 · ${it.artist}" else "${it.artist} · ${it.genre}" }
        detailText.text = artistLine ?: "곡을 고르면 여기에서 이어집니다"
        drivePlace?.text = region?.name ?: "길 위의 음악"
        driveTitle?.text = current?.title ?: "재생 버튼을 누르면 이 길의 곡이 시작돼요"
        driveDetail?.text = listOfNotNull(artistLine, state.drive.line.takeIf { it.isNotBlank() }).joinToString("  ·  ")
        driveDetail?.visibility = if (driveDetail?.text.isNullOrEmpty()) View.GONE else View.VISIBLE
        playButtons.forEach {
            (it.drawable as? IconDrawable)?.icon = if (state.playing || state.buffering) Icon.PAUSE else Icon.PLAY
            it.contentDescription = if (state.playing || state.buffering) "일시정지" else "재생"
        }
        dialogTitle?.text = current?.title ?: "곡을 골라 주세요"
        val saved = current?.id in state.favorites
        val favoriteLabel = if (saved) "저장됨" else "저장"
        if (favorite.contentDescription != favoriteLabel) {
            kit.icon(favorite)?.icon = if (saved) Icon.HEART_FILLED else Icon.HEART
            kit.label(favorite, favoriteLabel)
        }
        favorite.contentDescription = favoriteLabel
        favorite.isEnabled = current != null && current.appleMusicId == null && !current.id.startsWith("apple:") && !restricted
        favorite.alpha = if (favorite.isEnabled) 1f else .4f
        progress.progress = (1000L * state.positionMs / state.durationMs.coerceAtLeast(1)).toInt()
        fun clock(ms: Int) = "%d:%02d".format(ms / 60000, ms / 1000 % 60)
        timeText.text = if (current == null) "" else "${clock(state.positionMs)} / ${clock(state.durationMs)}"
    }
}
