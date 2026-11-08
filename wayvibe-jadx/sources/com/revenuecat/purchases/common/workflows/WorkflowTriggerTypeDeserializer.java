package com.revenuecat.purchases.common.workflows;

import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkflowTriggerTypeDeserializer extends EnumDeserializerWithDefault<WorkflowTriggerType> {
    public static final WorkflowTriggerTypeDeserializer INSTANCE = new WorkflowTriggerTypeDeserializer();

    private WorkflowTriggerTypeDeserializer() {
        super(WorkflowTriggerType.UNKNOWN, null, 2, 0 == true ? 1 : 0);
    }
}
