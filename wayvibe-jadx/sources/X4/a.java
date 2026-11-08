package X4;

import B2.t;
import android.net.Uri;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.XMLReaderUtils;
import org.xmlpull.v1.XmlPullParser;
import p235w4.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f13197a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f13198b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f13199c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f13200d = {0, 0, 0, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f13201e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f13202f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int[] f13203g = new int[10];

    public static int a(byte[] bArr, int i10) {
        int i11;
        synchronized (f13202f) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f13203g;
                    if (iArr.length <= i13) {
                        f13203g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f13203g[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f13203g[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        q(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    m(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x0119  */
    /* JADX WARN: Code duplicated, block: B:84:0x013e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0150  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    public static e c(byte[] bArr, int i10, int i11) {
        int iR;
        boolean z10;
        int iR2;
        boolean z11;
        boolean zG;
        int i12;
        int i13;
        int i14;
        float f10;
        int iK;
        int iK2;
        int iK3;
        int i15;
        t tVar = new t(i10, bArr, i11, 3);
        tVar.c(8);
        int iK4 = tVar.k(8);
        tVar.c(16);
        int iR3 = tVar.r();
        int i16 = 1;
        if (iK4 == 100 || iK4 == 110 || iK4 == 122 || iK4 == 244 || iK4 == 44 || iK4 == 83 || iK4 == 86 || iK4 == 118 || iK4 == 128 || iK4 == 138) {
            iR = tVar.r();
            boolean zG2 = iR == 3 ? tVar.g() : false;
            tVar.r();
            tVar.r();
            tVar.b();
            if (tVar.g()) {
                int i17 = iR != 3 ? 8 : 12;
                int i18 = 0;
                while (i18 < i17) {
                    if (tVar.g()) {
                        int i19 = i18 < 6 ? 16 : 64;
                        int iP = 8;
                        int i20 = 8;
                        for (int i21 = 0; i21 < i19; i21++) {
                            if (iP != 0) {
                                iP = ((tVar.p() + i20) + 256) % 256;
                            }
                            if (iP != 0) {
                                i20 = iP;
                            }
                        }
                    }
                    i18++;
                }
            }
            z10 = zG2;
        } else {
            iR = 1;
            z10 = false;
        }
        int iR4 = tVar.r() + 4;
        int iR5 = tVar.r();
        if (iR5 != 0) {
            if (iR5 == 1) {
                boolean zG3 = tVar.g();
                tVar.p();
                tVar.p();
                long jR = tVar.r();
                z10 = z10;
                for (int i22 = 0; i22 < jR; i22++) {
                    tVar.r();
                }
                z11 = zG3;
                iR2 = 0;
            } else {
                iR2 = 0;
            }
            tVar.r();
            tVar.b();
            int iR6 = tVar.r() + 1;
            int iR7 = tVar.r() + 1;
            zG = tVar.g();
            i12 = 2 - (zG ? 1 : 0);
            int i23 = iR7 * i12;
            if (!zG) {
                tVar.b();
            }
            tVar.b();
            i13 = iR6 * 16;
            i14 = i23 * 16;
            if (tVar.g()) {
                int iR8 = tVar.r();
                int iR9 = tVar.r();
                int iR10 = tVar.r();
                int iR11 = tVar.r();
                if (iR != 0) {
                    if (iR == 3) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    i12 *= iR == 1 ? 2 : 1;
                    i16 = i15;
                }
                i13 -= (iR8 + iR9) * i16;
                i14 -= (iR10 + iR11) * i12;
            }
            int i24 = i14;
            f10 = 1.0f;
            if (tVar.g() && tVar.g()) {
                iK = tVar.k(8);
                if (iK == 255) {
                    iK2 = tVar.k(16);
                    iK3 = tVar.k(16);
                    if (iK2 != 0 && iK3 != 0) {
                        f10 = iK2 / iK3;
                    }
                } else if (iK < 17) {
                    f10 = f13201e[iK];
                }
            }
            return new e(iR3, i13, i24, f10, z10, zG, iR4, iR5, iR2, z11);
        }
        iR2 = tVar.r() + 4;
        z11 = false;
        tVar.r();
        tVar.b();
        int iR12 = tVar.r() + 1;
        int iR13 = tVar.r() + 1;
        zG = tVar.g();
        i12 = 2 - (zG ? 1 : 0);
        int i25 = iR13 * i12;
        if (!zG) {
            tVar.b();
        }
        tVar.b();
        i13 = iR12 * 16;
        i14 = i25 * 16;
        if (tVar.g()) {
            int iR14 = tVar.r();
            int iR15 = tVar.r();
            int iR16 = tVar.r();
            int iR17 = tVar.r();
            if (iR != 0) {
                if (iR == 3) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                i12 *= iR == 1 ? 2 : 1;
                i16 = i15;
            }
            i13 -= (iR14 + iR15) * i16;
            i14 -= (iR16 + iR17) * i12;
        }
        int i26 = i14;
        f10 = 1.0f;
        if (tVar.g()) {
            iK = tVar.k(8);
            if (iK == 255) {
                iK2 = tVar.k(16);
                iK3 = tVar.k(16);
                if (iK2 != 0) {
                    f10 = iK2 / iK3;
                }
            } else if (iK < 17) {
                f10 = f13201e[iK];
            }
        }
        return new e(iR3, i13, i26, f10, z10, zG, iR4, iR5, iR2, z11);
    }

    public static Uri d(String str, String str2) {
        String strF;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrO = o(str2);
        if (iArrO[0] != -1) {
            sb.append(str2);
            f(sb, iArrO[1], iArrO[2]);
            strF = sb.toString();
        } else {
            int[] iArrO2 = o(str);
            if (iArrO[3] == 0) {
                sb.append((CharSequence) str, 0, iArrO2[3]);
                sb.append(str2);
                strF = sb.toString();
            } else if (iArrO[2] == 0) {
                sb.append((CharSequence) str, 0, iArrO2[2]);
                sb.append(str2);
                strF = sb.toString();
            } else {
                int i10 = iArrO[1];
                if (i10 != 0) {
                    int i11 = iArrO2[0] + 1;
                    sb.append((CharSequence) str, 0, i11);
                    sb.append(str2);
                    strF = f(sb, iArrO[1] + i11, i11 + iArrO[2]);
                } else if (str2.charAt(i10) == '/') {
                    sb.append((CharSequence) str, 0, iArrO2[1]);
                    sb.append(str2);
                    int i12 = iArrO2[1];
                    strF = f(sb, i12, iArrO[2] + i12);
                } else {
                    int i13 = iArrO2[0] + 2;
                    int i14 = iArrO2[1];
                    if (i13 >= i14 || i14 != iArrO2[2]) {
                        int iLastIndexOf = str.lastIndexOf(47, iArrO2[2] - 1);
                        int i15 = iLastIndexOf == -1 ? iArrO2[1] : iLastIndexOf + 1;
                        sb.append((CharSequence) str, 0, i15);
                        sb.append(str2);
                        strF = f(sb, iArrO2[1], i15 + iArrO[2]);
                    } else {
                        sb.append((CharSequence) str, 0, i14);
                        sb.append('/');
                        sb.append(str2);
                        int i16 = iArrO2[1];
                        strF = f(sb, i16, iArrO[2] + i16 + 1);
                    }
                }
            }
        }
        return Uri.parse(strF);
    }

    public static Pair e(t tVar, boolean z10) throws r {
        int iK = tVar.k(5);
        if (iK == 31) {
            iK = tVar.k(6) + 32;
        }
        int iP = p(tVar);
        int iK2 = tVar.k(4);
        if (iK == 5 || iK == 29) {
            iP = p(tVar);
            int iK3 = tVar.k(5);
            if (iK3 == 31) {
                iK3 = tVar.k(6) + 32;
            }
            iK = iK3;
            if (iK == 22) {
                iK2 = tVar.k(4);
            }
        }
        if (z10) {
            if (iK != 1 && iK != 2 && iK != 3 && iK != 4 && iK != 6 && iK != 7 && iK != 17) {
                switch (iK) {
                    case 19:
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new r(p134m1.b.j(iK, "Unsupported audio object type: "));
                }
            }
            tVar.f(1);
            if (tVar.q()) {
                tVar.f(14);
            }
            boolean zQ = tVar.q();
            if (iK2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iK == 6 || iK == 20) {
                tVar.f(3);
            }
            if (zQ) {
                if (iK == 22) {
                    tVar.f(16);
                }
                if (iK == 17 || iK == 19 || iK == 20 || iK == 23) {
                    tVar.f(3);
                }
                tVar.f(1);
            }
            switch (iK) {
                case 17:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                    int iK4 = tVar.k(2);
                    if (iK4 == 2 || iK4 == 3) {
                        throw new r(p134m1.b.j(iK4, "Unsupported epConfig: "));
                    }
                    break;
            }
        }
        int i10 = f13199c[iK2];
        k(i10 != -1);
        return Pair.create(Integer.valueOf(iP), Integer.valueOf(i10));
    }

    public static String f(StringBuilder sb, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb.toString();
        }
        if (sb.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb.charAt(i14) == '.') {
                sb.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb.charAt(i14) == '.' && sb.charAt(i15) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb.toString();
    }

    public static void g() {
        if (j.f13232a >= 18) {
            Trace.endSection();
        }
    }

    public static void h(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void i(String str) {
        if (j.f13232a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void j(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & ForkServer.ERROR;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static void k(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void m(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean n(String str) {
        return "audio".equals(v(str));
    }

    public static int[] o(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static int p(t tVar) {
        int iK = tVar.k(4);
        if (iK == 15) {
            return tVar.k(24);
        }
        k(iK < 13);
        return f13198b[iK];
    }

    public static void q(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void r(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static String s(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (str.equals(xmlPullParser.getAttributeName(i10))) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String t(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) {
            return "video/avc";
        }
        if (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strTrim.startsWith("vp9") || strTrim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strTrim.startsWith("vp8") || strTrim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strTrim.startsWith("mp4a")) {
            return "audio/mp4a-latm";
        }
        if (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strTrim.startsWith("opus")) {
            return "audio/opus";
        }
        if (strTrim.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        return null;
    }

    public static int u(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (n(str)) {
            return 1;
        }
        if ("video".equals(v(str))) {
            return 2;
        }
        if ("text".equals(v(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        return ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) ? 4 : -1;
    }

    public static String v(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }
}
