package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesServices {
    public static final PurchasesServices INSTANCE = new PurchasesServices();

    private PurchasesServices() {
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final PurchasesServiceDispatcher m85default() {
        return new ServiceLoaderDispatcher();
    }
}
