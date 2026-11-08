package p100j1;

import U.W0;
import W9.j;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p174q1.d;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f21403q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f21407d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final W0 f21415m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f21418p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21404a = PipesIterator.DEFAULT_QUEUE_SIZE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21405b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21406c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21408e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21409f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21411h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f21412i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21413j = 1;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21414l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f[] f21416n = new f[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21417o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f21410g = new b[32];

    public c() {
        s();
        W0 w10 = new W0(20, false);
        w10.f11833c = new J1.c(1, false);
        w10.f11832b = new J1.c(1, false);
        w10.f11834d = new f[32];
        this.f21415m = w10;
        d dVar = new d(w10);
        dVar.f21419f = new f[ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD];
        dVar.f21420g = new f[ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD];
        dVar.f21421h = 0;
        dVar.f21422i = new j(dVar);
        this.f21407d = dVar;
        this.f21418p = new b(w10);
    }

    public static int n(Object obj) {
        f fVar = ((d) obj).f25515i;
        if (fVar != null) {
            return (int) (fVar.f21427e + 0.5f);
        }
        return 0;
    }

    public final f a(e eVar) {
        J1.c cVar = (J1.c) this.f21415m.f11832b;
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
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = new f(eVar);
            fVar.f21431i = eVar;
        } else {
            fVar.c();
            fVar.f21431i = eVar;
        }
        int i12 = this.f21417o;
        int i13 = this.f21404a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f21404a = i14;
            this.f21416n = (f[]) Arrays.copyOf(this.f21416n, i14);
        }
        f[] fVarArr = this.f21416n;
        int i15 = this.f21417o;
        this.f21417o = i15 + 1;
        fVarArr[i15] = fVar;
        return fVar;
    }

    public final void b(f fVar, f fVar2, int i10, float f10, f fVar3, f fVar4, int i11, int i12) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f21401d.k(fVar, 1.0f);
            bVarL.f21401d.k(fVar4, 1.0f);
            bVarL.f21401d.k(fVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f21401d.k(fVar, 1.0f);
            bVarL.f21401d.k(fVar2, -1.0f);
            bVarL.f21401d.k(fVar3, -1.0f);
            bVarL.f21401d.k(fVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                bVarL.f21399b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f21401d.k(fVar, -1.0f);
            bVarL.f21401d.k(fVar2, 1.0f);
            bVarL.f21399b = i10;
        } else if (f10 >= 1.0f) {
            bVarL.f21401d.k(fVar4, -1.0f);
            bVarL.f21401d.k(fVar3, 1.0f);
            bVarL.f21399b = -i11;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f21401d.k(fVar, f11 * 1.0f);
            bVarL.f21401d.k(fVar2, f11 * (-1.0f));
            bVarL.f21401d.k(fVar3, (-1.0f) * f10);
            bVarL.f21401d.k(fVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                bVarL.f21399b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            bVarL.a(this, i12);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    public final void c(b bVar) {
        boolean z10;
        boolean z11;
        f fVarF;
        ArrayList arrayList;
        boolean z12 = true;
        if (this.k + 1 >= this.f21414l || this.f21413j + 1 >= this.f21409f) {
            o();
        }
        if (bVar.f21402e) {
            z10 = false;
        } else {
            if (this.f21410g.length != 0) {
                boolean z13 = false;
                while (!z13) {
                    int iF = bVar.f21401d.f();
                    int i10 = 0;
                    while (true) {
                        arrayList = bVar.f21400c;
                        if (i10 >= iF) {
                            break;
                        }
                        f fVarH = bVar.f21401d.h(i10);
                        if (fVarH.f21425c != -1 || fVarH.f21428f) {
                            arrayList.add(fVarH);
                        }
                        i10++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            f fVar = (f) arrayList.get(i11);
                            if (fVar.f21428f) {
                                bVar.h(this, fVar, true);
                            } else {
                                bVar.i(this, this.f21410g[fVar.f21425c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z13 = true;
                    }
                }
                if (bVar.f21398a != null && bVar.f21401d.f() == 0) {
                    bVar.f21402e = true;
                    this.f21405b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f10 = bVar.f21399b;
            float f11 = 0.0f;
            if (f10 < 0.0f) {
                bVar.f21399b = f10 * (-1.0f);
                a aVar = bVar.f21401d;
                int i12 = aVar.f21394g;
                for (int i13 = 0; i12 != -1 && i13 < aVar.f21389b; i13++) {
                    float[] fArr = aVar.f21393f;
                    fArr[i12] = fArr[i12] * (-1.0f);
                    i12 = aVar.f21392e[i12];
                }
            }
            int iF2 = bVar.f21401d.f();
            float f12 = 0.0f;
            float f13 = 0.0f;
            f fVar2 = null;
            f fVar3 = null;
            int i14 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i14 < iF2) {
                float fJ = bVar.f21401d.j(i14);
                f fVarH2 = bVar.f21401d.h(i14);
                float f14 = f11;
                if (fVarH2.f21431i == e.UNRESTRICTED) {
                    if (fVar2 == null) {
                        if (fVarH2.f21433l <= 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        fVar2 = fVarH2;
                        f12 = fJ;
                    } else {
                        if (f12 > fJ) {
                            if (fVarH2.f21433l > 1) {
                                z14 = false;
                            }
                            fVar2 = fVarH2;
                            f12 = fJ;
                        } else if (z14 || fVarH2.f21433l > 1) {
                        }
                        z14 = true;
                        fVar2 = fVarH2;
                        f12 = fJ;
                    }
                } else if (fVar2 == null && fJ < f14) {
                    if (fVar3 == null) {
                        if (fVarH2.f21433l <= 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        fVar3 = fVarH2;
                        f13 = fJ;
                    } else {
                        if (f13 > fJ) {
                            if (fVarH2.f21433l > 1) {
                                z15 = false;
                            }
                            fVar3 = fVarH2;
                            f13 = fJ;
                        } else if (z15 || fVarH2.f21433l > 1) {
                        }
                        z15 = true;
                        fVar3 = fVarH2;
                        f13 = fJ;
                    }
                }
                i14++;
                f11 = f14;
            }
            float f15 = f11;
            if (fVar2 == null) {
                fVar2 = fVar3;
            }
            if (fVar2 == null) {
                z11 = true;
            } else {
                bVar.g(fVar2);
                z11 = false;
            }
            if (bVar.f21401d.f() == 0) {
                bVar.f21402e = true;
            }
            if (z11) {
                if (this.f21413j + 1 >= this.f21409f) {
                    o();
                }
                f fVarA = a(e.SLACK);
                int i15 = this.f21406c + 1;
                this.f21406c = i15;
                this.f21413j++;
                fVarA.f21424b = i15;
                W0 w10 = this.f21415m;
                ((f[]) w10.f11834d)[i15] = fVarA;
                bVar.f21398a = fVarA;
                int i16 = this.k;
                h(bVar);
                if (this.k == i16 + 1) {
                    b bVar2 = this.f21418p;
                    bVar2.f21398a = null;
                    bVar2.f21401d.c();
                    for (int i17 = 0; i17 < bVar.f21401d.f(); i17++) {
                        bVar2.f21401d.a(bVar.f21401d.h(i17), bVar.f21401d.j(i17), true);
                    }
                    r(this.f21418p);
                    if (fVarA.f21425c == -1) {
                        if (bVar.f21398a == fVarA && (fVarF = bVar.f(null, fVarA)) != null) {
                            bVar.g(fVarF);
                        }
                        if (!bVar.f21402e) {
                            bVar.f21398a.e(this, bVar);
                        }
                        ((J1.c) w10.f11833c).b(bVar);
                        this.k--;
                    }
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            f fVar4 = bVar.f21398a;
            if (fVar4 == null) {
                return;
            }
            if (fVar4.f21431i != e.UNRESTRICTED && bVar.f21399b < f15) {
                return;
            } else {
                z10 = z12;
            }
        }
        if (z10) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i10) {
        int i11 = fVar.f21425c;
        if (i11 == -1) {
            fVar.d(this, i10);
            for (int i12 = 0; i12 < this.f21406c + 1; i12++) {
                f fVar2 = ((f[]) this.f21415m.f11834d)[i12];
            }
            return;
        }
        if (i11 == -1) {
            b bVarL = l();
            bVarL.f21398a = fVar;
            float f10 = i10;
            fVar.f21427e = f10;
            bVarL.f21399b = f10;
            bVarL.f21402e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f21410g[i11];
        if (bVar.f21402e) {
            bVar.f21399b = i10;
            return;
        }
        if (bVar.f21401d.f() == 0) {
            bVar.f21402e = true;
            bVar.f21399b = i10;
            return;
        }
        b bVarL2 = l();
        if (i10 < 0) {
            bVarL2.f21399b = i10 * (-1);
            bVarL2.f21401d.k(fVar, 1.0f);
        } else {
            bVarL2.f21399b = i10;
            bVarL2.f21401d.k(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i10, int i11) {
        if (i11 == 8 && fVar2.f21428f && fVar.f21425c == -1) {
            fVar.d(this, fVar2.f21427e + i10);
            return;
        }
        b bVarL = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            bVarL.f21399b = i10;
        }
        if (z10) {
            bVarL.f21401d.k(fVar, 1.0f);
            bVarL.f21401d.k(fVar2, -1.0f);
        } else {
            bVarL.f21401d.k(fVar, -1.0f);
            bVarL.f21401d.k(fVar2, 1.0f);
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f21426d = 0;
        bVarL.b(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f21401d.k(j(i11), (int) (bVarL.f21401d.d(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f21426d = 0;
        bVarL.c(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f21401d.k(j(i11), (int) (bVarL.f21401d.d(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f21402e) {
            bVar.f21398a.d(this, bVar.f21399b);
        } else {
            b[] bVarArr = this.f21410g;
            int i11 = this.k;
            bVarArr[i11] = bVar;
            f fVar = bVar.f21398a;
            fVar.f21425c = i11;
            this.k = i11 + 1;
            fVar.e(this, bVar);
        }
        if (this.f21405b) {
            int i12 = 0;
            while (i12 < this.k) {
                if (this.f21410g[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f21410g[i12];
                if (bVar2 != null && bVar2.f21402e) {
                    bVar2.f21398a.d(this, bVar2.f21399b);
                    ((J1.c) this.f21415m.f11833c).b(bVar2);
                    this.f21410g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.k;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f21410g;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        f fVar2 = bVar3.f21398a;
                        if (fVar2.f21425c == i13) {
                            fVar2.f21425c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f21410g[i14] = null;
                    }
                    this.k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f21405b = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.k; i10++) {
            b bVar = this.f21410g[i10];
            bVar.f21398a.f21427e = bVar.f21399b;
        }
    }

    public final f j(int i10) {
        if (this.f21413j + 1 >= this.f21409f) {
            o();
        }
        f fVarA = a(e.ERROR);
        int i11 = this.f21406c + 1;
        this.f21406c = i11;
        this.f21413j++;
        fVarA.f21424b = i11;
        fVarA.f21426d = i10;
        ((f[]) this.f21415m.f11834d)[i11] = fVarA;
        d dVar = this.f21407d;
        dVar.f21422i.f12983b = fVarA;
        float[] fArr = fVarA.f21430h;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f21426d] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f21413j + 1 >= this.f21409f) {
            o();
        }
        if (!(obj instanceof d)) {
            return null;
        }
        d dVar = (d) obj;
        f fVar = dVar.f25515i;
        if (fVar == null) {
            dVar.k();
            fVar = dVar.f25515i;
        }
        int i10 = fVar.f21424b;
        W0 w10 = this.f21415m;
        if (i10 != -1 && i10 <= this.f21406c && ((f[]) w10.f11834d)[i10] != null) {
            return fVar;
        }
        if (i10 != -1) {
            fVar.c();
        }
        int i11 = this.f21406c + 1;
        this.f21406c = i11;
        this.f21413j++;
        fVar.f21424b = i11;
        fVar.f21431i = e.UNRESTRICTED;
        ((f[]) w10.f11834d)[i11] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        W0 w10 = this.f21415m;
        J1.c cVar = (J1.c) w10.f11833c;
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
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(w10);
        }
        bVar.f21398a = null;
        bVar.f21401d.c();
        bVar.f21399b = 0.0f;
        bVar.f21402e = false;
        return bVar;
    }

    public final f m() {
        if (this.f21413j + 1 >= this.f21409f) {
            o();
        }
        f fVarA = a(e.SLACK);
        int i10 = this.f21406c + 1;
        this.f21406c = i10;
        this.f21413j++;
        fVarA.f21424b = i10;
        ((f[]) this.f21415m.f11834d)[i10] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i10 = this.f21408e * 2;
        this.f21408e = i10;
        this.f21410g = (b[]) Arrays.copyOf(this.f21410g, i10);
        W0 w10 = this.f21415m;
        w10.f11834d = (f[]) Arrays.copyOf((f[]) w10.f11834d, this.f21408e);
        int i11 = this.f21408e;
        this.f21412i = new boolean[i11];
        this.f21409f = i11;
        this.f21414l = i11;
    }

    public final void p() {
        d dVar = this.f21407d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f21411h) {
            q(dVar);
            return;
        }
        for (int i10 = 0; i10 < this.k; i10++) {
            if (!this.f21410g[i10].f21402e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        for (int i10 = 0; i10 < this.k; i10++) {
            b bVar = this.f21410g[i10];
            if (bVar.f21398a.f21431i != e.UNRESTRICTED) {
                float f10 = 0.0f;
                if (bVar.f21399b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.k) {
                            b bVar2 = this.f21410g[i14];
                            if (bVar2.f21398a.f21431i != e.UNRESTRICTED && !bVar2.f21402e && bVar2.f21399b < f10) {
                                int iF = bVar2.f21401d.f();
                                int i16 = 0;
                                while (i16 < iF) {
                                    f fVarH = bVar2.f21401d.h(i16);
                                    float fD = bVar2.f21401d.d(fVarH);
                                    if (fD > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = fVarH.f21429g[i17] / fD;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = fVarH.f21424b;
                                                i12 = i14;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = 0.0f;
                                }
                            }
                            i14++;
                            f10 = 0.0f;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f21410g[i12];
                            bVar3.f21398a.f21425c = -1;
                            bVar3.g(((f[]) this.f21415m.f11834d)[i13]);
                            f fVar = bVar3.f21398a;
                            fVar.f21425c = i12;
                            fVar.e(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f21413j / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z10;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21413j; i11++) {
            this.f21412i[i11] = false;
        }
        boolean z11 = false;
        int i12 = 0;
        while (!z11) {
            i12++;
            if (i12 >= this.f21413j * 2) {
                return;
            }
            f fVar = bVar.f21398a;
            if (fVar != null) {
                this.f21412i[fVar.f21424b] = true;
            }
            f fVarD = bVar.d(this.f21412i);
            if (fVarD != null) {
                boolean[] zArr = this.f21412i;
                int i13 = fVarD.f21424b;
                if (zArr[i13]) {
                    return;
                } else {
                    zArr[i13] = true;
                }
            }
            if (fVarD != null) {
                float f10 = Float.MAX_VALUE;
                int i14 = -1;
                for (int i15 = i10; i15 < this.k; i15++) {
                    b bVar2 = this.f21410g[i15];
                    if (bVar2.f21398a.f21431i != e.UNRESTRICTED && !bVar2.f21402e) {
                        a aVar = bVar2.f21401d;
                        int i16 = aVar.f21394g;
                        if (i16 == -1) {
                            z10 = false;
                            break;
                        }
                        int i17 = 0;
                        while (true) {
                            if (i16 == -1 || i17 >= aVar.f21389b) {
                                z10 = false;
                                break;
                            } else if (aVar.f21391d[i16] == fVarD.f21424b) {
                                z10 = true;
                                break;
                            } else {
                                i16 = aVar.f21392e[i16];
                                i17++;
                            }
                        }
                        if (z10) {
                            float fD = bVar2.f21401d.d(fVarD);
                            if (fD < 0.0f) {
                                float f11 = (-bVar2.f21399b) / fD;
                                if (f11 < f10) {
                                    i14 = i15;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                }
                if (i14 > -1) {
                    b bVar3 = this.f21410g[i14];
                    bVar3.f21398a.f21425c = -1;
                    bVar3.g(fVarD);
                    f fVar2 = bVar3.f21398a;
                    fVar2.f21425c = i14;
                    fVar2.e(this, bVar3);
                }
            } else {
                z11 = true;
            }
            i10 = 0;
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.k; i10++) {
            b bVar = this.f21410g[i10];
            if (bVar != null) {
                ((J1.c) this.f21415m.f11833c).b(bVar);
            }
            this.f21410g[i10] = null;
        }
    }

    public final void t() {
        W0 w10;
        int i10 = 0;
        while (true) {
            w10 = this.f21415m;
            f[] fVarArr = (f[]) w10.f11834d;
            if (i10 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i10];
            if (fVar != null) {
                fVar.c();
            }
            i10++;
        }
        J1.c cVar = (J1.c) w10.f11832b;
        f[] fVarArr2 = this.f21416n;
        int length = this.f21417o;
        cVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            f fVar2 = fVarArr2[i11];
            int i12 = cVar.f6459b;
            Object[] objArr = cVar.f6458a;
            if (i12 < objArr.length) {
                objArr[i12] = fVar2;
                cVar.f6459b = i12 + 1;
            }
        }
        this.f21417o = 0;
        Arrays.fill((f[]) w10.f11834d, (Object) null);
        this.f21406c = 0;
        d dVar = this.f21407d;
        dVar.f21421h = 0;
        dVar.f21399b = 0.0f;
        this.f21413j = 1;
        for (int i13 = 0; i13 < this.k; i13++) {
            b bVar = this.f21410g[i13];
        }
        s();
        this.k = 0;
        this.f21418p = new b(w10);
    }
}
