package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import M8.InterfaceC0641c;
import N8.t;
import N8.y;
import Z8.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.CustomVariableKeyValidator;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class CheckpointParams {
    public static final int $stable = 8;
    private final Map<String, CustomVariableValue> customVariables;

    @CheckpointParamsDsl
    public static final class Builder {
        public static final int $stable = 8;
        private Map<String, ? extends CustomVariableValue> customVariables = t.f8651a;

        public final CheckpointParams build() {
            return new CheckpointParams(this.customVariables, null);
        }

        public final /* synthetic */ Builder customVariables(c block) {
            m.f(block, "block");
            CustomVariablesBuilder customVariablesBuilder = new CustomVariablesBuilder();
            block.invoke(customVariablesBuilder);
            this.customVariables = customVariablesBuilder.build();
            return this;
        }

        public final Builder setCustomVariables(Map<String, ? extends CustomVariableValue> customVariables) {
            m.f(customVariables, "customVariables");
            this.customVariables = customVariables;
            return this;
        }
    }

    @CheckpointParamsDsl
    public static final class CustomVariablesBuilder {
        public static final int $stable = 8;
        private final Map<String, CustomVariableValue> customVariables = new LinkedHashMap();

        public final CustomVariablesBuilder add(String key, CustomVariableValue value) {
            m.f(key, "key");
            m.f(value, "value");
            this.customVariables.put(key, value);
            return this;
        }

        public final Map<String, CustomVariableValue> build() {
            return y.q0(this.customVariables);
        }

        public final /* synthetic */ void to(String str, CustomVariableValue value) {
            m.f(str, "<this>");
            m.f(value, "value");
            add(str, value);
        }

        public final CustomVariablesBuilder add(String key, String value) {
            m.f(key, "key");
            m.f(value, "value");
            return add(key, new CustomVariableValue.String(value));
        }

        public final /* synthetic */ void to(String str, String value) {
            m.f(str, "<this>");
            m.f(value, "value");
            add(str, value);
        }

        public final CustomVariablesBuilder add(String key, int i10) {
            m.f(key, "key");
            return add(key, new CustomVariableValue.Number(i10));
        }

        public final /* synthetic */ void to(String str, int i10) {
            m.f(str, "<this>");
            add(str, i10);
        }

        public final CustomVariablesBuilder add(String key, long j10) {
            m.f(key, "key");
            return add(key, new CustomVariableValue.Number(j10));
        }

        public final /* synthetic */ void to(String str, long j10) {
            m.f(str, "<this>");
            add(str, j10);
        }

        public final CustomVariablesBuilder add(String key, double d10) {
            m.f(key, "key");
            return add(key, new CustomVariableValue.Number(d10));
        }

        public final /* synthetic */ void to(String str, double d10) {
            m.f(str, "<this>");
            add(str, d10);
        }

        public final CustomVariablesBuilder add(String key, float f10) {
            m.f(key, "key");
            return add(key, new CustomVariableValue.Number(f10));
        }

        public final /* synthetic */ void to(String str, float f10) {
            m.f(str, "<this>");
            add(str, f10);
        }

        public final CustomVariablesBuilder add(String key, boolean z10) {
            m.f(key, "key");
            return add(key, new CustomVariableValue.Boolean(z10));
        }

        public final /* synthetic */ void to(String str, boolean z10) {
            m.f(str, "<this>");
            add(str, z10);
        }

        @InterfaceC0641c
        public final /* synthetic */ void to(String str, Object obj) {
            m.f(str, "<this>");
            throw new UnsupportedOperationException("Unsupported custom variable type: " + obj);
        }
    }

    public /* synthetic */ CheckpointParams(Map map, f fVar) {
        this(map);
    }

    public boolean equals(Object obj) {
        return (obj instanceof CheckpointParams) && m.b(((CheckpointParams) obj).customVariables, this.customVariables);
    }

    public final Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    public int hashCode() {
        return this.customVariables.hashCode();
    }

    public String toString() {
        return b.n(new StringBuilder("CheckpointParams(customVariables="), this.customVariables, ')');
    }

    private CheckpointParams(Map<String, ? extends CustomVariableValue> map) {
        this.customVariables = CustomVariableKeyValidator.INSTANCE.validateAndFilter(map);
    }
}
