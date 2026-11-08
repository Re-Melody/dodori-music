package com.revenuecat.purchases.models;

import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p097i9.k;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final class PeriodKt$toPeriod$1$toInt$1 extends n implements c {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // Z8.c
    public final Integer invoke(String part) {
        m.f(part, "part");
        Integer numK0 = r.k0(k.p0(part));
        return Integer.valueOf(numK0 != null ? numK0.intValue() : 0);
    }
}
