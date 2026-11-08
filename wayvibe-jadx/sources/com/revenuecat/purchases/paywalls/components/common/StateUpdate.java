package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.m;
import p219u9.a;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface StateUpdate {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final a serializer() {
            return StateUpdateSerializer.INSTANCE;
        }
    }

    public static final class Set implements StateUpdate {
        private final String key;
        private final StateUpdateValue value;

        public Set(String key, StateUpdateValue value) {
            m.f(key, "key");
            m.f(value, "value");
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            return m.b(this.key, set.key) && m.b(this.value, set.value);
        }

        public final /* synthetic */ String getKey() {
            return this.key;
        }

        public final /* synthetic */ StateUpdateValue getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return "Set(key=" + this.key + ", value=" + this.value + ')';
        }
    }

    public static final class Unsupported implements StateUpdate {
        public static final Unsupported INSTANCE = new Unsupported();

        private Unsupported() {
        }
    }
}
