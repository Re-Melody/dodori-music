package B2;

import A6.I;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f627d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f628e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I f629f = I.q(5, p267z6.h.f29877a, p267z6.h.f29879c, p267z6.h.f29882f, p267z6.h.f29880d, p267z6.h.f29881e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f632c;

    public u() {
        this.f630a = C.f565f;
    }

    public final long A() {
        int i10;
        int i11;
        long j10 = this.f630a[this.f631b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException(V0.p.j(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f630a[this.f631b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(V0.p.j(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f631b += i11;
        return j10;
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f630a;
            int i10 = this.f631b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f631b = i10 + 3;
                return p267z6.h.f29879c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f630a;
        int i11 = this.f631b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f631b = i11 + 2;
            return p267z6.h.f29880d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f631b = i11 + 2;
        return p267z6.h.f29881e;
    }

    public final void C(int i10) {
        byte[] bArr = this.f630a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        D(bArr, i10);
    }

    public final void D(byte[] bArr, int i10) {
        this.f630a = bArr;
        this.f632c = i10;
        this.f631b = 0;
    }

    public final void E(int i10) {
        AbstractC0111a.d(i10 >= 0 && i10 <= this.f630a.length);
        this.f632c = i10;
    }

    public final void F(int i10) {
        AbstractC0111a.d(i10 >= 0 && i10 <= this.f632c);
        this.f631b = i10;
    }

    public final void G(int i10) {
        F(this.f631b + i10);
    }

    public final int a() {
        return this.f632c - this.f631b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f630a;
        if (i10 > bArr.length) {
            this.f630a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char c(Charset charset) {
        AbstractC0111a.c("Unsupported charset: " + charset, f629f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b10;
        int i10;
        byte b11;
        byte b12;
        if ((charset.equals(p267z6.h.f29879c) || charset.equals(p267z6.h.f29877a)) && a() >= 1) {
            long j10 = this.f630a[this.f631b] & ForkServer.ERROR;
            char c3 = (char) j10;
            p229v9.a.i(((long) c3) == j10, "Out of range: %s", j10);
            b10 = (byte) c3;
            i10 = 1;
        } else {
            i10 = 2;
            if ((charset.equals(p267z6.h.f29882f) || charset.equals(p267z6.h.f29880d)) && a() >= 2) {
                byte[] bArr = this.f630a;
                int i11 = this.f631b;
                b11 = bArr[i11];
                b12 = bArr[i11 + 1];
            } else {
                if (!charset.equals(p267z6.h.f29881e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f630a;
                int i12 = this.f631b;
                b11 = bArr2[i12 + 1];
                b12 = bArr2[i12];
            }
            b10 = (byte) ((char) ((b12 & ForkServer.ERROR) | (b11 << 8)));
        }
        long j11 = b10;
        char c9 = (char) j11;
        p229v9.a.i(((long) c9) == j11, "Out of range: %s", j11);
        return (c9 << 16) + i10;
    }

    public final void e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f630a, this.f631b, bArr, i10, i11);
        this.f631b += i11;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c3 = (char) (iD >> 16);
            for (char c9 : cArr) {
                if (c9 == c3) {
                    this.f631b += iD & 65535;
                    return c3;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 24;
        int i13 = i10 + 2;
        this.f631b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 16) | i12;
        int i15 = i10 + 3;
        this.f631b = i15;
        int i16 = i14 | ((bArr[i13] & ForkServer.ERROR) << 8);
        this.f631b = i10 + 4;
        return (bArr[i15] & ForkServer.ERROR) | i16;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    public final String h(Charset charset) {
        int i10;
        byte[] bArr;
        AbstractC0111a.c("Unsupported charset: " + charset, f629f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = p267z6.h.f29877a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (charset.equals(p267z6.h.f29879c) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(p267z6.h.f29882f) && !charset.equals(p267z6.h.f29881e) && !charset.equals(p267z6.h.f29880d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f631b;
        while (true) {
            int i12 = this.f632c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if ((charset.equals(p267z6.h.f29879c) || charset.equals(p267z6.h.f29877a)) && C.G(this.f630a[i11])) {
                break;
            }
            if (charset.equals(p267z6.h.f29882f) || charset.equals(p267z6.h.f29880d)) {
                byte[] bArr2 = this.f630a;
                if (bArr2[i11] == 0 && C.G(bArr2[i11 + 1])) {
                    break;
                }
                if (charset.equals(p267z6.h.f29881e)) {
                    bArr = this.f630a;
                    if (bArr[i11 + 1] == 0 && C.G(bArr[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                if (charset.equals(p267z6.h.f29881e)) {
                    bArr = this.f630a;
                    if (bArr[i11 + 1] == 0) {
                        continue;
                    }
                }
                i11 += i10;
            }
        }
        String strR = r(i11 - this.f631b, charset);
        if (this.f631b != this.f632c && f(charset, f627d) == '\r') {
            f(charset, f628e);
        }
        return strR;
    }

    public final int i() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        int i12 = bArr[i10] & ForkServer.ERROR;
        int i13 = i10 + 2;
        this.f631b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
        int i15 = i10 + 3;
        this.f631b = i15;
        int i16 = i14 | ((bArr[i13] & ForkServer.ERROR) << 16);
        this.f631b = i10 + 4;
        return ((bArr[i15] & ForkServer.ERROR) << 24) | i16;
    }

    public final long j() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f631b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f631b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f631b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f631b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f631b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f631b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f631b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public final long k() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f631b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f631b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f631b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public final int l() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(p134m1.b.j(i10, "Top bit not zero: "));
    }

    public final int m() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        int i12 = bArr[i10] & ForkServer.ERROR;
        this.f631b = i10 + 2;
        return ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
    }

    public final long n() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f631b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f631b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f631b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f631b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f631b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f631b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f631b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final String o() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f631b;
        while (i10 < this.f632c && this.f630a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f630a;
        int i11 = this.f631b;
        int i12 = C.f560a;
        String str = new String(bArr, i11, i10 - i11, p267z6.h.f29879c);
        this.f631b = i10;
        if (i10 < this.f632c) {
            this.f631b = i10 + 1;
        }
        return str;
    }

    public final String p(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f631b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f632c || this.f630a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f630a;
        int i14 = C.f560a;
        String str = new String(bArr, i11, i13, p267z6.h.f29879c);
        this.f631b += i10;
        return str;
    }

    public final short q() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 8;
        this.f631b = i10 + 2;
        return (short) ((bArr[i11] & ForkServer.ERROR) | i12);
    }

    public final String r(int i10, Charset charset) {
        String str = new String(this.f630a, this.f631b, i10, charset);
        this.f631b += i10;
        return str;
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        this.f631b = i10 + 1;
        return bArr[i10] & ForkServer.ERROR;
    }

    public final int u() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 8;
        this.f631b = i10 + 2;
        int i13 = (bArr[i11] & ForkServer.ERROR) | i12;
        this.f631b = i10 + 4;
        return i13;
    }

    public final long v() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f631b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f631b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f631b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final int w() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 16;
        int i13 = i10 + 2;
        this.f631b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
        this.f631b = i10 + 3;
        return (bArr[i13] & ForkServer.ERROR) | i14;
    }

    public final int x() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(p134m1.b.j(iG, "Top bit not zero: "));
    }

    public final long y() {
        long jN = n();
        if (jN >= 0) {
            return jN;
        }
        throw new IllegalStateException(V0.p.j(jN, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f630a;
        int i10 = this.f631b;
        int i11 = i10 + 1;
        this.f631b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 8;
        this.f631b = i10 + 2;
        return (bArr[i11] & ForkServer.ERROR) | i12;
    }

    public u(int i10) {
        this.f630a = new byte[i10];
        this.f632c = i10;
    }

    public u(byte[] bArr) {
        this.f630a = bArr;
        this.f632c = bArr.length;
    }

    public u(byte[] bArr, int i10) {
        this.f630a = bArr;
        this.f632c = i10;
    }
}
