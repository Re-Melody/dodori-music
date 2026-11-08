package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18866b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f18865a = i10;
        this.f18866b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f18865a) {
            case 0:
                ((BillingWrapper) this.f18866b).performStartConnection();
                break;
            case 1:
                BillingWrapper.endConnection$lambda$16((BillingWrapper) this.f18866b);
                break;
            default:
                BillingWrapper.performStartConnection$lambda$12((Throwable) this.f18866b);
                break;
        }
    }
}
