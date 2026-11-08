package com.apple.android.music.playback.controller;

import com.apple.android.music.playback.model.MediaPlayerException;
import com.apple.android.music.playback.model.PlayerQueueItem;
import com.apple.android.music.playback.queue.PlaybackQueueItemProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface MediaPlayerController {
    public static final long DURATION_UNKNOWN = -1;
    public static final int INDEX_UNSET = -1;
    public static final long POSITION_UNKNOWN = -1;

    public interface Listener {
        void onBufferingStateChanged(MediaPlayerController mediaPlayerController, boolean z10);

        void onCurrentItemChanged(MediaPlayerController mediaPlayerController, PlayerQueueItem playerQueueItem, PlayerQueueItem playerQueueItem2);

        void onItemEnded(MediaPlayerController mediaPlayerController, PlayerQueueItem playerQueueItem, long j10);

        void onMetadataUpdated(MediaPlayerController mediaPlayerController, PlayerQueueItem playerQueueItem);

        void onPlaybackError(MediaPlayerController mediaPlayerController, MediaPlayerException mediaPlayerException);

        void onPlaybackQueueChanged(MediaPlayerController mediaPlayerController, List<PlayerQueueItem> list);

        void onPlaybackQueueItemsAdded(MediaPlayerController mediaPlayerController, int i10, int i11, int i12);

        void onPlaybackRepeatModeChanged(MediaPlayerController mediaPlayerController, int i10);

        void onPlaybackShuffleModeChanged(MediaPlayerController mediaPlayerController, int i10);

        void onPlaybackStateChanged(MediaPlayerController mediaPlayerController, int i10, int i11);

        void onPlaybackStateUpdated(MediaPlayerController mediaPlayerController);

        void onPlayerStateRestored(MediaPlayerController mediaPlayerController);
    }

    void addListener(Listener listener);

    void addQueueItems(PlaybackQueueItemProvider playbackQueueItemProvider, int i10);

    boolean canAppendToPlaybackQueue();

    boolean canEditPlaybackQueue();

    boolean canPrependToPlaybackQueue();

    boolean canSeek();

    boolean canSetRepeatMode();

    boolean canSetShuffleMode();

    boolean canSkipToNextItem();

    boolean canSkipToPreviousItem();

    boolean canSkipToQueueItem();

    long getBufferedPosition();

    int getCurrentContainerIndex();

    String getCurrentContainerStoreId();

    int getCurrentContainerType();

    PlayerQueueItem getCurrentItem();

    long getCurrentPosition();

    long getDuration();

    int getPlaybackQueueIndex();

    int getPlaybackQueueItemCount();

    float getPlaybackRate();

    int getPlaybackState();

    List<PlayerQueueItem> getQueueItems();

    int getRepeatMode();

    int getShuffleMode();

    boolean isBuffering();

    boolean isLiveStream();

    void moveQueueItemWithId(long j10, long j11, int i10);

    void pause();

    void play();

    void prepare(PlaybackQueueItemProvider playbackQueueItemProvider);

    void prepare(PlaybackQueueItemProvider playbackQueueItemProvider, int i10, boolean z10);

    void prepare(PlaybackQueueItemProvider playbackQueueItemProvider, boolean z10);

    void release();

    void removeListener(Listener listener);

    void removeQueueItemWithId(long j10);

    void seekToPosition(long j10);

    void setRepeatMode(int i10);

    void setShuffleMode(int i10);

    void skipToNextItem();

    void skipToPreviousItem();

    void skipToQueueItemWithId(long j10);

    void stop();
}
