package p245x3;

import A2.b;
import B2.AbstractC0111a;
import B2.u;
import P4.k;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p234w3.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28364j;
    public final int k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f28368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f28369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28370q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f28371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f28372t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f28373u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f28374v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f28376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f28377y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f28361z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f28354A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f28355B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f28356C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f28357D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f28358E = {193, RCHTTPStatusCodes.CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f28359F = {195, 227, 205, RCHTTPStatusCodes.NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final boolean[] f28360G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f28362h = new u();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f28366m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f28367n = new b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f28375w = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f28365l = 16000000;

    public c(String str, int i10) {
        this.f28363i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.k = 0;
            this.f28364j = 0;
        } else if (i10 == 2) {
            this.k = 1;
            this.f28364j = 0;
        } else if (i10 == 3) {
            this.k = 0;
            this.f28364j = 1;
        } else if (i10 != 4) {
            AbstractC0111a.x("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.f28364j = 0;
        } else {
            this.k = 1;
            this.f28364j = 1;
        }
        l(0);
        k();
        this.f28376x = true;
        this.f28377y = -9223372036854775807L;
    }

    @Override // p245x3.h
    public final k f() {
        List list = this.f28368o;
        this.f28369p = list;
        list.getClass();
        return new k(list);
    }

    @Override // p245x3.h, E2.d
    public final void flush() {
        super.flush();
        this.f28368o = null;
        this.f28369p = null;
        l(0);
        this.r = 4;
        this.f28367n.f28353h = 4;
        k();
        this.f28371s = false;
        this.f28372t = false;
        this.f28373u = (byte) 0;
        this.f28374v = (byte) 0;
        this.f28375w = 0;
        this.f28376x = true;
        this.f28377y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p245x3.h
    public final void g(g gVar) {
        boolean z10;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = gVar.f3030e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        u uVar = this.f28362h;
        uVar.D(bArrArray, iLimit);
        boolean z11 = false;
        while (true) {
            int iA = uVar.a();
            int i14 = this.f28363i;
            if (iA < i14) {
                if (z11) {
                    int i15 = this.f28370q;
                    if (i15 == 1 || i15 == 3) {
                        this.f28368o = j();
                        this.f28377y = this.f28423e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iT = i14 == 2 ? -4 : uVar.t();
            int iT2 = uVar.t();
            int iT3 = uVar.t();
            if ((iT & 2) == 0 && (iT & 1) == this.f28364j) {
                byte b10 = (byte) (iT2 & 127);
                byte b11 = (byte) (iT3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f28371s;
                    if ((iT & 4) == 4) {
                        boolean[] zArr = f28360G;
                        if (zArr[iT2] && zArr[iT3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f28371s = z10;
                    if (!z10 || (b10 & 240) != 16) {
                        this.f28372t = false;
                        if (!z10) {
                            if (1 > b10 && b10 <= 15) {
                                this.f28376x = false;
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case 43:
                                                    this.f28376x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f28376x = true;
                                            break;
                                    }
                                } else {
                                    this.f28376x = true;
                                }
                            }
                            if (this.f28376x) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f28375w = (b10 >> 3) & 1;
                                }
                                if (this.f28375w != this.k) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17 || (b11 & 240) != 48) {
                                            i12 = b10 & 246;
                                            if (i12 != 18 && (b11 & 224) == 32) {
                                                this.f28367n.b();
                                                this.f28367n.a((char) ((b10 & 1) == 0 ? f28358E[b11 & 31] : f28359F[b11 & 31]));
                                            } else if (i11 != 17 && (b11 & 240) == 32) {
                                                this.f28367n.a(' ');
                                                boolean z13 = (b11 & 1) == 1;
                                                b bVar = this.f28367n;
                                                bVar.f28346a.add(new a((b11 >> 1) & 7, z13, bVar.f28348c.length()));
                                            } else if ((b10 & 240) != 16 && (b11 & 192) == 64) {
                                                int i16 = f28361z[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i16++;
                                                }
                                                b bVar2 = this.f28367n;
                                                if (i16 != bVar2.f28349d) {
                                                    if (this.f28370q != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.f28370q, this.r);
                                                        this.f28367n = bVar3;
                                                        this.f28366m.add(bVar3);
                                                    }
                                                    this.f28367n.f28349d = i16;
                                                }
                                                boolean z14 = (b11 & 16) == 16;
                                                boolean z15 = (b11 & 1) == 1;
                                                int i17 = (b11 >> 1) & 7;
                                                b bVar4 = this.f28367n;
                                                bVar4.f28346a.add(new a(z14 ? 8 : i17, z15, bVar4.f28348c.length()));
                                                if (z14) {
                                                    this.f28367n.f28350e = f28354A[i17];
                                                }
                                            } else if (i11 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f28367n.f28351f = b11 - 32;
                                            } else if (i12 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    l(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            l(1);
                                                            this.r = 2;
                                                            this.f28367n.f28353h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.r = 3;
                                                            this.f28367n.f28353h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.r = 4;
                                                            this.f28367n.f28353h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f28370q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f28368o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1 || i13 == 3) {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1 && !this.f28367n.e()) {
                                                                                b bVar5 = this.f28367n;
                                                                                arrayList = bVar5.f28347b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.f28348c.setLength(0);
                                                                                bVar5.f28346a.clear();
                                                                                iMin = Math.min(bVar5.f28353h, bVar5.f28349d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f28368o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f28367n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            this.f28367n.a((char) f28357D[b11 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.f28367n;
                                        iArr = f28356C;
                                        bVar6.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f28367n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            k();
                            z11 = true;
                        }
                    } else if (this.f28372t && this.f28373u == b10 && this.f28374v == b11) {
                        this.f28372t = false;
                    } else {
                        this.f28372t = true;
                        this.f28373u = b10;
                        this.f28374v = b11;
                        if (!z10) {
                            if (1 > b10) {
                                if ((b10 & 246) == 20) {
                                    if (b11 == 32) {
                                        this.f28376x = true;
                                    } else {
                                        this.f28376x = true;
                                    }
                                }
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32) {
                                    this.f28376x = true;
                                } else {
                                    this.f28376x = true;
                                }
                            }
                            if (this.f28376x) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f28375w = (b10 >> 3) & 1;
                                }
                                if (this.f28375w != this.k) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17) {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    l(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.r = 2;
                                                                            this.f28367n.f28353h = 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.r = 3;
                                                                            this.f28367n.f28353h = 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.r = 4;
                                                                            this.f28367n.f28353h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f28370q;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f28368o = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar7 = this.f28367n;
                                                                                                arrayList = bVar7.f28347b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.f28348c.setLength(0);
                                                                                                bVar7.f28346a.clear();
                                                                                                iMin = Math.min(bVar7.f28353h, bVar7.f28349d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f28368o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f28367n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar8 = this.f28367n;
                                                                                            arrayList = bVar8.f28347b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.f28348c.setLength(0);
                                                                                            bVar8.f28346a.clear();
                                                                                            iMin = Math.min(bVar8.f28353h, bVar8.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar9 = this.f28367n;
                                                                                            arrayList = bVar9.f28347b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.f28348c.setLength(0);
                                                                                            bVar9.f28346a.clear();
                                                                                            iMin = Math.min(bVar9.f28353h, bVar9.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar10 = this.f28367n;
                                                                                        arrayList = bVar10.f28347b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.f28348c.setLength(0);
                                                                                        bVar10.f28346a.clear();
                                                                                        iMin = Math.min(bVar10.f28353h, bVar10.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar11 = this.f28367n;
                                                                                            arrayList = bVar11.f28347b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.f28348c.setLength(0);
                                                                                            bVar11.f28346a.clear();
                                                                                            iMin = Math.min(bVar11.f28353h, bVar11.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar12 = this.f28367n;
                                                                                        arrayList = bVar12.f28347b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.f28348c.setLength(0);
                                                                                        bVar12.f28346a.clear();
                                                                                        iMin = Math.min(bVar12.f28353h, bVar12.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar13 = this.f28367n;
                                                                                        arrayList = bVar13.f28347b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.f28348c.setLength(0);
                                                                                        bVar13.f28346a.clear();
                                                                                        iMin = Math.min(bVar13.f28353h, bVar13.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar14 = this.f28367n;
                                                                                    arrayList = bVar14.f28347b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.f28348c.setLength(0);
                                                                                    bVar14.f28346a.clear();
                                                                                    iMin = Math.min(bVar14.f28353h, bVar14.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar15 = this.f28367n;
                                                                                            arrayList = bVar15.f28347b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.f28348c.setLength(0);
                                                                                            bVar15.f28346a.clear();
                                                                                            iMin = Math.min(bVar15.f28353h, bVar15.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar16 = this.f28367n;
                                                                                        arrayList = bVar16.f28347b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.f28348c.setLength(0);
                                                                                        bVar16.f28346a.clear();
                                                                                        iMin = Math.min(bVar16.f28353h, bVar16.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar17 = this.f28367n;
                                                                                        arrayList = bVar17.f28347b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.f28348c.setLength(0);
                                                                                        bVar17.f28346a.clear();
                                                                                        iMin = Math.min(bVar17.f28353h, bVar17.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar18 = this.f28367n;
                                                                                    arrayList = bVar18.f28347b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.f28348c.setLength(0);
                                                                                    bVar18.f28346a.clear();
                                                                                    iMin = Math.min(bVar18.f28353h, bVar18.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar19 = this.f28367n;
                                                                                        arrayList = bVar19.f28347b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.f28348c.setLength(0);
                                                                                        bVar19.f28346a.clear();
                                                                                        iMin = Math.min(bVar19.f28353h, bVar19.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar110 = this.f28367n;
                                                                                    arrayList = bVar110.f28347b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.f28348c.setLength(0);
                                                                                    bVar110.f28346a.clear();
                                                                                    iMin = Math.min(bVar110.f28353h, bVar110.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar111 = this.f28367n;
                                                                                    arrayList = bVar111.f28347b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.f28348c.setLength(0);
                                                                                    bVar111.f28346a.clear();
                                                                                    iMin = Math.min(bVar111.f28353h, bVar111.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    l(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            l(1);
                                                            this.r = 2;
                                                            this.f28367n.f28353h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.r = 3;
                                                            this.f28367n.f28353h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.r = 4;
                                                            this.f28367n.f28353h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f28370q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f28368o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar112 = this.f28367n;
                                                                                arrayList = bVar112.f28347b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.f28348c.setLength(0);
                                                                                bVar112.f28346a.clear();
                                                                                iMin = Math.min(bVar112.f28353h, bVar112.f28349d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f28368o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f28367n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    l(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.r = 2;
                                                                            this.f28367n.f28353h = 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.r = 3;
                                                                            this.f28367n.f28353h = 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.r = 4;
                                                                            this.f28367n.f28353h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f28370q;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f28368o = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar113 = this.f28367n;
                                                                                                arrayList = bVar113.f28347b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.f28348c.setLength(0);
                                                                                                bVar113.f28346a.clear();
                                                                                                iMin = Math.min(bVar113.f28353h, bVar113.f28349d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f28368o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f28367n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar114 = this.f28367n;
                                                                                            arrayList = bVar114.f28347b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.f28348c.setLength(0);
                                                                                            bVar114.f28346a.clear();
                                                                                            iMin = Math.min(bVar114.f28353h, bVar114.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar115 = this.f28367n;
                                                                                            arrayList = bVar115.f28347b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.f28348c.setLength(0);
                                                                                            bVar115.f28346a.clear();
                                                                                            iMin = Math.min(bVar115.f28353h, bVar115.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar116 = this.f28367n;
                                                                                        arrayList = bVar116.f28347b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.f28348c.setLength(0);
                                                                                        bVar116.f28346a.clear();
                                                                                        iMin = Math.min(bVar116.f28353h, bVar116.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar117 = this.f28367n;
                                                                                            arrayList = bVar117.f28347b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.f28348c.setLength(0);
                                                                                            bVar117.f28346a.clear();
                                                                                            iMin = Math.min(bVar117.f28353h, bVar117.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar118 = this.f28367n;
                                                                                        arrayList = bVar118.f28347b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.f28348c.setLength(0);
                                                                                        bVar118.f28346a.clear();
                                                                                        iMin = Math.min(bVar118.f28353h, bVar118.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar119 = this.f28367n;
                                                                                        arrayList = bVar119.f28347b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.f28348c.setLength(0);
                                                                                        bVar119.f28346a.clear();
                                                                                        iMin = Math.min(bVar119.f28353h, bVar119.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1110 = this.f28367n;
                                                                                    arrayList = bVar1110.f28347b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.f28348c.setLength(0);
                                                                                    bVar1110.f28346a.clear();
                                                                                    iMin = Math.min(bVar1110.f28353h, bVar1110.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = 2;
                                                                        this.f28367n.f28353h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = 3;
                                                                        this.f28367n.f28353h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = 4;
                                                                        this.f28367n.f28353h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f28370q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f28368o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar1111 = this.f28367n;
                                                                                            arrayList = bVar1111.f28347b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.f28348c.setLength(0);
                                                                                            bVar1111.f28346a.clear();
                                                                                            iMin = Math.min(bVar1111.f28353h, bVar1111.f28349d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f28368o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f28367n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1112 = this.f28367n;
                                                                                        arrayList = bVar1112.f28347b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.f28348c.setLength(0);
                                                                                        bVar1112.f28346a.clear();
                                                                                        iMin = Math.min(bVar1112.f28353h, bVar1112.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1113 = this.f28367n;
                                                                                        arrayList = bVar1113.f28347b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.f28348c.setLength(0);
                                                                                        bVar1113.f28346a.clear();
                                                                                        iMin = Math.min(bVar1113.f28353h, bVar1113.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1114 = this.f28367n;
                                                                                    arrayList = bVar1114.f28347b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.f28348c.setLength(0);
                                                                                    bVar1114.f28346a.clear();
                                                                                    iMin = Math.min(bVar1114.f28353h, bVar1114.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = 2;
                                                                    this.f28367n.f28353h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = 3;
                                                                    this.f28367n.f28353h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = 4;
                                                                    this.f28367n.f28353h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f28370q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f28368o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1115 = this.f28367n;
                                                                                        arrayList = bVar1115.f28347b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.f28348c.setLength(0);
                                                                                        bVar1115.f28346a.clear();
                                                                                        iMin = Math.min(bVar1115.f28353h, bVar1115.f28349d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f28368o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f28367n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1116 = this.f28367n;
                                                                                    arrayList = bVar1116.f28347b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.f28348c.setLength(0);
                                                                                    bVar1116.f28346a.clear();
                                                                                    iMin = Math.min(bVar1116.f28353h, bVar1116.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.f28367n.f28353h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.f28367n.f28353h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.f28367n.f28353h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f28370q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f28368o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1117 = this.f28367n;
                                                                                    arrayList = bVar1117.f28347b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.f28348c.setLength(0);
                                                                                    bVar1117.f28346a.clear();
                                                                                    iMin = Math.min(bVar1117.f28353h, bVar1117.f28349d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f28368o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f28367n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    l(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            l(1);
                                                            this.r = 2;
                                                            this.f28367n.f28353h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.r = 3;
                                                            this.f28367n.f28353h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.r = 4;
                                                            this.f28367n.f28353h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f28370q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f28368o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar1118 = this.f28367n;
                                                                                arrayList = bVar1118.f28347b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.f28348c.setLength(0);
                                                                                bVar1118.f28346a.clear();
                                                                                iMin = Math.min(bVar1118.f28353h, bVar1118.f28349d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f28368o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f28367n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.f28367n;
                                        iArr = f28356C;
                                        bVar20.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f28367n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            k();
                            z11 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p245x3.h, E2.d
    /* JADX INFO: renamed from: h */
    public final d c() {
        d dVar;
        d dVarC = super.c();
        if (dVarC != null) {
            return dVarC;
        }
        long j10 = this.f28365l;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f28377y;
        if (j11 == -9223372036854775807L || this.f28423e - j11 < j10 || (dVar = (d) this.f28420b.pollFirst()) == null) {
            return null;
        }
        this.f28368o = Collections.EMPTY_LIST;
        this.f28377y = -9223372036854775807L;
        k kVarF = f();
        long j12 = this.f28423e;
        dVar.f3035c = j12;
        dVar.f27854e = kVarF;
        dVar.f27855f = j12;
        return dVar;
    }

    @Override // p245x3.h
    public final boolean i() {
        return this.f28368o != this.f28369p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f28366m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarC = ((b) arrayList.get(i10)).c(MediaPlayerException.ERROR_UNKNOWN);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f195i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVarC2 = (b) arrayList2.get(i11);
            if (bVarC2 != null) {
                if (bVarC2.f195i != iMin) {
                    bVarC2 = ((b) arrayList.get(i11)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f28367n;
        bVar.f28352g = this.f28370q;
        bVar.f28346a.clear();
        bVar.f28347b.clear();
        bVar.f28348c.setLength(0);
        bVar.f28349d = 15;
        bVar.f28350e = 0;
        bVar.f28351f = 0;
        ArrayList arrayList = this.f28366m;
        arrayList.clear();
        arrayList.add(this.f28367n);
    }

    public final void l(int i10) {
        int i11 = this.f28370q;
        if (i11 == i10) {
            return;
        }
        this.f28370q = i10;
        if (i10 != 3) {
            k();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f28368o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f28366m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).f28352g = i10;
            i12++;
        }
    }

    @Override // p245x3.h, E2.d
    public final void release() {
    }
}
