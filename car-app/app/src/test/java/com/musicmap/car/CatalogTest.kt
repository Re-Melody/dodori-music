package com.musicmap.car

import org.junit.Assert.*
import org.junit.Test

class CatalogTest {
    @Test fun regionCentersResolveThroughTheRoute() {
        var previous: String? = null
        Catalog.regions.forEach {
            previous = Catalog.detect(it.point, previous)?.id
            assertEquals(it.id, previous)
        }
    }
    @Test fun unsupportedLocationsDoNotInventRecommendations() {
        assertNull(Catalog.detect(GeoPoint(35.18, 129.07), "seoul"))
        assertTrue(Catalog.recommend(null).isEmpty())
    }
    @Test fun regionChangePreservesCurrentTrackAndReplacesUpcomingTracks() {
        val playing = Catalog.tracks.first()
        val upcoming = Catalog.recommend("suwon")
        val result = Catalog.queueFor(playing, upcoming)
        assertEquals(playing, result.first())
        assertEquals(upcoming, result.drop(1))
        assertEquals(result.size, result.distinctBy { it.id }.size)
    }
    @Test fun sameRegionDoesNotDuplicateCurrentTrack() {
        val tracks = Catalog.recommend("seoul")
        assertEquals(tracks.size, Catalog.queueFor(tracks.first(), tracks).size)
    }
    @Test fun genreFiltersAndRouteEndpointsAreConsistent() {
        assertTrue(Catalog.recommend("seoul", "차분하게").all { it.genre == "차분하게" })
        assertEquals(Catalog.regions.first().point, Catalog.routePoint(0.0))
        assertEquals(Catalog.regions.last().point, Catalog.routePoint(1.0))
        assertEquals(Catalog.regions.last().point, Catalog.routePoint(2.0))
    }
    @Test fun driveMoodReordersWithoutHidingTracks() {
        val plain = Catalog.recommend("suwon")
        val rainy = Catalog.recommend("suwon", mood = DriveContext(rain = true).mood)
        val sporty = Catalog.recommend("suwon", mood = DriveContext(mode = DriveMode.SPORT).mood)
        assertEquals(plain.toSet(), rainy.toSet())
        assertEquals(Catalog.CALM, rainy.first().genre)
        assertEquals(Catalog.LIVELY, sporty.first().genre)
        assertNull(DriveContext().mood)
        assertEquals(Catalog.CALM, DriveContext(rain = true, mode = DriveMode.SPORT).mood)
    }
    @Test fun aRoadInsideALandmarkAreaWinsOverTheLandmark() {
        val road = Catalog.roads.first { it.id == "gangnam" }
        assertEquals("gangnam", Catalog.detect(road.point, null)?.id)
        // Driving out of the Han river area onto the road switches even within the river's slack.
        assertEquals("gangnam", Catalog.detect(road.point, "seoul")?.id)
        // Once on the road, jitter just past its edge keeps the road.
        val justOutside = GeoPoint(road.point.lat + (road.radiusKm + road.slackKm * .5) / 111.195, road.point.lon)
        assertEquals("gangnam", Catalog.detect(justOutside, "gangnam")?.id)
    }
    @Test fun roadsDoNotDisturbTheLandmarkCenters() {
        Catalog.regions.forEach { region ->
            assertEquals(region.id, Catalog.detect(region.point, null)?.id)
        }
        assertEquals(Catalog.segments.size, Catalog.segments.distinctBy { it.id }.size)
    }
    @Test fun aPathIsCutIntoTheSegmentsItPassesInDrivingOrder() {
        val seoul = Catalog.regions.first { it.id == "seoul" }
        val suwon = Catalog.regions.first { it.id == "suwon" }
        val gangnam = Catalog.roads.first { it.id == "gangnam" }
        val path = listOf(seoul.point, gangnam.point, suwon.point)
        assertEquals(listOf("seoul", "gangnam", "suwon"), Route.plan(path, Catalog.segments).map { it.id })
        // The Gangnam road lies inside the Han river area, so coming back the area is entered first.
        assertEquals(listOf("suwon", "seoul", "gangnam"), Route.plan(path.reversed(), Catalog.segments).map { it.id })
        // A straight line from the river to Suwon does not pass the Gangnam road.
        assertEquals(listOf("seoul", "suwon"), Route.plan(listOf(seoul.point, suwon.point), Catalog.segments).map { it.id })
    }
    @Test fun routeGeometryIsConsistent() {
        val a = GeoPoint(37.0, 127.0); val b = GeoPoint(37.0, 127.1); val c = GeoPoint(37.1, 127.1)
        val path = listOf(a, b, c)
        assertEquals(a, Route.pointAt(path, 0.0))
        assertEquals(c, Route.pointAt(path, 1.0))
        assertEquals(c, Route.pointAt(path, 3.0))
        assertEquals(Catalog.distanceKm(a, b) + Catalog.distanceKm(b, c), Route.lengthKm(path), 1e-9)
        assertEquals(0.0, Route.distanceToPathKm(b, path), 0.01)
        // 0.01 degrees of latitude is about 1.1 km north of the first leg.
        assertEquals(1.11, Route.distanceToPathKm(GeoPoint(37.01, 127.05), path), 0.05)
        assertNull(Route.entryProgress(path, MusicRegion("far", "far", GeoPoint(35.0, 129.0), 5.0)))
        assertEquals(0.0, Route.entryProgress(path, MusicRegion("start", "start", a, 1.0))!!, 1e-9)
    }
    @Test fun weatherAtThePositionSetsTheMood() {
        assertEquals(Sky.RAIN, Weather.skyOf(61)); assertEquals(Sky.SNOW, Weather.skyOf(73))
        assertEquals(Sky.CLEAR, Weather.skyOf(0)); assertEquals(Sky.FOG, Weather.skyOf(45)); assertEquals(Sky.CLOUDY, Weather.skyOf(3))
        assertEquals(Catalog.CALM, DriveContext(weather = Weather(Sky.RAIN)).mood)
        assertEquals(Catalog.CALM, DriveContext(weather = Weather(Sky.SNOW)).mood)
        assertEquals(Catalog.LIVELY, DriveContext(weather = Weather(Sky.CLEAR, isDay = true)).mood)
        assertEquals(Catalog.CALM, DriveContext(weather = Weather(Sky.CLEAR, isDay = false)).mood)
        assertNull(DriveContext(weather = Weather(Sky.CLOUDY)).mood)
        // Wipers mean rain whatever the forecast says, and rain outranks sport mode.
        assertEquals(Catalog.CALM, DriveContext(rain = true, mode = DriveMode.SPORT, weather = Weather(Sky.CLEAR)).mood)
        assertEquals("비 오는 날", DriveContext(rain = true, weather = Weather(Sky.CLEAR)).songKeyword)
        assertNull(DriveContext(weather = Weather(Sky.CLOUDY)).songKeyword)
        assertTrue(DriveContext(weather = Weather(Sky.SNOW)).line.isNotBlank())
        // Every kind of weather that names a pick set also has songs chosen for it, and nothing else does.
        listOf(Sky.RAIN, Sky.SNOW, Sky.FOG, Sky.CLEAR, Sky.CLOUDY).forEach { sky ->
            val context = DriveContext(weather = Weather(sky))
            assertEquals(context.songKeyword != null, context.weatherSongIds.isNotEmpty())
        }
        assertTrue(Catalog.segments.all { it.keyword.isEmpty() && it.songIds.isNotEmpty() })
    }
    @Test fun hysteresisKeepsThePreviousRegionNearItsBoundary() {
        val region = Catalog.regions.first()
        val justOutside = GeoPoint(region.point.lat + (region.radiusKm + .4) / 111.195, region.point.lon)
        assertEquals(region.id, Catalog.detect(justOutside, region.id)?.id)
        assertNull(Catalog.detect(justOutside, null))
    }
}
