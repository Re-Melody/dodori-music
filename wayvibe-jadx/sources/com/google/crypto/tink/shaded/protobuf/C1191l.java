package com.google.crypto.tink.shaded.protobuf;

import B2.AbstractC0112b;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1191l extends S5.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f18461g = Logger.getLogger(C1191l.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f18462h = n0.f18474e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N f18463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18466f;

    public C1191l(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC0112b.e("Array range is invalid. Buffer.length=", bArr.length, i10, ", offset=0, length="));
        }
        this.f18464d = bArr;
        this.f18466f = 0;
        this.f18465e = i10;
    }

    public static int V(int i10, AbstractC1188i abstractC1188i) {
        int iZ = Z(i10);
        int size = abstractC1188i.size();
        return a0(size) + size + iZ;
    }

    public static int W(int i10) {
        return a0((i10 >> 31) ^ (i10 << 1));
    }

    public static int X(long j10) {
        return b0((j10 >> 63) ^ (j10 << 1));
    }

    public static int Y(String str) {
        int length;
        try {
            length = q0.b(str);
        } catch (p0 unused) {
            length = str.getBytes(E.f18377a).length;
        }
        return a0(length) + length;
    }

    public static int Z(int i10) {
        return a0(i10 << 3);
    }

    public static int a0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int b0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void c0(byte b10) throws I2.a {
        int i10 = this.f18466f;
        try {
            int i11 = i10 + 1;
            try {
                this.f18464d[i10] = b10;
                this.f18466f = i11;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i10 = i11;
                throw new I2.a(i10, this.f18465e, 1, e);
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    public final void d0(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f18464d, this.f18466f, i11);
            this.f18466f += i11;
        } catch (IndexOutOfBoundsException e2) {
            throw new I2.a(this.f18466f, this.f18465e, i11, e2);
        }
    }

    public final void e0(int i10, int i11) {
        k0(i10, 5);
        f0(i11);
    }

    public final void f0(int i10) throws I2.a {
        int i11 = this.f18466f;
        try {
            byte[] bArr = this.f18464d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f18466f = i11 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new I2.a(i11, this.f18465e, 4, e2);
        }
    }

    public final void g0(int i10, long j10) {
        k0(i10, 1);
        h0(j10);
    }

    public final void h0(long j10) throws I2.a {
        int i10 = this.f18466f;
        try {
            byte[] bArr = this.f18464d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f18466f = i10 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new I2.a(i10, this.f18465e, 8, e2);
        }
    }

    public final void i0(int i10, int i11) throws I2.a {
        k0(i10, 0);
        j0(i11);
    }

    public final void j0(int i10) throws I2.a {
        if (i10 >= 0) {
            m0(i10);
        } else {
            o0(i10);
        }
    }

    public final void k0(int i10, int i11) {
        m0((i10 << 3) | i11);
    }

    public final void l0(int i10, int i11) {
        k0(i10, 0);
        m0(i11);
    }

    public final void m0(int i10) {
        int i11;
        int i12 = this.f18466f;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.f18464d;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f18466f = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e2) {
                    throw new I2.a(i11, this.f18465e, 1, e2);
                }
            }
            throw new I2.a(i11, this.f18465e, 1, e2);
        }
    }

    public final void n0(int i10, long j10) {
        k0(i10, 0);
        o0(j10);
    }

    public final void o0(long j10) throws I2.a {
        int i10;
        int i11 = this.f18466f;
        byte[] bArr = this.f18464d;
        boolean z10 = f18462h;
        int i12 = this.f18465e;
        if (!z10 || i12 - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j10) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    j10 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e2) {
                    throw new I2.a(i10, i12, 1, e2);
                }
            }
            i10 = i11 + 1;
            bArr[i11] = (byte) j10;
        } else {
            while ((j10 & (-128)) != 0) {
                n0.k(bArr, i11, (byte) (((int) j10) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            n0.k(bArr, i11, (byte) j10);
        }
        this.f18466f = i10;
    }
}
