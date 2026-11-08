package com.apple.android.music.playback.c;

import android.os.Handler;
import android.view.Surface;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.apple.android.music.playback.model.PlayerQueueItem;
import com.apple.android.music.playback.queue.PlaybackQueueItemProvider;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a {
        void a(c cVar);

        void a(c cVar, int i10);

        void a(c cVar, int i10, int i11);

        void a(c cVar, int i10, int i11, float f10);

        void a(c cVar, int i10, int i11, int i12);

        void a(c cVar, long j10, long j11);

        void a(c cVar, MediaPlayerException mediaPlayerException);

        void a(c cVar, PlayerQueueItem playerQueueItem);

        void a(c cVar, PlayerQueueItem playerQueueItem, long j10);

        void a(c cVar, List<PlayerQueueItem> list);

        void a(c cVar, Set<com.apple.android.music.playback.model.k> set);

        void a(c cVar, boolean z10);

        void b(c cVar, int i10);

        void b(c cVar, int i10, int i11);

        void b(c cVar, long j10, long j11);

        void b(c cVar, List<com.apple.android.music.playback.c.d.b> list);
    }

    boolean A();

    void B();

    void a();

    void a(float f10);

    void a(int i10);

    void a(long j10);

    void a(long j10, long j11, int i10);

    void a(Surface surface);

    void a(a aVar);

    void a(i iVar);

    void a(l lVar, Handler handler);

    void a(com.apple.android.music.playback.model.k kVar);

    void a(PlaybackQueueItemProvider playbackQueueItemProvider, int i10);

    void a(PlaybackQueueItemProvider playbackQueueItemProvider, int i10, boolean z10);

    void a(com.apple.android.music.playback.reporting.b bVar, int i10);

    void b();

    void b(long j10);

    void c();

    void c(int i10);

    void c(long j10);

    void d();

    void d(int i10);

    int e();

    void e(int i10);

    long f();

    PlayerQueueItem f(int i10);

    long g();

    boolean g(int i10);

    long h();

    PlayerQueueItem i();

    String j();

    int k();

    int l();

    int m();

    int n();

    List<PlayerQueueItem> o();

    float p();

    boolean q();

    boolean r();

    int s();

    int t();

    int u();

    int v();

    boolean w();

    boolean x();

    boolean y();

    boolean z();
}
