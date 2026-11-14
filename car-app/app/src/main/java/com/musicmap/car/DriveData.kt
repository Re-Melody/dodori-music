package com.musicmap.car

import android.content.Context
import android.os.Handler
import android.os.Looper
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.util.Locale
import java.util.concurrent.Executors

/**
 * Lookups a drive needs from outside the car: the weather where the car is, and the road route to a destination.
 * Both are plain HTTPS requests to fixed hosts, off the main thread; callbacks arrive on the main thread.
 * A failed request returns null and the app carries on with what it has.
 */
class DriveData {
    private val executor = Executors.newSingleThreadExecutor()
    private val main = Handler(Looper.getMainLooper())

    /** Current weather from Open-Meteo. The position is rounded to about a kilometre before it is sent. */
    fun weather(point: GeoPoint, callback: (Weather?) -> Unit) = request(callback) {
        val url = String.format(Locale.US,
            "https://api.open-meteo.com/v1/forecast?latitude=%.2f&longitude=%.2f&current=weather_code,is_day", point.lat, point.lon)
        val current = getJson(url).getJSONObject("current")
        Weather(Weather.skyOf(current.getInt("weather_code")), current.optInt("is_day", 1) == 1)
    }

    /** Driving route from the public OSRM server, as a simplified line of points. */
    fun route(from: GeoPoint, to: GeoPoint, callback: (List<GeoPoint>?) -> Unit) = request(callback) {
        val url = String.format(Locale.US,
            "https://router.project-osrm.org/route/v1/driving/%.5f,%.5f;%.5f,%.5f?overview=simplified&geometries=geojson",
            from.lon, from.lat, to.lon, to.lat)
        val coordinates = getJson(url).getJSONArray("routes").getJSONObject(0).getJSONObject("geometry").getJSONArray("coordinates")
        val path = (0 until coordinates.length()).map { i ->
            val pair = coordinates.getJSONArray(i)
            GeoPoint(pair.getDouble(1), pair.getDouble(0))
        }
        require(path.size >= 2 && path.all { it.lat.isFinite() && it.lon.isFinite() })
        path
    }

    private fun <T> request(callback: (T?) -> Unit, work: () -> T) {
        executor.execute {
            val result = runCatching(work).getOrNull()
            main.post { callback(result) }
        }
    }
    private fun getJson(url: String): JSONObject {
        val connection = URL(url).openConnection() as HttpURLConnection
        try {
            connection.instanceFollowRedirects = false
            connection.connectTimeout = 8000; connection.readTimeout = 10000
            connection.setRequestProperty("User-Agent", "MusicMapCar/0.3 (Android contest prototype)")
            connection.setRequestProperty("Accept", "application/json")
            check(connection.responseCode == 200)
            return connection.inputStream.bufferedReader(Charsets.UTF_8).use { JSONObject(it.readText()) }
        } finally { connection.disconnect() }
    }
}

/** Songs the driver assigned to a segment. Kept on the device; an assigned song leads that segment's list. */
class SegmentOverrides(context: Context) {
    private val prefs = context.getSharedPreferences("segment-songs", Context.MODE_PRIVATE)
    private val cache = mutableMapOf<String, Track?>()

    fun get(segmentId: String): Track? = cache.getOrPut(segmentId) {
        runCatching {
            val json = JSONObject(prefs.getString(segmentId, null) ?: return@getOrPut null)
            Track(json.getString("id"), json.getString("title"), json.getString("artist"), segmentId, Catalog.MINE,
                json.optString("album"), "", json.optString("appleMusicId").takeIf { it.isNotEmpty() }, json.optInt("durationMs", 0),
                json.optString("previewUrl").takeIf { it.startsWith("https://") }, json.optString("artworkUrl").takeIf { it.startsWith("https://") })
        }.getOrNull()
    }
    fun set(segmentId: String, track: Track) {
        val json = JSONObject().put("id", track.id).put("title", track.title).put("artist", track.artist).put("album", track.reason)
            .put("appleMusicId", track.appleMusicId ?: "").put("durationMs", track.durationMs)
            .put("previewUrl", track.previewUrl ?: "").put("artworkUrl", track.artworkUrl ?: "")
        prefs.edit().putString(segmentId, json.toString()).apply()
        cache.remove(segmentId)
    }
    fun clear(segmentId: String) { prefs.edit().remove(segmentId).apply(); cache[segmentId] = null }
}
