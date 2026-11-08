package com.revenuecat.purchases;

import M8.D;
import M8.o;
import N8.n;
import N8.s;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class ServiceLoaderDispatcher implements PurchasesServiceDispatcher {
    private Purchases configuredPurchases;
    private List<? extends PurchasesService> services = s.f8650a;

    private final void closeServices() {
        Purchases purchases = this.configuredPurchases;
        if (purchases == null) {
            return;
        }
        Iterator<T> it = this.services.iterator();
        while (it.hasNext()) {
            safelyClose((PurchasesService) it.next(), purchases);
        }
        this.services = s.f8650a;
        this.configuredPurchases = null;
    }

    private final List<PurchasesService> loadServices() {
        Object objR;
        try {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(PurchasesService.class, PurchasesService.class.getClassLoader());
            m.e(serviceLoaderLoad, "load(\n            Purcha…va.classLoader,\n        )");
            objR = n.W0(serviceLoaderLoad);
        } catch (Throwable th) {
            objR = Q5.b.r(th);
        }
        Throwable thA = o.a(objR);
        if (thA != null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to load PurchasesService implementations.", thA);
            objR = s.f8650a;
        }
        return (List) objR;
    }

    private final void safelyClose(PurchasesService purchasesService, Purchases purchases) {
        Object objR;
        try {
            purchasesService.close(purchases);
            objR = D.f8402a;
        } catch (Throwable th) {
            objR = Q5.b.r(th);
        }
        Throwable thA = o.a(objR);
        if (thA != null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "PurchasesService " + purchasesService.getClass().getName() + " threw during close.", thA);
        }
    }

    private final void safelyInitialize(PurchasesService purchasesService, Purchases purchases) {
        Object objR;
        try {
            purchasesService.initialize(purchases);
            objR = D.f8402a;
        } catch (Throwable th) {
            objR = Q5.b.r(th);
        }
        Throwable thA = o.a(objR);
        if (thA != null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "PurchasesService " + purchasesService.getClass().getName() + " threw during initialize.", thA);
        }
    }

    @Override // com.revenuecat.purchases.PurchasesServiceDispatcher
    public synchronized void close(Purchases purchases) {
        m.f(purchases, "purchases");
        closeServices();
    }

    @Override // com.revenuecat.purchases.PurchasesServiceDispatcher
    public synchronized void initialize(Purchases purchases) {
        m.f(purchases, "purchases");
        closeServices();
        List<PurchasesService> listLoadServices = loadServices();
        this.services = listLoadServices;
        this.configuredPurchases = purchases;
        Iterator<T> it = listLoadServices.iterator();
        while (it.hasNext()) {
            safelyInitialize((PurchasesService) it.next(), purchases);
        }
    }
}
