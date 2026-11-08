package com.revenuecat.purchases.ui.revenuecatui.composables;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p080h4.f;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteImageKt$Image$placeholder$1$1 extends n implements c {
    public static final RemoteImageKt$Image$placeholder$1$1 INSTANCE = new RemoteImageKt$Image$placeholder$1$1();

    public RemoteImageKt$Image$placeholder$1$1() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((f) obj);
        return D.f8402a;
    }

    public final void invoke(f errorState) {
        m.f(errorState, "errorState");
        Logger.INSTANCE.e("Error loading placeholder image", errorState.f20268b.f25903c);
    }
}
