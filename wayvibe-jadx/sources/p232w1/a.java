package p232w1;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public boolean a(View view, Rect rect) {
        return false;
    }

    public boolean b(View view, View view2) {
        return false;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return false;
    }

    public boolean h(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            j(view, i11);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
        return false;
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(int i10) {
        return false;
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        if (i11 == 0) {
            return o(i10);
        }
        return false;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public void c(d dVar) {
    }

    public void j(View view, int i10) {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
    }

    public void i(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int[] iArr, int i11) {
    }
}
