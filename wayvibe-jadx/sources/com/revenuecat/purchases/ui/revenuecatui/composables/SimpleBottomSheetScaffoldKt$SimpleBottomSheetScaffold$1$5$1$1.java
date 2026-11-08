package com.revenuecat.purchases.ui.revenuecatui.composables;

import M8.D;
import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5$1$1 extends n implements a {
    final /* synthetic */ SimpleSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5$1$1(SimpleSheetState simpleSheetState) {
        super(0);
        this.$sheetState = simpleSheetState;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m593invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m593invoke() {
        this.$sheetState.hide();
    }
}
