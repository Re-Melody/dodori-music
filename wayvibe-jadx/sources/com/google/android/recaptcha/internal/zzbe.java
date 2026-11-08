package com.google.android.recaptcha.internal;

import M8.l;
import N8.u;
import N8.y;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return u.f8652a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap linkedHashMapI0 = y.i0(new l(0, zzqi.NET_CAPABILITY_MMS), new l(1, zzqi.NET_CAPABILITY_SUPL), new l(2, zzqi.NET_CAPABILITY_DUN), new l(3, zzqi.NET_CAPABILITY_FOTA), new l(4, zzqi.NET_CAPABILITY_IMS), new l(5, zzqi.NET_CAPABILITY_CBS), new l(6, zzqi.NET_CAPABILITY_WIFI_P2P), new l(7, zzqi.NET_CAPABILITY_IA), new l(8, zzqi.NET_CAPABILITY_RCS), new l(9, zzqi.NET_CAPABILITY_XCAP), new l(10, zzqi.NET_CAPABILITY_EIMS), new l(11, zzqi.NET_CAPABILITY_NOT_METERED), new l(12, zzqi.NET_CAPABILITY_INTERNET), new l(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new l(14, zzqi.NET_CAPABILITY_TRUSTED), new l(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i10 = Build.VERSION.SDK_INT;
        linkedHashMapI0.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapI0.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i10 >= 28) {
            linkedHashMapI0.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapI0.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            linkedHashMapI0.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapI0.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i10 >= 29) {
            linkedHashMapI0.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i10 >= 30) {
            linkedHashMapI0.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i10 >= 31) {
            linkedHashMapI0.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapI0.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i10 >= 33) {
            linkedHashMapI0.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapI0.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapI0.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapI0;
    }
}
