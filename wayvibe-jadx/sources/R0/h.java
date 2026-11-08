package R0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10627f = MediaPlayerException.ERROR_UNKNOWN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10628g = MediaPlayerException.ERROR_UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10629h = MediaPlayerException.ERROR_UNKNOWN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10630i = MediaPlayerException.ERROR_UNKNOWN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10631j;
    public int k;

    public h(float f10, int i10, boolean z10, boolean z11, float f11) {
        this.f10622a = f10;
        this.f10623b = i10;
        this.f10624c = z10;
        this.f10625d = z11;
        this.f10626e = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.f10623b;
        boolean z12 = this.f10625d;
        boolean z13 = this.f10624c;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f10627f == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f10622a);
            int i17 = iCeil - i16;
            float fAbs = this.f10626e;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
            int i18 = fontMetricsInt.descent;
            int i19 = iCeil2 + i18;
            this.f10629h = i19;
            int i20 = i19 - iCeil;
            this.f10628g = i20;
            if (z13) {
                i20 = fontMetricsInt.ascent;
            }
            this.f10627f = i20;
            if (z12) {
                i19 = i18;
            }
            this.f10630i = i19;
            this.f10631j = fontMetricsInt.ascent - i20;
            this.k = i19 - i18;
        }
        fontMetricsInt.ascent = z10 ? this.f10627f : this.f10628g;
        fontMetricsInt.descent = z11 ? this.f10630i : this.f10629h;
    }
}
