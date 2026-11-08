package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public abstract class CheckpointContext {
    public static final int $stable = 0;

    public abstract Map<String, CustomVariableValue> getCustomVariables();

    public abstract String getIdentifier();
}
