package com.revenuecat.purchases.ui.revenuecatui;

import M8.D;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class InternalPaywallKt$InternalPaywall$8$errorDialog$1$1$1 extends j implements Z8.a {
    public InternalPaywallKt$InternalPaywall$8$errorDialog$1$1$1(Object obj) {
        super(0, 0, PaywallViewModel.class, obj, "clearActionError", "clearActionError()V");
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m317invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m317invoke() {
        ((PaywallViewModel) this.receiver).clearActionError();
    }
}
