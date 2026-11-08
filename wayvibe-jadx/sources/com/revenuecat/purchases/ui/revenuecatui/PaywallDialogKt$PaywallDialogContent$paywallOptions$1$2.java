package com.revenuecat.purchases.ui.revenuecatui;

import M8.D;
import Z8.c;
import Z8.e;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallDialogKt$PaywallDialogContent$paywallOptions$1$2 extends n implements e {
    final /* synthetic */ c $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialogContent$paywallOptions$1$2(c cVar) {
        super(2);
        this.$onDismissRequest = cVar;
    }

    @Override // Z8.e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Offering) obj, (PaywallResult) obj2);
        return D.f8402a;
    }

    public final void invoke(Offering offering, PaywallResult paywallResult) {
        this.$onDismissRequest.invoke(offering != null ? new OfferingSelection.OfferingType(offering) : null);
    }
}
