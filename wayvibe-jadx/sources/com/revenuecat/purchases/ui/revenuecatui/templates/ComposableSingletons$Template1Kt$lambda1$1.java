package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.r;
import M8.D;
import U.C0906q;
import U.InterfaceC0898m;
import Z8.e;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import kotlin.jvm.internal.n;
import p067g0.o;
import p143n0.C2096x;
import p143n0.W;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.ComposableSingletons$Template1Kt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class ComposableSingletons$Template1Kt$lambda1$1 extends n implements e {
    public static final ComposableSingletons$Template1Kt$lambda1$1 INSTANCE = new ComposableSingletons$Template1Kt$lambda1$1();

    public ComposableSingletons$Template1Kt$lambda1$1() {
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
        r.a(d.b(d.c(a.c(o.f19964a, C2096x.f22799i, W.f22719a), 1.0f), 0.5f), interfaceC0898m, 6);
    }
}
