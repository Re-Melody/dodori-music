package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Q.F;
import Q.I;
import Q.L0;
import Q.c1;
import U.C0906q;
import U.InterfaceC0898m;
import U.Z0;
import Z8.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$CreateSupportTicketViewKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class ComposableSingletons$CreateSupportTicketViewKt$lambda1$1 extends n implements f {
    public static final ComposableSingletons$CreateSupportTicketViewKt$lambda1$1 INSTANCE = new ComposableSingletons$CreateSupportTicketViewKt$lambda1$1();

    public ComposableSingletons$CreateSupportTicketViewKt$lambda1$1() {
        super(3);
    }

    @Override // Z8.f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((L0) obj, (InterfaceC0898m) obj2, ((Number) obj3).intValue());
        return D.f8402a;
    }

    public final void invoke(L0 snackbarData, InterfaceC0898m interfaceC0898m, int i10) {
        int i11;
        m.f(snackbarData, "snackbarData");
        if ((i10 & 6) == 0) {
            i11 = i10 | (((C0906q) interfaceC0898m).f(snackbarData) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 19) == 18) {
            C0906q c0906q = (C0906q) interfaceC0898m;
            if (c0906q.z()) {
                c0906q.N();
                return;
            }
        }
        Z0 z1 = I.f9905a;
        C0906q c0906q2 = (C0906q) interfaceC0898m;
        c1.b(snackbarData, null, null, ((F) c0906q2.k(z1)).f9884y, ((F) c0906q2.k(z1)).f9885z, 0L, 0L, 0L, interfaceC0898m, i11 & 14, 462);
    }
}
