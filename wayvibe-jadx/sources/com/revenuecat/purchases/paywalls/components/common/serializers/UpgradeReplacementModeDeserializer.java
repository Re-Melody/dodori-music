package com.revenuecat.purchases.paywalls.components.common.serializers;

import Z8.c;
import com.revenuecat.purchases.models.StoreReplacementMode;
import java.util.Locale;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class UpgradeReplacementModeDeserializer extends StoreReplacementModeDeserializer {
    public static final UpgradeReplacementModeDeserializer INSTANCE = new UpgradeReplacementModeDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // Z8.c
        public final String invoke(StoreReplacementMode value) {
            m.f(value, "value");
            String lowerCase = value.getName().toLowerCase(Locale.ROOT);
            m.e(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    private UpgradeReplacementModeDeserializer() {
        super(StoreReplacementMode.CHARGE_PRORATED_PRICE, AnonymousClass1.INSTANCE);
    }
}
