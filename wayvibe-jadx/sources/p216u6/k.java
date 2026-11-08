package p216u6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f27232a;

    public k() {
        this.f27232a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            TaskCompletionSource taskCompletionSource = this.f27232a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e2);
            }
        }
    }

    public k(TaskCompletionSource taskCompletionSource) {
        this.f27232a = taskCompletionSource;
    }
}
