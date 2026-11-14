package com.musicmap.car

import kotlin.math.*

/** A drive from where the car is to a destination, and the mapped segments it passes in order. */
data class DrivePlan(val destination: MusicRegion, val path: List<GeoPoint>, val segments: List<MusicRegion>)

/**
 * Pure route geometry. The mapping of places to songs is a fixed table (see [Catalog]); at run time
 * the app only works out which mapped segments a path passes, and in what order.
 */
object Route {
    private const val SAMPLES = 400

    fun lengthKm(path: List<GeoPoint>): Double = path.zipWithNext { a, b -> Catalog.distanceKm(a, b) }.sum()

    /** Point at [progress] (0..1) of the path's length. */
    fun pointAt(path: List<GeoPoint>, progress: Double): GeoPoint {
        if (path.isEmpty()) return GeoPoint(0.0, 0.0)
        if (path.size == 1) return path[0]
        val total = lengthKm(path)
        if (total <= 0.0) return path[0]
        var remaining = progress.coerceIn(0.0, 1.0) * total
        for ((a, b) in path.zipWithNext()) {
            val leg = Catalog.distanceKm(a, b)
            if (remaining <= leg) {
                val t = if (leg <= 0.0) 0.0 else remaining / leg
                return GeoPoint(a.lat + (b.lat - a.lat) * t, a.lon + (b.lon - a.lon) * t)
            }
            remaining -= leg
        }
        return path.last()
    }

    /** Shortest distance from [point] to the path, in km. */
    fun distanceToPathKm(point: GeoPoint, path: List<GeoPoint>): Double {
        if (path.isEmpty()) return Double.MAX_VALUE
        if (path.size == 1) return Catalog.distanceKm(point, path[0])
        return path.zipWithNext { a, b -> distanceToLegKm(point, a, b) }.min()
    }
    // Flat-earth projection around the point; accurate enough for legs of a few kilometres.
    private fun distanceToLegKm(p: GeoPoint, a: GeoPoint, b: GeoPoint): Double {
        val kx = 111.32 * cos(Math.toRadians(p.lat)); val ky = 110.57
        val ax = (a.lon - p.lon) * kx; val ay = (a.lat - p.lat) * ky
        val bx = (b.lon - p.lon) * kx; val by = (b.lat - p.lat) * ky
        val dx = bx - ax; val dy = by - ay
        val len2 = dx * dx + dy * dy
        val t = if (len2 <= 0.0) 0.0 else (-(ax * dx + ay * dy) / len2).coerceIn(0.0, 1.0)
        return hypot(ax + dx * t, ay + dy * t)
    }

    /** Progress (0..1) at which the path first comes within the segment's radius, or null if it never does. */
    fun entryProgress(path: List<GeoPoint>, segment: MusicRegion): Double? {
        if (path.isEmpty()) return null
        for (i in 0..SAMPLES) {
            val progress = i.toDouble() / SAMPLES
            if (Catalog.distanceKm(pointAt(path, progress), segment.point) <= segment.radiusKm) return progress
        }
        return null
    }

    /** Mapped segments the path passes through, in driving order. */
    fun plan(path: List<GeoPoint>, segments: List<MusicRegion>): List<MusicRegion> =
        segments.mapNotNull { segment -> entryProgress(path, segment)?.let { it to segment } }
            .sortedBy { it.first }.map { it.second }
}
