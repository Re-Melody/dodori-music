package p164p1;

import E3.d;
import com.amazon.a.a.o.b.f;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import p100j1.c;
import p174q1.g;
import p174q1.h;
import p174q1.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f25156A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f25157B0;
    public int C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f25158D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f25159E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public float f25160F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public float f25161G0;
    public String H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public String f25162I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public String f25163J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public String f25164K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f25165L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f25166M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean[][] f25167N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public HashSet f25168O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int[][] f25169P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f25170Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int[][] f25171R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f25172S0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public h f25173y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public g[] f25174z0;

    public static void R(g gVar) {
        gVar.f25560i0[1] = -1.0f;
        gVar.f25523G.j();
        gVar.f25525I.j();
        gVar.f25526J.j();
    }

    public static float[] a0(int i10, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(f.f16451a);
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < strArrSplit.length) {
                try {
                    fArr[i11] = Float.parseFloat(strArrSplit[i11]);
                } catch (Exception e2) {
                    System.err.println("Error parsing `" + strArrSplit[i11] + "`: " + e2.getMessage());
                    fArr[i11] = 1.0f;
                }
            } else {
                fArr[i11] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // p174q1.o
    public final void P(int i10, int i11, int i12, int i13) {
        int[][] iArrZ;
        this.f25173y0 = this.f25534R;
        if (this.f25157B0 >= 1 && this.f25158D0 >= 1) {
            this.f25166M0 = 0;
            String str = this.f25164K0;
            if (str != null && !str.trim().isEmpty() && (iArrZ = Z(this.f25164K0, false)) != null) {
                V(iArrZ);
            }
            String str2 = this.f25163J0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f25171R0 = Z(this.f25163J0, true);
            }
            int iMax = Math.max(this.f25157B0, this.f25158D0);
            g[] gVarArr = this.f25174z0;
            if (gVarArr == null) {
                this.f25174z0 = new g[iMax];
                int i14 = 0;
                while (true) {
                    g[] gVarArr2 = this.f25174z0;
                    if (i14 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = new g();
                    p174q1.f[] fVarArr = gVar.f25533Q;
                    p174q1.f fVar = p174q1.f.MATCH_CONSTRAINT;
                    fVarArr[0] = fVar;
                    fVarArr[1] = fVar;
                    gVar.k = String.valueOf(gVar.hashCode());
                    gVarArr2[i14] = gVar;
                    i14++;
                }
            } else if (iMax != gVarArr.length) {
                g[] gVarArr3 = new g[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    g[] gVarArr4 = this.f25174z0;
                    if (i15 < gVarArr4.length) {
                        gVarArr3[i15] = gVarArr4[i15];
                    } else {
                        g gVar2 = new g();
                        p174q1.f[] fVarArr2 = gVar2.f25533Q;
                        p174q1.f fVar2 = p174q1.f.MATCH_CONSTRAINT;
                        fVarArr2[0] = fVar2;
                        fVarArr2[1] = fVar2;
                        gVar2.k = String.valueOf(gVar2.hashCode());
                        gVarArr3[i15] = gVar2;
                    }
                }
                while (true) {
                    g[] gVarArr5 = this.f25174z0;
                    if (iMax >= gVarArr5.length) {
                        break;
                    }
                    g gVar3 = gVarArr5[iMax];
                    this.f25173y0.f25583n0.remove(gVar3);
                    gVar3.A();
                    iMax++;
                }
                this.f25174z0 = gVarArr3;
            }
            int[][] iArr = this.f25171R0;
            if (iArr != null) {
                W(iArr);
            }
        }
        h hVar = this.f25173y0;
        g[] gVarArr6 = this.f25174z0;
        hVar.getClass();
        for (g gVar4 : gVarArr6) {
            hVar.f25583n0.add(gVar4);
            h hVar2 = gVar4.f25534R;
            if (hVar2 != null) {
                hVar2.f25583n0.remove(gVar4);
                gVar4.A();
            }
            gVar4.f25534R = hVar;
        }
    }

    public final void S(g gVar, int i10, int i11, int i12, int i13) {
        gVar.f25522F.a(this.f25174z0[i11].f25522F, 0);
        gVar.f25523G.a(this.f25174z0[i10].f25523G, 0);
        gVar.f25524H.a(this.f25174z0[(i11 + i13) - 1].f25524H, 0);
        gVar.f25525I.a(this.f25174z0[(i10 + i12) - 1].f25525I, 0);
    }

    public final int T(int i10) {
        return this.f25165L0 == 1 ? i10 / this.f25157B0 : i10 % this.f25158D0;
    }

    public final int U(int i10) {
        return this.f25165L0 == 1 ? i10 % this.f25157B0 : i10 / this.f25158D0;
    }

    public final void V(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!Y(U(iArr2[0]), T(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void W(int[][] iArr) {
        if ((this.f25170Q0 & 2) > 0) {
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iU = U(iArr[i10][0]);
            int iT = T(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!Y(iU, iT, iArr2[1], iArr2[2])) {
                break;
            }
            g gVar = this.f25642n0[i10];
            int[] iArr3 = iArr[i10];
            S(gVar, iU, iT, iArr3[1], iArr3[2]);
            this.f25168O0.add(this.f25642n0[i10].k);
        }
    }

    public final void X() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f25157B0, this.f25158D0);
        this.f25167N0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f25643o0;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f25169P0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean Y(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f25167N0;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int[][] Z(String str, boolean z10) {
        int i10;
        int i11;
        try {
            String[] strArrSplit = str.split(f.f16451a);
            Arrays.sort(strArrSplit, new d(26));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.f25157B0 != 1 && this.f25158D0 != 1) {
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    String[] strArrSplit2 = strArrSplit[i12].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i12][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.f25170Q0 & 1) > 0) {
                        iArr[i12][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i12][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i12][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i12][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                String[] strArrSplit4 = strArrSplit[i15].trim().split(":");
                iArr[i15][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i15];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f25158D0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i13 += iArr[i15][1];
                    if (z10) {
                        i13--;
                    }
                }
                if (this.f25157B0 == 1) {
                    iArr[i15][2] = Integer.parseInt(strArrSplit4[1]);
                    i14 += iArr[i15][2];
                    if (z10) {
                        i14--;
                    }
                }
            }
            if (i13 != 0 && !this.f25156A0 && (i11 = this.f25157B0 + i13) <= 50 && this.C0 != i11) {
                this.C0 = i11;
                b0();
                X();
            }
            if (i14 != 0 && !this.f25156A0 && (i10 = this.f25158D0 + i14) <= 50 && this.f25159E0 != i10) {
                this.f25159E0 = i10;
                b0();
                X();
            }
            this.f25156A0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b0() {
        int i10;
        int i11 = this.C0;
        if (i11 != 0 && (i10 = this.f25159E0) != 0) {
            this.f25157B0 = i11;
            this.f25158D0 = i10;
            return;
        }
        int i12 = this.f25159E0;
        if (i12 > 0) {
            this.f25158D0 = i12;
            this.f25157B0 = ((this.f25643o0 + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f25157B0 = i11;
            this.f25158D0 = ((this.f25643o0 + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f25643o0) + 1.5d);
            this.f25157B0 = iSqrt;
            this.f25158D0 = ((this.f25643o0 + iSqrt) - 1) / iSqrt;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    @Override // p174q1.g
    public final void c(c cVar, boolean z10) {
        int i10;
        int i11;
        int[][] iArr;
        int i12;
        super.c(cVar, z10);
        int iMax = Math.max(this.f25157B0, this.f25158D0);
        g gVar = this.f25174z0[0];
        float[] fArrA0 = a0(this.f25157B0, this.H0);
        int i13 = this.f25157B0;
        p174q1.d dVar = this.f25525I;
        p174q1.d dVar2 = this.f25523G;
        if (i13 == 1) {
            R(gVar);
            gVar.f25523G.a(dVar2, 0);
            gVar.f25525I.a(dVar, 0);
        } else {
            int i14 = 0;
            while (true) {
                i10 = this.f25157B0;
                if (i14 >= i10) {
                    break;
                }
                g gVar2 = this.f25174z0[i14];
                R(gVar2);
                if (fArrA0 != null) {
                    gVar2.f25560i0[1] = fArrA0[i14];
                }
                p174q1.d dVar3 = gVar2.f25523G;
                if (i14 > 0) {
                    dVar3.a(this.f25174z0[i14 - 1].f25525I, 0);
                } else {
                    dVar3.a(dVar2, 0);
                }
                int i15 = this.f25157B0 - 1;
                p174q1.d dVar4 = gVar2.f25525I;
                if (i14 < i15) {
                    dVar4.a(this.f25174z0[i14 + 1].f25523G, 0);
                } else {
                    dVar4.a(dVar, 0);
                }
                if (i14 > 0) {
                    dVar3.f25513g = (int) this.f25161G0;
                }
                i14++;
            }
            while (i10 < iMax) {
                g gVar3 = this.f25174z0[i10];
                R(gVar3);
                gVar3.f25523G.a(dVar2, 0);
                gVar3.f25525I.a(dVar, 0);
                i10++;
            }
        }
        int iMax2 = Math.max(this.f25157B0, this.f25158D0);
        g gVar4 = this.f25174z0[0];
        float[] fArrA1 = a0(this.f25158D0, this.f25162I0);
        int i16 = this.f25158D0;
        p174q1.d dVar5 = this.f25524H;
        p174q1.d dVar6 = this.f25522F;
        if (i16 == 1) {
            gVar4.f25560i0[0] = -1.0f;
            gVar4.f25522F.j();
            gVar4.f25524H.j();
            gVar4.f25522F.a(dVar6, 0);
            gVar4.f25524H.a(dVar5, 0);
        } else {
            int i17 = 0;
            while (true) {
                i11 = this.f25158D0;
                if (i17 >= i11) {
                    break;
                }
                g gVar5 = this.f25174z0[i17];
                gVar5.f25560i0[0] = -1.0f;
                gVar5.f25522F.j();
                gVar5.f25524H.j();
                if (fArrA1 != null) {
                    gVar5.f25560i0[0] = fArrA1[i17];
                }
                p174q1.d dVar7 = gVar5.f25522F;
                if (i17 > 0) {
                    dVar7.a(this.f25174z0[i17 - 1].f25524H, 0);
                } else {
                    dVar7.a(dVar6, 0);
                }
                int i18 = this.f25158D0 - 1;
                p174q1.d dVar8 = gVar5.f25524H;
                if (i17 < i18) {
                    dVar8.a(this.f25174z0[i17 + 1].f25522F, 0);
                } else {
                    dVar8.a(dVar5, 0);
                }
                if (i17 > 0) {
                    dVar7.f25513g = (int) this.f25160F0;
                }
                i17++;
            }
            while (i11 < iMax2) {
                g gVar6 = this.f25174z0[i11];
                gVar6.f25560i0[0] = -1.0f;
                gVar6.f25522F.j();
                gVar6.f25524H.j();
                gVar6.f25522F.a(dVar6, 0);
                gVar6.f25524H.a(dVar5, 0);
                i11++;
            }
        }
        for (int i19 = 0; i19 < this.f25643o0; i19++) {
            if (!this.f25168O0.contains(this.f25642n0[i19].k)) {
                boolean z11 = false;
                int i20 = 0;
                while (!z11) {
                    i20 = this.f25166M0;
                    if (i20 >= this.f25157B0 * this.f25158D0) {
                        i20 = -1;
                        break;
                    }
                    int iU = U(i20);
                    int iT = T(this.f25166M0);
                    boolean[] zArr = this.f25167N0[iU];
                    if (zArr[iT]) {
                        zArr[iT] = false;
                        z11 = true;
                    }
                    this.f25166M0++;
                }
                int iU2 = U(i20);
                int iT2 = T(i20);
                if (i20 == -1) {
                    return;
                }
                if ((this.f25170Q0 & 2) <= 0 || (iArr = this.f25171R0) == null || (i12 = this.f25172S0) >= iArr.length) {
                    S(this.f25642n0[i19], iU2, iT2, 1, 1);
                } else {
                    int[] iArr2 = iArr[i12];
                    if (iArr2[0] == i20) {
                        this.f25167N0[iU2][iT2] = true;
                        if (Y(iU2, iT2, iArr2[1], iArr2[2])) {
                            g gVar7 = this.f25642n0[i19];
                            int[] iArr3 = this.f25171R0[this.f25172S0];
                            S(gVar7, iU2, iT2, iArr3[1], iArr3[2]);
                            this.f25172S0++;
                        }
                    } else {
                        S(this.f25642n0[i19], iU2, iT2, 1, 1);
                    }
                }
            }
        }
    }
}
