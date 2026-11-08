package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import M8.D;
import Z8.a;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$2$1$1 extends n implements a {
    final /* synthetic */ c $onSelectPackage;
    final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1$2$1$1(c cVar, TemplateConfiguration.PackageInfo packageInfo) {
        super(0);
        this.$onSelectPackage = cVar;
        this.$packageInfo = packageInfo;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m773invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m773invoke() {
        this.$onSelectPackage.invoke(this.$packageInfo);
    }
}
