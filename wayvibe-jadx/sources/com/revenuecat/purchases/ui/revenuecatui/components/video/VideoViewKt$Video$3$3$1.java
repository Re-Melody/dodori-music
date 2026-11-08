package com.revenuecat.purchases.ui.revenuecatui.components.video;

import M8.D;
import U.InterfaceC0877b0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoViewKt$Video$3$3$1 extends n implements Z8.c {
    final /* synthetic */ Z8.a $onReady;
    final /* synthetic */ InterfaceC0877b0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$3$3$1(InterfaceC0877b0 interfaceC0877b0, Z8.a aVar) {
        super(1);
        this.$videoView = interfaceC0877b0;
        this.$onReady = aVar;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextureVideoView) obj);
        return D.f8402a;
    }

    public final void invoke(TextureVideoView view) {
        m.f(view, "view");
        this.$videoView.setValue(view);
        view.setOnReadyCallback(this.$onReady);
    }
}
