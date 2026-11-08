package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.a;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class NoActiveUserManagementViewKt$NoActiveUserManagementView$1$1$1$1 extends n implements a {
    final /* synthetic */ c $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoActiveUserManagementViewKt$NoActiveUserManagementView$1$1$1$1(c cVar) {
        super(0);
        this.$onAction = cVar;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m714invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m714invoke() {
        this.$onAction.invoke(CustomerCenterAction.ShowPaywall.INSTANCE);
    }
}
