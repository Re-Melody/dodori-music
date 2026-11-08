package com.apple.android.music.playback.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE media_item (store_id INTEGER PRIMARY KEY, type INTEGER, title TEXT, album_id INTEGER, album_title TEXT, artist_id INTEGER, artist_name TEXT, album_artist_name TEXT, url TEXT, artwork_url TEXT, asset_url TEXT, genre_name TEXT, composer_name TEXT, duration INTEGER, available INTEGER, release_date INTEGER, album_track_number INTEGER, album_track_count INTEGER, album_disc_number INTEGER, album_disc_count INTEGER, explicit_content_rating INTEGER, lyrics_available INTEGER, media_should_bookmark_play_position INTEGER);");
        sQLiteDatabase.execSQL("CREATE INDEX media_item_available ON media_item (available);");
        sQLiteDatabase.execSQL("CREATE INDEX media_item_explicit_rating ON media_item (explicit_content_rating);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS media_item_available");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS media_item_explicit_rating");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_item;");
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("media_item", null, null);
    }

    public static ContentValues a(q qVar) {
        String str = qVar.f17464a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ContentValues contentValues = new ContentValues(21);
        a(contentValues, "store_id", qVar.f17464a);
        contentValues.put("type", Integer.valueOf(qVar.f17465b));
        contentValues.put(com.amazon.a.a.o.b.f16393S, qVar.f17466c);
        a(contentValues, "album_id", qVar.f17467d);
        contentValues.put("album_title", qVar.f17468e);
        a(contentValues, "artist_id", qVar.f17469f);
        contentValues.put("artist_name", qVar.f17470g);
        contentValues.put("album_artist_name", qVar.f17471h);
        contentValues.put("url", qVar.f17472i);
        contentValues.put("artwork_url", qVar.f17473j);
        contentValues.put("asset_url", qVar.k);
        contentValues.put("genre_name", qVar.f17474l);
        contentValues.put("composer_name", qVar.f17475m);
        contentValues.put("duration", Long.valueOf(qVar.f17477o));
        contentValues.put("available", Boolean.valueOf(qVar.f17476n));
        if (qVar.getReleaseDate() != null) {
            contentValues.put("release_date", Long.valueOf(qVar.f17478p.getTime()));
        } else {
            contentValues.putNull("release_date");
        }
        contentValues.put("album_track_number", Integer.valueOf(qVar.f17479q));
        contentValues.put("album_track_count", Integer.valueOf(qVar.r));
        contentValues.put("album_disc_number", Integer.valueOf(qVar.f17480s));
        contentValues.put("album_disc_count", Integer.valueOf(qVar.f17481t));
        contentValues.put("explicit_content_rating", Integer.valueOf(qVar.f17482u));
        contentValues.put("lyrics_available", Boolean.valueOf(qVar.f17483v));
        contentValues.put("media_should_bookmark_play_position", Boolean.valueOf(qVar.f17484w));
        return contentValues;
    }

    public static q a(Cursor cursor) {
        q qVar = new q();
        if (!cursor.isNull(cursor.getColumnIndex("store_id"))) {
            qVar.f17464a = Long.toString(cursor.getLong(cursor.getColumnIndex("store_id")));
        }
        qVar.f17465b = cursor.getInt(cursor.getColumnIndex("type"));
        qVar.f17466c = cursor.getString(cursor.getColumnIndex(com.amazon.a.a.o.b.f16393S));
        if (!cursor.isNull(cursor.getColumnIndex("album_id"))) {
            qVar.f17467d = Long.toString(cursor.getLong(cursor.getColumnIndex("album_id")));
        }
        qVar.f17468e = cursor.getString(cursor.getColumnIndex("album_title"));
        if (!cursor.isNull(cursor.getColumnIndex("artist_id"))) {
            qVar.f17469f = Long.toString(cursor.getLong(cursor.getColumnIndex("artist_id")));
        }
        qVar.f17470g = cursor.getString(cursor.getColumnIndex("artist_name"));
        qVar.f17471h = cursor.getString(cursor.getColumnIndex("album_artist_name"));
        qVar.f17472i = cursor.getString(cursor.getColumnIndex("url"));
        qVar.f17473j = cursor.getString(cursor.getColumnIndex("artwork_url"));
        qVar.k = cursor.getString(cursor.getColumnIndex("asset_url"));
        qVar.f17474l = cursor.getString(cursor.getColumnIndex("genre_name"));
        qVar.f17475m = cursor.getString(cursor.getColumnIndex("composer_name"));
        qVar.f17477o = cursor.getLong(cursor.getColumnIndex("duration"));
        qVar.f17476n = cursor.getInt(cursor.getColumnIndex("available")) == 1;
        if (!cursor.isNull(cursor.getColumnIndex("release_date"))) {
            qVar.f17478p = new Date(cursor.getLong(cursor.getColumnIndex("release_date")));
        }
        qVar.f17479q = cursor.getInt(cursor.getColumnIndex("album_track_number"));
        qVar.r = cursor.getInt(cursor.getColumnIndex("album_track_count"));
        qVar.f17480s = cursor.getInt(cursor.getColumnIndex("album_disc_number"));
        qVar.f17481t = cursor.getInt(cursor.getColumnIndex("album_disc_count"));
        qVar.f17482u = cursor.getInt(cursor.getColumnIndex("explicit_content_rating"));
        qVar.f17483v = cursor.getInt(cursor.getColumnIndex("lyrics_available")) == 1;
        qVar.f17484w = cursor.getInt(cursor.getColumnIndex("media_should_bookmark_play_position")) == 1;
        return qVar;
    }

    private static void a(ContentValues contentValues, String str, String str2) {
        try {
            contentValues.put(str, Long.valueOf(Long.parseLong(str2)));
        } catch (NumberFormatException unused) {
            contentValues.putNull(str);
        }
    }
}
