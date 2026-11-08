package L3;

import D8.C0272f;
import K1.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.support.v4.media.session.t f7763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f7764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ua.c f7765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ua.c f7766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7769g;

    public s() {
        F5.i iVar = new F5.i(this, 15);
        A.n nVar = new A.n(this);
        this.f7765c = new ua.c(iVar);
        this.f7766d = new ua.c(nVar);
        this.f7767e = false;
    }

    public static int e(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    public static void v(View view) {
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0634k w(Context context, AttributeSet attributeSet, int i10, int i11) {
        C0634k c0634k = new C0634k(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f7364a, i10, i11);
        c0634k.f7750b = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0634k.f7751c = typedArrayObtainStyledAttributes.getInt(9, 1);
        c0634k.f7752d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        c0634k.f7753e = typedArrayObtainStyledAttributes.getBoolean(10, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0634k;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7764b;
        A0.e eVar = recyclerView.f15649a;
        B b10 = recyclerView.f15666o0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7764b.canScrollVertically(-1) && !this.f7764b.canScrollHorizontally(-1) && !this.f7764b.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        this.f7764b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int iP = p() - 1;
        if (iP < 0) {
            return;
        }
        RecyclerView.l(o(iP));
        throw null;
    }

    public final void F(A0.e eVar) {
        int size = ((ArrayList) eVar.f93c).size();
        int i10 = size - 1;
        ArrayList arrayList = (ArrayList) eVar.f93c;
        if (i10 >= 0) {
            throw V0.p.f(i10, arrayList);
        }
        arrayList.clear();
        if (size > 0) {
            this.f7764b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        boolean z12;
        int iS = s();
        int iU = u();
        int iT = this.f7768f - t();
        int iR = this.f7769g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iS;
        int iMin = Math.min(0, i10);
        int i11 = top - iU;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iT;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iR);
        RecyclerView recyclerView2 = this.f7764b;
        WeakHashMap weakHashMap = T.f7251a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iS2 = s();
            int iU2 = u();
            int iT2 = this.f7768f - t();
            int iR2 = this.f7769g - r();
            Rect rect2 = this.f7764b.f15655g;
            int[] iArr2 = RecyclerView.f15630y0;
            t tVar = (t) focusedChild.getLayoutParams();
            Rect rect3 = tVar.f7770a;
            z12 = false;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) tVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin);
            if (rect2.left - i13 >= iT2 || rect2.right - i13 <= iS2 || rect2.top - i14 >= iR2 || rect2.bottom - i14 <= iU2) {
                return false;
            }
        } else {
            z12 = false;
        }
        if (i13 == 0 && i14 == 0) {
            return z12;
        }
        if (z10) {
            recyclerView.scrollBy(i13, i14);
            return 1;
        }
        recyclerView.t(i13, i14);
        return r11;
    }

    public final void H() {
        RecyclerView recyclerView = this.f7764b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7764b = null;
            this.f7763a = null;
            this.f7768f = 0;
            this.f7769g = 0;
            return;
        }
        this.f7764b = recyclerView;
        this.f7763a = recyclerView.f15652d;
        this.f7768f = recyclerView.getWidth();
        this.f7769g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(t tVar) {
        return tVar != null;
    }

    public abstract int f(B b10);

    public abstract void g(B b10);

    public abstract int h(B b10);

    public abstract int i(B b10);

    public abstract void j(B b10);

    public abstract int k(B b10);

    public abstract t l();

    public t m(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public t n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t) {
            return new t((t) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t((ViewGroup.MarginLayoutParams) layoutParams) : new t(layoutParams);
    }

    public final View o(int i10) {
        android.support.v4.media.session.t tVar = this.f7763a;
        if (tVar == null) {
            return null;
        }
        int i11 = -1;
        if (i10 >= 0) {
            int childCount = ((RecyclerView) ((p268z7.c) tVar.f14411b).f29899b).getChildCount();
            int i12 = i10;
            while (i12 < childCount) {
                C0272f c0272f = (C0272f) tVar.f14412c;
                int iY = i10 - (i12 - c0272f.y(i12));
                if (iY == 0) {
                    i11 = i12;
                    while (c0272f.z(i11)) {
                        i11++;
                    }
                    break;
                }
                i12 += iY;
            }
        }
        return ((RecyclerView) ((p268z7.c) tVar.f14411b).f29899b).getChildAt(i11);
    }

    public final int p() {
        android.support.v4.media.session.t tVar = this.f7763a;
        if (tVar != null) {
            return ((RecyclerView) ((p268z7.c) tVar.f14411b).f29899b).getChildCount() - ((ArrayList) tVar.f14413d).size();
        }
        return 0;
    }

    public int q(A0.e eVar, B b10) {
        RecyclerView recyclerView = this.f7764b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f7764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f7764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f7764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f7764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(A0.e eVar, B b10) {
        RecyclerView recyclerView = this.f7764b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i10) {
    }
}
