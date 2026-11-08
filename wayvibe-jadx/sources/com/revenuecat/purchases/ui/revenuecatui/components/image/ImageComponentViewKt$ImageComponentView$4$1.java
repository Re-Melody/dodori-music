package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Z8.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageComponentViewKt$ImageComponentView$4$1 extends n implements e {
    public static final ImageComponentViewKt$ImageComponentView$4$1 INSTANCE = new ImageComponentViewKt$ImageComponentView$4$1();

    public ImageComponentViewKt$ImageComponentView$4$1() {
        super(2);
    }

    @Override // Z8.e
    public final r invoke(r applyIfNotNull, AspectRatio it) {
        m.f(applyIfNotNull, "$this$applyIfNotNull");
        m.f(it, "it");
        return AspectRatioKt.aspectRatio(applyIfNotNull, it);
    }
}
