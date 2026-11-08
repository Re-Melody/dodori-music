package p247x5;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f28593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f28595c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28596d = false;

    public b(a aVar, long j10) {
        this.f28593a = new WeakReference(aVar);
        this.f28594b = j10;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f28593a;
        try {
            if (this.f28595c.await(this.f28594b, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.c();
            this.f28596d = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.c();
                this.f28596d = true;
            }
        }
    }
}
