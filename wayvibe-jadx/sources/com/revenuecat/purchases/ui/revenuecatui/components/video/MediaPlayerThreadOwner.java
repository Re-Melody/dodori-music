package com.revenuecat.purchases.ui.revenuecatui.components.video;

import F2.T;
import M8.D;
import V0.p;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaPlayerThreadOwner {

    @Deprecated
    public static final long DETACH_SURFACE_AWAIT_TIMEOUT_MS = 1000;

    @Deprecated
    public static final long POSITION_POLL_INTERVAL_MS = 250;
    private final Context appContext;
    private Surface currentSurface;
    private boolean looping;
    private final Handler mainHandler;
    private final boolean muteAudio;
    private volatile PendingPlaybackState pendingPlaybackState;
    private final AtomicLong playbackCommandId;
    private volatile PlaybackSnapshot playbackSnapshot;
    private MediaPlayer player;
    private final Z8.a playerFactory;
    private final MediaPlayerThreadOwner$positionTicker$1 positionTicker;
    private boolean positionTickerScheduled;
    private volatile boolean released;
    private final Handler workerHandler;
    private final HandlerThread workerThread;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements Z8.a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // Z8.a
        public final MediaPlayer invoke() {
            return new MediaPlayer();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class PendingPlaybackState {
        private final long commandId;
        private final boolean isPlaying;

        public PendingPlaybackState(boolean z10, long j10) {
            this.isPlaying = z10;
            this.commandId = j10;
        }

        public static /* synthetic */ PendingPlaybackState copy$default(PendingPlaybackState pendingPlaybackState, boolean z10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = pendingPlaybackState.isPlaying;
            }
            if ((i10 & 2) != 0) {
                j10 = pendingPlaybackState.commandId;
            }
            return pendingPlaybackState.copy(z10, j10);
        }

        public final boolean component1() {
            return this.isPlaying;
        }

        public final long component2() {
            return this.commandId;
        }

        public final PendingPlaybackState copy(boolean z10, long j10) {
            return new PendingPlaybackState(z10, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingPlaybackState)) {
                return false;
            }
            PendingPlaybackState pendingPlaybackState = (PendingPlaybackState) obj;
            return this.isPlaying == pendingPlaybackState.isPlaying && this.commandId == pendingPlaybackState.commandId;
        }

        public final long getCommandId() {
            return this.commandId;
        }

        public int hashCode() {
            return Long.hashCode(this.commandId) + (Boolean.hashCode(this.isPlaying) * 31);
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            return "PendingPlaybackState(isPlaying=" + this.isPlaying + ", commandId=" + this.commandId + ')';
        }
    }

    public static final class PlaybackSnapshot {
        private final int audioSessionId;
        private final int currentPositionMs;
        private final int durationMs;
        private final boolean isPlaying;
        private final boolean prepared;

        public PlaybackSnapshot() {
            this(false, 0, 0, false, 0, 31, null);
        }

        public static /* synthetic */ PlaybackSnapshot copy$default(PlaybackSnapshot playbackSnapshot, boolean z10, int i10, int i11, boolean z11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z10 = playbackSnapshot.prepared;
            }
            if ((i13 & 2) != 0) {
                i10 = playbackSnapshot.durationMs;
            }
            if ((i13 & 4) != 0) {
                i11 = playbackSnapshot.currentPositionMs;
            }
            if ((i13 & 8) != 0) {
                z11 = playbackSnapshot.isPlaying;
            }
            if ((i13 & 16) != 0) {
                i12 = playbackSnapshot.audioSessionId;
            }
            int i14 = i12;
            int i15 = i11;
            return playbackSnapshot.copy(z10, i10, i15, z11, i14);
        }

        public final boolean component1() {
            return this.prepared;
        }

        public final int component2() {
            return this.durationMs;
        }

        public final int component3() {
            return this.currentPositionMs;
        }

        public final boolean component4() {
            return this.isPlaying;
        }

        public final int component5() {
            return this.audioSessionId;
        }

        public final PlaybackSnapshot copy(boolean z10, int i10, int i11, boolean z11, int i12) {
            return new PlaybackSnapshot(z10, i10, i11, z11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaybackSnapshot)) {
                return false;
            }
            PlaybackSnapshot playbackSnapshot = (PlaybackSnapshot) obj;
            return this.prepared == playbackSnapshot.prepared && this.durationMs == playbackSnapshot.durationMs && this.currentPositionMs == playbackSnapshot.currentPositionMs && this.isPlaying == playbackSnapshot.isPlaying && this.audioSessionId == playbackSnapshot.audioSessionId;
        }

        public final int getAudioSessionId() {
            return this.audioSessionId;
        }

        public final int getCurrentPositionMs() {
            return this.currentPositionMs;
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final boolean getPrepared() {
            return this.prepared;
        }

        public int hashCode() {
            return Integer.hashCode(this.audioSessionId) + p134m1.b.f(p134m1.b.c(this.currentPositionMs, p134m1.b.c(this.durationMs, Boolean.hashCode(this.prepared) * 31, 31), 31), 31, this.isPlaying);
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PlaybackSnapshot(prepared=");
            sb.append(this.prepared);
            sb.append(", durationMs=");
            sb.append(this.durationMs);
            sb.append(", currentPositionMs=");
            sb.append(this.currentPositionMs);
            sb.append(", isPlaying=");
            sb.append(this.isPlaying);
            sb.append(", audioSessionId=");
            return p.q(sb, this.audioSessionId, ')');
        }

        public PlaybackSnapshot(boolean z10, int i10, int i11, boolean z11, int i12) {
            this.prepared = z10;
            this.durationMs = i10;
            this.currentPositionMs = i11;
            this.isPlaying = z11;
            this.audioSessionId = i12;
        }

        public /* synthetic */ PlaybackSnapshot(boolean z10, int i10, int i11, boolean z11, int i12, int i13, kotlin.jvm.internal.f fVar) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? 0 : i12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$pause$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16501 extends n implements Z8.a {
        final /* synthetic */ long $commandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16501(long j10) {
            super(0);
            this.$commandId = j10;
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m511invoke();
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m511invoke() {
            if (!MediaPlayerThreadOwner.this.playbackSnapshot.getPrepared()) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayer mediaPlayer = MediaPlayerThreadOwner.this.player;
            if (mediaPlayer == null) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                }
                PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
                int currentPositionMs = playbackSnapshot.getCurrentPositionMs();
                try {
                    currentPositionMs = mediaPlayer.getCurrentPosition();
                } catch (Exception unused) {
                }
                mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, currentPositionMs, false, 0, 19, null);
                mediaPlayerThreadOwner.stopPositionTicker();
            } catch (Exception e2) {
                String str = "Could not pause media player: " + e2.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                }
            }
            MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$prepare$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16511 extends n implements Z8.a {
        final /* synthetic */ Z8.e $onPrepared;
        final /* synthetic */ Z8.e $onVideoSizeChanged;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16511(Uri uri, Z8.e eVar, Z8.e eVar2) {
            super(0);
            this.$uri = uri;
            this.$onPrepared = eVar;
            this.$onVideoSizeChanged = eVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$10(MediaPlayerThreadOwner mediaPlayerThreadOwner, Z8.e eVar, MediaPlayer mediaPlayer, int i10, int i11) {
            if (mediaPlayerThreadOwner.released) {
                return;
            }
            mediaPlayerThreadOwner.mainHandler.post(new b(mediaPlayerThreadOwner, eVar, i10, i11, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$10$lambda$9(MediaPlayerThreadOwner mediaPlayerThreadOwner, Z8.e eVar, int i10, int i11) {
            if (mediaPlayerThreadOwner.released) {
                return;
            }
            eVar.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$13(MediaPlayerThreadOwner mediaPlayerThreadOwner, MediaPlayer mediaPlayer) {
            if (mediaPlayer == null) {
                return;
            }
            PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
            int durationMs = playbackSnapshot.getDurationMs();
            try {
                durationMs = mediaPlayer.getCurrentPosition();
            } catch (Exception unused) {
            }
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, durationMs, false, 0, 19, null);
            MediaPlayerThreadOwner.clearPendingPlaybackState$default(mediaPlayerThreadOwner, null, 1, null);
            mediaPlayerThreadOwner.stopPositionTicker();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$8(MediaPlayerThreadOwner mediaPlayerThreadOwner, Z8.e eVar, MediaPlayer mediaPlayer) {
            int videoWidth;
            int videoHeight;
            int duration;
            if (mediaPlayerThreadOwner.released || mediaPlayer == null) {
                return;
            }
            int currentPosition = 0;
            try {
                videoWidth = mediaPlayer.getVideoWidth();
            } catch (Exception unused) {
                videoWidth = 0;
            }
            try {
                videoHeight = mediaPlayer.getVideoHeight();
            } catch (Exception unused2) {
                videoHeight = 0;
            }
            PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
            try {
                duration = mediaPlayer.getDuration();
            } catch (Exception unused3) {
                duration = 0;
            }
            try {
                currentPosition = mediaPlayer.getCurrentPosition();
            } catch (Exception unused4) {
            }
            int i10 = currentPosition;
            int audioSessionId = playbackSnapshot.getAudioSessionId();
            try {
                audioSessionId = mediaPlayer.getAudioSessionId();
            } catch (Exception unused5) {
            }
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, true, duration, i10, false, audioSessionId, 8, null);
            mediaPlayerThreadOwner.mainHandler.post(new b(mediaPlayerThreadOwner, eVar, videoWidth, videoHeight, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$8$lambda$7(MediaPlayerThreadOwner mediaPlayerThreadOwner, Z8.e eVar, int i10, int i11) {
            if (mediaPlayerThreadOwner.released) {
                return;
            }
            eVar.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m512invoke();
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m512invoke() {
            MediaPlayerThreadOwner.clearPendingPlaybackState$default(MediaPlayerThreadOwner.this, null, 1, null);
            MediaPlayer mediaPlayerEnsurePlayer = MediaPlayerThreadOwner.this.ensurePlayer();
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, 0, false, 0, 16, null);
            MediaPlayerThreadOwner.this.stopPositionTicker();
            final MediaPlayerThreadOwner mediaPlayerThreadOwner2 = MediaPlayerThreadOwner.this;
            Uri uri = this.$uri;
            final Z8.e eVar = this.$onPrepared;
            final Z8.e eVar2 = this.$onVideoSizeChanged;
            try {
                mediaPlayerEnsurePlayer.reset();
                Surface surface = mediaPlayerThreadOwner2.currentSurface;
                if (surface != null) {
                    mediaPlayerEnsurePlayer.setSurface(surface);
                } else {
                    Logger.INSTANCE.w("TextureVideoView: Preparing media player without a surface.Audio may play before video is attached.");
                }
                mediaPlayerEnsurePlayer.setLooping(mediaPlayerThreadOwner2.looping);
                if (mediaPlayerThreadOwner2.muteAudio) {
                    mediaPlayerEnsurePlayer.setVolume(0.0f, 0.0f);
                }
                mediaPlayerEnsurePlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.c
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        MediaPlayerThreadOwner.C16511.invoke$lambda$14$lambda$8(mediaPlayerThreadOwner2, eVar, mediaPlayer);
                    }
                });
                mediaPlayerEnsurePlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.d
                    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                        MediaPlayerThreadOwner.C16511.invoke$lambda$14$lambda$10(mediaPlayerThreadOwner2, eVar2, mediaPlayer, i10, i11);
                    }
                });
                mediaPlayerEnsurePlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.e
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        MediaPlayerThreadOwner.C16511.invoke$lambda$14$lambda$13(mediaPlayerThreadOwner2, mediaPlayer);
                    }
                });
                mediaPlayerEnsurePlayer.setDataSource(mediaPlayerThreadOwner2.appContext, uri);
                mediaPlayerEnsurePlayer.prepareAsync();
            } catch (Exception e2) {
                String str = "Could not prepare media player: " + e2.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$safely$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16521 extends n implements Z8.c {
        public static final C16521 INSTANCE = new C16521();

        public C16521() {
            super(1);
        }

        @Override // Z8.c
        public final Void invoke(Exception it) {
            m.f(it, "it");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$seekTo$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16531 extends n implements Z8.a {
        final /* synthetic */ int $positionMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16531(int i10) {
            super(0);
            this.$positionMs = i10;
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m513invoke();
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m513invoke() {
            MediaPlayer mediaPlayer;
            if (!MediaPlayerThreadOwner.this.playbackSnapshot.getPrepared() || this.$positionMs < 0 || (mediaPlayer = MediaPlayerThreadOwner.this.player) == null) {
                return;
            }
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            int i10 = this.$positionMs;
            try {
                mediaPlayer.seekTo(i10);
                mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, i10, false, 0, 27, null);
            } catch (Exception e2) {
                String str = "Could not seek media player: " + e2.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$setLooping$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16541 extends n implements Z8.a {
        final /* synthetic */ boolean $loop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16541(boolean z10) {
            super(0);
            this.$loop = z10;
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m514invoke();
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m514invoke() {
            D d10;
            MediaPlayerThreadOwner.this.looping = this.$loop;
            MediaPlayer mediaPlayer = MediaPlayerThreadOwner.this.player;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setLooping(this.$loop);
                } catch (Exception e2) {
                    String str = "Could not set looping mode: " + e2.getMessage();
                    if (str != null) {
                        Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                    }
                }
                d10 = D.f8402a;
            } else {
                d10 = null;
            }
            if (d10 == null) {
                Logger.INSTANCE.w("TextureVideoView: Looping was set before media player initialization. Value cached for prepare.");
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$setSurface$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16551 extends n implements Z8.a {
        final /* synthetic */ Surface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16551(Surface surface) {
            super(0);
            this.$surface = surface;
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m515invoke();
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m515invoke() {
            MediaPlayerThreadOwner.this.setSurfaceInternal(this.$surface);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$start$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16561 extends n implements Z8.a {
        final /* synthetic */ long $commandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16561(long j10) {
            super(0);
            this.$commandId = j10;
        }

        @Override // Z8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m516invoke();
            return D.f8402a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m516invoke() {
            if (!MediaPlayerThreadOwner.this.playbackSnapshot.getPrepared()) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayer mediaPlayer = MediaPlayerThreadOwner.this.player;
            if (mediaPlayer == null) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            try {
                mediaPlayer.start();
                mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, 0, true, 0, 23, null);
                mediaPlayerThreadOwner.startPositionTicker();
            } catch (Exception e2) {
                String str = "Could not start media player: " + e2.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                }
            }
            MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
        }
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$positionTicker$1] */
    public MediaPlayerThreadOwner(Context context, boolean z10, Z8.a playerFactory) {
        m.f(context, "context");
        m.f(playerFactory, "playerFactory");
        this.muteAudio = z10;
        this.playerFactory = playerFactory;
        this.appContext = context.getApplicationContext();
        this.mainHandler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("RC-TextureVideoViewPlayer");
        handlerThread.start();
        this.workerThread = handlerThread;
        this.workerHandler = new Handler(handlerThread.getLooper());
        this.playbackSnapshot = new PlaybackSnapshot(false, 0, 0, false, 0, 31, null);
        this.playbackCommandId = new AtomicLong(0L);
        this.positionTicker = new Runnable() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$positionTicker$1
            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPlaying;
                if (this.this$0.released) {
                    this.this$0.positionTickerScheduled = false;
                    return;
                }
                MediaPlayer mediaPlayer = this.this$0.player;
                if (mediaPlayer == null || !this.this$0.playbackSnapshot.getPrepared()) {
                    this.this$0.positionTickerScheduled = false;
                    return;
                }
                try {
                    zIsPlaying = mediaPlayer.isPlaying();
                } catch (Exception unused) {
                    zIsPlaying = false;
                }
                MediaPlayerThreadOwner mediaPlayerThreadOwner = this.this$0;
                MediaPlayerThreadOwner.PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
                int currentPositionMs = playbackSnapshot.getCurrentPositionMs();
                try {
                    currentPositionMs = mediaPlayer.getCurrentPosition();
                } catch (Exception unused2) {
                }
                mediaPlayerThreadOwner.playbackSnapshot = MediaPlayerThreadOwner.PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, currentPositionMs, zIsPlaying, 0, 19, null);
                if (zIsPlaying) {
                    this.this$0.workerHandler.postDelayed(this, 250L);
                } else {
                    this.this$0.positionTickerScheduled = false;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPendingPlaybackState(Long l10) {
        PendingPlaybackState pendingPlaybackState = this.pendingPlaybackState;
        if (pendingPlaybackState == null) {
            return;
        }
        if (l10 == null || pendingPlaybackState.getCommandId() == l10.longValue()) {
            this.pendingPlaybackState = null;
        }
    }

    public static /* synthetic */ void clearPendingPlaybackState$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        mediaPlayerThreadOwner.clearPendingPlaybackState(l10);
    }

    public static /* synthetic */ void clearSurfaceBlocking$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surface = null;
        }
        mediaPlayerThreadOwner.clearSurfaceBlocking(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSurfaceBlocking$lambda$1(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface, CountDownLatch countDownLatch) {
        try {
            mediaPlayerThreadOwner.detachAndReleaseSurface(surface);
        } finally {
            countDownLatch.countDown();
        }
    }

    private final void detachAndReleaseSurface(Surface surface) {
        setSurfaceInternal(null);
        releaseSurface(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaPlayer ensurePlayer() {
        int audioSessionId;
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            return mediaPlayer;
        }
        MediaPlayer mediaPlayer2 = (MediaPlayer) this.playerFactory.invoke();
        this.player = mediaPlayer2;
        PlaybackSnapshot playbackSnapshot = this.playbackSnapshot;
        try {
            audioSessionId = mediaPlayer2.getAudioSessionId();
        } catch (Exception unused) {
            audioSessionId = 0;
        }
        this.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, 0, false, audioSessionId, 15, null);
        Surface surface = this.currentSurface;
        if (surface != null) {
            try {
                mediaPlayer2.setSurface(surface);
            } catch (Exception e2) {
                String str = "Could not attach media surface: " + e2.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                }
            }
        }
        return mediaPlayer2;
    }

    private final <T> T getPlayerValue(MediaPlayer mediaPlayer, T t10, Z8.c cVar) {
        try {
            return (T) cVar.invoke(mediaPlayer);
        } catch (Exception unused) {
            return t10;
        }
    }

    private final long markPendingPlaybackState(boolean z10) {
        long jIncrementAndGet = this.playbackCommandId.incrementAndGet();
        this.pendingPlaybackState = new PendingPlaybackState(z10, jIncrementAndGet);
        return jIncrementAndGet;
    }

    private final void post(Z8.a aVar) {
        if (this.released) {
            return;
        }
        this.workerHandler.post(new a(this, aVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void post$lambda$17(MediaPlayerThreadOwner mediaPlayerThreadOwner, Z8.a aVar) {
        if (mediaPlayerThreadOwner.released) {
            return;
        }
        aVar.invoke();
    }

    public static /* synthetic */ void release$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surface = null;
        }
        mediaPlayerThreadOwner.release(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$6(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface) {
        try {
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, 0, false, 0, 22, null);
            MediaPlayer mediaPlayer = mediaPlayerThreadOwner.player;
            mediaPlayerThreadOwner.player = null;
            mediaPlayerThreadOwner.currentSurface = null;
            mediaPlayerThreadOwner.stopPositionTicker();
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setSurface(null);
                } catch (Exception unused) {
                }
            }
            mediaPlayerThreadOwner.releaseSurface(surface);
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.release();
                } catch (Exception e2) {
                    String str = "Could not release media player: " + e2.getMessage();
                    if (str != null) {
                        Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                    }
                }
            }
            mediaPlayerThreadOwner.workerThread.quitSafely();
        } catch (Throwable th) {
            mediaPlayerThreadOwner.workerThread.quitSafely();
            throw th;
        }
    }

    private final void releaseSurface(Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (Exception e2) {
                String str = "Could not release media surface: " + e2.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
                }
            }
        }
    }

    private final void safely(Z8.a aVar, Z8.c cVar) {
        try {
            aVar.invoke();
        } catch (Exception e2) {
            String str = (String) cVar.invoke(e2);
            if (str != null) {
                Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
            }
        }
    }

    public static /* synthetic */ void safely$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, Z8.a aVar, Z8.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = C16521.INSTANCE;
        }
        try {
            aVar.invoke();
        } catch (Exception e2) {
            String str = (String) cVar.invoke(e2);
            if (str != null) {
                Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSurfaceInternal(Surface surface) {
        this.currentSurface = surface;
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.setSurface(surface);
        } catch (Exception e2) {
            String str = "Could not set media surface: " + e2.getMessage();
            if (str != null) {
                Logger.INSTANCE.e("TextureVideoView: ".concat(str), e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPositionTicker() {
        if (this.positionTickerScheduled) {
            return;
        }
        this.positionTickerScheduled = true;
        this.workerHandler.post(this.positionTicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPositionTicker() {
        this.positionTickerScheduled = false;
        this.workerHandler.removeCallbacks(this.positionTicker);
    }

    private final void updatePlaybackSnapshot(Z8.c cVar) {
        this.playbackSnapshot = (PlaybackSnapshot) cVar.invoke(this.playbackSnapshot);
    }

    public final void clearSurfaceBlocking(Surface surface) {
        if (m.b(Looper.myLooper(), this.workerThread.getLooper())) {
            detachAndReleaseSurface(surface);
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!this.workerHandler.post(new T(this, surface, countDownLatch, 8))) {
            releaseSurface(surface);
            Logger.INSTANCE.w("TextureVideoView: Could not post surface detach to worker thread. Released provided surface locally.");
            return;
        }
        try {
            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            Logger.INSTANCE.w("TextureVideoView: Timed out waiting for surface detach on worker thread. Surface release will complete asynchronously on the worker thread.");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            Logger.INSTANCE.w("TextureVideoView: Interrupted while waiting for surface detach. Surface release will complete asynchronously on the worker thread.");
        }
    }

    public final int getAudioSessionId() {
        return this.playbackSnapshot.getAudioSessionId();
    }

    public final int getCurrentPosition() {
        return this.playbackSnapshot.getCurrentPositionMs();
    }

    public final int getDuration() {
        return this.playbackSnapshot.getDurationMs();
    }

    public final boolean isPlaying() {
        PendingPlaybackState pendingPlaybackState = this.pendingPlaybackState;
        return pendingPlaybackState != null ? pendingPlaybackState.isPlaying() : this.playbackSnapshot.isPlaying();
    }

    public final void pause() {
        if (this.released || !this.playbackSnapshot.getPrepared()) {
            return;
        }
        post(new C16501(markPendingPlaybackState(false)));
    }

    public final void prepare(Uri uri, Z8.e onPrepared, Z8.e onVideoSizeChanged) {
        m.f(uri, "uri");
        m.f(onPrepared, "onPrepared");
        m.f(onVideoSizeChanged, "onVideoSizeChanged");
        post(new C16511(uri, onPrepared, onVideoSizeChanged));
    }

    public final void release(Surface surface) {
        if (this.released) {
            releaseSurface(surface);
            return;
        }
        this.released = true;
        clearPendingPlaybackState$default(this, null, 1, null);
        this.workerHandler.post(new a(this, surface, 1));
    }

    public final void seekTo(int i10) {
        post(new C16531(i10));
    }

    public final void setLooping(boolean z10) {
        post(new C16541(z10));
    }

    public final void setSurface(Surface surface) {
        post(new C16551(surface));
    }

    public final void start() {
        if (this.released || !this.playbackSnapshot.getPrepared()) {
            return;
        }
        post(new C16561(markPendingPlaybackState(true)));
    }

    public /* synthetic */ MediaPlayerThreadOwner(Context context, boolean z10, Z8.a aVar, int i10, kotlin.jvm.internal.f fVar) {
        this(context, z10, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : aVar);
    }
}
