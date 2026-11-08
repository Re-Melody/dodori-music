package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import Z8.c;
import com.revenuecat.purchases.common.localrules.RulesDimensionValue;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointParamsKt$asRulesDimensionValue$1 extends n implements c {
    public static final CheckpointParamsKt$asRulesDimensionValue$1 INSTANCE = new CheckpointParamsKt$asRulesDimensionValue$1();

    public CheckpointParamsKt$asRulesDimensionValue$1() {
        super(1);
    }

    @Override // Z8.c
    public final RulesDimensionValue invoke(String it) {
        m.f(it, "it");
        return new RulesDimensionValue.StringValue(it);
    }
}
