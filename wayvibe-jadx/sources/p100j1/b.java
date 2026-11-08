package p100j1;

import B2.AbstractC0112b;
import U.W0;
import V0.p;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f21401d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f21398a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21399b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21400c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21402e = false;

    public b(W0 w10) {
        this.f21401d = new a(this, w10);
    }

    public final void a(c cVar, int i10) {
        this.f21401d.k(cVar.j(i10), 1.0f);
        this.f21401d.k(cVar.j(i10), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f21399b = i10;
        }
        if (z10) {
            this.f21401d.k(fVar, 1.0f);
            this.f21401d.k(fVar2, -1.0f);
            this.f21401d.k(fVar3, -1.0f);
        } else {
            this.f21401d.k(fVar, -1.0f);
            this.f21401d.k(fVar2, 1.0f);
            this.f21401d.k(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f21399b = i10;
        }
        if (z10) {
            this.f21401d.k(fVar, 1.0f);
            this.f21401d.k(fVar2, -1.0f);
            this.f21401d.k(fVar3, 1.0f);
        } else {
            this.f21401d.k(fVar, -1.0f);
            this.f21401d.k(fVar2, 1.0f);
            this.f21401d.k(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f21398a == null && this.f21399b == 0.0f && this.f21401d.f() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        e eVar;
        int iF = this.f21401d.f();
        f fVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iF; i10++) {
            float fJ = this.f21401d.j(i10);
            if (fJ < 0.0f) {
                f fVarH = this.f21401d.h(i10);
                if ((zArr == null || !zArr[fVarH.f21424b]) && fVarH != fVar && (((eVar = fVarH.f21431i) == e.SLACK || eVar == e.ERROR) && fJ < f10)) {
                    f10 = fJ;
                    fVar2 = fVarH;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f21398a;
        if (fVar2 != null) {
            this.f21401d.k(fVar2, -1.0f);
            this.f21398a.f21425c = -1;
            this.f21398a = null;
        }
        float fM = this.f21401d.m(fVar, true) * (-1.0f);
        this.f21398a = fVar;
        if (fM == 1.0f) {
            return;
        }
        this.f21399b /= fM;
        a aVar = this.f21401d;
        int i10 = aVar.f21394g;
        for (int i11 = 0; i10 != -1 && i11 < aVar.f21389b; i11++) {
            float[] fArr = aVar.f21393f;
            fArr[i10] = fArr[i10] / fM;
            i10 = aVar.f21392e[i10];
        }
    }

    public final void h(c cVar, f fVar, boolean z10) {
        if (fVar == null || !fVar.f21428f) {
            return;
        }
        float fD = this.f21401d.d(fVar);
        this.f21399b = (fVar.f21427e * fD) + this.f21399b;
        this.f21401d.m(fVar, z10);
        if (z10) {
            fVar.b(this);
        }
        if (this.f21401d.f() == 0) {
            this.f21402e = true;
            cVar.f21405b = true;
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        a aVar = this.f21401d;
        aVar.getClass();
        float fD = aVar.d(bVar.f21398a);
        aVar.m(bVar.f21398a, z10);
        a aVar2 = bVar.f21401d;
        int iF = aVar2.f();
        for (int i10 = 0; i10 < iF; i10++) {
            f fVarH = aVar2.h(i10);
            aVar.a(fVarH, aVar2.d(fVarH) * fD, z10);
        }
        this.f21399b = (bVar.f21399b * fD) + this.f21399b;
        if (z10) {
            bVar.f21398a.b(this);
        }
        if (this.f21398a == null || this.f21401d.f() != 0) {
            return;
        }
        this.f21402e = true;
        cVar.f21405b = true;
    }

    public String toString() {
        boolean z10;
        String strN = p.n(this.f21398a == null ? "0" : "" + this.f21398a, " = ");
        if (this.f21399b != 0.0f) {
            StringBuilder sbO = AbstractC0112b.o(strN);
            sbO.append(this.f21399b);
            strN = sbO.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int iF = this.f21401d.f();
        for (int i10 = 0; i10 < iF; i10++) {
            f fVarH = this.f21401d.h(i10);
            if (fVarH != null) {
                float fJ = this.f21401d.j(i10);
                if (fJ != 0.0f) {
                    String string = fVarH.toString();
                    if (z10) {
                        if (fJ > 0.0f) {
                            strN = p.n(strN, " + ");
                        } else {
                            strN = p.n(strN, " - ");
                            fJ *= -1.0f;
                        }
                    } else if (fJ < 0.0f) {
                        strN = p.n(strN, "- ");
                        fJ *= -1.0f;
                    }
                    strN = fJ == 1.0f ? p.n(strN, string) : strN + fJ + StringUtils.SPACE + string;
                    z10 = true;
                }
            }
        }
        return !z10 ? p.n(strN, "0.0") : strN;
    }
}
