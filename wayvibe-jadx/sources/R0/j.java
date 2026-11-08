package R0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10639d;

    public j(int i10, float f10, float f11, float f12) {
        this.f10636a = i10;
        this.f10637b = f10;
        this.f10638c = f11;
        this.f10639d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f10639d, this.f10637b, this.f10638c, this.f10636a);
    }
}
