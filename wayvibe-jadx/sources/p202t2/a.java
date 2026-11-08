package p202t2;

import F5.d;
import Z4.G;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Handler f26689f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f26694e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f26691b = d.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26692c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26693d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f26690a = new b(this, new G(this, 1));

    public a(d dVar) {
        this.f26694e = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f26689f == null) {
                    f26689f = new Handler(Looper.getMainLooper());
                }
                handler = f26689f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new C8.a(23, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26694e.b();
    }
}
