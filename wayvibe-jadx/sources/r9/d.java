package r9;

import A9.A;
import B2.AbstractC0112b;
import B8.V;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p119k9.F;
import p9.o;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f25997h = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f25998i = AtomicLongFieldUpdater.newUpdater(d.class, "controlState$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25999j = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated$volatile");
    public static final A k = new A("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26002c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f26004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f26005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f26006g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public d(int i10, int i11, long j10, String str) {
        this.f26000a = i10;
        this.f26001b = i11;
        this.f26002c = j10;
        this.f26003d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC0112b.e("Max pool size ", i11, i10, " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(AbstractC0112b.d(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f26004e = new g();
        this.f26005f = new g();
        this.f26006g = new o((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void e(d dVar, Runnable runnable, int i10) {
        dVar.c(runnable, false, (i10 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f26006g) {
            try {
                if (f25999j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f25998i;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f26000a) {
                    return 0;
                }
                if (i10 >= this.f26001b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f26006g.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(this, i12);
                this.f26006g.c(i12, bVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                bVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z10, boolean z11) {
        j kVar;
        c cVar;
        l.f26020f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof j) {
            kVar = (j) runnable;
            kVar.f26012a = jNanoTime;
            kVar.f26013b = z10;
        } else {
            kVar = new k(runnable, jNanoTime, z10);
        }
        boolean z12 = kVar.f26013b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f25998i;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
        if (bVar == null || !kotlin.jvm.internal.m.b(bVar.f25996h, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f25991c) != c.TERMINATED && (kVar.f26013b || cVar != c.BLOCKING)) {
            bVar.f25995g = true;
            n nVar = bVar.f25989a;
            if (z11) {
                kVar = nVar.a(kVar);
            } else {
                nVar.getClass();
                j jVar = (j) n.f26022b.getAndSet(nVar, kVar);
                kVar = jVar == null ? null : nVar.a(jVar);
            }
        }
        if (kVar != null) {
            if (!(kVar.f26013b ? this.f26005f.a(kVar) : this.f26004e.a(kVar))) {
                throw new RejectedExecutionException(p134m1.b.m(new StringBuilder(), this.f26003d, " was terminated"));
            }
        }
        boolean z13 = z11 && bVar != null;
        if (z12) {
            if (z13 || q() || l(jAddAndGet)) {
                return;
            }
            q();
            return;
        }
        if (z13 || q() || l(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        j jVarA;
        if (f25999j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
            if (bVar == null || !kotlin.jvm.internal.m.b(bVar.f25996h, this)) {
                bVar = null;
            }
            synchronized (this.f26006g) {
                i10 = (int) (f25998i.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f26006g.b(i11);
                    kotlin.jvm.internal.m.c(objB);
                    b bVar2 = (b) objB;
                    if (bVar2 != bVar) {
                        while (bVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(10000L);
                        }
                        n nVar = bVar2.f25989a;
                        g gVar = this.f26005f;
                        nVar.getClass();
                        j jVar = (j) n.f26022b.getAndSet(nVar, null);
                        if (jVar != null) {
                            gVar.a(jVar);
                        }
                        while (true) {
                            j jVarB = nVar.b();
                            if (jVarB == null) {
                                break;
                            } else {
                                gVar.a(jVarB);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f26005f.b();
            this.f26004e.b();
            while (true) {
                if (bVar != null) {
                    jVarA = bVar.a(true);
                    if (jVarA == null) {
                        jVarA = (j) this.f26004e.d();
                        if (jVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    jVarA = (j) this.f26004e.d();
                    if (jVarA == null && (jVarA = (j) this.f26005f.d()) == null) {
                        break;
                    }
                }
                try {
                    jVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (bVar != null) {
                bVar.h(c.TERMINATED);
            }
            f25997h.set(this, 0L);
            f25998i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    public final void g(b bVar, int i10, int i11) {
        while (true) {
            long j10 = f25997h.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = bVar.c();
                    while (true) {
                        if (objC == k) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        b bVar2 = (b) objC;
                        int iB = bVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = bVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f25997h.compareAndSet(this, j10, ((long) i12) | j11)) {
                    return;
                }
            }
        }
    }

    public final boolean l(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f26000a;
        if (i10 < i11) {
            int iB = b();
            if (iB == 1 && i11 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        A a10;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f25997h;
            long j10 = atomicLongFieldUpdater.get(this);
            b bVar = (b) this.f26006g.b((int) (2097151 & j10));
            if (bVar == null) {
                bVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = bVar.c();
                while (true) {
                    a10 = k;
                    if (objC == a10) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    b bVar2 = (b) objC;
                    iB = bVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = bVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j10, j11 | ((long) iB))) {
                    bVar.g(a10);
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.f25988i.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o oVar = this.f26006g;
        int iA = oVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            b bVar = (b) oVar.b(i15);
            if (bVar != null) {
                n nVar = bVar.f25989a;
                nVar.getClass();
                int i16 = n.f26022b.get(nVar) != null ? (n.f26023c.get(nVar) - n.f26024d.get(nVar)) + 1 : n.f26023c.get(nVar) - n.f26024d.get(nVar);
                int i17 = a.f25987a[bVar.f25991c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new V();
                    }
                    i14++;
                }
            }
        }
        long j10 = f25998i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f26003d);
        sb4.append('@');
        sb4.append(F.n(this));
        sb4.append("[Pool Size {core = ");
        int i18 = this.f26000a;
        sb4.append(i18);
        sb4.append(", max = ");
        sb4.append(this.f26001b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f26004e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f26005f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j10));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j10) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i18 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
