package R0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10615b;

    public /* synthetic */ a(float f10, int i10) {
        this.f10614a = i10;
        this.f10615b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f10614a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f10615b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f10615b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f10614a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f10615b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f10615b);
                break;
        }
    }
}
