package androidx.appcompat.widget;

import K1.F;
import K1.T;
import P3.C0717c;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p046da.b;
import p101j2.g;
import p121l.a;
import p152o.AbstractC2150o0;
import p152o.C2164w;
import p152o.S0;
import p152o.Y;
import p152o.l1;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final C0717c f14526l0 = new C0717c(Float.class, "thumbPos", 7);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int[] f14527m0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f14528A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14529B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f14530C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14531D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14532E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14533F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14534G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f14535H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final TextPaint f14536I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ColorStateList f14537J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public StaticLayout f14538K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public StaticLayout f14539L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final a f14540M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ObjectAnimator f14541N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C2164w f14542O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public g f14543P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Rect f14544Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f14545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f14546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f14547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f14550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f14551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f14552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14554j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f14558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f14559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f14560q;
    public CharSequence r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14562t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f14564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final VelocityTracker f14566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f14567y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f14568z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, app.nagakiba.wayvibe.R.attr.switchStyle);
        this.f14546b = null;
        this.f14547c = null;
        this.f14548d = false;
        this.f14549e = false;
        this.f14551g = null;
        this.f14552h = null;
        this.f14553i = false;
        this.f14554j = false;
        this.f14566x = VelocityTracker.obtain();
        this.f14535H = true;
        this.f14544Q = new Rect();
        S0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f14536I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = p087i.a.f20386v;
        p150n8.a aVarQ0 = p150n8.a.q0(context, attributeSet, iArr, app.nagakiba.wayvibe.R.attr.switchStyle);
        T.h(this, context, iArr, attributeSet, (TypedArray) aVarQ0.f22980b, app.nagakiba.wayvibe.R.attr.switchStyle);
        Drawable drawableH0 = aVarQ0.h0(2);
        this.f14545a = drawableH0;
        if (drawableH0 != null) {
            drawableH0.setCallback(this);
        }
        Drawable drawableH1 = aVarQ0.h0(11);
        this.f14550f = drawableH1;
        if (drawableH1 != null) {
            drawableH1.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) aVarQ0.f22980b;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f14561s = typedArray.getBoolean(3, true);
        this.k = typedArray.getDimensionPixelSize(8, 0);
        this.f14555l = typedArray.getDimensionPixelSize(5, 0);
        this.f14556m = typedArray.getDimensionPixelSize(6, 0);
        this.f14557n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListG0 = aVarQ0.g0(9);
        if (colorStateListG0 != null) {
            this.f14546b = colorStateListG0;
            this.f14548d = true;
        }
        PorterDuff.Mode modeC = AbstractC2150o0.c(typedArray.getInt(10, -1), null);
        if (this.f14547c != modeC) {
            this.f14547c = modeC;
            this.f14549e = true;
        }
        if (this.f14548d || this.f14549e) {
            a();
        }
        ColorStateList colorStateListG1 = aVarQ0.g0(12);
        if (colorStateListG1 != null) {
            this.f14551g = colorStateListG1;
            this.f14553i = true;
        }
        PorterDuff.Mode modeC2 = AbstractC2150o0.c(typedArray.getInt(13, -1), null);
        if (this.f14552h != modeC2) {
            this.f14552h = modeC2;
            this.f14554j = true;
        }
        if (this.f14553i || this.f14554j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, p087i.a.f20387w);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = p254y1.a.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f14537J = colorStateList;
            } else {
                this.f14537J = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i10 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i11 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i10 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i10 != 2) {
                typeface = i10 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i11 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                a aVar = new a();
                aVar.f21875a = context2.getResources().getConfiguration().locale;
                this.f14540M = aVar;
            } else {
                this.f14540M = null;
            }
            setTextOnInternal(this.f14558o);
            setTextOffInternal(this.f14560q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new Y(this).f(attributeSet, app.nagakiba.wayvibe.R.attr.switchStyle);
        aVarQ0.v0();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f14563u = viewConfiguration.getScaledTouchSlop();
        this.f14567y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, app.nagakiba.wayvibe.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C2164w getEmojiTextViewHelper() {
        if (this.f14542O == null) {
            this.f14542O = new C2164w(this);
        }
        return this.f14542O;
    }

    private boolean getTargetCheckedState() {
        return this.f14568z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z10 = l1.f23395a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f14568z : this.f14568z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f14550f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f14544Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f14545a;
        Rect rectB = drawable2 != null ? AbstractC2150o0.b(drawable2) : AbstractC2150o0.f23416c;
        return ((((this.f14528A - this.f14530C) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f14560q = charSequence;
        C2164w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodJ0 = ((b) emojiTextViewHelper.f23460b.f13385b).j0(this.f14540M);
        if (transformationMethodJ0 != null) {
            charSequence = transformationMethodJ0.getTransformation(charSequence, this);
        }
        this.r = charSequence;
        this.f14539L = null;
        if (this.f14561s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f14558o = charSequence;
        C2164w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodJ0 = ((b) emojiTextViewHelper.f23460b.f13385b).j0(this.f14540M);
        if (transformationMethodJ0 != null) {
            charSequence = transformationMethodJ0.getTransformation(charSequence, this);
        }
        this.f14559p = charSequence;
        this.f14538K = null;
        if (this.f14561s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f14545a;
        if (drawable != null) {
            if (this.f14548d || this.f14549e) {
                Drawable drawableMutate = drawable.mutate();
                this.f14545a = drawableMutate;
                if (this.f14548d) {
                    drawableMutate.setTintList(this.f14546b);
                }
                if (this.f14549e) {
                    this.f14545a.setTintMode(this.f14547c);
                }
                if (this.f14545a.isStateful()) {
                    this.f14545a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f14550f;
        if (drawable != null) {
            if (this.f14553i || this.f14554j) {
                Drawable drawableMutate = drawable.mutate();
                this.f14550f = drawableMutate;
                if (this.f14553i) {
                    drawableMutate.setTintList(this.f14551g);
                }
                if (this.f14554j) {
                    this.f14550f.setTintMode(this.f14552h);
                }
                if (this.f14550f.isStateful()) {
                    this.f14550f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f14558o);
        setTextOffInternal(this.f14560q);
        requestLayout();
    }

    public final void d() {
        if (this.f14543P == null && ((b) this.f14542O.f23460b.f13385b).K() && p078h2.g.c()) {
            p078h2.g gVarA = p078h2.g.a();
            int iB = gVarA.b();
            if (iB == 3 || iB == 0) {
                g gVar = new g(this);
                this.f14543P = gVar;
                gVarA.g(gVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.f14531D;
        int i13 = this.f14532E;
        int i14 = this.f14533F;
        int i15 = this.f14534G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f14545a;
        Rect rectB = drawable != null ? AbstractC2150o0.b(drawable) : AbstractC2150o0.f23416c;
        Drawable drawable2 = this.f14550f;
        Rect rect = this.f14544Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectB != null) {
                int i17 = rectB.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectB.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectB.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectB.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f14550f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f14550f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f14545a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f14530C + rect.right;
            this.f14545a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f14545a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f14550f;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14545a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f14550f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z10 = l1.f23395a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f14528A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f14556m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z10 = l1.f23395a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f14528A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f14556m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b.h0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f14561s;
    }

    public boolean getSplitTrack() {
        return this.f14557n;
    }

    public int getSwitchMinWidth() {
        return this.f14555l;
    }

    public int getSwitchPadding() {
        return this.f14556m;
    }

    public CharSequence getTextOff() {
        return this.f14560q;
    }

    public CharSequence getTextOn() {
        return this.f14558o;
    }

    public Drawable getThumbDrawable() {
        return this.f14545a;
    }

    public final float getThumbPosition() {
        return this.f14568z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.f14546b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f14547c;
    }

    public Drawable getTrackDrawable() {
        return this.f14550f;
    }

    public ColorStateList getTrackTintList() {
        return this.f14551g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f14552h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14545a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14550f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f14541N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f14541N.end();
        this.f14541N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14527m0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f14550f;
        Rect rect = this.f14544Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f14532E;
        int i11 = this.f14534G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f14545a;
        if (drawable != null) {
            if (!this.f14557n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = AbstractC2150o0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f14538K : this.f14539L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f14537J;
            TextPaint textPaint = this.f14536I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f14558o : this.f14560q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f14545a != null) {
            Drawable drawable = this.f14550f;
            Rect rect = this.f14544Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC2150o0.b(this.f14545a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z11 = l1.f23395a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f14528A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f14528A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.f14529B;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f14529B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f14529B;
        }
        this.f14531D = paddingLeft;
        this.f14532E = paddingTop;
        this.f14534G = height;
        this.f14533F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f14561s) {
            StaticLayout staticLayout = this.f14538K;
            TextPaint textPaint = this.f14536I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f14559p;
                this.f14538K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f14539L == null) {
                CharSequence charSequence2 = this.r;
                this.f14539L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f14545a;
        Rect rect = this.f14544Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f14545a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f14545a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f14561s) {
            iMax = (this.k * 2) + Math.max(this.f14538K.getWidth(), this.f14539L.getWidth());
        } else {
            iMax = 0;
        }
        this.f14530C = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f14550f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f14550f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f14545a;
        if (drawable3 != null) {
            Rect rectB = AbstractC2150o0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.f14535H ? Math.max(this.f14555l, (this.f14530C * 2) + iMax2 + iMax3) : this.f14555l;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f14528A = iMax4;
        this.f14529B = iMax5;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f14558o : this.f14560q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f10;
        VelocityTracker velocityTracker = this.f14566x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f14563u;
        if (actionMasked != 0) {
            float f11 = 0.0f;
            if (actionMasked == 1) {
                if (this.f14562t == 2) {
                    this.f14562t = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f14567y) {
                            boolean z11 = l1.f23395a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f14562t = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i11 = this.f14562t;
                if (i11 == 1) {
                    float x10 = motionEvent.getX();
                    float y6 = motionEvent.getY();
                    float f12 = i10;
                    if (Math.abs(x10 - this.f14564v) > f12 || Math.abs(y6 - this.f14565w) > f12) {
                        this.f14562t = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f14564v = x10;
                        this.f14565w = y6;
                        return true;
                    }
                } else if (i11 == 2) {
                    float x11 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f13 = x11 - this.f14564v;
                    if (thumbScrollRange != 0) {
                        f10 = f13 / thumbScrollRange;
                    } else {
                        f10 = f13 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z12 = l1.f23395a;
                    if (getLayoutDirection() == 1) {
                        f10 = -f10;
                    }
                    float f14 = this.f14568z;
                    float f15 = f10 + f14;
                    if (f15 >= 0.0f) {
                        f11 = f15 > 1.0f ? 1.0f : f15;
                    }
                    if (f11 != f14) {
                        this.f14564v = x11;
                        setThumbPosition(f11);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f14562t == 2) {
                    this.f14562t = 0;
                    if (motionEvent.getAction() == 1) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f14567y) {
                            boolean z13 = l1.f23395a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f14562t = 0;
                velocityTracker.clear();
            }
        } else {
            float x12 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && this.f14545a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f14545a;
                Rect rect = this.f14544Q;
                drawable.getPadding(rect);
                int i12 = this.f14532E - i10;
                int i13 = (this.f14531D + thumbOffset) - i10;
                int i14 = this.f14530C + i13 + rect.left + rect.right + i10;
                int i15 = this.f14534G + i10;
                if (x12 > i13 && x12 < i14 && y10 > i12 && y10 < i15) {
                    this.f14562t = 1;
                    this.f14564v = x12;
                    this.f14565w = y10;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f14558o;
                if (string == null) {
                    string = getResources().getString(app.nagakiba.wayvibe.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = T.f7251a;
                new F(app.nagakiba.wayvibe.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f14560q;
            if (string2 == null) {
                string2 = getResources().getString(app.nagakiba.wayvibe.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = T.f7251a;
            new F(app.nagakiba.wayvibe.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f14541N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f14526l0, zIsChecked ? 1.0f : 0.0f);
        this.f14541N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f14541N.setAutoCancel(true);
        this.f14541N.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f14558o);
        setTextOffInternal(this.f14560q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f14535H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f14561s != z10) {
            this.f14561s = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f14557n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f14555l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f14556m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f14536I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f14560q;
        if (string == null) {
            string = getResources().getString(app.nagakiba.wayvibe.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = T.f7251a;
        new F(app.nagakiba.wayvibe.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f14558o;
        if (string == null) {
            string = getResources().getString(app.nagakiba.wayvibe.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = T.f7251a;
        new F(app.nagakiba.wayvibe.R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14545a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14545a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f14568z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(c.r(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f14546b = colorStateList;
        this.f14548d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f14547c = mode;
        this.f14549e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f14550f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14550f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(c.r(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f14551g = colorStateList;
        this.f14553i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f14552h = mode;
        this.f14554j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14545a || drawable == this.f14550f;
    }
}
