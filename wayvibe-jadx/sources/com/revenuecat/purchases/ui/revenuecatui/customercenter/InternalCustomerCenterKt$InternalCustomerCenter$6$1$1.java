package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class InternalCustomerCenterKt$InternalCustomerCenter$6$1$1 extends j implements Z8.a {
    public InternalCustomerCenterKt$InternalCustomerCenter$6$1$1(Object obj) {
        super(0, 0, CustomerCenterViewModel.class, obj, "clearActionError", "clearActionError()V");
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m648invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m648invoke() {
        ((CustomerCenterViewModel) this.receiver).clearActionError();
    }
}
