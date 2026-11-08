package com.revenuecat.purchases.ui.revenuecatui;

import M8.D;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.C2042a;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class InternalPaywallKt$LoadedPaywall$4$2$1 extends C2042a implements Z8.a {
    public InternalPaywallKt$LoadedPaywall$4$2$1(Object obj) {
        super(0, 0, PaywallViewModel.class, obj, "closePaywall", "closePaywall(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V");
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m321invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m321invoke() {
        PaywallViewModel.closePaywall$default((PaywallViewModel) this.receiver, null, 1, null);
    }
}
