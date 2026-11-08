package com.apple.android.music.playback.queue.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.apple.android.music.playback.c.d;
import com.apple.android.music.playback.model.s;

/* JADX INFO: loaded from: classes.dex */
public final class b extends SQLiteOpenHelper {
    public b(d dVar) {
        super(dVar.f(), dVar.y(), (SQLiteDatabase.CursorFactory) null, 3);
    }

    public void a() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        a.c(writableDatabase);
        s.c(writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        s.a(sQLiteDatabase);
        a.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        s.b(sQLiteDatabase);
        a.b(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }
}
