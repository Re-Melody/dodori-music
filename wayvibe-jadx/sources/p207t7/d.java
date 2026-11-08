package p207t7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable, ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f26910a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f26911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f26912c;

    public d(e eVar) {
        this.f26912c = eVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        c.z("Only one thread may be created in an AsyncQueue.", this.f26911b == null, new Object[0]);
        this.f26911b = runnable;
        this.f26910a.countDown();
        return this.f26912c.f26915c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26910a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.f26911b.run();
    }
}
