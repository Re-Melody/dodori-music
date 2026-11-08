package com.revenuecat.purchases;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class Offering$weekly$2 extends n implements Z8.a {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Offering$weekly$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    @Override // Z8.a
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.WEEKLY);
    }
}
