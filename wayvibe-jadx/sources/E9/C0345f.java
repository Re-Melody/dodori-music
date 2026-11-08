package E9;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: E9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0345f extends O {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A1.d f3376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C0345f f3377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f3378j;
    public static final Condition k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f3379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f3380m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3382f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3383g;

    static {
        A1.d dVar = new A1.d(4, false);
        dVar.f117c = new C0345f[8];
        f3376h = dVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f3378j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m.e(conditionNewCondition, "newCondition(...)");
        k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3379l = millis;
        f3380m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j10 = this.f3363c;
        boolean z10 = this.f3361a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = f3378j;
            reentrantLock.lock();
            try {
                if (this.f3381e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f3381e = 1;
                p050e5.f.a(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f3378j;
        reentrantLock.lock();
        try {
            int i10 = this.f3381e;
            this.f3381e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f3376h.o(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
