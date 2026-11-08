package D8;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class M0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f2292b = Logger.getLogger(M0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f2293a;

    public M0(Runnable runnable) {
        this.f2293a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f2293a;
        try {
            runnable.run();
        } catch (Throwable th) {
            f2292b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = p267z6.r.f29892a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f2293a + ")";
    }
}
