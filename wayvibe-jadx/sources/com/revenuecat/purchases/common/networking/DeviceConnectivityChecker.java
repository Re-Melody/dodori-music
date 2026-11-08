package com.revenuecat.purchases.common.networking;

import V0.p;
import android.content.Context;
import android.net.ConnectivityManager;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceConnectivityChecker {
    private final Context applicationContext;

    public DeviceConnectivityChecker(Context context) {
        m.f(context, "context");
        this.applicationContext = context.getApplicationContext();
    }

    public final boolean isDeviceOffline() {
        try {
            Object systemService = this.applicationContext.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            return connectivityManager != null && connectivityManager.getActiveNetwork() == null;
        } catch (RuntimeException e2) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v(p.l(logLevel, new StringBuilder("[Purchases] - ")), "Could not determine device connectivity, assuming online: " + e2);
            }
            return false;
        }
    }
}
