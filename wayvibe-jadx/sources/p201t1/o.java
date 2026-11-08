package p201t1;

import p192s1.c;
import p192s1.e;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f26672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f26673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f26674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f26675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f26678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f26679j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f26680l;

    public static String l(int i10) {
        if (i10 == 1) {
            return "DIRECT";
        }
        if (i10 == 2) {
            return "CENTER";
        }
        if (i10 == 3) {
            return "MATCH";
        }
        if (i10 == 4) {
            return "CHAIN";
        }
        return i10 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    @Override // p201t1.q
    public final void e() {
        int i10;
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o oVar5;
        o oVar6;
        float fK;
        float f10;
        o oVar7;
        boolean z10 = true;
        if (this.f26683b == 1 || (i10 = this.f26677h) == 4) {
            return;
        }
        p pVar = this.f26679j;
        if (pVar != null) {
            if (pVar.f26683b != 1) {
                return;
            } else {
                this.f26674e = this.k * pVar.f26681c;
            }
        }
        p pVar2 = this.f26680l;
        if (pVar2 == null || pVar2.f26683b == 1) {
            if (i10 == 1 && ((oVar7 = this.f26673d) == null || oVar7.f26683b == 1)) {
                if (oVar7 == null) {
                    this.f26675f = this;
                    this.f26676g = this.f26674e;
                } else {
                    this.f26675f = oVar7.f26675f;
                    this.f26676g = oVar7.f26676g + this.f26674e;
                }
                b();
                return;
            }
            f fVar = this.f26672c;
            if (i10 != 2 || (oVar4 = this.f26673d) == null || oVar4.f26683b != 1 || (oVar5 = this.f26678i) == null || (oVar6 = oVar5.f26673d) == null || oVar6.f26683b != 1) {
                if (i10 != 3 || (oVar = this.f26673d) == null || oVar.f26683b != 1 || (oVar2 = this.f26678i) == null || (oVar3 = oVar2.f26673d) == null || oVar3.f26683b != 1) {
                    if (i10 == 5) {
                        fVar.f26570b.r();
                        return;
                    }
                    return;
                } else {
                    this.f26675f = oVar.f26675f;
                    oVar2.f26675f = oVar3.f26675f;
                    this.f26676g = oVar.f26676g + this.f26674e;
                    oVar2.f26676g = oVar3.f26676g + oVar2.f26674e;
                    b();
                    this.f26678i.b();
                    return;
                }
            }
            this.f26675f = oVar4.f26675f;
            oVar5.f26675f = oVar6.f26675f;
            e eVar = fVar.f26571c;
            e eVar2 = e.RIGHT;
            int i11 = 0;
            if (eVar != eVar2 && eVar != e.BOTTOM) {
                z10 = false;
            }
            float f11 = z10 ? oVar4.f26676g - oVar6.f26676g : oVar6.f26676g - oVar4.f26676g;
            e eVar3 = e.LEFT;
            i iVar = fVar.f26570b;
            if (eVar == eVar3 || eVar == eVar2) {
                fK = f11 - iVar.k();
                f10 = iVar.f26601V;
            } else {
                fK = f11 - iVar.g();
                f10 = iVar.f26602W;
            }
            int iB = fVar.b();
            int iB2 = this.f26678i.f26672c.b();
            f fVar2 = fVar.f26572d;
            o oVar8 = this.f26678i;
            if (fVar2 == oVar8.f26672c.f26572d) {
                f10 = 0.5f;
                iB2 = 0;
            } else {
                i11 = iB;
            }
            float f12 = i11;
            float f13 = iB2;
            float f14 = (fK - f12) - f13;
            if (z10) {
                oVar8.f26676g = (f14 * f10) + oVar8.f26673d.f26676g + f13;
                this.f26676g = (this.f26673d.f26676g - f12) - ((1.0f - f10) * f14);
            } else {
                this.f26676g = (f14 * f10) + this.f26673d.f26676g + f12;
                oVar8.f26676g = (oVar8.f26673d.f26676g - f13) - ((1.0f - f10) * f14);
            }
            b();
            this.f26678i.b();
        }
    }

    public final void f(c cVar) {
        e eVar = this.f26672c.f26577i;
        o oVar = this.f26675f;
        if (oVar == null) {
            cVar.d(eVar, (int) (this.f26676g + 0.5f));
        } else {
            cVar.e(eVar, cVar.j(oVar.f26672c), (int) (this.f26676g + 0.5f), 6);
        }
    }

    public final void g(o oVar, int i10) {
        this.f26677h = 1;
        this.f26673d = oVar;
        this.f26674e = i10;
        oVar.a(this);
    }

    public final void h(o oVar, int i10, p pVar) {
        this.f26673d = oVar;
        oVar.a(this);
        this.f26679j = pVar;
        this.k = i10;
        pVar.a(this);
    }

    public final void i(o oVar, int i10) {
        this.f26673d = oVar;
        this.f26674e = i10;
        oVar.a(this);
    }

    public final void j() {
        this.f26683b = 0;
        this.f26682a.clear();
        this.f26673d = null;
        this.f26674e = 0.0f;
        this.f26679j = null;
        this.k = 1;
        this.f26680l = null;
        this.f26675f = null;
        this.f26676g = 0.0f;
        this.f26678i = null;
        this.f26677h = 0;
    }

    public final void k(o oVar, float f10) {
        int i10 = this.f26683b;
        if (i10 == 0 || !(this.f26675f == oVar || this.f26676g == f10)) {
            this.f26675f = oVar;
            this.f26676g = f10;
            if (i10 == 1) {
                c();
            }
            b();
        }
    }

    public final String toString() {
        int i10 = this.f26683b;
        f fVar = this.f26672c;
        if (i10 != 1) {
            return "{ " + fVar + " UNRESOLVED} type: " + l(this.f26677h);
        }
        if (this.f26675f == this) {
            return "[" + fVar + ", RESOLVED: " + this.f26676g + "]  type: " + l(this.f26677h);
        }
        return "[" + fVar + ", RESOLVED: " + this.f26675f + ":" + this.f26676g + "] type: " + l(this.f26677h);
    }
}
