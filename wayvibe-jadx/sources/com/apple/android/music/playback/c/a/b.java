package com.apple.android.music.playback.c.a;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f17032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f17033b = new ThreadPoolExecutor(0, 1, 90000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Future<?>> f17034c = new C2230e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f17035d = new C2230e(0);

    public b(a aVar) {
        this.f17032a = aVar;
    }

    public void a() {
        synchronized (this) {
            try {
                Iterator<String> it = this.f17034c.keySet().iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        a();
        this.f17033b.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "MediaAssetDownloadManager:Executor");
    }

    private void a(String str) {
        Future<?> future = this.f17034c.get(str);
        if (future != null) {
            future.cancel(true);
            this.f17034c.remove(str);
            this.f17035d.remove(str);
        }
    }
}
