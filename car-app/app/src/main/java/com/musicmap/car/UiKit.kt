package com.musicmap.car

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.DashPathEffect
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlin.math.roundToInt

/** Type roles: hierarchy comes from size and color; weights stay between 400 and 600. */
enum class T(val size: Float, val weight: Int) {
    HERO(44f, 600), DISPLAY(32f, 600), TITLE(22f, 600), BODY_STRONG(16f, 500), BODY(16f, 400),
    CAPTION(14f, 400), SMALL(12f, 400)
}
enum class Tone { QUIET, OUTLINE, SELECTED, PRIMARY }

/** Small in-memory artwork cache; downloads run off the main thread and only from Apple's image hosts. */
object ArtLoader {
    private val cache = android.util.LruCache<String, android.graphics.Bitmap>(48)
    private val workers = java.util.concurrent.Executors.newFixedThreadPool(2)
    private val main = android.os.Handler(android.os.Looper.getMainLooper())
    fun load(url: String, onLoaded: (android.graphics.Bitmap) -> Unit) {
        cache.get(url)?.let { onLoaded(it); return }
        val host = runCatching { java.net.URL(url).host }.getOrNull() ?: return
        if (!url.startsWith("https://") || !host.endsWith(".mzstatic.com")) return
        workers.execute {
            val bitmap = runCatching {
                val connection = java.net.URL(url).openConnection() as java.net.HttpURLConnection
                try {
                    connection.connectTimeout = 7000; connection.readTimeout = 7000
                    if (connection.responseCode == 200) connection.inputStream.use { android.graphics.BitmapFactory.decodeStream(it) } else null
                } finally { connection.disconnect() }
            }.getOrNull() ?: return@execute
            main.post { cache.put(url, bitmap); onLoaded(bitmap) }
        }
    }
}

class ButtonIcon(val drawable: IconDrawable, val end: Boolean)

/** Draws an icon inside a line of text, vertically centered on the text. */
class CenteredIconSpan(private val icon: Drawable) : android.text.style.ReplacementSpan() {
    override fun getSize(paint: Paint, text: CharSequence?, start: Int, end: Int, fm: Paint.FontMetricsInt?) = icon.bounds.width()
    override fun draw(canvas: Canvas, text: CharSequence?, start: Int, end: Int, x: Float, top: Int, y: Int, bottom: Int, paint: Paint) {
        val metrics = paint.fontMetrics
        val center = y + (metrics.ascent + metrics.descent) / 2f
        canvas.save(); canvas.translate(x, center - icon.bounds.height() / 2f); icon.draw(canvas); canvas.restore()
    }
}

/** Shared view primitives so every screen uses one spacing grid, one radius set and one type scale. */
class UiKit(private val context: Context, val s: Float) {
    private val density = context.resources.displayMetrics.density
    fun dp(value: Float) = (value * density).roundToInt()
    /** Spacing on the 4-unit grid, scaled for the display. */
    fun u(value: Float) = dp(value * s)
    fun weight(w: Int): Typeface = Typeface.create(Typeface.DEFAULT, w, false)

    fun shape(color: Int, radius: Float, stroke: Int? = null, oval: Boolean = false) = GradientDrawable().apply {
        setColor(color)
        if (oval) shape = GradientDrawable.OVAL else cornerRadius = u(radius).toFloat()
        if (stroke != null) setStroke(dp(1f), stroke)
    }
    fun surface(color: Int, radius: Float, stroke: Int? = null, oval: Boolean = false): Drawable =
        RippleDrawable(ColorStateList.valueOf(Ui.RIPPLE), shape(color, radius, stroke, oval), shape(Color.WHITE, radius, oval = oval))

    fun column() = LinearLayout(context).apply { orientation = LinearLayout.VERTICAL }
    fun row() = LinearLayout(context).apply { orientation = LinearLayout.HORIZONTAL; gravity = Gravity.CENTER_VERTICAL }
    fun lp(w: Int, h: Int, weight: Float = 0f, block: LinearLayout.LayoutParams.() -> Unit = {}) =
        LinearLayout.LayoutParams(w, h, weight).apply(block)

    fun text(value: String, role: T, color: Int = Ui.TEXT) = TextView(context).apply {
        text = value; textSize = role.size * s; typeface = weight(role.weight); setTextColor(color); includeFontPadding = false
    }
    fun oneLine(view: TextView) = view.apply { maxLines = 1; ellipsize = TextUtils.TruncateAt.END }

    /** Rectangular control with the shared 10 radius. Sentence case, no tracking. */
    fun button(label: String, tone: Tone, icon: Icon? = null, iconEnd: Boolean = false, action: () -> Unit) = Button(context).apply {
        text = label; isAllCaps = false; letterSpacing = 0f; textSize = 15f * s; includeFontPadding = false
        minHeight = 0; minimumHeight = 0; minWidth = 0; minimumWidth = 0
        stateListAnimator = null; elevation = 0f; gravity = Gravity.CENTER
        setPadding(u(16f), 0, u(16f), 0)
        if (icon != null) tag = ButtonIcon(IconDrawable(icon, Ui.TEXT).apply { setBounds(0, 0, u(18f), u(18f)) }, iconEnd)
        label(this, label)
        tone(this, tone)
        setOnClickListener { action() }
    }
    fun tone(button: Button, tone: Tone) {
        val (bg, fg) = when (tone) {
            Tone.QUIET -> Ui.RAISED to Ui.TEXT_SOFT
            Tone.OUTLINE -> Color.TRANSPARENT to Ui.TEXT_SOFT
            Tone.SELECTED -> Ui.CARD to Ui.TEXT
            Tone.PRIMARY -> Ui.TEXT to Ui.BASE
        }
        button.background = surface(bg, 10f, if (tone == Tone.OUTLINE || tone == Tone.SELECTED) Ui.HAIRLINE else null)
        button.setTextColor(fg)
        button.typeface = weight(if (tone == Tone.SELECTED || tone == Tone.PRIMARY) 500 else 400)
        (button.tag as? ButtonIcon)?.let { it.drawable.color = fg; button.invalidate() }
    }
    /** Sets a button's text, keeping its icon inline so icon and label stay centered as one unit. */
    fun label(button: Button, value: String) {
        val icon = button.tag as? ButtonIcon
        if (icon == null) { button.text = value; return }
        val gap = "\u2009\u2009"
        val text = android.text.SpannableString(if (icon.end) "$value$gap\uFFFC" else "\uFFFC$gap$value")
        val at = if (icon.end) text.length - 1 else 0
        text.setSpan(CenteredIconSpan(icon.drawable), at, at + 1, android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        button.text = text
    }
    fun icon(button: Button): IconDrawable? = (button.tag as? ButtonIcon)?.drawable
    /** Text-only tab; the active one is marked by color and weight alone. */
    fun tab(label: String, action: () -> Unit) = Button(context).apply {
        text = label; isAllCaps = false; letterSpacing = 0f; textSize = 15f * s; includeFontPadding = false
        minHeight = 0; minimumHeight = 0; minWidth = 0; minimumWidth = 0
        stateListAnimator = null; elevation = 0f; gravity = Gravity.CENTER
        setPadding(u(12f), 0, u(12f), 0); background = surface(Color.TRANSPARENT, 10f)
        setOnClickListener { action() }
    }
    fun circle(icon: Icon, size: Float, bg: Int, fg: Int, description: String, iconRatio: Float = .42f, action: () -> Unit) = ImageButton(context).apply {
        setImageDrawable(IconDrawable(icon, fg)); contentDescription = description
        scaleType = ImageView.ScaleType.FIT_CENTER
        background = surface(bg, 0f, oval = true)
        val pad = u(size * (1 - iconRatio) / 2); setPadding(pad, pad, pad, pad)
        setOnClickListener { action() }
    }
    fun art(track: Track?, radius: Float = 8f): View {
        val artwork = track?.artworkUrl
        if (artwork == null) return View(context).apply {
            background = if (track == null) shape(Ui.RAISED, radius)
                else PlaceArt(track.regionId, track.genre == "경쾌하게", u(radius).toFloat())
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
        }
        // Real album artwork from the Apple Music catalog, clipped to the shared radius.
        return ImageView(context).apply {
            background = shape(Ui.RAISED, radius); clipToOutline = true
            scaleType = ImageView.ScaleType.CENTER_CROP
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
            ArtLoader.load(artwork) { bitmap -> setImageBitmap(bitmap) }
        }
    }
    /** Signature detail: the lane marking. A short dashed rule used once per screen. */
    fun laneRule(): View = object : View(context) {
        private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Ui.ACCENT; style = Paint.Style.STROKE; strokeWidth = u(2f).toFloat()
            pathEffect = DashPathEffect(floatArrayOf(u(12f).toFloat(), u(8f).toFloat()), 0f)
        }
        override fun onDraw(canvas: Canvas) { canvas.drawLine(0f, height / 2f, width.toFloat(), height / 2f, paint) }
    }
}
