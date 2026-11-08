package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import M8.l;
import Z8.c;
import android.view.MotionEvent;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PaywallWebViewKt {
    public static final boolean shouldWebViewOwnGesture(float f10, float f11, int i10, Boolean bool, c canScrollHorizontally, c canScrollVertically) {
        m.f(canScrollHorizontally, "canScrollHorizontally");
        m.f(canScrollVertically, "canScrollVertically");
        if (m.b(bool, Boolean.TRUE)) {
            return true;
        }
        int i11 = i10 / 2;
        if (i11 < 1) {
            i11 = 1;
        }
        float f12 = i11;
        if (Math.abs(f10) < f12 && Math.abs(f11) < f12) {
            return false;
        }
        if (Math.abs(f11) >= Math.abs(f10)) {
            return ((Boolean) canScrollVertically.invoke(Integer.valueOf(f11 >= 0.0f ? -1 : 1))).booleanValue();
        }
        return ((Boolean) canScrollHorizontally.invoke(Integer.valueOf(f10 >= 0.0f ? -1 : 1))).booleanValue();
    }

    public static final l trackedPointerDelta(MotionEvent event, int i10, float f10, float f11) {
        m.f(event, "event");
        int iFindPointerIndex = event.findPointerIndex(i10);
        if (iFindPointerIndex == -1) {
            return null;
        }
        return new l(Float.valueOf(event.getX(iFindPointerIndex) - f10), Float.valueOf(event.getY(iFindPointerIndex) - f11));
    }
}
