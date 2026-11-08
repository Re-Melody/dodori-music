package G1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5345b;

    public c(Handler handler, int i10) {
        this.f5344a = i10;
        switch (i10) {
            case 1:
                handler.getClass();
                this.f5345b = handler;
                break;
            default:
                this.f5345b = handler;
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5344a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f5345b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f5345b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
