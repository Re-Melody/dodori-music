package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.A0;
import C.Y;
import C.u0;
import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final class StackComponentViewKt$MainStackComponent$3$1 extends n implements c {
    final /* synthetic */ u0 $safeDrawingInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$MainStackComponent$3$1(u0 u0Var) {
        super(1);
        this.$safeDrawingInsets = u0Var;
    }

    @Override // Z8.c
    public final r invoke(r conditional) {
        m.f(conditional, "$this$conditional");
        return A0.a(conditional, new Y(this.$safeDrawingInsets, 32));
    }
}
