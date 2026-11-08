package com.apple.android.music.playback.queue.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.apple.android.music.playback.model.q;
import com.apple.android.music.playback.model.s;
import com.apple.android.music.playback.queue.PlaybackQueueItemProvider;
import com.apple.android.music.playback.queue.e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f17514a;

    public c(e eVar) {
        this.f17514a = eVar;
    }

    public int a(PlaybackQueueItemProvider playbackQueueItemProvider, List<q> list) {
        return a(playbackQueueItemProvider, list, 0);
    }

    public void b(PlaybackQueueItemProvider playbackQueueItemProvider) {
        try {
            this.f17514a.l().delete("provider_media_item", "provider_id = ?", new String[]{Integer.toString(playbackQueueItemProvider.a())});
        } catch (Exception unused) {
        }
    }

    public int a(PlaybackQueueItemProvider playbackQueueItemProvider, List<q> list, int i10) {
        SQLiteDatabase sQLiteDatabaseL = this.f17514a.l();
        for (q qVar : list) {
            ContentValues contentValuesA = s.a(qVar);
            ContentValues contentValuesA2 = a.a(playbackQueueItemProvider, qVar, i10);
            if (contentValuesA != null && contentValuesA2 != null) {
                try {
                    sQLiteDatabaseL.insertWithOnConflict("media_item", null, contentValuesA, 5);
                    sQLiteDatabaseL.insertWithOnConflict("provider_media_item", null, contentValuesA2, 5);
                    i10++;
                } catch (Exception unused) {
                }
            }
        }
        return i10;
    }

    public Cursor a(PlaybackQueueItemProvider playbackQueueItemProvider) {
        try {
            return this.f17514a.l().rawQuery(String.format("SELECT %1$s.* FROM %2$s, %1$s WHERE %2$s.%3$s = :providerId AND %1$s.%4$s = %2$s.%5$s ORDER BY %2$s.%6$s ASC", "media_item", "provider_media_item", "provider_id", "store_id", "media_item_id", "position"), new String[]{Integer.toString(playbackQueueItemProvider.a())});
        } catch (Exception unused) {
            return null;
        }
    }
}
