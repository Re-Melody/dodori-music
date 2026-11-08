package com.revenuecat.purchases_ui_flutter.views;

import N8.t;
import android.content.Context;
import io.flutter.plugin.platform.g;
import java.util.Map;
import kotlin.jvm.internal.m;
import p161o8.f;
import p161o8.w;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallViewFactory extends g {
    private final f messenger;

    public PaywallViewFactory(f messenger) {
        m.f(messenger, "messenger");
        w wVar = w.f23835a;
        this.messenger = messenger;
    }

    @Override // io.flutter.plugin.platform.g
    public io.flutter.plugin.platform.f create(Context context, int i10, Object obj) {
        m.f(context, "context");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            map = t.f8651a;
        }
        return new PaywallView(context, i10, this.messenger, map);
    }
}
