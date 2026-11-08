package p9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p119k9.F;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25323a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25324b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25325c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(i iVar, int i10) {
        while (true) {
            i iVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25324b;
            if (iVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarD = (i) obj;
                    if (!iVarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarD);
                }
            }
            if (iVarD instanceof h) {
                return (((h) iVarD).f25322d & i10) == 0 && iVarD.c(iVar, i10);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25323a;
            atomicReferenceFieldUpdater2.set(iVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(iVarD, this, iVar)) {
                    iVar.e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(iVarD) == this);
        }
    }

    public final i d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25324b;
            i iVar = (i) atomicReferenceFieldUpdater2.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f25323a;
                    obj = atomicReferenceFieldUpdater.get(iVar2);
                    if (obj == this) {
                        if (iVar == iVar2) {
                            return iVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, iVar, iVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != iVar) {
                                break;
                            }
                        }
                        return iVar2;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof n)) {
                        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        iVar3 = iVar2;
                        iVar2 = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (i) atomicReferenceFieldUpdater2.get(iVar2);
                    }
                }
                i iVar4 = ((n) obj).f25336a;
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar2, iVar4)) {
                    if (atomicReferenceFieldUpdater.get(iVar3) != iVar2) {
                        break;
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void e(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25324b;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f25323a.get(this) != iVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                    if (g()) {
                        iVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(iVar) == iVar2);
        }
    }

    public final i f() {
        i iVar;
        Object obj = f25323a.get(this);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (iVar = nVar.f25336a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean g() {
        return f25323a.get(this) instanceof n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i10 = 4;
        sb.append(new D.k(1, i10, F.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(F.n(this));
        return sb.toString();
    }
}
