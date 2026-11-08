package com.revenuecat.purchases.paywalls.components.common;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p260y9.O;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PromoOfferConfig {
    public static final Companion Companion = new Companion(null);
    private final String offerId;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PromoOfferConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ PromoOfferConfig(int i10, String str, Y y6) {
        if (1 == (i10 & 1)) {
            this.offerId = str;
        } else {
            O.g(i10, 1, PromoOfferConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ void getOfferId$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromoOfferConfig) && m.b(this.offerId, ((PromoOfferConfig) obj).offerId);
    }

    public final /* synthetic */ String getOfferId() {
        return this.offerId;
    }

    public int hashCode() {
        return this.offerId.hashCode();
    }

    public String toString() {
        return AbstractC0112b.j(new StringBuilder("PromoOfferConfig(offerId="), this.offerId, ')');
    }

    public PromoOfferConfig(String offerId) {
        m.f(offerId, "offerId");
        this.offerId = offerId;
    }
}
