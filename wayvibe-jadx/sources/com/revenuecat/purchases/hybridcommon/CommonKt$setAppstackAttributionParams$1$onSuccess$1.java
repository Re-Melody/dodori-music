package com.revenuecat.purchases.hybridcommon;

import M8.D;
import Z8.c;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonKt$setAppstackAttributionParams$1$onSuccess$1 extends n implements c {
    final /* synthetic */ OnResult $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$setAppstackAttributionParams$1$onSuccess$1(OnResult onResult) {
        super(1);
        this.$onResult = onResult;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, ? extends Object>) obj);
        return D.f8402a;
    }

    public final void invoke(Map<String, ? extends Object> map) {
        m.f(map, "map");
        this.$onResult.onReceived(map);
    }
}
