package p119k9;

import A9.A;
import B8.V;
import M8.D;
import M8.o;
import Q8.i;
import R8.a;
import S8.d;
import Z8.c;
import Z8.f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import p9.q;

/* JADX INFO: renamed from: k9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2028n extends M implements InterfaceC2024l, d, N0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21752f = AtomicIntegerFieldUpdater.newUpdater(C2028n.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21753g = AtomicReferenceFieldUpdater.newUpdater(C2028n.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21754h = AtomicReferenceFieldUpdater.newUpdater(C2028n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q8.d f21755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f21756e;

    public C2028n(int i10, Q8.d dVar) {
        super(i10);
        this.f21755d = dVar;
        this.f21756e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2004b.f21717a;
    }

    public static Object C(A0 a10, Object obj, int i10, f fVar) {
        if (obj instanceof C2038w) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (fVar != null || (a10 instanceof InterfaceC2022k)) {
            return new C2037v(obj, a10 instanceof InterfaceC2022k ? (InterfaceC2022k) a10 : null, fVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(A0 a10, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + a10 + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i10, f fVar) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21753g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof A0)) {
                if (obj2 instanceof C2030o) {
                    C2030o c2030o = (C2030o) obj2;
                    c2030o.getClass();
                    if (C2030o.f21761c.compareAndSet(c2030o, 0, 1)) {
                        if (fVar != null) {
                            k(fVar, c2030o.f21786a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objC = C((A0) obj2, obj, i10, fVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        o();
                    }
                    p(i10);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void B(AbstractC2040y abstractC2040y) throws IllegalAccessException, InvocationTargetException {
        D d10 = D.f8402a;
        Q8.d dVar = this.f21755d;
        p9.f fVar = dVar instanceof p9.f ? (p9.f) dVar : null;
        A(d10, (fVar != null ? fVar.f25312d : null) == abstractC2040y ? 4 : this.f21694c, null);
    }

    public final A D(Object obj, f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21753g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj2 instanceof A0;
            A a10 = F.f21670a;
            if (!z10) {
                boolean z11 = obj2 instanceof C2037v;
                return null;
            }
            Object objC = C((A0) obj2, obj, this.f21694c, fVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        o();
                    }
                    return a10;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // p119k9.N0
    public final void a(q qVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f21752f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(qVar);
    }

    @Override // p119k9.M
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21753g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof A0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C2038w) {
                return;
            }
            if (!(obj instanceof C2037v)) {
                cancellationException2 = cancellationException;
                C2037v c2037v = new C2037v(obj, (InterfaceC2022k) null, (f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2037v)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C2037v c2037v2 = (C2037v) obj;
            if (c2037v2.f21783e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C2037v c2037vA = C2037v.a(c2037v2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2037vA)) {
                    InterfaceC2022k interfaceC2022k = c2037v2.f21780b;
                    if (interfaceC2022k != null) {
                        j(interfaceC2022k, cancellationException);
                    }
                    f fVar = c2037v2.f21781c;
                    if (fVar != null) {
                        k(fVar, cancellationException, c2037v2.f21779a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // p119k9.M
    public final Q8.d c() {
        return this.f21755d;
    }

    @Override // p119k9.InterfaceC2024l
    public final A d(Object obj, f fVar) {
        return D(obj, fVar);
    }

    @Override // p119k9.M
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // p119k9.M
    public final Object f(Object obj) {
        return obj instanceof C2037v ? ((C2037v) obj).f21779a : obj;
    }

    @Override // S8.d
    public final d getCallerFrame() {
        Q8.d dVar = this.f21755d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    @Override // Q8.d
    public final i getContext() {
        return this.f21756e;
    }

    @Override // p119k9.InterfaceC2024l
    public final void h(Object obj, f fVar) throws IllegalAccessException, InvocationTargetException {
        A(obj, this.f21694c, fVar);
    }

    @Override // p119k9.M
    public final Object i() {
        return f21753g.get(this);
    }

    @Override // p119k9.InterfaceC2024l
    public final boolean isActive() {
        return f21753g.get(this) instanceof A0;
    }

    public final void j(InterfaceC2022k interfaceC2022k, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            interfaceC2022k.a(th);
        } catch (Throwable th2) {
            F.q(this.f21756e, new V("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(f fVar, Throwable th, Object obj) throws IllegalAccessException, InvocationTargetException {
        i iVar = this.f21756e;
        try {
            fVar.invoke(th, obj, iVar);
        } catch (Throwable th2) {
            F.q(iVar, new V("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // p119k9.InterfaceC2024l
    public final boolean l(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21753g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof A0)) {
                return false;
            }
            C2030o c2030o = new C2030o(this, th, (obj instanceof InterfaceC2022k) || (obj instanceof q));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2030o)) {
                    A0 a10 = (A0) obj;
                    if (a10 instanceof InterfaceC2022k) {
                        j((InterfaceC2022k) obj, th);
                    } else if (a10 instanceof q) {
                        m((q) obj, th);
                    }
                    if (!w()) {
                        o();
                    }
                    p(this.f21694c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void m(q qVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        i iVar = this.f21756e;
        int i10 = f21752f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.h(i10, iVar);
        } catch (Throwable th2) {
            F.q(iVar, new V("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p119k9.InterfaceC2024l
    public final void n(Object obj) {
        p(this.f21694c);
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21754h;
        Q q5 = (Q) atomicReferenceFieldUpdater.get(this);
        if (q5 == null) {
            return;
        }
        q5.dispose();
        atomicReferenceFieldUpdater.set(this, z0.f21794a);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f21752f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                Q8.d dVar = this.f21755d;
                boolean z10 = i10 == 4;
                if (!z10 && (dVar instanceof p9.f)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f21694c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        p9.f fVar = (p9.f) dVar;
                        AbstractC2040y abstractC2040y = fVar.f25312d;
                        i context = fVar.f25313e.getContext();
                        if (abstractC2040y.w(context)) {
                            abstractC2040y.l(context, this);
                            return;
                        }
                        Z zA = F0.a();
                        if (zA.f21713c >= 4294967296L) {
                            zA.A(this);
                            return;
                        }
                        zA.C(true);
                        try {
                            F.z(this, dVar, true);
                            do {
                            } while (zA.E());
                        } catch (Throwable th) {
                            try {
                                g(th);
                            } finally {
                                zA.z(true);
                            }
                        }
                        return;
                    }
                }
                F.z(this, dVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable q(u0 u0Var) {
        return u0Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = f21752f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW) {
                    z();
                }
                Object obj = f21753g.get(this);
                if (obj instanceof C2038w) {
                    throw ((C2038w) obj).f21786a;
                }
                int i12 = this.f21694c;
                if (i12 == 1 || i12 == 2) {
                    InterfaceC2019i0 interfaceC2019i0 = (InterfaceC2019i0) this.f21756e.get(C2041z.f21793b);
                    if (interfaceC2019i0 != null && !interfaceC2019i0.isActive()) {
                        CancellationException cancellationException = interfaceC2019i0.getCancellationException();
                        b(cancellationException);
                        throw cancellationException;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((Q) f21754h.get(this)) == null) {
            t();
        }
        if (zW) {
            z();
        }
        return a.COROUTINE_SUSPENDED;
    }

    @Override // Q8.d
    public final void resumeWith(Object obj) {
        Throwable thA = o.a(obj);
        if (thA != null) {
            obj = new C2038w(false, thA);
        }
        A(obj, this.f21694c, null);
    }

    public final void s() {
        Q qT = t();
        if (qT == null || (f21753g.get(this) instanceof A0)) {
            return;
        }
        qT.dispose();
        f21754h.set(this, z0.f21794a);
    }

    public final Q t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC2019i0 interfaceC2019i0 = (InterfaceC2019i0) this.f21756e.get(C2041z.f21793b);
        if (interfaceC2019i0 == null) {
            return null;
        }
        Q qR = F.r(interfaceC2019i0, true, new C2032p(this, 0));
        do {
            atomicReferenceFieldUpdater = f21754h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, qR)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return qR;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(F.D(this.f21755d));
        sb.append("){");
        Object obj = f21753g.get(this);
        if (obj instanceof A0) {
            str = "Active";
        } else {
            str = obj instanceof C2030o ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(F.n(this));
        return sb.toString();
    }

    public final void u(c cVar) {
        v(new C2020j(cVar, 1));
    }

    public final void v(A0 a10) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21753g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C2004b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC2022k) || (obj instanceof q)) {
                x(a10, obj);
                throw null;
            }
            if (obj instanceof C2038w) {
                C2038w c2038w = (C2038w) obj;
                c2038w.getClass();
                if (!C2038w.f21785b.compareAndSet(c2038w, 0, 1)) {
                    x(a10, obj);
                    throw null;
                }
                if (obj instanceof C2030o) {
                    if (obj == null) {
                        c2038w = null;
                    }
                    Throwable th = c2038w != null ? c2038w.f21786a : null;
                    if (a10 instanceof InterfaceC2022k) {
                        j((InterfaceC2022k) a10, th);
                        return;
                    } else {
                        m((q) a10, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C2037v)) {
                if (a10 instanceof q) {
                    return;
                }
                C2037v c2037v = new C2037v(obj, (InterfaceC2022k) a10, (f) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2037v)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C2037v c2037v2 = (C2037v) obj;
            if (c2037v2.f21780b != null) {
                x(a10, obj);
                throw null;
            }
            if (a10 instanceof q) {
                return;
            }
            InterfaceC2022k interfaceC2022k = (InterfaceC2022k) a10;
            Throwable th2 = c2037v2.f21783e;
            if (th2 != null) {
                j(interfaceC2022k, th2);
                return;
            }
            C2037v c2037vA = C2037v.a(c2037v2, interfaceC2022k, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2037vA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f21694c != 2) {
            return false;
        }
        Q8.d dVar = this.f21755d;
        m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return p9.f.f25311h.get((p9.f) dVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        Q8.d dVar = this.f21755d;
        Throwable th = null;
        p9.f fVar = dVar instanceof p9.f ? (p9.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p9.f.f25311h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                A a10 = p9.a.f25301c;
                if (obj != a10) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, a10, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == a10);
            }
            if (th == null) {
                return;
            }
            o();
            l(th);
        }
    }
}
