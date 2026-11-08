package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Z8.a;
import com.google.android.gms.common.api.f;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CarouselComponentViewKt$CarouselComponentView$pagerState$1$1 extends n implements a {
    final /* synthetic */ CarouselComponentState $carouselState;
    final /* synthetic */ int $pageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$CarouselComponentView$pagerState$1$1(CarouselComponentState carouselComponentState, int i10) {
        super(0);
        this.$carouselState = carouselComponentState;
        this.$pageCount = i10;
    }

    @Override // Z8.a
    public final Integer invoke() {
        return Integer.valueOf(this.$carouselState.getLoop() ? f.API_PRIORITY_OTHER : this.$pageCount);
    }
}
