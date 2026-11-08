package P0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f9479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f9480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9482d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9483e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f9484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9485g;

    public o(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f9479a = charSequence;
        this.f9480b = textPaint;
        this.f9481c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f9485g) {
            TextDirectionHeuristic textDirectionHeuristicA = A.a(this.f9481c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f9479a;
            TextPaint textPaint = this.f9480b;
            this.f9484f = i10 >= 33 ? c.b(charSequence, textPaint, textDirectionHeuristicA) : d.b(charSequence, textPaint, textDirectionHeuristicA);
            this.f9485g = true;
        }
        return this.f9484f;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    public final float b() {
        if (!Float.isNaN(this.f9482d)) {
            return this.f9482d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f9480b;
        CharSequence charSequence = this.f9479a;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint));
        }
        if (fCeil != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), R0.f.class) != spanned.length() || spanned.nextSpanTransition(-1, spanned.length(), R0.e.class) != spanned.length()) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f9482d = fCeil;
        return fCeil;
    }
}
