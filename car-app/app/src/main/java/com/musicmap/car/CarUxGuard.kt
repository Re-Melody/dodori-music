package com.musicmap.car

import android.car.Car
import android.car.drivingstate.CarUxRestrictionsManager
import android.content.ComponentName
import android.content.Context
import android.content.ServiceConnection
import android.os.IBinder

/** Only instantiated on AAOS. Fail closed until vehicle UX state is known. */
class CarUxGuard(context: Context, private val onRestricted: (Boolean) -> Unit) {
    private var manager: CarUxRestrictionsManager? = null
    private var car: Car? = null
    private val listener = CarUxRestrictionsManager.OnUxRestrictionsChangedListener { restrictions ->
        onRestricted(restrictions.isRequiresDistractionOptimization)
    }
    init {
        onRestricted(true)
        try {
            car = Car.createCar(context, object : ServiceConnection {
                override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                    try {
                        manager = car?.getCarManager(Car.CAR_UX_RESTRICTION_SERVICE) as? CarUxRestrictionsManager
                        manager?.registerListener(listener)
                        onRestricted(manager?.currentCarUxRestrictions?.isRequiresDistractionOptimization ?: true)
                    } catch (_: Exception) { onRestricted(true) }
                }
                override fun onServiceDisconnected(name: ComponentName?) { onRestricted(true) }
            })
            car?.connect()
        } catch (_: Exception) { onRestricted(true) }
    }
    fun close() { runCatching { manager?.unregisterListener() }; runCatching { car?.disconnect() } }
}
