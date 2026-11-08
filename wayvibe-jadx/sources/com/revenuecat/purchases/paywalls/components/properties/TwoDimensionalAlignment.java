package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import p219u9.a;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public enum TwoDimensionalAlignment {
    CENTER,
    LEADING,
    TRAILING,
    TOP,
    BOTTOM,
    TOP_LEADING,
    TOP_TRAILING,
    BOTTOM_LEADING,
    BOTTOM_TRAILING;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return TwoDimensionalAlignmentDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
