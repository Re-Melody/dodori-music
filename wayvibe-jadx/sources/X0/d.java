package X0;

import B2.s;
import F0.Q;
import U.C0880d;
import U.D;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.m;
import p143n0.AbstractC2091s;
import p143n0.S;
import p143n0.W;
import p143n0.a0;
import p143n0.b0;
import p143n0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f13033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005a1.j f13034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f13036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC2091s f13037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D f13038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p133m0.f f13039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p163p0.f f13040h;

    public final S a() {
        s sVar = this.f13033a;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f13033a = sVar2;
        return sVar2;
    }

    public final void b(int i10) {
        if (i10 == this.f13035c) {
            return;
        }
        ((s) a()).k(i10);
        this.f13035c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(AbstractC2091s abstractC2091s, long j10, float f10) {
        if (abstractC2091s == null) {
            this.f13038f = null;
            this.f13037e = null;
            this.f13039g = null;
            setShader(null);
            return;
        }
        if (abstractC2091s instanceof e0) {
            d(Q5.b.F(f10, ((e0) abstractC2091s).f22763a));
            return;
        }
        if (abstractC2091s instanceof a0) {
            if (m.b(this.f13037e, abstractC2091s)) {
                p133m0.f fVar = this.f13039g;
                if (!(fVar == null ? false : p133m0.f.a(fVar.f22196a, j10))) {
                    if (j10 != 9205357640488583168L) {
                        this.f13037e = abstractC2091s;
                        this.f13039g = new p133m0.f(j10);
                        this.f13038f = C0880d.D(new Q(abstractC2091s, j10, 1));
                    }
                }
            } else {
                if (j10 != 9205357640488583168L) {
                    this.f13037e = abstractC2091s;
                    this.f13039g = new p133m0.f(j10);
                    this.f13038f = C0880d.D(new Q(abstractC2091s, j10, 1));
                }
            }
            S sA = a();
            D d10 = this.f13038f;
            ((s) sA).o(d10 != null ? (Shader) d10.getValue() : null);
            i.b(this, f10);
        }
    }

    public final void d(long j10) {
        if (j10 != 16) {
            setColor(W.E(j10));
            this.f13038f = null;
            this.f13037e = null;
            this.f13039g = null;
            setShader(null);
        }
    }

    public final void e(p163p0.f fVar) {
        if (fVar == null || m.b(this.f13040h, fVar)) {
            return;
        }
        this.f13040h = fVar;
        if (fVar.equals(p163p0.h.f25151a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (fVar instanceof p163p0.i) {
            ((s) a()).s(1);
            p163p0.i iVar = (p163p0.i) fVar;
            ((s) a()).r(iVar.f25152a);
            ((Paint) ((s) a()).f619b).setStrokeMiter(iVar.f25153b);
            ((s) a()).q(iVar.f25155d);
            ((s) a()).p(iVar.f25154c);
            ((Paint) ((s) a()).f619b).setPathEffect(null);
        }
    }

    public final void f(b0 b0Var) {
        if (b0Var == null || m.b(this.f13036d, b0Var)) {
            return;
        }
        this.f13036d = b0Var;
        if (b0Var.equals(b0.f22744d)) {
            clearShadowLayer();
            return;
        }
        b0 b0Var2 = this.f13036d;
        float f10 = b0Var2.f22747c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, p133m0.c.d(b0Var2.f22746b), p133m0.c.e(this.f13036d.f22746b), W.E(this.f13036d.f22745a));
    }

    public final void g(p005a1.j jVar) {
        if (jVar == null || m.b(this.f13034b, jVar)) {
            return;
        }
        this.f13034b = jVar;
        int i10 = jVar.f14098a;
        setUnderlineText((i10 | 1) == i10);
        p005a1.j jVar2 = this.f13034b;
        jVar2.getClass();
        int i11 = jVar2.f14098a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
