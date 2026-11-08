package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCustomerCenterKt$CustomerCenterNavHost$4$1 extends n implements Z8.a {
    final /* synthetic */ c $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterNavHost$4$1(c cVar) {
        super(0);
        this.$onAction = cVar;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m644invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m644invoke() {
        this.$onAction.invoke(CustomerCenterAction.PerformRestore.INSTANCE);
    }
}
