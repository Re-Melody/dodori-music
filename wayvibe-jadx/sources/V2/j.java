package V2;

import B2.AbstractC0111a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f12516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f12517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f12519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f12521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f12522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i10, long j10) {
        super(looper);
        this.f12522j = nVar;
        this.f12514b = kVar;
        this.f12516d = iVar;
        this.f12513a = i10;
        this.f12515c = j10;
    }

    public final void a(boolean z10) {
        this.f12521i = z10;
        this.f12517e = null;
        if (hasMessages(1)) {
            this.f12520h = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f12520h = true;
                    this.f12514b.k();
                    Thread thread = this.f12519g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z10) {
            this.f12522j.f12527b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.f12516d;
            iVar.getClass();
            iVar.r(this.f12514b, jElapsedRealtime, jElapsedRealtime - this.f12515c, true);
            this.f12516d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f12521i) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            this.f12517e = null;
            n nVar = this.f12522j;
            ExecutorService executorService = nVar.f12526a;
            j jVar = nVar.f12527b;
            jVar.getClass();
            executorService.execute(jVar);
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f12522j.f12527b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f12515c;
        i iVar = this.f12516d;
        iVar.getClass();
        if (this.f12520h) {
            iVar.r(this.f12514b, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                iVar.h(this.f12514b, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e2) {
                AbstractC0111a.m("LoadTask", "Unexpected exception handling load completed", e2);
                this.f12522j.f12528c = new m(e2);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f12517e = iOException;
        int i12 = this.f12518f + 1;
        this.f12518f = i12;
        B4.a aVarN = iVar.n(this.f12514b, jElapsedRealtime, j10, iOException, i12);
        int i13 = aVarN.f650a;
        if (i13 == 3) {
            this.f12522j.f12528c = this.f12517e;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f12518f = 1;
            }
            long jMin = aVarN.f651b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f12518f - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000);
            }
            n nVar2 = this.f12522j;
            AbstractC0111a.h(nVar2.f12527b == null);
            nVar2.f12527b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                this.f12517e = null;
                nVar2.f12526a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f12520h;
                this.f12519g = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f12514b.getClass().getSimpleName()));
                try {
                    this.f12514b.h();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f12519g = null;
                Thread.interrupted();
            }
            if (this.f12521i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.f12521i) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.f12521i) {
                return;
            }
            AbstractC0111a.m("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new m(e4)).sendToTarget();
        } catch (Error e7) {
            if (!this.f12521i) {
                AbstractC0111a.m("LoadTask", "Unexpected error loading stream", e7);
                obtainMessage(4, e7).sendToTarget();
            }
            throw e7;
        } catch (Exception e10) {
            if (this.f12521i) {
                return;
            }
            AbstractC0111a.m("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new m(e10)).sendToTarget();
        }
    }
}
