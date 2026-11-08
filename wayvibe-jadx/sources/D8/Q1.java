package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class Q1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new B8.t0(B8.r0.d(th).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
