package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.a;
import Z8.e;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1 extends n implements e {
    final /* synthetic */ a $onCardClick;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements a {
        final /* synthetic */ a $onCardClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(0);
            this.$onCardClick = aVar;
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m718invoke();
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m718invoke() {
            a aVar = this.$onCardClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1(a aVar) {
        super(2);
        this.$onCardClick = aVar;
    }

    @Override // Z8.e
    public final r invoke(r applyIfNotNull, a it) {
        m.f(applyIfNotNull, "$this$applyIfNotNull");
        m.f(it, "it");
        return androidx.compose.foundation.a.f(applyIfNotNull, false, null, new AnonymousClass1(this.$onCardClick), 7);
    }
}
