package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import M8.D;
import U.InterfaceC0877b0;
import Z8.a;
import kotlin.jvm.internal.n;
import p089i1.i;

/* JADX INFO: loaded from: classes2.dex */
public final class TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$3 extends n implements a {
    final /* synthetic */ i $constraintSet;
    final /* synthetic */ InterfaceC0877b0 $remeasureRequesterState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$3(InterfaceC0877b0 interfaceC0877b0, i iVar) {
        super(0);
        this.$remeasureRequesterState = interfaceC0877b0;
        this.$constraintSet = iVar;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m509invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m509invoke() {
        InterfaceC0877b0 interfaceC0877b0 = this.$remeasureRequesterState;
        interfaceC0877b0.setValue(Boolean.valueOf(!((Boolean) interfaceC0877b0.getValue()).booleanValue()));
        this.$constraintSet.f20451d = true;
    }
}
