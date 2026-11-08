package com.apple.android.music.playback.queue.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apple.android.music.playback.model.q;
import com.apple.android.music.playback.queue.PlaybackQueueItemProvider;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE provider_media_item (provider_id INTEGER, position INTEGER, media_item_id INTEGER, FOREIGN KEY (media_item_id) REFERENCES media_item(store_id));");
        sQLiteDatabase.execSQL("CREATE INDEX provider_media_item_provider_id_position ON provider_media_item (provider_id, position, media_item_id);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS provider_media_item_provider_id_position;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS provider_media_item;");
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("provider_media_item", null, null);
    }

    public static ContentValues a(PlaybackQueueItemProvider playbackQueueItemProvider, q qVar, int i10) {
        String subscriptionStoreId = qVar.getSubscriptionStoreId();
        if (subscriptionStoreId == null || subscriptionStoreId.isEmpty()) {
            return null;
        }
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("provider_id", Integer.valueOf(playbackQueueItemProvider.a()));
        contentValues.put("position", Integer.valueOf(i10));
        contentValues.put("media_item_id", Long.valueOf(Long.parseLong(qVar.getSubscriptionStoreId())));
        return contentValues;
    }
}
