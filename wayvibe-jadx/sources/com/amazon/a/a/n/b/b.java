package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16346a = new com.amazon.a.a.o.c("SimpleTaskPipeline");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f16347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Runnable> f16348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16349d;

    private b(HandlerThread handlerThread) {
        this.f16348c = Collections.synchronizedSet(new HashSet());
        this.f16349d = handlerThread.getName();
        handlerThread.start();
        this.f16347b = new Handler(handlerThread.getLooper());
    }

    private Runnable c(final com.amazon.a.a.n.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f16348c.remove(this);
                try {
                    if (com.amazon.a.a.o.c.f16456a) {
                        b.f16346a.a(b.this.f16349d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                    if (com.amazon.a.a.o.c.f16456a) {
                        b.f16346a.a(b.this.f16349d + ": Task finished executing: " + aVar);
                    }
                } catch (Throwable th) {
                    try {
                        if (com.amazon.a.a.o.c.f16457b) {
                            b.f16346a.b("Task Failed with unhandled exception: " + th, th);
                        }
                    } finally {
                        if (com.amazon.a.a.o.c.f16456a) {
                            b.f16346a.a(b.this.f16349d + ": Task finished executing: " + aVar);
                        }
                    }
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.f16348c.add(runnable);
        return runnable;
    }

    public static b a(String str) {
        return new b(new HandlerThread(p134m1.b.k("KIWI_", str)));
    }

    public static b b(String str) {
        return new b(str);
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f16456a) {
            f16346a.a(this.f16349d + ": Scheduling task immediately: " + aVar);
        }
        this.f16347b.postAtFrontOfQueue(c(aVar));
    }

    private b(String str) {
        this.f16348c = Collections.synchronizedSet(new HashSet());
        this.f16349d = str;
        this.f16347b = new Handler();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f16456a) {
            f16346a.a("Scheduling task: " + aVar);
        }
        this.f16347b.post(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long jA = a(date);
        if (com.amazon.a.a.o.c.f16456a) {
            f16346a.a(this.f16349d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + jA);
        }
        this.f16347b.postAtTime(c(aVar), jA);
    }

    private long a(Date date) {
        return (date.getTime() - System.currentTimeMillis()) + SystemClock.uptimeMillis();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j10) {
        if (com.amazon.a.a.o.c.f16456a) {
            f16346a.a(this.f16349d + ": Scheduling task: " + aVar + ", with delay: " + j10);
        }
        this.f16347b.postDelayed(c(aVar), j10);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        for (Runnable runnable : this.f16348c) {
            if (com.amazon.a.a.o.c.f16456a) {
                f16346a.a(this.f16349d + ": Removing callback: " + runnable);
            }
            this.f16347b.removeCallbacks(runnable);
        }
        this.f16348c.clear();
        if (this.f16347b.getLooper() == Looper.getMainLooper() || !this.f16347b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = f16346a;
        cVar.a("Interrupting looper thread!");
        this.f16347b.getLooper().getThread().interrupt();
        cVar.a("Quitting looper: " + this.f16347b.getLooper().getThread() + ", " + this.f16347b.getLooper().getThread().isAlive());
        this.f16347b.getLooper().quit();
    }
}
