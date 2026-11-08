package p098j;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p132m.d;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends ContentFrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C f21194i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C c3, d dVar) {
        super(dVar, null);
        this.f21194i = c3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f21194i.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (x10 < -5 || y6 < -5 || x10 > getWidth() + 5 || y6 > getHeight() + 5) {
                C c3 = this.f21194i;
                c3.t(c3.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(c.r(getContext(), i10));
    }
}
