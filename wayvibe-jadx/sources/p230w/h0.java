package p230w;

import U.AbstractC0876b;
import U.C0880d;
import U.C0883e0;
import U.C0887g0;
import U.C0891i0;
import U.K0;
import U.U;
import U.Y0;
import kotlin.jvm.internal.m;
import p048e0.o;
import p048e0.s;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f27706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0891i0 f27707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0891i0 f27708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0891i0 f27709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0891i0 f27710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0883e0 f27711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0891i0 f27713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC2285s f27714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0887g0 f27715j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V f27716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k0 f27717m;

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    public h0(k0 k0Var, Object obj, AbstractC2285s abstractC2285s, o0 o0Var) {
        this.f27717m = k0Var;
        this.f27706a = o0Var;
        U u10 = U.f11815f;
        C0891i0 c0891i0K = C0880d.K(obj, u10);
        this.f27707b = c0891i0K;
        Object objInvoke = null;
        this.f27708c = C0880d.K(AbstractC2272e.o(7, null), u10);
        this.f27709d = C0880d.K(new c0(b(), o0Var, obj, c0891i0K.getValue(), abstractC2285s), u10);
        this.f27710e = C0880d.K(Boolean.TRUE, u10);
        this.f27711f = C0880d.I(-1.0f);
        this.f27713h = C0880d.K(obj, u10);
        this.f27714i = abstractC2285s;
        long jE = a().e();
        int i10 = AbstractC0876b.f11844b;
        this.f27715j = new C0887g0(jE);
        Float f10 = (Float) v0.f27808a.get(o0Var);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            AbstractC2285s abstractC2285s2 = (AbstractC2285s) o0Var.f27755a.invoke(obj);
            int iB = abstractC2285s2.b();
            for (int i11 = 0; i11 < iB; i11++) {
                abstractC2285s2.e(fFloatValue, i11);
            }
            objInvoke = this.f27706a.f27756b.invoke(abstractC2285s2);
        }
        this.f27716l = AbstractC2272e.o(3, objInvoke);
    }

    public final c0 a() {
        return (c0) this.f27709d.getValue();
    }

    public final C b() {
        return (C) this.f27708c.getValue();
    }

    public final void c() {
        if (this.f27711f.m() == -1.0f) {
            this.k = true;
            boolean zB = m.b(a().f27658c, a().f27659d);
            C0891i0 c0891i0 = this.f27713h;
            if (zB) {
                c0891i0.setValue(a().f27658c);
            } else {
                c0891i0.setValue(a().i(0L));
                this.f27714i = a().g(0L);
            }
        }
    }

    public final void d(Object obj, boolean z10) {
        C0891i0 c0891i0 = this.f27707b;
        boolean zB = m.b(null, c0891i0.getValue());
        C0887g0 c0887g0 = this.f27715j;
        C0891i0 c0891i1 = this.f27709d;
        if (zB) {
            c0891i1.setValue(new c0(this.f27716l, this.f27706a, obj, obj, this.f27714i.c()));
            this.f27712g = true;
            c0887g0.h(a().e());
            return;
        }
        C cB = (!z10 || this.k || (b() instanceof V)) ? b() : this.f27716l;
        k0 k0Var = this.f27717m;
        long jMax = 0;
        c0891i1.setValue(new c0(k0Var.e() <= 0 ? cB : new W(cB, k0Var.e()), this.f27706a, obj, c0891i0.getValue(), this.f27714i));
        c0887g0.h(a().e());
        this.f27712g = false;
        Boolean bool = Boolean.TRUE;
        C0891i0 c0891i2 = k0Var.f27731h;
        c0891i2.setValue(bool);
        if (k0Var.g()) {
            s sVar = k0Var.f27732i;
            int size = sVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                h0 h0Var = (h0) sVar.get(i10);
                C0887g0 c0887g1 = h0Var.f27715j;
                jMax = Math.max(jMax, ((K0) o.t(c0887g1.f11866b, c0887g1)).f11767c);
                h0Var.c();
            }
            c0891i2.setValue(Boolean.FALSE);
        }
    }

    public final void e(Object obj, Object obj2, C c3) {
        this.f27707b.setValue(obj2);
        this.f27708c.setValue(c3);
        if (m.b(a().f27659d, obj) && m.b(a().f27658c, obj2)) {
            return;
        }
        d(obj, false);
    }

    public final void f(Object obj, C c3) {
        if (this.f27712g && m.b(obj, null)) {
            return;
        }
        C0891i0 c0891i0 = this.f27707b;
        boolean zB = m.b(c0891i0.getValue(), obj);
        C0883e0 c0883e0 = this.f27711f;
        if (zB && c0883e0.m() == -1.0f) {
            return;
        }
        c0891i0.setValue(obj);
        this.f27708c.setValue(c3);
        float fM = c0883e0.m();
        C0891i0 c0891i1 = this.f27713h;
        Object value = fM == -3.0f ? obj : c0891i1.getValue();
        C0891i0 c0891i2 = this.f27710e;
        d(value, !((Boolean) c0891i2.getValue()).booleanValue());
        c0891i2.setValue(Boolean.valueOf(c0883e0.m() == -3.0f));
        if (c0883e0.m() >= 0.0f) {
            c0891i1.setValue(a().i((long) (c0883e0.m() * a().e())));
        } else if (c0883e0.m() == -3.0f) {
            c0891i1.setValue(obj);
        }
        this.f27712g = false;
        c0883e0.r(-1.0f);
    }

    @Override // U.Y0
    public final Object getValue() {
        return this.f27713h.getValue();
    }

    public final String toString() {
        return "current value: " + this.f27713h.getValue() + ", target: " + this.f27707b.getValue() + ", spec: " + b();
    }
}
