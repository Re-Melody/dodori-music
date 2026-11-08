package com.revenuecat.purchases.paywalls;

import Z8.a;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallAssetWarming$mainHandler$2 extends n implements a {
    public static final PaywallAssetWarming$mainHandler$2 INSTANCE = new PaywallAssetWarming$mainHandler$2();

    public PaywallAssetWarming$mainHandler$2() {
        super(0);
    }

    @Override // Z8.a
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
