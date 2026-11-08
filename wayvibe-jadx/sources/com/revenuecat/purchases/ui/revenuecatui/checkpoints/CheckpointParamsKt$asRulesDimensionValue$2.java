package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import Z8.c;
import com.revenuecat.purchases.common.localrules.RulesDimensionValue;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointParamsKt$asRulesDimensionValue$2 extends n implements c {
    public static final CheckpointParamsKt$asRulesDimensionValue$2 INSTANCE = new CheckpointParamsKt$asRulesDimensionValue$2();

    public CheckpointParamsKt$asRulesDimensionValue$2() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final RulesDimensionValue invoke(double d10) {
        return new RulesDimensionValue.DoubleValue(d10);
    }
}
