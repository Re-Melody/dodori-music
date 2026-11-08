package S8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import p119k9.AbstractC2040y;
import p119k9.C2028n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends a {
    private final Q8.i _context;
    private transient Q8.d intercepted;

    public c(Q8.d dVar, Q8.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // Q8.d
    public Q8.i getContext() {
        Q8.i iVar = this._context;
        m.c(iVar);
        return iVar;
    }

    public final Q8.d intercepted() {
        Q8.d dVar = this.intercepted;
        if (dVar != null) {
            return dVar;
        }
        Q8.f fVar = (Q8.f) getContext().get(Q8.e.f10594a);
        Q8.d fVar2 = fVar != null ? new p9.f((AbstractC2040y) fVar, this) : this;
        this.intercepted = fVar2;
        return fVar2;
    }

    @Override // S8.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Q8.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            Q8.g gVar = getContext().get(Q8.e.f10594a);
            m.c(gVar);
            p9.f fVar = (p9.f) dVar;
            do {
                atomicReferenceFieldUpdater = p9.f.f25311h;
            } while (atomicReferenceFieldUpdater.get(fVar) == p9.a.f25301c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C2028n c2028n = obj instanceof C2028n ? (C2028n) obj : null;
            if (c2028n != null) {
                c2028n.o();
            }
        }
        this.intercepted = b.f11143a;
    }

    public c(Q8.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
