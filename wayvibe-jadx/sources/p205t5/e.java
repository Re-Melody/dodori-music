package p205t5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p104j5.c;
import p138m5.i;
import p236w5.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f26844b;

    public /* synthetic */ e(long j10, i iVar) {
        this.f26843a = j10;
        this.f26844b = iVar;
    }

    @Override // p205t5.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f26843a));
        i iVar = this.f26844b;
        String str = iVar.f22327a;
        c cVar = iVar.f22329c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(a.a(cVar))}) < 1) {
            contentValues.put("backend_name", iVar.f22327a);
            contentValues.put(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, Integer.valueOf(a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
