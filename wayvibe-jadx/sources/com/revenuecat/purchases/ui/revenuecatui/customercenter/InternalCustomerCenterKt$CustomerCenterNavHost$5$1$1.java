package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCustomerCenterKt$CustomerCenterNavHost$5$1$1 extends n implements Z8.a {
    final /* synthetic */ String $email;
    final /* synthetic */ c $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterNavHost$5$1$1(c cVar, String str) {
        super(0);
        this.$onAction = cVar;
        this.$email = str;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m645invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m645invoke() {
        this.$onAction.invoke(new CustomerCenterAction.ContactSupport(this.$email));
    }
}
