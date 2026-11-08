package p152o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import app.nagakiba.wayvibe.R;

/* JADX INFO: loaded from: classes.dex */
public final class F extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f23187a;

    public F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        G g3 = new G(this);
        this.f23187a = g3;
        g3.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        G g3 = this.f23187a;
        Drawable drawable = g3.f23190f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        F f10 = g3.f23189e;
        if (drawable.setState(f10.getDrawableState())) {
            f10.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f23187a.f23190f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f23187a.g(canvas);
    }
}
