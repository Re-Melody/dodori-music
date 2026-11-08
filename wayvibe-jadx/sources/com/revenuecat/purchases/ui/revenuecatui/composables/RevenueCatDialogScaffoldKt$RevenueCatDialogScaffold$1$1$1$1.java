package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.f0;
import Z8.c;
import androidx.compose.foundation.layout.a;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final class RevenueCatDialogScaffoldKt$RevenueCatDialogScaffold$1$1$1$1 extends n implements c {
    final /* synthetic */ f0 $paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevenueCatDialogScaffoldKt$RevenueCatDialogScaffold$1$1$1$1(f0 f0Var) {
        super(1);
        this.$paddingValues = f0Var;
    }

    @Override // Z8.c
    public final r invoke(r conditional) {
        m.f(conditional, "$this$conditional");
        return a.i(conditional, this.$paddingValues);
    }
}
