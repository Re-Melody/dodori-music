package p152o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p087i.a;
import p132m.d;
import p142n.ViewTreeObserverOnGlobalLayoutListenerC2073d;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f23258i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2149o f23259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f23260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H f23261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f23262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P f23264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f23266h;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public Q(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, app.nagakiba.wayvibe.R.attr.spinnerStyle);
        this.f23266h = new Rect();
        S0.a(this, getContext());
        int[] iArr = a.f20385u;
        p150n8.a aVarQ0 = p150n8.a.q0(context, attributeSet, iArr, app.nagakiba.wayvibe.R.attr.spinnerStyle);
        this.f23259a = new C2149o(this);
        TypedArray typedArray = (TypedArray) aVarQ0.f22980b;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f23260b = new d(context, resourceId);
        } else {
            this.f23260b = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23258i, app.nagakiba.wayvibe.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Throwable th) {
                    th = th;
                    typedArray2 = typedArrayObtainStyledAttributes;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i10 != 0) {
                    J j10 = new J(this);
                    this.f23264f = j10;
                    j10.f23223c = typedArray.getString(2);
                } else if (i10 == 1) {
                    N n6 = new N(this, this.f23260b, attributeSet);
                    p150n8.a aVarQ1 = p150n8.a.q0(this.f23260b, attributeSet, iArr, app.nagakiba.wayvibe.R.attr.spinnerStyle);
                    this.f23265g = ((TypedArray) aVarQ1.f22980b).getLayoutDimension(3, -2);
                    n6.i(aVarQ1.h0(1));
                    n6.f23236B = typedArray.getString(2);
                    aVarQ1.v0();
                    this.f23264f = n6;
                    this.f23261c = new H(this, this, n6);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(app.nagakiba.wayvibe.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                aVarQ0.v0();
                this.f23263e = true;
                spinnerAdapter = this.f23262d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f23262d = null;
                }
                this.f23259a.d(attributeSet, app.nagakiba.wayvibe.R.attr.spinnerStyle);
            }
        } catch (Exception e4) {
            e = e4;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0) {
            J j11 = new J(this);
            this.f23264f = j11;
            j11.f23223c = typedArray.getString(2);
        } else if (i10 == 1) {
            N n10 = new N(this, this.f23260b, attributeSet);
            p150n8.a aVarQ2 = p150n8.a.q0(this.f23260b, attributeSet, iArr, app.nagakiba.wayvibe.R.attr.spinnerStyle);
            this.f23265g = ((TypedArray) aVarQ2.f22980b).getLayoutDimension(3, -2);
            n10.i(aVarQ2.h0(1));
            n10.f23236B = typedArray.getString(2);
            aVarQ2.v0();
            this.f23264f = n10;
            this.f23261c = new H(this, this, n10);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(app.nagakiba.wayvibe.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        aVarQ0.v0();
        this.f23263e = true;
        spinnerAdapter = this.f23262d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f23262d = null;
        }
        this.f23259a.d(attributeSet, app.nagakiba.wayvibe.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f23266h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2149o c2149o = this.f23259a;
        if (c2149o != null) {
            c2149o.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        P p10 = this.f23264f;
        return p10 != null ? p10.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        P p10 = this.f23264f;
        return p10 != null ? p10.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f23264f != null ? this.f23265g : super.getDropDownWidth();
    }

    public final P getInternalPopup() {
        return this.f23264f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        P p10 = this.f23264f;
        return p10 != null ? p10.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f23260b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        P p10 = this.f23264f;
        return p10 != null ? p10.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2149o c2149o = this.f23259a;
        if (c2149o != null) {
            return c2149o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2149o c2149o = this.f23259a;
        if (c2149o != null) {
            return c2149o.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P p10 = this.f23264f;
        if (p10 == null || !p10.b()) {
            return;
        }
        p10.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f23264f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        O o10 = (O) parcelable;
        super.onRestoreInstanceState(o10.getSuperState());
        if (!o10.f23249a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2073d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        O o10 = new O(super.onSaveInstanceState());
        P p10 = this.f23264f;
        o10.f23249a = p10 != null && p10.b();
        return o10;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        H h10 = this.f23261c;
        if (h10 == null || !h10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        P p10 = this.f23264f;
        if (p10 == null) {
            return super.performClick();
        }
        if (p10.b()) {
            return true;
        }
        this.f23264f.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2149o c2149o = this.f23259a;
        if (c2149o != null) {
            c2149o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2149o c2149o = this.f23259a;
        if (c2149o != null) {
            c2149o.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        P p10 = this.f23264f;
        if (p10 == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            p10.k(i10);
            p10.c(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        P p10 = this.f23264f;
        if (p10 != null) {
            p10.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f23264f != null) {
            this.f23265g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        P p10 = this.f23264f;
        if (p10 != null) {
            p10.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(c.r(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        P p10 = this.f23264f;
        if (p10 != null) {
            p10.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2149o c2149o = this.f23259a;
        if (c2149o != null) {
            c2149o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2149o c2149o = this.f23259a;
        if (c2149o != null) {
            c2149o.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f23263e) {
            this.f23262d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        P p10 = this.f23264f;
        if (p10 != null) {
            Context context = this.f23260b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            K k = new K();
            k.f23225a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                k.f23226b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            p10.o(k);
        }
    }
}
