package p139m6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p051e6.a;
import p152o.AbstractC2171z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends AbstractC2171z0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f22360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f22361q;
    public final Rect r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f22363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22364u;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22361q = new Rect();
        this.r = new Rect();
        this.f22362s = 119;
        this.f22363t = true;
        this.f22364u = false;
        TypedArray typedArrayB = e.b(context, attributeSet, a.f19621f, 0, 0, new int[0]);
        this.f22362s = typedArrayB.getInt(1, this.f22362s);
        Drawable drawable = typedArrayB.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f22363t = typedArrayB.getBoolean(2, true);
        typedArrayB.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f22360p;
        if (drawable != null) {
            if (this.f22364u) {
                this.f22364u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f22363t;
                Rect rect = this.f22361q;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f22362s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.r;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f22360p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22360p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f22360p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f22360p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f22362s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22360p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p152o.AbstractC2171z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22364u = z10 | this.f22364u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f22364u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f22360p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f22360p);
            }
            this.f22360p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f22362s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f22362s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f22362s = i10;
            if (i10 == 119 && this.f22360p != null) {
                this.f22360p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22360p;
    }
}
