package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p122l0.u;
import p122l0.w;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateSupportTicketViewKt$EmailInputField$2$1 extends n implements c {
    final /* synthetic */ EmailInputState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportTicketViewKt$EmailInputField$2$1(EmailInputState emailInputState) {
        super(1);
        this.$state = emailInputState;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u) obj);
        return D.f8402a;
    }

    public final void invoke(u focusState) {
        m.f(focusState, "focusState");
        this.$state.getOnFocusChanged().invoke(Boolean.valueOf(((w) focusState).g()));
    }
}
