package Z2;

import B2.AbstractC0111a;
import F.C0356a;
import L3.C0630g;
import android.util.Base64;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: renamed from: Z2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0961b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f13481a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f13482b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f13483c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f13484d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f13485e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f13486f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f13487g = {32, 40, 48, 56, 64, 80, 96, 112, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f13488h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f13489i = {2002, 2000, 1920, 1601, 1600, 1001, PipesIterator.DEFAULT_QUEUE_SIZE, 960, 800, 800, 480, RCHTTPStatusCodes.BAD_REQUEST, RCHTTPStatusCodes.BAD_REQUEST, 2048};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f13490j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f13491l = {64, 112, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f13492m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f13493n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f13494o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f13495p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f13496q = {9, 11, 13, 16};
    public static final int[] r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f13497s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f13498t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f13499u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f13500v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f13501w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f13502x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f13503y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        long j10 = (((long) (((bArr[11] & ForkServer.ERROR) << 8) | (bArr[10] & ForkServer.ERROR))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[LOOP:0: B:53:0x00b8->B:54:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[RETURN] */
    public static boolean b(B2.u uVar, s sVar, int i10, C0356a c0356a) {
        int iT;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        int i14 = uVar.f631b;
        long jV = uVar.v();
        long j10 = jV >>> 16;
        if (j10 == i10) {
            boolean z10 = (j10 & 1) == 1;
            int i15 = (int) ((jV >> 12) & 15);
            int i16 = (int) ((jV >> 8) & 15);
            int i17 = (int) ((jV >> 4) & 15);
            int i18 = (int) ((jV >> 1) & 7);
            boolean z11 = (jV & 1) == 1;
            if (i17 > 7 ? !(i17 > 10 || sVar.f13573g != 2) : i17 == sVar.f13573g - 1) {
                if ((i18 == 0 || i18 == sVar.f13575i) && !z11) {
                    try {
                        long jA = uVar.A();
                        if (!z10) {
                            jA *= (long) sVar.f13568b;
                        }
                        c0356a.f3516a = jA;
                        int iQ = q(i15, uVar);
                        if (iQ != -1 && iQ <= sVar.f13568b) {
                            if (i16 == 0) {
                                iT = uVar.t();
                                int i19 = uVar.f631b;
                                bArr = uVar.f630a;
                                i11 = i19 - 1;
                                int i20 = B2.C.f560a;
                                i12 = 0;
                                for (i13 = i14; i13 < i11; i13++) {
                                    i12 = B2.C.f574p[i12 ^ (bArr[i13] & ForkServer.ERROR)];
                                }
                                if (iT == i12) {
                                    return true;
                                }
                            } else if (i16 > 11) {
                                int i21 = sVar.f13571e;
                                if (i16 == 12) {
                                    if (uVar.t() * PipesIterator.DEFAULT_QUEUE_SIZE == i21) {
                                        iT = uVar.t();
                                        int i110 = uVar.f631b;
                                        bArr = uVar.f630a;
                                        i11 = i110 - 1;
                                        int i22 = B2.C.f560a;
                                        i12 = 0;
                                        while (i13 < i11) {
                                            i12 = B2.C.f574p[i12 ^ (bArr[i13] & ForkServer.ERROR)];
                                        }
                                        if (iT == i12) {
                                            return true;
                                        }
                                    }
                                } else if (i16 <= 14) {
                                    int iZ = uVar.z();
                                    if (i16 == 14) {
                                        iZ *= 10;
                                    }
                                    if (iZ == i21) {
                                        iT = uVar.t();
                                        int i111 = uVar.f631b;
                                        bArr = uVar.f630a;
                                        i11 = i111 - 1;
                                        int i23 = B2.C.f560a;
                                        i12 = 0;
                                        while (i13 < i11) {
                                            i12 = B2.C.f574p[i12 ^ (bArr[i13] & ForkServer.ERROR)];
                                        }
                                        if (iT == i12) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (i16 == sVar.f13572f) {
                                iT = uVar.t();
                                int i112 = uVar.f631b;
                                bArr = uVar.f630a;
                                i11 = i112 - 1;
                                int i24 = B2.C.f560a;
                                i12 = 0;
                                while (i13 < i11) {
                                    i12 = B2.C.f574p[i12 ^ (bArr[i13] & ForkServer.ERROR)];
                                }
                                if (iT == i12) {
                                    return true;
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    public static void c(String str, boolean z10) throws p255y2.D {
        if (!z10) {
            throw p255y2.D.a(null, str);
        }
    }

    public static void d(long j10, B2.u uVar, F[] fArr) {
        int i10;
        int iT;
        while (true) {
            if (uVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (uVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iT2 = uVar.t();
                i11 += iT2;
                if (iT2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (uVar.a() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iT = uVar.t();
                    i12 += iT;
                }
            } while (iT == 255);
            int i13 = uVar.f631b + i12;
            if (i12 == -1 || i12 > uVar.a()) {
                AbstractC0111a.x("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = uVar.f632c;
            } else if (i10 == 4 && i12 >= 8) {
                int iT3 = uVar.t();
                int iZ = uVar.z();
                int iG = iZ == 49 ? uVar.g() : 0;
                int iT4 = uVar.t();
                if (iZ == 47) {
                    uVar.G(1);
                }
                boolean z10 = iT3 == 181 && (iZ == 49 || iZ == 47) && iT4 == 3;
                if (iZ == 49) {
                    z10 &= iG == 1195456820;
                }
                if (z10) {
                    e(j10, uVar, fArr);
                }
            }
            uVar.F(i13);
        }
    }

    public static void e(long j10, B2.u uVar, F[] fArr) {
        int iT = uVar.t();
        if ((iT & 64) != 0) {
            uVar.G(1);
            int i10 = (iT & 31) * 3;
            int i11 = uVar.f631b;
            for (F f10 : fArr) {
                uVar.F(i11);
                f10.c(uVar, i10, 0);
                AbstractC0111a.h(j10 != -9223372036854775807L);
                f10.a(j10, 1, i10, 0, null);
            }
        }
    }

    public static int f(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f13484d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f13488h[i12]) * 2;
        }
        int i14 = f13487g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static void g(int i10, B2.u uVar) {
        uVar.C(7);
        byte[] bArr = uVar.f630a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        bArr[5] = (byte) ((i10 >> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
        bArr[6] = (byte) (i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK);
    }

    public static int h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f13498t[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f13499u[i13 - 1] : f13500v[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f13501w[i13 - 1] : f13502x[i13 - 1];
        } else {
            i15 = f13503y[i13 - 1];
        }
        if (i11 == 3) {
            return V0.p.b(i15, 144, i16, i17);
        }
        return V0.p.b(i12 == 1 ? 72 : 144, i15, i16, i17);
    }

    public static B2.t i(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new B2.t(bArr, bArr.length, 0, (byte) 0);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        B2.t tVar = new B2.t(bArrCopyOf, bArrCopyOf.length, 0, (byte) 0);
        if (bArrCopyOf[0] == 31) {
            B2.t tVar2 = new B2.t(bArrCopyOf, bArrCopyOf.length, 0, (byte) 0);
            while (tVar2.i() >= 16) {
                tVar2.H(2);
                int iW = tVar2.w(14) & 16383;
                int iMin = Math.min(8 - tVar.f625d, 14);
                int i12 = tVar.f625d;
                int i13 = (8 - i12) - iMin;
                byte[] bArr2 = tVar.f623b;
                int i14 = tVar.f624c;
                byte b13 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b13;
                int i15 = 14 - iMin;
                bArr2[i14] = (byte) (b13 | ((iW >>> i15) << i13));
                int i16 = i14 + 1;
                while (i15 > 8) {
                    tVar.f623b[i16] = (byte) (iW >>> (i15 - 8));
                    i15 -= 8;
                    i16++;
                }
                int i17 = 8 - i15;
                byte[] bArr3 = tVar.f623b;
                byte b14 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                bArr3[i16] = b14;
                bArr3[i16] = (byte) (((iW & ((1 << i15) - 1)) << i17) | b14);
                tVar.H(14);
                tVar.e();
            }
        }
        tVar.D(bArrCopyOf, bArrCopyOf.length);
        return tVar;
    }

    public static long j(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & ForkServer.ERROR;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    public static int k(B2.t tVar) throws p255y2.D {
        int iW = tVar.w(4);
        if (iW == 15) {
            if (tVar.i() >= 24) {
                return tVar.w(24);
            }
            throw p255y2.D.a(null, "AAC header insufficient data");
        }
        if (iW < 13) {
            return f13481a[iW];
        }
        throw p255y2.D.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int l(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static C0630g m(B2.t tVar) {
        int i10;
        int i11;
        int iW = tVar.w(16);
        int iW2 = tVar.w(16);
        if (iW2 == 65535) {
            iW2 = tVar.w(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iW2 + i10;
        if (iW == 44097) {
            i12 += 2;
        }
        if (tVar.w(2) == 3) {
            do {
                tVar.w(2);
            } while (tVar.v());
        }
        int iW3 = tVar.w(10);
        if (tVar.v() && tVar.w(3) > 0) {
            tVar.H(2);
        }
        int i13 = tVar.v() ? 48000 : 44100;
        int iW4 = tVar.w(4);
        int[] iArr = f13489i;
        if (i13 == 44100 && iW4 == 13) {
            i11 = iArr[iW4];
        } else if (i13 != 48000 || iW4 >= 14) {
            i11 = 0;
        } else {
            int i14 = iArr[iW4];
            int i15 = iW3 % 5;
            if (i15 == 1) {
                if (iW4 != 3 || iW4 == 8) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (i15 != 2) {
                if (i15 == 3) {
                    if (iW4 != 3) {
                    }
                    i11 = i14 + 1;
                } else if (i15 == 4 && (iW4 == 3 || iW4 == 8 || iW4 == 11)) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else if (iW4 == 8 || iW4 == 11) {
                i11 = i14 + 1;
            } else {
                i11 = i14;
            }
        }
        return new C0630g(i13, i12, i11);
    }

    public static C0960a n(B2.t tVar, boolean z10) throws p255y2.D {
        int iW = tVar.w(5);
        if (iW == 31) {
            iW = tVar.w(6) + 32;
        }
        int iK = k(tVar);
        int iW2 = tVar.w(4);
        String strJ = p134m1.b.j(iW, "mp4a.40.");
        if (iW == 5 || iW == 29) {
            iK = k(tVar);
            int iW3 = tVar.w(5);
            if (iW3 == 31) {
                iW3 = tVar.w(6) + 32;
            }
            iW = iW3;
            if (iW == 22) {
                iW2 = tVar.w(4);
            }
        }
        if (z10) {
            if (iW != 1 && iW != 2 && iW != 3 && iW != 4 && iW != 6 && iW != 7 && iW != 17) {
                switch (iW) {
                    case 19:
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw p255y2.D.d("Unsupported audio object type: " + iW);
                }
            }
            if (tVar.v()) {
                AbstractC0111a.x("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (tVar.v()) {
                tVar.H(14);
            }
            boolean zV = tVar.v();
            if (iW2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iW == 6 || iW == 20) {
                tVar.H(3);
            }
            if (zV) {
                if (iW == 22) {
                    tVar.H(16);
                }
                if (iW == 17 || iW == 19 || iW == 20 || iW == 23) {
                    tVar.H(3);
                }
                tVar.H(1);
            }
            switch (iW) {
                case 17:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                    int iW4 = tVar.w(2);
                    if (iW4 == 2 || iW4 == 3) {
                        throw p255y2.D.d("Unsupported epConfig: " + iW4);
                    }
                    break;
            }
        }
        int i10 = f13482b[iW2];
        if (i10 == -1) {
            throw p255y2.D.a(null, null);
        }
        C0960a c0960a = new C0960a();
        c0960a.f13479b = iK;
        c0960a.f13480c = i10;
        c0960a.f13478a = strJ;
        return c0960a;
    }

    public static int o(B2.t tVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && tVar.v(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return tVar.w(iArr[i10]) + i12;
    }

    public static p255y2.B p(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = B2.C.f560a;
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f16452b, 2);
            if (strArrSplit.length != 2) {
                AbstractC0111a.x("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(p125l3.a.a(new B2.u(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    AbstractC0111a.y("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new p176q3.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p255y2.B(arrayList);
    }

    public static int q(int i10, B2.u uVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return uVar.t() + 1;
            case 7:
                return uVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static B4.d r(B2.u uVar) {
        uVar.G(1);
        int iW = uVar.w();
        long j10 = ((long) uVar.f631b) + ((long) iW);
        int i10 = iW / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jN = uVar.n();
            if (jN == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jN;
            jArrCopyOf2[i11] = uVar.n();
            uVar.G(2);
        }
        uVar.G((int) (j10 - ((long) uVar.f631b)));
        return new B4.d(jArrCopyOf, jArrCopyOf2);
    }

    public static H s(B2.u uVar, boolean z10, boolean z11) throws p255y2.D {
        if (z10) {
            t(3, uVar, false);
        }
        uVar.r((int) uVar.k(), p267z6.h.f29879c);
        long jK = uVar.k();
        String[] strArr = new String[(int) jK];
        for (int i10 = 0; i10 < jK; i10++) {
            strArr[i10] = uVar.r((int) uVar.k(), p267z6.h.f29879c);
        }
        if (z11 && (uVar.t() & 1) == 0) {
            throw p255y2.D.a(null, "framing bit expected to be set");
        }
        return new H(strArr);
    }

    public static boolean t(int i10, B2.u uVar, boolean z10) throws p255y2.D {
        if (uVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw p255y2.D.a(null, "too short header: " + uVar.a());
        }
        if (uVar.t() != i10) {
            if (z10) {
                return false;
            }
            throw p255y2.D.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (uVar.t() == 118 && uVar.t() == 111 && uVar.t() == 114 && uVar.t() == 98 && uVar.t() == 105 && uVar.t() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw p255y2.D.a(null, "expected characters 'vorbis'");
    }
}
