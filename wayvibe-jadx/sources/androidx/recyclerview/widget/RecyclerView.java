package androidx.recyclerview.widget;

import A0.e;
import C1.a;
import D8.C0272f;
import D8.O;
import G1.g;
import K1.C0615q;
import K1.InterfaceC0614p;
import K1.K;
import K1.M;
import K1.T;
import K1.U;
import K8.c;
import L3.A;
import L3.B;
import L3.C;
import L3.C0625b;
import L3.C0629f;
import L3.C0630g;
import L3.D;
import L3.F;
import L3.L;
import L3.RunnableC0632i;
import L3.n;
import L3.o;
import L3.q;
import L3.r;
import L3.s;
import L3.u;
import L3.v;
import L3.w;
import L3.x;
import L3.y;
import N1.b;
import V0.p;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.firebase.firestore.Z;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
import p050e5.f;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0614p {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final Class[] f15628A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final n f15629B0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int[] f15630y0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int[] f15631z0 = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public EdgeEffect f15632A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public EdgeEffect f15633B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public EdgeEffect f15634C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public r f15635D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f15636E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f15637F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public VelocityTracker f15638G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15639H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15640I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f15641J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15642K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15643L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f15644M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f15645N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final float f15646O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final float f15647P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f15648Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f15649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f15650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f15651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f15652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f15653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f15655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f15656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f15657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f15658j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0629f f15659l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final D f15660l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15661m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public RunnableC0632i f15662m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15663n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final C0630g f15664n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15665o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final B f15666o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15667p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList f15668p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15669q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final f f15670q0;
    public boolean r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public F f15671r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15672s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C0615q f15673s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f15674t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int[] f15675t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15676u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f15677u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15678v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int[] f15679v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15680w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ArrayList f15681w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15682x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final O f15683x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f15684y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EdgeEffect f15685z;

    static {
        Class cls = Integer.TYPE;
        f15628A0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f15629B0 = new n(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C0615q getScrollingChildHelper() {
        if (this.f15673s0 == null) {
            this.f15673s0 = new C0615q(this);
        }
        return this.f15673s0;
    }

    public static void l(View view) {
        if (view == null) {
            return;
        }
        ((L3.t) view.getLayoutParams()).getClass();
    }

    @Override // K1.InterfaceC0614p
    public final void a(int i10) {
        getScrollingChildHelper().h(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        s sVar = this.f15657i;
        if (sVar != null) {
            sVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof L3.t) && this.f15657i.d((L3.t) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        s sVar = this.f15657i;
        if (sVar != null && sVar.b()) {
            return this.f15657i.f(this.f15666o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        s sVar = this.f15657i;
        if (sVar != null && sVar.b()) {
            this.f15657i.g(this.f15666o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        s sVar = this.f15657i;
        if (sVar != null && sVar.b()) {
            return this.f15657i.h(this.f15666o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        s sVar = this.f15657i;
        if (sVar != null && sVar.c()) {
            return this.f15657i.i(this.f15666o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        s sVar = this.f15657i;
        if (sVar != null && sVar.c()) {
            this.f15657i.j(this.f15666o0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        s sVar = this.f15657i;
        if (sVar != null && sVar.c()) {
            return this.f15657i.k(this.f15666o0);
        }
        return 0;
    }

    public final void d(String str) {
        if (this.f15680w > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + j());
        }
        if (this.f15682x > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + j()));
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.f15658j;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C0629f c0629f = (C0629f) arrayList.get(i10);
            if (c0629f.f7724l != c0629f.f7726n.getWidth() || c0629f.f7725m != c0629f.f7726n.getHeight()) {
                c0629f.f7724l = c0629f.f7726n.getWidth();
                c0629f.f7725m = c0629f.f7726n.getHeight();
                c0629f.e(0);
            } else if (c0629f.f7733v != 0) {
                if (c0629f.f7727o) {
                    int i11 = c0629f.f7724l;
                    int i12 = c0629f.f7717d;
                    int i13 = i11 - i12;
                    int i14 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0629f.f7715b;
                    stateListDrawable.setBounds(0, 0, i12, 0);
                    int i15 = c0629f.f7725m;
                    Drawable drawable = c0629f.f7716c;
                    drawable.setBounds(0, 0, c0629f.f7718e, i15);
                    RecyclerView recyclerView = c0629f.f7726n;
                    WeakHashMap weakHashMap = T.f7251a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i12, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i12, -i14);
                    } else {
                        canvas.translate(i13, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i13, -i14);
                    }
                }
                if (c0629f.f7728p) {
                    int i16 = c0629f.f7725m;
                    int i17 = c0629f.f7721h;
                    int i18 = i16 - i17;
                    int i19 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable2 = c0629f.f7719f;
                    stateListDrawable2.setBounds(0, 0, 0, i17);
                    int i20 = c0629f.f7724l;
                    Drawable drawable2 = c0629f.f7720g;
                    drawable2.setBounds(0, 0, i20, c0629f.f7722i);
                    canvas.translate(0.0f, i18);
                    drawable2.draw(canvas);
                    canvas.translate(i19, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i19, -i18);
                }
            }
        }
        EdgeEffect edgeEffect = this.f15685z;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f15654f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f15685z;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f15632A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f15654f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f15632A;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f15633B;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f15654f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f15633B;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f15634C;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f15654f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f15634C;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f15635D == null || arrayList.size() <= 0 || !this.f15635D.b()) ? z10 : true) {
            WeakHashMap weakHashMap2 = T.f7251a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f15685z;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f15685z.onRelease();
            zIsFinished = this.f15685z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f15633B;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f15633B.onRelease();
            zIsFinished |= this.f15633B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f15632A;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f15632A.onRelease();
            zIsFinished |= this.f15632A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f15634C;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f15634C.onRelease();
            zIsFinished |= this.f15634C.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = T.f7251a;
            postInvalidateOnAnimation();
        }
    }

    public final void f() {
        t tVar = this.f15651c;
        if (!this.f15665o || this.f15676u) {
            int i10 = g.f5350a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) tVar.f14413d).size() > 0) {
            tVar.getClass();
            if (((ArrayList) tVar.f14413d).size() > 0) {
                int i11 = g.f5350a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c2, code lost:
    
        if (r4 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
    
        if (r7 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e3, code lost:
    
        if (r4 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e6, code lost:
    
        if (r7 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ee, code lost:
    
        if ((r7 * r1) < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f6, code lost:
    
        if ((r7 * r1) > 0) goto L83;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = T.f7251a;
        setMeasuredDimension(s.e(i10, paddingRight, getMinimumWidth()), s.e(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        s sVar = this.f15657i;
        if (sVar != null) {
            return sVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + j());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        s sVar = this.f15657i;
        if (sVar != null) {
            return sVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + j());
    }

    public o getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        s sVar = this.f15657i;
        if (sVar == null) {
            return super.getBaseline();
        }
        sVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f15654f;
    }

    public F getCompatAccessibilityDelegate() {
        return this.f15671r0;
    }

    public q getEdgeEffectFactory() {
        return this.f15684y;
    }

    public r getItemAnimator() {
        return this.f15635D;
    }

    public int getItemDecorationCount() {
        return this.f15658j.size();
    }

    public s getLayoutManager() {
        return this.f15657i;
    }

    public int getMaxFlingVelocity() {
        return this.f15645N;
    }

    public int getMinFlingVelocity() {
        return this.f15644M;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public u getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f15648Q;
    }

    public x getRecycledViewPool() {
        e eVar = this.f15649a;
        if (((x) eVar.f96f) == null) {
            x xVar = new x();
            xVar.f7772a = new SparseArray();
            xVar.f7773b = 0;
            eVar.f96f = xVar;
        }
        return (x) eVar.f96f;
    }

    public int getScrollState() {
        return this.f15636E;
    }

    public final boolean h(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final boolean i(int[] iArr, int i10) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i10, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f15661m;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f7339d;
    }

    public final String j() {
        return StringUtils.SPACE + super.toString() + ", adapter:null, layout:" + this.f15657i + ", context:" + getContext();
    }

    public final View k(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean m() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean n() {
        return !this.f15665o || this.f15676u || ((ArrayList) this.f15651c.f14413d).size() > 0;
    }

    public final void o() {
        int iC0 = this.f15652d.c0();
        for (int i10 = 0; i10 < iC0; i10++) {
            ((L3.t) this.f15652d.b0(i10).getLayoutParams()).f7771b = true;
        }
        ArrayList arrayList = (ArrayList) this.f15649a.f94d;
        if (arrayList.size() > 0) {
            throw p.f(0, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        boolean z10 = false;
        this.f15680w = 0;
        this.f15661m = true;
        if (this.f15665o && !isLayoutRequested()) {
            z10 = true;
        }
        this.f15665o = z10;
        s sVar = this.f15657i;
        if (sVar != null) {
            sVar.f7767e = true;
        }
        ThreadLocal threadLocal = RunnableC0632i.f7743e;
        RunnableC0632i runnableC0632i = (RunnableC0632i) threadLocal.get();
        this.f15662m0 = runnableC0632i;
        if (runnableC0632i == null) {
            RunnableC0632i runnableC0632i2 = new RunnableC0632i();
            runnableC0632i2.f7745a = new ArrayList();
            runnableC0632i2.f7748d = new ArrayList();
            this.f15662m0 = runnableC0632i2;
            WeakHashMap weakHashMap = T.f7251a;
            Display display = getDisplay();
            if (isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            RunnableC0632i runnableC0632i3 = this.f15662m0;
            runnableC0632i3.f7747c = (long) (1.0E9f / refreshRate);
            threadLocal.set(runnableC0632i3);
        }
        this.f15662m0.f7745a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r rVar = this.f15635D;
        if (rVar != null) {
            rVar.a();
        }
        setScrollState(0);
        D d10 = this.f15660l0;
        d10.f7678g.removeCallbacks(d10);
        d10.f7674c.abortAnimation();
        this.f15661m = false;
        s sVar = this.f15657i;
        if (sVar != null) {
            sVar.f7767e = false;
            sVar.z(this);
        }
        this.f15681w0.clear();
        removeCallbacks(this.f15683x0);
        this.f15653e.getClass();
        while (L.f7697a.a() != null) {
        }
        RunnableC0632i runnableC0632i = this.f15662m0;
        if (runnableC0632i != null) {
            runnableC0632i.f7745a.remove(this);
            this.f15662m0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f15658j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C0629f) arrayList.get(i10)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f15657i != null && !this.f15669q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f15657i.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f15657i.b() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f15657i.c()) {
                    f10 = -axisValue2;
                } else if (this.f15657i.b()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                s((int) (axisValue * this.f15646O), (int) (f10 * this.f15647P), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.f15669q) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 0) {
                this.f15659l = null;
            }
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0629f c0629f = (C0629f) arrayList.get(i10);
                if (c0629f.c(motionEvent) && action != 3) {
                    this.f15659l = c0629f;
                    r();
                    setScrollState(0);
                    return true;
                }
            }
            s sVar = this.f15657i;
            if (sVar != null) {
                boolean zB = sVar.b();
                boolean zC = this.f15657i.c();
                if (this.f15638G == null) {
                    this.f15638G = VelocityTracker.obtain();
                }
                this.f15638G.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.r) {
                        this.r = false;
                    }
                    this.f15637F = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f15641J = x10;
                    this.f15639H = x10;
                    int y6 = (int) (motionEvent.getY() + 0.5f);
                    this.f15642K = y6;
                    this.f15640I = y6;
                    if (this.f15636E == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f15679v0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i11 = zB;
                    if (zC) {
                        i11 = (zB ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i11, 0);
                } else if (actionMasked == 1) {
                    this.f15638G.clear();
                    a(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f15637F);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f15637F + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f15636E != 1) {
                        int i12 = x11 - this.f15639H;
                        int i13 = y10 - this.f15640I;
                        if (!zB || Math.abs(i12) <= this.f15643L) {
                            z10 = false;
                        } else {
                            this.f15641J = x11;
                            z10 = true;
                        }
                        if (zC && Math.abs(i13) > this.f15643L) {
                            this.f15642K = y10;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    r();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f15637F = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f15641J = x12;
                    this.f15639H = x12;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f15642K = y11;
                    this.f15640I = y11;
                } else if (actionMasked == 6) {
                    p(motionEvent);
                }
                if (this.f15636E == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = g.f5350a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f15665o = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        s sVar = this.f15657i;
        if (sVar == null) {
            g(i10, i11);
            return;
        }
        if (sVar.y()) {
            View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getMode(i11);
            this.f15657i.f7764b.g(i10, i11);
        } else {
            if (this.f15663n) {
                this.f15657i.f7764b.g(i10, i11);
                return;
            }
            B b10 = this.f15666o0;
            if (b10.f7671e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            b10.getClass();
            this.f15667p++;
            this.f15657i.f7764b.g(i10, i11);
            if (this.f15667p < 1) {
                this.f15667p = 1;
            }
            this.f15667p--;
            b10.f7669c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (this.f15680w > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a10 = (A) parcelable;
        this.f15650b = a10;
        super.onRestoreInstanceState(a10.f15716a);
        s sVar = this.f15657i;
        if (sVar == null || (parcelable2 = this.f15650b.f7666c) == null) {
            return;
        }
        sVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        A a10 = new A(super.onSaveInstanceState());
        A a11 = this.f15650b;
        if (a11 != null) {
            a10.f7666c = a11.f7666c;
            return a10;
        }
        s sVar = this.f15657i;
        if (sVar != null) {
            a10.f7666c = sVar.C();
            return a10;
        }
        a10.f7666c = null;
        return a10;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f15634C = null;
        this.f15632A = null;
        this.f15633B = null;
        this.f15685z = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0229  */
    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0231  */
    /* JADX WARN: Code duplicated, block: B:107:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:109:0x023d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0248  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:118:0x0256  */
    /* JADX WARN: Code duplicated, block: B:120:0x0259  */
    /* JADX WARN: Code duplicated, block: B:126:0x026a  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:132:0x0292  */
    /* JADX WARN: Code duplicated, block: B:137:0x029b  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:169:0x0329  */
    /* JADX WARN: Code duplicated, block: B:171:0x0345  */
    /* JADX WARN: Code duplicated, block: B:178:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143 A[LOOP:0: B:57:0x012c->B:63:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x015a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01db  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x021f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01c2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean zB;
        boolean zC;
        MotionEvent motionEventObtain;
        int actionMasked;
        int actionIndex;
        int[] iArr;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        s sVar2;
        boolean zB2;
        boolean zC2;
        float f12;
        float f13;
        boolean z10;
        int i14;
        int iFindPointerIndex;
        int x10;
        int y6;
        int i15;
        int i16;
        boolean zH;
        int[] iArr2;
        int i17;
        RunnableC0632i runnableC0632i;
        boolean z11;
        int iAbs;
        int i18;
        int iAbs2;
        int i19;
        ArrayList arrayList;
        int size;
        int i20;
        C0629f c0629f;
        if (!this.f15669q && !this.r) {
            int action = motionEvent.getAction();
            C0629f c0629f2 = this.f15659l;
            if (c0629f2 == null) {
                if (action != 0) {
                    arrayList = this.k;
                    size = arrayList.size();
                    for (i20 = 0; i20 < size; i20++) {
                        c0629f = (C0629f) arrayList.get(i20);
                        if (c0629f.c(motionEvent)) {
                            this.f15659l = c0629f;
                        }
                    }
                }
                sVar = this.f15657i;
                if (sVar != null) {
                    zB = sVar.b();
                    zC = this.f15657i.c();
                    if (this.f15638G == null) {
                        this.f15638G = VelocityTracker.obtain();
                    }
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    actionMasked = motionEvent.getActionMasked();
                    actionIndex = motionEvent.getActionIndex();
                    iArr = this.f15679v0;
                    if (actionMasked == 0) {
                        iArr[1] = 0;
                        iArr[0] = 0;
                    }
                    motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            this.f15638G.addMovement(motionEventObtain);
                            VelocityTracker velocityTracker = this.f15638G;
                            i11 = this.f15645N;
                            velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, i11);
                            if (zB) {
                                f10 = -this.f15638G.getXVelocity(this.f15637F);
                            } else {
                                f10 = 0.0f;
                            }
                            if (zC) {
                                f11 = -this.f15638G.getYVelocity(this.f15637F);
                            } else {
                                f11 = 0.0f;
                            }
                            if (f10 == 0.0f || f11 != 0.0f) {
                                i12 = (int) f10;
                                i13 = (int) f11;
                                sVar2 = this.f15657i;
                                if (sVar2 == null) {
                                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                } else if (!this.f15669q) {
                                    zB2 = sVar2.b();
                                    zC2 = this.f15657i.c();
                                    int i21 = this.f15644M;
                                    if (zB2 || Math.abs(i12) < i21) {
                                        i12 = 0;
                                    }
                                    if (zC2 || Math.abs(i13) < i21) {
                                        i13 = 0;
                                    }
                                    if (i12 == 0 || i13 != 0) {
                                        f12 = i12;
                                        f13 = i13;
                                        if (!dispatchNestedPreFling(f12, f13)) {
                                            if (!zB2 || zC2) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            dispatchNestedFling(f12, f13, z10);
                                            i14 = zB2;
                                            if (z10) {
                                                if (zC2) {
                                                    i14 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i14, 1);
                                                int i22 = -i11;
                                                int iMax = Math.max(i22, Math.min(i12, i11));
                                                int iMax2 = Math.max(i22, Math.min(i13, i11));
                                                D d10 = this.f15660l0;
                                                d10.f7678g.setScrollState(2);
                                                d10.f7673b = 0;
                                                d10.f7672a = 0;
                                                d10.f7674c.fling(0, 0, iMax, iMax2, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                                                d10.a();
                                            }
                                        }
                                    }
                                }
                                setScrollState(0);
                            } else {
                                setScrollState(0);
                            }
                            r();
                        } else if (actionMasked != 2) {
                            iFindPointerIndex = motionEvent.findPointerIndex(this.f15637F);
                            if (iFindPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f15637F + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            y6 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            i15 = this.f15641J - x10;
                            i16 = this.f15642K - y6;
                            zH = h(i15, i16, 0, this.f15677u0, this.f15675t0);
                            iArr2 = this.f15675t0;
                            if (zH) {
                                int[] iArr3 = this.f15677u0;
                                i15 -= iArr3[0];
                                i16 -= iArr3[1];
                                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                                iArr[0] = iArr[0] + iArr2[0];
                                iArr[1] = iArr[1] + iArr2[1];
                            }
                            if (this.f15636E != 1) {
                                if (zB) {
                                    iAbs2 = Math.abs(i15);
                                    i19 = this.f15643L;
                                    if (iAbs2 > i19) {
                                        if (i15 > 0) {
                                            i15 -= i19;
                                        } else {
                                            i15 += i19;
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                                if (zC) {
                                    iAbs = Math.abs(i16);
                                    i18 = this.f15643L;
                                    if (iAbs > i18) {
                                        if (i16 > 0) {
                                            i16 -= i18;
                                        } else {
                                            i16 += i18;
                                        }
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    setScrollState(1);
                                }
                            }
                            if (this.f15636E == 1) {
                                this.f15641J = x10 - iArr2[0];
                                this.f15642K = y6 - iArr2[1];
                                if (zB) {
                                    i17 = i15;
                                } else {
                                    i17 = 0;
                                }
                                s(i17, zC ? i16 : 0, motionEventObtain);
                                runnableC0632i = this.f15662m0;
                                if (runnableC0632i != null && (i15 != 0 || i16 != 0)) {
                                    runnableC0632i.a(this, i15, i16);
                                }
                            }
                        } else if (actionMasked != 3) {
                            r();
                            setScrollState(0);
                        } else if (actionMasked != 5) {
                            this.f15637F = motionEvent.getPointerId(actionIndex);
                            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f15641J = x11;
                            this.f15639H = x11;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f15642K = y10;
                            this.f15640I = y10;
                        } else if (actionMasked == 6) {
                            p(motionEvent);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    this.f15637F = motionEvent.getPointerId(0);
                    int x12 = (int) (motionEvent.getX() + 0.5f);
                    this.f15641J = x12;
                    this.f15639H = x12;
                    int y11 = (int) (motionEvent.getY() + 0.5f);
                    this.f15642K = y11;
                    this.f15640I = y11;
                    if (zC) {
                        i10 = zB;
                        i10 = (zB ? 1 : 0) | 2;
                    }
                    i10 = zB;
                    getScrollingChildHelper().g(i10, 0);
                    this.f15638G.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                }
            } else if (action == 0) {
                this.f15659l = null;
                if (action != 0) {
                    arrayList = this.k;
                    size = arrayList.size();
                    while (i20 < size) {
                        c0629f = (C0629f) arrayList.get(i20);
                        if (c0629f.c(motionEvent)) {
                            this.f15659l = c0629f;
                        }
                    }
                }
                sVar = this.f15657i;
                if (sVar != null) {
                    zB = sVar.b();
                    zC = this.f15657i.c();
                    if (this.f15638G == null) {
                        this.f15638G = VelocityTracker.obtain();
                    }
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    actionMasked = motionEvent.getActionMasked();
                    actionIndex = motionEvent.getActionIndex();
                    iArr = this.f15679v0;
                    if (actionMasked == 0) {
                        iArr[1] = 0;
                        iArr[0] = 0;
                    }
                    motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            this.f15638G.addMovement(motionEventObtain);
                            VelocityTracker velocityTracker2 = this.f15638G;
                            i11 = this.f15645N;
                            velocityTracker2.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, i11);
                            if (zB) {
                                f10 = -this.f15638G.getXVelocity(this.f15637F);
                            } else {
                                f10 = 0.0f;
                            }
                            if (zC) {
                                f11 = -this.f15638G.getYVelocity(this.f15637F);
                            } else {
                                f11 = 0.0f;
                            }
                            if (f10 == 0.0f) {
                                i12 = (int) f10;
                                i13 = (int) f11;
                                sVar2 = this.f15657i;
                                if (sVar2 == null) {
                                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                } else if (!this.f15669q) {
                                    zB2 = sVar2.b();
                                    zC2 = this.f15657i.c();
                                    int i23 = this.f15644M;
                                    if (zB2) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (zC2) {
                                        i13 = 0;
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i12 == 0) {
                                        f12 = i12;
                                        f13 = i13;
                                        if (!dispatchNestedPreFling(f12, f13)) {
                                            if (zB2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            dispatchNestedFling(f12, f13, z10);
                                            i14 = zB2;
                                            if (z10) {
                                                if (zC2) {
                                                    i14 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i14, 1);
                                                int i24 = -i11;
                                                int iMax3 = Math.max(i24, Math.min(i12, i11));
                                                int iMax4 = Math.max(i24, Math.min(i13, i11));
                                                D d11 = this.f15660l0;
                                                d11.f7678g.setScrollState(2);
                                                d11.f7673b = 0;
                                                d11.f7672a = 0;
                                                d11.f7674c.fling(0, 0, iMax3, iMax4, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                                                d11.a();
                                            }
                                        }
                                    } else {
                                        f12 = i12;
                                        f13 = i13;
                                        if (!dispatchNestedPreFling(f12, f13)) {
                                            if (zB2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            dispatchNestedFling(f12, f13, z10);
                                            i14 = zB2;
                                            if (z10) {
                                                if (zC2) {
                                                    i14 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i14, 1);
                                                int i25 = -i11;
                                                int iMax5 = Math.max(i25, Math.min(i12, i11));
                                                int iMax6 = Math.max(i25, Math.min(i13, i11));
                                                D d12 = this.f15660l0;
                                                d12.f7678g.setScrollState(2);
                                                d12.f7673b = 0;
                                                d12.f7672a = 0;
                                                d12.f7674c.fling(0, 0, iMax5, iMax6, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                                                d12.a();
                                            }
                                        }
                                    }
                                }
                                setScrollState(0);
                            } else {
                                i12 = (int) f10;
                                i13 = (int) f11;
                                sVar2 = this.f15657i;
                                if (sVar2 == null) {
                                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                } else if (!this.f15669q) {
                                    zB2 = sVar2.b();
                                    zC2 = this.f15657i.c();
                                    int i26 = this.f15644M;
                                    if (zB2) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (zC2) {
                                        i13 = 0;
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i12 == 0) {
                                        f12 = i12;
                                        f13 = i13;
                                        if (!dispatchNestedPreFling(f12, f13)) {
                                            if (zB2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            dispatchNestedFling(f12, f13, z10);
                                            i14 = zB2;
                                            if (z10) {
                                                if (zC2) {
                                                    i14 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i14, 1);
                                                int i27 = -i11;
                                                int iMax7 = Math.max(i27, Math.min(i12, i11));
                                                int iMax8 = Math.max(i27, Math.min(i13, i11));
                                                D d13 = this.f15660l0;
                                                d13.f7678g.setScrollState(2);
                                                d13.f7673b = 0;
                                                d13.f7672a = 0;
                                                d13.f7674c.fling(0, 0, iMax7, iMax8, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                                                d13.a();
                                            }
                                        }
                                    } else {
                                        f12 = i12;
                                        f13 = i13;
                                        if (!dispatchNestedPreFling(f12, f13)) {
                                            if (zB2) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            dispatchNestedFling(f12, f13, z10);
                                            i14 = zB2;
                                            if (z10) {
                                                if (zC2) {
                                                    i14 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i14, 1);
                                                int i28 = -i11;
                                                int iMax9 = Math.max(i28, Math.min(i12, i11));
                                                int iMax10 = Math.max(i28, Math.min(i13, i11));
                                                D d14 = this.f15660l0;
                                                d14.f7678g.setScrollState(2);
                                                d14.f7673b = 0;
                                                d14.f7672a = 0;
                                                d14.f7674c.fling(0, 0, iMax9, iMax10, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, MediaPlayerException.ERROR_UNKNOWN, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                                                d14.a();
                                            }
                                        }
                                    }
                                }
                                setScrollState(0);
                            }
                            r();
                        } else if (actionMasked != 2) {
                            iFindPointerIndex = motionEvent.findPointerIndex(this.f15637F);
                            if (iFindPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f15637F + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            y6 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            i15 = this.f15641J - x10;
                            i16 = this.f15642K - y6;
                            zH = h(i15, i16, 0, this.f15677u0, this.f15675t0);
                            iArr2 = this.f15675t0;
                            if (zH) {
                                int[] iArr4 = this.f15677u0;
                                i15 -= iArr4[0];
                                i16 -= iArr4[1];
                                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                                iArr[0] = iArr[0] + iArr2[0];
                                iArr[1] = iArr[1] + iArr2[1];
                            }
                            if (this.f15636E != 1) {
                                if (zB) {
                                    iAbs2 = Math.abs(i15);
                                    i19 = this.f15643L;
                                    if (iAbs2 > i19) {
                                        if (i15 > 0) {
                                            i15 -= i19;
                                        } else {
                                            i15 += i19;
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                                if (zC) {
                                    iAbs = Math.abs(i16);
                                    i18 = this.f15643L;
                                    if (iAbs > i18) {
                                        if (i16 > 0) {
                                            i16 -= i18;
                                        } else {
                                            i16 += i18;
                                        }
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    setScrollState(1);
                                }
                            }
                            if (this.f15636E == 1) {
                                this.f15641J = x10 - iArr2[0];
                                this.f15642K = y6 - iArr2[1];
                                if (zB) {
                                    i17 = i15;
                                } else {
                                    i17 = 0;
                                }
                                s(i17, zC ? i16 : 0, motionEventObtain);
                                runnableC0632i = this.f15662m0;
                                if (runnableC0632i != null) {
                                    runnableC0632i.a(this, i15, i16);
                                }
                            }
                        } else if (actionMasked != 3) {
                            r();
                            setScrollState(0);
                        } else if (actionMasked != 5) {
                            this.f15637F = motionEvent.getPointerId(actionIndex);
                            int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f15641J = x13;
                            this.f15639H = x13;
                            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f15642K = y12;
                            this.f15640I = y12;
                        } else if (actionMasked == 6) {
                            p(motionEvent);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    this.f15637F = motionEvent.getPointerId(0);
                    int x14 = (int) (motionEvent.getX() + 0.5f);
                    this.f15641J = x14;
                    this.f15639H = x14;
                    int y13 = (int) (motionEvent.getY() + 0.5f);
                    this.f15642K = y13;
                    this.f15640I = y13;
                    if (zC) {
                        i10 = zB;
                        i10 = (zB ? 1 : 0) | 2;
                    }
                    i10 = zB;
                    getScrollingChildHelper().g(i10, 0);
                    this.f15638G.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                }
            } else {
                if (c0629f2.f7729q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zB3 = c0629f2.b(motionEvent.getX(), motionEvent.getY());
                        boolean zA = c0629f2.a(motionEvent.getX(), motionEvent.getY());
                        if (zB3 || zA) {
                            if (zA) {
                                c0629f2.r = 1;
                                c0629f2.k = (int) motionEvent.getX();
                            } else if (zB3) {
                                c0629f2.r = 2;
                                c0629f2.f7723j = (int) motionEvent.getY();
                            }
                            c0629f2.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0629f2.f7729q == 2) {
                        c0629f2.f7723j = 0.0f;
                        c0629f2.k = 0.0f;
                        c0629f2.e(1);
                        c0629f2.r = 0;
                    } else if (motionEvent.getAction() == 2 && c0629f2.f7729q == 2) {
                        c0629f2.f();
                        int i29 = c0629f2.r;
                        int i30 = c0629f2.f7714a;
                        if (i29 == 1) {
                            float x15 = motionEvent.getX();
                            int[] iArr5 = c0629f2.f7731t;
                            iArr5[0] = i30;
                            int i31 = c0629f2.f7724l - i30;
                            iArr5[1] = i31;
                            float fMax = Math.max(i30, Math.min(i31, x15));
                            if (Math.abs(0 - fMax) >= 2.0f) {
                                float f14 = c0629f2.k;
                                int iComputeHorizontalScrollRange = c0629f2.f7726n.computeHorizontalScrollRange();
                                c0629f2.f7726n.computeHorizontalScrollOffset();
                                int iD = C0629f.d(f14, fMax, iArr5, iComputeHorizontalScrollRange, 0, c0629f2.f7724l);
                                if (iD != 0) {
                                    c0629f2.f7726n.scrollBy(iD, 0);
                                }
                                c0629f2.k = fMax;
                            }
                        }
                        if (c0629f2.r == 2) {
                            float y14 = motionEvent.getY();
                            int[] iArr6 = c0629f2.f7730s;
                            iArr6[0] = i30;
                            int i32 = c0629f2.f7725m - i30;
                            iArr6[1] = i32;
                            float fMax2 = Math.max(i30, Math.min(i32, y14));
                            if (Math.abs(0 - fMax2) >= 2.0f) {
                                float f15 = c0629f2.f7723j;
                                int iComputeVerticalScrollRange = c0629f2.f7726n.computeVerticalScrollRange();
                                c0629f2.f7726n.computeVerticalScrollOffset();
                                int iD2 = C0629f.d(f15, fMax2, iArr6, iComputeVerticalScrollRange, 0, c0629f2.f7725m);
                                if (iD2 != 0) {
                                    c0629f2.f7726n.scrollBy(0, iD2);
                                }
                                c0629f2.f7723j = fMax2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f15659l = null;
                }
            }
            r();
            setScrollState(0);
            return true;
        }
        return false;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f15637F) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f15637F = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f15641J = x10;
            this.f15639H = x10;
            int y6 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f15642K = y6;
            this.f15640I = y6;
        }
    }

    public final void q(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f15655g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof L3.t) {
            L3.t tVar = (L3.t) layoutParams;
            if (!tVar.f7771b) {
                int i10 = rect.left;
                Rect rect2 = tVar.f7770a;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f15657i.G(this, view, this.f15655g, !this.f15665o, view2 == null);
    }

    public final void r() {
        VelocityTracker velocityTracker = this.f15638G;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        a(0);
        EdgeEffect edgeEffect = this.f15685z;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f15685z.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f15632A;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f15632A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f15633B;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f15633B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f15634C;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f15634C.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = T.f7251a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        l(view);
        view.clearAnimation();
        l(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f15657i.getClass();
        if (this.f15680w <= 0 && view2 != null) {
            q(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f15657i.G(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C0629f) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f15667p != 0 || this.f15669q) {
            return;
        }
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:45:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    public final void s(int i10, int i11, MotionEvent motionEvent) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        f();
        if (!this.f15658j.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f15675t0;
        boolean z10 = false;
        boolean z11 = true;
        if (i(iArr, 0)) {
            int i12 = this.f15641J;
            int i13 = iArr[0];
            this.f15641J = i12 - i13;
            int i14 = this.f15642K;
            int i15 = iArr[1];
            this.f15642K = i14 - i15;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i13, i15);
            }
            int[] iArr2 = this.f15679v0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f10 = 0;
                float y6 = motionEvent.getY();
                if (f10 < 0.0f) {
                    if (this.f15685z == null) {
                        this.f15684y.getClass();
                        EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                        this.f15685z = edgeEffect3;
                        if (this.f15654f) {
                            edgeEffect3.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect3.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    b.a(this.f15685z, (-f10) / getWidth(), 1.0f - (y6 / getHeight()));
                } else if (f10 <= 0.0f) {
                    if (f10 < 0.0f) {
                        if (this.f15632A == null) {
                            this.f15684y.getClass();
                            edgeEffect2 = new EdgeEffect(getContext());
                            this.f15632A = edgeEffect2;
                            if (this.f15654f) {
                                edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        b.a(this.f15632A, (-f10) / getHeight(), x10 / getWidth());
                    } else if (f10 > 0.0f) {
                        if (this.f15634C == null) {
                            this.f15684y.getClass();
                            edgeEffect = new EdgeEffect(getContext());
                            this.f15634C = edgeEffect;
                            if (this.f15654f) {
                                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        b.a(this.f15634C, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                    } else {
                        z11 = z10;
                    }
                    if (z11 || f10 != 0.0f || f10 != 0.0f) {
                        WeakHashMap weakHashMap = T.f7251a;
                        postInvalidateOnAnimation();
                    }
                } else {
                    if (this.f15633B == null) {
                        this.f15684y.getClass();
                        EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                        this.f15633B = edgeEffect4;
                        if (this.f15654f) {
                            edgeEffect4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect4.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    b.a(this.f15633B, f10 / getWidth(), y6 / getHeight());
                }
                z10 = true;
                if (f10 < 0.0f) {
                    if (this.f15632A == null) {
                        this.f15684y.getClass();
                        edgeEffect2 = new EdgeEffect(getContext());
                        this.f15632A = edgeEffect2;
                        if (this.f15654f) {
                            edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    b.a(this.f15632A, (-f10) / getHeight(), x10 / getWidth());
                } else if (f10 > 0.0f) {
                    if (this.f15634C == null) {
                        this.f15684y.getClass();
                        edgeEffect = new EdgeEffect(getContext());
                        this.f15634C = edgeEffect;
                        if (this.f15654f) {
                            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    b.a(this.f15634C, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                } else {
                    z11 = z10;
                }
                if (z11) {
                    WeakHashMap weakHashMap2 = T.f7251a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap3 = T.f7251a;
                    postInvalidateOnAnimation();
                }
            }
            e(i10, i11);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        s sVar = this.f15657i;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f15669q) {
            return;
        }
        boolean zB = sVar.b();
        boolean zC = this.f15657i.c();
        if (zB || zC) {
            if (!zB) {
                i10 = 0;
            }
            if (!zC) {
                i11 = 0;
            }
            s(i10, i11, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f15680w <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f15672s |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(F f10) {
        this.f15671r0 = f10;
        T.i(this, f10);
    }

    public void setAdapter(o oVar) {
        setLayoutFrozen(false);
        r rVar = this.f15635D;
        if (rVar != null) {
            rVar.a();
        }
        s sVar = this.f15657i;
        e eVar = this.f15649a;
        if (sVar != null) {
            sVar.E();
            this.f15657i.F(eVar);
        }
        ((ArrayList) eVar.f93c).clear();
        ArrayList arrayList = (ArrayList) eVar.f94d;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw p.f(size, arrayList);
        }
        arrayList.clear();
        C0630g c0630g = ((RecyclerView) eVar.f97g).f15664n0;
        c0630g.getClass();
        c0630g.f7737c = 0;
        t tVar = this.f15651c;
        tVar.j0((ArrayList) tVar.f14413d);
        tVar.j0((ArrayList) tVar.f14412c);
        ((ArrayList) eVar.f93c).clear();
        ArrayList arrayList2 = (ArrayList) eVar.f94d;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            arrayList2.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        RecyclerView recyclerView = (RecyclerView) eVar.f97g;
        C0630g c0630g2 = recyclerView.f15664n0;
        c0630g2.getClass();
        c0630g2.f7737c = 0;
        if (((x) eVar.f96f) == null) {
            x xVar = new x();
            xVar.f7772a = new SparseArray();
            xVar.f7773b = 0;
            eVar.f96f = xVar;
        }
        x xVar2 = (x) eVar.f96f;
        if (xVar2.f7773b == 0) {
            SparseArray sparseArray = xVar2.f7772a;
            if (sparseArray.size() > 0) {
                ((w) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f15666o0.f7668b = true;
        this.f15678v = this.f15678v;
        this.f15676u = true;
        int iC0 = this.f15652d.c0();
        for (int i10 = 0; i10 < iC0; i10++) {
            l(this.f15652d.b0(i10));
        }
        o();
        int size3 = arrayList2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            if (arrayList2.get(i11) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList2.size() - 1;
        if (size4 >= 0) {
            arrayList2.get(size4).getClass();
            throw new ClassCastException();
        }
        arrayList2.clear();
        C0630g c0630g3 = recyclerView.f15664n0;
        c0630g3.getClass();
        c0630g3.f7737c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(L3.p pVar) {
        if (pVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f15654f) {
            this.f15634C = null;
            this.f15632A = null;
            this.f15633B = null;
            this.f15685z = null;
        }
        this.f15654f = z10;
        super.setClipToPadding(z10);
        if (this.f15665o) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(q qVar) {
        qVar.getClass();
        this.f15684y = qVar;
        this.f15634C = null;
        this.f15632A = null;
        this.f15633B = null;
        this.f15685z = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f15663n = z10;
    }

    public void setItemAnimator(r rVar) {
        r rVar2 = this.f15635D;
        if (rVar2 != null) {
            rVar2.a();
            this.f15635D.f7759a = null;
        }
        this.f15635D = rVar;
        if (rVar != null) {
            rVar.f7759a = this.f15670q0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        e eVar = this.f15649a;
        eVar.f91a = i10;
        eVar.i();
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.f15669q) {
            d("Do not setLayoutFrozen in layout or scroll");
            if (!z10) {
                this.f15669q = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f15669q = true;
            this.r = true;
            setScrollState(0);
            D d10 = this.f15660l0;
            d10.f7678g.removeCallbacks(d10);
            d10.f7674c.abortAnimation();
        }
    }

    public void setLayoutManager(s sVar) {
        p268z7.c cVar;
        if (sVar == this.f15657i) {
            return;
        }
        setScrollState(0);
        D d10 = this.f15660l0;
        d10.f7678g.removeCallbacks(d10);
        d10.f7674c.abortAnimation();
        s sVar2 = this.f15657i;
        e eVar = this.f15649a;
        if (sVar2 != null) {
            r rVar = this.f15635D;
            if (rVar != null) {
                rVar.a();
            }
            this.f15657i.E();
            this.f15657i.F(eVar);
            ((ArrayList) eVar.f93c).clear();
            ArrayList arrayList = (ArrayList) eVar.f94d;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            arrayList.clear();
            C0630g c0630g = ((RecyclerView) eVar.f97g).f15664n0;
            c0630g.getClass();
            c0630g.f7737c = 0;
            if (this.f15661m) {
                s sVar3 = this.f15657i;
                sVar3.f7767e = false;
                sVar3.z(this);
            }
            this.f15657i.I(null);
            this.f15657i = null;
        } else {
            ((ArrayList) eVar.f93c).clear();
            ArrayList arrayList2 = (ArrayList) eVar.f94d;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
            arrayList2.clear();
            C0630g c0630g2 = ((RecyclerView) eVar.f97g).f15664n0;
            c0630g2.getClass();
            c0630g2.f7737c = 0;
        }
        t tVar = this.f15652d;
        ((C0272f) tVar.f14412c).B();
        ArrayList arrayList3 = (ArrayList) tVar.f14413d;
        int size3 = arrayList3.size() - 1;
        while (true) {
            cVar = (p268z7.c) tVar.f14411b;
            if (size3 < 0) {
                break;
            }
            l((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) cVar.f29899b;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            l(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f15657i = sVar;
        if (sVar != null) {
            if (sVar.f7764b != null) {
                throw new IllegalArgumentException("LayoutManager " + sVar + " is already attached to a RecyclerView:" + sVar.f7764b.j());
            }
            sVar.I(this);
            if (this.f15661m) {
                this.f15657i.f7767e = true;
            }
        }
        eVar.i();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C0615q scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f7339d) {
            WeakHashMap weakHashMap = T.f7251a;
            K.n(scrollingChildHelper.f7338c);
        }
        scrollingChildHelper.f7339d = z10;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f15648Q = z10;
    }

    public void setRecycledViewPool(x xVar) {
        e eVar = this.f15649a;
        x xVar2 = (x) eVar.f96f;
        if (xVar2 != null) {
            xVar2.f7773b--;
        }
        eVar.f96f = xVar;
        if (xVar != null) {
            ((RecyclerView) eVar.f97g).getAdapter();
        }
    }

    public void setScrollState(int i10) {
        if (i10 == this.f15636E) {
            return;
        }
        this.f15636E = i10;
        if (i10 != 2) {
            D d10 = this.f15660l0;
            d10.f7678g.removeCallbacks(d10);
            d10.f7674c.abortAnimation();
        }
        s sVar = this.f15657i;
        if (sVar != null) {
            sVar.D(i10);
        }
        ArrayList arrayList = this.f15668p0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v) this.f15668p0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f15643L = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f15643L = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C c3) {
        this.f15649a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void t(int i10, int i11) {
        int iRound;
        s sVar = this.f15657i;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f15669q) {
            return;
        }
        int i12 = !sVar.b() ? 0 : i10;
        int i13 = !this.f15657i.c() ? 0 : i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        D d10 = this.f15660l0;
        d10.getClass();
        int iAbs = Math.abs(i12);
        int iAbs2 = Math.abs(i13);
        boolean z10 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt(0);
        int iSqrt2 = (int) Math.sqrt((i13 * i13) + (i12 * i12));
        RecyclerView recyclerView = d10.f7678g;
        int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i14 = width / 2;
        float f10 = width;
        float f11 = i14;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z10) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(iRound, 2000);
        n nVar = f15629B0;
        if (d10.f7675d != nVar) {
            d10.f7675d = nVar;
            d10.f7674c = new OverScroller(recyclerView.getContext(), nVar);
        }
        recyclerView.setScrollState(2);
        d10.f7673b = 0;
        d10.f7672a = 0;
        d10.f7674c.startScroll(0, 0, i12, i13, iMin);
        d10.a();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        float fA;
        char c3;
        int i11;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, 0);
        this.f15649a = new e(this);
        this.f15653e = new c();
        this.f15655g = new Rect();
        this.f15656h = new Rect();
        new RectF();
        this.f15658j = new ArrayList();
        this.k = new ArrayList();
        this.f15667p = 0;
        this.f15676u = false;
        this.f15678v = false;
        this.f15680w = 0;
        this.f15682x = 0;
        this.f15684y = new q();
        C0625b c0625b = new C0625b();
        c0625b.f7759a = null;
        c0625b.f7760b = new ArrayList();
        c0625b.f7761c = 250L;
        c0625b.f7762d = 250L;
        c0625b.f7698e = new ArrayList();
        c0625b.f7699f = new ArrayList();
        c0625b.f7700g = new ArrayList();
        c0625b.f7701h = new ArrayList();
        c0625b.f7702i = new ArrayList();
        c0625b.f7703j = new ArrayList();
        c0625b.k = new ArrayList();
        c0625b.f7704l = new ArrayList();
        c0625b.f7705m = new ArrayList();
        c0625b.f7706n = new ArrayList();
        c0625b.f7707o = new ArrayList();
        this.f15635D = c0625b;
        this.f15636E = 0;
        this.f15637F = -1;
        this.f15646O = Float.MIN_VALUE;
        this.f15647P = Float.MIN_VALUE;
        boolean z10 = true;
        this.f15648Q = true;
        this.f15660l0 = new D(this);
        this.f15664n0 = new C0630g();
        B b10 = new B();
        b10.f7667a = 0;
        b10.f7668b = false;
        b10.f7669c = false;
        b10.f7670d = false;
        b10.f7671e = false;
        this.f15666o0 = b10;
        f fVar = new f(13);
        this.f15670q0 = fVar;
        this.f15675t0 = new int[2];
        this.f15677u0 = new int[2];
        this.f15679v0 = new int[2];
        this.f15681w0 = new ArrayList();
        this.f15683x0 = new O(this, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f15631z0, 0, 0);
            this.f15654f = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f15654f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f15643L = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = U.f7256a;
            fA = a.c(viewConfiguration);
        } else {
            fA = U.a(viewConfiguration, context);
        }
        this.f15646O = fA;
        this.f15647P = i12 >= 26 ? a.d(viewConfiguration) : U.a(viewConfiguration, context);
        this.f15644M = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15645N = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f15635D.f7759a = fVar;
        this.f15651c = new t(new Z(this));
        this.f15652d = new t(new p268z7.c(this, 17));
        WeakHashMap weakHashMap = T.f7251a;
        if ((i12 >= 26 ? M.a(this) : 0) == 0 && i12 >= 26) {
            M.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f15674t = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new F(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, K3.a.f7364a, 0, 0);
            String string = typedArrayObtainStyledAttributes2.getString(7);
            if (typedArrayObtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(ETagPayloadStore.WRITE_BUFFER_BYTES);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(5);
                Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + j());
                }
                Resources resources = getContext().getResources();
                i11 = 4;
                c3 = 3;
                new C0629f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(app.nagakiba.wayvibe.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(app.nagakiba.wayvibe.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(app.nagakiba.wayvibe.R.dimen.fastscroll_margin));
            } else {
                c3 = 3;
                i11 = 4;
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (string != null) {
                String strTrim = string.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.charAt(0) == '.') {
                        strTrim = context.getPackageName() + strTrim;
                    } else if (!strTrim.contains(".")) {
                        strTrim = RecyclerView.class.getPackage().getName() + com.amazon.a.a.o.c.a.b.f16463a + strTrim;
                    }
                    String str = strTrim;
                    try {
                        Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(s.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(f15628A0);
                            Object[] objArr2 = new Object[i11];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[2] = 0;
                            objArr2[c3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = clsAsSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e4) {
                                e4.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((s) constructor.newInstance(objArr));
                    } catch (ClassCastException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e7);
                    } catch (ClassNotFoundException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e10);
                    } catch (IllegalAccessException e11) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                    } catch (InstantiationException e12) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f15630y0, 0, 0);
            z10 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(ETagPayloadStore.WRITE_BUFFER_BYTES);
        }
        setNestedScrollingEnabled(z10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f15657i;
        if (sVar != null) {
            return sVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + j());
    }

    public void setOnFlingListener(u uVar) {
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
    }

    public void setRecyclerListener(y yVar) {
    }
}
