package com.musicmap.car

import kotlin.math.*

data class GeoPoint(val lat: Double, val lon: Double)
/**
 * [spoken] and [intro] are read aloud when the car enters the region.
 * [keyword] finds the place's well-known songs in the streaming catalog.
 */
data class MusicRegion(val id: String, val name: String, val point: GeoPoint, val radiusKm: Double,
                       val spoken: String = name, val intro: String = "", val keyword: String = "")
data class Track(val id: String, val title: String, val artist: String, val regionId: String,
                 val genre: String, val reason: String, val asset: String,
                 val appleMusicId: String? = null, val durationMs: Int = 0,
                 val previewUrl: String? = null, val artworkUrl: String? = null)

object Catalog {
    const val CALM = "차분하게"
    const val LIVELY = "경쾌하게"
    const val POPULAR = "인기곡"
    private const val ARTIST = "길 위의 음악"
    val regions = listOf(
        MusicRegion("seoul", "서울 · 한강", GeoPoint(37.525, 126.938), 12.0, "서울 한강", "강변을 따라 달리기 좋은 곡을 골랐어요", "한강"),
        MusicRegion("suwon", "수원 · 화성", GeoPoint(37.286, 127.012), 8.0, "수원 화성", "성곽길에 어울리는 곡으로 이어갈게요", "수원"),
        MusicRegion("yongin", "용인 · 호수", GeoPoint(37.241, 127.177), 10.0, "용인 호수", "호숫가 풍경에 맞는 곡을 틀어 드릴게요", "호수")
    )
    val tracks = listOf(
        Track("river", "강변의 오후", ARTIST, "seoul", CALM, "한강을 따라 달릴 때", "river.wav"),
        Track("city", "도시의 불빛", ARTIST, "seoul", LIVELY, "도심의 불빛 사이를 지날 때", "city.wav"),
        Track("walls", "성곽을 따라서", ARTIST, "suwon", CALM, "화성 성곽을 끼고 달릴 때", "walls.wav"),
        Track("road", "새로운 길", ARTIST, "suwon", LIVELY, "수원으로 들어서는 길에", "road.wav"),
        Track("lake", "호수의 바람", ARTIST, "yongin", CALM, "호숫가를 지날 때", "lake.wav"),
        Track("forest", "숲으로 가는 길", ARTIST, "yongin", LIVELY, "숲길로 접어들 때", "forest.wav")
    )
    /** [mood] comes from the car (wipers, driving mode). It reorders the list; it never hides tracks. */
    fun recommend(regionId: String?, genre: String = "전체", mood: String? = null): List<Track> =
        tracks.filter { it.regionId == regionId && (genre == "전체" || it.genre == genre) }
            .sortedByDescending { mood != null && it.genre == mood }
    fun distanceKm(a: GeoPoint, b: GeoPoint): Double {
        val lat = Math.toRadians(b.lat - a.lat); val lon = Math.toRadians(b.lon - a.lon)
        val h = sin(lat / 2).pow(2) + cos(Math.toRadians(a.lat)) * cos(Math.toRadians(b.lat)) * sin(lon / 2).pow(2)
        return 6371.0 * 2 * asin(sqrt(h.coerceIn(0.0, 1.0)))
    }
    // Keep an existing region until 1 km outside its boundary to avoid GPS boundary flapping.
    fun detect(point: GeoPoint, previousId: String?): MusicRegion? {
        regions.find { it.id == previousId }?.let {
            if (distanceKm(point, it.point) <= it.radiusKm + 1.0) return it
        }
        return regions.filter { distanceKm(point, it.point) <= it.radiusKm }
            .minByOrNull { distanceKm(point, it.point) }
    }
    fun routePoint(progress: Double): GeoPoint {
        val p = progress.coerceIn(0.0, 1.0) * (regions.size - 1)
        val i = floor(p).toInt().coerceAtMost(regions.size - 2)
        val t = p - i; val a = regions[i].point; val b = regions[i + 1].point
        return GeoPoint(a.lat + (b.lat - a.lat) * t, a.lon + (b.lon - a.lon) * t)
    }
    // Retain the playing track; only replace upcoming recommendations.
    fun queueFor(current: Track?, recommendations: List<Track>): List<Track> =
        if (current == null) recommendations else listOf(current) + recommendations.filter { it.id != current.id }
}

enum class DriveMode { NORMAL, ECO, SPORT }

/** What the car reports about the drive, turned into a listening mood. */
data class DriveContext(val rain: Boolean = false, val mode: DriveMode = DriveMode.NORMAL) {
    val mood: String? get() = when {
        rain -> Catalog.CALM
        mode == DriveMode.SPORT -> Catalog.LIVELY
        mode == DriveMode.ECO -> Catalog.CALM
        else -> null
    }
    /** Shown on screen. */
    val line: String get() = when {
        rain -> "비 오는 길 · 차분한 곡부터"
        mode == DriveMode.SPORT -> "스포츠 모드 · 경쾌한 곡부터"
        mode == DriveMode.ECO -> "에코 모드 · 차분한 곡부터"
        else -> ""
    }
    /** Read aloud when the context changes; null when there is nothing worth saying. */
    val spoken: String? get() = when {
        rain -> "비가 오네요. 차분한 곡부터 이어갈게요"
        mode == DriveMode.SPORT -> "스포츠 모드네요. 경쾌한 곡부터 틀게요"
        mode == DriveMode.ECO -> "에코 모드네요. 차분한 곡부터 이어갈게요"
        else -> null
    }
}
