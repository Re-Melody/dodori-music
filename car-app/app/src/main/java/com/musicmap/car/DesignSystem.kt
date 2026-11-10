package com.musicmap.car

import android.graphics.*
import android.graphics.drawable.Drawable

/**
 * Design tokens from the project design rules (Design,md): near-black achromatic surfaces,
 * one functional accent used only for playback, active and primary states.
 */
object Ui {
    const val BASE = 0xFF121212.toInt()          // Level 0 background
    const val SURFACE = 0xFF181818.toInt()       // Level 1 panels
    const val RAISED = 0xFF1F1F1F.toInt()        // Interactive surfaces, dark pills
    const val CARD = 0xFF252525.toInt()          // Elevated card / selected row
    const val BORDER = 0xFF4D4D4D.toInt()
    const val BORDER_LIGHT = 0xFF7C7C7C.toInt()  // Outlined pill border
    const val TEXT = 0xFFFFFFFF.toInt()
    const val TEXT_SOFT = 0xFFCBCBCB.toInt()
    const val TEXT_MUTED = 0xFFB3B3B3.toInt()
    const val ACCENT = 0xFF1ED760.toInt()
    const val ON_ACCENT = 0xFF000000.toInt()
    const val WARNING = 0xFFFFA42B.toInt()
    const val RIPPLE = 0x33FFFFFF

    /** Content (album art) supplies the color; the UI itself stays achromatic. */
    val artTones = arrayOf(
        intArrayOf(0xFF1E3A5F.toInt(), 0xFF3E7CB1.toInt()),
        intArrayOf(0xFF5A2A27.toInt(), 0xFFC0703B.toInt()),
        intArrayOf(0xFF2D2A4A.toInt(), 0xFF7A5BB5.toInt()),
        intArrayOf(0xFF1F4037.toInt(), 0xFF4F9A7E.toInt()),
        intArrayOf(0xFF4A3B1F.toInt(), 0xFFB89B4A.toInt()),
        intArrayOf(0xFF3A1F3D.toInt(), 0xFFB0577E.toInt()),
    )
}

enum class Icon { PLAY, PAUSE, PREV, NEXT, STOP, HEART, HEART_FILLED, EXPLORE, LIBRARY, LOCATE, ROUTE, PLUS, MINUS, ARROW, NOTE, EQ }

/** Vector icons drawn on a 24-unit grid so they stay crisp at any car-display density. */
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
        paint.strokeWidth = 2f
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
        when (kind) {
            Icon.PLAY -> { fill(); poly(8f, 5f, 19.5f, 12f, 8f, 19f) }
            Icon.PAUSE -> { fill(); canvas.drawRoundRect(6f, 5f, 10f, 19f, 1f, 1f, paint); canvas.drawRoundRect(14f, 5f, 18f, 19f, 1f, 1f, paint) }
            Icon.PREV -> { fill(); canvas.drawRoundRect(5f, 5f, 7.5f, 19f, 1f, 1f, paint); poly(19f, 5.5f, 9f, 12f, 19f, 18.5f) }
            Icon.NEXT -> { fill(); canvas.drawRoundRect(16.5f, 5f, 19f, 19f, 1f, 1f, paint); poly(5f, 5.5f, 15f, 12f, 5f, 18.5f) }
            Icon.STOP -> { fill(); canvas.drawRoundRect(6.5f, 6.5f, 17.5f, 17.5f, 2f, 2f, paint) }
            Icon.HEART -> { stroke(); heart() }
            Icon.HEART_FILLED -> { fill(); heart() }
            Icon.EXPLORE -> {
                stroke(); canvas.drawCircle(12f, 12f, 9f, paint)
                fill(); poly(16f, 8f, 13.4f, 13.4f, 8f, 16f, 10.6f, 10.6f)
            }
            Icon.LIBRARY -> {
                stroke(); canvas.drawLine(5f, 4f, 5f, 20f, paint); canvas.drawLine(10f, 4f, 10f, 20f, paint)
                poly(14f, 4.8f, 17.6f, 3.9f, 21f, 19.2f, 17.4f, 20.1f)
            }
            Icon.LOCATE -> {
                stroke(); canvas.drawCircle(12f, 12f, 6.5f, paint)
                canvas.drawLine(12f, 2f, 12f, 5f, paint); canvas.drawLine(12f, 19f, 12f, 22f, paint)
                canvas.drawLine(2f, 12f, 5f, 12f, paint); canvas.drawLine(19f, 12f, 22f, 12f, paint)
                fill(); canvas.drawCircle(12f, 12f, 2.5f, paint)
            }
            Icon.ROUTE -> {
                fill(); canvas.drawCircle(6f, 18f, 2.6f, paint); canvas.drawCircle(18f, 6f, 2.6f, paint)
                stroke(); paint.pathEffect = DashPathEffect(floatArrayOf(2.4f, 2.6f), 0f)
                path.moveTo(9f, 18f); path.cubicTo(21f, 18f, 3f, 6f, 15f, 6f); canvas.drawPath(path, paint)
            }
            Icon.PLUS -> { stroke(); canvas.drawLine(12f, 5f, 12f, 19f, paint); canvas.drawLine(5f, 12f, 19f, 12f, paint) }
            Icon.MINUS -> { stroke(); canvas.drawLine(5f, 12f, 19f, 12f, paint) }
            Icon.ARROW -> {
                stroke(); canvas.drawLine(5f, 12f, 19f, 12f, paint)
                path.moveTo(13f, 6f); path.lineTo(19f, 12f); path.lineTo(13f, 18f); canvas.drawPath(path, paint)
            }
            Icon.NOTE -> {
                fill(); canvas.drawCircle(8f, 17.5f, 3.4f, paint)
                canvas.drawRect(9.6f, 4f, 11.6f, 17.5f, paint)
                poly(11.6f, 4f, 19f, 6.6f, 19f, 9.8f, 11.6f, 7.4f)
            }
            Icon.EQ -> {
                fill(); canvas.drawRoundRect(5f, 10f, 8f, 19f, 1f, 1f, paint)
                canvas.drawRoundRect(10.5f, 5f, 13.5f, 19f, 1f, 1f, paint)
                canvas.drawRoundRect(16f, 13f, 19f, 19f, 1f, 1f, paint)
            }
        }
        canvas.restore()
    }
    override fun setAlpha(alpha: Int) { paint.alpha = alpha; invalidateSelf() }
    override fun setColorFilter(colorFilter: ColorFilter?) { paint.colorFilter = colorFilter; invalidateSelf() }
    @Deprecated("Deprecated in Java")
    override fun getOpacity() = PixelFormat.TRANSLUCENT
}
