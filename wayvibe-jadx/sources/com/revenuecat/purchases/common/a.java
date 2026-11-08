package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f18852b;

    public /* synthetic */ a(Throwable th, int i10) {
        this.f18851a = i10;
        this.f18852b = th;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f18851a) {
            case 0:
                Dispatcher.enqueue$lambda$3$lambda$2$lambda$1(this.f18852b);
                return;
            default:
                Throwable th = this.f18852b;
                if (!(th instanceof OutOfMemoryError)) {
                    throw new RuntimeException("Internal error in Cloud Firestore (25.1.4).", th);
                }
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (25.1.4) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                outOfMemoryError.initCause(th);
                throw outOfMemoryError;
        }
    }
}
