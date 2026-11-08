package p154o1;

import java.util.HashSet;
import p089i1.q;
import p144n1.l;
import p164p1.a;
import p174q1.m;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p144n1.g {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f23609A0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public a f23610n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f23611o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f23612p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f23613q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f23614r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f23615s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f23616t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f23617u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f23618v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f23619w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f23620x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f23621y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f23622z0;

    public g(q qVar, l lVar) {
        super(qVar, lVar);
        this.f23611o0 = 0;
        this.f23612p0 = 0;
        this.f23613q0 = 0;
        if (lVar == l.ROW) {
            this.f23615s0 = 1;
        } else if (lVar == l.COLUMN) {
            this.f23616t0 = 1;
        }
    }

    @Override // p144n1.g, p144n1.b, p144n1.h
    public final void apply() {
        s();
        a aVar = this.f23610n0;
        int i10 = this.f23614r0;
        aVar.getClass();
        if ((i10 == 0 || i10 == 1) && aVar.f25165L0 != i10) {
            aVar.f25165L0 = i10;
        }
        int i11 = this.f23615s0;
        if (i11 != 0) {
            a aVar2 = this.f23610n0;
            if (i11 > 50) {
                aVar2.getClass();
            } else if (aVar2.C0 != i11) {
                aVar2.C0 = i11;
                aVar2.b0();
                aVar2.X();
            }
        }
        int i12 = this.f23616t0;
        if (i12 != 0) {
            a aVar3 = this.f23610n0;
            if (i12 > 50) {
                aVar3.getClass();
            } else if (aVar3.f25159E0 != i12) {
                aVar3.f25159E0 = i12;
                aVar3.b0();
                aVar3.X();
            }
        }
        float f10 = this.f23617u0;
        if (f10 != 0.0f) {
            a aVar4 = this.f23610n0;
            if (f10 < 0.0f) {
                aVar4.getClass();
            } else if (aVar4.f25160F0 != f10) {
                aVar4.f25160F0 = f10;
            }
        }
        float f11 = this.f23618v0;
        if (f11 != 0.0f) {
            a aVar5 = this.f23610n0;
            if (f11 < 0.0f) {
                aVar5.getClass();
            } else if (aVar5.f25161G0 != f11) {
                aVar5.f25161G0 = f11;
            }
        }
        String str = this.f23619w0;
        if (str != null && !str.isEmpty()) {
            a aVar6 = this.f23610n0;
            String str2 = this.f23619w0;
            String str3 = aVar6.H0;
            if (str3 == null || !str3.equals(str2)) {
                aVar6.H0 = str2;
            }
        }
        String str4 = this.f23620x0;
        if (str4 != null && !str4.isEmpty()) {
            a aVar7 = this.f23610n0;
            String str5 = this.f23620x0;
            String str6 = aVar7.f25162I0;
            if (str6 == null || !str6.equals(str5)) {
                aVar7.f25162I0 = str5;
            }
        }
        String str7 = this.f23621y0;
        if (str7 != null && !str7.isEmpty()) {
            a aVar8 = this.f23610n0;
            String str8 = this.f23621y0;
            String str9 = aVar8.f25163J0;
            if (str9 == null || !str9.equals(str8.toString())) {
                aVar8.f25156A0 = false;
                aVar8.f25163J0 = str8.toString();
            }
        }
        String str10 = this.f23622z0;
        if (str10 != null && !str10.isEmpty()) {
            a aVar9 = this.f23610n0;
            String str11 = this.f23622z0;
            String str12 = aVar9.f25164K0;
            if (str12 == null || !str12.equals(str11)) {
                aVar9.f25156A0 = false;
                aVar9.f25164K0 = str11;
            }
        }
        a aVar10 = this.f23610n0;
        aVar10.f25170Q0 = this.f23609A0;
        int i13 = this.f23611o0;
        aVar10.f25647r0 = i13;
        aVar10.f25648s0 = i13;
        aVar10.f25645p0 = this.f23612p0;
        aVar10.f25646q0 = this.f23613q0;
        r();
    }

    @Override // p144n1.g
    public final m s() {
        int[][] iArrZ;
        int[][] iArrZ2;
        boolean[][] zArr;
        if (this.f23610n0 == null) {
            a aVar = new a();
            aVar.f25156A0 = false;
            aVar.f25166M0 = 0;
            aVar.f25168O0 = new HashSet();
            aVar.f25172S0 = 0;
            aVar.b0();
            int[][] iArr = aVar.f25169P0;
            boolean z10 = iArr != null && iArr.length == aVar.f25643o0 && (zArr = aVar.f25167N0) != null && zArr.length == aVar.f25157B0 && zArr[0].length == aVar.f25158D0;
            if (!z10) {
                aVar.X();
            }
            if (z10) {
                for (int i10 = 0; i10 < aVar.f25167N0.length; i10++) {
                    int i11 = 0;
                    while (true) {
                        boolean[][] zArr2 = aVar.f25167N0;
                        if (i11 < zArr2[0].length) {
                            zArr2[i10][i11] = true;
                            i11++;
                        }
                    }
                }
                for (int i12 = 0; i12 < aVar.f25169P0.length; i12++) {
                    int i13 = 0;
                    while (true) {
                        int[][] iArr2 = aVar.f25169P0;
                        if (i13 < iArr2[0].length) {
                            iArr2[i12][i13] = -1;
                            i13++;
                        }
                    }
                }
            }
            aVar.f25166M0 = 0;
            String str = aVar.f25164K0;
            if (str != null && !str.trim().isEmpty() && (iArrZ2 = aVar.Z(aVar.f25164K0, false)) != null) {
                aVar.V(iArrZ2);
            }
            String str2 = aVar.f25163J0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrZ = aVar.Z(aVar.f25163J0, true)) != null) {
                aVar.W(iArrZ);
            }
            this.f23610n0 = aVar;
        }
        return this.f23610n0;
    }
}
