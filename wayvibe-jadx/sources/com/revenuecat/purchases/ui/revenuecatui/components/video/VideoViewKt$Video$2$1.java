package com.revenuecat.purchases.ui.revenuecatui.components.video;

import U.F;
import U.G;
import U.InterfaceC0877b0;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoViewKt$Video$2$1 extends n implements Z8.c {
    final /* synthetic */ String $key;
    final /* synthetic */ Map<String, VideoPlaybackState> $savedState;
    final /* synthetic */ InterfaceC0877b0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$2$1(InterfaceC0877b0 interfaceC0877b0, Map<String, VideoPlaybackState> map, String str) {
        super(1);
        this.$videoView = interfaceC0877b0;
        this.$savedState = map;
        this.$key = str;
    }

    @Override // Z8.c
    public final F invoke(G DisposableEffect) {
        m.f(DisposableEffect, "$this$DisposableEffect");
        final InterfaceC0877b0 interfaceC0877b0 = this.$videoView;
        final Map<String, VideoPlaybackState> map = this.$savedState;
        final String str = this.$key;
        return new F() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoViewKt$Video$2$1$invoke$$inlined$onDispose$1
            @Override // U.F
            public void dispose() {
                TextureVideoView textureVideoView = (TextureVideoView) interfaceC0877b0.getValue();
                if (textureVideoView != null) {
                    TextureVideoView.PlaybackState playbackState = textureVideoView.getPlaybackState();
                    map.put(str, new VideoPlaybackState(playbackState.getPositionMs(), playbackState.getPlayWhenReady()));
                }
            }
        };
    }
}
