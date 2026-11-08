package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class VideoComponentViewKt$VideoComponentView$5$1 extends j implements Z8.e {
    public static final VideoComponentViewKt$VideoComponentView$5$1 INSTANCE = new VideoComponentViewKt$VideoComponentView$5$1();

    public VideoComponentViewKt$VideoComponentView$5$1() {
        super(2, AspectRatioKt.class, "aspectRatio", "aspectRatio(Landroidx/compose/ui/Modifier;Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;)Landroidx/compose/ui/Modifier;", 1);
    }

    @Override // Z8.e
    public final r invoke(r p10, AspectRatio p11) {
        m.f(p10, "p0");
        m.f(p11, "p1");
        return AspectRatioKt.aspectRatio(p10, p11);
    }
}
