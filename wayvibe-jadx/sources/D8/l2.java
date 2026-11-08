package D8;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f2700c = Logger.getLogger(l2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f2702b;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f2702b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f2700c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p229v9.a.k(runnable, "'task' must not be null.");
        if (this.f2701a) {
            if (this.f2702b == null) {
                this.f2702b = new ArrayDeque(4);
            }
            this.f2702b.add(runnable);
            return;
        }
        this.f2701a = true;
        try {
            runnable.run();
            if (this.f2702b != null) {
                a();
            }
            this.f2701a = false;
        } catch (Throwable th) {
            try {
                f2700c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f2702b != null) {
                    a();
                }
                this.f2701a = false;
            }
        }
    }
}
