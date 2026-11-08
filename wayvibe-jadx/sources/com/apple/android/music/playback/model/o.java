package com.apple.android.music.playback.model;

import com.apple.android.music.playback.queue.PlaybackQueueItemProvider;

/* JADX INFO: loaded from: classes.dex */
public final class o extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PlaybackQueueItemProvider f17461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17462b;

    public o(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        this.f17461a = playbackQueueItemProvider;
        this.f17462b = i10;
    }

    public int a() {
        return 2;
    }
}
