package com.revenuecat.purchases.common.workflows;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import p219u9.a;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public enum WorkflowTriggerType {
    ON_PRESS,
    UNKNOWN;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return WorkflowTriggerTypeDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
