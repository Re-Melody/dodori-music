package com.google.protobuf;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends J0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18726c;

    public /* synthetic */ Z0(int i10) {
        this.f18726c = i10;
    }

    public static int y(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            J0 j11 = b1.f18729a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return b1.d(i10, Y0.g(bArr, j10));
        }
        if (i11 == 2) {
            return b1.e(i10, Y0.g(bArr, j10), Y0.g(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[LOOP:2: B:24:0x0057->B:27:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0066 A[SYNTHETIC] */
    @Override // com.google.protobuf.J0
    public final String i(byte[] bArr, int i10, int i11) throws X {
        int i12;
        int i13;
        byte b10;
        int i14;
        int i15;
        byte b11;
        switch (this.f18726c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i16 = i10 + i11;
                char[] cArr = new char[i11];
                int i17 = 0;
                while (i10 < i16) {
                    byte b12 = bArr[i10];
                    if (b12 < 0) {
                        i12 = i17;
                        while (i10 < i16) {
                            i13 = i10 + 1;
                            b10 = bArr[i10];
                            if (b10 >= 0) {
                                i14 = i12 + 1;
                                cArr[i12] = (char) b10;
                                i15 = i13;
                                while (i15 < i16) {
                                    b11 = bArr[i15];
                                    if (b11 >= 0) {
                                        i15++;
                                        cArr[i14] = (char) b11;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i10 = i15;
                                    }
                                }
                                i12 = i14;
                                i10 = i15;
                            } else if (b10 < -32) {
                                if (i13 < i16) {
                                    throw X.k();
                                }
                                i10 += 2;
                                J0.b(b10, bArr[i13], cArr, i12);
                                i12++;
                            } else if (b10 < -16) {
                                if (i13 < i16 - 1) {
                                    throw X.k();
                                }
                                int i18 = i10 + 2;
                                i10 += 3;
                                J0.c(b10, bArr[i13], bArr[i18], cArr, i12);
                                i12++;
                            } else {
                                if (i13 < i16 - 2) {
                                    throw X.k();
                                }
                                byte b13 = bArr[i13];
                                int i19 = i10 + 3;
                                byte b14 = bArr[i10 + 2];
                                i10 += 4;
                                J0.a(b10, b13, b14, bArr[i19], cArr, i12);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i10++;
                    cArr[i17] = (char) b12;
                    i17++;
                }
                i12 = i17;
                while (i10 < i16) {
                    i13 = i10 + 1;
                    b10 = bArr[i10];
                    if (b10 >= 0) {
                        i14 = i12 + 1;
                        cArr[i12] = (char) b10;
                        i15 = i13;
                        while (i15 < i16) {
                            b11 = bArr[i15];
                            if (b11 >= 0) {
                                i15++;
                                cArr[i14] = (char) b11;
                                i14++;
                            } else {
                                i12 = i14;
                                i10 = i15;
                            }
                        }
                        i12 = i14;
                        i10 = i15;
                    } else if (b10 < -32) {
                        if (i13 < i16) {
                            throw X.k();
                        }
                        i10 += 2;
                        J0.b(b10, bArr[i13], cArr, i12);
                        i12++;
                    } else if (b10 < -16) {
                        if (i13 < i16 - 1) {
                            throw X.k();
                        }
                        int i110 = i10 + 2;
                        i10 += 3;
                        J0.c(b10, bArr[i13], bArr[i110], cArr, i12);
                        i12++;
                    } else {
                        if (i13 < i16 - 2) {
                            throw X.k();
                        }
                        byte b15 = bArr[i13];
                        int i111 = i10 + 3;
                        byte b16 = bArr[i10 + 2];
                        i10 += 4;
                        J0.a(b10, b15, b16, bArr[i111], cArr, i12);
                        i12 += 2;
                    }
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = V.f18703a;
                String str = new String(bArr, i10, i11, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    throw X.k();
                }
                return str;
        }
    }

    @Override // com.google.protobuf.J0
    public final String k(ByteBuffer byteBuffer, int i10, int i11) throws X {
        long j10;
        byte bE;
        byte bE2;
        switch (this.f18726c) {
            case 0:
                return J0.j(byteBuffer, i10, i11);
            default:
                if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long j11 = Y0.f18720c.j(Y0.f18724g, byteBuffer) + ((long) i10);
                long j12 = ((long) i11) + j11;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (true) {
                    j10 = 1;
                    if (j11 < j12 && (bE2 = Y0.f18720c.e(j11)) >= 0) {
                        j11++;
                        cArr[i12] = (char) bE2;
                        i12++;
                    }
                }
                int i13 = i12;
                while (j11 < j12) {
                    long j13 = j11 + j10;
                    X0 x10 = Y0.f18720c;
                    byte bE3 = x10.e(j11);
                    if (bE3 >= 0) {
                        int i14 = i13 + 1;
                        cArr[i13] = (char) bE3;
                        while (j13 < j12 && (bE = Y0.f18720c.e(j13)) >= 0) {
                            j13 += j10;
                            cArr[i14] = (char) bE;
                            i14++;
                        }
                        i13 = i14;
                        j11 = j13;
                    } else {
                        if (!(bE3 < -32)) {
                            if (bE3 < -16) {
                                if (j13 >= j12 - j10) {
                                    throw X.k();
                                }
                                long j14 = j11 + 2;
                                j11 += 3;
                                J0.c(bE3, x10.e(j13), x10.e(j14), cArr, i13);
                                i13++;
                            } else {
                                if (j13 >= j12 - 2) {
                                    throw X.k();
                                }
                                byte bE4 = x10.e(j13);
                                long j15 = j11 + 3;
                                byte bE5 = x10.e(j11 + 2);
                                j11 += 4;
                                J0.a(bE3, bE4, bE5, x10.e(j15), cArr, i13);
                                i13 += 2;
                            }
                        } else {
                            if (j13 >= j12) {
                                throw X.k();
                            }
                            j11 += 2;
                            J0.b(bE3, x10.e(j13), cArr, i13);
                            i13++;
                        }
                    }
                    j10 = 1;
                }
                return new String(cArr, 0, i13);
        }
    }

    @Override // com.google.protobuf.J0
    public final int p(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j10;
        char c3;
        long j11;
        long j12;
        char c9;
        int i14;
        char cCharAt2;
        switch (this.f18726c) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new a1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new a1(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                    }
                    i16++;
                }
                return i17;
            default:
                long j13 = i10;
                long j14 = ((long) i11) + j13;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j10 = 1;
                    c3 = 128;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        Y0.k(bArr, j13, (byte) cCharAt2);
                        i22++;
                        j13 = 1 + j13;
                    }
                }
                if (i22 == length2) {
                    return (int) j13;
                }
                while (i22 < length2) {
                    char cCharAt5 = str.charAt(i22);
                    if (cCharAt5 < c3 && j13 < j14) {
                        Y0.k(bArr, j13, (byte) cCharAt5);
                        c9 = c3;
                        j11 = j10;
                        j12 = j13 + j10;
                    } else if (cCharAt5 >= 2048 || j13 > j14 - 2) {
                        j11 = j10;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j13 > j14 - 3) {
                            long j15 = j13;
                            if (j15 > j14 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                    throw new a1(i22, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j15);
                            }
                            int i23 = i22 + 1;
                            if (i23 != length2) {
                                char cCharAt6 = str.charAt(i23);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    Y0.k(bArr, j15, (byte) ((codePoint2 >>> 18) | 240));
                                    c9 = 128;
                                    Y0.k(bArr, j15 + j11, (byte) (((codePoint2 >>> 12) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD));
                                    Y0.k(bArr, j15 + 2, (byte) (((codePoint2 >>> 6) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD));
                                    Y0.k(bArr, j15 + 3, (byte) ((codePoint2 & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD));
                                    j12 = j15 + 4;
                                    i22 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            throw new a1(i22 - 1, length2);
                        }
                        Y0.k(bArr, j13, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j16 = j13;
                        Y0.k(bArr, j13 + j11, (byte) (((cCharAt5 >>> 6) & 63) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD));
                        j12 = j16 + 3;
                        Y0.k(bArr, j16 + 2, (byte) ((cCharAt5 & '?') | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD));
                        c9 = 128;
                    } else {
                        j11 = j10;
                        Y0.k(bArr, j13, (byte) ((cCharAt5 >>> 6) | 960));
                        Y0.k(bArr, j13 + j11, (byte) ((cCharAt5 & '?') | c3));
                        j12 = j13 + 2;
                        c9 = c3;
                    }
                    i22++;
                    c3 = c9;
                    j13 = j12;
                    j10 = j11;
                }
                return (int) j13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:113:0x017d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0186  */
    /* JADX WARN: Code duplicated, block: B:117:0x018e  */
    /* JADX WARN: Code duplicated, block: B:170:0x024c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0256 A[ADDED_TO_REGION, LOOP:6: B:175:0x0256->B:267:0x0256, LOOP_START, PHI: r2
  0x0256: PHI (r2v3 int) = (r2v2 int), (r2v7 int) binds: [B:173:0x0253, B:267:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x025a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0266 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0268  */
    /* JADX WARN: Code duplicated, block: B:190:0x027a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0280 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x0298  */
    /* JADX WARN: Code duplicated, block: B:204:0x029e  */
    /* JADX WARN: Code duplicated, block: B:206:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:208:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:213:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[PHI: r2
  PHI (r2v1 int) = (r2v0 int), (r2v13 int), (r2v19 int), (r2v22 int) binds: [B:124:0x01c5, B:167:0x0247, B:148:0x0204, B:133:0x01d7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01da A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x0148  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (com.google.protobuf.Y0.g(r23, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (com.google.protobuf.Y0.g(r23, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (com.google.protobuf.Y0.g(r23, r5) > (-65)) goto L18;
     */
    @Override // com.google.protobuf.J0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v(int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Z0.v(int, byte[], int, int):int");
    }
}
