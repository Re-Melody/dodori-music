package p119k9;

import B8.V;
import D7.W;
import M8.D;
import M8.o;
import Q5.b;
import Q8.d;
import Q8.i;
import Z8.e;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p9.a;

/* JADX INFO: renamed from: k9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2002a extends u0 implements d, C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f21716c;

    public AbstractC2002a(i iVar, boolean z10) {
        super(z10);
        E((InterfaceC2019i0) iVar.get(C2041z.f21793b));
        this.f21716c = iVar.plus(this);
    }

    @Override // p119k9.u0
    public final void D(V v3) throws IllegalAccessException, InvocationTargetException {
        F.q(this.f21716c, v3);
    }

    @Override // p119k9.u0
    public final void N(Object obj) {
        if (!(obj instanceof C2038w)) {
            X(obj);
            return;
        }
        C2038w c2038w = (C2038w) obj;
        W(C2038w.f21785b.get(c2038w) != 0, c2038w.f21786a);
    }

    public final void Y(E e2, AbstractC2002a abstractC2002a, e eVar) {
        Object objInvoke;
        e2.getClass();
        int i10 = D.f21669a[e2.ordinal()];
        D d10 = D.f8402a;
        if (i10 == 1) {
            try {
                a.h(W.K(W.u(abstractC2002a, this, eVar)), d10);
                return;
            } catch (Throwable th) {
                resumeWith(b.r(th));
                throw th;
            }
        }
        if (i10 == 2) {
            m.f(eVar, "<this>");
            W.K(W.u(abstractC2002a, this, eVar)).resumeWith(d10);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new V();
            }
            return;
        }
        try {
            i iVar = this.f21716c;
            Object objL = a.l(iVar, null);
            try {
                if (eVar instanceof S8.a) {
                    B.d(2, eVar);
                    objInvoke = eVar.invoke(abstractC2002a, this);
                } else {
                    objInvoke = W.m0(eVar, abstractC2002a, this);
                }
                a.g(iVar, objL);
                if (objInvoke != R8.a.COROUTINE_SUSPENDED) {
                    resumeWith(objInvoke);
                }
            } catch (Throwable th2) {
                a.g(iVar, objL);
                throw th2;
            }
        } catch (Throwable th3) {
            resumeWith(b.r(th3));
        }
    }

    @Override // p119k9.C
    public final i c() {
        return this.f21716c;
    }

    @Override // Q8.d
    public final i getContext() {
        return this.f21716c;
    }

    @Override // Q8.d
    public final void resumeWith(Object obj) {
        Throwable thA = o.a(obj);
        if (thA != null) {
            obj = new C2038w(false, thA);
        }
        Object objJ = J(obj);
        if (objJ == F.f21674e) {
            return;
        }
        k(objJ);
    }

    @Override // p119k9.u0
    public final String s() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void X(Object obj) {
    }

    public void W(boolean z10, Throwable th) {
    }
}
