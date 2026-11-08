package t9;

import A9.A;
import M8.D;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p119k9.C2026m;
import p119k9.InterfaceC2024l;
import p119k9.N0;
import p9.q;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26990c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26991d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26992e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f26993f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26994g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2026m f26996b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i10) {
        this.f26995a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "The number of acquired permits should be in 0..").toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i10;
        this.f26996b = new C2026m(this, 1);
    }

    public final boolean a(N0 n6) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26992e;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f26993f.getAndIncrement(this);
        g gVar = g.f26988a;
        long j10 = andIncrement / ((long) k.f27002f);
        loop0: while (true) {
            objB = p9.a.b(lVar, j10, gVar);
            if (!p9.a.e(objB)) {
                q qVarC = p9.a.c(objB);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f25339c >= qVarC.f25339c) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                            if (!qVar.f()) {
                                break loop0;
                            }
                            qVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == qVar);
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        l lVar2 = (l) p9.a.c(objB);
        int i10 = (int) (andIncrement % ((long) k.f27002f));
        AtomicReferenceArray atomicReferenceArray = lVar2.f27003e;
        while (!atomicReferenceArray.compareAndSet(i10, null, n6)) {
            if (atomicReferenceArray.get(i10) != null) {
                A a10 = k.f26998b;
                A a11 = k.f26999c;
                while (!atomicReferenceArray.compareAndSet(i10, a10, a11)) {
                    if (atomicReferenceArray.get(i10) != a10) {
                        return false;
                    }
                }
                if (n6 instanceof InterfaceC2024l) {
                    ((InterfaceC2024l) n6).h(D.f8402a, this.f26996b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + n6).toString());
            }
        }
        n6.a(lVar2, i10);
        return true;
    }

    public final void b() {
        int i10;
        Object objB;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26994g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f26995a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26990c;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f26991d.getAndIncrement(this);
            long j10 = andIncrement2 / ((long) k.f27002f);
            h hVar = h.f26989a;
            while (true) {
                objB = p9.a.b(lVar, j10, hVar);
                if (!p9.a.e(objB)) {
                    q qVarC = p9.a.c(objB);
                    while (true) {
                        q qVar = (q) atomicReferenceFieldUpdater.get(this);
                        if (qVar.f25339c >= qVarC.f25339c) {
                            break;
                        }
                        if (!qVarC.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                                if (!qVar.f()) {
                                    break;
                                }
                                qVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == qVar);
                        if (qVarC.f()) {
                            qVarC.e();
                        }
                    }
                } else {
                    break;
                }
            }
            l lVar2 = (l) p9.a.c(objB);
            lVar2.b();
            z10 = false;
            if (lVar2.f25339c <= j10) {
                int i12 = (int) (andIncrement2 % ((long) k.f27002f));
                A a10 = k.f26998b;
                AtomicReferenceArray atomicReferenceArray = lVar2.f27003e;
                Object andSet = atomicReferenceArray.getAndSet(i12, a10);
                if (andSet == null) {
                    int i13 = k.f26997a;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            A a11 = k.f26998b;
                            A a12 = k.f27000d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i12, a11, a12)) {
                                    z10 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i12) == a11);
                            z10 = !z10;
                            break;
                        }
                        if (atomicReferenceArray.get(i12) == k.f26999c) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                } else if (andSet != k.f27001e) {
                    if (!(andSet instanceof InterfaceC2024l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC2024l interfaceC2024l = (InterfaceC2024l) andSet;
                    A aD = interfaceC2024l.d(D.f8402a, this.f26996b);
                    if (aD != null) {
                        interfaceC2024l.n(aD);
                        z10 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z10);
    }
}
