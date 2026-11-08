package com.revenuecat.purchases.ui.revenuecatui.components.video;

import M8.D;
import U.InterfaceC0877b0;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoViewKt$Video$3$2$1 extends n implements Z8.c {
    final /* synthetic */ String $key;
    final /* synthetic */ Map<String, VideoPlaybackState> $savedState;
    final /* synthetic */ InterfaceC0877b0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$3$2$1(InterfaceC0877b0 interfaceC0877b0, Map<String, VideoPlaybackState> map, String str) {
        super(1);
        this.$videoView = interfaceC0877b0;
        this.$savedState = map;
        this.$key = str;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextureVideoView) obj);
        return D.f8402a;
    }

    public final void invoke(TextureVideoView view) {
        m.f(view, "view");
        Map<String, VideoPlaybackState> map = this.$savedState;
        String str = this.$key;
        TextureVideoView.PlaybackState playbackState = view.getPlaybackState();
        map.put(str, new VideoPlaybackState(playbackState.getPositionMs(), playbackState.getPlayWhenReady()));
        view.release();
        this.$videoView.setValue(null);
    }
}
