package com.apple.android.music.playback.queue;

import android.database.sqlite.SQLiteDatabase;
import com.apple.android.music.playback.model.PlayerQueueItem;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public interface a {
        void a(e eVar);

        void a(e eVar, int i10);

        void a(e eVar, int i10, int i11, int i12);

        void a(e eVar, PlayerQueueItem playerQueueItem);

        void a(e eVar, PlaybackQueueItemProvider playbackQueueItemProvider, Exception exc);

        void a(e eVar, Exception exc);

        void b(e eVar, int i10);

        void c(e eVar, int i10);

        void d(e eVar, int i10);
    }

    void a(int i10);

    void a(int i10, int i11);

    void a(long j10);

    void a(long j10, long j11, int i10);

    void a(PlaybackQueueItemProvider playbackQueueItemProvider, int i10);

    void a(a aVar);

    void a(com.apple.android.music.playback.reporting.b bVar, int i10);

    int b(long j10);

    void b(int i10);

    void b(a aVar);

    int c();

    int c(long j10);

    void c(int i10);

    int d();

    PlayerQueueItem d(int i10);

    int e();

    long e(int i10);

    String f(int i10);

    List<PlayerQueueItem> f();

    int g();

    int g(int i10);

    int h();

    int h(int i10);

    int i(int i10);

    boolean i();

    int j(int i10);

    boolean j();

    int k(int i10);

    boolean k();

    int l(int i10);

    SQLiteDatabase l();

    void m();

    boolean m(int i10);

    void n();

    boolean n(int i10);
}
