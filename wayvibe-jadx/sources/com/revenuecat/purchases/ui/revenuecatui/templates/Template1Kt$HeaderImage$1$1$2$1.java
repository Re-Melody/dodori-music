package com.revenuecat.purchases.ui.revenuecatui.templates;

import Z8.c;
import androidx.compose.foundation.layout.d;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final class Template1Kt$HeaderImage$1$1$2$1 extends n implements c {
    final /* synthetic */ int $screenHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template1Kt$HeaderImage$1$1$2$1(int i10) {
        super(1);
        this.$screenHeight = i10;
    }

    @Override // Z8.c
    public final r invoke(r conditional) {
        m.f(conditional, "$this$conditional");
        return d.d(d.c(conditional, 1.0f), this.$screenHeight / 2.0f);
    }
}
