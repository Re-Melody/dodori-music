package p9;

import A9.A;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25328e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f25329f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A f25330g = new A("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f25334d;

    public l(int i10, boolean z10) {
        this.f25331a = i10;
        this.f25332b = z10;
        int i11 = i10 - 1;
        this.f25333c = i11;
        this.f25334d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f25329f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (2305843009213693952L & j10) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f25333c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f25334d;
            if (!this.f25332b && atomicReferenceArray.get(i11 & i12) != null) {
                int i13 = this.f25331a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i11 & i12, runnable);
                l lVarC = this;
                while ((atomicLongFieldUpdater.get(lVarC) & 1152921504606846976L) != 0) {
                    lVarC = lVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = lVarC.f25334d;
                    int i14 = lVarC.f25333c & i11;
                    Object obj = atomicReferenceArray2.get(i14);
                    if ((obj instanceof k) && ((k) obj).f25327a == i11) {
                        atomicReferenceArray2.set(i14, runnable);
                    } else {
                        lVarC = null;
                    }
                    if (lVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f25329f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        l lVar;
        while (true) {
            atomicLongFieldUpdater = f25329f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25328e;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar2 != null) {
                return lVar2;
            }
            l lVar3 = new l(lVar.f25331a * 2, lVar.f25332b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = lVar.f25333c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object kVar = lVar.f25334d.get(i13);
                if (kVar == null) {
                    kVar = new k(i10);
                }
                lVar3.f25334d.set(lVar3.f25333c & i10, kVar);
                i10++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        l lVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f25329f;
            long j10 = atomicLongFieldUpdater.get(lVarC);
            if ((j10 & 1152921504606846976L) != 0) {
                return f25330g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = lVarC.f25333c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 != i13) {
                AtomicReferenceArray atomicReferenceArray = lVarC.f25334d;
                Object obj = atomicReferenceArray.get(i13);
                boolean z10 = lVarC.f25332b;
                if (obj == null) {
                    if (z10) {
                    }
                } else if (!(obj instanceof k)) {
                    long j11 = (i10 + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(lVarC, j10, (j10 & (-1073741824)) | j11)) {
                        atomicReferenceArray.set(i13, null);
                        return obj;
                    }
                    lVarC = this;
                    if (z10) {
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f25329f;
                            long j12 = atomicLongFieldUpdater2.get(lVarC);
                            int i14 = (int) (j12 & 1073741823);
                            if ((j12 & 1152921504606846976L) != 0) {
                                lVarC = lVarC.c();
                            } else {
                                l lVar = lVarC;
                                lVarC = lVar;
                                if (atomicLongFieldUpdater2.compareAndSet(lVar, j12, (j12 & (-1073741824)) | j11)) {
                                    lVarC.f25334d.set(lVarC.f25333c & i14, null);
                                    lVarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (lVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
