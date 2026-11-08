package p152o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: o.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2138i0 extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2149o f23364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f23365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2164w f23366c;

    public C2138i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        S0.a(this, getContext());
        C2149o c2149o = new C2149o(this);
        this.f23364a = c2149o;
        c2149o.d(attributeSet, R.attr.buttonStyleToggle);
        Y y6 = new Y(this);
        this.f23365b = y6;
        y6.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C2164w getEmojiTextViewHelper() {
        if (this.f23366c == null) {
            this.f23366c = new C2164w(this);
        }
        return this.f23366c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2149o c2149o = this.f23364a;
        if (c2149o != null) {
            c2149o.a();
        }
        Y y6 = this.f23365b;
        if (y6 != null) {
            y6.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2149o c2149o = this.f23364a;
        if (c2149o != null) {
            return c2149o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2149o c2149o = this.f23364a;
        if (c2149o != null) {
            return c2149o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23365b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23365b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2149o c2149o = this.f23364a;
        if (c2149o != null) {
            c2149o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2149o c2149o = this.f23364a;
        if (c2149o != null) {
            c2149o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.f23365b;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.f23365b;
        if (y6 != null) {
            y6.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2149o c2149o = this.f23364a;
        if (c2149o != null) {
            c2149o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2149o c2149o = this.f23364a;
        if (c2149o != null) {
            c2149o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y6 = this.f23365b;
        y6.k(colorStateList);
        y6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y6 = this.f23365b;
        y6.l(mode);
        y6.b();
    }
}
