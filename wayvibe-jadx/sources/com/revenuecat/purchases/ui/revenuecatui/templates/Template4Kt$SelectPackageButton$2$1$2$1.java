package com.revenuecat.purchases.ui.revenuecatui.templates;

import M0.t;
import M0.v;
import M8.D;
import O0.C0678g;
import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class Template4Kt$SelectPackageButton$2$1$2$1 extends n implements c {
    final /* synthetic */ String $discountText;
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template4Kt$SelectPackageButton$2$1$2$1(boolean z10, String str) {
        super(1);
        this.$isSelected = z10;
        this.$discountText = str;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((v) obj);
        return D.f8402a;
    }

    public final void invoke(v semantics) {
        m.f(semantics, "$this$semantics");
        t.f(semantics, this.$isSelected);
        String str = this.$discountText;
        if (str != null) {
            t.g(semantics, new C0678g(6, str, null));
        }
    }
}
