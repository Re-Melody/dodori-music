package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import N8.y;
import Z8.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class VariableProcessor$VariableName$Companion$valueMap$2 extends n implements a {
    public static final VariableProcessor$VariableName$Companion$valueMap$2 INSTANCE = new VariableProcessor$VariableName$Companion$valueMap$2();

    public VariableProcessor$VariableName$Companion$valueMap$2() {
        super(0);
    }

    @Override // Z8.a
    public final Map<String, VariableProcessor.VariableName> invoke() {
        VariableProcessor.VariableName[] variableNameArrValues = VariableProcessor.VariableName.values();
        int iE0 = y.e0(variableNameArrValues.length);
        if (iE0 < 16) {
            iE0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iE0);
        for (VariableProcessor.VariableName variableName : variableNameArrValues) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
