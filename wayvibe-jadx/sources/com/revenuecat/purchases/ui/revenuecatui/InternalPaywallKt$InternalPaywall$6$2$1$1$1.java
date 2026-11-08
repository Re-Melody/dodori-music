package com.revenuecat.purchases.ui.revenuecatui;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class InternalPaywallKt$InternalPaywall$6$2$1$1$1 extends j implements c {
    public InternalPaywallKt$InternalPaywall$6$2$1$1$1(Object obj) {
        super(1, 0, PaywallViewModel.class, obj, "onTransitionComplete", "onTransitionComplete(I)V");
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return D.f8402a;
    }

    public final void invoke(int i10) {
        ((PaywallViewModel) this.receiver).onTransitionComplete(i10);
    }
}
