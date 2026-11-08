package p163p0;

import B2.s;
import B8.V;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.m;
import oa.e;
import p028c1.c;
import p028c1.k;
import p133m0.f;
import p143n0.AbstractC2091s;
import p143n0.AbstractC2097y;
import p143n0.C2081h;
import p143n0.C2083j;
import p143n0.C2087n;
import p143n0.C2096x;
import p143n0.InterfaceC2093u;
import p143n0.S;
import p143n0.U;
import p143n0.W;
import p150n8.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f25146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f25148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f25149d;

    public b() {
        c cVar = d.f25150a;
        k kVar = k.Ltr;
        g gVar = new g();
        a aVar = new a();
        aVar.f25142a = cVar;
        aVar.f25143b = kVar;
        aVar.f25144c = gVar;
        aVar.f25145d = 0L;
        this.f25146a = aVar;
        a aVar2 = new a();
        aVar2.f22981c = this;
        aVar2.f22979a = new e(aVar2, 2);
        this.f25147b = aVar2;
    }

    public static S b(b bVar, long j10, f fVar, int i10) {
        S sH = bVar.h(fVar);
        s sVar = (s) sH;
        if (!C2096x.c(W.c(((Paint) sVar.f619b).getColor()), j10)) {
            sVar.l(j10);
        }
        if (((Shader) sVar.f620c) != null) {
            sVar.o(null);
        }
        if (!m.b((AbstractC2097y) sVar.f621d, null)) {
            sVar.m(null);
        }
        if (sVar.f618a != i10) {
            sVar.k(i10);
        }
        if (((Paint) sVar.f619b).isFilterBitmap()) {
            return sH;
        }
        sVar.n(1);
        return sH;
    }

    @Override // p163p0.e
    public final void I(AbstractC2091s abstractC2091s, long j10, long j11, long j12, float f10, f fVar) {
        this.f25146a.f25144c.e(p133m0.c.d(j10), p133m0.c.e(j10), f.d(j11) + p133m0.c.d(j10), f.b(j11) + p133m0.c.e(j10), p133m0.a.b(j12), p133m0.a.c(j12), d(abstractC2091s, fVar, f10, null, 3, 1));
    }

    @Override // p028c1.b
    public final float K() {
        return this.f25146a.f25142a.K();
    }

    @Override // p163p0.e
    public final void N(long j10, long j11, long j12, long j13) {
        h hVar = h.f25151a;
        this.f25146a.f25144c.e(p133m0.c.d(j11), p133m0.c.e(j11), f.d(j12) + p133m0.c.d(j11), f.b(j12) + p133m0.c.e(j11), p133m0.a.b(j13), p133m0.a.c(j13), b(this, j10, hVar, 3));
    }

    @Override // p163p0.e
    public final a Q() {
        return this.f25147b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p163p0.e
    public final void R(long j10, long j11, long j12) {
        InterfaceC2093u interfaceC2093u = this.f25146a.f25144c;
        s sVarH = this.f25149d;
        if (sVarH == null) {
            sVarH = W.h();
            sVarH.s(1);
            this.f25149d = sVarH;
        }
        if (!C2096x.c(W.c(((Paint) sVarH.f619b).getColor()), j10)) {
            sVarH.l(j10);
        }
        if (((Shader) sVarH.f620c) != null) {
            sVarH.o(null);
        }
        if (!m.b((AbstractC2097y) sVarH.f621d, null)) {
            sVarH.m(null);
        }
        if (sVarH.f618a != 3) {
            sVarH.k(3);
        }
        Paint paint = (Paint) sVarH.f619b;
        if (paint.getStrokeWidth() != 2.0f) {
            sVarH.r(2.0f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) sVarH.f619b).setStrokeMiter(4.0f);
        }
        if (sVarH.h() != 0) {
            sVarH.p(0);
        }
        if (sVarH.i() != 0) {
            sVarH.q(0);
        }
        if (!paint.isFilterBitmap()) {
            sVarH.n(1);
        }
        interfaceC2093u.i(j11, j12, sVarH);
    }

    @Override // p163p0.e
    public final void V(long j10, long j11, long j12, int i10) {
        h hVar = h.f25151a;
        this.f25146a.f25144c.b(p133m0.c.d(j11), p133m0.c.e(j11), f.d(j12) + p133m0.c.d(j11), f.b(j12) + p133m0.c.e(j11), b(this, j10, hVar, i10));
    }

    @Override // p163p0.e
    public final void X(AbstractC2091s abstractC2091s, long j10, long j11, float f10, f fVar) {
        this.f25146a.f25144c.b(p133m0.c.d(j10), p133m0.c.e(j10), f.d(j11) + p133m0.c.d(j10), f.b(j11) + p133m0.c.e(j10), d(abstractC2091s, fVar, f10, null, 3, 1));
    }

    @Override // p028c1.b
    public final float a() {
        return this.f25146a.f25142a.a();
    }

    @Override // p163p0.e
    public final void b0(C2081h c2081h, long j10, long j11, long j12, float f10, AbstractC2097y abstractC2097y, int i10) {
        this.f25146a.f25144c.k(c2081h, j10, j11, j12, d(null, h.f25151a, f10, abstractC2097y, 3, i10));
    }

    public final S d(AbstractC2091s abstractC2091s, f fVar, float f10, AbstractC2097y abstractC2097y, int i10, int i11) {
        S sH = h(fVar);
        if (abstractC2091s != null) {
            abstractC2091s.mo913applyToPq9zytI(c(), sH, f10);
        } else {
            s sVar = (s) sH;
            if (((Shader) sVar.f620c) != null) {
                sVar.o(null);
            }
            long jC = W.c(((Paint) sVar.f619b).getColor());
            long j10 = C2096x.f22792b;
            if (!C2096x.c(jC, j10)) {
                sVar.l(j10);
            }
            if (((Paint) sVar.f619b).getAlpha() / 255.0f != f10) {
                sVar.j(f10);
            }
        }
        s sVar2 = (s) sH;
        if (!m.b((AbstractC2097y) sVar2.f621d, abstractC2097y)) {
            sVar2.m(abstractC2097y);
        }
        if (sVar2.f618a != i10) {
            sVar2.k(i10);
        }
        if (((Paint) sVar2.f619b).isFilterBitmap() == i11) {
            return sH;
        }
        sVar2.n(i11);
        return sH;
    }

    @Override // p163p0.e
    public final void f(long j10, long j11, float f10) {
        this.f25146a.f25144c.t(j11, b(this, j10, h.f25151a, 3), f10);
    }

    @Override // p163p0.e
    public final void f0(C2083j c2083j, long j10, f fVar) {
        this.f25146a.f25144c.l(c2083j, b(this, j10, fVar, 3));
    }

    public final void g(C2081h c2081h, C2087n c2087n) {
        this.f25146a.f25144c.f(c2081h, d(null, h.f25151a, 1.0f, c2087n, 3, 1));
    }

    @Override // p163p0.e
    public final k getLayoutDirection() {
        return this.f25146a.f25143b;
    }

    public final S h(f fVar) {
        if (m.b(fVar, h.f25151a)) {
            s sVar = this.f25148c;
            if (sVar != null) {
                return sVar;
            }
            s sVarH = W.h();
            sVarH.s(0);
            this.f25148c = sVarH;
            return sVarH;
        }
        if (!(fVar instanceof i)) {
            throw new V();
        }
        s sVarH2 = this.f25149d;
        if (sVarH2 == null) {
            sVarH2 = W.h();
            sVarH2.s(1);
            this.f25149d = sVarH2;
        }
        Paint paint = (Paint) sVarH2.f619b;
        float strokeWidth = paint.getStrokeWidth();
        i iVar = (i) fVar;
        float f10 = iVar.f25152a;
        if (strokeWidth != f10) {
            sVarH2.r(f10);
        }
        int iH = sVarH2.h();
        int i10 = iVar.f25154c;
        if (iH != i10) {
            sVarH2.p(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = iVar.f25153b;
        if (strokeMiter != f11) {
            ((Paint) sVarH2.f619b).setStrokeMiter(f11);
        }
        int i11 = sVarH2.i();
        int i12 = iVar.f25155d;
        if (i11 == i12) {
            return sVarH2;
        }
        sVarH2.q(i12);
        return sVarH2;
    }

    @Override // p163p0.e
    public final void n0(long j10, float f10, float f11, long j11, long j12, f fVar) {
        this.f25146a.f25144c.j(p133m0.c.d(j11), p133m0.c.e(j11), f.d(j12) + p133m0.c.d(j11), f.b(j12) + p133m0.c.e(j11), f10, f11, b(this, j10, fVar, 3));
    }

    @Override // p163p0.e
    public final void r(U u10, AbstractC2091s abstractC2091s, float f10, f fVar, int i10) {
        this.f25146a.f25144c.l(u10, d(abstractC2091s, fVar, f10, null, i10, 1));
    }
}
