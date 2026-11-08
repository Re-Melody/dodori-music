package p141m9;

import A9.A;
import Q8.d;
import Q8.i;
import S8.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p119k9.AbstractC2002a;
import p119k9.C2021j0;
import p119k9.C2031o0;
import p119k9.C2038w;
import p119k9.F;
import p119k9.u0;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC2002a implements r, g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f22539d;

    public q(i iVar, c cVar) {
        super(iVar, true);
        this.f22539d = cVar;
    }

    @Override // p119k9.AbstractC2002a
    public final void W(boolean z10, Throwable th) throws IllegalAccessException, InvocationTargetException {
        if (this.f22539d.h(false, th) || z10) {
            return;
        }
        F.q(this.f21716c, th);
    }

    @Override // p119k9.AbstractC2002a
    public final void X(Object obj) {
        this.f22539d.h(false, null);
    }

    public final void Z(p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f22539d;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f22507j;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, pVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            A a10 = e.f22525q;
            if (obj != a10) {
                if (obj == e.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            A a11 = e.r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(cVar, a10, a11)) {
                    pVar.invoke(cVar.n());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(cVar) == a10);
        }
    }

    @Override // p141m9.s
    public final Object a() {
        return this.f22539d.a();
    }

    @Override // p141m9.s
    public final Object b(c cVar) {
        return this.f22539d.b(cVar);
    }

    @Override // p119k9.u0, p119k9.InterfaceC2019i0
    public final void cancel(CancellationException cancellationException) {
        Object obj = u0.f21777a.get(this);
        if (obj instanceof C2038w) {
            return;
        }
        if ((obj instanceof C2031o0) && ((C2031o0) obj).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C2021j0(s(), null, this);
        }
        p(cancellationException);
    }

    @Override // p141m9.t
    public final Object f(d dVar, Object obj) {
        return this.f22539d.f(dVar, obj);
    }

    @Override // p141m9.t
    public final Object i(Object obj) {
        return this.f22539d.i(obj);
    }

    @Override // p141m9.s
    public final b iterator() {
        c cVar = this.f22539d;
        cVar.getClass();
        return new b(cVar);
    }

    @Override // p119k9.u0
    public final void p(CancellationException cancellationException) {
        CancellationException cancellationExceptionT = u0.T(this, cancellationException);
        this.f22539d.h(true, cancellationExceptionT);
        o(cancellationExceptionT);
    }
}
