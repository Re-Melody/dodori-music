package p255y2;

import A6.E;
import B2.AbstractC0111a;
import B2.AbstractC0112b;
import B2.C;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p134m1.b;

/* JADX INFO: renamed from: y2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2339o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f28932A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f28933B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f28934C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f28935D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f28936E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f28937F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f28938G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f28939H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f28940I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f28941J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f28942K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f28945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f28952j;
    public final B k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f28953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f28954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f28955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f28956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f28957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2336l f28958q;
    public final long r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f28959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f28960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f28961u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f28962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f28963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[] f28964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f28965y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C2332h f28966z;

    static {
        new C2338n().a();
        C.D(0);
        C.D(1);
        C.D(2);
        C.D(3);
        C.D(4);
        b.y(5, 6, 7, 8, 9);
        b.y(10, 11, 12, 13, 14);
        b.y(15, 16, 17, 18, 19);
        b.y(20, 21, 22, 23, 24);
        b.y(25, 26, 27, 28, 29);
        C.D(30);
        C.D(31);
        C.D(32);
    }

    public C2339o(C2338n c2338n) {
        boolean z10;
        String str;
        this.f28943a = c2338n.f28908a;
        String strJ = C.J(c2338n.f28911d);
        this.f28946d = strJ;
        if (c2338n.f28910c.isEmpty() && c2338n.f28909b != null) {
            this.f28945c = E.x(new C2340p(strJ, c2338n.f28909b));
            this.f28944b = c2338n.f28909b;
        } else if (c2338n.f28910c.isEmpty() || c2338n.f28909b != null) {
            if (!c2338n.f28910c.isEmpty() || c2338n.f28909b != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= c2338n.f28910c.size()) {
                        z10 = false;
                        break;
                    } else {
                        if (((C2340p) c2338n.f28910c.get(i10)).f28968b.equals(c2338n.f28909b)) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            AbstractC0111a.h(z10);
            this.f28945c = c2338n.f28910c;
            this.f28944b = c2338n.f28909b;
        } else {
            E e2 = c2338n.f28910c;
            this.f28945c = e2;
            Iterator it = e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C2340p) e2.get(0)).f28968b;
                    break;
                }
                C2340p c2340p = (C2340p) it.next();
                if (TextUtils.equals(c2340p.f28967a, strJ)) {
                    str = c2340p.f28968b;
                    break;
                }
            }
            this.f28944b = str;
        }
        this.f28947e = c2338n.f28912e;
        this.f28948f = c2338n.f28913f;
        int i11 = c2338n.f28914g;
        this.f28949g = i11;
        int i12 = c2338n.f28915h;
        this.f28950h = i12;
        this.f28951i = i12 != -1 ? i12 : i11;
        this.f28952j = c2338n.f28916i;
        this.k = c2338n.f28917j;
        this.f28953l = c2338n.k;
        this.f28954m = c2338n.f28918l;
        this.f28955n = c2338n.f28919m;
        this.f28956o = c2338n.f28920n;
        List list = c2338n.f28921o;
        this.f28957p = list == null ? Collections.EMPTY_LIST : list;
        C2336l c2336l = c2338n.f28922p;
        this.f28958q = c2336l;
        this.r = c2338n.f28923q;
        this.f28959s = c2338n.r;
        this.f28960t = c2338n.f28924s;
        this.f28961u = c2338n.f28925t;
        int i13 = c2338n.f28926u;
        this.f28962v = i13 == -1 ? 0 : i13;
        float f10 = c2338n.f28927v;
        this.f28963w = f10 == -1.0f ? 1.0f : f10;
        this.f28964x = c2338n.f28928w;
        this.f28965y = c2338n.f28929x;
        this.f28966z = c2338n.f28930y;
        this.f28932A = c2338n.f28931z;
        this.f28933B = c2338n.f28899A;
        this.f28934C = c2338n.f28900B;
        int i14 = c2338n.f28901C;
        this.f28935D = i14 == -1 ? 0 : i14;
        int i15 = c2338n.f28902D;
        this.f28936E = i15 != -1 ? i15 : 0;
        this.f28937F = c2338n.f28903E;
        this.f28938G = c2338n.f28904F;
        this.f28939H = c2338n.f28905G;
        this.f28940I = c2338n.f28906H;
        int i16 = c2338n.f28907I;
        if (i16 != 0 || c2336l == null) {
            this.f28941J = i16;
        } else {
            this.f28941J = 1;
        }
    }

    public final C2338n a() {
        C2338n c2338n = new C2338n();
        c2338n.f28908a = this.f28943a;
        c2338n.f28909b = this.f28944b;
        c2338n.f28910c = this.f28945c;
        c2338n.f28911d = this.f28946d;
        c2338n.f28912e = this.f28947e;
        c2338n.f28913f = this.f28948f;
        c2338n.f28914g = this.f28949g;
        c2338n.f28915h = this.f28950h;
        c2338n.f28916i = this.f28952j;
        c2338n.f28917j = this.k;
        c2338n.k = this.f28953l;
        c2338n.f28918l = this.f28954m;
        c2338n.f28919m = this.f28955n;
        c2338n.f28920n = this.f28956o;
        c2338n.f28921o = this.f28957p;
        c2338n.f28922p = this.f28958q;
        c2338n.f28923q = this.r;
        c2338n.r = this.f28959s;
        c2338n.f28924s = this.f28960t;
        c2338n.f28925t = this.f28961u;
        c2338n.f28926u = this.f28962v;
        c2338n.f28927v = this.f28963w;
        c2338n.f28928w = this.f28964x;
        c2338n.f28929x = this.f28965y;
        c2338n.f28930y = this.f28966z;
        c2338n.f28931z = this.f28932A;
        c2338n.f28899A = this.f28933B;
        c2338n.f28900B = this.f28934C;
        c2338n.f28901C = this.f28935D;
        c2338n.f28902D = this.f28936E;
        c2338n.f28903E = this.f28937F;
        c2338n.f28904F = this.f28938G;
        c2338n.f28905G = this.f28939H;
        c2338n.f28906H = this.f28940I;
        c2338n.f28907I = this.f28941J;
        return c2338n;
    }

    public final boolean b(C2339o c2339o) {
        List list = this.f28957p;
        if (list.size() != c2339o.f28957p.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) c2339o.f28957p.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final C2339o c(C2339o c2339o) {
        String str;
        String str2;
        C2335k[] c2335kArr;
        if (this == c2339o) {
            return this;
        }
        int iG = C.g(this.f28954m);
        String str3 = c2339o.f28943a;
        String str4 = c2339o.f28944b;
        if (str4 == null) {
            str4 = this.f28944b;
        }
        E e2 = c2339o.f28945c;
        if (e2.isEmpty()) {
            e2 = this.f28945c;
        }
        if ((iG != 3 && iG != 1) || (str = c2339o.f28946d) == null) {
            str = this.f28946d;
        }
        int i10 = this.f28949g;
        if (i10 == -1) {
            i10 = c2339o.f28949g;
        }
        int i11 = this.f28950h;
        if (i11 == -1) {
            i11 = c2339o.f28950h;
        }
        String str5 = this.f28952j;
        if (str5 == null) {
            String strT = C.t(iG, c2339o.f28952j);
            if (C.S(strT).length == 1) {
                str5 = strT;
            }
        }
        B b10 = c2339o.k;
        B b11 = this.k;
        if (b11 != null) {
            b10 = b11.b(b10);
        }
        float f10 = this.f28961u;
        if (f10 == -1.0f && iG == 2) {
            f10 = c2339o.f28961u;
        }
        int i12 = this.f28947e | c2339o.f28947e;
        int i13 = this.f28948f | c2339o.f28948f;
        ArrayList arrayList = new ArrayList();
        C2336l c2336l = c2339o.f28958q;
        if (c2336l != null) {
            C2335k[] c2335kArr2 = c2336l.f28894a;
            int length = c2335kArr2.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = length;
                C2335k c2335k = c2335kArr2[i14];
                int i16 = i14;
                if (c2335k.f28893e != null) {
                    arrayList.add(c2335k);
                }
                i14 = i16 + 1;
                length = i15;
            }
            str2 = c2336l.f28896c;
        } else {
            str2 = null;
        }
        C2336l c2336l2 = this.f28958q;
        if (c2336l2 != null) {
            if (str2 == null) {
                str2 = c2336l2.f28896c;
            }
            int size = arrayList.size();
            C2335k[] c2335kArr3 = c2336l2.f28894a;
            int length2 = c2335kArr3.length;
            String str6 = str2;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = length2;
                C2335k c2335k2 = c2335kArr3[i17];
                int i19 = i17;
                if (c2335k2.f28893e != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            c2335kArr = c2335kArr3;
                            arrayList.add(c2335k2);
                            break;
                        }
                        int i21 = i20;
                        c2335kArr = c2335kArr3;
                        if (((C2335k) arrayList.get(i20)).f28890b.equals(c2335k2.f28890b)) {
                            break;
                        }
                        i20 = i21 + 1;
                        c2335kArr3 = c2335kArr;
                    }
                } else {
                    c2335kArr = c2335kArr3;
                }
                i17 = i19 + 1;
                length2 = i18;
                c2335kArr3 = c2335kArr;
            }
            str2 = str6;
        }
        C2336l c2336l3 = arrayList.isEmpty() ? null : new C2336l(str2, arrayList);
        C2338n c2338nA = a();
        c2338nA.f28908a = str3;
        c2338nA.f28909b = str4;
        c2338nA.f28910c = E.r(e2);
        c2338nA.f28911d = str;
        c2338nA.f28912e = i12;
        c2338nA.f28913f = i13;
        c2338nA.f28914g = i10;
        c2338nA.f28915h = i11;
        c2338nA.f28916i = str5;
        c2338nA.f28917j = b10;
        c2338nA.f28922p = c2336l3;
        c2338nA.f28925t = f10;
        c2338nA.f28905G = c2339o.f28939H;
        c2338nA.f28906H = c2339o.f28940I;
        return new C2339o(c2338nA);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2339o.class != obj.getClass()) {
            return false;
        }
        C2339o c2339o = (C2339o) obj;
        int i11 = this.f28942K;
        return (i11 == 0 || (i10 = c2339o.f28942K) == 0 || i11 == i10) && this.f28947e == c2339o.f28947e && this.f28948f == c2339o.f28948f && this.f28949g == c2339o.f28949g && this.f28950h == c2339o.f28950h && this.f28955n == c2339o.f28955n && this.r == c2339o.r && this.f28959s == c2339o.f28959s && this.f28960t == c2339o.f28960t && this.f28962v == c2339o.f28962v && this.f28965y == c2339o.f28965y && this.f28932A == c2339o.f28932A && this.f28933B == c2339o.f28933B && this.f28934C == c2339o.f28934C && this.f28935D == c2339o.f28935D && this.f28936E == c2339o.f28936E && this.f28937F == c2339o.f28937F && this.f28939H == c2339o.f28939H && this.f28940I == c2339o.f28940I && this.f28941J == c2339o.f28941J && Float.compare(this.f28961u, c2339o.f28961u) == 0 && Float.compare(this.f28963w, c2339o.f28963w) == 0 && Objects.equals(this.f28943a, c2339o.f28943a) && Objects.equals(this.f28944b, c2339o.f28944b) && this.f28945c.equals(c2339o.f28945c) && Objects.equals(this.f28952j, c2339o.f28952j) && Objects.equals(this.f28953l, c2339o.f28953l) && Objects.equals(this.f28954m, c2339o.f28954m) && Objects.equals(this.f28946d, c2339o.f28946d) && Arrays.equals(this.f28964x, c2339o.f28964x) && Objects.equals(this.k, c2339o.k) && Objects.equals(this.f28966z, c2339o.f28966z) && Objects.equals(this.f28958q, c2339o.f28958q) && b(c2339o);
    }

    public final int hashCode() {
        if (this.f28942K == 0) {
            String str = this.f28943a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28944b;
            int iHashCode2 = (this.f28945c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f28946d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f28947e) * 31) + this.f28948f) * 31) + this.f28949g) * 31) + this.f28950h) * 31;
            String str4 = this.f28952j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            B b10 = this.k;
            int iHashCode5 = (iHashCode4 + (b10 == null ? 0 : b10.hashCode())) * 961;
            String str5 = this.f28953l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f28954m;
            this.f28942K = ((((((((((((((((((((Float.floatToIntBits(this.f28963w) + ((((Float.floatToIntBits(this.f28961u) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f28955n) * 31) + ((int) this.r)) * 31) + this.f28959s) * 31) + this.f28960t) * 31)) * 31) + this.f28962v) * 31)) * 31) + this.f28965y) * 31) + this.f28932A) * 31) + this.f28933B) * 31) + this.f28934C) * 31) + this.f28935D) * 31) + this.f28936E) * 31) + this.f28937F) * 31) + this.f28939H) * 31) + this.f28940I) * 31) + this.f28941J;
        }
        return this.f28942K;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f28943a);
        sb.append(", ");
        sb.append(this.f28944b);
        sb.append(", ");
        sb.append(this.f28953l);
        sb.append(", ");
        sb.append(this.f28954m);
        sb.append(", ");
        sb.append(this.f28952j);
        sb.append(", ");
        sb.append(this.f28951i);
        sb.append(", ");
        sb.append(this.f28946d);
        sb.append(", [");
        sb.append(this.f28959s);
        sb.append(", ");
        sb.append(this.f28960t);
        sb.append(", ");
        sb.append(this.f28961u);
        sb.append(", ");
        sb.append(this.f28966z);
        sb.append("], [");
        sb.append(this.f28932A);
        sb.append(", ");
        return AbstractC0112b.i(sb, this.f28933B, "])");
    }
}
