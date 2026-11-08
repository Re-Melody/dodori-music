package p192s1;

import B2.AbstractC0112b;
import V0.p;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p100j1.a f26042c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f26040a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26041b = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26043d = false;

    public a(p150n8.a aVar) {
        this.f26042c = new p100j1.a(this, aVar);
    }

    public final void a(c cVar, int i10) {
        e eVarI = cVar.i(i10);
        p100j1.a aVar = this.f26042c;
        aVar.l(eVarI, 1.0f);
        aVar.l(cVar.i(i10), -1.0f);
    }

    public void b(e eVar) {
        int i10 = eVar.f26060c;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f26042c.l(eVar, f10);
    }

    public final void c(e eVar, e eVar2, e eVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26041b = i10;
        }
        p100j1.a aVar = this.f26042c;
        if (z10) {
            aVar.l(eVar, 1.0f);
            aVar.l(eVar2, -1.0f);
            aVar.l(eVar3, -1.0f);
        } else {
            aVar.l(eVar, -1.0f);
            aVar.l(eVar2, 1.0f);
            aVar.l(eVar3, 1.0f);
        }
    }

    public final void d(e eVar, e eVar2, e eVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26041b = i10;
        }
        p100j1.a aVar = this.f26042c;
        if (z10) {
            aVar.l(eVar, 1.0f);
            aVar.l(eVar2, -1.0f);
            aVar.l(eVar3, 1.0f);
        } else {
            aVar.l(eVar, -1.0f);
            aVar.l(eVar2, 1.0f);
            aVar.l(eVar3, -1.0f);
        }
    }

    public final void e(e eVar) {
        e eVar2 = this.f26040a;
        p100j1.a aVar = this.f26042c;
        if (eVar2 != null) {
            aVar.l(eVar2, -1.0f);
            this.f26040a = null;
        }
        float fN = aVar.n(eVar, true) * (-1.0f);
        this.f26040a = eVar;
        if (fN == 1.0f) {
            return;
        }
        this.f26041b /= fN;
        int i10 = aVar.f21394g;
        for (int i11 = 0; i10 != -1 && i11 < aVar.f21389b; i11++) {
            float[] fArr = aVar.f21393f;
            fArr[i10] = fArr[i10] / fN;
            i10 = aVar.f21392e[i10];
        }
    }

    public final String toString() {
        boolean z10;
        String strN = p.n(this.f26040a == null ? "0" : "" + this.f26040a, " = ");
        if (this.f26041b != 0.0f) {
            StringBuilder sbO = AbstractC0112b.o(strN);
            sbO.append(this.f26041b);
            strN = sbO.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        p100j1.a aVar = this.f26042c;
        int i10 = aVar.f21389b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (aVar.i(i11) != null) {
                float fJ = aVar.j(i11);
                if (fJ != 0.0f) {
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
                    strN = fJ == 1.0f ? p.n(strN, "null") : strN + fJ + " null";
                    z10 = true;
                }
            }
        }
        return !z10 ? p.n(strN, "0.0") : strN;
    }
}
