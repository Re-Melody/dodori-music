package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import Z8.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.localrules.RulesDimensionValue;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointParamsKt {
    @InternalRevenueCatAPI
    public static final /* synthetic */ CheckpointParams CheckpointParams(c block) {
        m.f(block, "block");
        CheckpointParams.Builder builder = new CheckpointParams.Builder();
        block.invoke(builder);
        return builder.build();
    }

    public static final RulesDimensionValue getAsRulesDimensionValue(CustomVariableValue customVariableValue) {
        m.f(customVariableValue, "<this>");
        return (RulesDimensionValue) customVariableValue.map$revenuecatui_defaultsRelease(CheckpointParamsKt$asRulesDimensionValue$1.INSTANCE, CheckpointParamsKt$asRulesDimensionValue$2.INSTANCE, CheckpointParamsKt$asRulesDimensionValue$3.INSTANCE);
    }

    public static /* synthetic */ void getAsRulesDimensionValue$annotations(CustomVariableValue customVariableValue) {
    }
}
