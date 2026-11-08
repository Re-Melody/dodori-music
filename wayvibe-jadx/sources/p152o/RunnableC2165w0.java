package p152o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: o.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2165w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC2167x0 f23462b;

    public /* synthetic */ RunnableC2165w0(AbstractViewOnTouchListenerC2167x0 abstractViewOnTouchListenerC2167x0, int i10) {
        this.f23461a = i10;
        this.f23462b = abstractViewOnTouchListenerC2167x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23461a) {
            case 0:
                ViewParent parent = this.f23462b.f23469d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC2167x0 abstractViewOnTouchListenerC2167x0 = this.f23462b;
                abstractViewOnTouchListenerC2167x0.a();
                View view = abstractViewOnTouchListenerC2167x0.f23469d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2167x0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC2167x0.f23472g = true;
                    break;
                }
                break;
        }
    }
}
