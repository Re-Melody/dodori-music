package com.musicmap.car

import android.os.Handler
import android.os.Looper
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.util.concurrent.Executors

data class AppleMusicPage(val tracks: List<Track>, val next: String?)
class AppleMusicFailure(val status: Int, message: String) : Exception(message)

/** All requests run off the UI thread. Credentials are only sent to Apple's fixed HTTPS origin. */
class AppleMusicRepository(private val app: MusicMapApplication) {
    val account = AppleMusicAccount(app)
    private val executor = Executors.newSingleThreadExecutor()
    private val main = Handler(Looper.getMainLooper())
    private var generation = 0
    private val knownTracks = linkedMapOf<String, Track>()
    val connected get() = account.userToken.isNotEmpty()
    /** Catalog search and previews need only the developer token; the library and full songs need an account. */
    val catalogReady get() = AppleMusicConfig.tokenProblem() == null
    private val storefront get() = account.storefront.ifEmpty { "kr" }

    fun connect(token: String, callback: (Result<Unit>) -> Unit) = request(callback, {
        val data = get("/v1/me/storefront", token).getJSONArray("data")
        data.getJSONObject(0).getString("id").also { require(it.matches(Regex("[a-z]{2}"))) }
    }, { store ->
        try { account.save(token, store) }
        catch (_: Exception) { throw AppleMusicFailure(0, "계정 정보를 안전하게 저장하지 못했어요. 기기를 잠금 해제한 뒤 다시 연결해 주세요.") }
        app.state.changed()
    })

    fun disconnect() {
        generation++; account.clear(); knownTracks.clear(); app.state.appleTracks = emptyList(); app.state.changed()
    }

    fun search(term: String, callback: (Result<AppleMusicPage>) -> Unit) {
        val query = term.trim().take(200)
        if (query.isEmpty()) { callback(Result.success(AppleMusicPage(emptyList(), null))); return }
        page("/v1/catalog/$storefront/search?types=songs&limit=25&term=${URLEncoder.encode(query, "UTF-8")}", true, callback)
    }
    fun library(callback: (Result<AppleMusicPage>) -> Unit) =
        if (!connected) callback(Result.failure(AppleMusicFailure(403, "보관함은 Apple Music 계정을 연결한 뒤 볼 수 있어요.")))
        else page("/v1/me/library/songs?include=catalog&limit=25", false, callback)
    fun more(path: String, callback: (Result<AppleMusicPage>) -> Unit) =
        page(path, path.substringBefore('?').endsWith("/search"), callback)
    fun find(id: String) = knownTracks[id]
    fun selectList(tracks: List<Track>) { app.state.appleTracks = tracks; app.state.changed() }

    private val songCache = mutableMapOf<String, List<Track>>()
    private val songLoading = mutableSetOf<String>()
    /** The place's songs: the ones chosen for it in advance, then the catalog's top results for its keyword. Null until loaded. */
    fun regionSongs(region: MusicRegion): List<Track>? = songCache["place:${region.id}"]
    fun loadRegionSongs(region: MusicRegion, onLoaded: () -> Unit) =
        loadSongs("place:${region.id}", region.songIds, region.keyword, 6, onLoaded) { it.copy(regionId = region.id, genre = Catalog.POPULAR) }
    /** A couple of catalog songs that suit the current weather. */
    fun weatherSongs(keyword: String): List<Track>? = songCache["weather:$keyword"]
    fun loadWeatherSongs(keyword: String, onLoaded: () -> Unit) =
        loadSongs("weather:$keyword", emptyList(), keyword, 2, onLoaded) { it.copy(regionId = Catalog.WEATHER_PICK, genre = Catalog.WEATHER) }

    /** Loads once per session and key; [onLoaded] runs on the main thread when new songs arrive. */
    private fun loadSongs(key: String, ids: List<String>, keyword: String, limit: Int, onLoaded: () -> Unit, label: (Track) -> Track) {
        if (!catalogReady || (ids.isEmpty() && keyword.isBlank()) || key in songCache || !songLoading.add(key)) return
        val expected = generation
        executor.execute {
            val result = runCatching {
                val chosen = if (ids.isEmpty()) emptyList() else runCatching {
                    require(ids.all { it.matches(Regex("[0-9]+")) })
                    parseTracks(get("/v1/catalog/$storefront/songs?ids=${ids.joinToString(",")}", "").optJSONArray("data") ?: JSONArray())
                }.getOrDefault(emptyList())
                val found = if (keyword.isBlank()) emptyList() else {
                    val root = get("/v1/catalog/$storefront/search?types=songs&limit=8&term=${URLEncoder.encode(keyword, "UTF-8")}", "")
                    parseTracks(root.optJSONObject("results")?.optJSONObject("songs")?.optJSONArray("data") ?: JSONArray())
                }
                (chosen + found).filter { it.previewUrl != null }.distinctBy { it.id }.take(limit).map(label)
            }
            main.post {
                songLoading.remove(key)
                val songs = result.getOrNull()?.takeIf { it.isNotEmpty() } ?: return@post
                if (expected != generation) return@post
                songCache[key] = songs
                onLoaded()
            }
        }
    }

    private fun page(path: String, search: Boolean, callback: (Result<AppleMusicPage>) -> Unit) {
        if (!search && !connected) { callback(Result.failure(AppleMusicFailure(403, "Apple Music에 먼저 연결해 주세요."))); return }
        request(callback, {
            val root = get(path)
            val resource = if (search) root.optJSONObject("results")?.optJSONObject("songs") ?: JSONObject() else root
            val tracks = parseTracks(resource.optJSONArray("data") ?: JSONArray())
            AppleMusicPage(tracks, resource.optString("next").takeIf { it.startsWith("/v1/") })
        }, { page -> page.tracks.forEach { knownTracks[it.id] = it }; page })
    }

    private fun <T, R> request(callback: (Result<R>) -> Unit, work: () -> T, finish: (T) -> R) {
        val expectedGeneration = generation
        executor.execute {
            val result = runCatching(work)
            main.post {
                if (expectedGeneration != generation) return@post
                callback(result.mapCatching(finish))
            }
        }
    }

    private fun get(path: String, token: String = account.userToken): JSONObject {
        AppleMusicConfig.tokenProblem()?.let { throw AppleMusicFailure(401, it) }
        require(path.startsWith("/v1/") && !path.contains('\\') && !path.contains('#'))
        val connection = URL("https://api.music.apple.com$path").openConnection() as HttpURLConnection
        try {
            connection.instanceFollowRedirects = false
            connection.connectTimeout = 15000; connection.readTimeout = 20000
            connection.setRequestProperty("Authorization", "Bearer ${AppleMusicConfig.developerToken}")
            if (token.isNotEmpty()) connection.setRequestProperty("Music-User-Token", token)
            connection.setRequestProperty("Accept", "application/json")
            when (val status = connection.responseCode) {
                in 200..299 -> return connection.inputStream.bufferedReader(Charsets.UTF_8).use { JSONObject(it.readText()) }
                401 -> throw AppleMusicFailure(status, "Apple Music 개발자 인증이 만료됐어요. 연결 설정을 갱신해 주세요.")
                403 -> throw AppleMusicFailure(status, "Apple Music 접근이 거부됐어요. 구독 상태를 확인하거나 다시 연결해 주세요.")
                429 -> throw AppleMusicFailure(status, "요청이 많아요. 잠시 후 다시 시도해 주세요.")
                else -> throw AppleMusicFailure(status, "Apple Music에 연결하지 못했어요. 잠시 후 다시 시도해 주세요.")
            }
        } finally { connection.disconnect() }
    }

    private fun parseTracks(items: JSONArray): List<Track> = buildList {
        for (i in 0 until items.length()) {
            val item = items.getJSONObject(i)
            val attributes = item.optJSONObject("attributes") ?: continue
            val catalog = item.optJSONObject("relationships")?.optJSONObject("catalog")?.optJSONArray("data")?.optJSONObject(0)
            val catalogId = if (item.optString("type") == "songs") item.optString("id") else
                catalog?.optString("id")?.takeIf { it.isNotBlank() } ?: attributes.optJSONObject("playParams")?.optString("catalogId")
            val playableId = catalogId?.takeIf { it.matches(Regex("[0-9]+")) }
            add(Track("apple:${item.getString("id")}", attributes.optString("name", "제목 없음"),
                attributes.optString("artistName", "아티스트 미상"), "apple-music", "Apple Music",
                if (playableId == null) "이 곡은 Apple Music 카탈로그에서 재생할 수 없어요" else attributes.optString("albumName", "Apple Music"),
                "", playableId, attributes.optInt("durationInMillis", 0),
                attributes.optJSONArray("previews")?.optJSONObject(0)?.optString("url")?.takeIf { it.startsWith("https://") },
                attributes.optJSONObject("artwork")?.optString("url")?.takeIf { it.startsWith("https://") }
                    ?.replace("{w}", "300")?.replace("{h}", "300")))
        }
    }
}
