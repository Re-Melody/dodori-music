package D8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class U0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268z7.c f2387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f2388b;

    public U0(p268z7.c cVar) {
        p229v9.a.k(cVar, "executorPool");
        this.f2387a = cVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f2388b == null) {
                    Executor executor2 = (Executor) u2.a((t2) this.f2387a.f29899b);
                    Executor executor3 = this.f2388b;
                    if (executor2 == null) {
                        throw new NullPointerException(p234w3.c.c("%s.getObject()", executor3));
                    }
                    this.f2388b = executor2;
                }
                executor = this.f2388b;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
