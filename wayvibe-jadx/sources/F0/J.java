package F0;

import p143n0.AbstractC2091s;
import p143n0.AbstractC2097y;
import p143n0.C2081h;
import p143n0.C2083j;
import p143n0.InterfaceC2093u;

/* JADX INFO: loaded from: classes.dex */
public final class J implements p163p0.e, p163p0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p163p0.b f3621a = new p163p0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0397o f3622b;

    @Override // p028c1.b
    public final float B(float f10) {
        return f10 / this.f3621a.a();
    }

    @Override // p163p0.e
    public final void I(AbstractC2091s abstractC2091s, long j10, long j11, long j12, float f10, p163p0.f fVar) {
        this.f3621a.I(abstractC2091s, j10, j11, j12, f10, fVar);
    }

    @Override // p028c1.b
    public final float K() {
        return this.f3621a.K();
    }

    @Override // p163p0.e
    public final void N(long j10, long j11, long j12, long j13) {
        this.f3621a.N(j10, j11, j12, j13);
    }

    @Override // p028c1.b
    public final float O(float f10) {
        return this.f3621a.a() * f10;
    }

    @Override // p163p0.e
    public final p150n8.a Q() {
        return this.f3621a.f25147b;
    }

    @Override // p163p0.e
    public final void R(long j10, long j11, long j12) {
        this.f3621a.R(j10, j11, j12);
    }

    @Override // p163p0.e
    public final void V(long j10, long j11, long j12, int i10) {
        this.f3621a.V(j10, j11, j12, i10);
    }

    @Override // p163p0.e
    public final void X(AbstractC2091s abstractC2091s, long j10, long j11, float f10, p163p0.f fVar) {
        this.f3621a.X(abstractC2091s, j10, j11, f10, fVar);
    }

    @Override // p028c1.b
    public final int Y(float f10) {
        return this.f3621a.Y(f10);
    }

    @Override // p028c1.b
    public final float a() {
        return this.f3621a.a();
    }

    public final void b() {
        p163p0.b bVar = this.f3621a;
        InterfaceC2093u interfaceC2093uF0 = bVar.f25147b.f0();
        InterfaceC0397o interfaceC0397o = this.f3622b;
        kotlin.jvm.internal.m.c(interfaceC0397o);
        p067g0.q child$ui_release = interfaceC0397o.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & 4) == 0) {
            child$ui_release = null;
            break;
        }
        while (true) {
            if (child$ui_release == null || (child$ui_release.getKindSet$ui_release() & 2) != 0) {
                child$ui_release = null;
                break;
            } else if ((child$ui_release.getKindSet$ui_release() & 4) != 0) {
                break;
            } else {
                child$ui_release = child$ui_release.getChild$ui_release();
            }
        }
        if (child$ui_release == null) {
            h0 h0VarP = AbstractC0388f.p(interfaceC0397o, 4);
            if (h0VarP.O0() == interfaceC0397o.getNode()) {
                h0VarP = h0VarP.f3788m;
                kotlin.jvm.internal.m.c(h0VarP);
            }
            h0VarP.a1(interfaceC2093uF0, (p173q0.b) bVar.f25147b.f22980b);
            return;
        }
        W.d dVar = null;
        while (child$ui_release != null) {
            if (child$ui_release instanceof InterfaceC0397o) {
                InterfaceC0397o interfaceC0397o2 = (InterfaceC0397o) child$ui_release;
                p173q0.b bVar2 = (p173q0.b) bVar.f25147b.f22980b;
                h0 h0VarP2 = AbstractC0388f.p(interfaceC0397o2, 4);
                long jB0 = p025b9.a.b0(h0VarP2.f1764c);
                H h10 = h0VarP2.f3787l;
                h10.getClass();
                ((G0.A) K.a(h10)).getSharedDrawScope().d(interfaceC2093uF0, jB0, h0VarP2, interfaceC0397o2, bVar2);
            } else if ((child$ui_release.getKindSet$ui_release() & 4) != 0 && (child$ui_release instanceof AbstractC0395m)) {
                int i10 = 0;
                for (p067g0.q child$ui_release2 = ((AbstractC0395m) child$ui_release).f3813b; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            child$ui_release = child$ui_release2;
                        } else {
                            if (dVar == null) {
                                dVar = new W.d(new p067g0.q[16]);
                            }
                            if (child$ui_release != null) {
                                dVar.b(child$ui_release);
                                child$ui_release = null;
                            }
                            dVar.b(child$ui_release2);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            child$ui_release = AbstractC0388f.f(dVar);
        }
    }

    @Override // p163p0.e
    public final void b0(C2081h c2081h, long j10, long j11, long j12, float f10, AbstractC2097y abstractC2097y, int i10) {
        this.f3621a.b0(c2081h, j10, j11, j12, f10, abstractC2097y, i10);
    }

    @Override // p163p0.e
    public final long c() {
        return this.f3621a.c();
    }

    @Override // p163p0.e
    public final long c0() {
        return this.f3621a.c0();
    }

    public final void d(InterfaceC2093u interfaceC2093u, long j10, h0 h0Var, InterfaceC0397o interfaceC0397o, p173q0.b bVar) {
        InterfaceC0397o interfaceC0397o2 = this.f3622b;
        this.f3622b = interfaceC0397o;
        p028c1.k kVar = h0Var.f3787l.f3603s;
        p163p0.b bVar2 = this.f3621a;
        p150n8.a aVar = bVar2.f25147b;
        p163p0.a aVar2 = ((p163p0.b) aVar.f22981c).f25146a;
        p028c1.b bVar3 = aVar2.f25142a;
        p028c1.k kVar2 = aVar2.f25143b;
        InterfaceC2093u interfaceC2093uF0 = aVar.f0();
        p150n8.a aVar3 = bVar2.f25147b;
        long jK0 = aVar3.k0();
        p173q0.b bVar4 = (p173q0.b) aVar3.f22980b;
        aVar3.x0(h0Var);
        aVar3.y0(kVar);
        aVar3.w0(interfaceC2093u);
        aVar3.z0(j10);
        aVar3.f22980b = bVar;
        interfaceC2093u.c();
        try {
            interfaceC0397o.draw(this);
            interfaceC2093u.q();
            aVar3.x0(bVar3);
            aVar3.y0(kVar2);
            aVar3.w0(interfaceC2093uF0);
            aVar3.z0(jK0);
            aVar3.f22980b = bVar4;
            this.f3622b = interfaceC0397o2;
        } catch (Throwable th) {
            interfaceC2093u.q();
            aVar3.x0(bVar3);
            aVar3.y0(kVar2);
            aVar3.w0(interfaceC2093uF0);
            aVar3.z0(jK0);
            aVar3.f22980b = bVar4;
            throw th;
        }
    }

    @Override // p163p0.e
    public final void f(long j10, long j11, float f10) {
        this.f3621a.f(j10, j11, f10);
    }

    @Override // p163p0.e
    public final void f0(C2083j c2083j, long j10, p163p0.f fVar) {
        this.f3621a.f0(c2083j, j10, fVar);
    }

    @Override // p028c1.b
    public final long g0(long j10) {
        return this.f3621a.g0(j10);
    }

    @Override // p163p0.e
    public final p028c1.k getLayoutDirection() {
        return this.f3621a.f25146a.f25143b;
    }

    @Override // p028c1.b
    public final long i(float f10) {
        return this.f3621a.i(f10);
    }

    @Override // p028c1.b
    public final float i0(long j10) {
        return this.f3621a.i0(j10);
    }

    @Override // p028c1.b
    public final long j(long j10) {
        return this.f3621a.j(j10);
    }

    @Override // p163p0.e
    public final void n0(long j10, float f10, float f11, long j11, long j12, p163p0.f fVar) {
        this.f3621a.n0(j10, f10, f11, j11, j12, fVar);
    }

    @Override // p028c1.b
    public final float p(long j10) {
        return this.f3621a.p(j10);
    }

    @Override // p163p0.e
    public final void r(p143n0.U u10, AbstractC2091s abstractC2091s, float f10, p163p0.f fVar, int i10) {
        this.f3621a.r(u10, abstractC2091s, f10, fVar, i10);
    }

    @Override // p028c1.b
    public final long y(float f10) {
        return this.f3621a.y(f10);
    }

    @Override // p028c1.b
    public final float z(int i10) {
        return this.f3621a.z(i10);
    }
}
