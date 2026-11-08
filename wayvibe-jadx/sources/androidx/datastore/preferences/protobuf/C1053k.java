package androidx.datastore.preferences.protobuf;

import D8.C0312s1;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1053k extends R3.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f15125f = Logger.getLogger(C1053k.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f15126g = p0.f15145e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J f15127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0312s1 f15131e;

    public C1053k(C0312s1 c0312s1, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f15128b = new byte[iMax];
        this.f15129c = iMax;
        this.f15131e = c0312s1;
    }

    public static int s0(int i10, C1049g c1049g) {
        int iU0 = u0(i10);
        int size = c1049g.size();
        return v0(size) + size + iU0;
    }

    public static int t0(String str) {
        int length;
        try {
            length = s0.a(str);
        } catch (r0 unused) {
            length = str.getBytes(A.f15023a).length;
        }
        return v0(length) + length;
    }

    public static int u0(int i10) {
        return v0(i10 << 3);
    }

    public static int v0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int w0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void A0(byte[] bArr, int i10, int i11) {
        int i12 = this.f15130d;
        int i13 = this.f15129c;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f15128b;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f15130d += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f15130d = i13;
        x0();
        if (i16 > i13) {
            this.f15131e.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f15130d = i16;
        }
    }

    public final void B0(int i10, boolean z10) {
        y0(11);
        p0(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f15130d;
        this.f15130d = i11 + 1;
        this.f15128b[i11] = b10;
    }

    public final void C0(int i10, C1049g c1049g) {
        N0(i10, 2);
        D0(c1049g);
    }

    public final void D0(C1049g c1049g) {
        P0(c1049g.size());
        l0(c1049g.f15095b, c1049g.k(), c1049g.size());
    }

    public final void E0(int i10, int i11) {
        y0(14);
        p0(i10, 5);
        n0(i11);
    }

    public final void F0(int i10) {
        y0(4);
        n0(i10);
    }

    public final void G0(int i10, long j10) {
        y0(18);
        p0(i10, 1);
        o0(j10);
    }

    public final void H0(long j10) {
        y0(8);
        o0(j10);
    }

    public final void I0(int i10, int i11) {
        y0(20);
        p0(i10, 0);
        if (i11 >= 0) {
            q0(i11);
        } else {
            r0(i11);
        }
    }

    public final void J0(int i10) {
        if (i10 >= 0) {
            P0(i10);
        } else {
            R0(i10);
        }
    }

    public final void K0(int i10, AbstractC1043a abstractC1043a, c0 c0Var) {
        N0(i10, 2);
        P0(abstractC1043a.a(c0Var));
        c0Var.d(abstractC1043a, this.f15127a);
    }

    public final void L0(int i10, String str) throws I2.a {
        N0(i10, 2);
        M0(str);
    }

    public final void M0(String str) throws I2.a {
        try {
            int length = str.length() * 3;
            int iV0 = v0(length);
            int i10 = iV0 + length;
            int i11 = this.f15129c;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iT = s0.f15154a.t(str, bArr, 0, length);
                P0(iT);
                A0(bArr, 0, iT);
                return;
            }
            if (i10 > i11 - this.f15130d) {
                x0();
            }
            int iV1 = v0(str.length());
            int i12 = this.f15130d;
            byte[] bArr2 = this.f15128b;
            try {
                try {
                    if (iV1 == iV0) {
                        int i13 = i12 + iV1;
                        this.f15130d = i13;
                        int iT2 = s0.f15154a.t(str, bArr2, i13, i11 - i13);
                        this.f15130d = i12;
                        q0((iT2 - i12) - iV1);
                        this.f15130d = iT2;
                    } else {
                        int iA = s0.a(str);
                        q0(iA);
                        this.f15130d = s0.f15154a.t(str, bArr2, this.f15130d, iA);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new I2.a((IndexOutOfBoundsException) e2);
                }
            } catch (r0 e4) {
                this.f15130d = i12;
                throw e4;
            }
        } catch (r0 e7) {
            f15125f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(A.f15023a);
            try {
                P0(bytes.length);
                l0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new I2.a(e10);
            }
        }
    }

    public final void N0(int i10, int i11) {
        P0((i10 << 3) | i11);
    }

    public final void O0(int i10, int i11) {
        y0(20);
        p0(i10, 0);
        q0(i11);
    }

    public final void P0(int i10) {
        y0(5);
        q0(i10);
    }

    public final void Q0(int i10, long j10) {
        y0(20);
        p0(i10, 0);
        r0(j10);
    }

    public final void R0(long j10) {
        y0(10);
        r0(j10);
    }

    @Override // R3.a
    public final void l0(byte[] bArr, int i10, int i11) {
        A0(bArr, i10, i11);
    }

    public final void n0(int i10) {
        int i11 = this.f15130d;
        int i12 = i11 + 1;
        this.f15130d = i12;
        byte b10 = (byte) (i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        byte[] bArr = this.f15128b;
        bArr[i11] = b10;
        int i13 = i11 + 2;
        this.f15130d = i13;
        bArr[i12] = (byte) ((i10 >> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        int i14 = i11 + 3;
        this.f15130d = i14;
        bArr[i13] = (byte) ((i10 >> 16) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        this.f15130d = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
    }

    public final void o0(long j10) {
        int i10 = this.f15130d;
        int i11 = i10 + 1;
        this.f15130d = i11;
        byte[] bArr = this.f15128b;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f15130d = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f15130d = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f15130d = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f15130d = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        int i16 = i10 + 6;
        this.f15130d = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        int i17 = i10 + 7;
        this.f15130d = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        this.f15130d = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
    }

    public final void p0(int i10, int i11) {
        q0((i10 << 3) | i11);
    }

    public final void q0(int i10) {
        boolean z10 = f15126g;
        byte[] bArr = this.f15128b;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f15130d;
                this.f15130d = i11 + 1;
                p0.j(bArr, i11, (byte) ((i10 | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) & ColorExtractionConstants.COLOR_COMPONENT_MASK));
                i10 >>>= 7;
            }
            int i12 = this.f15130d;
            this.f15130d = i12 + 1;
            p0.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f15130d;
            this.f15130d = i13 + 1;
            bArr[i13] = (byte) ((i10 | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
            i10 >>>= 7;
        }
        int i14 = this.f15130d;
        this.f15130d = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void r0(long j10) {
        boolean z10 = f15126g;
        byte[] bArr = this.f15128b;
        if (z10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f15130d;
                this.f15130d = i10 + 1;
                p0.j(bArr, i10, (byte) ((((int) j10) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) & ColorExtractionConstants.COLOR_COMPONENT_MASK));
                j10 >>>= 7;
            }
            int i11 = this.f15130d;
            this.f15130d = i11 + 1;
            p0.j(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i12 = this.f15130d;
            this.f15130d = i12 + 1;
            bArr[i12] = (byte) ((((int) j10) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
            j10 >>>= 7;
        }
        int i13 = this.f15130d;
        this.f15130d = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    public final void x0() {
        this.f15131e.write(this.f15128b, 0, this.f15130d);
        this.f15130d = 0;
    }

    public final void y0(int i10) {
        if (this.f15129c - this.f15130d < i10) {
            x0();
        }
    }

    public final void z0(byte b10) {
        if (this.f15130d == this.f15129c) {
            x0();
        }
        int i10 = this.f15130d;
        this.f15130d = i10 + 1;
        this.f15128b[i10] = b10;
    }
}
