package t9;

import A9.A;
import D7.W;
import M8.D;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p119k9.C2026m;
import p119k9.C2028n;
import p119k9.F;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends i implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26986h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d() {
        super(1);
        this.owner$volatile = e.f26987a;
    }

    public final Object c(S8.c cVar) {
        boolean zD = d();
        D d10 = D.f8402a;
        if (!zD) {
            C2028n c2028nP = F.p(W.K(cVar));
            try {
                c cVar2 = new c(this, c2028nP);
                while (true) {
                    int andDecrement = i.f26994g.getAndDecrement(this);
                    if (andDecrement <= this.f26995a) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26986h;
                            d dVar = cVar2.f26985b;
                            atomicReferenceFieldUpdater.set(dVar, null);
                            U1.e eVar = new U1.e(6, dVar, cVar2);
                            C2028n c2028n = cVar2.f26984a;
                            c2028n.A(d10, c2028n.f21694c, new C2026m(eVar, 0));
                            break;
                        }
                        if (a(cVar2)) {
                            break;
                        }
                    }
                }
                Object objR = c2028nP.r();
                R8.a aVar = R8.a.COROUTINE_SUSPENDED;
                if (objR != aVar) {
                    objR = d10;
                }
                if (objR == aVar) {
                    return objR;
                }
            } catch (Throwable th) {
                c2028nP.z();
                throw th;
            }
        }
        return d10;
    }

    public final boolean d() {
        int i10;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f26994g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f26995a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i12) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f26986h.set(this, null);
                    c3 = 0;
                    break;
                }
            }
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(i.f26994g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26986h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            A a10 = e.f26987a;
            if (obj2 != a10) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(F.n(this));
        sb.append("[isLocked=");
        sb.append(Math.max(i.f26994g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f26986h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
