package com.revenuecat.purchases.paywalls.components;

import kotlin.jvm.internal.f;
import p219u9.a;

/* JADX INFO: loaded from: classes2.dex */
enum ActionTypeSurrogate {
    restore_purchases,
    navigate_back,
    navigate_to,
    workflow,
    close_workflow,
    unknown;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ActionTypeSurrogateDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
