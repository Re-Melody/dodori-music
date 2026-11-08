package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import java.util.Map;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class CheckpointHitContext extends CheckpointContext {
    public static final int $stable = 8;
    private final Map<String, CustomVariableValue> customVariables;
    private final String identifier;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckpointHitContext(String identifier, Map<String, ? extends CustomVariableValue> customVariables) {
        m.f(identifier, "identifier");
        m.f(customVariables, "customVariables");
        this.identifier = identifier;
        this.customVariables = customVariables;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckpointHitContext)) {
            return false;
        }
        CheckpointHitContext checkpointHitContext = (CheckpointHitContext) obj;
        return m.b(this.identifier, checkpointHitContext.identifier) && m.b(this.customVariables, checkpointHitContext.customVariables);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.checkpoints.CheckpointContext
    public Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.checkpoints.CheckpointContext
    public String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.customVariables.hashCode() + (this.identifier.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CheckpointHitContext(identifier=");
        sb.append(this.identifier);
        sb.append(", customVariables=");
        return b.n(sb, this.customVariables, ')');
    }
}
