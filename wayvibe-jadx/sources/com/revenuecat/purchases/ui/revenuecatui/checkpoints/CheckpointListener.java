package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public interface CheckpointListener {

    public static final class DefaultImpls {
        @Deprecated
        public static void onCheckpointCompleted(CheckpointListener checkpointListener, CheckpointCompletedContext context) {
            m.f(context, "context");
            CheckpointListener.super.onCheckpointCompleted(context);
        }

        @Deprecated
        public static void onCheckpointHit(CheckpointListener checkpointListener, CheckpointHitContext context) {
            m.f(context, "context");
            CheckpointListener.super.onCheckpointHit(context);
        }
    }

    default void onCheckpointCompleted(CheckpointCompletedContext context) {
        m.f(context, "context");
    }

    default void onCheckpointHit(CheckpointHitContext context) {
        m.f(context, "context");
    }
}
