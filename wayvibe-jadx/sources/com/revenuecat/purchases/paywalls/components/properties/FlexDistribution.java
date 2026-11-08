package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import p219u9.a;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public enum FlexDistribution {
    START,
    END,
    CENTER,
    SPACE_BETWEEN,
    SPACE_AROUND,
    SPACE_EVENLY;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return FlexDistributionDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
