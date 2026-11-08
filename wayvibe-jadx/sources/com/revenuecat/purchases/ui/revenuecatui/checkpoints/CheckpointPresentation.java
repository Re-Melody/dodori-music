package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import com.revenuecat.purchases.checkpoints.CheckpointResolution;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointPresentation {
    public static final int $stable = 8;
    private final Map<String, CustomVariableValue> customVariables;
    private final CheckpointResolution.MatchedWorkflow resolution;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckpointPresentation(CheckpointResolution.MatchedWorkflow resolution, Map<String, ? extends CustomVariableValue> customVariables) {
        m.f(resolution, "resolution");
        m.f(customVariables, "customVariables");
        this.resolution = resolution;
        this.customVariables = customVariables;
    }

    public final Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    public final CheckpointResolution.MatchedWorkflow getResolution() {
        return this.resolution;
    }
}
