package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import Z8.c;
import com.revenuecat.purchases.common.localrules.RulesDimensionValue;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointParamsKt$asRulesDimensionValue$3 extends n implements c {
    public static final CheckpointParamsKt$asRulesDimensionValue$3 INSTANCE = new CheckpointParamsKt$asRulesDimensionValue$3();

    public CheckpointParamsKt$asRulesDimensionValue$3() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }

    public final RulesDimensionValue invoke(boolean z10) {
        return new RulesDimensionValue.BoolValue(z10);
    }
}
