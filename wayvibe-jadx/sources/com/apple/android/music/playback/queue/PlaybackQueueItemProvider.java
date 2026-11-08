package com.apple.android.music.playback.queue;

import android.os.Handler;
import android.os.Parcelable;
import com.apple.android.music.playback.model.PlayerMediaItem;
import java.io.Externalizable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface PlaybackQueueItemProvider extends Parcelable, Externalizable {

    public interface a {
        void a(PlaybackQueueItemProvider playbackQueueItemProvider);

        void a(PlaybackQueueItemProvider playbackQueueItemProvider, IOException iOException);

        void b(PlaybackQueueItemProvider playbackQueueItemProvider);

        void b(PlaybackQueueItemProvider playbackQueueItemProvider, int i10);
    }

    int a();

    void a(e eVar, com.apple.android.music.playback.c.d dVar, ExecutorService executorService, Handler handler, a aVar);

    void a(com.apple.android.music.playback.reporting.b bVar, int i10);

    void a(boolean z10);

    boolean a(int i10);

    void b(int i10);

    boolean b();

    int c();

    void c(int i10);

    int d();

    PlayerMediaItem d(int i10);

    int e();

    int h();

    String i();

    int j();
}
