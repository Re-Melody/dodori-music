package p248x6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f28630a;

    public z() {
        this.f28630a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f28630a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f28630a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }

    public z(TaskCompletionSource taskCompletionSource) {
        this.f28630a = taskCompletionSource;
    }
}
