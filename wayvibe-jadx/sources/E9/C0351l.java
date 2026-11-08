package E9;

import B2.AbstractC0112b;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: E9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0351l implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0351l f3388d = new C0351l(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f3390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f3391c;

    public C0351l(byte[] data) {
        kotlin.jvm.internal.m.f(data, "data");
        this.f3389a = data;
    }

    public static int n(C0351l c0351l, C0351l other) {
        c0351l.getClass();
        kotlin.jvm.internal.m.f(other, "other");
        return c0351l.m(other.f3389a, 0);
    }

    public static int r(C0351l c0351l, C0351l other) {
        c0351l.getClass();
        kotlin.jvm.internal.m.f(other, "other");
        return c0351l.q(other.f3389a);
    }

    public static /* synthetic */ C0351l x(C0351l c0351l, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return c0351l.w(i10, i11);
    }

    public final String A() {
        String str = this.f3391c;
        if (str != null) {
            return str;
        }
        byte[] bArrO = o();
        kotlin.jvm.internal.m.f(bArrO, "<this>");
        String str2 = new String(bArrO, p097i9.a.f20563a);
        this.f3391c = str2;
        return str2;
    }

    public void B(C0348i buffer, int i10) {
        kotlin.jvm.internal.m.f(buffer, "buffer");
        buffer.I(this.f3389a, 0, i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0351l) {
            C0351l c0351l = (C0351l) obj;
            int iK = c0351l.k();
            byte[] bArr = this.f3389a;
            if (iK == bArr.length && c0351l.t(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] map = AbstractC0340a.f3368a;
        byte[] bArr = this.f3389a;
        kotlin.jvm.internal.m.f(bArr, "<this>");
        kotlin.jvm.internal.m.f(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & ForkServer.ERROR) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & ForkServer.ERROR) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & 15) << 2) | ((b12 & ForkServer.ERROR) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            bArr2[i11] = map[(b13 & ForkServer.ERROR) >> 2];
            bArr2[i11 + 1] = map[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i14];
            bArr2[i11] = map[(b14 & ForkServer.ERROR) >> 2];
            bArr2[i11 + 1] = map[((b14 & 3) << 4) | ((b15 & ForkServer.ERROR) >> 4)];
            bArr2[i11 + 2] = map[(b15 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        return new String(bArr2, p097i9.a.f20563a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0351l other) {
        kotlin.jvm.internal.m.f(other, "other");
        int iK = k();
        int iK2 = other.k();
        int iMin = Math.min(iK, iK2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iP = p(i10) & ForkServer.ERROR;
            int iP2 = other.p(i10) & ForkServer.ERROR;
            if (iP != iP2) {
                return iP < iP2 ? -1 : 1;
            }
        }
        if (iK == iK2) {
            return 0;
        }
        return iK < iK2 ? -1 : 1;
    }

    public C0351l h(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f3389a, 0, k());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.c(bArrDigest);
        return new C0351l(bArrDigest);
    }

    public int hashCode() {
        int i10 = this.f3390b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f3389a);
        this.f3390b = iHashCode;
        return iHashCode;
    }

    public int k() {
        return this.f3389a.length;
    }

    public String l() {
        byte[] bArr = this.f3389a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = F9.b.f4618a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public int m(byte[] other, int i10) {
        kotlin.jvm.internal.m.f(other, "other");
        byte[] bArr = this.f3389a;
        int length = bArr.length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC0341b.a(iMax, bArr, 0, other, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] o() {
        return this.f3389a;
    }

    public byte p(int i10) {
        return this.f3389a[i10];
    }

    public int q(byte[] other) {
        kotlin.jvm.internal.m.f(other, "other");
        int iK = k();
        byte[] bArr = this.f3389a;
        for (int iMin = Math.min(iK, bArr.length - other.length); -1 < iMin; iMin--) {
            if (AbstractC0341b.a(iMin, bArr, 0, other, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean s(int i10, C0351l other, int i11) {
        kotlin.jvm.internal.m.f(other, "other");
        return other.t(0, this.f3389a, i10, i11);
    }

    public boolean t(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.m.f(other, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr = this.f3389a;
        return i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC0341b.a(i10, bArr, i11, other, i12);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x01ae A[EDGE_INSN: B:182:0x01ae->B:183:0x01af BREAK  A[LOOP:0: B:7:0x000e->B:244:0x000e]] */
    public String toString() {
        byte b10;
        int i10;
        byte[] bArr = this.f3389a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            byte b11 = bArr[i11];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i14 = i11 + 3;
                        if (length > i14) {
                            byte b12 = bArr[i11 + 1];
                            if ((b12 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b13 = bArr[i11 + 2];
                            if ((b13 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b14 = bArr[i14];
                            if ((b14 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i15 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                            if (i15 <= 1114111) {
                                if (55296 <= i15 && i15 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                if (i15 >= 65536) {
                                    i10 = i13 + 1;
                                    if (i13 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        i12 = -1;
                                        break;
                                    }
                                    i12 += i15 < 65536 ? 1 : 2;
                                    i11 += 4;
                                    i13 = i10;
                                } else {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        int i16 = i11 + 2;
                        if (length > i16) {
                            byte b15 = bArr[i11 + 1];
                            if ((b15 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b16 = bArr[i16];
                            if ((b16 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i17 = ((b16 ^ (-123008)) ^ (b15 << 6)) ^ (b11 << 12);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    i12 = -1;
                                    break;
                                }
                                i12 += i17 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i11 + 1;
                    if (length > i18) {
                        byte b17 = bArr[i18];
                        if ((b17 & 192) != 128) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i19 = (b17 ^ 3968) ^ (b11 << 6);
                        if (i19 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                i12 = -1;
                                break;
                            }
                            i12 += i19 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        if (i13 == 64) {
                            break;
                        }
                        i12 = -1;
                        break;
                    }
                }
            } else {
                int i20 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 == 10 || b11 == 13 || ((b11 < 0 || b11 >= 32) && (127 > b11 || b11 >= 160))) && b11 != 65533) {
                    i12 += b11 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i20;
                        if (i11 < length && (b10 = bArr[i11]) >= 0) {
                            i11++;
                            i20 = i13 + 1;
                            if (i13 == 64) {
                                break loop0;
                            }
                            if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                                i12 += b10 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            String strA = A();
            String strSubstring = strA.substring(0, i12);
            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            String strH0 = p097i9.r.h0(p097i9.r.h0(p097i9.r.h0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strA.length()) {
                return AbstractC0112b.c(']', "[text=", strH0);
            }
            return "[size=" + bArr.length + " text=" + strH0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + l() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(V0.p.q(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new C0351l(N8.m.n0(bArr, 0, 64))).l());
        sb.append("…]");
        return sb.toString();
    }

    public final boolean u(C0351l prefix) {
        kotlin.jvm.internal.m.f(prefix, "prefix");
        return s(0, prefix, prefix.k());
    }

    public String v(Charset charset) {
        kotlin.jvm.internal.m.f(charset, "charset");
        return new String(this.f3389a, charset);
    }

    public C0351l w(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = k();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3389a;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException(V0.p.q(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i11 - i10 >= 0) {
            return (i10 == 0 && i11 == bArr.length) ? this : new C0351l(N8.m.n0(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0351l y() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f3389a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C0351l(bArrCopyOf);
            }
            i10++;
        }
    }

    public byte[] z() {
        byte[] bArr = this.f3389a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
