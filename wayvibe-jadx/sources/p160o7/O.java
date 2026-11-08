package p160o7;

import D7.W;
import F.C0356a;
import S9.b;
import U2.s;
import V0.p;
import W4.m;
import Y7.e;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteProgram;
import com.google.firebase.firestore.J;
import com.google.firebase.firestore.K;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p117k7.d;
import p150n8.a;
import p170p7.f;
import p207t7.r;
import p242x0.c;
import s7.F;

/* JADX INFO: loaded from: classes.dex */
public final class O extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f23710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f23711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T f23712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f23713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f23714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final K f23715j;
    public final M k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SQLiteDatabase f23716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23717m;

    public O(Context context, String str, f fVar, e eVar, C0356a c0356a) {
        N n6 = new N(context, eVar, I0(str, fVar));
        this.k = new M(this);
        this.f23710e = n6;
        this.f23711f = eVar;
        this.f23712g = new T(this, eVar);
        this.f23713h = new m(28, this, eVar);
        this.f23714i = new a(this, eVar);
        this.f23715j = new K(this, c0356a);
    }

    public static void G0(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sQLiteProgram.bindNull(i10 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i10 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i10 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i10 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i10 + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    c.l("Unknown argument %s of type %s", obj, obj.getClass());
                    throw null;
                }
                sQLiteProgram.bindBlob(i10 + 1, (byte[]) obj);
            }
        }
    }

    public static void H0(Context context, f fVar, String str) {
        String path = context.getDatabasePath(I0(str, fVar)).getPath();
        String strN = p.n(path, "-journal");
        String strN2 = p.n(path, "-wal");
        File file = new File(path);
        File file2 = new File(strN);
        File file3 = new File(strN2);
        try {
            W.z(file);
            W.z(file2);
            W.z(file3);
        } catch (IOException e2) {
            throw new K("Failed to clear persistence." + e2, J.UNKNOWN);
        }
    }

    public static String I0(String str, f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f25259a, "utf-8") + "." + URLEncoder.encode(fVar.f25260b, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // S9.b
    public final x C(d dVar, InterfaceC2178g interfaceC2178g) {
        e eVar = this.f23711f;
        s sVar = new s();
        sVar.f12164b = this;
        sVar.f12165c = eVar;
        String str = dVar.f21662a;
        if (str == null) {
            str = "";
        }
        sVar.f12167e = str;
        sVar.f12168f = F.f26162v;
        sVar.f12166d = interfaceC2178g;
        return sVar;
    }

    @Override // S9.b
    public final y F() {
        return new e(this, 28);
    }

    @Override // S9.b
    public final B I() {
        return this.f23715j;
    }

    @Override // S9.b
    public final C J() {
        return this.f23714i;
    }

    public final void J0(String str, Object... objArr) {
        this.f23716l.execSQL(str, objArr);
    }

    public final a K0(String str) {
        return new a(this.f23716l, str);
    }

    @Override // S9.b
    public final V M() {
        return this.f23712g;
    }

    @Override // S9.b
    public final boolean Y() {
        return this.f23717m;
    }

    @Override // S9.b
    public final Object i0(String str, p207t7.s sVar) {
        r.a("b", "Starting transaction: %s", str);
        this.f23716l.beginTransactionWithListener(this.k);
        try {
            Object obj = sVar.get();
            this.f23716l.setTransactionSuccessful();
            return obj;
        } finally {
            this.f23716l.endTransaction();
        }
    }

    @Override // S9.b
    public final void j0(String str, Runnable runnable) {
        r.a("b", "Starting transaction: %s", str);
        this.f23716l.beginTransactionWithListener(this.k);
        try {
            runnable.run();
            this.f23716l.setTransactionSuccessful();
        } finally {
            this.f23716l.endTransaction();
        }
    }

    @Override // S9.b
    public final void n0() {
        c.z("SQLitePersistence shutdown without start!", this.f23717m, new Object[0]);
        this.f23717m = false;
        this.f23716l.close();
        this.f23716l = null;
    }

    @Override // S9.b
    public final void o0() {
        boolean z10;
        c.z("SQLitePersistence double-started!", !this.f23717m, new Object[0]);
        this.f23717m = true;
        try {
            this.f23716l = this.f23710e.getWritableDatabase();
            T t10 = this.f23712g;
            a aVarK0 = t10.f23728a.K0("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1");
            G g3 = new G(t10, 2);
            Cursor cursorC0 = aVarK0.C0();
            try {
                if (cursorC0.moveToFirst()) {
                    g3.accept(cursorC0);
                    cursorC0.close();
                    z10 = true;
                } else {
                    cursorC0.close();
                    z10 = false;
                }
                c.z("Missing target_globals entry", z10, new Object[0]);
                long j10 = t10.f23731d;
                K k = this.f23715j;
                k.getClass();
                C0356a c0356a = new C0356a();
                c0356a.f3516a = j10;
                k.f23699b = c0356a;
            } catch (Throwable th) {
                if (cursorC0 != null) {
                    try {
                        cursorC0.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e2) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e2);
        }
    }

    @Override // S9.b
    public final InterfaceC2172a w() {
        return this.f23713h;
    }

    @Override // S9.b
    public final InterfaceC2173b y(d dVar) {
        e eVar = this.f23711f;
        a aVar = new a();
        aVar.f22979a = this;
        aVar.f22980b = eVar;
        String str = dVar.f21662a;
        if (str == null) {
            str = "";
        }
        aVar.f22981c = str;
        return aVar;
    }

    @Override // S9.b
    public final InterfaceC2178g z(d dVar) {
        return new I(this, this.f23711f, dVar);
    }
}
