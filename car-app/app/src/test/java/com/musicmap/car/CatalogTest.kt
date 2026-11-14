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
    @Test fun hysteresisKeepsThePreviousRegionNearItsBoundary() {
        val region = Catalog.regions.first()
        val justOutside = GeoPoint(region.point.lat + (region.radiusKm + .4) / 111.195, region.point.lon)
        assertEquals(region.id, Catalog.detect(justOutside, region.id)?.id)
        assertNull(Catalog.detect(justOutside, null))
    }
}
