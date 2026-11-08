package Z2;

import B2.AbstractC0111a;
import java.util.ArrayList;

/* JADX INFO: renamed from: Z2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0962c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13513j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f13514l;

    public C0962c(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f13504a = arrayList;
        this.f13505b = i10;
        this.f13506c = i11;
        this.f13507d = i12;
        this.f13508e = i13;
        this.f13509f = i14;
        this.f13510g = i15;
        this.f13511h = i16;
        this.f13512i = i17;
        this.f13513j = i18;
        this.k = f10;
        this.f13514l = str;
    }

    public static C0962c a(B2.u uVar) throws p255y2.D {
        byte[] bArr;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            uVar.G(4);
            int iT = (uVar.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = uVar.t() & 31;
            int i18 = 0;
            while (true) {
                bArr = AbstractC0111a.f575a;
                if (i18 >= iT2) {
                    break;
                }
                int iZ = uVar.z();
                int i19 = uVar.f631b;
                uVar.G(iZ);
                byte[] bArr2 = uVar.f630a;
                byte[] bArr3 = new byte[iZ + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i19, bArr3, 4, iZ);
                arrayList.add(bArr3);
                i18++;
            }
            int iT3 = uVar.t();
            for (int i20 = 0; i20 < iT3; i20++) {
                int iZ2 = uVar.z();
                int i21 = uVar.f631b;
                uVar.G(iZ2);
                byte[] bArr4 = uVar.f630a;
                byte[] bArr5 = new byte[iZ2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i21, bArr5, 4, iZ2);
                arrayList.add(bArr5);
            }
            if (iT2 > 0) {
                C2.f fVarD = C2.g.d((byte[]) arrayList.get(0), iT, ((byte[]) arrayList.get(0)).length);
                int i22 = fVarD.f1148e;
                int i23 = fVarD.f1149f;
                int i24 = fVarD.f1151h + 8;
                int i25 = fVarD.f1152i + 8;
                int i26 = fVarD.f1158p;
                int i27 = fVarD.f1159q;
                int i28 = fVarD.r;
                int i29 = fVarD.f1160s;
                float f11 = fVarD.f1150g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(fVarD.f1144a), Integer.valueOf(fVarD.f1145b), Integer.valueOf(fVarD.f1146c));
                i13 = i27;
                i14 = i28;
                i15 = i29;
                f10 = f11;
                i11 = i23;
                i12 = i24;
                i16 = i25;
                i17 = i26;
                i10 = i22;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new C0962c(arrayList, iT, i10, i11, i12, i16, i17, i13, i14, i15, f10, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw p255y2.D.a(e2, "Error parsing AVC config");
        }
    }
}
