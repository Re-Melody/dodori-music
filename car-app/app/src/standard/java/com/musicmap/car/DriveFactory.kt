package com.musicmap.car

import android.content.Context

/** Standard Android has no vehicle signals; the guided demo route supplies an example instead. */
fun createDriveSignals(context: Context): DriveSignals? = null
fun createAnnouncer(context: Context): Announcer = AndroidAnnouncer(context)
fun drivePermissions(): Array<String> = emptyArray()
