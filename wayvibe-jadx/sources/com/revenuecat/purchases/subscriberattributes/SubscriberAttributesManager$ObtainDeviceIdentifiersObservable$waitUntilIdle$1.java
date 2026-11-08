package com.revenuecat.purchases.subscriberattributes;

import M8.D;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1 extends n implements Z8.a {
    final /* synthetic */ Z8.a $completion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(Z8.a aVar) {
        super(0);
        this.$completion = aVar;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m309invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m309invoke() {
        this.$completion.invoke();
    }
}
