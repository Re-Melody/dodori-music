package V2;

import B2.AbstractC0111a;
import B2.B;
import B2.C;
import D8.O;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class n implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B4.a f12523d = new B4.a(0, -9223372036854775807L, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B4.a f12524e = new B4.a(2, -9223372036854775807L, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B4.a f12525f = new B4.a(3, -9223372036854775807L, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f12526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f12527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f12528c;

    public n(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i10 = C.f560a;
        this.f12526a = Executors.newSingleThreadExecutor(new B(strConcat, 0));
    }

    public final void a() {
        j jVar = this.f12527b;
        AbstractC0111a.i(jVar);
        jVar.a(false);
    }

    @Override // V2.o
    public final void b() throws IOException {
        IOException iOException;
        IOException iOException2 = this.f12528c;
        if (iOException2 != null) {
            throw iOException2;
        }
        j jVar = this.f12527b;
        if (jVar != null && (iOException = jVar.f12517e) != null && jVar.f12518f > jVar.f12513a) {
            throw iOException;
        }
    }

    public final boolean c() {
        return this.f12528c != null;
    }

    public final boolean d() {
        return this.f12527b != null;
    }

    public final void e(l lVar) {
        j jVar = this.f12527b;
        if (jVar != null) {
            jVar.a(true);
        }
        ExecutorService executorService = this.f12526a;
        if (lVar != null) {
            executorService.execute(new O(lVar, 20));
        }
        executorService.shutdown();
    }

    public final long f(k kVar, i iVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0111a.i(looperMyLooper);
        this.f12528c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j jVar = new j(this, looperMyLooper, kVar, iVar, i10, jElapsedRealtime);
        AbstractC0111a.h(this.f12527b == null);
        this.f12527b = jVar;
        jVar.f12517e = null;
        this.f12526a.execute(jVar);
        return jElapsedRealtime;
    }
}
