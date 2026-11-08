package W7;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.List;
import p160o7.O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12890b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f12889a = i10;
        this.f12890b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f12889a) {
            case 0:
                List list = ((m) this.f12890b).f12939b;
                if (list != null) {
                    int size = list.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object objA = m.a(list.get(i10));
                        int i11 = i10 + 1;
                        if (objA == null) {
                            sQLiteQuery.bindNull(i11);
                        } else if (objA instanceof byte[]) {
                            sQLiteQuery.bindBlob(i11, (byte[]) objA);
                        } else if (objA instanceof Double) {
                            sQLiteQuery.bindDouble(i11, ((Double) objA).doubleValue());
                        } else if (objA instanceof Integer) {
                            sQLiteQuery.bindLong(i11, ((Integer) objA).intValue());
                        } else if (objA instanceof Long) {
                            sQLiteQuery.bindLong(i11, ((Long) objA).longValue());
                        } else if (objA instanceof String) {
                            sQLiteQuery.bindString(i11, (String) objA);
                        } else {
                            if (!(objA instanceof Boolean)) {
                                throw new IllegalArgumentException("Could not bind " + objA + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                            }
                            sQLiteQuery.bindLong(i11, ((Boolean) objA).booleanValue() ? 1L : 0L);
                        }
                        i10 = i11;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                O.G0(sQLiteQuery, (Object[]) this.f12890b);
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
