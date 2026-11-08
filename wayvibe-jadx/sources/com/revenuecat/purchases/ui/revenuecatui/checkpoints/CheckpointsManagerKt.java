package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import B8.V;
import com.revenuecat.purchases.checkpoints.CheckpointResolution;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointsManagerKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckpointResolution.NoAction.Reason.values().length];
            try {
                iArr[CheckpointResolution.NoAction.Reason.NO_MATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckpointResolution.NoAction.Reason.CONFIGURATION_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckpointResolution.NoAction.Reason.UNKNOWN_CHECKPOINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckpointResult.NoAction.Reason toResultReason(CheckpointResolution.NoAction.Reason reason) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[reason.ordinal()];
        if (i10 == 1) {
            return CheckpointResult.NoAction.Reason.NO_MATCH;
        }
        if (i10 == 2) {
            return CheckpointResult.NoAction.Reason.CONFIGURATION_UNAVAILABLE;
        }
        if (i10 == 3) {
            return CheckpointResult.NoAction.Reason.UNKNOWN_CHECKPOINT;
        }
        throw new V();
    }
}
