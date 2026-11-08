package p140m7;

import D7.p1;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p170p7.d;
import p170p7.h;
import p170p7.k;
import p170p7.p;
import p170p7.s;
import p170p7.t;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f22419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2051c f22422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2051c f22423h;

    public N(p pVar, String str, List list, List list2, long j10, C2051c c2051c, C2051c c2051c2) {
        this.f22419d = pVar;
        this.f22420e = str;
        this.f22417b = list2;
        this.f22418c = list;
        this.f22421f = j10;
        this.f22422g = c2051c;
        this.f22423h = c2051c2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[PHI: r4
  0x0085: PHI (r4v9 D7.p1) = 
  (r4v8 D7.p1)
  (r4v8 D7.p1)
  (r4v8 D7.p1)
  (r4v12 D7.p1)
  (r4v13 D7.p1)
  (r4v14 D7.p1)
  (r4v15 D7.p1)
  (r4v16 D7.p1)
  (r4v17 D7.p1)
  (r4v18 D7.p1)
  (r4v19 D7.p1)
  (r4v20 D7.p1)
  (r4v22 D7.p1)
  (r4v23 D7.p1)
 binds: [B:6:0x002b, B:8:0x002e, B:9:0x0030, B:28:0x0083, B:27:0x0080, B:26:0x007d, B:25:0x007a, B:24:0x0077, B:23:0x0074, B:22:0x0071, B:21:0x006e, B:20:0x006b, B:19:0x0068, B:18:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Switch 'out' block B:29:0x0085 for B:13:0x0044 already processed. Defaulting to fallback option. */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    public final Pair a(d dVar, C2051c c2051c) {
        boolean z10;
        p1 p1Var = t.f25284c;
        k kVar = dVar.f25256a;
        Iterator it = d(kVar).iterator();
        int i10 = 1;
        boolean z11 = true;
        while (true) {
            int i11 = -1;
            if (!it.hasNext()) {
                if (c2051c != null) {
                    int i12 = 0;
                    while (true) {
                        List list = this.f22417b;
                        if (i12 < list.size()) {
                            if (((D) list.get(i12)).f22378b.equals(kVar)) {
                                p1 p1Var2 = (p1) c2051c.f22450b.get(i12);
                                int iB = t.b(p1Var, p1Var2);
                                boolean z12 = c2051c.f22449a;
                                if (iB != 0) {
                                    i10 = iB;
                                } else if (z11 && !z12) {
                                    i10 = -1;
                                } else if (z11 || !z12) {
                                    i10 = 0;
                                }
                                if (i10 < 0) {
                                    p1Var = p1Var2;
                                    z11 = z12;
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                return new Pair(p1Var, Boolean.valueOf(z11));
            }
            C2064p c2064p = (C2064p) it.next();
            p1 p1Var3 = t.f25284c;
            int i13 = M.f22415a[c2064p.f22469a.ordinal()];
            p1 p1Var4 = c2064p.f22470b;
            if (i13 != 3 && i13 != 4) {
                switch (i13) {
                    case 7:
                    case 8:
                        switch (s.f25281a[p1Var4.P().ordinal()]) {
                            case 1:
                                p1Var4 = t.f25283b;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 2:
                                p1Var4 = t.f25289h;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 3:
                            case 4:
                                p1Var4 = t.f25290i;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 5:
                                p1Var4 = t.f25291j;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 6:
                                p1Var4 = t.k;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 7:
                                p1Var4 = t.f25292l;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 8:
                                p1Var4 = t.f25293m;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 9:
                                p1Var4 = t.f25294n;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 10:
                                p1Var4 = t.f25295o;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            case 11:
                                p1Var4 = t.j(p1Var4) ? t.f25288g : t.f25296p;
                                p1Var3 = p1Var4;
                                z10 = true;
                                break;
                            default:
                                throw new IllegalArgumentException("Unknown value type: " + p1Var4.P());
                        }
                        break;
                    case 9:
                        p1Var3 = p1Var4;
                        z10 = true;
                        break;
                    case 10:
                        p1Var3 = p1Var4;
                        z10 = false;
                        break;
                    default:
                        z10 = true;
                        break;
                }
            } else {
                p1Var3 = p1Var4;
                z10 = true;
            }
            int iB2 = t.b(p1Var, p1Var3);
            if (iB2 != 0) {
                i11 = iB2;
            } else if (!z11 || z10) {
                i11 = (z11 || !z10) ? 0 : 1;
            }
            if (i11 < 0) {
                z11 = z10;
                p1Var = p1Var3;
            }
        }
    }

    public final String b() {
        String str = this.f22416a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22419d.c());
        String str2 = this.f22420e;
        if (str2 != null) {
            sb.append("|cg:");
            sb.append(str2);
        }
        sb.append("|f:");
        Iterator it = this.f22418c.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC2065q) it.next()).a());
        }
        sb.append("|ob:");
        for (D d10 : this.f22417b) {
            sb.append(d10.f22378b.c());
            sb.append(d10.f22377a.equals(C.ASCENDING) ? "asc" : "desc");
        }
        long j10 = this.f22421f;
        if (j10 != -1) {
            sb.append("|l:");
            sb.append(j10);
        }
        C2051c c2051c = this.f22422g;
        if (c2051c != null) {
            sb.append("|lb:");
            sb.append(c2051c.f22449a ? "b:" : "a:");
            sb.append(c2051c.b());
        }
        C2051c c2051c2 = this.f22423h;
        if (c2051c2 != null) {
            sb.append("|ub:");
            sb.append(c2051c2.f22449a ? "a:" : "b:");
            sb.append(c2051c2.b());
        }
        String string = sb.toString();
        this.f22416a = string;
        return string;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:65:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x000e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.List] */
    public final Pair c(d dVar, C2051c c2051c) {
        boolean z10;
        int iB;
        p1 p1Var = t.f25286e;
        k kVar = dVar.f25256a;
        Iterator it = d(kVar).iterator();
        int i10 = 1;
        boolean z11 = true;
        while (true) {
            int i11 = -1;
            if (!it.hasNext()) {
                if (c2051c != null) {
                    int i12 = 0;
                    while (true) {
                        List list = this.f22417b;
                        if (i12 < list.size()) {
                            if (((D) list.get(i12)).f22378b.equals(kVar)) {
                                p1 p1Var2 = (p1) c2051c.f22450b.get(i12);
                                int iB2 = t.b(p1Var, p1Var2);
                                boolean z12 = c2051c.f22449a;
                                if (iB2 != 0) {
                                    i10 = iB2;
                                } else if (!z11 || z12) {
                                    i10 = (z11 || !z12) ? 0 : -1;
                                }
                                if (i10 > 0) {
                                    p1Var = p1Var2;
                                    z11 = z12;
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                return new Pair(p1Var, Boolean.valueOf(z11));
            }
            C2064p c2064p = (C2064p) it.next();
            p1 p1Var3 = t.f25286e;
            int i13 = M.f22415a[c2064p.f22469a.ordinal()];
            p1 p1Var4 = c2064p.f22470b;
            if (i13 != 3 && i13 != 4) {
                switch (i13) {
                    case 7:
                        p1Var3 = p1Var4;
                        z10 = false;
                        iB = t.b(p1Var, p1Var3);
                        if (iB != 0) {
                            i11 = iB;
                        } else if (!z11 && !z10) {
                            i11 = 1;
                        } else if (z11 || !z10) {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            z11 = z10;
                            p1Var = p1Var3;
                        }
                        break;
                    case 8:
                        p1Var3 = p1Var4;
                        break;
                    case 9:
                    case 10:
                        switch (s.f25281a[p1Var4.P().ordinal()]) {
                            case 1:
                                p1Var3 = t.f25289h;
                                break;
                            case 2:
                                p1Var3 = t.f25290i;
                                break;
                            case 3:
                            case 4:
                                p1Var3 = t.f25291j;
                                break;
                            case 5:
                                p1Var3 = t.k;
                                break;
                            case 6:
                                p1Var3 = t.f25292l;
                                break;
                            case 7:
                                p1Var3 = t.f25293m;
                                break;
                            case 8:
                                p1Var3 = t.f25294n;
                                break;
                            case 9:
                                p1Var3 = t.f25295o;
                                break;
                            case 10:
                                p1Var3 = t.f25288g;
                                break;
                            case 11:
                                if (t.j(p1Var4)) {
                                    p1Var3 = t.f25296p;
                                }
                                break;
                            default:
                                throw new IllegalArgumentException("Unknown value type: " + p1Var4.P());
                        }
                        z10 = false;
                        iB = t.b(p1Var, p1Var3);
                        if (iB != 0) {
                            i11 = iB;
                        } else if (!z11) {
                            if (z11) {
                                i11 = 0;
                            } else {
                                i11 = 0;
                            }
                        } else if (z11) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            z11 = z10;
                            p1Var = p1Var3;
                        }
                        break;
                }
            } else {
                p1Var3 = p1Var4;
            }
            z10 = true;
            iB = t.b(p1Var, p1Var3);
            if (iB != 0) {
                i11 = iB;
            } else if (!z11) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 0;
                }
            } else if (z11) {
                i11 = 0;
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                z11 = z10;
                p1Var = p1Var3;
            }
        }
    }

    public final ArrayList d(k kVar) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC2065q abstractC2065q : this.f22418c) {
            if (abstractC2065q instanceof C2064p) {
                C2064p c2064p = (C2064p) abstractC2065q;
                if (c2064p.f22471c.equals(kVar)) {
                    arrayList.add(c2064p);
                }
            }
        }
        return arrayList;
    }

    public final boolean e() {
        return h.e(this.f22419d) && this.f22420e == null && this.f22418c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N.class == obj.getClass()) {
            N n6 = (N) obj;
            String str = n6.f22420e;
            String str2 = this.f22420e;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            if (this.f22421f != n6.f22421f || !this.f22417b.equals(n6.f22417b) || !this.f22418c.equals(n6.f22418c) || !this.f22419d.equals(n6.f22419d)) {
                return false;
            }
            C2051c c2051c = n6.f22422g;
            C2051c c2051c2 = this.f22422g;
            if (c2051c2 == null ? c2051c != null : !c2051c2.equals(c2051c)) {
                return false;
            }
            C2051c c2051c3 = n6.f22423h;
            C2051c c2051c4 = this.f22423h;
            if (c2051c4 != null) {
                return c2051c4.equals(c2051c3);
            }
            if (c2051c3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f22417b.hashCode() * 31;
        String str = this.f22420e;
        int iHashCode2 = (this.f22419d.hashCode() + ((this.f22418c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f22421f;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        C2051c c2051c = this.f22422g;
        int iHashCode3 = (i10 + (c2051c != null ? c2051c.hashCode() : 0)) * 31;
        C2051c c2051c2 = this.f22423h;
        return iHashCode3 + (c2051c2 != null ? c2051c2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Query(");
        sb.append(this.f22419d.c());
        String str = this.f22420e;
        if (str != null) {
            sb.append(" collectionGroup=");
            sb.append(str);
        }
        List list = this.f22418c;
        if (!list.isEmpty()) {
            sb.append(" where ");
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (i10 > 0) {
                    sb.append(" and ");
                }
                sb.append(list.get(i10));
            }
        }
        List list2 = this.f22417b;
        if (!list2.isEmpty()) {
            sb.append(" order by ");
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(list2.get(i11));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
