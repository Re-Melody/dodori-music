package A4;

import V0.p;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f266h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f267i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f268j = {32, 64, 96, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    public static final int[] k = {32, 48, 56, 64, 80, 96, 112, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 144, 160, 176, 192, 224, 256};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f269l = {32, 48, 56, 64, 80, 96, 112, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 160, 192, 224, 256, 320, 384};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f270m = {32, 40, 48, 56, 64, 80, 96, 112, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 160, 192, 224, 256, 320};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f271n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 144, 160};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f278g;

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f267i[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f268j[i13 - 1] : k[i13 - 1]) * 12000) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f269l[i13 - 1] : f270m[i13 - 1];
        } else {
            i15 = f271n[i13 - 1];
        }
        if (i11 == 3) {
            return p.b(i15, 144000, i16, i17);
        }
        return p.b(i12 == 1 ? 72000 : 144000, i15, i16, i17);
    }

    public static boolean b(int i10, e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iB;
        int i16;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i17 = f267i[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            i15 = i11 == 3 ? f268j[i13 - 1] : k[i13 - 1];
            iB = (((i15 * 12000) / i17) + i18) * 4;
            i16 = 384;
        } else {
            int i19 = 1152;
            if (i11 == 3) {
                i15 = i12 == 2 ? f269l[i13 - 1] : f270m[i13 - 1];
                iB = p.b(i15, 144000, i17, i18);
            } else {
                i15 = f271n[i13 - 1];
                i19 = i12 == 1 ? 576 : 1152;
                iB = p.b(i12 == 1 ? 72000 : 144000, i15, i17, i18);
            }
            i16 = i19;
        }
        String str = f266h[3 - i12];
        int i20 = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        int i21 = i15 * PipesIterator.DEFAULT_QUEUE_SIZE;
        eVar.f272a = i11;
        eVar.f273b = str;
        eVar.f274c = iB;
        eVar.f275d = i17;
        eVar.f276e = i20;
        eVar.f277f = i21;
        eVar.f278g = i16;
        return true;
    }
}
