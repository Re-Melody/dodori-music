package com.revenuecat.purchases.common;

import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.events.BackendEvent;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class StorePlatformKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getPlatformName(Store store) {
        m.f(store, "<this>");
        return WhenMappings.$EnumSwitchMapping$0[store.ordinal()] == 1 ? "amazon" : BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM;
    }
}
