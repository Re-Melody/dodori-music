package p152o;

import B1.h;
import D7.W;
import I1.a;
import I1.b;
import K1.B;
import M1.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p242x0.c;

/* JADX INFO: renamed from: o.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2126c0 extends TextView {
    private final C2149o mBackgroundTintHelper;
    private C2164w mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<b> mPrecomputedTextFuture;
    private Z mSuperCaller;
    private final T mTextClassifierHelper;
    private final Y mTextHelper;

    public C2126c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C2164w getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C2164w(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public final void d() {
        Future<b> future = this.mPrecomputedTextFuture;
        if (future == null) {
            return;
        }
        try {
            this.mPrecomputedTextFuture = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            p046da.b.I(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2149o c2149o = this.mBackgroundTintHelper;
        if (c2149o != null) {
            c2149o.a();
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l1.f23397c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            return Math.round(y6.f23294i.f23350e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l1.f23397c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            return Math.round(y6.f23294i.f23349d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l1.f23397c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            return Math.round(y6.f23294i.f23348c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l1.f23397c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y6 = this.mTextHelper;
        return y6 != null ? y6.f23294i.f23351f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (l1.f23397c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            return y6.f23294i.f23346a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p046da.b.h0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Z getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new C2124b0(this);
            } else if (i10 >= 28) {
                this.mSuperCaller = new C2122a0(this);
            } else if (i10 >= 26) {
                this.mSuperCaller = new p012a8.b(this, 28);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2149o c2149o = this.mBackgroundTintHelper;
        if (c2149o != null) {
            return c2149o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2149o c2149o = this.mBackgroundTintHelper;
        if (c2149o != null) {
            return c2149o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        T t10;
        if (Build.VERSION.SDK_INT >= 28 || (t10 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = t10.f23275b;
        return textClassifier == null ? S.a(t10.f23274a) : textClassifier;
    }

    public a getTextMetricsParamsCompat() {
        return p046da.b.I(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((p046da.b) getEmojiTextViewHelper().f23460b.f13385b).K();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            d.b(editorInfo, getText());
        }
        W.a0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Y y6 = this.mTextHelper;
        if (y6 == null || l1.f23397c) {
            return;
        }
        y6.f23294i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        d();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        Y y6 = this.mTextHelper;
        if (y6 == null || l1.f23397c || !y6.f23294i.f()) {
            return;
        }
        this.mTextHelper.f23294i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (l1.f23397c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (l1.f23397c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (l1.f23397c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2149o c2149o = this.mBackgroundTintHelper;
        if (c2149o != null) {
            c2149o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2149o c2149o = this.mBackgroundTintHelper;
        if (c2149o != null) {
            c2149o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p046da.b.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().u(i10);
        } else {
            p046da.b.Y(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m(i10);
        } else {
            p046da.b.Z(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        p046da.b.a0(this, i10);
    }

    public void setPrecomputedText(b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        p046da.b.I(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2149o c2149o = this.mBackgroundTintHelper;
        if (c2149o != null) {
            c2149o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2149o c2149o = this.mBackgroundTintHelper;
        if (c2149o != null) {
            c2149o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        T t10;
        if (Build.VERSION.SDK_INT >= 28 || (t10 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            t10.f23275b = textClassifier;
        }
    }

    public void setTextFuture(Future<b> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f6258b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(aVar.f6257a);
        setBreakStrategy(aVar.f6259c);
        setHyphenationFrequency(aVar.f6260d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        boolean z10 = l1.f23397c;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        Y y6 = this.mTextHelper;
        if (y6 == null || z10) {
            return;
        }
        C2136h0 c2136h0 = y6.f23294i;
        if (c2136h0.f()) {
            return;
        }
        c2136h0.g(f10, i10);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            p046da.b bVar = h.f538a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2126c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        T0.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        S0.a(this, getContext());
        C2149o c2149o = new C2149o(this);
        this.mBackgroundTintHelper = c2149o;
        c2149o.d(attributeSet, i10);
        Y y6 = new Y(this);
        this.mTextHelper = y6;
        y6.f(attributeSet, i10);
        y6.b();
        T t10 = new T();
        t10.f23274a = this;
        this.mTextClassifierHelper = t10;
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().y(i10, f10);
        } else if (i11 >= 34) {
            B.j(this, i10, f10);
        } else {
            p046da.b.a0(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? c.r(context, i10) : null, i11 != 0 ? c.r(context, i11) : null, i12 != 0 ? c.r(context, i12) : null, i13 != 0 ? c.r(context, i13) : null);
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? c.r(context, i10) : null, i11 != 0 ? c.r(context, i11) : null, i12 != 0 ? c.r(context, i12) : null, i13 != 0 ? c.r(context, i13) : null);
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.b();
        }
    }
}
