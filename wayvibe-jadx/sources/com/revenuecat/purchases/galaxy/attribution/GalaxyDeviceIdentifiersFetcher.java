package com.revenuecat.purchases.galaxy.attribution;

import N8.t;
import Z8.c;
import android.app.Application;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class GalaxyDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application applicationContext, c completion) {
        m.f(applicationContext, "applicationContext");
        m.f(completion, "completion");
        completion.invoke(t.f8651a);
    }
}
