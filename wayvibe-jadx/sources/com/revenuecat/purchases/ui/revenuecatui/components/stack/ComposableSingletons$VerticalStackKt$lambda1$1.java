package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.C;
import M8.D;
import U.C0906q;
import U.InterfaceC0898m;
import Z8.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.ComposableSingletons$VerticalStackKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class ComposableSingletons$VerticalStackKt$lambda1$1 extends n implements f {
    public static final ComposableSingletons$VerticalStackKt$lambda1$1 INSTANCE = new ComposableSingletons$VerticalStackKt$lambda1$1();

    public ComposableSingletons$VerticalStackKt$lambda1$1() {
        super(3);
    }

    @Override // Z8.f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C) obj, (InterfaceC0898m) obj2, ((Number) obj3).intValue());
        return D.f8402a;
    }

    public final void invoke(C c3, InterfaceC0898m interfaceC0898m, int i10) {
        m.f(c3, "$this$null");
        if ((i10 & 17) == 16) {
            C0906q c0906q = (C0906q) interfaceC0898m;
            if (c0906q.z()) {
                c0906q.N();
            }
        }
    }
}
