package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import H2.RunnableC0545o;
import M8.l;
import Z8.c;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallWebView extends WebView {
    public static final int $stable = 8;
    private final c canScrollHorizontallyReference;
    private final c canScrollVerticallyReference;
    private boolean claimedForWebView;
    private float downX;
    private float downY;
    private boolean gestureActive;
    private float lastTotalDx;
    private float lastTotalDy;
    private final int touchSlop;
    private int trackedPointerId;
    private Boolean webContentWantsGesture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallWebView(Context context) {
        super(context);
        m.f(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.canScrollHorizontallyReference = new PaywallWebView$canScrollHorizontallyReference$1(this);
        this.canScrollVerticallyReference = new PaywallWebView$canScrollVerticallyReference$1(this);
        this.trackedPointerId = -1;
    }

    private final void claimForWebViewIfNeeded() {
        if (!this.claimedForWebView && PaywallWebViewKt.shouldWebViewOwnGesture(this.lastTotalDx, this.lastTotalDy, this.touchSlop, this.webContentWantsGesture, this.canScrollHorizontallyReference, this.canScrollVerticallyReference)) {
            this.claimedForWebView = true;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public final /* synthetic */ void onContentGestureVerdict(boolean z10) {
        if (!m.b(Looper.myLooper(), Looper.getMainLooper())) {
            post(new RunnableC0545o(2, this, z10));
        } else if (this.gestureActive) {
            this.webContentWantsGesture = Boolean.valueOf(z10);
            claimForWebViewIfNeeded();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        m.f(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.downX = event.getX();
            this.downY = event.getY();
            this.trackedPointerId = event.getPointerId(0);
            this.lastTotalDx = 0.0f;
            this.lastTotalDy = 0.0f;
            this.webContentWantsGesture = null;
            this.claimedForWebView = false;
            this.gestureActive = true;
        } else if (actionMasked == 1) {
            this.gestureActive = false;
        } else if (actionMasked == 2) {
            l lVarTrackedPointerDelta = PaywallWebViewKt.trackedPointerDelta(event, this.trackedPointerId, this.downX, this.downY);
            if (lVarTrackedPointerDelta == null) {
                return super.onTouchEvent(event);
            }
            this.lastTotalDx = ((Number) lVarTrackedPointerDelta.f8413a).floatValue();
            this.lastTotalDy = ((Number) lVarTrackedPointerDelta.f8414b).floatValue();
            claimForWebViewIfNeeded();
        } else if (actionMasked == 3) {
            this.gestureActive = false;
        }
        return super.onTouchEvent(event);
    }
}
