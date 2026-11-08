package B2;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f626e;

    public /* synthetic */ t(byte[] bArr, int i10, int i11, byte b10) {
        this.f622a = i11;
        this.f623b = bArr;
        this.f626e = i10;
    }

    public int A() {
        int i10 = 0;
        while (!v()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? w(i10) : 0);
    }

    public int B() {
        int iA = A();
        return ((iA + 1) / 2) * (iA % 2 == 0 ? -1 : 1);
    }

    public void C(u uVar) {
        D(uVar.f630a, uVar.f632c);
        E(uVar.f631b * 8);
    }

    public void D(byte[] bArr, int i10) {
        this.f623b = bArr;
        this.f624c = 0;
        this.f625d = 0;
        this.f626e = i10;
    }

    public void E(int i10) {
        int i11 = i10 / 8;
        this.f624c = i11;
        this.f625d = i10 - (i11 * 8);
        e();
    }

    public boolean F(int i10) {
        if (2 > i10 || i10 >= this.f624c) {
            return false;
        }
        byte[] bArr = this.f623b;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void G() {
        switch (this.f622a) {
            case 0:
                int i10 = this.f625d + 1;
                this.f625d = i10;
                if (i10 == 8) {
                    this.f625d = 0;
                    this.f624c++;
                }
                e();
                break;
            default:
                int i11 = this.f626e + 1;
                this.f626e = i11;
                if (i11 == 8) {
                    this.f626e = 0;
                    int i12 = this.f625d;
                    this.f625d = i12 + (F(i12 + 1) ? 2 : 1);
                }
                e();
                break;
        }
    }

    public void H(int i10) {
        int i11;
        switch (this.f622a) {
            case 0:
                int i12 = i10 / 8;
                int i13 = this.f624c + i12;
                this.f624c = i13;
                int i14 = (i10 - (i12 * 8)) + this.f625d;
                this.f625d = i14;
                if (i14 > 7) {
                    this.f624c = i13 + 1;
                    this.f625d = i14 - 8;
                }
                e();
                break;
            case 1:
                int i15 = this.f625d;
                int i16 = i10 / 8;
                int i17 = i15 + i16;
                this.f625d = i17;
                int i18 = (i10 - (i16 * 8)) + this.f626e;
                this.f626e = i18;
                if (i18 > 7) {
                    this.f625d = i17 + 1;
                    this.f626e = i18 - 8;
                }
                while (true) {
                    i15++;
                    if (i15 > this.f625d) {
                        e();
                        break;
                    } else if (F(i15)) {
                        this.f625d++;
                        i15 += 2;
                    }
                }
                break;
            default:
                int i19 = i10 / 8;
                int i20 = this.f625d + i19;
                this.f625d = i20;
                int i21 = (i10 - (i19 * 8)) + this.f626e;
                this.f626e = i21;
                boolean z10 = true;
                if (i21 > 7) {
                    this.f625d = i20 + 1;
                    this.f626e = i21 - 8;
                }
                int i22 = this.f625d;
                if (i22 < 0 || (i22 >= (i11 = this.f624c) && (i22 != i11 || this.f626e != 0))) {
                    z10 = false;
                }
                AbstractC0111a.h(z10);
                break;
        }
    }

    public void I(int i10) {
        AbstractC0111a.h(this.f625d == 0);
        this.f624c += i10;
        e();
    }

    public int a() {
        return ((this.f626e - this.f624c) * 8) - this.f625d;
    }

    public void b() {
        int i10 = this.f626e + 1;
        this.f626e = i10;
        if (i10 == 8) {
            this.f626e = 0;
            int i11 = this.f625d;
            this.f625d = i11 + (o(i11 + 1) ? 2 : 1);
        }
        s();
    }

    public void c(int i10) {
        switch (this.f622a) {
            case 2:
                int i11 = i10 / 8;
                this.f624c = i11;
                this.f625d = i10 - (i11 * 8);
                s();
                break;
            default:
                int i12 = this.f625d;
                int i13 = i10 / 8;
                int i14 = i12 + i13;
                this.f625d = i14;
                int i15 = (i10 - (i13 * 8)) + this.f626e;
                this.f626e = i15;
                if (i15 > 7) {
                    this.f625d = i14 + 1;
                    this.f626e = i15 - 8;
                }
                while (true) {
                    i12++;
                    if (i12 > this.f625d) {
                        s();
                        break;
                    } else if (o(i12)) {
                        this.f625d++;
                        i12 += 2;
                    }
                }
                break;
        }
    }

    public void d(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f623b;
            int i13 = this.f624c;
            int i14 = i13 + 1;
            this.f624c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f625d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (ColorExtractionConstants.COLOR_COMPONENT_MASK >> i16));
        bArr[i11] = b12;
        int i17 = this.f625d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f623b;
            int i18 = this.f624c;
            this.f624c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((byte) ((bArr3[i18] & ForkServer.ERROR) << i17)));
            this.f625d = i17 - 8;
        }
        int i19 = this.f625d + i16;
        this.f625d = i19;
        byte[] bArr4 = this.f623b;
        int i20 = this.f624c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f625d = 0;
            this.f624c = i20 + 1;
        }
        s();
    }

    public void e() {
        int i10;
        int i11;
        switch (this.f622a) {
            case 0:
                int i12 = this.f624c;
                AbstractC0111a.h(i12 >= 0 && (i12 < (i10 = this.f626e) || (i12 == i10 && this.f625d == 0)));
                break;
            default:
                int i13 = this.f625d;
                AbstractC0111a.h(i13 >= 0 && (i13 < (i11 = this.f624c) || (i13 == i11 && this.f626e == 0)));
                break;
        }
    }

    public void f(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f624c + i11;
        this.f624c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f625d;
        this.f625d = i13;
        if (i13 > 7) {
            this.f624c = i12 + 1;
            this.f625d = i13 - 8;
        }
        s();
    }

    public boolean g() {
        boolean z10 = (this.f623b[this.f625d] & (ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD >> this.f626e)) != 0;
        b();
        return z10;
    }

    public boolean h(int i10) {
        int i11 = this.f625d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f626e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f624c) {
                break;
            }
            if (o(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f624c;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public int i() {
        return ((this.f626e - this.f624c) * 8) - this.f625d;
    }

    public void j() {
        if (this.f625d == 0) {
            return;
        }
        this.f625d = 0;
        this.f624c++;
        e();
    }

    public int k(int i10) {
        switch (this.f622a) {
            case 2:
                if (i10 == 0) {
                    return 0;
                }
                this.f625d += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.f625d;
                    if (i12 <= 8) {
                        byte[] bArr = this.f623b;
                        int i13 = this.f624c;
                        int i14 = ((-1) >>> (32 - i10)) & (i11 | ((bArr[i13] & ForkServer.ERROR) >> (8 - i12)));
                        if (i12 == 8) {
                            this.f625d = 0;
                            this.f624c = i13 + 1;
                        }
                        s();
                        return i14;
                    }
                    int i15 = i12 - 8;
                    this.f625d = i15;
                    byte[] bArr2 = this.f623b;
                    int i16 = this.f624c;
                    this.f624c = i16 + 1;
                    i11 |= (bArr2[i16] & ForkServer.ERROR) << i15;
                }
                break;
            default:
                this.f626e += i10;
                int i17 = 0;
                while (true) {
                    int i18 = this.f626e;
                    int i19 = 2;
                    if (i18 <= 8) {
                        byte[] bArr3 = this.f623b;
                        int i20 = this.f625d;
                        int i21 = ((-1) >>> (32 - i10)) & (i17 | ((bArr3[i20] & ForkServer.ERROR) >> (8 - i18)));
                        if (i18 == 8) {
                            this.f626e = 0;
                            this.f625d = i20 + (o(i20 + 1) ? 2 : 1);
                        }
                        s();
                        return i21;
                    }
                    int i22 = i18 - 8;
                    this.f626e = i22;
                    byte[] bArr4 = this.f623b;
                    int i23 = this.f625d;
                    i17 |= (bArr4[i23] & ForkServer.ERROR) << i22;
                    if (!o(i23 + 1)) {
                        i19 = 1;
                    }
                    this.f625d = i23 + i19;
                }
                break;
        }
    }

    public boolean l() {
        int i10 = this.f625d;
        int i11 = this.f626e;
        int i12 = 0;
        while (this.f625d < this.f624c && !g()) {
            i12++;
        }
        boolean z10 = this.f625d == this.f624c;
        this.f625d = i10;
        this.f626e = i11;
        return !z10 && h((i12 * 2) + 1);
    }

    public boolean m(int i10) {
        int i11 = this.f625d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f626e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f624c) {
                break;
            }
            if (F(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f624c;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean n() {
        int i10 = this.f625d;
        int i11 = this.f626e;
        int i12 = 0;
        while (this.f625d < this.f624c && !v()) {
            i12++;
        }
        boolean z10 = this.f625d == this.f624c;
        this.f625d = i10;
        this.f626e = i11;
        return !z10 && m((i12 * 2) + 1);
    }

    public boolean o(int i10) {
        if (2 > i10 || i10 >= this.f624c) {
            return false;
        }
        byte[] bArr = this.f623b;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public int p() {
        int iR = r();
        return ((iR + 1) / 2) * (iR % 2 == 0 ? -1 : 1);
    }

    public boolean q() {
        byte[] bArr = this.f623b;
        int i10 = this.f624c;
        byte b10 = bArr[i10];
        int i11 = this.f625d;
        boolean z10 = (b10 & (ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD >> i11)) != 0;
        int i12 = i11 + 1;
        this.f625d = i12;
        if (i12 == 8) {
            this.f625d = 0;
            this.f624c = i10 + 1;
        }
        s();
        return z10;
    }

    public int r() {
        int i10 = 0;
        while (!g()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? k(i10) : 0);
    }

    public void s() {
        int i10;
        int i11;
        switch (this.f622a) {
            case 2:
                int i12 = this.f624c;
                X4.a.q(i12 >= 0 && (i12 < (i10 = this.f626e) || (i12 == i10 && this.f625d == 0)));
                break;
            default:
                int i13 = this.f625d;
                X4.a.q(i13 >= 0 && (i13 < (i11 = this.f624c) || (i13 == i11 && this.f626e == 0)));
                break;
        }
    }

    public int t() {
        AbstractC0111a.h(this.f625d == 0);
        return this.f624c;
    }

    public int u() {
        return (this.f624c * 8) + this.f625d;
    }

    public boolean v() {
        switch (this.f622a) {
            case 0:
                boolean z10 = (this.f623b[this.f624c] & (ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD >> this.f625d)) != 0;
                G();
                return z10;
            case 1:
                boolean z11 = (this.f623b[this.f625d] & (ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD >> this.f626e)) != 0;
                G();
                return z11;
            default:
                boolean z12 = (((this.f623b[this.f625d] & ForkServer.ERROR) >> this.f626e) & 1) == 1;
                H(1);
                return z12;
        }
    }

    public int w(int i10) {
        switch (this.f622a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.f625d += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.f625d;
                    if (i12 <= 8) {
                        byte[] bArr = this.f623b;
                        int i13 = this.f624c;
                        int i14 = ((-1) >>> (32 - i10)) & (i11 | ((bArr[i13] & ForkServer.ERROR) >> (8 - i12)));
                        if (i12 == 8) {
                            this.f625d = 0;
                            this.f624c = i13 + 1;
                        }
                        e();
                        return i14;
                    }
                    int i15 = i12 - 8;
                    this.f625d = i15;
                    byte[] bArr2 = this.f623b;
                    int i16 = this.f624c;
                    this.f624c = i16 + 1;
                    i11 |= (bArr2[i16] & ForkServer.ERROR) << i15;
                }
                break;
            case 1:
                this.f626e += i10;
                int i17 = 0;
                while (true) {
                    int i18 = this.f626e;
                    int i19 = 2;
                    if (i18 <= 8) {
                        byte[] bArr3 = this.f623b;
                        int i20 = this.f625d;
                        int i21 = ((-1) >>> (32 - i10)) & (i17 | ((bArr3[i20] & ForkServer.ERROR) >> (8 - i18)));
                        if (i18 == 8) {
                            this.f626e = 0;
                            this.f625d = i20 + (F(i20 + 1) ? 2 : 1);
                        }
                        e();
                        return i21;
                    }
                    int i22 = i18 - 8;
                    this.f626e = i22;
                    byte[] bArr4 = this.f623b;
                    int i23 = this.f625d;
                    i17 |= (bArr4[i23] & ForkServer.ERROR) << i22;
                    if (!F(i23 + 1)) {
                        i19 = 1;
                    }
                    this.f625d = i23 + i19;
                }
                break;
            default:
                int i24 = this.f625d;
                int iMin = Math.min(i10, 8 - this.f626e);
                int i25 = i24 + 1;
                byte[] bArr5 = this.f623b;
                int i26 = ((bArr5[i24] & ForkServer.ERROR) >> this.f626e) & (ColorExtractionConstants.COLOR_COMPONENT_MASK >> (8 - iMin));
                while (iMin < i10) {
                    i26 |= (bArr5[i25] & ForkServer.ERROR) << iMin;
                    iMin += 8;
                    i25++;
                }
                int i27 = i26 & ((-1) >>> (32 - i10));
                H(i10);
                return i27;
        }
    }

    public void x(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f623b;
            int i13 = this.f624c;
            int i14 = i13 + 1;
            this.f624c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f625d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (ColorExtractionConstants.COLOR_COMPONENT_MASK >> i16));
        bArr[i11] = b12;
        int i17 = this.f625d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f623b;
            int i18 = this.f624c;
            this.f624c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & ForkServer.ERROR) << i17));
            this.f625d = i17 - 8;
        }
        int i19 = this.f625d + i16;
        this.f625d = i19;
        byte[] bArr4 = this.f623b;
        int i20 = this.f624c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f625d = 0;
            this.f624c = i20 + 1;
        }
        e();
    }

    public long y(int i10) {
        if (i10 <= 32) {
            int iW = w(i10);
            int i11 = C.f560a;
            return 4294967295L & ((long) iW);
        }
        int iW2 = w(i10 - 32);
        int iW3 = w(32);
        int i12 = C.f560a;
        return (4294967295L & ((long) iW3)) | ((((long) iW2) & 4294967295L) << 32);
    }

    public void z(byte[] bArr, int i10) {
        AbstractC0111a.h(this.f625d == 0);
        System.arraycopy(this.f623b, this.f624c, bArr, 0, i10);
        this.f624c += i10;
        e();
    }

    public t(int i10) {
        this.f622a = i10;
        switch (i10) {
            case 2:
                break;
            default:
                this.f623b = C.f565f;
                break;
        }
    }

    public t(int i10, byte[] bArr, int i11, int i12) {
        this.f622a = i12;
        switch (i12) {
            case 3:
                this.f623b = bArr;
                this.f625d = i10;
                this.f624c = i11;
                this.f626e = 0;
                s();
                break;
            default:
                this.f623b = bArr;
                this.f625d = i10;
                this.f624c = i11;
                this.f626e = 0;
                e();
                break;
        }
    }

    public t(byte[] bArr) {
        this.f622a = 4;
        this.f623b = bArr;
        this.f624c = bArr.length;
    }

    public t(int i10, int i11) {
        this.f622a = 5;
        this.f624c = i10;
        this.f625d = i11;
        this.f623b = new byte[(i11 * 2) - 1];
        this.f626e = 0;
    }
}
