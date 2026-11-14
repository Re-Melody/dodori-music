package com.musicmap.car

import android.content.Context
import android.graphics.*
import android.net.http.HttpResponseCache
import android.view.View
import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Executors
import kotlin.math.*

/**
 * Native slippy map and the screen's one rich element. The map runs under the floating panels,
 * so [insetLeft] and [insetBottom] describe the covered area and the car is centered in what is left.
 */
class MusicMapView(context: Context) : View(context) {
    var point: GeoPoint? = null
    var regionId: String? = null
    var zoom = 10
    /** Display scale shared with the activity so labels follow the type scale. */
    var scale = 1f
    var insetLeft = 0
    var insetBottom = 0
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    // A 2560x1440 car display shows about 80 tiles at once; a smaller cache evicts visible tiles and reloads them forever.
    private val tiles = object : android.util.LruCache<String, Bitmap>(192) {}
    private val pending = mutableSetOf<String>()
    private val failed = mutableMapOf<String, Long>()
    private val workers = Executors.newFixedThreadPool(2)
    private var closed = false
    private var tileError = false
    private val d get() = resources.displayMetrics.density * scale
    private val bold = Typeface.create(Typeface.DEFAULT, 500, false)
    /** Inverted luminance: light OSM tiles become a dark, achromatic base map. */
    private val darkTiles = ColorMatrixColorFilter(floatArrayOf(
        -.115f, -.225f, -.044f, 0f, 118f,
        -.115f, -.225f, -.044f, 0f, 121f,
        -.115f, -.225f, -.044f, 0f, 124f,
        0f, 0f, 0f, 1f, 0f))
    private val route = Path()
    private var laneDash: DashPathEffect? = null
    private var laneDashFor = 0f

    init {
        contentDescription = "현재 위치와 지역별 음악을 보여주는 지도"
        if (HttpResponseCache.getInstalled() == null) {
            runCatching { HttpResponseCache.install(File(context.cacheDir, "map-http"), 32L * 1024 * 1024) }
        }
    }
    private fun world(p: GeoPoint, z: Int): Pair<Double, Double> {
        val size = 256.0 * (1 shl z)
        val latitude = p.lat.coerceIn(-85.0, 85.0)
        val sinLat = sin(Math.toRadians(latitude))
        return Pair((p.lon + 180) / 360 * size, (0.5 - ln((1 + sinLat) / (1 - sinLat)) / (4 * PI)) * size)
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Ui.BASE)
        val center = world(point ?: GeoPoint(37.38, 127.04), zoom)
        val tileSize = 256.0
        val focusX = insetLeft + (width - insetLeft) / 2.0
        val focusY = (height - insetBottom) / 2.0
        val left = center.first - focusX; val top = center.second - focusY
        val maxTile = 1 shl zoom
        for (tx in floor(left / tileSize).toInt()..floor((left + width) / tileSize).toInt()) {
            for (ty in floor(top / tileSize).toInt()..floor((top + height) / tileSize).toInt()) {
                if (ty !in 0 until maxTile) continue
                val wrappedX = ((tx % maxTile) + maxTile) % maxTile
                val key = "$zoom/$wrappedX/$ty"
                val x = (tx * tileSize - left).toFloat(); val y = (ty * tileSize - top).toFloat()
                val bitmap = tiles.get(key)
                if (bitmap != null) canvas.drawBitmap(bitmap, x, y, null)
                else requestTile(key)
            }
        }
        fun screen(p: GeoPoint): PointF {
            val w = world(p, zoom)
            return PointF((w.first - left).toFloat(), (w.second - top).toFloat())
        }
        // Signature: the route is drawn as a lane marking.
        route.reset()
        Catalog.regions.forEachIndexed { i, region ->
            val p = screen(region.point)
            if (i == 0) route.moveTo(p.x, p.y) else route.lineTo(p.x, p.y)
        }
        paint.style = Paint.Style.STROKE; paint.strokeCap = Paint.Cap.BUTT
        paint.color = Ui.BASE; paint.strokeWidth = 7 * d; canvas.drawPath(route, paint)
        paint.color = Ui.ACCENT; paint.strokeWidth = 3 * d
        if (laneDash == null || laneDashFor != d) { laneDash = DashPathEffect(floatArrayOf(12 * d, 8 * d), 0f); laneDashFor = d }
        paint.pathEffect = laneDash; canvas.drawPath(route, paint)
        paint.pathEffect = null; paint.style = Paint.Style.FILL
        Catalog.regions.forEach { region ->
            val p = screen(region.point)
            val active = region.id == regionId
            val tint = Ui.placeTint(region.id)
            if (active) { paint.color = Color.argb(56, Color.red(tint), Color.green(tint), Color.blue(tint)); canvas.drawCircle(p.x, p.y, 28 * d, paint) }
            paint.color = Ui.BASE; canvas.drawCircle(p.x, p.y, 10 * d, paint)
            paint.color = tint; canvas.drawCircle(p.x, p.y, 7 * d, paint)
            paint.textSize = (if (active) 15 else 13) * d; paint.typeface = bold
            val label = region.name
            val tw = paint.measureText(label); val lx = p.x + 14 * d; val ly = p.y - 16 * d
            paint.color = 0xE60E1011.toInt()
            canvas.drawRoundRect(lx - 8 * d, ly - 17 * d, lx + tw + 8 * d, ly + 8 * d, 6 * d, 6 * d, paint)
            paint.color = if (active) Ui.TEXT else Ui.TEXT_SOFT
            canvas.drawText(label, lx, ly, paint)
        }
        point?.let {
            val p = screen(it)
            paint.color = Ui.BASE; canvas.drawCircle(p.x, p.y, 13 * d, paint)
            paint.color = Ui.TEXT; canvas.drawCircle(p.x, p.y, 10 * d, paint)
            paint.color = Ui.ACCENT; canvas.drawCircle(p.x, p.y, 6 * d, paint)
        }
        paint.typeface = Typeface.DEFAULT; paint.textSize = 11 * d; paint.textAlign = Paint.Align.RIGHT
        val note = if (tileError) "지도를 불러오는 중이에요 · © OpenStreetMap contributors" else "© OpenStreetMap contributors"
        val tw = paint.measureText(note); val ax = width - 16 * d; val ay = height - insetBottom - 12 * d
        paint.color = 0xB30E1011.toInt()
        canvas.drawRoundRect(ax - tw - 6 * d, ay - 13 * d, ax + 6 * d, ay + 5 * d, 4 * d, 4 * d, paint)
        paint.color = Ui.TEXT_MUTED; canvas.drawText(note, ax, ay, paint)
        paint.textAlign = Paint.Align.LEFT
    }
    private fun requestTile(key: String) {
        if (closed || key in pending || (failed[key] ?: 0L) > System.currentTimeMillis()) return
        pending.add(key)
        workers.execute {
            var bitmap: Bitmap? = null
            try {
                val connection = URL("https://tile.openstreetmap.org/$key.png").openConnection() as HttpURLConnection
                try {
                    connection.setRequestProperty("User-Agent", "MusicMapCar/0.2 (Android contest prototype)")
                    connection.connectTimeout = 7000; connection.readTimeout = 7000; connection.useCaches = true
                    if (connection.responseCode == 200) connection.inputStream.use { bitmap = BitmapFactory.decodeStream(it)?.let(::darken) }
                } finally { connection.disconnect() }
            } catch (_: Exception) { /* Offline map still displays location and catalog pins. */ }
            post {
                pending.remove(key)
                if (!closed) {
                    if (bitmap != null) { tiles.put(key, bitmap); tileError = false }
                    else { failed[key] = System.currentTimeMillis() + 60_000; tileError = true }
                    invalidate()
                }
            }
        }
    }
    /** Recolor once on the worker thread so drawing stays a plain bitmap copy. */
    private fun darken(source: Bitmap): Bitmap {
        val result = Bitmap.createBitmap(256, 256, Bitmap.Config.RGB_565)
        Canvas(result).drawBitmap(source, null, Rect(0, 0, 256, 256), Paint(Paint.FILTER_BITMAP_FLAG).apply { colorFilter = darkTiles })
        source.recycle()
        return result
    }
    fun close() { closed = true; workers.shutdownNow(); tiles.evictAll() }
}
