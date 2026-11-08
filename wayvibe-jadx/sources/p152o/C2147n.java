package p152o;

import D7.W;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p046da.b;
import p150n8.a;
import p242x0.c;

/* JADX INFO: renamed from: o.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2147n extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f23404d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2149o f23405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f23406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f23407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.nagakiba.wayvibe.R.attr.autoCompleteTextViewStyle);
        T0.a(context);
        S0.a(this, getContext());
        a aVarQ0 = a.q0(getContext(), attributeSet, f23404d, app.nagakiba.wayvibe.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) aVarQ0.f22980b).hasValue(0)) {
            setDropDownBackgroundDrawable(aVarQ0.h0(0));
        }
        aVarQ0.v0();
        C2149o c2149o = new C2149o(this);
        this.f23405a = c2149o;
        c2149o.d(attributeSet, app.nagakiba.wayvibe.R.attr.autoCompleteTextViewStyle);
        Y y6 = new Y(this);
        this.f23406b = y6;
        y6.f(attributeSet, app.nagakiba.wayvibe.R.attr.autoCompleteTextViewStyle);
        y6.b();
        B b10 = new B(this);
        this.f23407c = b10;
        b10.b(attributeSet, app.nagakiba.wayvibe.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = b10.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2149o c2149o = this.f23405a;
        if (c2149o != null) {
            c2149o.a();
        }
        Y y6 = this.f23406b;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b.h0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2149o c2149o = this.f23405a;
        if (c2149o != null) {
            return c2149o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2149o c2149o = this.f23405a;
        if (c2149o != null) {
            return c2149o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23406b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23406b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        W.a0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f23407c.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2149o c2149o = this.f23405a;
        if (c2149o != null) {
            c2149o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2149o c2149o = this.f23405a;
        if (c2149o != null) {
            c2149o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.f23406b;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.f23406b;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.i0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(c.r(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f23407c.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f23407c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2149o c2149o = this.f23405a;
        if (c2149o != null) {
            c2149o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2149o c2149o = this.f23405a;
        if (c2149o != null) {
            c2149o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y6 = this.f23406b;
        y6.k(colorStateList);
        y6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y6 = this.f23406b;
        y6.l(mode);
        y6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        Y y6 = this.f23406b;
        if (y6 != null) {
            y6.g(context, i10);
        }
    }
}
