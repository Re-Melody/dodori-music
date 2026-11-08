package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import U.C0906q;
import U.InterfaceC0898m;
import Z8.e;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$CustomerCenterLoadingViewKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class ComposableSingletons$CustomerCenterLoadingViewKt$lambda1$1 extends n implements e {
    public static final ComposableSingletons$CustomerCenterLoadingViewKt$lambda1$1 INSTANCE = new ComposableSingletons$CustomerCenterLoadingViewKt$lambda1$1();

    public ComposableSingletons$CustomerCenterLoadingViewKt$lambda1$1() {
        super(2);
    }

    @Override // Z8.e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC0898m) obj, ((Number) obj2).intValue());
        return D.f8402a;
    }

    public final void invoke(InterfaceC0898m interfaceC0898m, int i10) {
        if ((i10 & 3) == 2) {
            C0906q c0906q = (C0906q) interfaceC0898m;
            if (c0906q.z()) {
                c0906q.N();
                return;
            }
        }
        CustomerCenterLoadingViewKt.CustomerCenterLoadingView(interfaceC0898m, 0);
    }
}
