package p152o;

import K1.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import app.nagakiba.wayvibe.R;
import p087i.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f23189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f23190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f23191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f23192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23194j;

    public G(F f10) {
        super(f10);
        this.f23191g = null;
        this.f23192h = null;
        this.f23193i = false;
        this.f23194j = false;
        this.f23189e = f10;
    }

    @Override // p152o.B
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, R.attr.seekBarStyle);
        F f10 = this.f23189e;
        Context context = f10.getContext();
        int[] iArr = a.f20373g;
        p150n8.a aVarQ0 = p150n8.a.q0(context, attributeSet, iArr, R.attr.seekBarStyle);
        T.h(f10, f10.getContext(), iArr, attributeSet, (TypedArray) aVarQ0.f22980b, R.attr.seekBarStyle);
        Drawable drawableI0 = aVarQ0.i0(0);
        if (drawableI0 != null) {
            f10.setThumb(drawableI0);
        }
        Drawable drawableH0 = aVarQ0.h0(1);
        Drawable drawable = this.f23190f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f23190f = drawableH0;
        if (drawableH0 != null) {
            drawableH0.setCallback(f10);
            drawableH0.setLayoutDirection(f10.getLayoutDirection());
            if (drawableH0.isStateful()) {
                drawableH0.setState(f10.getDrawableState());
            }
            f();
        }
        f10.invalidate();
        TypedArray typedArray = (TypedArray) aVarQ0.f22980b;
        if (typedArray.hasValue(3)) {
            this.f23192h = AbstractC2150o0.c(typedArray.getInt(3, -1), this.f23192h);
            this.f23194j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f23191g = aVarQ0.g0(2);
            this.f23193i = true;
        }
        aVarQ0.v0();
        f();
    }

    public final void f() {
        Drawable drawable = this.f23190f;
        if (drawable != null) {
            if (this.f23193i || this.f23194j) {
                Drawable drawableMutate = drawable.mutate();
                this.f23190f = drawableMutate;
                if (this.f23193i) {
                    drawableMutate.setTintList(this.f23191g);
                }
                if (this.f23194j) {
                    this.f23190f.setTintMode(this.f23192h);
                }
                if (this.f23190f.isStateful()) {
                    this.f23190f.setState(this.f23189e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f23190f != null) {
            F f10 = this.f23189e;
            int max = f10.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f23190f.getIntrinsicWidth();
                int intrinsicHeight = this.f23190f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f23190f.setBounds(-i10, -i11, i10, i11);
                float width = ((f10.getWidth() - f10.getPaddingLeft()) - f10.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(f10.getPaddingLeft(), f10.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f23190f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
