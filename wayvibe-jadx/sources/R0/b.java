package R0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10617b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f10616a = i10;
        this.f10617b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f10616a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f10617b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f10617b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f10616a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f10617b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f10617b);
                break;
        }
    }
}
