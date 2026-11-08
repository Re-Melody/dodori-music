package D8;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f2730d = Logger.getLogger(o2.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r2 f2731e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2733b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f2734c = 0;

    static {
        r2 n2Var;
        try {
            n2Var = new m2(AtomicIntegerFieldUpdater.newUpdater(o2.class, "c"));
        } catch (Throwable th) {
            f2730d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            n2Var = new n2();
        }
        f2731e = n2Var;
    }

    public o2(Executor executor) {
        p229v9.a.k(executor, "'executor' must not be null.");
        this.f2732a = executor;
    }

    public final void a(Runnable runnable) {
        r2 r2Var = f2731e;
        if (r2Var.r(this)) {
            try {
                this.f2732a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f2733b.remove(runnable);
                }
                r2Var.s(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f2733b;
        p229v9.a.k(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        r2 r2Var = f2731e;
        while (true) {
            concurrentLinkedQueue = this.f2733b;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    f2730d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e2);
                }
            } catch (Throwable th) {
                r2Var.s(this);
                throw th;
            }
        }
        r2Var.s(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
