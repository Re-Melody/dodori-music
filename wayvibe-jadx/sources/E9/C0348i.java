package E9;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: E9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0348i implements InterfaceC0350k, InterfaceC0349j, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H f3386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3387b;

    public final long A() throws EOFException {
        int i10;
        if (this.f3387b == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            H h10 = this.f3386a;
            kotlin.jvm.internal.m.c(h10);
            int i12 = h10.f3349b;
            int i13 = h10.f3350c;
            while (i12 < i13) {
                byte b10 = h10.f3348a[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(AbstractC0341b.k(b10)));
                        }
                        z10 = true;
                        break;
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    C0348i c0348i = new C0348i();
                    c0348i.M(j10);
                    c0348i.K(b10);
                    throw new NumberFormatException("Number too large: ".concat(c0348i.D()));
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f3386a = h10.a();
                I.a(h10);
            } else {
                h10.f3349b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f3386a != null);
        this.f3387b -= (long) i11;
        return j10;
    }

    public final short B() throws EOFException {
        short s8 = readShort();
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    public final String C(long j10, Charset charset) throws EOFException {
        kotlin.jvm.internal.m.f(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(V0.p.j(j10, "byteCount: ").toString());
        }
        if (this.f3387b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        H h10 = this.f3386a;
        kotlin.jvm.internal.m.c(h10);
        int i10 = h10.f3349b;
        if (((long) i10) + j10 > h10.f3350c) {
            return new String(z(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(h10.f3348a, i10, i11, charset);
        int i12 = h10.f3349b + i11;
        h10.f3349b = i12;
        this.f3387b -= j10;
        if (i12 == h10.f3350c) {
            this.f3386a = h10.a();
            I.a(h10);
        }
        return str;
    }

    public final String D() {
        return C(this.f3387b, p097i9.a.f20563a);
    }

    public final C0351l E() {
        long j10 = this.f3387b;
        if (j10 <= 2147483647L) {
            return F((int) j10);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f3387b).toString());
    }

    public final C0351l F(int i10) {
        if (i10 == 0) {
            return C0351l.f3388d;
        }
        AbstractC0341b.e(this.f3387b, 0L, i10);
        H h10 = this.f3386a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.m.c(h10);
            int i14 = h10.f3350c;
            int i15 = h10.f3349b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            h10 = h10.f3353f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        H h11 = this.f3386a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.m.c(h11);
            bArr[i16] = h11.f3348a;
            i11 += h11.f3350c - h11.f3349b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = h11.f3349b;
            h11.f3351d = true;
            i16++;
            h11 = h11.f3353f;
        }
        return new J(bArr, iArr);
    }

    public final H G(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        H h10 = this.f3386a;
        if (h10 == null) {
            H hB = I.b();
            this.f3386a = hB;
            hB.f3354g = hB;
            hB.f3353f = hB;
            return hB;
        }
        H h11 = h10.f3354g;
        kotlin.jvm.internal.m.c(h11);
        if (h11.f3350c + i10 <= 8192 && h11.f3352e) {
            return h11;
        }
        H hB2 = I.b();
        h11.b(hB2);
        return hB2;
    }

    public final void H(C0351l byteString) {
        kotlin.jvm.internal.m.f(byteString, "byteString");
        byteString.B(this, byteString.k());
    }

    public final void I(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.m.f(source, "source");
        long j10 = i11;
        AbstractC0341b.e(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            H hG = G(1);
            int iMin = Math.min(i12 - i10, 8192 - hG.f3350c);
            int i13 = i10 + iMin;
            N8.m.i0(hG.f3350c, source, i10, hG.f3348a, i13);
            hG.f3350c += iMin;
            i10 = i13;
        }
        this.f3387b += j10;
    }

    public final long J(M source) {
        kotlin.jvm.internal.m.f(source, "source");
        long j10 = 0;
        while (true) {
            long jD = source.d(8192L, this);
            if (jD == -1) {
                return j10;
            }
            j10 += jD;
        }
    }

    public final void K(int i10) {
        H hG = G(1);
        int i11 = hG.f3350c;
        hG.f3350c = i11 + 1;
        hG.f3348a[i11] = (byte) i10;
        this.f3387b++;
    }

    public final void L(long j10) {
        boolean z10;
        byte[] bArr;
        if (j10 == 0) {
            K(48);
            return;
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                R("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        byte[] bArr2 = F9.a.f4616a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        int i10 = iNumberOfLeadingZeros + (j10 > F9.a.f4617b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z10) {
            i10++;
        }
        H hG = G(i10);
        int i11 = hG.f3350c + i10;
        while (true) {
            bArr = hG.f3348a;
            if (j10 == 0) {
                break;
            }
            long j11 = 10;
            i11--;
            bArr[i11] = F9.a.f4616a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        hG.f3350c += i10;
        this.f3387b += (long) i10;
    }

    public final void M(long j10) {
        if (j10 == 0) {
            K(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        H hG = G(i10);
        int i11 = hG.f3350c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            hG.f3348a[i12] = F9.a.f4616a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        hG.f3350c += i10;
        this.f3387b += (long) i10;
    }

    public final void N(int i10) {
        H hG = G(4);
        int i11 = hG.f3350c;
        byte b10 = (byte) ((i10 >>> 24) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        byte[] bArr = hG.f3348a;
        bArr[i11] = b10;
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        bArr[i11 + 3] = (byte) (i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        hG.f3350c = i11 + 4;
        this.f3387b += 4;
    }

    public final void O(int i10) {
        H hG = G(2);
        int i11 = hG.f3350c;
        byte b10 = (byte) ((i10 >>> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        byte[] bArr = hG.f3348a;
        bArr[i11] = b10;
        bArr[i11 + 1] = (byte) (i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        hG.f3350c = i11 + 2;
        this.f3387b += 2;
    }

    public final void P(OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.m.f(out, "out");
        AbstractC0341b.e(this.f3387b, 0L, j10);
        H h10 = this.f3386a;
        long j11 = j10;
        while (j11 > 0) {
            kotlin.jvm.internal.m.c(h10);
            int iMin = (int) Math.min(j11, h10.f3350c - h10.f3349b);
            out.write(h10.f3348a, h10.f3349b, iMin);
            int i10 = h10.f3349b + iMin;
            h10.f3349b = i10;
            long j12 = iMin;
            this.f3387b -= j12;
            j11 -= j12;
            if (i10 == h10.f3350c) {
                H hA = h10.a();
                this.f3386a = hA;
                I.a(h10);
                h10 = hA;
            }
        }
    }

    public final void Q(int i10, int i11, String string) {
        char cCharAt;
        kotlin.jvm.internal.m.f(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC0112b.e("endIndex < beginIndex: ", i11, i10, " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbP = p134m1.b.p(i11, "endIndex > string.length: ", " > ");
            sbP.append(string.length());
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                H hG = G(1);
                int i12 = hG.f3350c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                byte[] bArr = hG.f3348a;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = hG.f3350c;
                int i15 = (i12 + i10) - i14;
                hG.f3350c = i14 + i15;
                this.f3387b += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    H hG2 = G(2);
                    int i16 = hG2.f3350c;
                    byte[] bArr2 = hG2.f3348a;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    hG2.f3350c = i16 + 2;
                    this.f3387b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    H hG3 = G(3);
                    int i17 = hG3.f3350c;
                    byte[] bArr3 = hG3.f3348a;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    hG3.f3350c = i17 + 3;
                    this.f3387b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        K(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + ETagPayloadStore.CHUNK_CHARS;
                        H hG4 = G(4);
                        int i20 = hG4.f3350c;
                        byte[] bArr4 = hG4.f3348a;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                        hG4.f3350c = i20 + 4;
                        this.f3387b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final void R(String string) {
        kotlin.jvm.internal.m.f(string, "string");
        Q(0, string.length(), string);
    }

    public final void S(int i10) {
        if (i10 < 128) {
            K(i10);
            return;
        }
        if (i10 < 2048) {
            H hG = G(2);
            int i11 = hG.f3350c;
            byte[] bArr = hG.f3348a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
            hG.f3350c = i11 + 2;
            this.f3387b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            K(63);
            return;
        }
        if (i10 < 65536) {
            H hG2 = G(3);
            int i12 = hG2.f3350c;
            byte[] bArr2 = hG2.f3348a;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
            hG2.f3350c = i12 + 3;
            this.f3387b += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC0341b.l(i10)));
        }
        H hG3 = G(4);
        int i13 = hG3.f3350c;
        byte[] bArr3 = hG3.f3348a;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
        hG3.f3350c = i13 + 4;
        this.f3387b += 4;
    }

    @Override // E9.InterfaceC0350k
    public final C0351l a(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(V0.p.j(j10, "byteCount: ").toString());
        }
        if (this.f3387b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C0351l(z(j10));
        }
        C0351l c0351lF = F((int) j10);
        skip(j10);
        return c0351lF;
    }

    public final void b() throws EOFException {
        skip(this.f3387b);
    }

    public final long c() {
        long j10 = this.f3387b;
        if (j10 == 0) {
            return 0L;
        }
        H h10 = this.f3386a;
        kotlin.jvm.internal.m.c(h10);
        H h11 = h10.f3354g;
        kotlin.jvm.internal.m.c(h11);
        int i10 = h11.f3350c;
        return (i10 >= 8192 || !h11.f3352e) ? j10 : j10 - ((long) (i10 - h11.f3349b));
    }

    public final Object clone() {
        C0348i c0348i = new C0348i();
        if (this.f3387b == 0) {
            return c0348i;
        }
        H h10 = this.f3386a;
        kotlin.jvm.internal.m.c(h10);
        H hC = h10.c();
        c0348i.f3386a = hC;
        hC.f3354g = hC;
        hC.f3353f = hC;
        for (H h11 = h10.f3353f; h11 != h10; h11 = h11.f3353f) {
            H h12 = hC.f3354g;
            kotlin.jvm.internal.m.c(h12);
            kotlin.jvm.internal.m.c(h11);
            h12.b(h11.c());
        }
        c0348i.f3387b = this.f3387b;
        return c0348i;
    }

    @Override // E9.M
    public final long d(long j10, C0348i sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(V0.p.j(j10, "byteCount < 0: ").toString());
        }
        long j11 = this.f3387b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.r(j10, this);
        return j10;
    }

    public final void e(C0348i out, long j10, long j11) {
        kotlin.jvm.internal.m.f(out, "out");
        long j12 = j10;
        AbstractC0341b.e(this.f3387b, j12, j11);
        if (j11 == 0) {
            return;
        }
        out.f3387b += j11;
        H h10 = this.f3386a;
        while (true) {
            kotlin.jvm.internal.m.c(h10);
            long j13 = h10.f3350c - h10.f3349b;
            if (j12 < j13) {
                break;
            }
            j12 -= j13;
            h10 = h10.f3353f;
        }
        H h11 = h10;
        long j14 = j11;
        while (j14 > 0) {
            kotlin.jvm.internal.m.c(h11);
            H hC = h11.c();
            int i10 = hC.f3349b + ((int) j12);
            hC.f3349b = i10;
            hC.f3350c = Math.min(i10 + ((int) j14), hC.f3350c);
            H h12 = out.f3386a;
            if (h12 == null) {
                hC.f3354g = hC;
                hC.f3353f = hC;
                out.f3386a = hC;
            } else {
                H h13 = h12.f3354g;
                kotlin.jvm.internal.m.c(h13);
                h13.b(hC);
            }
            j14 -= (long) (hC.f3350c - hC.f3349b);
            h11 = h11.f3353f;
            j12 = 0;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        boolean z11 = false;
        if (!(obj instanceof C0348i)) {
            return false;
        }
        long j10 = this.f3387b;
        C0348i c0348i = (C0348i) obj;
        if (j10 != c0348i.f3387b) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        H h10 = this.f3386a;
        kotlin.jvm.internal.m.c(h10);
        H h11 = c0348i.f3386a;
        kotlin.jvm.internal.m.c(h11);
        int i10 = h10.f3349b;
        int i11 = h11.f3349b;
        long j11 = 0;
        while (j11 < this.f3387b) {
            long jMin = Math.min(h10.f3350c - i10, h11.f3350c - i11);
            long j12 = 0;
            while (j12 < jMin) {
                int i12 = i10 + 1;
                boolean z12 = z10;
                byte b10 = h10.f3348a[i10];
                int i13 = i11 + 1;
                boolean z13 = z11;
                if (b10 != h11.f3348a[i11]) {
                    return z13;
                }
                j12++;
                i11 = i13;
                i10 = i12;
                z10 = z12;
                z11 = z13;
            }
            boolean z14 = z10;
            boolean z15 = z11;
            if (i10 == h10.f3350c) {
                H h12 = h10.f3353f;
                kotlin.jvm.internal.m.c(h12);
                i10 = h12.f3349b;
                h10 = h12;
            }
            if (i11 == h11.f3350c) {
                h11 = h11.f3353f;
                kotlin.jvm.internal.m.c(h11);
                i11 = h11.f3349b;
            }
            j11 += jMin;
            z10 = z14;
            z11 = z15;
        }
        return z10;
    }

    @Override // E9.M
    public final O f() {
        return O.f3360d;
    }

    public final boolean g() {
        return this.f3387b == 0;
    }

    @Override // E9.InterfaceC0349j
    public final /* bridge */ /* synthetic */ InterfaceC0349j h(int i10) {
        O(i10);
        return this;
    }

    public final int hashCode() {
        H h10 = this.f3386a;
        if (h10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = h10.f3350c;
            for (int i12 = h10.f3349b; i12 < i11; i12++) {
                i10 = (i10 * 31) + h10.f3348a[i12];
            }
            h10 = h10.f3353f;
            kotlin.jvm.internal.m.c(h10);
        } while (h10 != this.f3386a);
        return i10;
    }

    @Override // E9.InterfaceC0349j
    public final /* bridge */ /* synthetic */ InterfaceC0349j i(int i10) {
        N(i10);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // E9.InterfaceC0349j
    public final /* bridge */ /* synthetic */ InterfaceC0349j j(int i10) {
        K(i10);
        return this;
    }

    @Override // E9.InterfaceC0350k
    public final byte[] k() {
        return z(this.f3387b);
    }

    public final byte l(long j10) {
        AbstractC0341b.e(this.f3387b, j10, 1L);
        H h10 = this.f3386a;
        if (h10 == null) {
            kotlin.jvm.internal.m.c(null);
            throw null;
        }
        long j11 = this.f3387b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                h10 = h10.f3354g;
                kotlin.jvm.internal.m.c(h10);
                j11 -= (long) (h10.f3350c - h10.f3349b);
            }
            return h10.f3348a[(int) ((((long) h10.f3349b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = h10.f3350c;
            int i11 = h10.f3349b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return h10.f3348a[(int) ((((long) i11) + j10) - j12)];
            }
            h10 = h10.f3353f;
            kotlin.jvm.internal.m.c(h10);
            j12 = j13;
        }
    }

    @Override // E9.InterfaceC0350k
    public final String n(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(V0.p.j(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jV = v(0L, j11, (byte) 10);
        if (jV != -1) {
            return F9.a.b(jV, this);
        }
        if (j11 < this.f3387b && l(j11 - 1) == 13 && l(j11) == 10) {
            return F9.a.b(j11, this);
        }
        C0348i c0348i = new C0348i();
        e(c0348i, 0L, Math.min(32, this.f3387b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f3387b, j10) + " content=" + c0348i.a(c0348i.f3387b).l() + (char) 8230);
    }

    @Override // E9.InterfaceC0349j
    public final /* bridge */ /* synthetic */ InterfaceC0349j o(C0351l c0351l) {
        H(c0351l);
        return this;
    }

    @Override // E9.InterfaceC0349j
    public final /* bridge */ /* synthetic */ InterfaceC0349j p(String str) {
        R(str);
        return this;
    }

    @Override // E9.K
    public final void r(long j10, C0348i source) {
        H hB;
        kotlin.jvm.internal.m.f(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0341b.e(source.f3387b, 0L, j10);
        while (j10 > 0) {
            H h10 = source.f3386a;
            kotlin.jvm.internal.m.c(h10);
            int i10 = h10.f3350c;
            H h11 = source.f3386a;
            kotlin.jvm.internal.m.c(h11);
            long j11 = i10 - h11.f3349b;
            int i11 = 0;
            if (j10 < j11) {
                H h12 = this.f3386a;
                H h13 = h12 != null ? h12.f3354g : null;
                if (h13 != null && h13.f3352e) {
                    if ((((long) h13.f3350c) + j10) - ((long) (h13.f3351d ? 0 : h13.f3349b)) <= 8192) {
                        H h14 = source.f3386a;
                        kotlin.jvm.internal.m.c(h14);
                        h14.d(h13, (int) j10);
                        source.f3387b -= j10;
                        this.f3387b += j10;
                        return;
                    }
                }
                H h15 = source.f3386a;
                kotlin.jvm.internal.m.c(h15);
                int i12 = (int) j10;
                if (i12 <= 0 || i12 > h15.f3350c - h15.f3349b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    hB = h15.c();
                } else {
                    hB = I.b();
                    int i13 = h15.f3349b;
                    N8.m.i0(0, h15.f3348a, i13, hB.f3348a, i13 + i12);
                }
                hB.f3350c = hB.f3349b + i12;
                h15.f3349b += i12;
                H h16 = h15.f3354g;
                kotlin.jvm.internal.m.c(h16);
                h16.b(hB);
                source.f3386a = hB;
            }
            H h17 = source.f3386a;
            kotlin.jvm.internal.m.c(h17);
            long j12 = h17.f3350c - h17.f3349b;
            source.f3386a = h17.a();
            H h18 = this.f3386a;
            if (h18 == null) {
                this.f3386a = h17;
                h17.f3354g = h17;
                h17.f3353f = h17;
            } else {
                H h19 = h18.f3354g;
                kotlin.jvm.internal.m.c(h19);
                h19.b(h17);
                H h20 = h17.f3354g;
                if (h20 == h17) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.m.c(h20);
                if (h20.f3352e) {
                    int i14 = h17.f3350c - h17.f3349b;
                    H h21 = h17.f3354g;
                    kotlin.jvm.internal.m.c(h21);
                    int i15 = 8192 - h21.f3350c;
                    H h22 = h17.f3354g;
                    kotlin.jvm.internal.m.c(h22);
                    if (!h22.f3351d) {
                        H h23 = h17.f3354g;
                        kotlin.jvm.internal.m.c(h23);
                        i11 = h23.f3349b;
                    }
                    if (i14 <= i15 + i11) {
                        H h24 = h17.f3354g;
                        kotlin.jvm.internal.m.c(h24);
                        h17.d(h24, i14);
                        h17.a();
                        I.a(h17);
                    }
                }
            }
            source.f3387b -= j12;
            this.f3387b += j12;
            j10 -= j12;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        H h10 = this.f3386a;
        if (h10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), h10.f3350c - h10.f3349b);
        sink.put(h10.f3348a, h10.f3349b, iMin);
        int i10 = h10.f3349b + iMin;
        h10.f3349b = i10;
        this.f3387b -= (long) iMin;
        if (i10 == h10.f3350c) {
            this.f3386a = h10.a();
            I.a(h10);
        }
        return iMin;
    }

    @Override // E9.InterfaceC0350k
    public final byte readByte() throws EOFException {
        if (this.f3387b == 0) {
            throw new EOFException();
        }
        H h10 = this.f3386a;
        kotlin.jvm.internal.m.c(h10);
        int i10 = h10.f3349b;
        int i11 = h10.f3350c;
        int i12 = i10 + 1;
        byte b10 = h10.f3348a[i10];
        this.f3387b--;
        if (i12 != i11) {
            h10.f3349b = i12;
            return b10;
        }
        this.f3386a = h10.a();
        I.a(h10);
        return b10;
    }

    @Override // E9.InterfaceC0350k
    public final int readInt() throws EOFException {
        if (this.f3387b < 4) {
            throw new EOFException();
        }
        H h10 = this.f3386a;
        kotlin.jvm.internal.m.c(h10);
        int i10 = h10.f3349b;
        int i11 = h10.f3350c;
        if (i11 - i10 < 4) {
            return ((readByte() & ForkServer.ERROR) << 24) | ((readByte() & ForkServer.ERROR) << 16) | ((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR);
        }
        byte[] bArr = h10.f3348a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & ForkServer.ERROR) << 16) | ((bArr[i10] & ForkServer.ERROR) << 24) | ((bArr[i10 + 2] & ForkServer.ERROR) << 8);
        int i14 = i10 + 4;
        int i15 = i13 | (bArr[i12] & ForkServer.ERROR);
        this.f3387b -= 4;
        if (i14 != i11) {
            h10.f3349b = i14;
            return i15;
        }
        this.f3386a = h10.a();
        I.a(h10);
        return i15;
    }

    @Override // E9.InterfaceC0350k
    public final short readShort() throws EOFException {
        if (this.f3387b < 2) {
            throw new EOFException();
        }
        H h10 = this.f3386a;
        kotlin.jvm.internal.m.c(h10);
        int i10 = h10.f3349b;
        int i11 = h10.f3350c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR));
        }
        int i12 = i10 + 1;
        byte[] bArr = h10.f3348a;
        int i13 = (bArr[i10] & ForkServer.ERROR) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & ForkServer.ERROR) | i13;
        this.f3387b -= 2;
        if (i14 == i11) {
            this.f3386a = h10.a();
            I.a(h10);
        } else {
            h10.f3349b = i14;
        }
        return (short) i15;
    }

    @Override // E9.InterfaceC0350k
    public final boolean s(long j10) {
        return this.f3387b >= j10;
    }

    @Override // E9.InterfaceC0350k
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            H h10 = this.f3386a;
            if (h10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, h10.f3350c - h10.f3349b);
            long j11 = iMin;
            this.f3387b -= j11;
            j10 -= j11;
            int i10 = h10.f3349b + iMin;
            h10.f3349b = i10;
            if (i10 == h10.f3350c) {
                this.f3386a = h10.a();
                I.a(h10);
            }
        }
    }

    @Override // E9.InterfaceC0350k
    public final long t(E e2) {
        long j10 = this.f3387b;
        if (j10 > 0) {
            e2.r(j10, this);
        }
        return j10;
    }

    public final String toString() {
        return E().toString();
    }

    @Override // E9.InterfaceC0349j
    public final InterfaceC0349j u(byte[] source) {
        kotlin.jvm.internal.m.f(source, "source");
        I(source, 0, source.length);
        return this;
    }

    public final long v(long j10, long j11, byte b10) {
        H h10;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + this.f3387b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j13 = this.f3387b;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 == j11 || (h10 = this.f3386a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                h10 = h10.f3354g;
                kotlin.jvm.internal.m.c(h10);
                j13 -= (long) (h10.f3350c - h10.f3349b);
            }
            while (j13 < j11) {
                int iMin = (int) Math.min(h10.f3350c, (((long) h10.f3349b) + j11) - j13);
                for (int i10 = (int) ((((long) h10.f3349b) + j10) - j13); i10 < iMin; i10++) {
                    if (h10.f3348a[i10] == b10) {
                        return ((long) (i10 - h10.f3349b)) + j13;
                    }
                }
                j13 += (long) (h10.f3350c - h10.f3349b);
                h10 = h10.f3353f;
                kotlin.jvm.internal.m.c(h10);
                j10 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (h10.f3350c - h10.f3349b)) + j12;
            if (j14 > j10) {
                break;
            }
            h10 = h10.f3353f;
            kotlin.jvm.internal.m.c(h10);
            j12 = j14;
        }
        while (j12 < j11) {
            int iMin2 = (int) Math.min(h10.f3350c, (((long) h10.f3349b) + j11) - j12);
            for (int i11 = (int) ((((long) h10.f3349b) + j10) - j12); i11 < iMin2; i11++) {
                if (h10.f3348a[i11] == b10) {
                    return ((long) (i11 - h10.f3349b)) + j12;
                }
            }
            j12 += (long) (h10.f3350c - h10.f3349b);
            h10 = h10.f3353f;
            kotlin.jvm.internal.m.c(h10);
            j10 = j12;
        }
        return -1L;
    }

    public final long w(C0351l targetBytes) {
        int i10;
        int i11;
        kotlin.jvm.internal.m.f(targetBytes, "targetBytes");
        H h10 = this.f3386a;
        if (h10 == null) {
            return -1L;
        }
        long j10 = this.f3387b;
        long j11 = 0;
        byte[] bArr = targetBytes.f3389a;
        if (j10 < 0) {
            while (j10 > 0) {
                h10 = h10.f3354g;
                kotlin.jvm.internal.m.c(h10);
                j10 -= (long) (h10.f3350c - h10.f3349b);
            }
            if (bArr.length == 2) {
                byte b10 = bArr[0];
                byte b11 = bArr[1];
                while (j10 < this.f3387b) {
                    i10 = (int) ((((long) h10.f3349b) + j11) - j10);
                    int i12 = h10.f3350c;
                    while (true) {
                        if (i10 >= i12) {
                            j11 = ((long) (h10.f3350c - h10.f3349b)) + j10;
                            h10 = h10.f3353f;
                            kotlin.jvm.internal.m.c(h10);
                            j10 = j11;
                        } else {
                            byte b12 = h10.f3348a[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = h10.f3349b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return -1L;
            }
            while (j10 < this.f3387b) {
                i10 = (int) ((((long) h10.f3349b) + j11) - j10);
                int i13 = h10.f3350c;
                while (true) {
                    if (i10 < i13) {
                        byte b13 = h10.f3348a[i10];
                        int length = bArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                i10++;
                            } else if (b13 == bArr[i14]) {
                                i11 = h10.f3349b;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        j11 = ((long) (h10.f3350c - h10.f3349b)) + j10;
                        h10 = h10.f3353f;
                        kotlin.jvm.internal.m.c(h10);
                        j10 = j11;
                    }
                }
            }
            return -1L;
        }
        j10 = 0;
        while (true) {
            long j12 = ((long) (h10.f3350c - h10.f3349b)) + j10;
            if (j12 > 0) {
                break;
            }
            h10 = h10.f3353f;
            kotlin.jvm.internal.m.c(h10);
            j10 = j12;
        }
        if (bArr.length == 2) {
            byte b14 = bArr[0];
            byte b15 = bArr[1];
            while (j10 < this.f3387b) {
                i10 = (int) ((((long) h10.f3349b) + j11) - j10);
                int i15 = h10.f3350c;
                while (true) {
                    if (i10 >= i15) {
                        j11 = ((long) (h10.f3350c - h10.f3349b)) + j10;
                        h10 = h10.f3353f;
                        kotlin.jvm.internal.m.c(h10);
                        j10 = j11;
                    } else {
                        byte b16 = h10.f3348a[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = h10.f3349b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            return -1L;
        }
        while (j10 < this.f3387b) {
            i10 = (int) ((((long) h10.f3349b) + j11) - j10);
            int i16 = h10.f3350c;
            while (true) {
                if (i10 < i16) {
                    byte b17 = h10.f3348a[i10];
                    int length2 = bArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length2) {
                            i10++;
                        } else if (b17 == bArr[i17]) {
                            i11 = h10.f3349b;
                        } else {
                            i17++;
                        }
                    }
                } else {
                    j11 = ((long) (h10.f3350c - h10.f3349b)) + j10;
                    h10 = h10.f3353f;
                    kotlin.jvm.internal.m.c(h10);
                    j10 = j11;
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + j10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.f(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            H hG = G(1);
            int iMin = Math.min(i10, 8192 - hG.f3350c);
            source.get(hG.f3348a, hG.f3350c, iMin);
            i10 -= iMin;
            hG.f3350c += iMin;
        }
        this.f3387b += (long) iRemaining;
        return iRemaining;
    }

    @Override // E9.InterfaceC0350k
    public final void y(long j10) throws EOFException {
        if (this.f3387b < j10) {
            throw new EOFException();
        }
    }

    public final byte[] z(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(V0.p.j(j10, "byteCount: ").toString());
        }
        if (this.f3387b < j10) {
            throw new EOFException();
        }
        byte[] sink = new byte[(int) j10];
        kotlin.jvm.internal.m.f(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
        return sink;
    }

    public final int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.m.f(sink, "sink");
        AbstractC0341b.e(sink.length, i10, i11);
        H h10 = this.f3386a;
        if (h10 == null) {
            return -1;
        }
        int iMin = Math.min(i11, h10.f3350c - h10.f3349b);
        int i12 = h10.f3349b;
        N8.m.i0(i10, h10.f3348a, i12, sink, i12 + iMin);
        int i13 = h10.f3349b + iMin;
        h10.f3349b = i13;
        this.f3387b -= (long) iMin;
        if (i13 == h10.f3350c) {
            this.f3386a = h10.a();
            I.a(h10);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, E9.K
    public final void close() {
    }

    @Override // E9.InterfaceC0349j, E9.K, java.io.Flushable
    public final void flush() {
    }

    @Override // E9.InterfaceC0350k
    public final C0348i m() {
        return this;
    }
}
