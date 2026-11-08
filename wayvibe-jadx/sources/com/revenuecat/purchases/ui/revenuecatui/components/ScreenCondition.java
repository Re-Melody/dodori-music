package com.revenuecat.purchases.ui.revenuecatui.components;

import W3.c;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public enum ScreenCondition {
    COMPACT,
    MEDIUM,
    EXPANDED;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ScreenCondition from(c sizeClass) {
            m.f(sizeClass, "sizeClass");
            if (sizeClass.equals(c.f12786b)) {
                return ScreenCondition.COMPACT;
            }
            if (sizeClass.equals(c.f12787c)) {
                return ScreenCondition.MEDIUM;
            }
            if (sizeClass.equals(c.f12788d)) {
                return ScreenCondition.EXPANDED;
            }
            Logger.INSTANCE.d("Unexpected WindowWidthSizeClass: '" + sizeClass + "'. Falling back to COMPACT.");
            return ScreenCondition.COMPACT;
        }

        private Companion() {
        }
    }
}
