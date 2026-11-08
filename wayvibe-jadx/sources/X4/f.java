package X4;

import V0.p;
import java.nio.charset.Charset;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f13220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13222c;

    public f(int i10) {
        this.f13220a = new byte[i10];
        this.f13222c = i10;
    }

    public final int a() {
        return this.f13222c - this.f13221b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f13220a;
        if ((bArr == null ? 0 : bArr.length) < i10) {
            bArr = new byte[i10];
        }
        c(bArr, i10);
    }

    public final void c(byte[] bArr, int i10) {
        this.f13220a = bArr;
        this.f13222c = i10;
        this.f13221b = 0;
    }

    public final void d(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f13220a, this.f13221b, bArr, i10, i11);
        this.f13221b += i11;
    }

    public final void e(int i10) {
        a.k(i10 >= 0 && i10 <= this.f13220a.length);
        this.f13222c = i10;
    }

    public final void f(int i10) {
        a.k(i10 >= 0 && i10 <= this.f13222c);
        this.f13221b = i10;
    }

    public final void g(int i10) {
        f(this.f13221b + i10);
    }

    public final String h(int i10) {
        String str = new String(this.f13220a, this.f13221b, i10, Charset.forName("UTF-8"));
        this.f13221b += i10;
        return str;
    }

    public final int i() {
        byte[] bArr = this.f13220a;
        int i10 = this.f13221b;
        this.f13221b = i10 + 1;
        return bArr[i10] & ForkServer.ERROR;
    }

    public final String j(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f13221b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f13220a, i11, (i12 >= this.f13222c || this.f13220a[i12] != 0) ? i10 : i10 - 1);
        this.f13221b += i10;
        return str;
    }

    public final int k() {
        byte[] bArr = this.f13220a;
        int i10 = this.f13221b;
        int i11 = i10 + 1;
        this.f13221b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 8;
        this.f13221b = i10 + 2;
        return (bArr[i11] & ForkServer.ERROR) | i12;
    }

    public final int l() {
        byte[] bArr = this.f13220a;
        int i10 = this.f13221b;
        int i11 = i10 + 1;
        this.f13221b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 16;
        int i13 = i10 + 2;
        this.f13221b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 8) | i12;
        this.f13221b = i10 + 3;
        return (bArr[i13] & ForkServer.ERROR) | i14;
    }

    public final long m() {
        byte[] bArr = this.f13220a;
        int i10 = this.f13221b;
        int i11 = i10 + 1;
        this.f13221b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f13221b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f13221b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f13221b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final int n() {
        byte[] bArr = this.f13220a;
        int i10 = this.f13221b;
        int i11 = i10 + 1;
        this.f13221b = i11;
        int i12 = (bArr[i10] & ForkServer.ERROR) << 24;
        int i13 = i10 + 2;
        this.f13221b = i13;
        int i14 = ((bArr[i11] & ForkServer.ERROR) << 16) | i12;
        int i15 = i10 + 3;
        this.f13221b = i15;
        int i16 = i14 | ((bArr[i13] & ForkServer.ERROR) << 8);
        this.f13221b = i10 + 4;
        return (bArr[i15] & ForkServer.ERROR) | i16;
    }

    public final long o() {
        byte[] bArr = this.f13220a;
        int i10 = this.f13221b;
        int i11 = i10 + 1;
        this.f13221b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f13221b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f13221b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f13221b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f13221b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f13221b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f13221b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f13221b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final int p() {
        return (i() << 21) | (i() << 14) | (i() << 7) | i();
    }

    public final int q() {
        int iN = n();
        if (iN >= 0) {
            return iN;
        }
        throw new IllegalStateException(p134m1.b.j(iN, "Top bit not zero: "));
    }

    public final long r() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(p.j(jO, "Top bit not zero: "));
    }

    public final String s() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f13221b;
        while (i10 < this.f13222c && this.f13220a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f13220a;
        int i11 = this.f13221b;
        String str = new String(bArr, i11, i10 - i11);
        this.f13221b = i10;
        if (i10 < this.f13222c) {
            this.f13221b = i10 + 1;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    public final String t() {
        int i10;
        if (a() == 0) {
            return null;
        }
        int i11 = this.f13221b;
        while (i11 < this.f13222c) {
            byte b10 = this.f13220a[i11];
            int i12 = j.f13232a;
            if (b10 == 10 || b10 == 13) {
                break;
            }
            i11++;
        }
        int i13 = this.f13221b;
        if (i11 - i13 >= 3) {
            byte[] bArr = this.f13220a;
            if (bArr[i13] == -17 && bArr[i13 + 1] == -69 && bArr[i13 + 2] == -65) {
                this.f13221b = i13 + 3;
            }
        }
        byte[] bArr2 = this.f13220a;
        int i14 = this.f13221b;
        String str = new String(bArr2, i14, i11 - i14);
        this.f13221b = i11;
        int i15 = this.f13222c;
        if (i11 != i15) {
            byte[] bArr3 = this.f13220a;
            if (bArr3[i11] == 13) {
                int i16 = i11 + 1;
                this.f13221b = i16;
                if (i16 != i15) {
                    i10 = this.f13221b;
                    if (bArr3[i10] == 10) {
                        this.f13221b = i10 + 1;
                    }
                }
            } else {
                i10 = this.f13221b;
                if (bArr3[i10] == 10) {
                    this.f13221b = i10 + 1;
                }
            }
        }
        return str;
    }

    public f(byte[] bArr) {
        this.f13220a = bArr;
        this.f13222c = bArr.length;
    }

    public f(byte[] bArr, int i10) {
        this.f13220a = bArr;
        this.f13222c = i10;
    }
}
