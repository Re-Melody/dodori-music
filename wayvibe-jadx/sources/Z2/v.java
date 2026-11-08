package Z2;

import B2.AbstractC0111a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13591j;

    public v(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, String str) {
        this.f13582a = list;
        this.f13583b = i10;
        this.f13584c = i11;
        this.f13585d = i12;
        this.f13586e = i13;
        this.f13587f = i14;
        this.f13588g = i15;
        this.f13589h = f10;
        this.f13590i = i16;
        this.f13591j = str;
    }

    public static v a(B2.u uVar) throws p255y2.D {
        boolean z10;
        try {
            uVar.G(21);
            int iT = uVar.t() & 3;
            int iT2 = uVar.t();
            int i10 = uVar.f631b;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i12 >= iT2) {
                    break;
                }
                uVar.G(1);
                int iZ = uVar.z();
                for (int i14 = 0; i14 < iZ; i14++) {
                    int iZ2 = uVar.z();
                    i13 += iZ2 + 4;
                    uVar.G(iZ2);
                }
                i12++;
            }
            uVar.F(i10);
            byte[] bArr = new byte[i13];
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f10 = 1.0f;
            String strB = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < iT2) {
                int iT3 = uVar.t() & 63;
                int iZ3 = uVar.z();
                int i23 = i11;
                while (i23 < iZ3) {
                    int iZ4 = uVar.z();
                    boolean z11 = z10;
                    int i24 = iT;
                    System.arraycopy(C2.g.f1161a, i11, bArr, i22, 4);
                    int i25 = i22 + 4;
                    System.arraycopy(uVar.f630a, uVar.f631b, bArr, i25, iZ4);
                    if (iT3 == 33 && i23 == 0) {
                        C2.d dVarC = C2.g.c(bArr, i25, i25 + iZ4);
                        i15 = dVarC.f1132e + 8;
                        i16 = dVarC.f1133f + 8;
                        i17 = dVarC.f1139m;
                        int i26 = dVarC.f1140n;
                        int i27 = dVarC.f1141o;
                        float f11 = dVarC.k;
                        int i28 = dVarC.f1138l;
                        strB = AbstractC0111a.b(dVarC.f1128a, dVarC.f1129b, dVarC.f1130c, dVarC.f1131d, dVarC.f1134g, dVarC.f1135h);
                        f10 = f11;
                        i20 = i28;
                        i19 = i27;
                        i18 = i26;
                    }
                    i22 = i25 + iZ4;
                    uVar.G(iZ4);
                    i23++;
                    z10 = z11;
                    iT = i24;
                    iT2 = iT2;
                    i11 = 0;
                }
                i21++;
                i11 = 0;
            }
            return new v(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iT + 1, i15, i16, i17, i18, i19, f10, i20, strB);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw p255y2.D.a(e2, "Error parsing HEVC config");
        }
    }
}
