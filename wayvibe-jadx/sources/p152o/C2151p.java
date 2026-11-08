package p152o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p046da.b;

/* JADX INFO: renamed from: o.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2151p extends Button {
    private C2164w mAppCompatEmojiTextHelper;
    private final C2149o mBackgroundTintHelper;
    private final Y mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2151p(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        T0.a(context);
        S0.a(this, getContext());
        C2149o c2149o = new C2149o(this);
        this.mBackgroundTintHelper = c2149o;
        c2149o.d(attributeSet, i10);
        Y y6 = new Y(this);
        this.mTextHelper = y6;
        y6.f(attributeSet, i10);
        y6.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private C2164w getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C2164w(this);
        }
        return this.mAppCompatEmojiTextHelper;
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
        return b.h0(super.getCustomSelectionActionModeCallback());
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

    public boolean isEmojiCompatEnabled() {
        return ((b) getEmojiTextViewHelper().f23460b.f13385b).K();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        Y y6 = this.mTextHelper;
        if (y6 != null) {
            y6.f23286a.setAllCaps(z10);
        }
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
}
