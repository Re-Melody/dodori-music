package com.apple.android.music.playback.queue;

import com.apple.android.music.playback.model.PlayerMediaItem;
import com.apple.android.music.playback.model.PlayerQueueItem;

/* JADX INFO: loaded from: classes.dex */
final class d implements PlayerQueueItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PlayerMediaItem f17536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17537b;

    public d(PlayerMediaItem playerMediaItem, long j10) {
        this.f17536a = playerMediaItem;
        this.f17537b = j10;
    }

    @Override // com.apple.android.music.playback.model.PlayerQueueItem
    public PlayerMediaItem getItem() {
        return this.f17536a;
    }

    @Override // com.apple.android.music.playback.model.PlayerQueueItem
    public long getPlaybackQueueId() {
        return this.f17537b;
    }
}
