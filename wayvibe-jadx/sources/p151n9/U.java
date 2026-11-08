package p151n9;

import A9.A;
import M8.D;
import Q8.i;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import o9.b;
import o9.c;
import o9.d;
import o9.j;
import o9.p;
import p119k9.C2028n;
import p141m9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends b implements D, InterfaceC2105g, p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23086f = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23087e;

    public U(Object obj) {
        this._state$volatile = obj;
    }

    @Override // o9.p
    public final InterfaceC2105g a(i iVar, int i10, a aVar) {
        return ((((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != a.DROP_OLDEST) && !((i10 == 0 || i10 == -3) && aVar == a.SUSPEND)) ? new j(this, iVar, i10, aVar) : this;
    }

    @Override // o9.b
    public final d c() {
        return new V();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00de, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00de->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p151n9.InterfaceC2105g
    public final java.lang.Object collect(p151n9.InterfaceC2106h r17, Q8.d r18) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p151n9.U.collect(n9.h, Q8.d):java.lang.Object");
    }

    @Override // o9.b
    public final d[] d() {
        return new V[2];
    }

    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, Q8.d dVar) {
        h(obj);
        return D.f8402a;
    }

    public final boolean g(Object obj, Object obj2) {
        A a10 = c.f23848b;
        if (obj == null) {
            obj = a10;
        }
        if (obj2 == null) {
            obj2 = a10;
        }
        return i(obj, obj2);
    }

    @Override // p151n9.S
    public final Object getValue() {
        A a10 = c.f23848b;
        Object obj = f23086f.get(this);
        if (obj == a10) {
            return null;
        }
        return obj;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = c.f23848b;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i10;
        d[] dVarArr;
        A a10;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23086f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !m.b(obj3, obj)) {
                return false;
            }
            if (m.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f23087e;
            if ((i11 & 1) != 0) {
                this.f23087e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f23087e = i12;
            d[] dVarArr2 = this.f23843a;
            while (true) {
                V[] vArr = (V[]) dVarArr2;
                if (vArr != null) {
                    for (V v3 : vArr) {
                        if (v3 != null) {
                            AtomicReference atomicReference = v3.f23088a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (a10 = J.f23066c)) {
                                    break;
                                }
                                A a11 = J.f23065b;
                                if (obj4 != a11) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a11)) {
                                            ((C2028n) obj4).resumeWith(D.f8402a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a10)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f23087e;
                    if (i10 == i12) {
                        this.f23087e = i12 + 1;
                        return true;
                    }
                    dVarArr = this.f23843a;
                }
                dVarArr2 = dVarArr;
                i12 = i10;
            }
        }
    }
}
