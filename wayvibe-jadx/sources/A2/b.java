package A2;

import B2.AbstractC0111a;
import B2.C;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f169A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f170B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f171C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f172D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f173E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f174F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f175G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f176H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f177I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f178J;
    public static final String r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f179s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f180t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f181u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f185y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f186z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f196j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f202q;

    static {
        new b("", null, null, null, -3.4028235E38f, MediaPlayerException.ERROR_UNKNOWN, MediaPlayerException.ERROR_UNKNOWN, -3.4028235E38f, MediaPlayerException.ERROR_UNKNOWN, MediaPlayerException.ERROR_UNKNOWN, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, MediaPlayerException.ERROR_UNKNOWN, 0.0f);
        int i10 = C.f560a;
        r = Integer.toString(0, 36);
        f179s = Integer.toString(17, 36);
        f180t = Integer.toString(1, 36);
        f181u = Integer.toString(2, 36);
        f182v = Integer.toString(3, 36);
        f183w = Integer.toString(18, 36);
        f184x = Integer.toString(4, 36);
        f185y = Integer.toString(5, 36);
        f186z = Integer.toString(6, 36);
        f169A = Integer.toString(7, 36);
        f170B = Integer.toString(8, 36);
        f171C = Integer.toString(9, 36);
        f172D = Integer.toString(10, 36);
        f173E = Integer.toString(11, 36);
        f174F = Integer.toString(12, 36);
        f175G = Integer.toString(13, 36);
        f176H = Integer.toString(14, 36);
        f177I = Integer.toString(15, 36);
        f178J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0111a.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f187a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f187a = charSequence.toString();
        } else {
            this.f187a = null;
        }
        this.f188b = alignment;
        this.f189c = alignment2;
        this.f190d = bitmap;
        this.f191e = f10;
        this.f192f = i10;
        this.f193g = i11;
        this.f194h = f11;
        this.f195i = i12;
        this.f196j = f13;
        this.k = f14;
        this.f197l = z10;
        this.f198m = i14;
        this.f199n = i13;
        this.f200o = f12;
        this.f201p = i15;
        this.f202q = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f187a, bVar.f187a) && this.f188b == bVar.f188b && this.f189c == bVar.f189c) {
                Bitmap bitmap = bVar.f190d;
                Bitmap bitmap2 = this.f190d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f191e == bVar.f191e && this.f192f == bVar.f192f && this.f193g == bVar.f193g && this.f194h == bVar.f194h && this.f195i == bVar.f195i && this.f196j == bVar.f196j && this.k == bVar.k && this.f197l == bVar.f197l && this.f198m == bVar.f198m && this.f199n == bVar.f199n && this.f200o == bVar.f200o && this.f201p == bVar.f201p && this.f202q == bVar.f202q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187a, this.f188b, this.f189c, this.f190d, Float.valueOf(this.f191e), Integer.valueOf(this.f192f), Integer.valueOf(this.f193g), Float.valueOf(this.f194h), Integer.valueOf(this.f195i), Float.valueOf(this.f196j), Float.valueOf(this.k), Boolean.valueOf(this.f197l), Integer.valueOf(this.f198m), Integer.valueOf(this.f199n), Float.valueOf(this.f200o), Integer.valueOf(this.f201p), Float.valueOf(this.f202q)});
    }
}
