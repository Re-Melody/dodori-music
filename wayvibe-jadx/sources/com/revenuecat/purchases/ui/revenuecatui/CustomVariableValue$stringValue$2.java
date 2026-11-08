package com.revenuecat.purchases.ui.revenuecatui;

import Z8.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomVariableValue$stringValue$2 extends n implements c {
    public static final CustomVariableValue$stringValue$2 INSTANCE = new CustomVariableValue$stringValue$2();

    public CustomVariableValue$stringValue$2() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final String invoke(double d10) {
        return d10 % 1.0d == 0.0d ? String.valueOf((long) d10) : String.valueOf(d10);
    }
}
