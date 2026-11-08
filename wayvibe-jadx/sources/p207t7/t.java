package p207t7;

import android.os.AsyncTask;
import io.flutter.plugins.firebase.firestore.RunnableC1983h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f26947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Semaphore f26948b;

    public t() {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.f26948b = new Semaphore(4);
        this.f26947a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.f26948b.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f26947a.execute(new RunnableC1983h(22, this, runnable));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
