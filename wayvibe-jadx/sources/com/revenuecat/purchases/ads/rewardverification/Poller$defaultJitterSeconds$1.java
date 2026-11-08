package com.revenuecat.purchases.ads.rewardverification;

import Z8.a;
import d9.c;
import d9.d;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class Poller$defaultJitterSeconds$1 extends n implements a {
    public static final Poller$defaultJitterSeconds$1 INSTANCE = new Poller$defaultJitterSeconds$1();

    public Poller$defaultJitterSeconds$1() {
        super(0);
    }

    @Override // Z8.a
    public final Double invoke() {
        double dNextDouble;
        c cVar = d.f19429a;
        d9.a aVar = d.f19430b;
        aVar.getClass();
        if (!Double.isInfinite(0.5d) || Math.abs(0.75d) > Double.MAX_VALUE || Math.abs(1.25d) > Double.MAX_VALUE) {
            dNextDouble = 0.75d + (aVar.m().nextDouble() * 0.5d);
        } else {
            double d10 = 2;
            double dNextDouble2 = ((1.25d / d10) - (0.75d / d10)) * aVar.m().nextDouble();
            dNextDouble = 0.75d + dNextDouble2 + dNextDouble2;
        }
        if (dNextDouble >= 1.25d) {
            dNextDouble = Math.nextAfter(1.25d, Double.NEGATIVE_INFINITY);
        }
        return Double.valueOf(dNextDouble);
    }
}
