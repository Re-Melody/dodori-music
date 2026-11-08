package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import java.util.Map;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class CheckpointCompletedContext extends CheckpointContext {
    public static final int $stable = 8;
    private final Map<String, CustomVariableValue> customVariables;
    private final String identifier;
    private final CheckpointResult result;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckpointCompletedContext(String identifier, Map<String, ? extends CustomVariableValue> customVariables, CheckpointResult result) {
        m.f(identifier, "identifier");
        m.f(customVariables, "customVariables");
        m.f(result, "result");
        this.identifier = identifier;
        this.customVariables = customVariables;
        this.result = result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckpointCompletedContext)) {
            return false;
        }
        CheckpointCompletedContext checkpointCompletedContext = (CheckpointCompletedContext) obj;
        return m.b(this.identifier, checkpointCompletedContext.identifier) && m.b(this.customVariables, checkpointCompletedContext.customVariables) && m.b(this.result, checkpointCompletedContext.result);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.checkpoints.CheckpointContext
    public Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.checkpoints.CheckpointContext
    public String getIdentifier() {
        return this.identifier;
    }

    public final CheckpointResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode() + b.e(this.identifier.hashCode() * 31, 31, this.customVariables);
    }

    public String toString() {
        return "CheckpointCompletedContext(identifier=" + this.identifier + ", customVariables=" + this.customVariables + ", result=" + this.result + ')';
    }
}
