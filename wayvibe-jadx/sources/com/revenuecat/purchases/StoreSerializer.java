package com.revenuecat.purchases;

import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class StoreSerializer extends EnumDeserializerWithDefault<Store> {
    public static final StoreSerializer INSTANCE = new StoreSerializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.StoreSerializer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements Z8.c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // Z8.c
        public final String invoke(Store value) {
            m.f(value, "value");
            return value.getStringValue$purchases_defaultsRelease();
        }
    }

    private StoreSerializer() {
        super(Store.UNKNOWN_STORE, AnonymousClass1.INSTANCE);
    }
}
