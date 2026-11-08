package R0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10641b;

    public k(boolean z10, boolean z11) {
        this.f10640a = z10;
        this.f10641b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f10640a);
        textPaint.setStrikeThruText(this.f10641b);
    }
}
