package com.revenuecat.purchases_flutter;

import Z8.c;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchasesFlutterPlugin f18920b;

    public /* synthetic */ a(PurchasesFlutterPlugin purchasesFlutterPlugin, int i10) {
        this.f18919a = i10;
        this.f18920b = purchasesFlutterPlugin;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f18919a) {
            case 0:
                return this.f18920b.lambda$setLogHandler$2((Map) obj);
            default:
                return this.f18920b.lambda$setUpdatedCustomerInfoListener$0((Map) obj);
        }
    }
}
