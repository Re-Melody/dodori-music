package p105j6;

import K1.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import app.nagakiba.wayvibe.R;
import java.util.WeakHashMap;
import p046da.b;
import p139m6.e;
import p152o.C2151p;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C2151p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f21500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f21501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f21502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21505h;

    public a(Context context, AttributeSet attributeSet) {
        int resourceId;
        Drawable drawableR;
        super(context, attributeSet, R.attr.materialButtonStyle);
        TypedArray typedArrayB = e.b(context, attributeSet, p051e6.a.f19622g, R.attr.materialButtonStyle, R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f21499b = typedArrayB.getDimensionPixelSize(9, 0);
        int i10 = typedArrayB.getInt(12, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f21500c = e.c(i10, mode);
        this.f21501d = b.A(getContext(), typedArrayB, 11);
        this.f21502e = (!typedArrayB.hasValue(7) || (resourceId = typedArrayB.getResourceId(7, 0)) == 0 || (drawableR = c.r(getContext(), resourceId)) == null) ? typedArrayB.getDrawable(7) : drawableR;
        this.f21505h = typedArrayB.getInteger(8, 1);
        this.f21503f = typedArrayB.getDimensionPixelSize(10, 0);
        c cVar = new c(this);
        this.f21498a = cVar;
        cVar.f21507b = typedArrayB.getDimensionPixelOffset(0, 0);
        cVar.f21508c = typedArrayB.getDimensionPixelOffset(1, 0);
        cVar.f21509d = typedArrayB.getDimensionPixelOffset(2, 0);
        cVar.f21510e = typedArrayB.getDimensionPixelOffset(3, 0);
        cVar.f21511f = typedArrayB.getDimensionPixelSize(6, 0);
        cVar.f21512g = typedArrayB.getDimensionPixelSize(15, 0);
        cVar.f21513h = e.c(typedArrayB.getInt(5, -1), mode);
        a aVar = cVar.f21506a;
        cVar.f21514i = b.A(aVar.getContext(), typedArrayB, 4);
        cVar.f21515j = b.A(aVar.getContext(), typedArrayB, 14);
        cVar.k = b.A(aVar.getContext(), typedArrayB, 13);
        Paint paint = cVar.f21516l;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(cVar.f21512g);
        ColorStateList colorStateList = cVar.f21515j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(aVar.getDrawableState(), 0) : 0);
        WeakHashMap weakHashMap = T.f7251a;
        int paddingStart = aVar.getPaddingStart();
        int paddingTop = aVar.getPaddingTop();
        int paddingEnd = aVar.getPaddingEnd();
        int paddingBottom = aVar.getPaddingBottom();
        aVar.setInternalBackground(cVar.a());
        aVar.setPaddingRelative(paddingStart + cVar.f21507b, paddingTop + cVar.f21509d, paddingEnd + cVar.f21508c, paddingBottom + cVar.f21510e);
        typedArrayB.recycle();
        setCompoundDrawablePadding(this.f21499b);
        b();
    }

    public final boolean a() {
        c cVar = this.f21498a;
        return (cVar == null || cVar.f21520p) ? false : true;
    }

    public final void b() {
        Drawable drawable = this.f21502e;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f21502e = drawableMutate;
            drawableMutate.setTintList(this.f21501d);
            PorterDuff.Mode mode = this.f21500c;
            if (mode != null) {
                this.f21502e.setTintMode(mode);
            }
            int intrinsicWidth = this.f21503f;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f21502e.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f21503f;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f21502e.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f21502e;
            int i10 = this.f21504g;
            drawable2.setBounds(i10, 0, intrinsicWidth + i10, intrinsicHeight);
        }
        setCompoundDrawablesRelative(this.f21502e, null, null, null);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f21498a.f21511f;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f21502e;
    }

    public int getIconGravity() {
        return this.f21505h;
    }

    public int getIconPadding() {
        return this.f21499b;
    }

    public int getIconSize() {
        return this.f21503f;
    }

    public ColorStateList getIconTint() {
        return this.f21501d;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f21500c;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f21498a.k;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f21498a.f21515j;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f21498a.f21512g;
        }
        return 0;
    }

    @Override // p152o.C2151p
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f21498a.f21514i : super.getSupportBackgroundTintList();
    }

    @Override // p152o.C2151p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f21498a.f21513h : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f21502e == null || this.f21505h != 2) {
            return;
        }
        int iMeasureText = (int) getPaint().measureText(getText().toString());
        int intrinsicWidth = this.f21503f;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f21502e.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - iMeasureText;
        WeakHashMap weakHashMap = T.f7251a;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - intrinsicWidth) - this.f21499b) - getPaddingStart()) / 2;
        if (getLayoutDirection() == 1) {
            paddingEnd = -paddingEnd;
        }
        if (this.f21504g != paddingEnd) {
            this.f21504g = paddingEnd;
            b();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!a()) {
            super.setBackgroundColor(i10);
            return;
        }
        GradientDrawable gradientDrawable = this.f21498a.f21517m;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
    }

    @Override // p152o.C2151p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.i("MaterialButton", "Setting a custom background is not supported.");
        c cVar = this.f21498a;
        cVar.f21520p = true;
        ColorStateList colorStateList = cVar.f21514i;
        a aVar = cVar.f21506a;
        aVar.setSupportBackgroundTintList(colorStateList);
        aVar.setSupportBackgroundTintMode(cVar.f21513h);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p152o.C2151p, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? c.r(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            c cVar = this.f21498a;
            if (cVar.f21511f != i10) {
                cVar.f21511f = i10;
                GradientDrawable gradientDrawable = cVar.f21517m;
                if (gradientDrawable == null || cVar.f21518n == null || cVar.f21519o == null) {
                    return;
                }
                float f10 = i10 + 1.0E-5f;
                gradientDrawable.setCornerRadius(f10);
                cVar.f21518n.setCornerRadius(f10);
                cVar.f21519o.setCornerRadius(f10);
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f21502e != drawable) {
            this.f21502e = drawable;
            b();
        }
    }

    public void setIconGravity(int i10) {
        this.f21505h = i10;
    }

    public void setIconPadding(int i10) {
        if (this.f21499b != i10) {
            this.f21499b = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? c.r(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f21503f != i10) {
            this.f21503f = i10;
            b();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f21501d != colorStateList) {
            this.f21501d = colorStateList;
            b();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f21500c != mode) {
            this.f21500c = mode;
            b();
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(p254y1.a.getColorStateList(getContext(), i10));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f21498a;
            if (cVar.k != colorStateList) {
                cVar.k = colorStateList;
                a aVar = cVar.f21506a;
                if (aVar.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.getBackground()).setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(p254y1.a.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f21498a;
            if (cVar.f21515j != colorStateList) {
                cVar.f21515j = colorStateList;
                Paint paint = cVar.f21516l;
                a aVar = cVar.f21506a;
                paint.setColor(colorStateList != null ? colorStateList.getColorForState(aVar.getDrawableState(), 0) : 0);
                if (cVar.f21518n != null) {
                    aVar.setInternalBackground(cVar.a());
                }
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(p254y1.a.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            c cVar = this.f21498a;
            if (cVar.f21512g != i10) {
                cVar.f21512g = i10;
                cVar.f21516l.setStrokeWidth(i10);
                if (cVar.f21518n != null) {
                    cVar.f21506a.setInternalBackground(cVar.a());
                }
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // p152o.C2151p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        boolean zA = a();
        c cVar = this.f21498a;
        if (!zA) {
            if (cVar != null) {
                super.setSupportBackgroundTintList(colorStateList);
            }
        } else if (cVar.f21514i != colorStateList) {
            cVar.f21514i = colorStateList;
            cVar.b();
        }
    }

    @Override // p152o.C2151p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        boolean zA = a();
        c cVar = this.f21498a;
        if (!zA) {
            if (cVar != null) {
                super.setSupportBackgroundTintMode(mode);
            }
        } else if (cVar.f21513h != mode) {
            cVar.f21513h = mode;
            cVar.b();
        }
    }
}
