package r9;

import A9.A;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25988i = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f25989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f25990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f25991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f25996h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public b(d dVar, int i10) {
        this.f25996h = dVar;
        setDaemon(true);
        setContextClassLoader(dVar.getClass().getClassLoader());
        this.f25989a = new n();
        this.f25990b = new y();
        this.f25991c = c.DORMANT;
        this.nextParkedWorker = d.k;
        int iNanoTime = (int) System.nanoTime();
        this.f25994f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i10);
    }

    public final j a(boolean z10) {
        j jVarE;
        j jVarE2;
        d dVar;
        long j10;
        c cVar = this.f25991c;
        c cVar2 = c.CPU_ACQUIRED;
        j jVar = null;
        n nVar = this.f25989a;
        d dVar2 = this.f25996h;
        if (cVar != cVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d.f25998i;
            do {
                dVar = this.f25996h;
                j10 = atomicLongFieldUpdater.get(dVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f26022b;
                        j jVar2 = (j) atomicReferenceFieldUpdater.get(nVar);
                        if (jVar2 == null || !jVar2.f26013b) {
                            int i10 = n.f26024d.get(nVar);
                            int i11 = n.f26023c.get(nVar);
                            while (i10 != i11 && n.f26025e.get(nVar) != 0) {
                                i11--;
                                j jVarC = nVar.c(i11, true);
                                if (jVarC != null) {
                                    jVar = jVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(nVar, jVar2, null)) {
                                jVar = jVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(nVar) == jVar2);
                    }
                    if (jVar != null) {
                        return jVar;
                    }
                    j jVar3 = (j) dVar2.f26005f.d();
                    return jVar3 == null ? i(1) : jVar3;
                }
            } while (!d.f25998i.compareAndSet(dVar, j10, j10 - 4398046511104L));
            this.f25991c = c.CPU_ACQUIRED;
        }
        if (z10) {
            boolean z11 = d(dVar2.f26000a * 2) == 0;
            if (z11 && (jVarE2 = e()) != null) {
                return jVarE2;
            }
            nVar.getClass();
            j jVarB = (j) n.f26022b.getAndSet(nVar, null);
            if (jVarB == null) {
                jVarB = nVar.b();
            }
            if (jVarB != null) {
                return jVarB;
            }
            if (!z11 && (jVarE = e()) != null) {
                return jVarE;
            }
        } else {
            j jVarE3 = e();
            if (jVarE3 != null) {
                return jVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f25994f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f25994f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i10;
    }

    public final j e() {
        int iD = d(2);
        d dVar = this.f25996h;
        if (iD == 0) {
            j jVar = (j) dVar.f26004e.d();
            return jVar != null ? jVar : (j) dVar.f26005f.d();
        }
        j jVar2 = (j) dVar.f26005f.d();
        return jVar2 != null ? jVar2 : (j) dVar.f26004e.d();
    }

    public final void f(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25996h.f26003d);
        sb.append("-worker-");
        sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        c cVar2 = this.f25991c;
        boolean z10 = cVar2 == c.CPU_ACQUIRED;
        if (z10) {
            d.f25998i.addAndGet(this.f25996h, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f25991c = cVar;
        }
        return z10;
    }

    public final j i(int i10) {
        int i11;
        long j10;
        j jVarC;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f25998i;
        d dVar = this.f25996h;
        int i12 = (int) (atomicLongFieldUpdater.get(dVar) & 2097151);
        j jVar = null;
        if (i12 < 2) {
            return null;
        }
        int iD = d(i12);
        int i13 = 0;
        long jMin = Long.MAX_VALUE;
        while (i13 < i12) {
            int i14 = iD + 1;
            if (i14 > i12) {
                i14 = 1;
            }
            b bVar = (b) dVar.f26006g.b(i14);
            if (bVar == null || bVar == this) {
                i11 = i14;
            } else {
                n nVar = bVar.f25989a;
                if (i10 != 3) {
                    nVar.getClass();
                    int i15 = n.f26024d.get(nVar);
                    int i16 = n.f26023c.get(nVar);
                    boolean z10 = i10 == 1;
                    while (true) {
                        if (i15 != i16) {
                            j10 = 0;
                            if (!z10 || n.f26025e.get(nVar) != 0) {
                                int i17 = i15 + 1;
                                jVarC = nVar.c(i15, z10);
                                if (jVarC != null) {
                                    break;
                                }
                                i15 = i17;
                            }
                        } else {
                            j10 = 0;
                        }
                        jVarC = jVar;
                        break;
                    }
                } else {
                    jVarC = nVar.b();
                    j10 = 0;
                }
                y yVar = this.f25990b;
                if (jVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f26022b;
                        j jVar2 = (j) atomicReferenceFieldUpdater.get(nVar);
                        if (jVar2 == null) {
                            j11 = -1;
                        } else {
                            j11 = -1;
                            if (((jVar2.f26013b ? 1 : 2) & i10) != 0) {
                                l.f26020f.getClass();
                                i11 = i14;
                                long jNanoTime = System.nanoTime() - jVar2.f26012a;
                                long j13 = l.f26016b;
                                if (jNanoTime < j13) {
                                    j12 = j13 - jNanoTime;
                                    jVar = null;
                                    break;
                                }
                                do {
                                    jVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(nVar, jVar2, null)) {
                                        yVar.f21873a = jVar2;
                                        j12 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(nVar) == jVar2);
                                i14 = i11;
                                jVar = null;
                            }
                        }
                        j12 = -2;
                        i11 = i14;
                        break;
                    }
                } else {
                    yVar.f21873a = jVarC;
                    i11 = i14;
                    j12 = -1;
                    j11 = -1;
                }
                if (j12 == j11) {
                    j jVar3 = (j) yVar.f21873a;
                    yVar.f21873a = jVar;
                    return jVar3;
                }
                if (j12 > j10) {
                    jMin = Math.min(jMin, j12);
                }
            }
            i13++;
            iD = i11;
            jVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f25993e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        int i10;
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                d dVar = this.f25996h;
                dVar.getClass();
                if (d.f25999j.get(dVar) == 0) {
                    c cVar = this.f25991c;
                    c cVar2 = c.TERMINATED;
                    if (cVar == cVar2) {
                        break loop0;
                    }
                    j jVarA = a(this.f25995g);
                    if (jVarA == null) {
                        this.f25995g = false;
                        if (this.f25993e == 0) {
                            Object obj = this.nextParkedWorker;
                            A a10 = d.k;
                            long j11 = 2097151;
                            if (obj != a10) {
                                f25988i.set(this, -1);
                                while (this.nextParkedWorker != d.k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f25988i;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    d dVar2 = this.f25996h;
                                    dVar2.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = d.f25999j;
                                    if (atomicIntegerFieldUpdater2.get(dVar2) != 0) {
                                        break;
                                    }
                                    c cVar3 = this.f25991c;
                                    c cVar4 = c.TERMINATED;
                                    if (cVar3 == cVar4) {
                                        break;
                                    }
                                    h(c.PARKING);
                                    Thread.interrupted();
                                    if (this.f25992d == 0) {
                                        this.f25992d = System.nanoTime() + this.f25996h.f26002c;
                                    }
                                    LockSupport.parkNanos(this.f25996h.f26002c);
                                    if (System.nanoTime() - this.f25992d >= 0) {
                                        this.f25992d = 0L;
                                        d dVar3 = this.f25996h;
                                        synchronized (dVar3.f26006g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(dVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = d.f25998i;
                                                    if (((int) (atomicLongFieldUpdater2.get(dVar3) & j11)) > dVar3.f26000a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i11 = this.indexInArray;
                                                            f(0);
                                                            dVar3.g(this, i11, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(dVar3) & j11);
                                                            if (andDecrement != i11) {
                                                                Object objB = dVar3.f26006g.b(andDecrement);
                                                                kotlin.jvm.internal.m.c(objB);
                                                                b bVar = (b) objB;
                                                                dVar3.f26006g.c(i11, bVar);
                                                                bVar.f(i11);
                                                                dVar3.g(bVar, andDecrement, i11);
                                                            }
                                                            dVar3.f26006g.c(andDecrement, null);
                                                            this.f25991c = cVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    j11 = j11;
                                }
                            } else {
                                d dVar4 = this.f25996h;
                                dVar4.getClass();
                                if (this.nextParkedWorker == a10) {
                                    do {
                                        atomicLongFieldUpdater = d.f25997h;
                                        j10 = atomicLongFieldUpdater.get(dVar4);
                                        i10 = this.indexInArray;
                                        this.nextParkedWorker = dVar4.f26006g.b((int) (j10 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(dVar4, j10, ((2097152 + j10) & (-2097152)) | ((long) i10)));
                                }
                            }
                        } else {
                            if (z10) {
                                h(c.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f25993e);
                                this.f25993e = 0L;
                                break;
                            }
                            z10 = true;
                        }
                    } else {
                        this.f25993e = 0L;
                        this.f25992d = 0L;
                        if (this.f25991c == c.PARKING) {
                            this.f25991c = c.BLOCKING;
                        }
                        boolean z11 = jVarA.f26013b;
                        d dVar5 = this.f25996h;
                        if (!z11) {
                            dVar5.getClass();
                            try {
                                jVarA.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (h(c.BLOCKING) && !dVar5.q() && !dVar5.l(d.f25998i.get(dVar5))) {
                            dVar5.q();
                        }
                        dVar5.getClass();
                        try {
                            jVarA.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        d.f25998i.addAndGet(dVar5, -2097152L);
                        if (this.f25991c == cVar2) {
                            break;
                        }
                        this.f25991c = c.DORMANT;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(c.TERMINATED);
    }
}
