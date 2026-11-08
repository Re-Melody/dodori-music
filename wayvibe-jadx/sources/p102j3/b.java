package p102j3;

import B2.t;
import B2.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import p113k3.a;
import p255y2.B;
import p267z6.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends S9.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21454e;

    public static a G0(u uVar) {
        String strO = uVar.o();
        strO.getClass();
        String strO2 = uVar.o();
        strO2.getClass();
        return new a(strO, strO2, uVar.n(), uVar.n(), Arrays.copyOfRange(uVar.f630a, uVar.f631b, uVar.f632c));
    }

    @Override // S9.b
    public final B n(p091i3.a aVar, ByteBuffer byteBuffer) {
        boolean z10 = true;
        switch (this.f21454e) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                t tVar = new t(byteBuffer.array(), byteBuffer.limit(), 0, (byte) 0);
                int i10 = 12;
                tVar.H(12);
                int iT = (tVar.t() + tVar.w(12)) - 4;
                tVar.H(44);
                tVar.I(tVar.w(12));
                tVar.H(16);
                ArrayList arrayList = new ArrayList();
                while (tVar.t() < iT) {
                    tVar.H(48);
                    int iW = tVar.w(8);
                    tVar.H(4);
                    int iT2 = tVar.t() + tVar.w(i10);
                    String str = null;
                    String str2 = null;
                    while (tVar.t() < iT2) {
                        int iW2 = tVar.w(8);
                        boolean z11 = z10;
                        int iW3 = tVar.w(8);
                        int iT3 = tVar.t() + iW3;
                        if (iW2 == 2) {
                            int iW4 = tVar.w(16);
                            tVar.H(8);
                            if (iW4 == 3) {
                                while (tVar.t() < iT3) {
                                    int iW5 = tVar.w(8);
                                    Charset charset = h.f29877a;
                                    byte[] bArr = new byte[iW5];
                                    tVar.z(bArr, iW5);
                                    String str3 = new String(bArr, charset);
                                    int iW6 = tVar.w(8);
                                    for (int i11 = 0; i11 < iW6; i11++) {
                                        tVar.I(tVar.w(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iW2 == 21) {
                            Charset charset2 = h.f29877a;
                            byte[] bArr2 = new byte[iW3];
                            tVar.z(bArr2, iW3);
                            str2 = new String(bArr2, charset2);
                        }
                        tVar.E(iT3 * 8);
                        z10 = z11;
                    }
                    boolean z12 = z10;
                    tVar.E(iT2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(iW, str.concat(str2)));
                    }
                    z10 = z12;
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new B(arrayList);
            default:
                return new B(G0(new u(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
