package com.revenuecat.purchases.google.usecase;

import Z4.C0976i;
import Z4.InterfaceC0984q;
import Z4.r;
import Z4.w;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0984q, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillingClientUseCase f18870a;

    public /* synthetic */ a(BillingClientUseCase billingClientUseCase) {
        this.f18870a = billingClientUseCase;
    }

    @Override // Z4.r
    public void a(C0976i c0976i, List list) {
        QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0((QueryPurchasesByTypeUseCase) this.f18870a, c0976i, list);
    }

    @Override // Z4.InterfaceC0984q
    public void b(C0976i c0976i, w wVar) {
        BillingClientUseCase.processResult$default((QueryProductDetailsUseCase) this.f18870a, c0976i, wVar, null, null, 12, null);
    }

    public void c(C0976i c0976i) {
        AcknowledgePurchaseUseCase.AnonymousClass1.invoke$lambda$0((AcknowledgePurchaseUseCase) this.f18870a, c0976i);
    }

    public void d(C0976i c0976i, String str) {
        ConsumePurchaseUseCase.AnonymousClass1.invoke$lambda$0((ConsumePurchaseUseCase) this.f18870a, c0976i, str);
    }
}
