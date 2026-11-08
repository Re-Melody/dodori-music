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
public final class ExitOffer {
    public static final Companion Companion = new Companion(null);
    private final String offeringId;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ExitOffer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ ExitOffer(int i10, String str, Y y6) {
        if (1 == (i10 & 1)) {
            this.offeringId = str;
        } else {
            O.g(i10, 1, ExitOffer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExitOffer) && m.b(this.offeringId, ((ExitOffer) obj).offeringId);
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public int hashCode() {
        return this.offeringId.hashCode();
    }

    public String toString() {
        return AbstractC0112b.j(new StringBuilder("ExitOffer(offeringId="), this.offeringId, ')');
    }

    public ExitOffer(String offeringId) {
        m.f(offeringId, "offeringId");
        this.offeringId = offeringId;
    }
}
