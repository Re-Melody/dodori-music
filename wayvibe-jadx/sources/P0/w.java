package P0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f9489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextDirectionHeuristic f9491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout.Alignment f9492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextUtils.TruncateAt f9494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9496j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9500o;

    public w(CharSequence charSequence, int i10, TextPaint textPaint, int i11, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, boolean z10, int i15, int i16, int i17, int i18) {
        this.f9487a = charSequence;
        this.f9488b = i10;
        this.f9489c = textPaint;
        this.f9490d = i11;
        this.f9491e = textDirectionHeuristic;
        this.f9492f = alignment;
        this.f9493g = i12;
        this.f9494h = truncateAt;
        this.f9495i = i13;
        this.f9496j = i14;
        this.k = z10;
        this.f9497l = i15;
        this.f9498m = i16;
        this.f9499n = i17;
        this.f9500o = i18;
        if (i10 < 0) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
    }
}
