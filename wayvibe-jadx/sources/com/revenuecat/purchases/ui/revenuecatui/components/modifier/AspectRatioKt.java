package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import androidx.compose.foundation.layout.a;
import kotlin.jvm.internal.m;
import p067g0.o;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AspectRatioKt {
    public static final /* synthetic */ r aspectRatio(r rVar, AspectRatio aspectRatio) {
        m.f(rVar, "<this>");
        m.f(aspectRatio, "aspectRatio");
        return rVar.then(a.d(o.f19964a, aspectRatio.getRatio(), aspectRatio.getMatchHeightConstraintsFirst()));
    }
}
