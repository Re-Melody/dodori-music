package p152o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import app.nagakiba.wayvibe.R;
import p142n.ViewTreeObserverOnGlobalLayoutListenerC2073d;

/* JADX INFO: loaded from: classes.dex */
public final class N extends G0 implements P {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f23236B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public K f23237C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f23238D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f23239E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ Q f23240F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q5, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f23240F = q5;
        this.f23238D = new Rect();
        this.f23210o = q5;
        this.f23218x = true;
        this.f23219y.setFocusable(true);
        this.f23211p = new L(this);
    }

    @Override // p152o.P
    public final CharSequence d() {
        return this.f23236B;
    }

    @Override // p152o.P
    public final void g(CharSequence charSequence) {
        this.f23236B = charSequence;
    }

    @Override // p152o.P
    public final void k(int i10) {
        this.f23239E = i10;
    }

    @Override // p152o.P
    public final void l(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        A a10 = this.f23219y;
        boolean zIsShowing = a10.isShowing();
        r();
        this.f23219y.setInputMethodMode(2);
        f();
        C2161u0 c2161u0 = this.f23199c;
        c2161u0.setChoiceMode(1);
        c2161u0.setTextDirection(i10);
        c2161u0.setTextAlignment(i11);
        Q q5 = this.f23240F;
        int selectedItemPosition = q5.getSelectedItemPosition();
        C2161u0 c2161u1 = this.f23199c;
        if (a10.isShowing() && c2161u1 != null) {
            c2161u1.setListSelectionHidden(false);
            c2161u1.setSelection(selectedItemPosition);
            if (c2161u1.getChoiceMode() != 0) {
                c2161u1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = q5.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC2073d viewTreeObserverOnGlobalLayoutListenerC2073d = new ViewTreeObserverOnGlobalLayoutListenerC2073d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2073d);
        this.f23219y.setOnDismissListener(new M(this, viewTreeObserverOnGlobalLayoutListenerC2073d));
    }

    @Override // p152o.G0, p152o.P
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f23237C = (K) listAdapter;
    }

    public final void r() {
        int i10;
        A a10 = this.f23219y;
        Drawable background = a10.getBackground();
        Q q5 = this.f23240F;
        if (background != null) {
            background.getPadding(q5.f23266h);
            boolean z10 = l1.f23395a;
            int layoutDirection = q5.getLayoutDirection();
            Rect rect = q5.f23266h;
            i10 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = q5.f23266h;
            rect2.right = 0;
            rect2.left = 0;
            i10 = 0;
        }
        int paddingLeft = q5.getPaddingLeft();
        int paddingRight = q5.getPaddingRight();
        int width = q5.getWidth();
        int i11 = q5.f23265g;
        if (i11 == -2) {
            int iA = q5.a(this.f23237C, a10.getBackground());
            int i12 = q5.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = q5.f23266h;
            int i13 = (i12 - rect3.left) - rect3.right;
            if (iA > i13) {
                iA = i13;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i11);
        }
        boolean z11 = l1.f23395a;
        this.f23202f = q5.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f23201e) - this.f23239E) + i10 : paddingLeft + this.f23239E + i10;
    }
}
