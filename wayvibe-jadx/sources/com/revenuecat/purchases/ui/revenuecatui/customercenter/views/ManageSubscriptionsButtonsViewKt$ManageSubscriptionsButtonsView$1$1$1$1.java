package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.a;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$1$1$1 extends n implements a {
    final /* synthetic */ c $onAction;
    final /* synthetic */ CustomerCenterAction.PathButtonPressed $pathButtonPressed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$1$1$1(c cVar, CustomerCenterAction.PathButtonPressed pathButtonPressed) {
        super(0);
        this.$onAction = cVar;
        this.$pathButtonPressed = pathButtonPressed;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m711invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m711invoke() {
        this.$onAction.invoke(this.$pathButtonPressed);
    }
}
