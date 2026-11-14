package com.musicmap.car

import android.graphics.*
import android.graphics.drawable.Drawable

/**
 * Design tokens. World: a road map read at night. Graphite neutrals keep the chrome quiet;
 * the single accent is lane-marking amber, used for the primary action and the current item.
 * Place tints appear only inside place art and on the map, never on surfaces.
 */
object Ui {
    const val BASE = 0xFF0E1011.toInt()
    const val SURFACE = 0xFF16191B.toInt()
    const val RAISED = 0xFF1F2326.toInt()
    const val CARD = 0xFF282D30.toInt()
    const val HAIRLINE = 0x1AF2F3F1
    const val TRACK = 0x33F2F3F1
    const val TEXT = 0xFFF2F3F1.toInt()
    const val TEXT_SOFT = 0xFFB9BDBB.toInt()
    const val TEXT_MUTED = 0xFF8A908E.toInt()
    const val ACCENT = 0xFFF2B84B.toInt()
    const val ON_ACCENT = 0xFF1B1503.toInt()
    const val RIPPLE = 0x22FFFFFF

    /** River blue, fortress stone, lake green. */
    fun placeTint(regionId: String?): Int = when (regionId) {
        "seoul" -> 0xFF6E9DB5.toInt()
        "suwon" -> 0xFFC09662.toInt()
        "yongin" -> 0xFF6FA98A.toInt()
        else -> TEXT_MUTED
    }
    fun mix(a: Int, b: Int, t: Float): Int = Color.rgb(
        (Color.red(a) + (Color.red(b) - Color.red(a)) * t).toInt(),
        (Color.green(a) + (Color.green(b) - Color.green(a)) * t).toInt(),
        (Color.blue(a) + (Color.blue(b) - Color.blue(a)) * t).toInt())
}

enum class Icon { PLAY, PAUSE, PREV, NEXT, HEART, HEART_FILLED, LOCATE, ROUTE, PLUS, MINUS, ARROW, BACK, NOTE, EQ, VOICE, VOICE_OFF, SEARCH }

/** Line icons on a 24-unit grid, one stroke width, colored by their text role. */
class IconDrawable(private var kind: Icon, color: Int) : Drawable() {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        this.color = color; strokeCap = Paint.Cap.ROUND; strokeJoin = Paint.Join.ROUND
    }
    private val path = Path()
    var color: Int
        get() = paint.color
        set(value) { if (paint.color != value) { paint.color = value; invalidateSelf() } }
    var icon: Icon
        get() = kind
        set(value) { if (kind != value) { kind = value; invalidateSelf() } }

    override fun draw(canvas: Canvas) {
        val b = bounds
        val unit = minOf(b.width(), b.height()) / 24f
        if (unit <= 0f) return
        canvas.save()
        canvas.translate(b.exactCenterX() - 12 * unit, b.exactCenterY() - 12 * unit)
        canvas.scale(unit, unit)
        paint.strokeWidth = 1.75f
        paint.pathEffect = null
        path.reset()
        fun fill() { paint.style = Paint.Style.FILL }
        fun stroke() { paint.style = Paint.Style.STROKE }
        fun poly(vararg p: Float) {
            path.reset(); path.moveTo(p[0], p[1])
            var i = 2
            while (i < p.size) { path.lineTo(p[i], p[i + 1]); i += 2 }
            path.close(); canvas.drawPath(path, paint)
        }
        fun heart() {
            path.reset()
            path.moveTo(12f, 20.5f)
            path.cubicTo(5f, 15.5f, 3f, 12f, 3f, 8.8f)
            path.cubicTo(3f, 6.1f, 5.1f, 4f, 7.7f, 4f)
            path.cubicTo(9.4f, 4f, 10.9f, 4.9f, 12f, 6.3f)
            path.cubicTo(13.1f, 4.9f, 14.6f, 4f, 16.3f, 4f)
            path.cubicTo(18.9f, 4f, 21f, 6.1f, 21f, 8.8f)
            path.cubicTo(21f, 12f, 19f, 15.5f, 12f, 20.5f)
            path.close(); canvas.drawPath(path, paint)
        }
        fun speaker() {
            stroke(); path.reset()
            path.moveTo(4f, 9.5f); path.lineTo(8f, 9.5f); path.lineTo(12.5f, 5.5f); path.lineTo(12.5f, 18.5f)
            path.lineTo(8f, 14.5f); path.lineTo(4f, 14.5f); path.close(); canvas.drawPath(path, paint)
        }
        when (kind) {
            Icon.PLAY -> { fill(); poly(8f, 5f, 19.5f, 12f, 8f, 19f) }
            Icon.PAUSE -> { fill(); canvas.drawRoundRect(6f, 5f, 10f, 19f, 1f, 1f, paint); canvas.drawRoundRect(14f, 5f, 18f, 19f, 1f, 1f, paint) }
            Icon.PREV -> { fill(); canvas.drawRoundRect(5f, 5f, 7.5f, 19f, 1f, 1f, paint); poly(19f, 5.5f, 9f, 12f, 19f, 18.5f) }
            Icon.NEXT -> { fill(); canvas.drawRoundRect(16.5f, 5f, 19f, 19f, 1f, 1f, paint); poly(5f, 5.5f, 15f, 12f, 5f, 18.5f) }
            Icon.HEART -> { stroke(); heart() }
            Icon.HEART_FILLED -> { fill(); heart() }
            Icon.LOCATE -> {
                stroke(); canvas.drawCircle(12f, 12f, 6.5f, paint)
                canvas.drawLine(12f, 2f, 12f, 5f, paint); canvas.drawLine(12f, 19f, 12f, 22f, paint)
                canvas.drawLine(2f, 12f, 5f, 12f, paint); canvas.drawLine(19f, 12f, 22f, 12f, paint)
                fill(); canvas.drawCircle(12f, 12f, 2.2f, paint)
            }
            Icon.ROUTE -> {
                fill(); canvas.drawCircle(6f, 18f, 2.2f, paint); canvas.drawCircle(18f, 6f, 2.2f, paint)
                stroke(); paint.pathEffect = DashPathEffect(floatArrayOf(2.4f, 2.6f), 0f)
                path.moveTo(9f, 18f); path.cubicTo(21f, 18f, 3f, 6f, 15f, 6f); canvas.drawPath(path, paint)
            }
            Icon.PLUS -> { stroke(); canvas.drawLine(12f, 5f, 12f, 19f, paint); canvas.drawLine(5f, 12f, 19f, 12f, paint) }
            Icon.MINUS -> { stroke(); canvas.drawLine(5f, 12f, 19f, 12f, paint) }
            Icon.ARROW -> {
                stroke(); canvas.drawLine(5f, 12f, 19f, 12f, paint)
                path.moveTo(13f, 6f); path.lineTo(19f, 12f); path.lineTo(13f, 18f); canvas.drawPath(path, paint)
            }
            Icon.BACK -> {
                stroke(); canvas.drawLine(5f, 12f, 19f, 12f, paint)
                path.moveTo(11f, 6f); path.lineTo(5f, 12f); path.lineTo(11f, 18f); canvas.drawPath(path, paint)
            }
            Icon.NOTE -> {
                fill(); canvas.drawCircle(8f, 17.5f, 3.2f, paint)
                canvas.drawRect(9.6f, 4f, 11.4f, 17.5f, paint)
                poly(11.4f, 4f, 19f, 6.6f, 19f, 9.6f, 11.4f, 7.2f)
            }
            Icon.EQ -> {
                fill(); canvas.drawRoundRect(5f, 10f, 8f, 19f, 1f, 1f, paint)
                canvas.drawRoundRect(10.5f, 5f, 13.5f, 19f, 1f, 1f, paint)
                canvas.drawRoundRect(16f, 13f, 19f, 19f, 1f, 1f, paint)
            }
            Icon.VOICE -> {
                speaker()
                path.reset(); path.moveTo(16f, 9f); path.cubicTo(17.6f, 10.6f, 17.6f, 13.4f, 16f, 15f)
                path.moveTo(18.6f, 6.6f); path.cubicTo(21.6f, 9.6f, 21.6f, 14.4f, 18.6f, 17.4f); canvas.drawPath(path, paint)
            }
            Icon.VOICE_OFF -> {
                speaker()
                canvas.drawLine(16.5f, 9.5f, 21.5f, 14.5f, paint); canvas.drawLine(21.5f, 9.5f, 16.5f, 14.5f, paint)
            }
            Icon.SEARCH -> { stroke(); canvas.drawCircle(10.5f, 10.5f, 6f, paint); canvas.drawLine(15f, 15f, 20f, 20f, paint) }
        }
        canvas.restore()
    }
    override fun setAlpha(alpha: Int) { paint.alpha = alpha; invalidateSelf() }
    override fun setColorFilter(colorFilter: ColorFilter?) { paint.colorFilter = colorFilter; invalidateSelf() }
    @Deprecated("Deprecated in Java")
    override fun getOpacity() = PixelFormat.TRANSLUCENT
}

/**
 * Cover art for the demo catalog: a flat tile in the place's own color with a line drawing of the
 * place itself (river current, fortress wall, lake ripples). Upbeat tracks get a denser drawing.
 */
class PlaceArt(private val regionId: String?, private val lively: Boolean, private val radius: Float) : Drawable() {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply { strokeCap = Paint.Cap.ROUND; strokeJoin = Paint.Join.ROUND }
    private val path = Path()
    private val tint = Ui.placeTint(regionId)
    private val note = IconDrawable(Icon.NOTE, Ui.TEXT_SOFT)

    override fun draw(canvas: Canvas) {
        val b = RectF(bounds)
        val w = b.width(); val h = b.height()
        if (w <= 0f || h <= 0f) return
        paint.style = Paint.Style.FILL
        paint.color = if (regionId in setOf("seoul", "suwon", "yongin")) Ui.mix(Ui.SURFACE, tint, .34f) else Ui.RAISED
        canvas.drawRoundRect(b, radius, radius, paint)
        canvas.save(); path.reset(); path.addRoundRect(b, radius, radius, Path.Direction.CW); canvas.clipPath(path)
        canvas.translate(b.left, b.top)
        paint.style = Paint.Style.STROKE; paint.color = Ui.mix(tint, Ui.TEXT, .25f); paint.strokeWidth = w * .035f
        when (regionId) {
            "seoul" -> {
                val rows = if (lively) 4 else 3
                for (i in 0 until rows) {
                    val y = h * (.34f + i * (.36f / (rows - 1)))
                    path.reset(); path.moveTo(-w * .1f, y)
                    val a = h * (if (lively) .07f else .05f)
                    path.cubicTo(w * .2f, y - a, w * .3f, y + a, w * .5f, y)
                    path.cubicTo(w * .7f, y - a, w * .8f, y + a, w * 1.1f, y)
                    canvas.drawPath(path, paint)
                }
            }
            "suwon" -> {
                val top = h * .42f; val low = h * .56f; val step = w / (if (lively) 5f else 4f)
                path.reset(); path.moveTo(-step * .25f, low)
                var x = -step * .25f
                while (x < w + step) {
                    path.lineTo(x, top); path.lineTo(x + step * .5f, top); path.lineTo(x + step * .5f, low); path.lineTo(x + step, low)
                    x += step
                }
                canvas.drawPath(path, paint)
                canvas.drawLine(0f, h * .72f, w, h * .72f, paint)
            }
            "yongin" -> {
                val rings = if (lively) 4 else 3
                for (i in 1..rings) {
                    val rx = w * .16f * i; val ry = h * .07f * i
                    canvas.drawOval(w * .5f - rx, h * .56f - ry, w * .5f + rx, h * .56f + ry, paint)
                }
            }
            else -> {
                val n = (minOf(w, h) * .4f).toInt()
                note.setBounds(((w - n) / 2).toInt(), ((h - n) / 2).toInt(), ((w + n) / 2).toInt(), ((h + n) / 2).toInt())
                note.draw(canvas)
            }
        }
        canvas.restore()
    }
    override fun setAlpha(alpha: Int) { paint.alpha = alpha }
    override fun setColorFilter(colorFilter: ColorFilter?) { paint.colorFilter = colorFilter }
    @Deprecated("Deprecated in Java")
    override fun getOpacity() = PixelFormat.TRANSLUCENT
}
