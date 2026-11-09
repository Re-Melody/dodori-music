package com.musicmap.car

import android.content.Context

fun createPositionSource(context: Context): PositionSource = AndroidPositionSource(context)
