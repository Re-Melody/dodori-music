package com.apple.android.music.playback.controller;

import D7.p1;
import X2.i;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.PowerManager;
import android.util.Pair;
import android.view.Surface;
import com.apple.android.music.playback.c.c;
import com.apple.android.music.playback.c.d;
import com.apple.android.music.playback.c.e;
import com.apple.android.music.playback.c.f;
import com.apple.android.music.playback.c.l;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.apple.android.music.playback.model.PlayerQueueItem;
import com.apple.android.music.playback.model.k;
import com.apple.android.music.playback.queue.PlaybackQueueItemProvider;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
final class a implements AudioManager.OnAudioFocusChangeListener, Handler.Callback, c.a, MediaPlayerController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f17226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f17227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f17228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f17229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f17230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<MediaPlayerController.Listener> f17231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AudioManager f17232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f17233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PowerManager.WakeLock f17234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WifiManager.WifiLock f17235j;
    private final ConditionVariable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17237m;

    static {
        System.setProperty("org.bytedeco.javacpp.maxphysicalbytes", "0");
        System.setProperty("org.bytedeco.javacpp.maxbytes", "0");
    }

    public a(Context context, Handler handler) {
        HandlerThread handlerThread = new HandlerThread("MediaPlayerController:Handler", 2);
        this.f17228c = handlerThread;
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper(), this);
        this.f17229d = handler2;
        this.f17230e = new Handler(handler.getLooper(), this);
        this.f17231f = new CopyOnWriteArraySet();
        this.k = new ConditionVariable();
        Context applicationContext = context.getApplicationContext();
        this.f17232g = (AudioManager) applicationContext.getSystemService("audio");
        this.f17236l = 0;
        this.f17237m = false;
        this.f17233h = new b(applicationContext, handler2, this);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) applicationContext.getSystemService("power")).newWakeLock(536870913, "AppleMusicPlayback");
        this.f17234i = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) applicationContext.getSystemService("wifi")).createWifiLock(3, "AppleMusicPlayback");
        this.f17235j = wifiLockCreateWifiLock;
        wifiLockCreateWifiLock.setReferenceCounted(false);
        d dVarA = e.a(applicationContext);
        this.f17226a = dVarA;
        c cVarA = f.a(dVarA, handler2);
        this.f17227b = cVarA;
        cVarA.a(this);
        cVarA.a(new com.apple.android.music.playback.reporting.c(dVarA));
    }

    private void c() {
        this.f17233h.b();
        i();
        this.f17227b.c();
    }

    private void d() {
        j();
        this.f17227b.d();
    }

    private void e() {
        j();
        this.f17227b.B();
        this.f17228c.quit();
    }

    private boolean f() {
        int iRequestAudioFocus;
        if (this.f17236l != 1) {
            if (Build.VERSION.SDK_INT >= 26) {
                iRequestAudioFocus = this.f17232g.requestAudioFocus(i.k().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build()).setOnAudioFocusChangeListener(this, this.f17229d).build());
            } else {
                iRequestAudioFocus = this.f17232g.requestAudioFocus(this, 3, 1);
            }
            this.f17236l = iRequestAudioFocus == 1 ? 1 : 0;
        }
        return this.f17236l == 1;
    }

    private void g() {
        if (this.f17236l == 0 || this.f17232g.abandonAudioFocus(this) != 1) {
            return;
        }
        this.f17236l = 0;
    }

    private void h() {
        if (!this.f17235j.isHeld()) {
            this.f17235j.acquire();
        }
        if (this.f17234i.isHeld()) {
            return;
        }
        this.f17234i.acquire();
    }

    private void i() {
        if (this.f17235j.isHeld()) {
            this.f17235j.release();
        }
        if (this.f17234i.isHeld()) {
            this.f17234i.release();
        }
    }

    private void j() {
        g();
        this.f17233h.b();
        i();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void addListener(MediaPlayerController.Listener listener) {
        if (listener == null) {
            return;
        }
        this.f17231f.add(listener);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void addQueueItems(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        if (playbackQueueItemProvider == null) {
            return;
        }
        this.f17229d.obtainMessage(13, i10, 0, playbackQueueItemProvider).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canAppendToPlaybackQueue() {
        return this.f17227b.g(2);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canEditPlaybackQueue() {
        return this.f17227b.A();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canPrependToPlaybackQueue() {
        return this.f17227b.g(3);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canSeek() {
        return this.f17227b.w();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canSetRepeatMode() {
        return this.f17227b.x();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canSetShuffleMode() {
        return this.f17227b.y();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canSkipToNextItem() {
        return this.f17227b.u() != -1;
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canSkipToPreviousItem() {
        return this.f17227b.v() != -1;
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean canSkipToQueueItem() {
        return this.f17227b.z();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public long getBufferedPosition() {
        long jG = this.f17227b.g();
        if (jG == -1) {
            return -1L;
        }
        return jG;
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public int getCurrentContainerIndex() {
        return this.f17227b.l();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public String getCurrentContainerStoreId() {
        return this.f17227b.j();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public int getCurrentContainerType() {
        return this.f17227b.k();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public PlayerQueueItem getCurrentItem() {
        return this.f17227b.i();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public long getCurrentPosition() {
        long jF = this.f17227b.f();
        if (jF == -1) {
            return -1L;
        }
        return jF;
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public long getDuration() {
        long jH = this.f17227b.h();
        if (jH == -1) {
            return -1L;
        }
        return jH;
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public int getPlaybackQueueIndex() {
        return this.f17227b.m();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public int getPlaybackQueueItemCount() {
        return this.f17227b.n();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public float getPlaybackRate() {
        return this.f17227b.p();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public int getPlaybackState() {
        return this.f17227b.e();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public List<PlayerQueueItem> getQueueItems() {
        return this.f17227b.o();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public int getRepeatMode() {
        return this.f17227b.s();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public int getShuffleMode() {
        return this.f17227b.t();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                a((PlaybackQueueItemProvider) message.obj, message.arg2, message.arg1 == 1);
                return true;
            case 2:
                b();
                return true;
            case 3:
                c();
                return true;
            case 4:
                a(message.arg1);
                return true;
            case 5:
                b(com.apple.android.music.playback.f.b.a(message));
                return true;
            case 6:
                b(message.arg1);
                return true;
            case 7:
                c(message.arg1);
                return true;
            case 8:
                d();
                return true;
            case 9:
                e();
                return true;
            case 10:
                e(message.arg1);
                return true;
            case 11:
                if (this.f17227b.e() != 1) {
                    d();
                }
                return true;
            case 12:
                a(com.apple.android.music.playback.f.b.a(message));
                return true;
            case 13:
                a((PlaybackQueueItemProvider) message.obj, message.arg1);
                return true;
            case 14:
                c(com.apple.android.music.playback.f.b.a(message));
                return true;
            case 15:
                Pair pair = (Pair) message.obj;
                a(com.apple.android.music.playback.f.b.a(message), ((Long) pair.first).longValue(), ((Integer) pair.second).intValue());
                return true;
            case 16:
                a((Surface) message.obj);
                return true;
            case 17:
                d(message.arg1);
                return true;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                a();
                return true;
            case 19:
                Iterator<MediaPlayerController.Listener> it = this.f17231f.iterator();
                while (it.hasNext()) {
                    it.next().onPlaybackStateChanged(this, message.arg1, message.arg2);
                }
                return true;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                Iterator<MediaPlayerController.Listener> it2 = this.f17231f.iterator();
                while (it2.hasNext()) {
                    it2.next().onPlaybackStateUpdated(this);
                }
                return true;
            case 21:
                Iterator<MediaPlayerController.Listener> it3 = this.f17231f.iterator();
                while (it3.hasNext()) {
                    it3.next().onBufferingStateChanged(this, message.arg1 == 1);
                }
                return true;
            case 22:
                Pair pair2 = (Pair) message.obj;
                Iterator<MediaPlayerController.Listener> it4 = this.f17231f.iterator();
                while (it4.hasNext()) {
                    it4.next().onCurrentItemChanged(this, (PlayerQueueItem) pair2.first, (PlayerQueueItem) pair2.second);
                }
                return true;
            case 23:
                List<PlayerQueueItem> list = (List) message.obj;
                Iterator<MediaPlayerController.Listener> it5 = this.f17231f.iterator();
                while (it5.hasNext()) {
                    it5.next().onPlaybackQueueChanged(this, list);
                }
                return true;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                Iterator<MediaPlayerController.Listener> it6 = this.f17231f.iterator();
                while (it6.hasNext()) {
                    it6.next().onPlaybackQueueItemsAdded(this, ((Integer) message.obj).intValue(), message.arg1, message.arg2);
                }
                return true;
            case 25:
                Iterator<MediaPlayerController.Listener> it7 = this.f17231f.iterator();
                while (it7.hasNext()) {
                    it7.next().onPlaybackRepeatModeChanged(this, message.arg1);
                }
                return true;
            case 26:
                Iterator<MediaPlayerController.Listener> it8 = this.f17231f.iterator();
                while (it8.hasNext()) {
                    it8.next().onPlaybackShuffleModeChanged(this, message.arg1);
                }
                return true;
            case 27:
                Iterator<MediaPlayerController.Listener> it9 = this.f17231f.iterator();
                while (it9.hasNext()) {
                    it9.next().onMetadataUpdated(this, (PlayerQueueItem) message.obj);
                }
                return true;
            case 28:
                Iterator<MediaPlayerController.Listener> it10 = this.f17231f.iterator();
                while (it10.hasNext()) {
                    it10.next().onItemEnded(this, (PlayerQueueItem) message.obj, com.apple.android.music.playback.f.b.a(message));
                }
                return true;
            case 29:
                Iterator<MediaPlayerController.Listener> it11 = this.f17231f.iterator();
                while (it11.hasNext()) {
                    it11.next();
                    ((Float) message.obj).getClass();
                }
                return true;
            case 30:
                Iterator<MediaPlayerController.Listener> it12 = this.f17231f.iterator();
                while (it12.hasNext()) {
                    it12.next();
                }
                return true;
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                MediaPlayerException mediaPlayerException = (MediaPlayerException) message.obj;
                Iterator<MediaPlayerController.Listener> it13 = this.f17231f.iterator();
                while (it13.hasNext()) {
                    it13.next().onPlaybackError(this, mediaPlayerException);
                }
                return true;
            case com.amazon.c.a.a.c.f16581h /* 32 */:
                Iterator<MediaPlayerController.Listener> it14 = this.f17231f.iterator();
                while (it14.hasNext()) {
                    it14.next().onPlayerStateRestored(this);
                }
                return true;
            case 33:
                Pair pair3 = (Pair) message.obj;
                if (pair3 != null) {
                    a((l) pair3.first, (Handler) pair3.second);
                }
                return true;
            case 34:
                a((k) message.obj);
                return true;
            case 35:
                this.f17227b.a((com.apple.android.music.playback.c.i) message.obj);
                return true;
            default:
                return false;
        }
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean isBuffering() {
        return this.f17227b.q();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public boolean isLiveStream() {
        return this.f17227b.r();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void moveQueueItemWithId(long j10, long j11, int i10) {
        Message messageObtainMessage = this.f17229d.obtainMessage(15);
        com.apple.android.music.playback.f.b.a(messageObtainMessage, j10);
        messageObtainMessage.obj = Pair.create(Long.valueOf(j11), Integer.valueOf(i10));
        messageObtainMessage.sendToTarget();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        this.f17229d.obtainMessage(10, i10, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void pause() {
        this.f17229d.sendEmptyMessage(3);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void play() {
        this.f17229d.sendEmptyMessage(2);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void prepare(PlaybackQueueItemProvider playbackQueueItemProvider) {
        prepare(playbackQueueItemProvider, false);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void release() {
        this.f17229d.sendEmptyMessage(9);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void removeListener(MediaPlayerController.Listener listener) {
        if (listener == null) {
            return;
        }
        this.f17231f.remove(listener);
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void removeQueueItemWithId(long j10) {
        com.apple.android.music.playback.f.b.a(this.f17229d.obtainMessage(14), j10).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void seekToPosition(long j10) {
        String.format("seekToPosition: %d", Long.valueOf(j10));
        com.apple.android.music.playback.f.b.a(this.f17229d.obtainMessage(12), j10).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void setRepeatMode(int i10) {
        this.f17229d.obtainMessage(6, i10, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void setShuffleMode(int i10) {
        this.f17229d.obtainMessage(7, i10, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void skipToNextItem() {
        this.f17229d.obtainMessage(4, 1, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void skipToPreviousItem() {
        this.f17229d.obtainMessage(4, -1, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void skipToQueueItemWithId(long j10) {
        com.apple.android.music.playback.f.b.a(this.f17229d.obtainMessage(5), j10).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void stop() {
        this.f17229d.sendEmptyMessage(8);
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, int i10, int i11) {
        f(i10);
        f(i11);
        if (i11 == 0) {
            j();
        }
        this.f17230e.obtainMessage(19, i10, i11).sendToTarget();
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(c cVar, List<com.apple.android.music.playback.c.d.b> list) {
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void prepare(PlaybackQueueItemProvider playbackQueueItemProvider, boolean z10) {
        prepare(playbackQueueItemProvider, 1, z10);
    }

    private void d(int i10) {
        this.f17227b.e(i10);
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(c cVar, int i10, int i11) {
        String.format("onPlaybackIndexChanged: %d → %d", Integer.valueOf(i10), Integer.valueOf(i11));
        this.f17230e.obtainMessage(22, Pair.create(cVar.f(i10), cVar.f(i11))).sendToTarget();
    }

    @Override // com.apple.android.music.playback.controller.MediaPlayerController
    public void prepare(PlaybackQueueItemProvider playbackQueueItemProvider, int i10, boolean z10) {
        if (playbackQueueItemProvider == null) {
            return;
        }
        String.format("prepare: provider = %s, playWhenReady = %b", playbackQueueItemProvider, Boolean.valueOf(z10));
        this.f17229d.obtainMessage(1, z10 ? 1 : 0, i10, playbackQueueItemProvider).sendToTarget();
    }

    private void c(int i10) {
        this.f17227b.d(i10);
    }

    private void e(int i10) {
        if (i10 == -3) {
            this.f17236l = 2;
            this.f17227b.a(0.2f);
            return;
        }
        if (i10 == -2) {
            this.f17236l = 3;
            this.f17237m = this.f17227b.e() == 1;
            c();
        } else if (i10 == -1) {
            this.f17236l = 0;
            c();
        } else {
            if (i10 != 1) {
                return;
            }
            this.f17236l = 1;
            this.f17227b.a(1.0f);
            if (this.f17237m) {
                this.f17237m = false;
                b();
            }
        }
    }

    private void c(long j10) {
        this.f17227b.c(j10);
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar) {
        this.f17230e.obtainMessage(20).sendToTarget();
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, boolean z10) {
        this.f17230e.obtainMessage(21, z10 ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, PlayerQueueItem playerQueueItem) {
        this.f17230e.obtainMessage(27, playerQueueItem).sendToTarget();
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, Set<k> set) {
        this.f17230e.obtainMessage(30, set).sendToTarget();
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(c cVar, int i10) {
        this.f17230e.obtainMessage(26, i10, 0).sendToTarget();
    }

    private void b() {
        if (f()) {
            this.f17233h.a();
            h();
            this.f17227b.a(1.0f);
            this.f17227b.b();
        }
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, List<PlayerQueueItem> list) {
        this.f17230e.obtainMessage(23, list).sendToTarget();
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, int i10, int i11, int i12) {
        this.f17230e.obtainMessage(24, i10, i11, Integer.valueOf(i12)).sendToTarget();
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, PlayerQueueItem playerQueueItem, long j10) {
        Message messageObtainMessage = this.f17230e.obtainMessage(28, playerQueueItem);
        com.apple.android.music.playback.f.b.a(messageObtainMessage, j10);
        messageObtainMessage.sendToTarget();
    }

    private void b(long j10) {
        this.f17227b.b(j10);
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, MediaPlayerException mediaPlayerException) {
        this.f17230e.obtainMessage(31, mediaPlayerException).sendToTarget();
    }

    private void b(int i10) {
        this.f17227b.c(i10);
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, int i10) {
        this.f17230e.obtainMessage(25, i10, 0).sendToTarget();
    }

    private static String f(int i10) {
        if (i10 == 0) {
            return "STOPPED";
        }
        if (i10 == 1) {
            return "PLAYING";
        }
        if (i10 != 2) {
            return "";
        }
        return "PAUSED";
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, int i10, int i11, float f10) {
        this.f17230e.obtainMessage(29, i10, i11, Float.valueOf(f10)).sendToTarget();
    }

    private void a() {
        this.f17227b.a();
        this.f17230e.obtainMessage(32).sendToTarget();
        this.k.open();
    }

    private void a(PlaybackQueueItemProvider playbackQueueItemProvider, int i10, boolean z10) {
        if (z10 && f()) {
            this.f17233h.a();
            h();
            this.f17227b.a(1.0f);
            this.f17227b.a(playbackQueueItemProvider, i10, true);
            return;
        }
        this.f17227b.a(playbackQueueItemProvider, i10, false);
    }

    private void a(long j10) {
        this.f17227b.a(j10);
    }

    private void a(int i10) {
        this.f17227b.a(i10);
    }

    private void a(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        this.f17227b.a(playbackQueueItemProvider, i10);
    }

    private void a(long j10, long j11, int i10) {
        this.f17227b.a(j10, j11, i10);
    }

    private void a(Surface surface) {
        this.f17227b.a(surface);
    }

    private void a(l lVar, Handler handler) {
        this.f17227b.a(lVar, handler);
    }

    private void a(k kVar) {
        this.f17227b.a(kVar);
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void a(c cVar, long j10, long j11) {
    }

    @Override // com.apple.android.music.playback.c.c.a
    public void b(c cVar, long j10, long j11) {
    }
}
