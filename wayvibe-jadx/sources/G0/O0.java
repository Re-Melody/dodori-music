package G0;

import android.graphics.Outline;
import android.os.Build;
import p143n0.C2083j;
import p143n0.InterfaceC2093u;

/* JADX INFO: loaded from: classes.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5094a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Outline f5095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p143n0.Q f5096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2083j f5097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p143n0.U f5098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p143n0.U f5101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p133m0.e f5102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5103j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5105m;

    public O0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f5095b = outline;
        this.k = 0L;
        this.f5104l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    public final void a(InterfaceC2093u interfaceC2093u) {
        d();
        p143n0.U u10 = this.f5098e;
        if (u10 != null) {
            interfaceC2093u.r(u10, 1);
            return;
        }
        float f10 = this.f5103j;
        if (f10 <= 0.0f) {
            interfaceC2093u.n(p133m0.c.d(this.k), p133m0.c.e(this.k), p133m0.c.d(this.k) + p133m0.f.d(this.f5104l), p133m0.c.e(this.k) + p133m0.f.b(this.f5104l), 1);
            return;
        }
        p143n0.U uI = this.f5101h;
        p133m0.e eVar = this.f5102i;
        if (uI != null) {
            long j10 = this.k;
            long j11 = this.f5104l;
            if (eVar == null || !R3.a.R(eVar)) {
                float fD = p133m0.c.d(this.k);
                float fE = p133m0.c.e(this.k);
                float fD2 = p133m0.f.d(this.f5104l) + p133m0.c.d(this.k);
                float fB = p133m0.f.b(this.f5104l) + p133m0.c.e(this.k);
                float f11 = this.f5103j;
                long jA = p206t6.b.a(f11, f11);
                long jA2 = p206t6.b.a(p133m0.a.b(jA), p133m0.a.c(jA));
                p133m0.e eVar2 = new p133m0.e(fD, fE, fD2, fB, jA2, jA2, jA2, jA2);
                if (uI == null) {
                    uI = p143n0.W.i();
                } else {
                    ((C2083j) uI).f();
                }
                p143n0.U.a(uI, eVar2);
                this.f5102i = eVar2;
                this.f5101h = uI;
            } else {
                if (eVar.f22188a == p133m0.c.d(j10)) {
                    if (eVar.f22189b == p133m0.c.e(j10)) {
                        if (eVar.f22190c == p133m0.f.d(j11) + p133m0.c.d(j10)) {
                            if (eVar.f22191d != p133m0.f.b(j11) + p133m0.c.e(j10) || p133m0.a.b(eVar.f22192e) != f10) {
                                float fD3 = p133m0.c.d(this.k);
                                float fE2 = p133m0.c.e(this.k);
                                float fD4 = p133m0.f.d(this.f5104l) + p133m0.c.d(this.k);
                                float fB2 = p133m0.f.b(this.f5104l) + p133m0.c.e(this.k);
                                float f12 = this.f5103j;
                                long jA3 = p206t6.b.a(f12, f12);
                                long jA4 = p206t6.b.a(p133m0.a.b(jA3), p133m0.a.c(jA3));
                                p133m0.e eVar3 = new p133m0.e(fD3, fE2, fD4, fB2, jA4, jA4, jA4, jA4);
                                if (uI == null) {
                                    uI = p143n0.W.i();
                                } else {
                                    ((C2083j) uI).f();
                                }
                                p143n0.U.a(uI, eVar3);
                                this.f5102i = eVar3;
                                this.f5101h = uI;
                            }
                        } else {
                            float fD5 = p133m0.c.d(this.k);
                            float fE3 = p133m0.c.e(this.k);
                            float fD6 = p133m0.f.d(this.f5104l) + p133m0.c.d(this.k);
                            float fB3 = p133m0.f.b(this.f5104l) + p133m0.c.e(this.k);
                            float f13 = this.f5103j;
                            long jA5 = p206t6.b.a(f13, f13);
                            long jA6 = p206t6.b.a(p133m0.a.b(jA5), p133m0.a.c(jA5));
                            p133m0.e eVar4 = new p133m0.e(fD5, fE3, fD6, fB3, jA6, jA6, jA6, jA6);
                            if (uI == null) {
                                uI = p143n0.W.i();
                            } else {
                                ((C2083j) uI).f();
                            }
                            p143n0.U.a(uI, eVar4);
                            this.f5102i = eVar4;
                            this.f5101h = uI;
                        }
                    } else {
                        float fD7 = p133m0.c.d(this.k);
                        float fE4 = p133m0.c.e(this.k);
                        float fD8 = p133m0.f.d(this.f5104l) + p133m0.c.d(this.k);
                        float fB4 = p133m0.f.b(this.f5104l) + p133m0.c.e(this.k);
                        float f14 = this.f5103j;
                        long jA7 = p206t6.b.a(f14, f14);
                        long jA8 = p206t6.b.a(p133m0.a.b(jA7), p133m0.a.c(jA7));
                        p133m0.e eVar5 = new p133m0.e(fD7, fE4, fD8, fB4, jA8, jA8, jA8, jA8);
                        if (uI == null) {
                            uI = p143n0.W.i();
                        } else {
                            ((C2083j) uI).f();
                        }
                        p143n0.U.a(uI, eVar5);
                        this.f5102i = eVar5;
                        this.f5101h = uI;
                    }
                } else {
                    float fD9 = p133m0.c.d(this.k);
                    float fE5 = p133m0.c.e(this.k);
                    float fD10 = p133m0.f.d(this.f5104l) + p133m0.c.d(this.k);
                    float fB5 = p133m0.f.b(this.f5104l) + p133m0.c.e(this.k);
                    float f15 = this.f5103j;
                    long jA9 = p206t6.b.a(f15, f15);
                    long jA10 = p206t6.b.a(p133m0.a.b(jA9), p133m0.a.c(jA9));
                    p133m0.e eVar6 = new p133m0.e(fD9, fE5, fD10, fB5, jA10, jA10, jA10, jA10);
                    if (uI == null) {
                        uI = p143n0.W.i();
                    } else {
                        ((C2083j) uI).f();
                    }
                    p143n0.U.a(uI, eVar6);
                    this.f5102i = eVar6;
                    this.f5101h = uI;
                }
            }
        } else {
            float fD11 = p133m0.c.d(this.k);
            float fE6 = p133m0.c.e(this.k);
            float fD12 = p133m0.f.d(this.f5104l) + p133m0.c.d(this.k);
            float fB6 = p133m0.f.b(this.f5104l) + p133m0.c.e(this.k);
            float f16 = this.f5103j;
            long jA11 = p206t6.b.a(f16, f16);
            long jA12 = p206t6.b.a(p133m0.a.b(jA11), p133m0.a.c(jA11));
            p133m0.e eVar7 = new p133m0.e(fD11, fE6, fD12, fB6, jA12, jA12, jA12, jA12);
            if (uI == null) {
                uI = p143n0.W.i();
            } else {
                ((C2083j) uI).f();
            }
            p143n0.U.a(uI, eVar7);
            this.f5102i = eVar7;
            this.f5101h = uI;
        }
        interfaceC2093u.r(uI, 1);
    }

    public final Outline b() {
        d();
        if (this.f5105m && this.f5094a) {
            return this.f5095b;
        }
        return null;
    }

    public final boolean c(p143n0.Q q5, float f10, boolean z10, float f11, long j10) {
        this.f5095b.setAlpha(f10);
        boolean zB = kotlin.jvm.internal.m.b(this.f5096c, q5);
        boolean z11 = !zB;
        if (!zB) {
            this.f5096c = q5;
            this.f5099f = true;
        }
        this.f5104l = j10;
        boolean z12 = q5 != null && (z10 || f11 > 0.0f);
        if (this.f5105m != z12) {
            this.f5105m = z12;
            this.f5099f = true;
        }
        return z11;
    }

    public final void d() {
        if (this.f5099f) {
            this.k = 0L;
            this.f5103j = 0.0f;
            this.f5098e = null;
            this.f5099f = false;
            this.f5100g = false;
            p143n0.Q q5 = this.f5096c;
            Outline outline = this.f5095b;
            if (q5 == null || !this.f5105m || p133m0.f.d(this.f5104l) <= 0.0f || p133m0.f.b(this.f5104l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f5094a = true;
            if (q5 instanceof p143n0.O) {
                p133m0.d dVar = ((p143n0.O) q5).f22716a;
                float f10 = dVar.f22184a;
                float f11 = dVar.f22185b;
                this.k = D7.W.c(f10, f11);
                this.f5104l = S5.d.i(dVar.d(), dVar.c());
                outline.setRect(Math.round(f10), Math.round(f11), Math.round(dVar.f22186c), Math.round(dVar.f22187d));
                return;
            }
            if (!(q5 instanceof p143n0.P)) {
                if (q5 instanceof p143n0.N) {
                    e(((p143n0.N) q5).f22715a);
                    return;
                }
                return;
            }
            p133m0.e eVar = ((p143n0.P) q5).f22717a;
            float fB = p133m0.a.b(eVar.f22192e);
            float f12 = eVar.f22188a;
            float f13 = eVar.f22189b;
            this.k = D7.W.c(f12, f13);
            this.f5104l = S5.d.i(eVar.b(), eVar.a());
            if (R3.a.R(eVar)) {
                this.f5095b.setRoundRect(Math.round(f12), Math.round(f13), Math.round(eVar.f22190c), Math.round(eVar.f22191d), fB);
                this.f5103j = fB;
                return;
            }
            C2083j c2083jI = this.f5097d;
            if (c2083jI == null) {
                c2083jI = p143n0.W.i();
                this.f5097d = c2083jI;
            }
            c2083jI.f();
            p143n0.U.a(c2083jI, eVar);
            e(c2083jI);
        }
    }

    public final void e(p143n0.U u10) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f5095b;
        if (i10 <= 28 && !((C2083j) u10).f22776a.isConvex()) {
            this.f5094a = false;
            outline.setEmpty();
            this.f5100g = true;
        } else {
            if (!(u10 instanceof C2083j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C2083j) u10).f22776a);
            this.f5100g = !outline.canClip();
        }
        this.f5098e = u10;
    }
}
