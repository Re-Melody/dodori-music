package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.m;
import p270z9.C;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface StateUpdateValue {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String PAYLOAD_REFERENCE_TOKEN = "$value";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PAYLOAD_REFERENCE_TOKEN = "$value";

        private Companion() {
        }
    }

    public static final class Literal implements StateUpdateValue {
        private final C value;

        public Literal(C value) {
            m.f(value, "value");
            this.value = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Literal) && m.b(this.value, ((Literal) obj).value);
        }

        public final /* synthetic */ C getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Literal(value=" + this.value + ')';
        }
    }

    public static final class PayloadReference implements StateUpdateValue {
        public static final PayloadReference INSTANCE = new PayloadReference();

        private PayloadReference() {
        }
    }
}
