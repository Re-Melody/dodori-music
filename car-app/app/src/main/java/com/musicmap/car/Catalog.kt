package com.musicmap.car

import kotlin.math.*

data class GeoPoint(val lat: Double, val lon: Double)
data class MusicRegion(val id: String, val name: String, val point: GeoPoint, val radiusKm: Double)
data class Track(val id: String, val title: String, val artist: String, val regionId: String,
                 val genre: String, val reason: String, val asset: String)

object Catalog {
    val regions = listOf(
        MusicRegion("seoul", "서울 · 한강", GeoPoint(37.525, 126.938), 12.0),
        MusicRegion("suwon", "수원 · 화성", GeoPoint(37.286, 127.012), 8.0),
        MusicRegion("yongin", "용인 · 호수", GeoPoint(37.241, 127.177), 10.0)
    )
    val tracks = listOf(
        Track("river", "강변의 오후", "Music Map Demo", "seoul", "차분하게", "한강을 따라 달리는 장면을 위해 만든 시연곡", "river.wav"),
        Track("city", "도시의 불빛", "Music Map Demo", "seoul", "경쾌하게", "서울의 도시 풍경을 표현한 시연곡", "city.wav"),
        Track("walls", "성곽을 따라서", "Music Map Demo", "suwon", "차분하게", "수원 화성의 산책길을 표현한 시연곡", "walls.wav"),
        Track("road", "새로운 길", "Music Map Demo", "suwon", "경쾌하게", "수원으로 이어지는 이동을 표현한 시연곡", "road.wav"),
        Track("lake", "호수의 바람", "Music Map Demo", "yongin", "차분하게", "용인의 호수 풍경을 표현한 시연곡", "lake.wav"),
        Track("forest", "숲으로 가는 길", "Music Map Demo", "yongin", "경쾌하게", "용인의 녹지와 어울리는 이동 시연곡", "forest.wav")
    )
    fun recommend(regionId: String?, genre: String = "전체"): List<Track> =
        tracks.filter { it.regionId == regionId && (genre == "전체" || it.genre == genre) }
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
