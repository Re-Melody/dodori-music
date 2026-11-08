package p230w;

import M8.D;
import Q8.d;
import R3.a;
import U.C0880d;
import U.C0891i0;
import U.U;
import Z8.c;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: w.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2271d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f27665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2281n f27667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0891i0 f27668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0891i0 f27669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q f27670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC2285s f27671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC2285s f27672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2285s f27673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC2285s f27674j;

    public C2271d(Object obj, o0 o0Var, Object obj2) {
        this.f27665a = o0Var;
        this.f27666b = obj2;
        C2281n c2281n = new C2281n(o0Var, obj, null, 60);
        this.f27667c = c2281n;
        Boolean bool = Boolean.FALSE;
        U u10 = U.f11815f;
        this.f27668d = C0880d.K(bool, u10);
        this.f27669e = C0880d.K(obj, u10);
        this.f27670f = new Q();
        new V(obj2);
        AbstractC2285s abstractC2285s = c2281n.f27747c;
        boolean z10 = abstractC2285s instanceof C2282o;
        AbstractC2285s abstractC2285s2 = z10 ? AbstractC2272e.f27683e : abstractC2285s instanceof C2283p ? AbstractC2272e.f27684f : abstractC2285s instanceof C2284q ? AbstractC2272e.f27685g : AbstractC2272e.f27686h;
        this.f27671g = abstractC2285s2;
        AbstractC2285s abstractC2285s3 = z10 ? AbstractC2272e.f27679a : abstractC2285s instanceof C2283p ? AbstractC2272e.f27680b : abstractC2285s instanceof C2284q ? AbstractC2272e.f27681c : AbstractC2272e.f27682d;
        this.f27672h = abstractC2285s3;
        this.f27673i = abstractC2285s2;
        this.f27674j = abstractC2285s3;
    }

    public static final Object a(C2271d c2271d, Object obj) {
        AbstractC2285s abstractC2285s = c2271d.f27671g;
        AbstractC2285s abstractC2285s2 = c2271d.f27673i;
        boolean zB = m.b(abstractC2285s2, abstractC2285s);
        AbstractC2285s abstractC2285s3 = c2271d.f27674j;
        if (!zB || !m.b(abstractC2285s3, c2271d.f27672h)) {
            o0 o0Var = c2271d.f27665a;
            AbstractC2285s abstractC2285s4 = (AbstractC2285s) o0Var.f27755a.invoke(obj);
            int iB = abstractC2285s4.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < iB; i10++) {
                if (abstractC2285s4.a(i10) < abstractC2285s2.a(i10) || abstractC2285s4.a(i10) > abstractC2285s3.a(i10)) {
                    abstractC2285s4.e(a.m(abstractC2285s4.a(i10), abstractC2285s2.a(i10), abstractC2285s3.a(i10)), i10);
                    z10 = true;
                }
            }
            if (z10) {
                return o0Var.f27756b.invoke(abstractC2285s4);
            }
        }
        return obj;
    }

    public static final void b(C2271d c2271d) {
        C2281n c2281n = c2271d.f27667c;
        c2281n.f27747c.d();
        c2281n.f27748d = Long.MIN_VALUE;
        c2271d.f27668d.setValue(Boolean.FALSE);
    }

    public static Object c(C2271d c2271d, Object obj, InterfaceC2280m interfaceC2280m, c cVar, d dVar, int i10) {
        Object objInvoke = c2271d.f27665a.f27756b.invoke(c2271d.f27667c.f27747c);
        c cVar2 = (i10 & 8) != 0 ? null : cVar;
        Object objD = c2271d.d();
        o0 o0Var = c2271d.f27665a;
        return Q.a(c2271d.f27670f, new C2268a(c2271d, objInvoke, new c0(interfaceC2280m, o0Var, objD, obj, (AbstractC2285s) o0Var.f27755a.invoke(objInvoke)), c2271d.f27667c.f27748d, cVar2, null), dVar);
    }

    public final Object d() {
        return this.f27667c.f27746b.getValue();
    }

    public final Object e(d dVar, Object obj) {
        Object objA = Q.a(this.f27670f, new C2269b(this, obj, null), dVar);
        return objA == R8.a.COROUTINE_SUSPENDED ? objA : D.f8402a;
    }

    public final Object f(S8.c cVar) {
        Object objA = Q.a(this.f27670f, new C2270c(this, null), cVar);
        return objA == R8.a.COROUTINE_SUSPENDED ? objA : D.f8402a;
    }

    public /* synthetic */ C2271d(Object obj, o0 o0Var, Object obj2, int i10) {
        this(obj, o0Var, (i10 & 4) != 0 ? null : obj2);
    }
}
