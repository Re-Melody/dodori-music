package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import p219u9.a;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface PaywallComponent {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final a serializer() {
            return new PaywallComponentSerializer();
        }
    }
}
