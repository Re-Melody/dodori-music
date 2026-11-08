package com.revenuecat.purchases.common.offerings;

import Z8.c;
import com.revenuecat.purchases.Offering;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18862d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f18859a = i10;
        this.f18860b = obj;
        this.f18861c = obj2;
        this.f18862d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18859a) {
            case 0:
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1((Map) this.f18860b, (List) this.f18861c, (c) this.f18862d);
                break;
            default:
                OfferingsManager.AnonymousClass2.invoke$lambda$2((OfferingsResultData) this.f18860b, (OfferingsManager) this.f18861c, (Offering) this.f18862d);
                break;
        }
    }
}
