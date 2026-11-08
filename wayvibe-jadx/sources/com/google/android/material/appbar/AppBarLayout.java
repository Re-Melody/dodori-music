package com.google.android.material.appbar;

import B2.n;
import K1.InterfaceC0614p;
import K1.K;
import K1.T;
import K1.z0;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.nagakiba.wayvibe.R;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.tika.pipes.PipesConfigBase;
import p139m6.e;
import p199t.G;
import p232w1.d;

/* JADX INFO: loaded from: classes.dex */
@p232w1.b(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f18142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f18146j;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends p072g6.c {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p232w1.a
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // p232w1.a
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            p232w1.a aVar = ((d) view2.getLayoutParams()).f27827a;
            if (aVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) aVar).f18147j) + this.f20127e) - u(view2);
                WeakHashMap weakHashMap = T.f7251a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f18145i) {
                    boolean z10 = view.getScrollY() > 0;
                    if (appBarLayout.f18144h != z10) {
                        appBarLayout.f18144h = z10;
                        appBarLayout.refreshDrawableState();
                    }
                }
            }
            return false;
        }

        @Override // p232w1.a
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutV = v(coordinatorLayout.k(view));
            if (appBarLayoutV != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f20125c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayoutV.c(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p051e6.a.f19623h);
            this.f20128f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18137a = -1;
        this.f18138b = -1;
        this.f18139c = -1;
        this.f18141e = 0;
        setOrientation(1);
        int i10 = Build.VERSION.SDK_INT;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context2 = getContext();
        TypedArray typedArrayB = e.b(context2, attributeSet, p072g6.e.f20131a, 0, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayB.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, typedArrayB.getResourceId(0, 0)));
            }
            typedArrayB.recycle();
            TypedArray typedArrayB2 = e.b(context, attributeSet, p051e6.a.f19616a, 0, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayB2.getDrawable(0);
            WeakHashMap weakHashMap = T.f7251a;
            setBackground(drawable);
            if (typedArrayB2.hasValue(4)) {
                c(typedArrayB2.getBoolean(4, false), false, false);
            }
            if (typedArrayB2.hasValue(3)) {
                p072g6.e.a(this, typedArrayB2.getDimensionPixelSize(3, 0));
            }
            if (i10 >= 26) {
                if (typedArrayB2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayB2.getBoolean(2, false));
                }
                if (typedArrayB2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayB2.getBoolean(1, false));
                }
            }
            this.f18145i = typedArrayB2.getBoolean(5, false);
            typedArrayB2.recycle();
            K.l(this, new p012a8.b(this, 9));
        } catch (Throwable th) {
            typedArrayB.recycle();
            throw th;
        }
    }

    public static p072g6.a b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            p072g6.a aVar = new p072g6.a((LinearLayout.LayoutParams) layoutParams);
            aVar.f20116a = 1;
            return aVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            p072g6.a aVar2 = new p072g6.a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar2.f20116a = 1;
            return aVar2;
        }
        p072g6.a aVar3 = new p072g6.a(layoutParams);
        aVar3.f20116a = 1;
        return aVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p072g6.a generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p072g6.a aVar = new p072g6.a(context, attributeSet);
        aVar.f20116a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p051e6.a.f19617b);
        aVar.f20116a = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            aVar.f20117b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        this.f18141e = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p072g6.a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p072g6.a aVar = new p072g6.a(-1, -2);
        aVar.f20116a = 1;
        return aVar;
    }

    public int getDownNestedPreScrollRange() {
        int topInset;
        int i10 = this.f18138b;
        if (i10 != -1) {
            return i10;
        }
        int minimumHeight = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            p072g6.a aVar = (p072g6.a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i11 = aVar.f20116a;
            if ((i11 & 5) != 5) {
                if (minimumHeight > 0) {
                    break;
                }
            } else {
                int i12 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + minimumHeight;
                if ((i11 & 8) != 0) {
                    WeakHashMap weakHashMap = T.f7251a;
                    minimumHeight = childAt.getMinimumHeight() + i12;
                } else {
                    if ((i11 & 2) != 0) {
                        WeakHashMap weakHashMap2 = T.f7251a;
                        topInset = childAt.getMinimumHeight();
                    } else {
                        topInset = getTopInset();
                    }
                    minimumHeight = (measuredHeight - topInset) + i12;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f18138b = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f18139c;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int topInset = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            p072g6.a aVar = (p072g6.a) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + childAt.getMeasuredHeight();
            int i12 = aVar.f20116a;
            if ((i12 & 1) == 0) {
                break;
            }
            topInset += measuredHeight;
            if ((i12 & 2) != 0) {
                WeakHashMap weakHashMap = T.f7251a;
                topInset -= getTopInset() + childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, topInset);
        this.f18139c = iMax;
        return iMax;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = T.f7251a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f18141e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        z0 z0Var = this.f18142f;
        if (z0Var != null) {
            return z0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f18137a;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            p072g6.a aVar = (p072g6.a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = aVar.f20116a;
            if ((i12 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            if ((i12 & 2) != 0) {
                WeakHashMap weakHashMap = T.f7251a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
        }
        int iMax = Math.max(0, minimumHeight - getTopInset());
        this.f18137a = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f18146j == null) {
            this.f18146j = new int[4];
        }
        int[] iArr = this.f18146j;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f18143g;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969200;
        iArr[1] = (z10 && this.f18144h) ? R.attr.state_lifted : -2130969201;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969199;
        iArr[3] = (z10 && this.f18144h) ? R.attr.state_collapsed : -2130969198;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f18137a = -1;
        this.f18138b = -1;
        this.f18139c = -1;
        boolean z11 = false;
        this.f18140d = false;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (((p072g6.a) getChildAt(i14).getLayoutParams()).f20117b != null) {
                this.f18140d = true;
                break;
            }
        }
        if (this.f18145i) {
            z11 = true;
            break;
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            int i16 = ((p072g6.a) getChildAt(i15).getLayoutParams()).f20116a;
            if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                z11 = true;
                break;
            }
        }
        if (this.f18143g != z11) {
            this.f18143g = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f18137a = -1;
        this.f18138b = -1;
        this.f18139c = -1;
    }

    public void setExpanded(boolean z10) {
        WeakHashMap weakHashMap = T.f7251a;
        c(z10, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f18145i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        p072g6.e.a(this, f10);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends p072g6.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f18147j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ValueAnimator f18148l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f18149m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f18150n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f18151o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public WeakReference f18152p;

        public BaseBehavior() {
            this.f20121f = -1;
            this.f20123h = -1;
            this.f18149m = -1;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005d  */
        public static void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View view;
            View childAt;
            boolean z11;
            boolean z12;
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            while (true) {
                view = null;
                if (i12 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (childAt != null) {
                int i13 = ((p072g6.a) childAt.getLayoutParams()).f20116a;
                if ((i13 & 1) != 0) {
                    WeakHashMap weakHashMap = T.f7251a;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i11 <= 0 || (i13 & 12) == 0 ? (i13 & 2) == 0 || (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
                if (appBarLayout.f18145i) {
                    int childCount2 = coordinatorLayout.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        View childAt2 = coordinatorLayout.getChildAt(i14);
                        if (childAt2 instanceof InterfaceC0614p) {
                            view = childAt2;
                            break;
                        }
                    }
                    if (view != null) {
                        z11 = view.getScrollY() > 0;
                    }
                }
                if (appBarLayout.f18144h != z11) {
                    appBarLayout.f18144h = z11;
                    appBarLayout.refreshDrawableState();
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z10) {
                    if (z12) {
                        List list = (List) ((G) coordinatorLayout.f14871b.f22465b).get(appBarLayout);
                        ArrayList arrayList = coordinatorLayout.f14873d;
                        arrayList.clear();
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            p232w1.a aVar = ((d) ((View) arrayList.get(i15)).getLayoutParams()).f27827a;
                            if (aVar instanceof ScrollingViewBehavior) {
                                if (((ScrollingViewBehavior) aVar).f20128f == 0) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0095  */
        /* JADX WARN: Code duplicated, block: B:34:0x0099  */
        /* JADX WARN: Code duplicated, block: B:35:0x009f  */
        @Override // p072g6.d, p232w1.a
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            int i11;
            int iG;
            n nVar;
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.f(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            int i12 = this.f18149m;
            if (i12 < 0 || (pendingAction & 8) != 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i13 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            x(coordinatorLayout2, appBarLayout, i13);
                        } else {
                            baseBehavior.w(coordinatorLayout2, appBarLayout, i13, MediaPlayerException.ERROR_UNKNOWN, f.API_PRIORITY_OTHER);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            x(coordinatorLayout2, appBarLayout, 0);
                        } else {
                            i11 = 0;
                            baseBehavior.w(coordinatorLayout2, appBarLayout, 0, MediaPlayerException.ERROR_UNKNOWN, f.API_PRIORITY_OTHER);
                        }
                    }
                }
                appBarLayout.f18141e = i11;
                baseBehavior.f18149m = -1;
                iG = p242x0.c.g(s(), -appBarLayout.getTotalScrollRange(), i11);
                nVar = baseBehavior.f20129a;
                if (nVar != null) {
                    baseBehavior.f20130b = iG;
                } else if (nVar.f612d != iG) {
                    nVar.f612d = iG;
                    nVar.u0();
                }
                A(coordinatorLayout2, appBarLayout, s(), 0, true);
                s();
                return true;
            }
            View childAt = appBarLayout.getChildAt(i12);
            int i14 = -childAt.getBottom();
            if (this.f18150n) {
                WeakHashMap weakHashMap = T.f7251a;
                iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i14;
            } else {
                iRound = Math.round(childAt.getHeight() * this.f18151o) + i14;
            }
            int i15 = iRound;
            baseBehavior = this;
            coordinatorLayout2 = coordinatorLayout;
            baseBehavior.w(coordinatorLayout2, appBarLayout, i15, MediaPlayerException.ERROR_UNKNOWN, f.API_PRIORITY_OTHER);
            i11 = 0;
            appBarLayout.f18141e = i11;
            baseBehavior.f18149m = -1;
            iG = p242x0.c.g(s(), -appBarLayout.getTotalScrollRange(), i11);
            nVar = baseBehavior.f20129a;
            if (nVar != null) {
                baseBehavior.f20130b = iG;
            } else if (nVar.f612d != iG) {
                nVar.f612d = iG;
                nVar.u0();
            }
            A(coordinatorLayout2, appBarLayout, s(), 0, true);
            s();
            return true;
        }

        @Override // p232w1.a
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((d) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // p232w1.a
        public final void i(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int[] iArr, int i11) {
            int i12;
            int downNestedPreScrollRange;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i10 != 0) {
                if (i10 < 0) {
                    i12 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i13 = i12;
                int i14 = downNestedPreScrollRange;
                if (i13 != i14) {
                    iArr[1] = w(coordinatorLayout, appBarLayout, v() - i10, i13, i14);
                    z(i10, appBarLayout, view2, i11);
                }
            }
        }

        @Override // p232w1.a
        public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i13 < 0) {
                w(coordinatorLayout, appBarLayout, v() - i13, -appBarLayout.getDownNestedScrollRange(), 0);
                z(i13, appBarLayout, view2, i14);
            }
            if (appBarLayout.f18145i) {
                boolean z10 = view2.getScrollY() > 0;
                if (appBarLayout.f18144h != z10) {
                    appBarLayout.f18144h = z10;
                    appBarLayout.refreshDrawableState();
                }
            }
        }

        @Override // p232w1.a
        public final void m(View view, Parcelable parcelable) {
            if (!(parcelable instanceof c)) {
                this.f18149m = -1;
                return;
            }
            c cVar = (c) parcelable;
            this.f18149m = cVar.f18156c;
            this.f18151o = cVar.f18157d;
            this.f18150n = cVar.f18158e;
        }

        @Override // p232w1.a
        public final Parcelable n(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    c cVar = new c(absSavedState);
                    cVar.f18156c = i10;
                    WeakHashMap weakHashMap = T.f7251a;
                    cVar.f18158e = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    cVar.f18157d = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return absSavedState;
        }

        @Override // p232w1.a
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.f18145i || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z10 && (valueAnimator = this.f18148l) != null) {
                valueAnimator.cancel();
            }
            this.f18152p = null;
            this.k = i11;
            return z10;
        }

        @Override // p232w1.a
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i10 == 1) {
                y(coordinatorLayout, appBarLayout);
            }
            this.f18152p = new WeakReference(view2);
        }

        @Override // p072g6.b
        public final boolean u(View view) {
            WeakReference weakReference = this.f18152p;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // p072g6.b
        public final int v() {
            return s() + this.f18147j;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
        @Override // p072g6.b
        public final int w(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int top;
            boolean z10;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iV = v();
            if (i11 == 0 || iV < i11 || iV > i12) {
                this.f18147j = 0;
                return 0;
            }
            int iG = p242x0.c.g(i10, i11, i12);
            if (iV == iG) {
                return 0;
            }
            if (!appBarLayout.f18140d) {
                top = iG;
                break;
            }
            int iAbs = Math.abs(iG);
            int childCount = appBarLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount) {
                    View childAt = appBarLayout.getChildAt(i13);
                    p072g6.a aVar = (p072g6.a) childAt.getLayoutParams();
                    Interpolator interpolator = aVar.f20117b;
                    if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                        if (interpolator != null) {
                            int i14 = aVar.f20116a;
                            if ((i14 & 1) != 0) {
                                topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if ((i14 & 2) != 0) {
                                    WeakHashMap weakHashMap = T.f7251a;
                                    topInset -= childAt.getMinimumHeight();
                                }
                            } else {
                                topInset = 0;
                            }
                            WeakHashMap weakHashMap2 = T.f7251a;
                            if (childAt.getFitsSystemWindows()) {
                                topInset -= appBarLayout.getTopInset();
                            }
                            if (topInset > 0) {
                                float f10 = topInset;
                                top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f10) * f10)) * Integer.signum(iG);
                                break;
                            }
                        }
                    } else {
                        i13++;
                    }
                }
                top = iG;
                break;
            }
            n nVar = this.f20129a;
            if (nVar != null) {
                if (nVar.f612d != top) {
                    nVar.f612d = top;
                    nVar.u0();
                    z10 = true;
                }
                int i15 = iV - iG;
                this.f18147j = iG - top;
                if (!z10 && appBarLayout.f18140d) {
                    coordinatorLayout.i(appBarLayout);
                }
                s();
                A(coordinatorLayout, appBarLayout, iG, iG < iV ? -1 : 1, false);
                return i15;
            }
            this.f20130b = top;
            z10 = false;
            int i16 = iV - iG;
            this.f18147j = iG - top;
            if (!z10) {
                coordinatorLayout.i(appBarLayout);
            }
            s();
            A(coordinatorLayout, appBarLayout, iG, iG < iV ? -1 : 1, false);
            return i16;
        }

        public final void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(v() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iV = v();
            if (iV == i10) {
                ValueAnimator valueAnimator = this.f18148l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f18148l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f18148l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f18148l = valueAnimator3;
                valueAnimator3.setInterpolator(p061f6.a.f19835d);
                this.f18148l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f18148l.setDuration(Math.min(iRound, PipesConfigBase.DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS));
            this.f18148l.setIntValues(iV, i10);
            this.f18148l.start();
        }

        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iV = v();
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                p072g6.a aVar = (p072g6.a) childAt.getLayoutParams();
                if ((aVar.f20116a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) aVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) aVar).bottomMargin;
                }
                int i11 = -iV;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                p072g6.a aVar2 = (p072g6.a) childAt2.getLayoutParams();
                int i12 = aVar2.f20116a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i10 == appBarLayout.getChildCount() - 1) {
                        minimumHeight += appBarLayout.getTopInset();
                    }
                    if ((i12 & 2) == 2) {
                        WeakHashMap weakHashMap = T.f7251a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i12 & 5) == 5) {
                        WeakHashMap weakHashMap2 = T.f7251a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iV < minimumHeight2) {
                            i13 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        i13 += ((LinearLayout.LayoutParams) aVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    }
                    if (iV < (minimumHeight + i13) / 2) {
                        i13 = minimumHeight;
                    }
                    x(coordinatorLayout, appBarLayout, p242x0.c.g(i13, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void z(int i10, AppBarLayout appBarLayout, View view, int i11) {
            if (i11 == 1) {
                int iV = v();
                if ((i10 >= 0 || iV != 0) && (i10 <= 0 || iV != (-appBarLayout.getDownNestedScrollRange()))) {
                    return;
                }
                WeakHashMap weakHashMap = T.f7251a;
                if (view instanceof InterfaceC0614p) {
                    ((InterfaceC0614p) view).a(1);
                }
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f20121f = -1;
            this.f20123h = -1;
            this.f18149m = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        p072g6.a aVar = new p072g6.a(-1, -2);
        aVar.f20116a = 1;
        return aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
