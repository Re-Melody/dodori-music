package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import app.nagakiba.wayvibe.R;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import p087i.a;
import p152o.C2121a;
import p152o.Q0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f14446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f14447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f14448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f14449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14452i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2121a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f20367a);
        boolean z10 = false;
        this.f14447d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f14448e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f14452i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f14450g = true;
            this.f14449f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f14450g ? !(this.f14447d != null || this.f14448e != null) : this.f14449f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14447d;
        if (drawable != null && drawable.isStateful()) {
            this.f14447d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f14448e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f14448e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f14449f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f14449f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14447d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14448e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f14449f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f14445b = findViewById(R.id.action_bar);
        this.f14446c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f14444a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (this.f14450g) {
            Drawable drawable = this.f14449f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f14447d == null) {
                z11 = false;
            } else if (this.f14445b.getVisibility() == 0) {
                this.f14447d.setBounds(this.f14445b.getLeft(), this.f14445b.getTop(), this.f14445b.getRight(), this.f14445b.getBottom());
            } else {
                View view = this.f14446c;
                if (view == null || view.getVisibility() != 0) {
                    this.f14447d.setBounds(0, 0, 0, 0);
                } else {
                    this.f14447d.setBounds(this.f14446c.getLeft(), this.f14446c.getTop(), this.f14446c.getRight(), this.f14446c.getBottom());
                }
            }
            this.f14451h = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f14445b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f14452i) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), MediaPlayerException.ERROR_UNKNOWN);
        }
        super.onMeasure(i10, i11);
        if (this.f14445b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f14447d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f14447d);
        }
        this.f14447d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f14445b;
            if (view != null) {
                this.f14447d.setBounds(view.getLeft(), this.f14445b.getTop(), this.f14445b.getRight(), this.f14445b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f14450g ? !(this.f14447d != null || this.f14448e != null) : this.f14449f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f14449f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f14449f);
        }
        this.f14449f = drawable;
        boolean z10 = this.f14450g;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f14449f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f14447d != null || this.f14448e != null) : this.f14449f == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f14448e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f14448e);
        }
        this.f14448e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f14451h && this.f14448e != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f14450g ? !(this.f14447d != null || this.f14448e != null) : this.f14449f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        this.f14444a = z10;
        setDescendantFocusability(z10 ? 393216 : ETagPayloadStore.WRITE_BUFFER_BYTES);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f14447d;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f14448e;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f14449f;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14447d;
        boolean z10 = this.f14450g;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f14448e && this.f14451h) {
            return true;
        }
        return (drawable == this.f14449f && z10) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(Q0 q5) {
    }
}
