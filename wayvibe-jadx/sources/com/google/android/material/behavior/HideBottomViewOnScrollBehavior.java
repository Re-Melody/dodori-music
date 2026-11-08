package com.google.android.material.behavior;

import P3.p;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p232w1.a;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18159a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18160b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewPropertyAnimator f18161c;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p232w1.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f18159a = view.getMeasuredHeight();
        return false;
    }

    @Override // p232w1.a
    public final void j(View view, int i10) {
        int i11 = this.f18160b;
        if (i11 != 1 && i10 > 0) {
            s(view);
        } else {
            if (i11 == 2 || i10 >= 0) {
                return;
            }
            t(view);
        }
    }

    @Override // p232w1.a
    public final boolean o(int i10) {
        return i10 == 2;
    }

    public void s(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.f18161c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f18160b = 1;
        this.f18161c = view.animate().translationY(this.f18159a).setInterpolator(p061f6.a.f19833b).setDuration(175L).setListener(new p(this, 1));
    }

    public void t(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.f18161c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f18160b = 2;
        this.f18161c = view.animate().translationY(0).setInterpolator(p061f6.a.f19834c).setDuration(225L).setListener(new p(this, 1));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
