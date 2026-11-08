package com.google.protobuf;

import com.google.crypto.tink.shaded.protobuf.C1183d;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H0 f18683a = new H0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I0 f18684b = new I0();

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws X {
        if (!r(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !r(b12) && !r(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw X.k();
    }

    public static void b(byte b10, byte b11, char[] cArr, int i10) throws X {
        if (b10 < -62 || r(b11)) {
            throw X.k();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws X {
        if (r(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || r(b12)))) {
            throw X.k();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static int d(byte[] bArr, int i10, C1183d c1183d) throws X {
        int iM = m(bArr, i10, c1183d);
        int i11 = c1183d.f18421a;
        if (i11 < 0) {
            throw X.n();
        }
        if (i11 > bArr.length - iM) {
            throw X.p();
        }
        if (i11 == 0) {
            c1183d.f18423c = AbstractC1252l.f18752b;
            return iM;
        }
        c1183d.f18423c = AbstractC1252l.m(bArr, iM, i11);
        return iM + i11;
    }

    public static int e(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & ForkServer.ERROR) << 24) | (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16);
    }

    public static long f(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int g(E0 e1, int i10, byte[] bArr, int i11, int i12, U u10, C1183d c1183d) throws X {
        J jNewInstance = e1.newInstance();
        E0 e2 = e1;
        byte[] bArr2 = bArr;
        int i13 = i12;
        C1183d c1183d2 = c1183d;
        int iU = u(jNewInstance, e2, bArr2, i11, i13, c1183d2);
        e2.b(jNewInstance);
        c1183d2.f18423c = jNewInstance;
        u10.add(jNewInstance);
        while (iU < i13) {
            C1183d c1183d3 = c1183d2;
            int i14 = i13;
            int iM = m(bArr2, iU, c1183d3);
            if (i10 != c1183d3.f18421a) {
                break;
            }
            byte[] bArr3 = bArr2;
            E0 e4 = e2;
            J jNewInstance2 = e4.newInstance();
            iU = u(jNewInstance2, e4, bArr3, iM, i14, c1183d3);
            e2 = e4;
            bArr2 = bArr3;
            i13 = i14;
            c1183d2 = c1183d3;
            e2.b(jNewInstance2);
            c1183d2.f18423c = jNewInstance2;
            u10.add(jNewInstance2);
        }
        return iU;
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, P0 p10, C1183d c1183d) throws X {
        if ((i10 >>> 3) == 0) {
            throw X.g();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iO = o(bArr, i11, c1183d);
            p10.d(i10, Long.valueOf(c1183d.f18422b));
            return iO;
        }
        if (i13 == 1) {
            p10.d(i10, Long.valueOf(f(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM = m(bArr, i11, c1183d);
            int i14 = c1183d.f18421a;
            if (i14 < 0) {
                throw X.n();
            }
            if (i14 > bArr.length - iM) {
                throw X.p();
            }
            if (i14 == 0) {
                p10.d(i10, AbstractC1252l.f18752b);
            } else {
                p10.d(i10, AbstractC1252l.m(bArr, iM, i14));
            }
            return iM + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw X.g();
            }
            p10.d(i10, Integer.valueOf(e(bArr, i11)));
            return i11 + 4;
        }
        P0 p0C = P0.c();
        int i15 = (i10 & (-8)) | 4;
        int i16 = c1183d.f18424d + 1;
        c1183d.f18424d = i16;
        if (i16 >= 100) {
            throw new X("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iM2 = m(bArr, i11, c1183d);
            i17 = c1183d.f18421a;
            if (i17 == i15) {
                i11 = iM2;
                break;
            }
            i11 = h(i17, bArr, iM2, i12, p0C, c1183d);
        }
        c1183d.f18424d--;
        if (i11 > i12 || i17 != i15) {
            throw X.o();
        }
        p10.d(i10, p0C);
        return i11;
    }

    public static String j(ByteBuffer byteBuffer, int i10, int i11) throws X {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (b11 >= 0) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = byteBuffer.get(i17);
                    if (b12 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw X.k();
                }
                i10 += 2;
                b(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw X.k();
                }
                int i18 = i10 + 2;
                i10 += 3;
                c(b11, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw X.k();
                }
                byte b13 = byteBuffer.get(i15);
                int i19 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                a(b11, b13, b14, byteBuffer.get(i19), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static int l(int i10, byte[] bArr, int i11, C1183d c1183d) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            c1183d.f18421a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            c1183d.f18421a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c1183d.f18421a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c1183d.f18421a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c1183d.f18421a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int m(byte[] bArr, int i10, C1183d c1183d) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return l(b10, bArr, i11, c1183d);
        }
        c1183d.f18421a = b10;
        return i11;
    }

    public static int n(int i10, byte[] bArr, int i11, int i12, U u10, C1183d c1183d) {
        P p10 = (P) u10;
        int iM = m(bArr, i11, c1183d);
        p10.c(c1183d.f18421a);
        while (iM < i12) {
            int iM2 = m(bArr, iM, c1183d);
            if (i10 != c1183d.f18421a) {
                break;
            }
            iM = m(bArr, iM2, c1183d);
            p10.c(c1183d.f18421a);
        }
        return iM;
    }

    public static int o(byte[] bArr, int i10, C1183d c1183d) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c1183d.f18422b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        c1183d.f18422b = j11;
        return i12;
    }

    public static String q(AbstractC1252l abstractC1252l) {
        StringBuilder sb = new StringBuilder(abstractC1252l.size());
        for (int i10 = 0; i10 < abstractC1252l.size(); i10++) {
            byte bI = abstractC1252l.i(i10);
            if (bI == 34) {
                sb.append("\\\"");
            } else if (bI == 39) {
                sb.append("\\'");
            } else if (bI != 92) {
                switch (bI) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bI < 32 || bI > 126) {
                            sb.append('\\');
                            sb.append((char) (((bI >>> 6) & 3) + 48));
                            sb.append((char) (((bI >>> 3) & 7) + 48));
                            sb.append((char) ((bI & 7) + 48));
                        } else {
                            sb.append((char) bI);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean r(byte b10) {
        return b10 > -65;
    }

    public static int t(Object obj, E0 e1, byte[] bArr, int i10, int i11, int i12, C1183d c1183d) throws X {
        C1264r0 c1264r0 = (C1264r0) e1;
        int i13 = c1183d.f18424d + 1;
        c1183d.f18424d = i13;
        if (i13 >= 100) {
            throw new X("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iG = c1264r0.G(obj, bArr, i10, i11, i12, c1183d);
        c1183d.f18424d--;
        c1183d.f18423c = obj;
        return iG;
    }

    public static int u(Object obj, E0 e1, byte[] bArr, int i10, int i11, C1183d c1183d) throws X {
        int iL = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iL = l(i12, bArr, iL, c1183d);
            i12 = c1183d.f18421a;
        }
        int i13 = iL;
        if (i12 < 0 || i12 > i11 - i13) {
            throw X.p();
        }
        int i14 = c1183d.f18424d + 1;
        c1183d.f18424d = i14;
        if (i14 >= 100) {
            throw new X("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        e1.i(obj, bArr, i13, i15, c1183d);
        c1183d.f18424d--;
        c1183d.f18423c = obj;
        return i15;
    }

    public static int w(int i10, byte[] bArr, int i11, int i12, C1183d c1183d) throws X {
        if ((i10 >>> 3) == 0) {
            throw X.g();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return o(bArr, i11, c1183d);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return m(bArr, i11, c1183d) + c1183d.f18421a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw X.g();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = m(bArr, i11, c1183d);
            i15 = c1183d.f18421a;
            if (i15 == i14) {
                break;
            }
            i11 = w(i15, bArr, i11, i12, c1183d);
        }
        if (i11 > i12 || i15 != i14) {
            throw X.o();
        }
        return i11;
    }

    public abstract String i(byte[] bArr, int i10, int i11);

    public abstract String k(ByteBuffer byteBuffer, int i10, int i11);

    public abstract int p(String str, byte[] bArr, int i10, int i11);

    public boolean s(byte[] bArr, int i10, int i11) {
        return v(0, bArr, i10, i11) == 0;
    }

    public abstract int v(int i10, byte[] bArr, int i11, int i12);

    public abstract void x(byte[] bArr, int i10, int i11);
}
