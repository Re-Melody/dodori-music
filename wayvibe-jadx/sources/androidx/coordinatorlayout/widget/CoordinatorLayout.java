package androidx.coordinatorlayout.widget;

import F9.n;
import J1.d;
import K1.I;
import K1.K;
import K1.T;
import K1.r;
import K1.z0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import oa.e;
import p128l6.a;
import p140m7.C2061m;
import p199t.G;
import p232w1.b;
import p232w1.c;
import p232w1.f;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f14865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Class[] f14866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ThreadLocal f14867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f14868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f14869w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2061m f14871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f14874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f14877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f14878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f14879j;
    public a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z0 f14881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f14883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f14884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f14885q;
    public final C3.e r;

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f14865s = r10 != null ? r10.getName() : null;
        f14868v = new n(6);
        f14866t = new Class[]{Context.class, AttributeSet.class};
        f14867u = new ThreadLocal();
        f14869w = new d();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f14870a = new ArrayList();
        this.f14871b = new C2061m(11);
        this.f14872c = new ArrayList();
        this.f14873d = new ArrayList();
        this.f14874e = new int[2];
        this.r = new C3.e(3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p222v1.a.f27433a, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f14877h = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr = this.f14877h;
                iArr[i10] = (int) (iArr[i10] * f10);
            }
        }
        this.f14883o = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new c(this));
    }

    public static Rect a() {
        Rect rect = (Rect) f14869w.a();
        return rect == null ? new Rect() : rect;
    }

    public static void m(int i10, Rect rect, Rect rect2, p232w1.d dVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = dVar.f27829c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = dVar.f27830d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    public static p232w1.d o(View view) {
        p232w1.d dVar = (p232w1.d) view.getLayoutParams();
        if (!dVar.f27828b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    p232w1.a aVar = (p232w1.a) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (dVar.f27827a != aVar) {
                        dVar.f27827a = aVar;
                        dVar.f27828b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            dVar.f27828b = true;
        }
        return dVar;
    }

    public static void w(View view, int i10) {
        p232w1.d dVar = (p232w1.d) view.getLayoutParams();
        int i11 = dVar.f27835i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = T.f7251a;
            view.offsetLeftAndRight(i10 - i11);
            dVar.f27835i = i10;
        }
    }

    public static void x(View view, int i10) {
        p232w1.d dVar = (p232w1.d) view.getLayoutParams();
        int i11 = dVar.f27836j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = T.f7251a;
            view.offsetTopAndBottom(i10 - i11);
            dVar.f27836j = i10;
        }
    }

    public final void c(p232w1.d dVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p232w1.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // K1.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        p232w1.a aVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                p232w1.d dVar = (p232w1.d) childAt.getLayoutParams();
                if (dVar.a(i14) && (aVar = dVar.f27827a) != null) {
                    aVar.k(this, childAt, view, i10, i11, i12, i13, i14);
                    z10 = true;
                }
            }
        }
        if (z10) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        p232w1.a aVar = ((p232w1.d) view.getLayoutParams()).f27827a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14883o;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // K1.r
    public final boolean e(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                p232w1.d dVar = (p232w1.d) childAt.getLayoutParams();
                p232w1.a aVar = dVar.f27827a;
                if (aVar != null) {
                    boolean zP = aVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= zP;
                    if (i11 == 0) {
                        dVar.f27838m = zP;
                    } else if (i11 == 1) {
                        dVar.f27839n = zP;
                    }
                } else if (i11 == 0) {
                    dVar.f27838m = false;
                } else if (i11 == 1) {
                    dVar.f27839n = false;
                }
            }
        }
        return z10;
    }

    @Override // K1.r
    public final void f(View view, View view2, int i10, int i11) {
        C3.e eVar = this.r;
        if (i11 == 1) {
            eVar.f1190c = i10;
        } else {
            eVar.f1189b = i10;
        }
        this.f14879j = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((p232w1.d) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // K1.r
    public final void g(View view, int i10) {
        C3.e eVar = this.r;
        if (i10 == 1) {
            eVar.f1190c = 0;
        } else {
            eVar.f1189b = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            p232w1.d dVar = (p232w1.d) childAt.getLayoutParams();
            if (dVar.a(i10)) {
                p232w1.a aVar = dVar.f27827a;
                if (aVar != null) {
                    aVar.q(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    dVar.f27838m = false;
                } else if (i10 == 1) {
                    dVar.f27839n = false;
                }
                dVar.f27840o = false;
            }
        }
        this.f14879j = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p232w1.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p232w1.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f14870a);
    }

    public final z0 getLastWindowInsets() {
        return this.f14881m;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C3.e eVar = this.r;
        return eVar.f1190c | eVar.f1189b;
    }

    public Drawable getStatusBarBackground() {
        return this.f14883o;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // K1.r
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        p232w1.a aVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                p232w1.d dVar = (p232w1.d) childAt.getLayoutParams();
                if (dVar.a(i12) && (aVar = dVar.f27827a) != null) {
                    int[] iArr2 = this.f14874e;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    aVar.i(this, childAt, view, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            q(1);
        }
    }

    public final void i(View view) {
        List list = (List) ((G) this.f14871b.f22465b).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            p232w1.a aVar = ((p232w1.d) view2.getLayoutParams()).f27827a;
            if (aVar != null) {
                aVar.d(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            l(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        G g3 = (G) this.f14871b.f22465b;
        int i10 = g3.f26268c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) g3.j(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(g3.g(i11));
            }
        }
        ArrayList arrayList3 = this.f14873d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(View view, Rect rect) {
        ThreadLocal threadLocal = f.f27843a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = f.f27843a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        f.a(this, view, matrix);
        ThreadLocal threadLocal3 = f.f27844b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i10) {
        int[] iArr = this.f14877h;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10 = 1;
        super.onAttachedToWindow();
        v(false);
        if (this.f14880l) {
            if (this.k == null) {
                this.k = new a(this, i10);
            }
            getViewTreeObserver().addOnPreDrawListener(this.k);
        }
        if (this.f14881m == null) {
            WeakHashMap weakHashMap = T.f7251a;
            if (getFitsSystemWindows()) {
                I.c(this);
            }
        }
        this.f14876g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f14880l && this.k != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.k);
        }
        View view = this.f14879j;
        if (view != null) {
            g(view, 0);
        }
        this.f14876g = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f14882n || this.f14883o == null) {
            return;
        }
        z0 z0Var = this.f14881m;
        int iD = z0Var != null ? z0Var.d() : 0;
        if (iD > 0) {
            this.f14883o.setBounds(0, 0, getWidth(), iD);
            this.f14883o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        v(true);
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p232w1.a aVar;
        WeakHashMap weakHashMap = T.f7251a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f14870a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((aVar = ((p232w1.d) view.getLayoutParams()).f27827a) == null || !aVar.f(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x018c  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        p232w1.a aVar;
        int i15;
        View view;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        boolean zG;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        int i22 = 1;
        coordinatorLayout.u();
        int childCount = coordinatorLayout.getChildCount();
        int i23 = 0;
        loop0: while (true) {
            if (i23 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i23);
            G g3 = (G) coordinatorLayout.f14871b.f22465b;
            int i24 = g3.f26268c;
            for (int i25 = 0; i25 < i24; i25++) {
                ArrayList arrayList2 = (ArrayList) g3.j(i25);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z10 = true;
                    break loop0;
                }
            }
            i23++;
        }
        if (z10 != coordinatorLayout.f14880l) {
            if (z10) {
                if (coordinatorLayout.f14876g) {
                    if (coordinatorLayout.k == null) {
                        coordinatorLayout.k = new a(coordinatorLayout, i22);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.k);
                }
                coordinatorLayout.f14880l = true;
            } else {
                if (coordinatorLayout.f14876g && coordinatorLayout.k != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.k);
                }
                coordinatorLayout.f14880l = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = T.f7251a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z13 = coordinatorLayout.f14881m != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f14870a;
        int size3 = arrayList3.size();
        int i28 = 0;
        int iCombineMeasuredStates = 0;
        while (i28 < size3) {
            View view2 = (View) arrayList3.get(i28);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i13 = size3;
                i19 = paddingLeft;
                i17 = paddingRight;
                suggestedMinimumWidth = i29;
                z11 = false;
                i21 = i28;
            } else {
                p232w1.d dVar = (p232w1.d) view2.getLayoutParams();
                int i30 = dVar.f27831e;
                if (i30 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iN = coordinatorLayout.n(i30);
                    int i31 = dVar.f27829c;
                    if (i31 == 0) {
                        i31 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, layoutDirection) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z12) && !(absoluteGravity == 5 && z12)) {
                        if ((absoluteGravity == 5 && !z12) || (absoluteGravity == 3 && z12)) {
                            iMax = Math.max(0, iN - paddingLeft);
                        }
                        if (z13 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iC = coordinatorLayout.f14881m.c() + coordinatorLayout.f14881m.b();
                            int iA = coordinatorLayout.f14881m.a() + coordinatorLayout.f14881m.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        aVar = dVar.f27827a;
                        if (aVar != null) {
                            ArrayList arrayList4 = arrayList3;
                            int i32 = iMakeMeasureSpec;
                            arrayList = arrayList4;
                            z11 = false;
                            i17 = paddingRight;
                            i18 = i12;
                            i19 = paddingLeft;
                            i20 = i29;
                            i21 = i28;
                            int i33 = iMakeMeasureSpec2;
                            zG = aVar.g(this, view2, i32, i14, i33);
                            view = view2;
                            iMakeMeasureSpec = i32;
                            i16 = i14;
                            i15 = i33;
                            if (zG) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i20, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                            int iMax3 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i34 = i14;
                            i15 = iMakeMeasureSpec2;
                            view = view2;
                            arrayList = arrayList3;
                            i16 = i34;
                            i17 = paddingRight;
                            i18 = i12;
                            z11 = false;
                            i19 = paddingLeft;
                            i20 = i29;
                            i21 = i28;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i16, i15, 0);
                        int iMax4 = Math.max(i20, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax5 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iN);
                    }
                    int i35 = size3;
                    i14 = iMax;
                    i13 = i35;
                    if (z13) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    aVar = dVar.f27827a;
                    if (aVar != null) {
                        ArrayList arrayList5 = arrayList3;
                        int i36 = iMakeMeasureSpec;
                        arrayList = arrayList5;
                        z11 = false;
                        i17 = paddingRight;
                        i18 = i12;
                        i19 = paddingLeft;
                        i20 = i29;
                        i21 = i28;
                        int i37 = iMakeMeasureSpec2;
                        zG = aVar.g(this, view2, i36, i14, i37);
                        view = view2;
                        iMakeMeasureSpec = i36;
                        i16 = i14;
                        i15 = i37;
                        if (zG) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i20, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                        int iMax7 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i38 = i14;
                        i15 = iMakeMeasureSpec2;
                        view = view2;
                        arrayList = arrayList3;
                        i16 = i38;
                        i17 = paddingRight;
                        i18 = i12;
                        z11 = false;
                        i19 = paddingLeft;
                        i20 = i29;
                        i21 = i28;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i16, i15, 0);
                    int iMax8 = Math.max(i20, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax9 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i13 = size3;
                i14 = 0;
                if (z13) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                aVar = dVar.f27827a;
                if (aVar != null) {
                    ArrayList arrayList6 = arrayList3;
                    int i39 = iMakeMeasureSpec;
                    arrayList = arrayList6;
                    z11 = false;
                    i17 = paddingRight;
                    i18 = i12;
                    i19 = paddingLeft;
                    i20 = i29;
                    i21 = i28;
                    int i310 = iMakeMeasureSpec2;
                    zG = aVar.g(this, view2, i39, i14, i310);
                    view = view2;
                    iMakeMeasureSpec = i39;
                    i16 = i14;
                    i15 = i310;
                    if (zG) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i20, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    int iMax11 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i311 = i14;
                    i15 = iMakeMeasureSpec2;
                    view = view2;
                    arrayList = arrayList3;
                    i16 = i311;
                    i17 = paddingRight;
                    i18 = i12;
                    z11 = false;
                    i19 = paddingLeft;
                    i20 = i29;
                    i21 = i28;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i16, i15, 0);
                int iMax12 = Math.max(i20, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                int iMax13 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i28 = i21 + 1;
            arrayList3 = arrayList;
            size3 = i13;
            paddingLeft = i19;
            paddingRight = i17;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(suggestedMinimumHeight, i11, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                p232w1.d dVar = (p232w1.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    p232w1.a aVar = dVar.f27827a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        p232w1.a aVar;
        int childCount = getChildCount();
        boolean zH = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                p232w1.d dVar = (p232w1.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f27827a) != null) {
                    zH |= aVar.h(view);
                }
            }
        }
        return zH;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        h(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof p232w1.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p232w1.e eVar = (p232w1.e) parcelable;
        super.onRestoreInstanceState(eVar.f15716a);
        SparseArray sparseArray = eVar.f27842c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            p232w1.a aVar = o(childAt).f27827a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        p232w1.e eVar = new p232w1.e(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            p232w1.a aVar = ((p232w1.d) childAt.getLayoutParams()).f27827a;
            if (id != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        eVar.f27842c = sparseArray;
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        boolean zR;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f14878i == null) {
            zT = t(motionEvent, 1);
            if (!zT) {
                zR = false;
            }
            motionEventObtain = null;
            if (this.f14878i == null) {
                zR |= super.onTouchEvent(motionEvent);
            } else if (zT) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zR;
            }
            v(false);
            return zR;
        }
        zT = false;
        p232w1.a aVar = ((p232w1.d) this.f14878i.getLayoutParams()).f27827a;
        if (aVar != null) {
            zR = aVar.r(this, this.f14878i, motionEvent);
        } else {
            zR = false;
        }
        motionEventObtain = null;
        if (this.f14878i == null) {
            zR |= super.onTouchEvent(motionEvent);
        } else if (zT) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        v(false);
        return zR;
    }

    public final boolean p(View view, int i10, int i11) {
        d dVar = f14869w;
        Rect rectA = a();
        l(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            rectA.setEmpty();
            dVar.c(rectA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0271  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    public final void q(int i10) {
        Rect rect;
        int i11;
        Rect rect2;
        int i12;
        ArrayList arrayList;
        int i13;
        boolean z10;
        boolean z11;
        int width;
        int i14;
        int i15;
        int i16;
        int height;
        int i17;
        int i18;
        int i19;
        Rect rect3;
        d dVar;
        p232w1.a aVar;
        WeakHashMap weakHashMap = T.f7251a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f14870a;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i20 = 0;
        while (true) {
            d dVar2 = f14869w;
            if (i20 >= size) {
                Rect rect4 = rectA2;
                Rect rect5 = rectA3;
                rectA.setEmpty();
                dVar2.c(rectA);
                rect4.setEmpty();
                dVar2.c(rect4);
                rect5.setEmpty();
                dVar2.c(rect5);
                return;
            }
            View view = (View) arrayList2.get(i20);
            p232w1.d dVar3 = (p232w1.d) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                int i21 = 0;
                while (i21 < i20) {
                    if (dVar3.f27837l == ((View) arrayList2.get(i21))) {
                        p232w1.d dVar4 = (p232w1.d) view.getLayoutParams();
                        if (dVar4.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            Rect rect6 = rectA3;
                            Rect rectA6 = a();
                            l(dVar4.k, rectA4);
                            j(view, rectA5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            d dVar5 = dVar2;
                            int measuredHeight = view.getMeasuredHeight();
                            dVar = dVar5;
                            m(layoutDirection, rectA4, rectA6, dVar4, measuredWidth, measuredHeight);
                            rect3 = rect6;
                            boolean z12 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            c(dVar4, rectA6, measuredWidth, measuredHeight);
                            int i22 = rectA6.left - rectA5.left;
                            int i23 = rectA6.top - rectA5.top;
                            if (i22 != 0) {
                                WeakHashMap weakHashMap2 = T.f7251a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap weakHashMap3 = T.f7251a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z12 && (aVar = dVar4.f27827a) != null) {
                                aVar.d(this, view, dVar4.k);
                            }
                            rectA4.setEmpty();
                            dVar.c(rectA4);
                            rectA5.setEmpty();
                            dVar.c(rectA5);
                            rectA6.setEmpty();
                            dVar.c(rectA6);
                        } else {
                            rect3 = rectA3;
                            dVar = dVar2;
                        }
                    } else {
                        rect3 = rectA3;
                        dVar = dVar2;
                    }
                    dVar2 = dVar;
                    i21++;
                    rectA2 = rectA2;
                    i20 = i20;
                    arrayList2 = arrayList2;
                    size = size;
                    rectA3 = rect3;
                }
                ArrayList arrayList3 = arrayList2;
                rect = rectA2;
                Rect rect7 = rectA3;
                i11 = i20;
                J1.c cVar = dVar2;
                int i24 = size;
                j(view, rect, true);
                if (dVar3.f27833g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(dVar3.f27833g, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rectA.top = Math.max(rectA.top, rect.bottom);
                    } else if (i25 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rect.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rectA.left = Math.max(rectA.left, rect.right);
                    } else if (i26 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rect.left);
                    }
                }
                if (dVar3.f27834h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = T.f7251a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        p232w1.d dVar6 = (p232w1.d) view.getLayoutParams();
                        p232w1.a aVar2 = dVar6.f27827a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (aVar2 == null || !aVar2.a(view, rectA7)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        cVar.c(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            cVar.c(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(dVar6.f27834h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i18 = (rectA7.top - ((ViewGroup.MarginLayoutParams) dVar6).topMargin) - dVar6.f27836j) >= (i19 = rectA.top)) {
                                z10 = false;
                            } else {
                                x(view, i19 - i18);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin) + dVar6.f27836j) < (i17 = rectA.bottom)) {
                                x(view, height - i17);
                                z10 = true;
                            }
                            if (!z10) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i15 = (rectA7.left - ((ViewGroup.MarginLayoutParams) dVar6).leftMargin) - dVar6.f27835i) >= (i16 = rectA.left)) {
                                z11 = false;
                            } else {
                                w(view, i16 - i15);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) dVar6).rightMargin) + dVar6.f27835i) < (i14 = rectA.right)) {
                                w(view, width - i14);
                                z11 = true;
                            }
                            if (!z11) {
                                w(view, 0);
                            }
                            rectA7.setEmpty();
                            cVar.c(rectA7);
                        }
                    }
                }
                if (i10 != 2) {
                    rect2 = rect7;
                    rect2.set(((p232w1.d) view.getLayoutParams()).f27841p);
                    if (rect2.equals(rect)) {
                        arrayList = arrayList3;
                        i12 = i24;
                    } else {
                        ((p232w1.d) view.getLayoutParams()).f27841p.set(rect);
                    }
                } else {
                    rect2 = rect7;
                }
                int i27 = i11 + 1;
                i12 = i24;
                while (true) {
                    arrayList = arrayList3;
                    if (i27 >= i12) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i27);
                    p232w1.d dVar7 = (p232w1.d) view2.getLayoutParams();
                    p232w1.a aVar3 = dVar7.f27827a;
                    if (aVar3 == null || !aVar3.b(view2, view)) {
                        i13 = 1;
                    } else if (i10 == 0 && dVar7.f27840o) {
                        dVar7.f27840o = false;
                        i13 = 1;
                    } else {
                        boolean zD = i10 != 2 ? aVar3.d(this, view2, view) : true;
                        i13 = 1;
                        if (i10 == 1) {
                            dVar7.f27840o = zD;
                        }
                    }
                    i27 += i13;
                    arrayList3 = arrayList;
                }
            } else {
                int i28 = size;
                arrayList = arrayList2;
                i12 = i28;
                rect = rectA2;
                rect2 = rectA3;
                i11 = i20;
            }
            i20 = i11 + 1;
            ArrayList arrayList4 = arrayList;
            size = i12;
            arrayList2 = arrayList4;
            rectA3 = rect2;
            rectA2 = rect;
        }
    }

    public final void r(View view, int i10) {
        int i11;
        p232w1.d dVar = (p232w1.d) view.getLayoutParams();
        View view2 = dVar.k;
        if (view2 == null && dVar.f27832f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar2 = f14869w;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                l(view2, rectA);
                p232w1.d dVar3 = (p232w1.d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i10, rectA, rectA2, dVar3, measuredWidth, measuredHeight);
                c(dVar3, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                dVar2.c(rectA);
                rectA2.setEmpty();
                dVar2.c(rectA2);
            }
        }
        int i12 = dVar.f27831e;
        if (i12 < 0) {
            p232w1.d dVar4 = (p232w1.d) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin);
            if (this.f14881m != null) {
                WeakHashMap weakHashMap = T.f7251a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.f14881m.b() + rectA3.left;
                    rectA3.top = this.f14881m.d() + rectA3.top;
                    rectA3.right -= this.f14881m.c();
                    rectA3.bottom -= this.f14881m.a();
                }
            }
            Rect rectA4 = a();
            int i13 = dVar4.f27829c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i10);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            dVar2.c(rectA3);
            rectA4.setEmpty();
            dVar2.c(rectA4);
            return;
        }
        p232w1.d dVar5 = (p232w1.d) view.getLayoutParams();
        int i14 = dVar5.f27829c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int iN = n(i12) - measuredWidth2;
        if (i15 == 1) {
            iN += measuredWidth2 / 2;
        } else if (i15 == 5) {
            iN += measuredWidth2;
        }
        if (i16 != 16) {
            i11 = i16 != 80 ? 0 : measuredHeight2;
        } else {
            i11 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, Math.min(iN, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar5).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar5).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        p232w1.a aVar = ((p232w1.d) view.getLayoutParams()).f27827a;
        if (aVar == null || !aVar.l(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f14875f) {
            return;
        }
        v(false);
        this.f14875f = true;
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f14884p = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f14883o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f14883o = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f14883o.setState(getDrawableState());
                }
                Drawable drawable3 = this.f14883o;
                WeakHashMap weakHashMap = T.f7251a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f14883o.setVisible(getVisibility() == 0, false);
                this.f14883o.setCallback(this);
            }
            WeakHashMap weakHashMap2 = T.f7251a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? p254y1.a.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f14883o;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f14883o.setVisible(z10, false);
    }

    public final boolean t(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f14872c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        n nVar = f14868v;
        if (nVar != null) {
            Collections.sort(arrayList, nVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zE = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            p232w1.a aVar = ((p232w1.d) view.getLayoutParams()).f27827a;
            if (zE && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        aVar.e(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        aVar.r(this, view, motionEventObtain);
                    }
                }
            } else if (!zE && aVar != null) {
                if (i10 == 0) {
                    zE = aVar.e(this, view, motionEvent);
                } else if (i10 == 1) {
                    zE = aVar.r(this, view, motionEvent);
                }
                if (zE) {
                    this.f14878i = view;
                }
            }
        }
        arrayList.clear();
        return zE;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            p232w1.a aVar = ((p232w1.d) childAt.getLayoutParams()).f27827a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    aVar.e(this, childAt, motionEventObtain);
                } else {
                    aVar.r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((p232w1.d) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f14878i = null;
        this.f14875f = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14883o;
    }

    public final void y() {
        WeakHashMap weakHashMap = T.f7251a;
        if (!getFitsSystemWindows()) {
            K.l(this, null);
            return;
        }
        if (this.f14885q == null) {
            this.f14885q = new e(this, 10);
        }
        K.l(this, this.f14885q);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof p232w1.d) {
            return new p232w1.d((p232w1.d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new p232w1.d((ViewGroup.MarginLayoutParams) layoutParams) : new p232w1.d(layoutParams);
    }
}
