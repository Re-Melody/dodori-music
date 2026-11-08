package p119k9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import p9.i;
import p9.n;

/* JADX INFO: renamed from: k9.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2025l0 extends i implements Q, InterfaceC2011e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f21748d;

    @Override // p119k9.InterfaceC2011e0
    public final x0 b() {
        return null;
    }

    @Override // p119k9.Q
    public final void dispose() {
        u0 u0VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u0.f21777a;
            Object obj = atomicReferenceFieldUpdater.get(u0VarH);
            if (obj instanceof AbstractC2025l0) {
                if (obj != this) {
                    return;
                }
                T t10 = F.f21679j;
                while (!atomicReferenceFieldUpdater.compareAndSet(u0VarH, obj, t10)) {
                    if (atomicReferenceFieldUpdater.get(u0VarH) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC2011e0) || ((InterfaceC2011e0) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f25323a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof n) {
                    i iVar = ((n) obj2).f25336a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                m.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                i iVar2 = (i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = i.f25325c;
                n nVar = (n) atomicReferenceFieldUpdater3.get(iVar2);
                if (nVar == null) {
                    nVar = new n(iVar2);
                    atomicReferenceFieldUpdater3.set(iVar2, nVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar)) {
                        iVar2.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public InterfaceC2019i0 getParent() {
        return h();
    }

    public final u0 h() {
        u0 u0Var = this.f21748d;
        if (u0Var != null) {
            return u0Var;
        }
        m.l("job");
        throw null;
    }

    public abstract boolean i();

    @Override // p119k9.InterfaceC2011e0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override // p9.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + F.n(this) + "[job@" + F.n(h()) + ']';
    }
}
