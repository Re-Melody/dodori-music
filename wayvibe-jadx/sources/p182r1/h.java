package p182r1;

import java.util.ArrayList;
import java.util.HashSet;
import p089i1.o;
import p174q1.c;
import p174q1.d;
import p174q1.f;
import p174q1.g;
import p174q1.l;
import p174q1.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f25733a = new b();

    public static boolean a(g gVar) {
        f fVar;
        f fVar2;
        f[] fVarArr = gVar.f25533Q;
        f fVar3 = fVarArr[0];
        f fVar4 = fVarArr[1];
        p174q1.h hVar = gVar.f25534R;
        if (hVar == null) {
            hVar = null;
        }
        if (hVar != null) {
            f fVar5 = hVar.f25533Q[0];
            f fVar6 = f.FIXED;
        }
        if (hVar != null) {
            f fVar7 = hVar.f25533Q[1];
            f fVar8 = f.FIXED;
        }
        f fVar9 = f.FIXED;
        boolean z10 = fVar3 == fVar9 || gVar.y() || fVar3 == f.WRAP_CONTENT || (fVar3 == (fVar2 = f.MATCH_CONSTRAINT) && gVar.r == 0 && gVar.f25537U == 0.0f && gVar.r(0)) || (fVar3 == fVar2 && gVar.r == 1 && gVar.s(0, gVar.o()));
        boolean z11 = fVar4 == fVar9 || gVar.z() || fVar4 == f.WRAP_CONTENT || (fVar4 == (fVar = f.MATCH_CONSTRAINT) && gVar.f25572s == 0 && gVar.f25537U == 0.0f && gVar.r(1)) || (fVar4 == fVar && gVar.f25572s == 1 && gVar.s(1, gVar.l()));
        return (gVar.f25537U > 0.0f && (z10 || z11)) || (z10 && z11);
    }

    public static n b(g gVar, int i10, ArrayList arrayList, n nVar) {
        int i11;
        int i12 = i10 == 0 ? gVar.f25565l0 : gVar.f25567m0;
        if (i12 != -1 && (nVar == null || i12 != nVar.f25739b)) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                n nVar2 = (n) arrayList.get(i13);
                if (nVar2.f25739b == i12) {
                    if (nVar != null) {
                        nVar.c(i10, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                    break;
                }
            }
        } else if (i12 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (gVar instanceof m) {
                m mVar = (m) gVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= mVar.f25643o0) {
                        i11 = -1;
                        break;
                    }
                    g gVar2 = mVar.f25642n0[i14];
                    if ((i10 == 0 && (i11 = gVar2.f25565l0) != -1) || (i10 == 1 && (i11 = gVar2.f25567m0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        n nVar3 = (n) arrayList.get(i15);
                        if (nVar3.f25739b == i11) {
                            nVar = nVar3;
                            break;
                        }
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f25738a = new ArrayList();
                nVar.f25741d = null;
                nVar.f25742e = -1;
                int i16 = n.f25737f;
                n.f25737f = i16 + 1;
                nVar.f25739b = i16;
                nVar.f25740c = i10;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.f25738a;
        if (arrayList2.contains(gVar)) {
            return nVar;
        }
        arrayList2.add(gVar);
        if (gVar instanceof l) {
            l lVar = (l) gVar;
            lVar.f25639q0.c(lVar.f25640r0 == 0 ? 1 : 0, arrayList, nVar);
        }
        int i17 = nVar.f25739b;
        if (i10 == 0) {
            gVar.f25565l0 = i17;
            gVar.f25522F.c(i10, arrayList, nVar);
            gVar.f25524H.c(i10, arrayList, nVar);
        } else {
            gVar.f25567m0 = i17;
            gVar.f25523G.c(i10, arrayList, nVar);
            gVar.f25526J.c(i10, arrayList, nVar);
            gVar.f25525I.c(i10, arrayList, nVar);
        }
        gVar.f25529M.c(i10, arrayList, nVar);
        return nVar;
    }

    public static void c(int i10, o oVar, g gVar) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (gVar.f25568n) {
            return;
        }
        if (!(gVar instanceof p174q1.h) && gVar.x() && a(gVar)) {
            p174q1.h.Q(gVar, oVar, new b());
        }
        d dVarJ = gVar.j(c.LEFT);
        d dVarJ2 = gVar.j(c.RIGHT);
        int iD = dVarJ.d();
        int iD2 = dVarJ2.d();
        HashSet<d> hashSet = dVarJ.f25507a;
        if (hashSet != null && dVarJ.f25509c) {
            for (d dVar5 : hashSet) {
                g gVar2 = dVar5.f25510d;
                int i11 = i10 + 1;
                boolean zA = a(gVar2);
                if (gVar2.x() && zA) {
                    p174q1.h.Q(gVar2, oVar, new b());
                }
                d dVar6 = gVar2.f25522F;
                d dVar7 = gVar2.f25524H;
                boolean z10 = (dVar5 == dVar6 && (dVar4 = dVar7.f25512f) != null && dVar4.f25509c) || (dVar5 == dVar7 && (dVar3 = dVar6.f25512f) != null && dVar3.f25509c);
                f fVar = gVar2.f25533Q[0];
                f fVar2 = f.MATCH_CONSTRAINT;
                if (fVar != fVar2 || zA) {
                    if (!gVar2.x()) {
                        if (dVar5 == dVar6 && dVar7.f25512f == null) {
                            int iE = dVar6.e() + iD;
                            gVar2.F(iE, gVar2.o() + iE);
                            c(i11, oVar, gVar2);
                        } else if (dVar5 == dVar7 && dVar6.f25512f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar2.F(iE2 - gVar2.o(), iE2);
                            c(i11, oVar, gVar2);
                        } else if (z10 && !gVar2.v()) {
                            d(i11, oVar, gVar2);
                        }
                    }
                } else if (fVar == fVar2 && gVar2.f25575v >= 0 && gVar2.f25574u >= 0 && (gVar2.f25552e0 == 8 || (gVar2.r == 0 && gVar2.f25537U == 0.0f))) {
                    if (!gVar2.v() && z10 && !gVar2.v()) {
                        e(i11, gVar, oVar, gVar2);
                    }
                }
            }
        }
        if (gVar instanceof l) {
            return;
        }
        HashSet<d> hashSet2 = dVarJ2.f25507a;
        if (hashSet2 != null && dVarJ2.f25509c) {
            for (d dVar8 : hashSet2) {
                g gVar3 = dVar8.f25510d;
                int i12 = i10 + 1;
                boolean zA2 = a(gVar3);
                if (gVar3.x() && zA2) {
                    p174q1.h.Q(gVar3, oVar, new b());
                }
                d dVar9 = gVar3.f25522F;
                d dVar10 = gVar3.f25524H;
                boolean z11 = (dVar8 == dVar9 && (dVar2 = dVar10.f25512f) != null && dVar2.f25509c) || (dVar8 == dVar10 && (dVar = dVar9.f25512f) != null && dVar.f25509c);
                f fVar3 = gVar3.f25533Q[0];
                f fVar4 = f.MATCH_CONSTRAINT;
                if (fVar3 != fVar4 || zA2) {
                    if (!gVar3.x()) {
                        if (dVar8 == dVar9 && dVar10.f25512f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar3.F(iE3, gVar3.o() + iE3);
                            c(i12, oVar, gVar3);
                        } else if (dVar8 == dVar10 && dVar9.f25512f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar3.F(iE4 - gVar3.o(), iE4);
                            c(i12, oVar, gVar3);
                        } else if (z11 && !gVar3.v()) {
                            d(i12, oVar, gVar3);
                        }
                    }
                } else if (fVar3 == fVar4 && gVar3.f25575v >= 0 && gVar3.f25574u >= 0 && (gVar3.f25552e0 == 8 || (gVar3.r == 0 && gVar3.f25537U == 0.0f))) {
                    if (!gVar3.v() && z11 && !gVar3.v()) {
                        e(i12, gVar, oVar, gVar3);
                    }
                }
            }
        }
        gVar.f25568n = true;
    }

    public static void d(int i10, o oVar, g gVar) {
        float f10 = gVar.f25546b0;
        d dVar = gVar.f25522F;
        int iD = dVar.f25512f.d();
        d dVar2 = gVar.f25524H;
        int iD2 = dVar2.f25512f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iO = gVar.o();
        int i11 = (iD2 - iD) - iO;
        if (iD > iD2) {
            i11 = (iD - iD2) - iO;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iO;
        if (iD > iD2) {
            i13 = i12 - iO;
        }
        gVar.F(i12, i13);
        c(i10 + 1, oVar, gVar);
    }

    public static void e(int i10, g gVar, o oVar, g gVar2) {
        float f10 = gVar2.f25546b0;
        d dVar = gVar2.f25522F;
        int iE = dVar.e() + dVar.f25512f.d();
        d dVar2 = gVar2.f25524H;
        int iD = dVar2.f25512f.d() - dVar2.e();
        if (iD >= iE) {
            int iO = gVar2.o();
            if (gVar2.f25552e0 != 8) {
                int i11 = gVar2.r;
                if (i11 == 2) {
                    iO = (int) (gVar2.f25546b0 * 0.5f * (gVar instanceof p174q1.h ? gVar.o() : gVar.f25534R.o()));
                } else if (i11 == 0) {
                    iO = iD - iE;
                }
                iO = Math.max(gVar2.f25574u, iO);
                int i12 = gVar2.f25575v;
                if (i12 > 0) {
                    iO = Math.min(i12, iO);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iO)) + 0.5f));
            gVar2.F(i13, iO + i13);
            c(i10 + 1, oVar, gVar2);
        }
    }

    public static void f(int i10, o oVar, g gVar) {
        float f10 = gVar.f25548c0;
        d dVar = gVar.f25523G;
        int iD = dVar.f25512f.d();
        d dVar2 = gVar.f25525I;
        int iD2 = dVar2.f25512f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = gVar.l();
        int i11 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i11 = (iD - iD2) - iL;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iL;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iL;
        }
        gVar.G(i13, i14);
        i(i10 + 1, oVar, gVar);
    }

    public static void g(int i10, g gVar, o oVar, g gVar2) {
        float f10 = gVar2.f25548c0;
        d dVar = gVar2.f25523G;
        int iE = dVar.e() + dVar.f25512f.d();
        d dVar2 = gVar2.f25525I;
        int iD = dVar2.f25512f.d() - dVar2.e();
        if (iD >= iE) {
            int iL = gVar2.l();
            if (gVar2.f25552e0 != 8) {
                int i11 = gVar2.f25572s;
                if (i11 == 2) {
                    iL = (int) (f10 * 0.5f * (gVar instanceof p174q1.h ? gVar.l() : gVar.f25534R.l()));
                } else if (i11 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(gVar2.f25577x, iL);
                int i12 = gVar2.f25578y;
                if (i12 > 0) {
                    iL = Math.min(i12, iL);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iL)) + 0.5f));
            gVar2.G(i13, iL + i13);
            i(i10 + 1, oVar, gVar2);
        }
    }

    public static boolean h(f fVar, f fVar2, f fVar3, f fVar4) {
        f fVar5;
        f fVar6;
        f fVar7 = f.FIXED;
        return (fVar3 == fVar7 || fVar3 == (fVar6 = f.WRAP_CONTENT) || (fVar3 == f.MATCH_PARENT && fVar != fVar6)) || (fVar4 == fVar7 || fVar4 == (fVar5 = f.WRAP_CONTENT) || (fVar4 == f.MATCH_PARENT && fVar2 != fVar5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public static void i(int i10, o oVar, g gVar) {
        boolean z10;
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (gVar.f25569o) {
            return;
        }
        if (!(gVar instanceof p174q1.h) && gVar.x() && a(gVar)) {
            p174q1.h.Q(gVar, oVar, new b());
        }
        d dVarJ = gVar.j(c.TOP);
        d dVarJ2 = gVar.j(c.BOTTOM);
        int iD = dVarJ.d();
        int iD2 = dVarJ2.d();
        HashSet<d> hashSet = dVarJ.f25507a;
        char c3 = 1;
        if (hashSet != null && dVarJ.f25509c) {
            for (d dVar5 : hashSet) {
                g gVar2 = dVar5.f25510d;
                int i11 = i10 + 1;
                boolean zA = a(gVar2);
                if (gVar2.x() && zA) {
                    p174q1.h.Q(gVar2, oVar, new b());
                }
                d dVar6 = gVar2.f25523G;
                d dVar7 = gVar2.f25525I;
                char c9 = ((dVar5 == dVar6 && (dVar4 = dVar7.f25512f) != null && dVar4.f25509c) || (dVar5 == dVar7 && (dVar3 = dVar6.f25512f) != null && dVar3.f25509c)) ? c3 : (char) 0;
                f fVar = gVar2.f25533Q[c3];
                char c10 = c3;
                f fVar2 = f.MATCH_CONSTRAINT;
                if (fVar != fVar2 || zA) {
                    if (!gVar2.x()) {
                        if (dVar5 == dVar6 && dVar7.f25512f == null) {
                            int iE = dVar6.e() + iD;
                            gVar2.G(iE, gVar2.l() + iE);
                            i(i11, oVar, gVar2);
                        } else if (dVar5 == dVar7 && dVar6.f25512f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar2.G(iE2 - gVar2.l(), iE2);
                            i(i11, oVar, gVar2);
                        } else if (c9 != 0 && !gVar2.w()) {
                            f(i11, oVar, gVar2);
                        }
                    }
                } else if (fVar == fVar2 && gVar2.f25578y >= 0 && gVar2.f25577x >= 0 && ((gVar2.f25552e0 == 8 || (gVar2.f25572s == 0 && gVar2.f25537U == 0.0f)) && !gVar2.w() && c9 != 0 && !gVar2.w())) {
                    g(i11, gVar, oVar, gVar2);
                }
                c3 = c10;
            }
        }
        ?? r17 = c3;
        if (gVar instanceof l) {
            return;
        }
        HashSet<d> hashSet2 = dVarJ2.f25507a;
        if (hashSet2 != null && dVarJ2.f25509c) {
            for (d dVar8 : hashSet2) {
                g gVar3 = dVar8.f25510d;
                int i12 = i10 + 1;
                boolean zA2 = a(gVar3);
                if (gVar3.x() && zA2) {
                    p174q1.h.Q(gVar3, oVar, new b());
                }
                d dVar9 = gVar3.f25523G;
                d dVar10 = gVar3.f25525I;
                ?? r11 = ((dVar8 == dVar9 && (dVar2 = dVar10.f25512f) != null && dVar2.f25509c) || (dVar8 == dVar10 && (dVar = dVar9.f25512f) != null && dVar.f25509c)) ? r17 == true ? 1 : 0 : 0;
                f fVar3 = gVar3.f25533Q[r17 == true ? 1 : 0];
                f fVar4 = f.MATCH_CONSTRAINT;
                if (fVar3 != fVar4 || zA2) {
                    if (!gVar3.x()) {
                        if (dVar8 == dVar9 && dVar10.f25512f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar3.G(iE3, gVar3.l() + iE3);
                            i(i12, oVar, gVar3);
                        } else if (dVar8 == dVar10 && dVar9.f25512f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar3.G(iE4 - gVar3.l(), iE4);
                            i(i12, oVar, gVar3);
                        } else if (r11 != 0 && !gVar3.w()) {
                            f(i12, oVar, gVar3);
                        }
                    }
                } else if (fVar3 == fVar4 && gVar3.f25578y >= 0 && gVar3.f25577x >= 0 && (gVar3.f25552e0 == 8 || (gVar3.f25572s == 0 && gVar3.f25537U == 0.0f))) {
                    if (!gVar3.w() && r11 != 0 && !gVar3.w()) {
                        g(i12, gVar, oVar, gVar3);
                    }
                }
            }
        }
        d dVarJ3 = gVar.j(c.BASELINE);
        if (dVarJ3.f25507a != null && dVarJ3.f25509c) {
            int iD3 = dVarJ3.d();
            for (d dVar11 : dVarJ3.f25507a) {
                g gVar4 = dVar11.f25510d;
                int i13 = i10 + 1;
                boolean zA3 = a(gVar4);
                if (gVar4.x() && zA3) {
                    p174q1.h.Q(gVar4, oVar, new b());
                }
                if (gVar4.f25533Q[r17 == true ? 1 : 0] != f.MATCH_CONSTRAINT || zA3) {
                    if (!gVar4.x()) {
                        d dVar12 = gVar4.f25526J;
                        if (dVar11 == dVar12) {
                            int iE5 = dVar11.e() + iD3;
                            if (gVar4.f25521E) {
                                int i14 = iE5 - gVar4.f25541Y;
                                int i15 = gVar4.f25536T + i14;
                                gVar4.f25540X = i14;
                                gVar4.f25523G.l(i14);
                                gVar4.f25525I.l(i15);
                                dVar12.l(iE5);
                                z10 = r17 == true ? 1 : 0;
                                gVar4.f25566m = z10;
                            } else {
                                z10 = r17 == true ? 1 : 0;
                            }
                            i(i13, oVar, gVar4);
                        }
                        r17 = z10;
                    }
                }
                z10 = r17 == true ? 1 : 0;
                r17 = z10;
            }
        }
        gVar.f25569o = r17;
    }
}
