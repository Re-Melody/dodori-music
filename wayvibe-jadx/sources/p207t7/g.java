package p207t7;

import T3.f;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p036d.o;
import p150n8.a;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26919c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26918b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f26917a = new e(this);

    public final Task a(Runnable runnable) {
        return this.f26917a.a(new f(runnable, 3));
    }

    public final a b(f fVar, long j10, Runnable runnable) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (this.f26919c.contains(fVar)) {
            j10 = 0;
        }
        System.currentTimeMillis();
        a aVar = new a();
        aVar.f22981c = this;
        aVar.f22979a = runnable;
        e eVar = this.f26917a;
        o oVar = new o(aVar, 17);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (eVar) {
            scheduledFutureSchedule = !eVar.f26914b ? eVar.f26913a.schedule(oVar, j10, timeUnit) : null;
        }
        aVar.f22980b = scheduledFutureSchedule;
        this.f26918b.add(aVar);
        return aVar;
    }

    public final void c(Throwable th) {
        this.f26917a.f26913a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new com.revenuecat.purchases.common.a(th, 1));
    }

    public final void d() {
        Thread threadCurrentThread = Thread.currentThread();
        e eVar = this.f26917a;
        Thread thread = eVar.f26915c;
        if (thread == threadCurrentThread) {
            return;
        }
        c.l("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(eVar.f26915c.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        throw null;
    }
}
