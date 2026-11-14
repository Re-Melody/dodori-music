package com.musicmap.car

import android.content.Context
import android.Manifest
import android.content.pm.PackageManager

fun createPositionSource(context: Context): PositionSource = AndroidPositionSource(context)
fun positionPermissions(): Array<String> = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
fun hasPositionPermission(context: Context): Boolean = positionPermissions().any {
    context.checkSelfPermission(it) == PackageManager.PERMISSION_GRANTED
}
