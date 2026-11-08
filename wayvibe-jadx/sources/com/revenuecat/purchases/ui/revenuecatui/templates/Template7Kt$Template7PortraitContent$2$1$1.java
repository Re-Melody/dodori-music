package com.revenuecat.purchases.ui.revenuecatui.templates;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class Template7Kt$Template7PortraitContent$2$1$1 extends n implements c {
    final /* synthetic */ c $onSelectTierChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template7Kt$Template7PortraitContent$2$1$1(c cVar) {
        super(1);
        this.$onSelectTierChange = cVar;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TemplateConfiguration.TierInfo) obj);
        return D.f8402a;
    }

    public final void invoke(TemplateConfiguration.TierInfo it) {
        m.f(it, "it");
        this.$onSelectTierChange.invoke(it);
    }
}
