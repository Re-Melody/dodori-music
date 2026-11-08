package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import C.f0;
import C.g0;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PaddingKt {
    public static final f0 toPaddingValues(Padding padding, boolean z10) {
        m.f(padding, "<this>");
        if (z10) {
            double top = padding.getTop();
            double[] dArr = {padding.getBottom(), padding.getLeading(), padding.getTrailing()};
            for (int i10 = 0; i10 < 3; i10++) {
                top = Math.min(top, dArr[i10]);
            }
            if (top < 0.0d) {
                Logger.INSTANCE.w("Received negative padding/margin value(s) (top=" + padding.getTop() + ", bottom=" + padding.getBottom() + ", leading=" + padding.getLeading() + ", trailing=" + padding.getTrailing() + "). Negative padding/margin is not supported on Android; clamping to 0.");
            }
        }
        double leading = padding.getLeading();
        if (leading < 0.0d) {
            leading = 0.0d;
        }
        float f10 = (float) leading;
        double top2 = padding.getTop();
        if (top2 < 0.0d) {
            top2 = 0.0d;
        }
        float f11 = (float) top2;
        double trailing = padding.getTrailing();
        if (trailing < 0.0d) {
            trailing = 0.0d;
        }
        float f12 = (float) trailing;
        double bottom = padding.getBottom();
        return new g0(f10, f11, f12, (float) (bottom >= 0.0d ? bottom : 0.0d));
    }

    public static /* synthetic */ f0 toPaddingValues$default(Padding padding, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toPaddingValues(padding, z10);
    }
}
