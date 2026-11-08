package com.google.android.material.floatingactionbutton;

import A6.G;
import B8.C0123j;
import K1.T;
import L3.C0627d;
import P3.p;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.nagakiba.wayvibe.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p061f6.d;
import p116k6.a;
import p128l6.g;
import p139m6.c;
import p139m6.e;
import p139m6.f;
import p152o.C2158t;
import p152o.N0;
import p232w1.b;

/* JADX INFO: loaded from: classes.dex */
@b(Behavior.class)
public class FloatingActionButton extends f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f18191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f18192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f18193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f18194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f18195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18199j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f18200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f18201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final G f18202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0123j f18203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f18204p;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.floatingActionButtonStyle);
        this.f22367a = getVisibility();
        this.f18200l = new Rect();
        this.f18201m = new Rect();
        TypedArray typedArrayB = e.b(context, attributeSet, p051e6.a.f19619d, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f18191b = p046da.b.A(context, typedArrayB, 0);
        d dVarA = null;
        this.f18192c = e.c(typedArrayB.getInt(1, -1), null);
        this.f18195f = p046da.b.A(context, typedArrayB, 10);
        this.f18196g = typedArrayB.getInt(5, -1);
        this.f18197h = typedArrayB.getDimensionPixelSize(4, 0);
        int dimensionPixelSize = typedArrayB.getDimensionPixelSize(2, 0);
        float dimension = typedArrayB.getDimension(3, 0.0f);
        float dimension2 = typedArrayB.getDimension(7, 0.0f);
        float dimension3 = typedArrayB.getDimension(9, 0.0f);
        this.k = typedArrayB.getBoolean(12, false);
        int dimensionPixelSize2 = typedArrayB.getDimensionPixelSize(8, 0);
        this.f18199j = dimensionPixelSize2;
        d dVarA2 = (!typedArrayB.hasValue(11) || (resourceId2 = typedArrayB.getResourceId(11, 0)) == 0) ? null : d.a(context, resourceId2);
        if (typedArrayB.hasValue(6) && (resourceId = typedArrayB.getResourceId(6, 0)) != 0) {
            dVarA = d.a(context, resourceId);
        }
        typedArrayB.recycle();
        G g3 = new G(this);
        this.f18202n = g3;
        g3.o(attributeSet, R.attr.floatingActionButtonStyle);
        this.f18203o = new C0123j(this);
        getImpl().l(this.f18191b, this.f18192c, this.f18195f, dimensionPixelSize);
        p128l6.e impl = getImpl();
        if (impl.f22070l != dimension) {
            impl.f22070l = dimension;
            impl.j(dimension, impl.f22071m, impl.f22072n);
        }
        p128l6.e impl2 = getImpl();
        if (impl2.f22071m != dimension2) {
            impl2.f22071m = dimension2;
            impl2.j(impl2.f22070l, dimension2, impl2.f22072n);
        }
        p128l6.e impl3 = getImpl();
        if (impl3.f22072n != dimension3) {
            impl3.f22072n = dimension3;
            impl3.j(impl3.f22070l, impl3.f22071m, dimension3);
        }
        p128l6.e impl4 = getImpl();
        if (impl4.f22073o != dimensionPixelSize2) {
            impl4.f22073o = dimensionPixelSize2;
            float f10 = impl4.f22074p;
            impl4.f22074p = f10;
            Matrix matrix = impl4.f22079v;
            impl4.a(f10, matrix);
            impl4.f22075q.setImageMatrix(matrix);
        }
        getImpl().f22062c = dVarA2;
        getImpl().f22063d = dVarA;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private p128l6.e getImpl() {
        if (this.f18204p == null) {
            this.f18204p = new g(this, new p012a8.b(this, 17));
        }
        return this.f18204p;
    }

    public final int c(int i10) {
        int i11 = this.f18197h;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        p128l6.e impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f22075q;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f22060a == 1) {
                return;
            }
        } else if (impl.f22060a != 2) {
            return;
        }
        Animator animator = impl.f22061b;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = T.f7251a;
        FloatingActionButton floatingActionButton2 = impl.f22075q;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        d dVar = impl.f22063d;
        if (dVar == null) {
            if (impl.f22065f == null) {
                impl.f22065f = d.a(floatingActionButton.getContext(), R.animator.design_fab_hide_motion_spec);
            }
            dVar = impl.f22065f;
        }
        AnimatorSet animatorSetB = impl.b(dVar, 0.0f, 0.0f, 0.0f);
        animatorSetB.addListener(new C0627d(impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public final void e() {
        PorterDuffColorFilter porterDuffColorFilterE;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f18193d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f18194e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        Drawable drawableMutate = drawable.mutate();
        PorterDuff.Mode mode2 = C2158t.f23437b;
        synchronized (C2158t.class) {
            porterDuffColorFilterE = N0.e(colorForState, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public final void f() {
        int i10 = 2;
        p128l6.e impl = getImpl();
        if (impl.f22075q.getVisibility() != 0) {
            if (impl.f22060a == 2) {
                return;
            }
        } else if (impl.f22060a != 1) {
            return;
        }
        Animator animator = impl.f22061b;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = T.f7251a;
        FloatingActionButton floatingActionButton = impl.f22075q;
        boolean z10 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f22079v;
        if (!z10) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f22074p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(0.0f);
            floatingActionButton.setScaleX(0.0f);
            impl.f22074p = 0.0f;
            impl.a(0.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        d dVar = impl.f22062c;
        if (dVar == null) {
            if (impl.f22064e == null) {
                impl.f22064e = d.a(floatingActionButton.getContext(), R.animator.design_fab_show_motion_spec);
            }
            dVar = impl.f22064e;
        }
        AnimatorSet animatorSetB = impl.b(dVar, 1.0f, 1.0f, 1.0f);
        animatorSetB.addListener(new p(impl, i10));
        animatorSetB.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f18191b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f18192c;
    }

    public float getCompatElevation() {
        return getImpl().d();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f22071m;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f22072n;
    }

    public Drawable getContentBackground() {
        return getImpl().k;
    }

    public int getCustomSize() {
        return this.f18197h;
    }

    public int getExpandedComponentIdHint() {
        return this.f18203o.f823b;
    }

    public d getHideMotionSpec() {
        return getImpl().f22063d;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f18195f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f18195f;
    }

    public d getShowMotionSpec() {
        return getImpl().f22062c;
    }

    public int getSize() {
        return this.f18196g;
    }

    public int getSizeDimension() {
        return c(this.f18196g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f18193d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f18194e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().f();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p128l6.e impl = getImpl();
        impl.getClass();
        if (impl instanceof g) {
            return;
        }
        if (impl.f22080w == null) {
            impl.f22080w = new p128l6.a(impl, 0);
        }
        impl.f22075q.getViewTreeObserver().addOnPreDrawListener(impl.f22080w);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p128l6.e impl = getImpl();
        if (impl.f22080w != null) {
            impl.f22075q.getViewTreeObserver().removeOnPreDrawListener(impl.f22080w);
            impl.f22080w = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f18198i = (sizeDimension - this.f18199j) / 2;
        getImpl().n();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(sizeDimension, size);
        } else if (mode == 0) {
            size = sizeDimension;
        } else if (mode != 1073741824) {
            throw new IllegalArgumentException();
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            sizeDimension = Math.min(sizeDimension, size2);
        } else if (mode2 != 0) {
            if (mode2 != 1073741824) {
                throw new IllegalArgumentException();
            }
            sizeDimension = size2;
        }
        int iMin = Math.min(size, sizeDimension);
        Rect rect = this.f18200l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p187r6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p187r6.a aVar = (p187r6.a) parcelable;
        super.onRestoreInstanceState(aVar.f15716a);
        Bundle bundle = (Bundle) aVar.f25977c.get("expandableWidgetHelper");
        C0123j c0123j = this.f18203o;
        c0123j.getClass();
        c0123j.f824c = bundle.getBoolean("expanded", false);
        c0123j.f823b = bundle.getInt("expandedComponentIdHint", 0);
        if (c0123j.f824c) {
            View view = (View) c0123j.f825d;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p187r6.a aVar = new p187r6.a(super.onSaveInstanceState());
        p199t.G g3 = aVar.f25977c;
        C0123j c0123j = this.f18203o;
        c0123j.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c0123j.f824c);
        bundle.putInt("expandedComponentIdHint", c0123j.f823b);
        g3.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap weakHashMap = T.f7251a;
            if (isLaidOut()) {
                int width = getWidth();
                int height = getHeight();
                Rect rect = this.f18201m;
                rect.set(0, 0, width, height);
                int i10 = rect.left;
                Rect rect2 = this.f18200l;
                rect.left = i10 + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f18191b != colorStateList) {
            this.f18191b = colorStateList;
            p128l6.e impl = getImpl();
            GradientDrawable gradientDrawable = impl.f22067h;
            if (gradientDrawable != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            p139m6.b bVar = impl.f22069j;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.k = colorStateList.getColorForState(bVar.getState(), bVar.k);
                }
                bVar.f22355j = colorStateList;
                bVar.f22356l = true;
                bVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f18192c != mode) {
            this.f18192c = mode;
            GradientDrawable gradientDrawable = getImpl().f22067h;
            if (gradientDrawable != null) {
                gradientDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        p128l6.e impl = getImpl();
        if (impl.f22070l != f10) {
            impl.f22070l = f10;
            impl.j(f10, impl.f22071m, impl.f22072n);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        p128l6.e impl = getImpl();
        if (impl.f22071m != f10) {
            impl.f22071m = f10;
            impl.j(impl.f22070l, f10, impl.f22072n);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        p128l6.e impl = getImpl();
        if (impl.f22072n != f10) {
            impl.f22072n = f10;
            impl.j(impl.f22070l, impl.f22071m, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        this.f18197h = i10;
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f18203o.f823b = i10;
    }

    public void setHideMotionSpec(d dVar) {
        getImpl().f22063d = dVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(d.a(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        p128l6.e impl = getImpl();
        float f10 = impl.f22074p;
        impl.f22074p = f10;
        Matrix matrix = impl.f22079v;
        impl.a(f10, matrix);
        impl.f22075q.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f18202n.t(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setShowMotionSpec(d dVar) {
        getImpl().f22062c = dVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(d.a(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f18197h = 0;
        if (i10 != this.f18196g) {
            this.f18196g = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f18193d != colorStateList) {
            this.f18193d = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f18194e != mode) {
            this.f18194e = mode;
            e();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.k != z10) {
            this.k = z10;
            getImpl().h();
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends p232w1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f18205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18206b;

        public BaseBehavior() {
            this.f18206b = true;
        }

        @Override // p232w1.a
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f18200l;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // p232w1.a
        public final void c(p232w1.d dVar) {
            if (dVar.f27834h == 0) {
                dVar.f27834h = 80;
            }
        }

        @Override // p232w1.a
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof p232w1.d ? ((p232w1.d) layoutParams).f27827a instanceof BottomSheetBehavior : false) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // p232w1.a
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListK = coordinatorLayout.k(floatingActionButton);
            int size = arrayListK.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) arrayListK.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof p232w1.d ? ((p232w1.d) layoutParams).f27827a instanceof BottomSheetBehavior : false) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i10);
            Rect rect = floatingActionButton.f18200l;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                p232w1.d dVar = (p232w1.d) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) dVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) dVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) dVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    WeakHashMap weakHashMap = T.f7251a;
                    floatingActionButton.offsetTopAndBottom(i11);
                }
                if (i13 != 0) {
                    WeakHashMap weakHashMap2 = T.f7251a;
                    floatingActionButton.offsetLeftAndRight(i13);
                }
            }
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f18206b && ((p232w1.d) floatingActionButton.getLayoutParams()).f27832f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f18205a == null) {
                this.f18205a = new Rect();
            }
            Rect rect = this.f18205a;
            ThreadLocal threadLocal = c.f22358a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            ThreadLocal threadLocal2 = c.f22358a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            c.a(coordinatorLayout, appBarLayout, matrix);
            ThreadLocal threadLocal3 = c.f22359b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f18206b && ((p232w1.d) floatingActionButton.getLayoutParams()).f27832f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((p232w1.d) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p051e6.a.f19620e);
            this.f18206b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f18195f != colorStateList) {
            this.f18195f = colorStateList;
            getImpl().m(this.f18195f);
        }
    }
}
