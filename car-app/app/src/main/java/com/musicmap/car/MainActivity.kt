package com.musicmap.car

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlin.math.roundToInt

/**
 * Two layouts from one set of views:
 * - wide (Pleos vehicle display, landscape): side rail + map panel + list panel + full-width now-playing bar
 * - compact (portrait phone): stacked scroll + mini player + bottom navigation
 */
class MainActivity : Activity() {
    private val state get() = (application as MusicMapApplication).state
    private var wide = false
    /** Car-display scale: the design's type/spacing ratios are kept, the whole scale grows with the screen. */
    private var s = 1f
    private lateinit var map: MusicMapView
    private lateinit var regionText: TextView
    private lateinit var sourceText: TextView
    private lateinit var messageText: TextView
    private lateinit var currentText: TextView
    private lateinit var detailText: TextView
    private lateinit var timeText: TextView
    private lateinit var playButton: ImageButton
    private lateinit var favorite: Button
    private lateinit var tracks: LinearLayout
    private lateinit var progress: ProgressBar
    private lateinit var jump: Button
    private lateinit var genres: List<Button>
    private lateinit var explore: LinearLayout
    private lateinit var pageTitle: TextView
    private lateinit var pageSubtitle: TextView
    private lateinit var listTitle: TextView
    private lateinit var listScroll: ScrollView
    private lateinit var nowArt: FrameLayout
    private lateinit var navButtons: List<Button>
    private var nowArtFor: String? = "unset"
    private var playerDialog: android.app.AlertDialog? = null
    private var dialogTitle: TextView? = null
    private var dialogPlay: ImageButton? = null
    private var renderedList = ""
    private var favoritesOnly = false
    private var uxGuard: CarUxGuard? = null
    private var restricted = false
    private val parkedControls = mutableListOf<View>()
    private val update: () -> Unit = { render() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        favoritesOnly = savedInstanceState?.getBoolean("favoritesOnly") ?: false
        val config = resources.configuration
        wide = config.screenWidthDp >= 840 && config.screenWidthDp > config.screenHeightDp
        s = (minOf(config.screenWidthDp, config.screenHeightDp) / 600f).coerceIn(1f, 1.5f)
        window.statusBarColor = Ui.BASE; window.navigationBarColor = Ui.BASE
        window.decorView.systemUiVisibility = 0
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

    // ---- Design primitives ------------------------------------------------------------------
    private fun dp(value: Float) = (value * resources.displayMetrics.density).roundToInt()
    /** Spacing on the 8-unit grid, scaled for the display. */
    private fun u(value: Float) = dp(value * s)
    private fun shape(color: Int, radius: Float, stroke: Int? = null, oval: Boolean = false) = GradientDrawable().apply {
        setColor(color)
        if (oval) this.shape = GradientDrawable.OVAL else cornerRadius = u(radius).toFloat()
        if (stroke != null) setStroke(dp(1f), stroke)
    }
    private fun surface(color: Int, radius: Float, stroke: Int? = null, oval: Boolean = false): Drawable =
        RippleDrawable(ColorStateList.valueOf(Ui.RIPPLE), shape(color, radius, stroke, oval), shape(Color.WHITE, radius, oval = oval))
    private fun weight(w: Int): Typeface = Typeface.create(Typeface.DEFAULT, w, false)
    private fun column() = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
    private fun row() = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL; gravity = Gravity.CENTER_VERTICAL }
    private fun lp(w: Int, h: Int, weight: Float = 0f, block: LinearLayout.LayoutParams.() -> Unit = {}) =
        LinearLayout.LayoutParams(w, h, weight).apply(block)

    /** Type roles from the design hierarchy (size in sp before display scale, weight). */
    private enum class T(val size: Float, val weight: Int) {
        TITLE(24f, 700), HEADING(18f, 600), BODY_BOLD(16f, 700), BODY(16f, 400),
        CAPTION_BOLD(14f, 700), CAPTION(14f, 400), SMALL_BOLD(12f, 700), SMALL(12f, 400)
    }
    private fun text(value: String, role: T, color: Int = Ui.TEXT) = TextView(this).apply {
        text = value; textSize = role.size * s; typeface = weight(role.weight); setTextColor(color)
    }
    private enum class Pill { DARK, OUTLINED, ACCENT }
    private fun pill(label: String, style: Pill, icon: Icon? = null, iconEnd: Boolean = false, action: () -> Unit) = Button(this).apply {
        text = label; isAllCaps = true; letterSpacing = 0.1f; textSize = 14f * s; typeface = weight(700)
        minHeight = 0; minimumHeight = 0; minWidth = 0; minimumWidth = 0
        stateListAnimator = null; elevation = 0f; gravity = Gravity.CENTER
        setPadding(u(20f), 0, u(20f), 0)
        if (icon != null) {
            val d = IconDrawable(icon, Ui.TEXT).apply { setBounds(0, 0, u(18f), u(18f)) }
            if (iconEnd) setCompoundDrawables(null, null, d, null) else setCompoundDrawables(d, null, null, null)
            compoundDrawablePadding = u(8f)
        }
        stylePill(this, style)
        setOnClickListener { action() }
    }
    private fun stylePill(button: Button, style: Pill) {
        val (bg, fg) = when (style) {
            Pill.DARK -> Ui.RAISED to Ui.TEXT
            Pill.OUTLINED -> Color.TRANSPARENT to Ui.TEXT
            Pill.ACCENT -> Ui.ACCENT to Ui.ON_ACCENT
        }
        button.background = surface(bg, 9999f, if (style == Pill.OUTLINED) Ui.BORDER_LIGHT else null)
        button.setTextColor(fg)
        button.compoundDrawables.filterIsInstance<IconDrawable>().forEach { it.color = fg }
    }
    private fun circle(icon: Icon, size: Float, bg: Int, fg: Int, description: String, iconRatio: Float = .45f, action: () -> Unit) = ImageButton(this).apply {
        setImageDrawable(IconDrawable(icon, fg)); contentDescription = description
        scaleType = ImageView.ScaleType.FIT_CENTER
        background = surface(bg, 0f, oval = true)
        val pad = u(size * (1 - iconRatio) / 2); setPadding(pad, pad, pad, pad)
        setOnClickListener { action() }
    }
    private fun albumArt(index: Int, radius: Float = 4f): View = object : View(this) {
        private val note = IconDrawable(Icon.NOTE, 0xB3FFFFFF.toInt())
        init {
            val tones = Ui.artTones[((index % Ui.artTones.size) + Ui.artTones.size) % Ui.artTones.size]
            background = GradientDrawable(GradientDrawable.Orientation.TL_BR, tones).apply { cornerRadius = u(radius).toFloat() }
            clipToOutline = true; importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO
        }
        override fun onDraw(canvas: Canvas) {
            val n = (minOf(width, height) * .42f).toInt()
            note.setBounds((width - n) / 2, (height - n) / 2, (width + n) / 2, (height + n) / 2); note.draw(canvas)
        }
    }

    // ---- Commands ---------------------------------------------------------------------------
    private fun command(action: String, key: String? = null, value: String? = null) {
        val intent = Intent(this, PlaybackService::class.java).setAction(action)
        if (key != null) intent.putExtra(key, value)
        startForegroundService(intent)
    }
    private fun liveLocation() {
        if (!hasPositionPermission(this))
            requestPermissions(positionPermissions(), 10)
        else command("live")
    }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 10) {
            if (hasPositionPermission(this)) command("live")
            else Toast.makeText(this, "위치 권한 없이도 시연 경로를 사용할 수 있어요", Toast.LENGTH_LONG).show()
        }
    }

    // ---- Shared building blocks -------------------------------------------------------------
    private fun buildUi() {
        val root = column().apply { setBackgroundColor(Ui.BASE) }
        setContentView(root)
        pageTitle = text("어디로 떠나볼까요?", T.TITLE)
        pageSubtitle = text("지금 있는 곳에서, 새로운 음악을 만나세요.", T.CAPTION, Ui.TEXT_MUTED).apply { setPadding(0, u(4f), 0, 0) }
        sourceText = text("", T.SMALL, Ui.TEXT_MUTED).apply { maxLines = 2; ellipsize = TextUtils.TruncateAt.END }
        listTitle = text("이곳의 사운드", T.TITLE)
        jump = pill("다음 지역", Pill.OUTLINED, Icon.ARROW, iconEnd = true) { command("jump") }.also { parkedControls.add(it) }
        tracks = column()
        messageText = text("", T.SMALL, Ui.TEXT_MUTED).apply { setPadding(u(4f), u(12f), 0, u(8f)) }
        currentText = text("오늘의 첫 곡을 찾아보세요", T.BODY_BOLD).apply { maxLines = 1; ellipsize = TextUtils.TruncateAt.END }
        detailText = text("음악을 선택하면 여기에 표시돼요", T.CAPTION, Ui.TEXT_MUTED).apply { maxLines = 1; ellipsize = TextUtils.TruncateAt.END; setPadding(0, u(2f), 0, 0) }
        timeText = text("", T.SMALL, Ui.TEXT_MUTED)
        progress = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
            max = 1000
            progressTintList = ColorStateList.valueOf(Ui.TEXT)
            progressBackgroundTintList = ColorStateList.valueOf(Ui.BORDER)
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }
        favorite = pill("저장", Pill.OUTLINED, Icon.HEART) { state.current?.let { command("favorite", "id", it.id) } }
        nowArt = FrameLayout(this)
        if (wide) buildWide(root) else buildCompact(root)
    }
    private fun buildMapCard(): FrameLayout {
        val wrap = FrameLayout(this).apply { background = shape(Ui.RAISED, 8f); clipToOutline = true }
        map = MusicMapView(this).apply { scale = s }
        wrap.addView(map, FrameLayout.LayoutParams(-1, -1))
        val badge = column().apply {
            background = shape(Ui.SURFACE, 8f); setPadding(u(16f), u(10f), u(16f), u(12f)); elevation = u(12f).toFloat()
        }
        badge.addView(text("지금 듣기 좋은 곳", T.SMALL_BOLD, Ui.TEXT_MUTED))
        regionText = text("나의 음악 지도", T.HEADING).apply { typeface = weight(700); setPadding(0, u(2f), 0, 0) }
        badge.addView(regionText)
        wrap.addView(badge, FrameLayout.LayoutParams(-2, -2, Gravity.TOP or Gravity.START).apply { setMargins(u(12f), u(12f), 0, 0) })
        val zoom = column(); parkedControls.add(zoom)
        val size = 48f
        zoom.addView(circle(Icon.PLUS, size, Ui.SURFACE, Ui.TEXT, "지도 확대", .42f) { map.zoom = (map.zoom + 1).coerceAtMost(14); map.invalidate() }.apply { elevation = u(8f).toFloat() }, lp(u(size), u(size)))
        zoom.addView(circle(Icon.MINUS, size, Ui.SURFACE, Ui.TEXT, "지도 축소", .42f) { map.zoom = (map.zoom - 1).coerceAtLeast(7); map.invalidate() }.apply { elevation = u(8f).toFloat() }, lp(u(size), u(size)) { topMargin = u(8f) })
        wrap.addView(zoom, FrameLayout.LayoutParams(-2, -2, Gravity.TOP or Gravity.END).apply { setMargins(0, u(12f), u(12f), 0) })
        return wrap
    }
    private fun buildSources(): LinearLayout {
        val sources = row(); parkedControls.add(sources)
        sources.addView(pill("현재 위치", Pill.DARK, Icon.LOCATE) { liveLocation() }, lp(-2, u(48f)))
        sources.addView(pill("경로 둘러보기", Pill.DARK, Icon.ROUTE) { command("demo") }.apply { contentDescription = "시연 시작" }, lp(-2, u(48f)) { leftMargin = u(8f) })
        return sources
    }
    private fun buildListHeader() = row().apply {
        addView(listTitle, lp(0, -2, 1f))
        addView(jump, lp(-2, u(40f)))
    }
    private fun buildFilters(): View {
        val filters = row(); parkedControls.add(filters)
        genres = listOf("전체", "차분하게", "경쾌하게").map { genre ->
            pill(genre, Pill.DARK) { command("genre", "value", genre) }.apply { letterSpacing = 0f; typeface = weight(400) }
                .also { filters.addView(it, lp(-2, u(44f)) { rightMargin = u(8f) }) }
        }
        return HorizontalScrollView(this).apply { isHorizontalScrollBarEnabled = false; addView(filters) }
    }
    private fun songInfo(openPlayer: Boolean) = column().apply {
        addView(currentText); addView(detailText)
        if (openPlayer) {
            isFocusable = true; contentDescription = "재생 화면 열기"; setOnClickListener { showPlayer() }
        }
    }
    private fun navItems() = listOf("탐색" to Icon.EXPLORE, "보관함" to Icon.LIBRARY, "Apple Music" to Icon.NOTE).mapIndexed { index, (label, icon) ->
        Button(this).apply {
            text = label; isAllCaps = false; textSize = 12f * s
            minHeight = 0; minimumHeight = 0; minWidth = 0; minimumWidth = 0
            stateListAnimator = null; elevation = 0f; gravity = Gravity.CENTER; setPadding(0, u(8f), 0, u(8f))
            setCompoundDrawables(null, IconDrawable(icon, Ui.TEXT_MUTED).apply { setBounds(0, 0, u(26f), u(26f)) }, null, null)
            compoundDrawablePadding = u(6f)
            setOnClickListener {
                if (index == 2) startActivity(Intent(this@MainActivity, AppleMusicActivity::class.java))
                else { favoritesOnly = index == 1; renderedList = ""; render(); listScroll.smoothScrollTo(0, 0) }
            }
            parkedControls.add(this)
        }
    }

    // ---- Wide: vehicle display --------------------------------------------------------------
    private fun buildWide(root: LinearLayout) {
        val gap = u(8f)
        val main = row().apply { gravity = Gravity.NO_GRAVITY; setPadding(gap, gap, gap, 0) }
        root.addView(main, lp(-1, 0, 1f))

        val rail = column().apply { background = shape(Ui.SURFACE, 8f); setPadding(gap, u(12f), gap, u(12f)) }
        main.addView(rail, lp(u(104f), -1))
        navButtons = navItems().onEach { rail.addView(it, lp(-1, u(88f)) { bottomMargin = gap }) }

        explore = column().apply { background = shape(Ui.SURFACE, 8f); setPadding(u(20f), u(20f), u(20f), u(16f)) }
        main.addView(explore, lp(0, -1, 1.2f) { leftMargin = gap })
        explore.addView(pageTitle); explore.addView(pageSubtitle)
        explore.addView(buildMapCard(), lp(-1, 0, 1f) { topMargin = u(16f) })
        val sources = buildSources()
        sources.addView(sourceText, lp(0, -2, 1f) { leftMargin = u(16f) })
        explore.addView(sources, lp(-1, -2) { topMargin = u(12f) })

        val listPanel = column().apply { background = shape(Ui.SURFACE, 8f); setPadding(u(20f), u(20f), u(12f), 0) }
        main.addView(listPanel, lp(0, -1, 1f) { leftMargin = gap })
        listPanel.addView(buildListHeader(), lp(-1, -2) { rightMargin = u(8f) })
        listPanel.addView(buildFilters(), lp(-1, -2) { topMargin = u(12f) })
        listScroll = ScrollView(this).apply { isVerticalScrollBarEnabled = false }
        val listBody = column(); listScroll.addView(listBody)
        listBody.addView(tracks); listBody.addView(messageText)
        listPanel.addView(listScroll, lp(-1, 0, 1f) { topMargin = u(12f) })

        root.addView(buildWideBar(), lp(-1, -2))
    }
    private fun buildWideBar(): View {
        val bar = row().apply { setPadding(u(16f), u(12f), u(16f), u(12f)) }
        val left = row()
        left.addView(nowArt, lp(u(64f), u(64f)) { rightMargin = u(14f) })
        left.addView(songInfo(openPlayer = false), lp(0, -2, 1f))
        bar.addView(left, lp(0, -2, 1f))

        val center = column().apply { gravity = Gravity.CENTER_HORIZONTAL }
        val controls = row().apply { gravity = Gravity.CENTER }
        controls.addView(circle(Icon.PREV, 56f, Color.TRANSPARENT, Ui.TEXT_SOFT, "이전 곡", .42f) { command("previous") }, lp(u(56f), u(56f)))
        playButton = circle(Icon.PLAY, 64f, Ui.ACCENT, Ui.ON_ACCENT, "재생", .42f) { command("play") }
        controls.addView(playButton, lp(u(64f), u(64f)) { leftMargin = u(20f); rightMargin = u(20f) })
        controls.addView(circle(Icon.NEXT, 56f, Color.TRANSPARENT, Ui.TEXT_SOFT, "다음 곡", .42f) { command("next") }, lp(u(56f), u(56f)))
        center.addView(controls)
        val track = row()
        track.addView(progress, lp(0, u(4f), 1f))
        track.addView(timeText, lp(-2, -2) { leftMargin = u(12f) })
        center.addView(track, lp(-1, -2) { topMargin = u(8f) })
        bar.addView(center, lp(0, -2, 1.3f) { leftMargin = u(16f); rightMargin = u(16f) })

        val right = row().apply { gravity = Gravity.CENTER_VERTICAL or Gravity.END }
        right.addView(favorite, lp(-2, u(48f)))
        right.addView(circle(Icon.STOP, 48f, Ui.RAISED, Ui.TEXT, "재생 종료", .4f) { command("stop") }, lp(u(48f), u(48f)) { leftMargin = u(12f) })
        bar.addView(right, lp(0, -2, 1f))
        return bar
    }

    // ---- Compact: portrait ------------------------------------------------------------------
    private fun buildCompact(root: LinearLayout) {
        listScroll = ScrollView(this).apply { isFillViewport = true; isVerticalScrollBarEnabled = false }
        root.addView(listScroll, lp(-1, 0, 1f))
        val content = column().apply { setPadding(u(16f), u(20f), u(16f), u(16f)) }
        listScroll.addView(content)
        content.addView(pageTitle); content.addView(pageSubtitle)
        explore = column(); content.addView(explore)
        explore.addView(buildMapCard(), lp(-1, u(200f)) { topMargin = u(16f) })
        explore.addView(buildSources(), lp(-1, -2) { topMargin = u(12f) })
        explore.addView(sourceText, lp(-1, -2) { topMargin = u(8f) })
        content.addView(buildListHeader(), lp(-1, -2) { topMargin = u(24f) })
        content.addView(buildFilters(), lp(-1, -2) { topMargin = u(12f) })
        content.addView(tracks, lp(-1, -2) { topMargin = u(12f) })
        content.addView(messageText)

        val mini = column().apply { background = shape(Ui.CARD, 8f); elevation = u(8f).toFloat(); setPadding(u(8f), u(8f), u(8f), u(6f)) }
        val controls = row()
        controls.addView(nowArt, lp(u(44f), u(44f)) { rightMargin = u(12f) })
        controls.addView(songInfo(openPlayer = true), lp(0, -2, 1f))
        playButton = circle(Icon.PLAY, 48f, Ui.ACCENT, Ui.ON_ACCENT, "재생", .42f) { command("play") }
        controls.addView(playButton, lp(u(48f), u(48f)) { leftMargin = u(8f) })
        mini.addView(controls)
        mini.addView(progress, lp(-1, u(2f)) { topMargin = u(6f) })
        root.addView(mini, lp(-1, -2) { setMargins(u(8f), u(4f), u(8f), u(4f)) })

        val nav = row().apply { setPadding(u(16f), 0, u(16f), u(4f)) }
        navButtons = navItems().onEach { nav.addView(it, lp(0, u(60f), 1f)) }
        root.addView(nav)
    }
    private fun showPlayer() {
        if (wide || playerDialog?.isShowing == true) return
        val body = column().apply { setPadding(u(24f), u(24f), u(24f), u(20f)) }
        body.addView(text("지금 재생 중", T.SMALL_BOLD, Ui.TEXT_MUTED))
        body.addView(albumArt(state.current?.let { Catalog.tracks.indexOf(it) } ?: 0, 8f), lp(-1, u(200f)) { topMargin = u(16f); bottomMargin = u(16f) })
        dialogTitle = text("", T.TITLE); body.addView(dialogTitle)
        (timeText.parent as? ViewGroup)?.removeView(timeText); body.addView(timeText, lp(-2, -2) { topMargin = u(4f) })
        val controls = row().apply { gravity = Gravity.CENTER }
        controls.addView(circle(Icon.PREV, 56f, Color.TRANSPARENT, Ui.TEXT_SOFT, "이전 곡", .42f) { command("previous") }, lp(u(56f), u(56f)))
        dialogPlay = circle(Icon.PLAY, 72f, Ui.ACCENT, Ui.ON_ACCENT, "재생", .42f) { command("play") }
        controls.addView(dialogPlay, lp(u(72f), u(72f)) { leftMargin = u(24f); rightMargin = u(24f) })
        controls.addView(circle(Icon.NEXT, 56f, Color.TRANSPARENT, Ui.TEXT_SOFT, "다음 곡", .42f) { command("next") }, lp(u(56f), u(56f)))
        body.addView(controls, lp(-1, -2) { topMargin = u(16f); bottomMargin = u(16f) })
        val actions = row().apply { gravity = Gravity.CENTER }
        (favorite.parent as? ViewGroup)?.removeView(favorite); actions.addView(favorite, lp(-2, u(48f)))
        actions.addView(pill("재생 종료", Pill.DARK, Icon.STOP) { command("stop") }, lp(-2, u(48f)) { leftMargin = u(8f) })
        body.addView(actions)
        body.addView(pill("닫기", Pill.DARK) { playerDialog?.dismiss() }, lp(-1, u(48f)) { topMargin = u(12f) })
        playerDialog = android.app.AlertDialog.Builder(this).setView(body).create().apply {
            setOnDismissListener { dialogTitle = null; dialogPlay = null }
            show(); window?.setBackgroundDrawable(shape(Ui.SURFACE, 8f))
        }
        render()
    }

    // ---- Render -----------------------------------------------------------------------------
    private fun trackRow(track: Track): View {
        val current = state.current?.id == track.id
        val favorite = track.id in state.favorites
        val card = row().apply {
            background = surface(if (current) Ui.CARD else Color.TRANSPARENT, 6f)
            setPadding(u(8f), u(8f), u(12f), u(8f)); minimumHeight = u(72f)
            isFocusable = true; contentDescription = "${track.title}, ${track.reason}, 재생"
            setOnClickListener { command("select", "id", track.id) }
        }
        card.addView(albumArt(Catalog.tracks.indexOf(track)), lp(u(56f), u(56f)) { rightMargin = u(14f) })
        val info = column()
        info.addView(text(track.title, T.BODY_BOLD, if (current) Ui.ACCENT else Ui.TEXT).apply { maxLines = 1; ellipsize = TextUtils.TruncateAt.END })
        info.addView(text("${Catalog.regions.first { it.id == track.regionId }.name} · ${track.genre}", T.CAPTION, Ui.TEXT_MUTED).apply { setPadding(0, u(2f), 0, 0) })
        info.addView(text(track.reason, T.SMALL, Ui.TEXT_MUTED).apply { maxLines = if (wide) 1 else 2; ellipsize = TextUtils.TruncateAt.END; setPadding(0, u(2f), 0, 0) })
        card.addView(info, lp(0, -2, 1f))
        if (favorite) card.addView(ImageView(this).apply { setImageDrawable(IconDrawable(Icon.HEART_FILLED, Ui.ACCENT)); contentDescription = "보관함에 저장됨" }, lp(u(20f), u(20f)) { leftMargin = u(12f) })
        if (current) card.addView(ImageView(this).apply { setImageDrawable(IconDrawable(if (state.playing) Icon.EQ else Icon.PAUSE, Ui.ACCENT)); importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO }, lp(u(22f), u(22f)) { leftMargin = u(12f) })
        return card
    }
    private fun render() {
        pageTitle.text = if (favoritesOnly) "나의 음악 보관함" else "어디로 떠나볼까요?"
        explore.visibility = if (favoritesOnly) View.GONE else View.VISIBLE
        if (!wide) pageSubtitle.text = if (favoritesOnly) "저장한 곡을 한곳에서 다시 들어보세요." else "지금 있는 곳에서, 새로운 음악을 만나세요."
        listTitle.text = if (favoritesOnly) "저장한 음악" else "이곳의 사운드"
        navButtons.forEachIndexed { i, b ->
            val active = i < 2 && favoritesOnly == (i == 1)
            val color = if (active) Ui.TEXT else Ui.TEXT_MUTED
            b.setTextColor(color); b.typeface = weight(if (active) 700 else 400)
            (b.compoundDrawables[1] as? IconDrawable)?.color = color
            b.background = surface(if (active && wide) Ui.RAISED else Color.TRANSPARENT, 8f)
        }
        regionText.text = state.region?.name ?: "나의 음악 지도"
        sourceText.text = "●  ${state.source}"
        map.point = state.point; map.regionId = state.region?.id; map.invalidate()
        jump.visibility = if (state.demo && !favoritesOnly && !restricted) View.VISIBLE else View.GONE
        genres.forEach { stylePill(it, if (it.text.toString() == state.genre) Pill.ACCENT else Pill.DARK); it.typeface = weight(if (it.text.toString() == state.genre) 700 else 400) }
        val list = if (favoritesOnly) Catalog.tracks.filter { it.id in state.favorites && (state.genre == "전체" || it.genre == state.genre) } else state.recommendations
        val listKey = list.joinToString { it.id } + state.current?.id + state.playing + state.favorites.sorted().joinToString() + favoritesOnly
        if (listKey != renderedList) {
            renderedList = listKey; tracks.removeAllViews()
            if (list.isEmpty()) {
                val empty = column().apply { background = shape(Ui.RAISED, 8f); setPadding(u(24f), u(24f), u(24f), u(24f)) }
                empty.addView(text(if (favoritesOnly) "좋아하는 음악을 모아보세요" else "여행의 시작에 음악을 더해요", T.HEADING).apply { typeface = weight(700) })
                empty.addView(text(if (favoritesOnly) "재생 중인 곡에서 저장을 누르면 여기에 담겨요." else "현재 위치를 켜거나 경로를 둘러보세요.\n서울·수원·용인의 시연곡을 만날 수 있어요.", T.CAPTION, Ui.TEXT_MUTED).apply { setPadding(0, u(8f), 0, 0) })
                tracks.addView(empty)
            }
            list.forEach { tracks.addView(trackRow(it), lp(-1, -2) { bottomMargin = u(4f) }) }
        }
        messageText.text = if (restricted) "주행 중에는 목록·지도 조작을 제한합니다" else state.message
        messageText.setTextColor(if (restricted) Ui.WARNING else Ui.TEXT_MUTED)
        fun enableControls(view: View) {
            view.isEnabled = !restricted
            if (view is ViewGroup) for (i in 0 until view.childCount) enableControls(view.getChildAt(i))
        }
        parkedControls.forEach { enableControls(it); it.alpha = if (restricted) .4f else 1f }
        for (i in 0 until tracks.childCount) tracks.getChildAt(i).isEnabled = !restricted
        val current = state.current
        if (nowArtFor != current?.id) {
            nowArtFor = current?.id; nowArt.removeAllViews()
            nowArt.addView(if (current == null) View(this).apply { background = shape(Ui.RAISED, 4f) } else albumArt(Catalog.tracks.indexOf(current)), FrameLayout.LayoutParams(-1, -1))
        }
        currentText.text = current?.title ?: "오늘의 첫 곡을 찾아보세요"
        detailText.text = current?.let { if (state.buffering) "재생 준비 중 · ${it.artist}" else "${it.artist} · ${it.genre}" } ?: "음악을 선택하면 여기에 표시돼요"
        listOfNotNull(playButton, dialogPlay).forEach {
            (it.drawable as? IconDrawable)?.icon = if (state.playing || state.buffering) Icon.PAUSE else Icon.PLAY
            it.contentDescription = if (state.playing || state.buffering) "일시정지" else "재생"
        }
        dialogTitle?.text = current?.title ?: "음악을 선택해 주세요"
        val saved = current?.id in state.favorites
        favorite.text = if (saved) "저장됨" else "저장"
        (favorite.compoundDrawables[0] as? IconDrawable)?.let { it.icon = if (saved) Icon.HEART_FILLED else Icon.HEART; it.color = if (saved) Ui.ACCENT else Ui.TEXT }
        favorite.contentDescription = if (saved) "보관함에 저장됨" else "보관함에 저장"
        favorite.isEnabled = current != null && current.appleMusicId == null && !current.id.startsWith("apple:") && !restricted
        favorite.alpha = if (favorite.isEnabled) 1f else .4f
        progress.progress = (1000L * state.positionMs / state.durationMs.coerceAtLeast(1)).toInt()
        fun clock(ms: Int) = "%d:%02d".format(ms / 60000, ms / 1000 % 60)
        timeText.text = "${clock(state.positionMs)} / ${clock(state.durationMs)}"
    }
}
