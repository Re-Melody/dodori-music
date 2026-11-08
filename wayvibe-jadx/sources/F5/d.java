package F5;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.q;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p193s2.b f4530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4531b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4532c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4533d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4534e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f4535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile p202t2.a f4536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile p202t2.a f4537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Semaphore f4538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f4539j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f4538i = new Semaphore(0);
        this.f4539j = set;
    }

    public final void a() {
        if (this.f4536g != null) {
            boolean z10 = this.f4531b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f4534e = true;
                }
            }
            if (this.f4537h != null) {
                this.f4536g.getClass();
                this.f4536g = null;
                return;
            }
            this.f4536g.getClass();
            p202t2.a aVar = this.f4536g;
            aVar.f26692c.set(true);
            if (aVar.f26690a.cancel(false)) {
                this.f4537h = this.f4536g;
            }
            this.f4536g = null;
        }
    }

    public final void b() {
        if (this.f4537h != null || this.f4536g == null) {
            return;
        }
        this.f4536g.getClass();
        if (this.f4535f == null) {
            this.f4535f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        p202t2.a aVar = this.f4536g;
        Executor executor = this.f4535f;
        if (aVar.f26691b == p202t2.d.PENDING) {
            aVar.f26691b = p202t2.d.RUNNING;
            executor.execute(aVar.f26690a);
            return;
        }
        int i10 = p202t2.c.f26696a[aVar.f26691b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f4536g = new p202t2.a(this);
        b();
    }

    public final void d() {
        Iterator it = this.f4539j.iterator();
        if (it.hasNext()) {
            ((q) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f4538i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e2);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
