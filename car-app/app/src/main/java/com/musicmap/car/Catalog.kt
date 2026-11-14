package com.musicmap.car

import kotlin.math.*

data class GeoPoint(val lat: Double, val lon: Double)
enum class SegmentKind { ROAD, LANDMARK }

/**
 * One mapped stretch of a drive: a road, or a landmark and the area around it.
 * [spoken] and [intro] are read aloud when the car enters it.
 * [songIds] are catalog songs chosen for the place in advance; [keyword] finds more of its well-known songs.
 */
data class MusicRegion(val id: String, val name: String, val point: GeoPoint, val radiusKm: Double,
                       val spoken: String = name, val intro: String = "", val keyword: String = "",
                       val kind: SegmentKind = SegmentKind.LANDMARK, val songIds: List<String> = emptyList()) {
    /** How far outside its edge the car may drift before the segment is considered left. */
    val slackKm: Double get() = minOf(1.0, radiusKm * .25)
}
data class Track(val id: String, val title: String, val artist: String, val regionId: String,
                 val genre: String, val reason: String, val asset: String,
                 val appleMusicId: String? = null, val durationMs: Int = 0,
                 val previewUrl: String? = null, val artworkUrl: String? = null)

object Catalog {
    const val CALM = "차분하게"
    const val LIVELY = "경쾌하게"
    const val POPULAR = "인기곡"
    const val WEATHER = "오늘 날씨"
    const val MINE = "내가 지정한 곡"
    /** Region id of songs suggested for the weather rather than for a place. */
    const val WEATHER_PICK = "weather"
    private const val ARTIST = "MoveMe"
    val regions = listOf(
        MusicRegion("seoul", "서울 · 한강", GeoPoint(37.525, 126.938), 12.0, "서울 한강", "강변을 따라 달리기 좋은 곡을 골랐어요", "한강", songIds = listOf("1610730837")),
        MusicRegion("suwon", "수원 · 화성", GeoPoint(37.286, 127.012), 8.0, "수원 화성", "성곽길에 어울리는 곡으로 이어갈게요", "수원", songIds = listOf("1477149763")),
        MusicRegion("yongin", "용인 · 호수", GeoPoint(37.241, 127.177), 10.0, "용인 호수", "호숫가 풍경에 맞는 곡을 틀어 드릴게요", "호수", songIds = listOf("1735701751"))
    )
    /**
     * Roads with a song of their own. Coordinates are from OpenStreetMap; song ids are Apple Music (KR) catalog ids,
     * looked up once when this table was written. Nothing here is generated at run time.
     * Roads have no search keyword: a road plays only the songs chosen for it, never loosely related search results.
     */
    val roads = listOf(
        MusicRegion("gangnam", "강남대로", GeoPoint(37.4979, 127.0276), 1.5, "강남대로", "강남 하면 떠오르는 그 곡이에요",
            "", SegmentKind.ROAD, listOf("1339074799")),
        MusicRegion("jisung", "동탄지성로", GeoPoint(37.2252, 127.0486), 1.2, "동탄지성로", "박지성 선수의 응원가를 틀게요",
            "", SegmentKind.ROAD, listOf("1522374158", "1705661056"))
    )
    /** Every mapped segment: landmarks first, then roads. */
    val segments: List<MusicRegion> get() = regions + roads
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
    /**
     * The segment the car is in. A road inside a landmark's area wins over the landmark; otherwise the
     * previous segment is kept a little past its edge so GPS jitter at a boundary does not flip the music.
     */
    fun detect(point: GeoPoint, previousId: String?): MusicRegion? {
        val inside = segments.filter { distanceKm(point, it.point) <= it.radiusKm }
        val best = inside.minWithOrNull(compareBy<MusicRegion>({ if (it.kind == SegmentKind.ROAD) 0 else 1 }, { distanceKm(point, it.point) }))
        val previous = segments.find { it.id == previousId }
        if (previous != null && distanceKm(point, previous.point) <= previous.radiusKm + previous.slackKm) {
            val moreSpecific = best != null && best.kind == SegmentKind.ROAD && previous.kind != SegmentKind.ROAD
            if (!moreSpecific) return previous
        }
        return best
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
enum class Sky { CLEAR, CLOUDY, FOG, RAIN, SNOW }

/** Current weather where the car is, from a weather service queried with the car's position. */
data class Weather(val sky: Sky, val isDay: Boolean = true) {
    companion object {
        /** WMO weather interpretation codes, as returned by the weather service. */
        fun skyOf(code: Int): Sky = when (code) {
            0, 1 -> Sky.CLEAR
            2, 3 -> Sky.CLOUDY
            45, 48 -> Sky.FOG
            in 51..67, in 80..82, in 95..99 -> Sky.RAIN
            in 71..77, 85, 86 -> Sky.SNOW
            else -> Sky.CLOUDY
        }
    }
}

/**
 * What the drive is like right now: the weather at the car's position, the wipers and the driving mode.
 * It becomes a listening mood. Wipers count as rain even when the forecast disagrees.
 */
data class DriveContext(val rain: Boolean = false, val mode: DriveMode = DriveMode.NORMAL, val weather: Weather? = null) {
    private val raining get() = rain || weather?.sky == Sky.RAIN
    private val sky get() = if (raining) Sky.RAIN else weather?.sky
    val mood: String? get() = when {
        sky == Sky.RAIN || sky == Sky.SNOW || sky == Sky.FOG -> Catalog.CALM
        mode == DriveMode.SPORT -> Catalog.LIVELY
        mode == DriveMode.ECO -> Catalog.CALM
        sky == Sky.CLEAR -> if (weather?.isDay != false) Catalog.LIVELY else Catalog.CALM
        else -> null
    }
    /** Shown on screen. */
    val line: String get() = when {
        sky == Sky.RAIN -> "비 오는 길 · 차분한 곡부터"
        sky == Sky.SNOW -> "눈 오는 길 · 차분한 곡부터"
        sky == Sky.FOG -> "안개 낀 길 · 차분한 곡부터"
        mode == DriveMode.SPORT -> "스포츠 모드 · 경쾌한 곡부터"
        mode == DriveMode.ECO -> "에코 모드 · 차분한 곡부터"
        sky == Sky.CLEAR -> if (weather?.isDay != false) "맑은 날 · 경쾌한 곡부터" else "맑은 밤 · 차분한 곡부터"
        else -> ""
    }
    /** Read aloud when the context changes; null when there is nothing worth saying. */
    val spoken: String? get() = when {
        sky == Sky.RAIN -> "비가 오네요. 차분한 곡부터 이어갈게요"
        sky == Sky.SNOW -> "눈이 오네요. 차분한 곡부터 이어갈게요"
        sky == Sky.FOG -> "안개가 꼈네요. 차분한 곡부터 이어갈게요"
        mode == DriveMode.SPORT -> "스포츠 모드네요. 경쾌한 곡부터 틀게요"
        mode == DriveMode.ECO -> "에코 모드네요. 차분한 곡부터 이어갈게요"
        sky == Sky.CLEAR -> if (weather?.isDay != false) "날이 맑네요. 경쾌한 곡부터 틀게요" else "맑은 밤이에요. 차분한 곡부터 이어갈게요"
        else -> null
    }
    /** Search words for catalog songs that suit the weather; a fixed table, not generated. */
    val songKeyword: String? get() = when {
        sky == Sky.RAIN -> "비 오는 날"
        sky == Sky.SNOW -> "눈 오는 날"
        sky == Sky.CLEAR -> if (weather?.isDay != false) "드라이브" else "밤 드라이브"
        else -> null
    }
}
