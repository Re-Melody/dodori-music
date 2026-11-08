package p152o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p142n.B;

/* JADX INFO: renamed from: o.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2167x0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f23469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RunnableC2165w0 f23470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RunnableC2165w0 f23471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f23474i = new int[2];

    public AbstractViewOnTouchListenerC2167x0(View view) {
        this.f23469d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f23466a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f23467b = tapTimeout;
        this.f23468c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC2165w0 runnableC2165w0 = this.f23471f;
        View view = this.f23469d;
        if (runnableC2165w0 != null) {
            view.removeCallbacks(runnableC2165w0);
        }
        RunnableC2165w0 runnableC2165w1 = this.f23470e;
        if (runnableC2165w1 != null) {
            view.removeCallbacks(runnableC2165w1);
        }
    }

    public abstract B b();

    public abstract boolean c();

    public boolean d() {
        B b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        C2161u0 c2161u0H;
        boolean z11 = this.f23472g;
        View view2 = this.f23469d;
        if (z11) {
            B b10 = b();
            if (b10 != null && b10.b() && (c2161u0H = b10.h()) != null && c2161u0H.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f23474i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c2161u0H.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = c2161u0H.b(motionEventObtainNoHistory, this.f23473h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f23473h = motionEvent.getPointerId(0);
                    if (this.f23470e == null) {
                        this.f23470e = new RunnableC2165w0(this, 0);
                    }
                    view2.postDelayed(this.f23470e, this.f23467b);
                    if (this.f23471f == null) {
                        this.f23471f = new RunnableC2165w0(this, 1);
                    }
                    view2.postDelayed(this.f23471f, this.f23468c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f23473h);
                    if (iFindPointerIndex >= 0) {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float y6 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f23466a;
                        float f11 = -f10;
                        if (x10 < f11 || y6 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y6 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z10 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f23472g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f23472g = false;
        this.f23473h = -1;
        RunnableC2165w0 runnableC2165w0 = this.f23470e;
        if (runnableC2165w0 != null) {
            this.f23469d.removeCallbacks(runnableC2165w0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
