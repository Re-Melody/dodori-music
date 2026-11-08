package okhttp3.internal.idn;

import E9.C0351l;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import p217u7.d;

/* JADX INFO: loaded from: classes2.dex */
public final class Punycode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Punycode f24532a = new Punycode();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24533b = "xn--";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0351l f24534c;

    static {
        C0351l c0351l = C0351l.f3388d;
        f24534c = d.l("xn--");
    }

    private Punycode() {
    }

    public static int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD : i10 / 2;
        int i13 = (i12 / i11) + i12;
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return ((i13 * 36) / (i13 + 38)) + i14;
    }

    public static int b(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }
}
