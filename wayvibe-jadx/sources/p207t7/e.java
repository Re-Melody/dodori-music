package p207t7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.firestore.RunnableC1983h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f26913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread f26915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f26916d;

    public e(g gVar) {
        this.f26916d = gVar;
        d dVar = new d(this);
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(dVar);
        this.f26915c = threadNewThread;
        threadNewThread.setName("FirestoreWorker");
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: t7.b
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.f26908a.f26916d.c(th);
            }
        });
        c cVar = new c(this, dVar);
        this.f26913a = cVar;
        cVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
        this.f26914b = false;
    }

    public final Task a(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            execute(new RunnableC1983h(19, taskCompletionSource, callable));
        } catch (RejectedExecutionException unused) {
            r.d(g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
        }
        return taskCompletionSource.getTask();
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (!this.f26914b) {
            this.f26913a.execute(runnable);
        }
    }
}
