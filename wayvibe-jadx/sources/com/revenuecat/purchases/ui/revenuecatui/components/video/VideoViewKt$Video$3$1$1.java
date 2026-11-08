package com.revenuecat.purchases.ui.revenuecatui.components.video;

import U.InterfaceC0877b0;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoViewKt$Video$3$1$1 extends n implements Z8.c {
    final /* synthetic */ boolean $autoPlay;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $loop;
    final /* synthetic */ boolean $muteAudio;
    final /* synthetic */ Z8.a $onReady;
    final /* synthetic */ Map<String, VideoPlaybackState> $savedState;
    final /* synthetic */ TextureVideoView.ScaleType $scaleType;
    final /* synthetic */ boolean $showControls;
    final /* synthetic */ String $videoUri;
    final /* synthetic */ InterfaceC0877b0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$3$1$1(Map<String, VideoPlaybackState> map, String str, boolean z10, String str2, boolean z11, boolean z12, InterfaceC0877b0 interfaceC0877b0, TextureVideoView.ScaleType scaleType, boolean z13, Z8.a aVar) {
        super(1);
        this.$savedState = map;
        this.$key = str;
        this.$autoPlay = z10;
        this.$videoUri = str2;
        this.$showControls = z11;
        this.$muteAudio = z12;
        this.$videoView = interfaceC0877b0;
        this.$scaleType = scaleType;
        this.$loop = z13;
        this.$onReady = aVar;
    }

    @Override // Z8.c
    public final TextureVideoView invoke(Context ctx) {
        m.f(ctx, "ctx");
        VideoPlaybackState videoPlaybackState = this.$savedState.get(this.$key);
        if (videoPlaybackState == null) {
            videoPlaybackState = new VideoPlaybackState(0, this.$autoPlay);
        }
        int iMax = Math.max(videoPlaybackState.getPositionMs(), videoPlaybackState.getPositionMs());
        boolean playWhenReady = iMax > 0 ? videoPlaybackState.getPlayWhenReady() : this.$autoPlay;
        Uri uri = Uri.parse(this.$videoUri);
        TextureVideoView textureVideoView = new TextureVideoView(ctx, null, this.$showControls, this.$muteAudio, 2, null);
        InterfaceC0877b0 interfaceC0877b0 = this.$videoView;
        TextureVideoView.ScaleType scaleType = this.$scaleType;
        boolean z10 = this.$loop;
        Z8.a aVar = this.$onReady;
        interfaceC0877b0.setValue(textureVideoView);
        textureVideoView.setScaleType(scaleType);
        textureVideoView.setLooping(z10);
        textureVideoView.setAutoStart(playWhenReady);
        textureVideoView.setOnReadyCallback(aVar);
        textureVideoView.setVideoURI(uri);
        if (iMax > 0) {
            textureVideoView.setPlaybackState(new TextureVideoView.PlaybackState(iMax, playWhenReady));
        }
        return textureVideoView;
    }
}
