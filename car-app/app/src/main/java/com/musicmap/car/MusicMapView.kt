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

/** Native slippy-map rendering; no WebView or browser playback dependencies. */
class MusicMapView(context: Context) : View(context) {
    var point: GeoPoint? = null
    var regionId: String? = null
    var zoom = 10
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val tiles = object : android.util.LruCache<String, Bitmap>(48) {}
    private val pending = mutableSetOf<String>()
    private val failed = mutableMapOf<String, Long>()
    private val workers = Executors.newFixedThreadPool(2)
    private var closed = false
    private var tileError = false
    private val d = resources.displayMetrics.density
    init {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
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
        canvas.drawColor(Color.rgb(224, 232, 218))
        val center = world(point ?: GeoPoint(37.38, 127.04), zoom)
        val tileSize = 256.0
        val left = center.first - width / 2.0; val top = center.second - height / 2.0
        val maxTile = 1 shl zoom
        for (tx in floor(left / tileSize).toInt()..floor((left + width) / tileSize).toInt()) {
            for (ty in floor(top / tileSize).toInt()..floor((top + height) / tileSize).toInt()) {
                if (ty !in 0 until maxTile) continue
                val wrappedX = ((tx % maxTile) + maxTile) % maxTile
                val key = "$zoom/$wrappedX/$ty"
                val x = (tx * tileSize - left).toFloat(); val y = (ty * tileSize - top).toFloat()
                val bitmap = tiles.get(key)
                if (bitmap != null) {
                    paint.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(.45f) })
                    canvas.drawBitmap(bitmap, null, RectF(x, y, x + 256, y + 256), paint)
                    paint.colorFilter = null
                } else {
                    paint.color = Color.rgb(204, 216, 199); paint.style = Paint.Style.STROKE
                    canvas.drawRect(x, y, x + 256, y + 256, paint); paint.style = Paint.Style.FILL
                    requestTile(key)
                }
            }
        }
        fun screen(p: GeoPoint): PointF {
            val w = world(p, zoom)
            return PointF((w.first - left).toFloat(), (w.second - top).toFloat())
        }
        val path = Path()
        Catalog.regions.forEachIndexed { i, region ->
            val p = screen(region.point)
            if (i == 0) path.moveTo(p.x, p.y) else path.lineTo(p.x, p.y)
        }
        paint.color = Color.rgb(37, 104, 79); paint.strokeWidth = 3 * d; paint.style = Paint.Style.STROKE
        paint.pathEffect = DashPathEffect(floatArrayOf(8 * d, 6 * d), 0f); canvas.drawPath(path, paint)
        paint.pathEffect = null; paint.style = Paint.Style.FILL
        Catalog.regions.forEach { region ->
            val p = screen(region.point)
            paint.color = if (region.id == regionId) Color.rgb(37, 104, 79) else Color.rgb(80, 112, 95)
            canvas.drawCircle(p.x, p.y, 7 * d, paint)
            paint.textSize = 13 * d; paint.typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            paint.setShadowLayer(3 * d, 0f, 1f, Color.WHITE)
            canvas.drawText(region.name, p.x + 12 * d, p.y - 10 * d, paint); paint.clearShadowLayer()
        }
        point?.let {
            val p = screen(it)
            paint.color = 0x44A9E9C7; canvas.drawCircle(p.x, p.y, 24 * d, paint)
            paint.color = Color.WHITE; canvas.drawCircle(p.x, p.y, 11 * d, paint)
            paint.color = Color.rgb(41, 153, 132); canvas.drawCircle(p.x, p.y, 7 * d, paint)
        }
        paint.color = 0xE6F7F8F3.toInt(); canvas.drawRect(0f, height - 43 * d, width.toFloat(), height.toFloat(), paint)
        paint.color = Color.rgb(80, 103, 91); paint.textSize = 10 * d
        canvas.drawText("© OpenStreetMap contributors · 점선: 시연 경로", 12 * d, height - 22 * d, paint)
        canvas.drawText(if (tileError) "지도 연결 대기 · 위치와 시연 경로는 계속 표시됩니다" else "음악 지역 3곳 · 시연 카탈로그", 12 * d, height - 7 * d, paint)
    }
    private fun requestTile(key: String) {
        if (closed || key in pending || (failed[key] ?: 0L) > System.currentTimeMillis()) return
        pending.add(key)
        workers.execute {
            var bitmap: Bitmap? = null
            try {
                val connection = URL("https://tile.openstreetmap.org/$key.png").openConnection() as HttpURLConnection
                try {
                    connection.setRequestProperty("User-Agent", "MusicMapCar/0.1 (Android contest prototype)")
                    connection.connectTimeout = 7000; connection.readTimeout = 7000; connection.useCaches = true
                    if (connection.responseCode == 200) connection.inputStream.use { bitmap = BitmapFactory.decodeStream(it) }
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
    fun close() { closed = true; workers.shutdownNow(); tiles.evictAll() }
}
