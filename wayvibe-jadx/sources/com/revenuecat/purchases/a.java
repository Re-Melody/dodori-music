package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18844b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f18843a = i10;
        this.f18844b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18843a) {
            case 0:
                ((Z8.a) this.f18844b).invoke();
                break;
            case 1:
                ((Z8.a) this.f18844b).invoke();
                break;
            case 2:
                ((Z8.a) this.f18844b).invoke();
                break;
            case 3:
                ((Z8.a) this.f18844b).invoke();
                break;
            default:
                PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1((Runnable) this.f18844b);
                break;
        }
    }
}
