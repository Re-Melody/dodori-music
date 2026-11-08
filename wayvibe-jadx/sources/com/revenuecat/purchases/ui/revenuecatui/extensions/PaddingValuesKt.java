package com.revenuecat.purchases.ui.revenuecatui.extensions;

import C.f0;
import androidx.compose.foundation.layout.a;
import kotlin.jvm.internal.m;
import p028c1.k;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PaddingValuesKt {
    public static final float calculateHorizontalPadding(f0 f0Var, k layoutDirection) {
        m.f(f0Var, "<this>");
        m.f(layoutDirection, "layoutDirection");
        return a.e(f0Var, layoutDirection) + a.f(f0Var, layoutDirection);
    }

    public static final float calculateVerticalPadding(f0 f0Var) {
        m.f(f0Var, "<this>");
        return f0Var.a() + f0Var.d();
    }
}
