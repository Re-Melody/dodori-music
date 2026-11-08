package androidx.core.widget;

import A.n;
import K1.B;
import K1.C;
import K1.C0605g;
import K1.C0615q;
import K1.C0622y;
import K1.D;
import K1.InterfaceC0614p;
import K1.InterfaceC0616s;
import K1.K;
import K1.T;
import K1.U;
import N1.c;
import N1.e;
import N1.f;
import N1.g;
import N1.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p025b9.a;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0616s, InterfaceC0614p {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final float f14989C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final e f14990D = new e();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f14991E = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f14992A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0605g f14993B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f14996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f14997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f14998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f14999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0622y f15000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15003j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f15005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15009q;
    public final int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f15011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f15012u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15014w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f15015x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C3.e f15016y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0615q f15017z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.nagakiba.wayvibe.R.attr.nestedScrollViewStyle);
        this.f14996c = new Rect();
        this.f15002i = true;
        this.f15003j = false;
        this.k = null;
        this.f15004l = false;
        this.f15007o = true;
        this.f15010s = -1;
        this.f15011t = new int[2];
        this.f15012u = new int[2];
        this.f14993B = new C0605g(getContext(), new n(this));
        int i10 = Build.VERSION.SDK_INT;
        this.f14998e = i10 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f14999f = i10 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f14994a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f14997d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(ETagPayloadStore.WRITE_BUFFER_BYTES);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f15008p = viewConfiguration.getScaledTouchSlop();
        this.f15009q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14991E, app.nagakiba.wayvibe.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f15016y = new C3.e(3);
        this.f15017z = new C0615q(this);
        setNestedScrollingEnabled(true);
        T.i(this, f14990D);
    }

    private C0622y getScrollFeedbackProvider() {
        if (this.f15000g == null) {
            this.f15000g = new C0622y(this);
        }
        return this.f15000g;
    }

    public static boolean n(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && n((View) parent, nestedScrollView);
    }

    @Override // K1.InterfaceC0614p
    public final void a(int i10) {
        this.f15017z.h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // K1.InterfaceC0616s
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        p(iArr, i13, i14);
    }

    public final boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !o(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            u(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f14996c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            u(i(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !o(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int i11;
        int overScrollMode;
        if (this.f14997d.isFinished()) {
            return;
        }
        this.f14997d.computeScrollOffset();
        int currY = this.f14997d.getCurrY();
        int i12 = currY - this.f15014w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f14999f;
        EdgeEffect edgeEffect2 = this.f14998e;
        if (i12 <= 0 || a.A(edgeEffect2) == 0.0f) {
            if (i12 < 0 && a.A(edgeEffect) != 0.0f) {
                float f10 = height;
                iRound = Math.round(a.H(edgeEffect, (i12 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i12) {
                    edgeEffect.finish();
                }
            }
            this.f15014w = currY;
            iArr = this.f15012u;
            iArr[1] = 0;
            j(0, i12, 1, iArr, null);
            i10 = i12 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f14997d.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                r(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i10 - scrollY2;
                iArr[1] = 0;
                i11 = 1;
                this.f15017z.d(0, scrollY2, 0, i13, this.f15011t, 1, iArr);
                i10 = i13 - iArr[1];
            } else {
                i11 = 1;
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i11 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f14997d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f14997d.getCurrVelocity());
                    }
                }
                this.f14997d.abortAnimation();
                a(i11);
            }
            if (this.f14997d.isFinished()) {
                a(i11);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(a.H(edgeEffect2, ((-i12) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i12) {
            edgeEffect2.finish();
        }
        i12 -= iRound;
        this.f15014w = currY;
        iArr = this.f15012u;
        iArr[1] = 0;
        j(0, i12, 1, iArr, null);
        i10 = i12 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            f.a(this, Math.abs(this.f14997d.getCurrVelocity()));
        }
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            r(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i14 = i10 - scrollY4;
            iArr[1] = 0;
            i11 = 1;
            this.f15017z.d(0, scrollY4, 0, i14, this.f15011t, 1, iArr);
            i10 = i14 - iArr[1];
        } else {
            i11 = 1;
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f14997d.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f14997d.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f14997d.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f14997d.getCurrVelocity());
            }
            this.f14997d.abortAnimation();
            a(i11);
        }
        if (this.f14997d.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            a(i11);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // K1.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        p(null, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f15017z.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f15017z.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f15017z.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f15017z.d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f14998e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f14999f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // K1.r
    public final boolean e(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // K1.r
    public final void f(View view, View view2, int i10, int i11) {
        C3.e eVar = this.f15016y;
        if (i11 == 1) {
            eVar.f1190c = i10;
        } else {
            eVar.f1189b = i10;
        }
        x(2, i11);
    }

    @Override // K1.r
    public final void g(View view, int i10) {
        C3.e eVar = this.f15016y;
        if (i10 == 1) {
            eVar.f1190c = 0;
        } else {
            eVar.f1189b = 0;
        }
        a(i10);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C3.e eVar = this.f15016y;
        return eVar.f1190c | eVar.f1189b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f14992A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f14992A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f14992A;
    }

    @Override // K1.r
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        j(i10, i11, i12, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f15017z.f(0);
    }

    public final int i(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f15017z.f7339d;
    }

    public final boolean j(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f15017z.c(i10, i11, i12, iArr, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean k(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f14996c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m(33) : c(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m(130) : c(130);
                    }
                    if (keyCode == 62) {
                        s(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m(33);
                    }
                    if (keyCode == 93) {
                        return m(130);
                    }
                    if (keyCode == 122) {
                        s(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        s(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void l(int i10) {
        if (getChildCount() > 0) {
            this.f14997d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 0);
            x(2, 1);
            this.f15014w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f14997d.getCurrVelocity()));
            }
        }
    }

    public final boolean m(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f14996c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return t(i10, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean o(View view, int i10, int i11) {
        Rect rect = this.f14996c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15003j = false;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        int width;
        int i11;
        int i12;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z10;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f11;
        long j10;
        float f12;
        float fSqrt;
        int i13;
        int i14;
        if (motionEvent.getAction() != 8 || this.f15004l) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i10 = 9;
            f10 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f10 = axisValue2;
            i10 = 26;
        } else {
            f10 = 0.0f;
            i10 = 0;
            width = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        u(-((int) (getVerticalScrollFactorCompat() * f10)), i10, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 != 0) {
            C0605g c0605g = this.f14993B;
            c0605g.getClass();
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i15 = c0605g.f7297f;
            int[] iArr = c0605g.f7299h;
            int i16 = 1;
            if (i15 == source && c0605g.f7298g == deviceId && c0605g.f7296e == i10) {
                z10 = false;
                i11 = 20;
                i12 = 0;
            } else {
                Context context = c0605g.f7292a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                i11 = 20;
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i12 = 0;
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 34) {
                    Method method = U.f7256a;
                    scaledMinimumFlingVelocity = B.h(viewConfiguration, deviceId2, i10, source2);
                } else {
                    Method method2 = U.f7256a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i10, source2) == null) {
                        scaledMinimumFlingVelocity = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i17 >= 34) {
                    scaledMaximumFlingVelocity = B.g(viewConfiguration, deviceId3, i10, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if ((device2 == null || device2.getMotionRange(i10, source3) == null) ? false : true) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0605g.f7297f = source;
                c0605g.f7298g = deviceId;
                c0605g.f7296e = i10;
                z10 = true;
            }
            if (iArr[i12] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker2 = c0605g.f7294c;
                if (velocityTracker2 == null) {
                    return true;
                }
                velocityTracker2.recycle();
                c0605g.f7294c = null;
                return true;
            }
            if (c0605g.f7294c == null) {
                c0605g.f7294c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker3 = c0605g.f7294c;
            Map map = C.f7230a;
            velocityTracker3.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = C.f7230a;
                if (!map2.containsKey(velocityTracker3)) {
                    map2.put(velocityTracker3, new D());
                }
                D d10 = (D) map2.get(velocityTracker3);
                d10.getClass();
                long eventTime = motionEvent.getEventTime();
                int i18 = d10.f7236d;
                long[] jArr = d10.f7234b;
                if (i18 != 0 && eventTime - jArr[d10.f7237e] > 40) {
                    d10.f7236d = i12;
                    d10.f7235c = 0.0f;
                }
                int i19 = (d10.f7237e + 1) % 20;
                d10.f7237e = i19;
                int i20 = d10.f7236d;
                if (i20 != i11) {
                    d10.f7236d = i20 + 1;
                }
                d10.f7233a[i19] = motionEvent.getAxisValue(26);
                jArr[d10.f7237e] = eventTime;
            }
            float f13 = Float.MAX_VALUE;
            velocityTracker3.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, Float.MAX_VALUE);
            D d11 = (D) C.f7230a.get(velocityTracker3);
            if (d11 != null) {
                int i21 = d11.f7236d;
                if (i21 < 2) {
                    velocityTracker = velocityTracker3;
                    f12 = Float.MAX_VALUE;
                    i13 = 1000;
                    fSqrt = 0.0f;
                } else {
                    int i22 = d11.f7237e;
                    int i23 = ((i22 + 20) - (i21 - 1)) % 20;
                    long[] jArr2 = d11.f7234b;
                    long j11 = jArr2[i22];
                    while (true) {
                        j10 = jArr2[i23];
                        if (j11 - j10 <= 100) {
                            break;
                        }
                        d11.f7236d--;
                        i23 = (i23 + 1) % 20;
                    }
                    int i24 = d11.f7236d;
                    if (i24 < 2) {
                        velocityTracker = velocityTracker3;
                        f12 = Float.MAX_VALUE;
                        i13 = 1000;
                        fSqrt = 0.0f;
                    } else {
                        float[] fArr = d11.f7233a;
                        if (i24 == 2) {
                            int i25 = (i23 + 1) % 20;
                            long j12 = jArr2[i25];
                            if (j10 == j12) {
                                velocityTracker = velocityTracker3;
                                f12 = Float.MAX_VALUE;
                                i13 = 1000;
                                fSqrt = 0.0f;
                            } else {
                                velocityTracker = velocityTracker3;
                                f12 = Float.MAX_VALUE;
                                i13 = 1000;
                                fSqrt = fArr[i25] / (j12 - j10);
                            }
                        } else {
                            float f14 = 0.0f;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                if (i26 >= d11.f7236d - 1) {
                                    break;
                                }
                                int i28 = i26 + i23;
                                long j13 = jArr2[i28 % 20];
                                int i29 = (i28 + 1) % 20;
                                if (jArr2[i29] == j13) {
                                    i14 = i16;
                                } else {
                                    i27++;
                                    float fSqrt2 = (f14 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f14) * 2.0f));
                                    float f15 = fArr[i29] / (jArr2[i29] - j13);
                                    float fAbs = (Math.abs(f15) * (f15 - fSqrt2)) + f14;
                                    i14 = i16;
                                    if (i27 == i14) {
                                        fAbs *= 0.5f;
                                    }
                                    f14 = fAbs;
                                }
                                i26 += i14;
                                f13 = f13;
                                i16 = i14;
                                velocityTracker3 = velocityTracker3;
                            }
                            velocityTracker = velocityTracker3;
                            f12 = f13;
                            fSqrt = ((float) Math.sqrt(Math.abs(f14) * 2.0f)) * (f14 < 0.0f ? -1.0f : 1.0f);
                            i13 = PipesIterator.DEFAULT_QUEUE_SIZE;
                        }
                    }
                }
                float f16 = fSqrt * i13;
                d11.f7235c = f16;
                if (f16 < (-Math.abs(f12))) {
                    d11.f7235c = -Math.abs(f12);
                } else if (d11.f7235c > Math.abs(f12)) {
                    d11.f7235c = Math.abs(f12);
                }
            } else {
                velocityTracker = velocityTracker3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = B.d(velocityTracker, i10);
            } else {
                VelocityTracker velocityTracker4 = velocityTracker;
                if (i10 == 0) {
                    yVelocity = velocityTracker4.getXVelocity();
                } else if (i10 == 1) {
                    yVelocity = velocityTracker4.getYVelocity();
                } else {
                    D d12 = (D) C.f7230a.get(velocityTracker4);
                    yVelocity = (d12 == null || i10 != 26) ? 0.0f : d12.f7235c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0605g.f7293b.f85a;
            float f17 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f17);
            if (z10 || (fSignum != Math.signum(c0605g.f7295d) && fSignum != 0.0f)) {
                nestedScrollView.f14997d.abortAnimation();
            }
            if (Math.abs(f17) >= iArr[0]) {
                int i30 = iArr[1];
                float fMax = Math.max(-i30, Math.min(f17, i30));
                if (fMax == 0.0f) {
                    f11 = 0.0f;
                } else {
                    nestedScrollView.f14997d.abortAnimation();
                    nestedScrollView.l((int) fMax);
                    f11 = fMax;
                }
                c0605g.f7295d = f11;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f15004l) {
            return true;
        }
        int i10 = action & ColorExtractionConstants.COLOR_COMPONENT_MASK;
        if (i10 == 0) {
            int y6 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y6 < childAt.getTop() - scrollY || y6 >= childAt.getBottom() - scrollY || x10 < childAt.getLeft() || x10 >= childAt.getRight()) {
                    if (!y(motionEvent) && this.f14997d.isFinished()) {
                        z10 = false;
                    }
                    this.f15004l = z10;
                    velocityTracker = this.f15005m;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f15005m = null;
                    }
                } else {
                    this.f15001h = y6;
                    this.f15010s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f15005m;
                    if (velocityTracker3 == null) {
                        this.f15005m = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f15005m.addMovement(motionEvent);
                    this.f14997d.computeScrollOffset();
                    if (!y(motionEvent) && this.f14997d.isFinished()) {
                        z10 = false;
                    }
                    this.f15004l = z10;
                    x(2, 0);
                }
            } else {
                if (!y(motionEvent)) {
                    z10 = false;
                }
                this.f15004l = z10;
                velocityTracker = this.f15005m;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f15005m = null;
                }
            }
        } else if (i10 == 1) {
            this.f15004l = false;
            this.f15010s = -1;
            velocityTracker2 = this.f15005m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f15005m = null;
            }
            if (this.f14997d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            a(0);
        } else if (i10 == 2) {
            int i11 = this.f15010s;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y10 - this.f15001h) > this.f15008p && (2 & getNestedScrollAxes()) == 0) {
                        this.f15004l = true;
                        this.f15001h = y10;
                        if (this.f15005m == null) {
                            this.f15005m = VelocityTracker.obtain();
                        }
                        this.f15005m.addMovement(motionEvent);
                        this.f15013v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f15004l = false;
            this.f15010s = -1;
            velocityTracker2 = this.f15005m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f15005m = null;
            }
            if (this.f14997d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            a(0);
        } else if (i10 == 6) {
            q(motionEvent);
        }
        return this.f15004l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f15002i = false;
        View view = this.k;
        if (view != null && n(view, this)) {
            View view2 = this.k;
            Rect rect = this.f14996c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int i15 = i(rect);
            if (i15 != 0) {
                scrollBy(0, i15);
            }
        }
        this.k = null;
        if (!this.f15003j) {
            if (this.f15015x != null) {
                scrollTo(getScrollX(), this.f15015x.f8540a);
                this.f15015x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f15003j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f15006n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        l((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f15017z.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        p(null, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && o(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.f15015x = hVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f8540a = getScrollY();
        return hVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !o(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f14996c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int i14 = i(rect);
        if (i14 != 0) {
            if (this.f15007o) {
                w(0, i14, false);
            } else {
                scrollBy(0, i14);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fH;
        int iRound;
        int i10;
        ViewParent parent2;
        if (this.f15005m == null) {
            this.f15005m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15013v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f15013v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f14999f;
            EdgeEffect edgeEffect2 = this.f14998e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f15005m;
                velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, this.r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f15010s);
                if (Math.abs(yVelocity) >= this.f15009q) {
                    if (a.A(edgeEffect2) != 0.0f) {
                        if (v(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            l(-yVelocity);
                        }
                    } else if (a.A(edgeEffect) != 0.0f) {
                        int i11 = -yVelocity;
                        if (v(edgeEffect, i11)) {
                            edgeEffect.onAbsorb(i11);
                        } else {
                            l(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f11 = i12;
                        if (!this.f15017z.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            l(i12);
                        }
                    }
                } else if (this.f14997d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f15010s = -1;
                this.f15004l = false;
                VelocityTracker velocityTracker2 = this.f15005m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f15005m = null;
                }
                a(0);
                this.f14998e.onRelease();
                this.f14999f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f15010s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f15010s + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.f15001h - y6;
                    float x10 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (a.A(edgeEffect2) != 0.0f) {
                        fH = -a.H(edgeEffect2, -height, x10);
                        if (a.A(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else if (a.A(edgeEffect) != 0.0f) {
                        fH = a.H(edgeEffect, height, 1.0f - x10);
                        if (a.A(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        iRound = Math.round(f10 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i10 = i13 - iRound;
                        if (!this.f15004l && Math.abs(i10) > this.f15008p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f15004l = true;
                            if (i10 > 0) {
                                i10 -= this.f15008p;
                            } else {
                                i10 += this.f15008p;
                            }
                        }
                        if (this.f15004l) {
                            int iU = u(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f15001h = y6 - iU;
                            this.f15013v += iU;
                        }
                    }
                    f10 = fH;
                    iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i10 = i13 - iRound;
                    if (!this.f15004l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f15004l = true;
                        if (i10 > 0) {
                            i10 -= this.f15008p;
                        } else {
                            i10 += this.f15008p;
                        }
                    }
                    if (this.f15004l) {
                        int iU2 = u(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f15001h = y6 - iU2;
                        this.f15013v += iU2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f15004l && getChildCount() > 0 && this.f14997d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f15010s = -1;
                this.f15004l = false;
                VelocityTracker velocityTracker3 = this.f15005m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f15005m = null;
                }
                a(0);
                this.f14998e.onRelease();
                this.f14999f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f15001h = (int) motionEvent.getY(actionIndex);
                this.f15010s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
                this.f15001h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f15010s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f15004l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f14997d.isFinished()) {
                this.f14997d.abortAnimation();
                a(1);
            }
            int y10 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f15001h = y10;
            this.f15010s = pointerId;
            x(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f15005m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int[] iArr, int i10, int i11) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f15017z.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f15010s) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f15001h = (int) motionEvent.getY(i10);
            this.f15010s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f15005m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean r(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i16 <= i13) {
            if (i16 < 0) {
                i15 = 0;
            } else {
                i15 = i16;
                z11 = false;
            }
            if (z11 && !this.f15017z.f(1)) {
                this.f14997d.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i14, i15);
            return !z10 || z11;
        }
        i15 = i13;
        z11 = true;
        if (z11) {
            this.f14997d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f15002i) {
            this.k = view2;
        } else {
            Rect rect = this.f14996c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int i10 = i(rect);
            if (i10 != 0) {
                scrollBy(0, i10);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int i10 = i(rect);
        boolean z11 = i10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, i10);
                return z11;
            }
            w(0, i10, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f15005m) != null) {
            velocityTracker.recycle();
            this.f15005m = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f15002i = true;
        super.requestLayout();
    }

    public final void s(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f14996c;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        t(i10, i11, i12);
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f15006n) {
            this.f15006n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C0615q c0615q = this.f15017z;
        if (c0615q.f7339d) {
            WeakHashMap weakHashMap = T.f7251a;
            K.n(c0615q.f7338c);
        }
        c0615q.f7339d = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f15007o = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f15017z.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        a(0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean t(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            u(z11 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    public final int u(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            x(2, i13);
        }
        boolean zC = this.f15017z.c(0, i10, i13, this.f15012u, this.f15011t);
        int[] iArr = this.f15012u;
        int[] iArr2 = this.f15011t;
        if (zC) {
            i14 = i10 - iArr[1];
            i15 = iArr2[1];
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z13 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z14 = r(i14, 0, scrollY, scrollRange) && !this.f15017z.f(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f7351a.l(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr[1] = 0;
        this.f15017z.d(0, scrollY2, 0, i14 - scrollY2, this.f15011t, i13, iArr);
        int i16 = i15 + iArr2[1];
        int i17 = i14 - iArr[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.f14999f;
        EdgeEffect edgeEffect2 = this.f14998e;
        if (i18 >= 0) {
            if (i18 > scrollRange && z13) {
                a.H(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
                if (motionEvent != null) {
                    z11 = false;
                    getScrollFeedbackProvider().f7351a.a(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
                } else {
                    z11 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z12 = z11;
            } else {
                z12 = z14;
            }
            if (z12 && i13 == 0 && (velocityTracker = this.f15005m) != null) {
                velocityTracker.clear();
            }
            if (i13 == 1) {
                a(i13);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i16;
        }
        if (z13) {
            a.H(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f7351a.a(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z11 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z12 = z11;
        } else {
            postInvalidateOnAnimation();
            z12 = z11;
        }
        if (z12) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            a(i13);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i16;
    }

    public final boolean v(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fA = a.A(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f14994a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = f14989C;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fA;
    }

    public final void w(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f14995b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f14997d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z10) {
                x(2, 1);
            } else {
                a(1);
            }
            this.f15014w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f14997d.isFinished()) {
                this.f14997d.abortAnimation();
                a(1);
            }
            scrollBy(i10, i11);
        }
        this.f14995b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void x(int i10, int i11) {
        this.f15017z.g(2, i11);
    }

    public final boolean y(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f14998e;
        if (a.A(edgeEffect) != 0.0f) {
            a.H(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f14999f;
        if (a.A(edgeEffect2) == 0.0f) {
            return z10;
        }
        a.H(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
