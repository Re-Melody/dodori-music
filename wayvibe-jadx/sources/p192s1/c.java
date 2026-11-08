package p192s1;

import java.util.Arrays;
import p150n8.a;
import p201t1.f;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f26044o = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26046b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f26049e;
    public final a k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f26057n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26045a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26047c = 32;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26048d = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26050f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f26051g = new boolean[32];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26052h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26053i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26054j = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e[] f26055l = new e[f26044o];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26056m = 0;

    public c() {
        int i10 = 0;
        this.f26049e = null;
        this.f26049e = new a[32];
        while (true) {
            a[] aVarArr = this.f26049e;
            if (i10 >= aVarArr.length) {
                a aVar = new a();
                aVar.f22979a = new J1.c(2, false);
                aVar.f22980b = new J1.c(2, false);
                aVar.f22981c = new e[32];
                this.k = aVar;
                this.f26046b = new b(aVar);
                this.f26057n = new a(aVar);
                return;
            }
            a aVar2 = aVarArr[i10];
            if (aVar2 != null) {
                J1.c cVar = (J1.c) this.k.f22979a;
                int i11 = cVar.f6459b;
                Object[] objArr = cVar.f6458a;
                if (i11 < objArr.length) {
                    objArr[i11] = aVar2;
                    cVar.f6459b = i11 + 1;
                }
            }
            aVarArr[i10] = null;
            i10++;
        }
    }

    public static int m(Object obj) {
        e eVar = ((f) obj).f26577i;
        if (eVar != null) {
            return (int) (eVar.f26061d + 0.5f);
        }
        return 0;
    }

    public final e a(d dVar) {
        J1.c cVar = (J1.c) this.k.f22980b;
        int i10 = cVar.f6459b;
        Object obj = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = cVar.f6458a;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            cVar.f6459b = i11;
            obj = obj2;
        }
        e eVar = (e) obj;
        if (eVar == null) {
            eVar = new e(dVar);
            eVar.f26063f = dVar;
        } else {
            eVar.c();
            eVar.f26063f = dVar;
        }
        int i12 = this.f26056m;
        int i13 = f26044o;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f26044o = i14;
            this.f26055l = (e[]) Arrays.copyOf(this.f26055l, i14);
        }
        e[] eVarArr = this.f26055l;
        int i15 = this.f26056m;
        this.f26056m = i15 + 1;
        eVarArr[i15] = eVar;
        return eVar;
    }

    public final void b(e eVar, e eVar2, int i10, float f10, e eVar3, e eVar4, int i11, int i12) {
        a aVarK = k();
        p100j1.a aVar = aVarK.f26042c;
        if (eVar2 == eVar3) {
            aVar.l(eVar, 1.0f);
            aVar.l(eVar4, 1.0f);
            aVar.l(eVar2, -2.0f);
        } else if (f10 == 0.5f) {
            aVar.l(eVar, 1.0f);
            aVar.l(eVar2, -1.0f);
            aVar.l(eVar3, -1.0f);
            aVar.l(eVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                aVarK.f26041b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            aVar.l(eVar, -1.0f);
            aVar.l(eVar2, 1.0f);
            aVarK.f26041b = i10;
        } else if (f10 >= 1.0f) {
            aVar.l(eVar3, -1.0f);
            aVar.l(eVar4, 1.0f);
            aVarK.f26041b = i11;
        } else {
            float f11 = 1.0f - f10;
            aVar.l(eVar, f11 * 1.0f);
            aVar.l(eVar2, f11 * (-1.0f));
            aVar.l(eVar3, (-1.0f) * f10);
            aVar.l(eVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                aVarK.f26041b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 6) {
            aVarK.a(this, i12);
        }
        c(aVarK);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    public final void c(a aVar) {
        boolean z10;
        boolean z11;
        e eVarG;
        boolean z12 = true;
        if (this.f26053i + 1 >= this.f26054j || this.f26052h + 1 >= this.f26048d) {
            n();
        }
        if (aVar.f26043d) {
            z10 = false;
        } else {
            r(aVar);
            e eVar = aVar.f26040a;
            p100j1.a aVar2 = aVar.f26042c;
            float f10 = 0.0f;
            if (eVar == null && aVar.f26041b == 0.0f && aVar2.f21389b == 0) {
                return;
            }
            float f11 = aVar.f26041b;
            if (f11 < 0.0f) {
                aVar.f26041b = f11 * (-1.0f);
                int i10 = aVar2.f21394g;
                for (int i11 = 0; i10 != -1 && i11 < aVar2.f21389b; i11++) {
                    float[] fArr = aVar2.f21393f;
                    fArr[i10] = fArr[i10] * (-1.0f);
                    i10 = aVar2.f21392e[i10];
                }
            }
            int i12 = aVar2.f21394g;
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i13 = 0;
            e eVar2 = null;
            e eVar3 = null;
            boolean z13 = false;
            boolean z14 = false;
            for (int i14 = -1; i12 != i14 && i13 < aVar2.f21389b; i14 = -1) {
                float[] fArr2 = aVar2.f21393f;
                float f14 = fArr2[i12];
                float f15 = f10;
                e eVar4 = ((e[]) ((a) aVar2.k).f22981c)[aVar2.f21391d[i12]];
                a aVar3 = (a) aVar2.f21397j;
                if (f14 < f15) {
                    if (f14 > -0.001f) {
                        fArr2[i12] = f15;
                        eVar4.b(aVar3);
                        f14 = f15;
                    }
                } else if (f14 < 0.001f) {
                    fArr2[i12] = f15;
                    eVar4.b(aVar3);
                    f14 = f15;
                }
                if (f14 != f15) {
                    if (eVar4.f26063f == d.UNRESTRICTED) {
                        if (eVar3 == null) {
                            if (eVar4.f26066i <= 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            eVar3 = eVar4;
                            f12 = f14;
                        } else {
                            if (f12 > f14) {
                                if (eVar4.f26066i > 1) {
                                    z13 = false;
                                }
                                eVar3 = eVar4;
                                f12 = f14;
                            } else if (z13 || eVar4.f26066i > 1) {
                            }
                            z13 = true;
                            eVar3 = eVar4;
                            f12 = f14;
                        }
                    } else if (eVar3 == null && f14 < f15) {
                        if (eVar2 == null) {
                            if (eVar4.f26066i <= 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            eVar2 = eVar4;
                            f13 = f14;
                        } else {
                            if (f13 > f14) {
                                if (eVar4.f26066i > 1) {
                                    z14 = false;
                                }
                                eVar2 = eVar4;
                                f13 = f14;
                            } else if (z14 || eVar4.f26066i > 1) {
                            }
                            z14 = true;
                            eVar2 = eVar4;
                            f13 = f14;
                        }
                    }
                }
                i12 = aVar2.f21392e[i12];
                i13++;
                f10 = f15;
            }
            float f16 = f10;
            if (eVar3 != null) {
                eVar2 = eVar3;
            }
            if (eVar2 == null) {
                z11 = true;
            } else {
                aVar.e(eVar2);
                z11 = false;
            }
            if (aVar2.f21389b == 0) {
                aVar.f26043d = true;
            }
            if (z11) {
                if (this.f26052h + 1 >= this.f26048d) {
                    n();
                }
                e eVarA = a(d.SLACK);
                int i15 = this.f26045a + 1;
                this.f26045a = i15;
                this.f26052h++;
                eVarA.f26058a = i15;
                ((e[]) this.k.f22981c)[i15] = eVarA;
                aVar.f26040a = eVarA;
                h(aVar);
                a aVar4 = this.f26057n;
                aVar4.f26040a = null;
                p100j1.a aVar5 = aVar4.f26042c;
                aVar5.c();
                for (int i16 = 0; i16 < aVar2.f21389b; i16++) {
                    aVar5.b(aVar2.i(i16), aVar2.j(i16), true);
                }
                p(aVar4);
                if (eVarA.f26059b == -1) {
                    if (aVar.f26040a == eVarA && (eVarG = aVar2.g(null, eVarA)) != null) {
                        aVar.e(eVarG);
                    }
                    if (!aVar.f26043d) {
                        aVar.f26040a.d(aVar);
                    }
                    this.f26053i--;
                }
            } else {
                z12 = false;
            }
            e eVar5 = aVar.f26040a;
            if (eVar5 == null) {
                return;
            }
            if (eVar5.f26063f != d.UNRESTRICTED && aVar.f26041b < f16) {
                return;
            } else {
                z10 = z12;
            }
        }
        if (z10) {
            return;
        }
        h(aVar);
    }

    public final void d(e eVar, int i10) {
        int i11 = eVar.f26059b;
        if (i11 == -1) {
            a aVarK = k();
            aVarK.f26040a = eVar;
            float f10 = i10;
            eVar.f26061d = f10;
            aVarK.f26041b = f10;
            aVarK.f26043d = true;
            c(aVarK);
            return;
        }
        a aVar = this.f26049e[i11];
        if (aVar.f26043d) {
            aVar.f26041b = i10;
            return;
        }
        if (aVar.f26042c.f21389b == 0) {
            aVar.f26043d = true;
            aVar.f26041b = i10;
            return;
        }
        a aVarK2 = k();
        p100j1.a aVar2 = aVarK2.f26042c;
        if (i10 < 0) {
            aVarK2.f26041b = i10 * (-1);
            aVar2.l(eVar, 1.0f);
        } else {
            aVarK2.f26041b = i10;
            aVar2.l(eVar, -1.0f);
        }
        c(aVarK2);
    }

    public final void e(e eVar, e eVar2, int i10, int i11) {
        a aVarK = k();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            aVarK.f26041b = i10;
        }
        p100j1.a aVar = aVarK.f26042c;
        if (z10) {
            aVar.l(eVar, 1.0f);
            aVar.l(eVar2, -1.0f);
        } else {
            aVar.l(eVar, -1.0f);
            aVar.l(eVar2, 1.0f);
        }
        if (i11 != 6) {
            aVarK.a(this, i11);
        }
        c(aVarK);
    }

    public final void f(e eVar, e eVar2, int i10, int i11) {
        a aVarK = k();
        e eVarL = l();
        eVarL.f26060c = 0;
        aVarK.c(eVar, eVar2, eVarL, i10);
        if (i11 != 6) {
            p100j1.a aVar = aVarK.f26042c;
            aVar.l(i(i11), (int) (aVar.e(eVarL) * (-1.0f)));
        }
        c(aVarK);
    }

    public final void g(e eVar, e eVar2, int i10, int i11) {
        a aVarK = k();
        e eVarL = l();
        eVarL.f26060c = 0;
        aVarK.d(eVar, eVar2, eVarL, i10);
        if (i11 != 6) {
            p100j1.a aVar = aVarK.f26042c;
            aVar.l(i(i11), (int) (aVar.e(eVarL) * (-1.0f)));
        }
        c(aVarK);
    }

    public final void h(a aVar) {
        a[] aVarArr = this.f26049e;
        int i10 = this.f26053i;
        a aVar2 = aVarArr[i10];
        if (aVar2 != null) {
            J1.c cVar = (J1.c) this.k.f22979a;
            int i11 = cVar.f6459b;
            Object[] objArr = cVar.f6458a;
            if (i11 < objArr.length) {
                objArr[i11] = aVar2;
                cVar.f6459b = i11 + 1;
            }
        }
        aVarArr[i10] = aVar;
        e eVar = aVar.f26040a;
        eVar.f26059b = i10;
        this.f26053i = i10 + 1;
        eVar.d(aVar);
    }

    public final e i(int i10) {
        if (this.f26052h + 1 >= this.f26048d) {
            n();
        }
        e eVarA = a(d.ERROR);
        int i11 = this.f26045a + 1;
        this.f26045a = i11;
        this.f26052h++;
        eVarA.f26058a = i11;
        eVarA.f26060c = i10;
        ((e[]) this.k.f22981c)[i11] = eVarA;
        this.f26046b.b(eVarA);
        return eVarA;
    }

    public final e j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f26052h + 1 >= this.f26048d) {
            n();
        }
        if (!(obj instanceof f)) {
            return null;
        }
        f fVar = (f) obj;
        e eVar = fVar.f26577i;
        if (eVar == null) {
            fVar.e();
            eVar = fVar.f26577i;
        }
        int i10 = eVar.f26058a;
        a aVar = this.k;
        if (i10 != -1 && i10 <= this.f26045a && ((e[]) aVar.f22981c)[i10] != null) {
            return eVar;
        }
        if (i10 != -1) {
            eVar.c();
        }
        int i11 = this.f26045a + 1;
        this.f26045a = i11;
        this.f26052h++;
        eVar.f26058a = i11;
        eVar.f26063f = d.UNRESTRICTED;
        ((e[]) aVar.f22981c)[i11] = eVar;
        return eVar;
    }

    public final a k() {
        Object obj;
        a aVar = this.k;
        J1.c cVar = (J1.c) aVar.f22979a;
        int i10 = cVar.f6459b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = cVar.f6458a;
            obj = objArr[i11];
            objArr[i11] = null;
            cVar.f6459b = i11;
        } else {
            obj = null;
        }
        a aVar2 = (a) obj;
        if (aVar2 == null) {
            return new a(aVar);
        }
        aVar2.f26040a = null;
        aVar2.f26042c.c();
        aVar2.f26041b = 0.0f;
        aVar2.f26043d = false;
        return aVar2;
    }

    public final e l() {
        if (this.f26052h + 1 >= this.f26048d) {
            n();
        }
        e eVarA = a(d.SLACK);
        int i10 = this.f26045a + 1;
        this.f26045a = i10;
        this.f26052h++;
        eVarA.f26058a = i10;
        ((e[]) this.k.f22981c)[i10] = eVarA;
        return eVarA;
    }

    public final void n() {
        int i10 = this.f26047c * 2;
        this.f26047c = i10;
        this.f26049e = (a[]) Arrays.copyOf(this.f26049e, i10);
        a aVar = this.k;
        aVar.f22981c = (e[]) Arrays.copyOf((e[]) aVar.f22981c, this.f26047c);
        int i11 = this.f26047c;
        this.f26051g = new boolean[i11];
        this.f26048d = i11;
        this.f26054j = i11;
    }

    public final void o(b bVar) {
        a aVar;
        r(bVar);
        for (int i10 = 0; i10 < this.f26053i; i10++) {
            a aVar2 = this.f26049e[i10];
            if (aVar2.f26040a.f26063f != d.UNRESTRICTED) {
                float f10 = 0.0f;
                if (aVar2.f26041b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        int i12 = 1;
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            int i17 = this.f26053i;
                            aVar = this.k;
                            if (i15 >= i17) {
                                break;
                            }
                            a aVar3 = this.f26049e[i15];
                            if (aVar3.f26040a.f26063f != d.UNRESTRICTED && !aVar3.f26043d && aVar3.f26041b < f10) {
                                int i18 = i12;
                                while (i18 < this.f26052h) {
                                    e eVar = ((e[]) aVar.f22981c)[i18];
                                    float fE = aVar3.f26042c.e(eVar);
                                    if (fE > f10) {
                                        for (int i19 = 0; i19 < 7; i19++) {
                                            float f12 = eVar.f26062e[i19] / fE;
                                            if ((f12 < f11 && i19 == i16) || i19 > i16) {
                                                i16 = i19;
                                                f11 = f12;
                                                i13 = i15;
                                                i14 = i18;
                                            }
                                        }
                                    }
                                    i18++;
                                    f10 = 0.0f;
                                }
                            }
                            i15++;
                            f10 = 0.0f;
                            i12 = 1;
                        }
                        if (i13 != -1) {
                            a aVar4 = this.f26049e[i13];
                            aVar4.f26040a.f26059b = -1;
                            aVar4.e(((e[]) aVar.f22981c)[i14]);
                            e eVar2 = aVar4.f26040a;
                            eVar2.f26059b = i13;
                            eVar2.d(aVar4);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f26052h / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                    break;
                }
            }
        }
        p(bVar);
        for (int i20 = 0; i20 < this.f26053i; i20++) {
            a aVar5 = this.f26049e[i20];
            aVar5.f26040a.f26061d = aVar5.f26041b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    public final void p(a aVar) {
        p100j1.a aVar2;
        int i10;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f26052h; i12++) {
            this.f26051g[i12] = false;
        }
        boolean z10 = false;
        int i13 = 0;
        while (!z10) {
            i13++;
            if (i13 >= this.f26052h * 2) {
                return;
            }
            e eVar = aVar.f26040a;
            if (eVar != null) {
                this.f26051g[eVar.f26058a] = true;
            }
            e eVarG = aVar.f26042c.g(this.f26051g, null);
            if (eVarG != null) {
                boolean[] zArr = this.f26051g;
                int i14 = eVarG.f26058a;
                if (zArr[i14]) {
                    return;
                } else {
                    zArr[i14] = true;
                }
            }
            if (eVarG != null) {
                float f10 = Float.MAX_VALUE;
                int i15 = i11;
                int i16 = -1;
                while (i15 < this.f26053i) {
                    a aVar3 = this.f26049e[i15];
                    if (aVar3.f26040a.f26063f != d.UNRESTRICTED && !aVar3.f26043d && (i10 = (aVar2 = aVar3.f26042c).f21394g) != -1) {
                        for (int i17 = i11; i10 != -1 && i17 < aVar2.f21389b; i17++) {
                            if (aVar2.f21391d[i10] == eVarG.f26058a) {
                                float fE = aVar2.e(eVarG);
                                if (fE >= 0.0f) {
                                    break;
                                }
                                float f11 = (-aVar3.f26041b) / fE;
                                if (f11 >= f10) {
                                    break;
                                }
                                i16 = i15;
                                f10 = f11;
                                break;
                            }
                            i10 = aVar2.f21392e[i10];
                        }
                    }
                    i15++;
                    i11 = 0;
                }
                if (i16 > -1) {
                    a aVar4 = this.f26049e[i16];
                    aVar4.f26040a.f26059b = -1;
                    aVar4.e(eVarG);
                    e eVar2 = aVar4.f26040a;
                    eVar2.f26059b = i16;
                    eVar2.d(aVar4);
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            i11 = 0;
        }
    }

    public final void q() {
        a aVar;
        int i10 = 0;
        while (true) {
            aVar = this.k;
            e[] eVarArr = (e[]) aVar.f22981c;
            if (i10 >= eVarArr.length) {
                break;
            }
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.c();
            }
            i10++;
        }
        J1.c cVar = (J1.c) aVar.f22980b;
        e[] eVarArr2 = this.f26055l;
        int length = this.f26056m;
        cVar.getClass();
        if (length > eVarArr2.length) {
            length = eVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            e eVar2 = eVarArr2[i11];
            int i12 = cVar.f6459b;
            Object[] objArr = cVar.f6458a;
            if (i12 < objArr.length) {
                objArr[i12] = eVar2;
                cVar.f6459b = i12 + 1;
            }
        }
        this.f26056m = 0;
        Arrays.fill((e[]) aVar.f22981c, (Object) null);
        this.f26045a = 0;
        b bVar = this.f26046b;
        bVar.f26042c.c();
        bVar.f26040a = null;
        bVar.f26041b = 0.0f;
        this.f26052h = 1;
        for (int i13 = 0; i13 < this.f26053i; i13++) {
            this.f26049e[i13].getClass();
        }
        int i14 = 0;
        while (true) {
            a[] aVarArr = this.f26049e;
            if (i14 >= aVarArr.length) {
                this.f26053i = 0;
                return;
            }
            a aVar2 = aVarArr[i14];
            if (aVar2 != null) {
                J1.c cVar2 = (J1.c) aVar.f22979a;
                int i15 = cVar2.f6459b;
                Object[] objArr2 = cVar2.f6458a;
                if (i15 < objArr2.length) {
                    objArr2[i15] = aVar2;
                    cVar2.f6459b = i15 + 1;
                }
            }
            aVarArr[i14] = null;
            i14++;
        }
    }

    public final void r(a aVar) {
        a aVar2;
        e eVar;
        if (this.f26053i > 0) {
            p100j1.a aVar3 = aVar.f26042c;
            a[] aVarArr = this.f26049e;
            int i10 = aVar3.f21394g;
            loop0: while (true) {
                int i11 = 0;
                while (true) {
                    if (i10 == -1 || i11 >= aVar3.f21389b) {
                        break loop0;
                    }
                    aVar2 = (a) aVar3.k;
                    eVar = ((e[]) aVar2.f22981c)[aVar3.f21391d[i10]];
                    if (eVar.f26059b != -1) {
                        break;
                    }
                    i10 = aVar3.f21392e[i10];
                    i11++;
                }
                float f10 = aVar3.f21393f[i10];
                aVar3.n(eVar, true);
                a aVar4 = aVarArr[eVar.f26059b];
                if (!aVar4.f26043d) {
                    p100j1.a aVar5 = aVar4.f26042c;
                    int i12 = aVar5.f21394g;
                    for (int i13 = 0; i12 != -1 && i13 < aVar5.f21389b; i13++) {
                        aVar3.b(((e[]) aVar2.f22981c)[aVar5.f21391d[i12]], aVar5.f21393f[i12] * f10, true);
                        i12 = aVar5.f21392e[i12];
                    }
                }
                aVar.f26041b = (aVar4.f26041b * f10) + aVar.f26041b;
                aVar4.f26040a.b(aVar);
                i10 = aVar3.f21394g;
            }
            if (aVar.f26042c.f21389b == 0) {
                aVar.f26043d = true;
            }
        }
    }
}
