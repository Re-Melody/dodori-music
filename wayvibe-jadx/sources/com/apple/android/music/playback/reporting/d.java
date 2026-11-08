package com.apple.android.music.playback.reporting;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17633a = "d";

    public d(com.apple.android.music.playback.c.d dVar) {
        super(dVar.f(), dVar.z(), (SQLiteDatabase.CursorFactory) null, 9);
    }

    public void a(a aVar) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("containerType", Integer.valueOf(aVar.f17563a));
            contentValues.put("containerAdamId", Long.valueOf(aVar.f17564b));
            contentValues.put("containerCloudAlbumId", aVar.f17565c);
            contentValues.put("playlistCloudId", Long.valueOf(aVar.f17566d));
            contentValues.put("playlistGlobalId", aVar.f17567e);
            contentValues.put("playlistVersionHash", aVar.f17568f);
            contentValues.put("stationId", aVar.f17569g);
            contentValues.put("stationHash", aVar.f17570h);
            contentValues.put(com.amazon.a.a.o.b.k, Integer.valueOf(aVar.f17571i));
            contentValues.put("itemMediaType", Integer.valueOf(aVar.f17572j));
            contentValues.put("itemCloudId", Long.valueOf(aVar.k));
            contentValues.put("itemPurchaseId", Long.valueOf(aVar.f17573l));
            contentValues.put("itemSubscriptionId", Long.valueOf(aVar.f17574m));
            contentValues.put("itemLyricsId", aVar.f17575n);
            contentValues.put("itemDuration", Long.valueOf(aVar.f17576o));
            contentValues.put("itemStartPosition", Long.valueOf(aVar.f17577p));
            contentValues.put("itemEndPosition", Long.valueOf(aVar.f17578q));
            contentValues.put("eventType", Integer.valueOf(aVar.r));
            contentValues.put("eventEndReasonType", Integer.valueOf(aVar.f17579s));
            contentValues.put("eventReasonHintType", Integer.valueOf(aVar.f17580t));
            contentValues.put("offline", Boolean.valueOf(aVar.f17581u));
            contentValues.put("subscriptionEnabled", Boolean.valueOf(aVar.f17582v));
            contentValues.put("featureName", aVar.f17583w);
            contentValues.put("storeFrontId", aVar.f17584x);
            contentValues.put("persistentId", Long.valueOf(aVar.f17585y));
            contentValues.put(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(aVar.f17555A));
            contentValues.put("timeZoneOffset", Integer.valueOf(aVar.f17556B));
            contentValues.put("privateEnabled", Boolean.valueOf(aVar.f17557C));
            contentValues.put("recommendationId", aVar.f17558D);
            contentValues.put("timedMetadata", aVar.f17559E);
            UUID uuid = aVar.f17586z;
            if (uuid == null) {
                contentValues.putNull("universalId");
            } else {
                contentValues.put("universalId", a(uuid));
            }
            if (aVar.f17562H == null) {
                contentValues.putNull("trackInfo");
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ObjectOutputStream(byteArrayOutputStream).writeObject(aVar.f17562H);
                contentValues.put("trackInfo", byteArrayOutputStream.toByteArray());
            }
            contentValues.put("clientAppPackageName", aVar.f17560F);
            contentValues.put("clientAppVersion", aVar.f17561G);
            writableDatabase.insertOrThrow("pafevents", null, contentValues);
        } catch (Exception e2) {
            e2.toString();
        }
    }

    public void b() {
        getWritableDatabase().delete("pafevents", null, null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS pafevents (_id INTEGER PRIMARY KEY, containerType INTEGER NOT NULL, containerAdamId INTEGER NOT NULL, containerCloudAlbumId TEXT, playlistCloudId INTEGER NOT NULL, playlistGlobalId TEXT, playlistVersionHash TEXT, stationId TEXT, stationHash TEXT, itemType INTEGER NOT NULL, itemMediaType INTEGER NOT NULL, itemCloudId INTEGER NOT NULL, itemPurchaseId INTEGER NOT NULL, itemSubscriptionId INTEGER NOT NULL, itemLyricsId TEXT, itemDuration INTEGER NOT NULL, itemStartPosition INTEGER NOT NULL, itemEndPosition INTEGER NOT NULL, eventType INTEGER NOT NULL, eventEndReasonType INTEGER NOT NULL, eventReasonHintType INTEGER NOT NULL, offline INTEGER NOT NULL, subscriptionEnabled INTEGER NOT NULL, featureName TEXT, storeFrontId TEXT, persistentId INTEGER NOT NULL, universalId BLOB, timestamp INTEGER NOT NULL, timeZoneOffset INTEGER NOT NULL, privateEnabled INTEGER NOT NULL, recommendationId TEXT, timedMetadata BLOB, trackInfo BLOB, clientAppPackageName TEXT, clientAppVersion TEXT );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS pafevents");
        onCreate(sQLiteDatabase);
    }

    public List<a> a() {
        boolean zIsClosed;
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM pafevents", null);
        ArrayList arrayList = new ArrayList(cursorRawQuery.getCount());
        try {
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        b bVar = new b();
                        bVar.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("containerType")));
                        bVar.a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("containerAdamId")));
                        bVar.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("containerCloudAlbumId")));
                        bVar.b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("playlistCloudId")));
                        bVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("playlistGlobalId")));
                        bVar.c(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("playlistVersionHash")));
                        bVar.d(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("stationId")));
                        bVar.e(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("stationHash")));
                        bVar.b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.amazon.a.a.o.b.k)));
                        bVar.c(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("itemMediaType")));
                        bVar.c(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("itemCloudId")));
                        bVar.d(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("itemPurchaseId")));
                        bVar.e(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("itemSubscriptionId")));
                        bVar.f(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("itemLyricsId")));
                        bVar.f(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("itemDuration")));
                        bVar.g(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("itemStartPosition")));
                        bVar.h(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("itemEndPosition")));
                        bVar.d(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("eventType")));
                        bVar.e(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("eventEndReasonType")));
                        bVar.f(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("eventReasonHintType")));
                        bVar.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("offline")) > 0);
                        bVar.b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("subscriptionEnabled")) > 0);
                        bVar.g(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("featureName")));
                        bVar.h(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("storeFrontId")));
                        bVar.i(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("persistentId")));
                        bVar.j(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(DiagnosticsEntry.TIMESTAMP_KEY)));
                        bVar.g(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("timeZoneOffset")));
                        bVar.c(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("privateEnabled")) > 0);
                        bVar.i(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("recommendationId")));
                        bVar.a(cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex("timedMetadata")));
                        byte[] blob = cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex("universalId"));
                        if (blob != null) {
                            bVar.f17618z = a(blob);
                        }
                        byte[] blob2 = cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex("trackInfo"));
                        if (blob2 != null) {
                            bVar.a((Map<?, ?>) new ObjectInputStream(new ByteArrayInputStream(blob2)).readObject());
                        }
                        bVar.j(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("clientAppPackageName")));
                        bVar.k(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("clientAppVersion")));
                        arrayList.add(bVar.a());
                    } while (cursorRawQuery.moveToNext());
                }
                if (!zIsClosed) {
                    return arrayList;
                }
            } catch (Exception e2) {
                e2.toString();
            }
            return arrayList;
        } finally {
            if (!cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    private static byte[] a(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    private static UUID a(byte[] bArr) {
        if (bArr.length != 16) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
