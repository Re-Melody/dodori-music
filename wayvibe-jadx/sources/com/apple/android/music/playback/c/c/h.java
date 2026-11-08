package com.apple.android.music.playback.c.c;

import android.os.Looper;
import com.apple.android.music.playback.model.PlayerMediaItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c, ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17135a = "h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.apple.android.music.playback.c.a.a f17137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f17138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f17139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f17140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Future<Boolean> f17141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f17142h = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f17143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j.a f17144j;
    private Map<String, Future> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, List<c>> f17145l;

    public h(com.apple.android.music.playback.c.d dVar, com.apple.android.music.playback.c.a.a aVar, b bVar, j jVar, j.a aVar2) {
        this.f17136b = dVar;
        this.f17137c = aVar;
        this.f17138d = bVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f17139e = new ThreadPoolExecutor(0, 2, 90000L, timeUnit, this.f17142h, this);
        this.f17140f = new ThreadPoolExecutor(0, 1, 90000L, timeUnit, new LinkedBlockingQueue(), this);
        this.f17141g = null;
        this.f17143i = jVar;
        this.f17144j = aVar2;
        this.k = new C2230e(6);
        this.f17145l = new C2230e(6);
    }

    public void a(PlayerMediaItem playerMediaItem, c cVar, boolean z10) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalArgumentException("requestAsset must be called from a thread with an associated looper");
        }
        synchronized (this) {
            try {
                String strA = a(playerMediaItem);
                if (this.k.containsKey(strA)) {
                    this.f17145l.get(strA).add(cVar);
                } else {
                    d dVarA = a(playerMediaItem, looperMyLooper, this, z10);
                    if (dVarA == null) {
                        cVar.a(playerMediaItem, new IOException("Unsupported asset endpoint type"));
                        return;
                    }
                    Future<?> futureSubmit = this.f17139e.submit(dVarA);
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(cVar);
                    this.k.put(strA, futureSubmit);
                    this.f17145l.put(strA, arrayList);
                    this.k.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "PlaybackAssetRequestManager:Executor");
    }

    public void a(boolean z10) {
        try {
            a(z10, false);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void a(boolean z10, boolean z11) {
        Future<Boolean> future = this.f17141g;
        if (future == null || future.isDone() || this.f17141g.isCancelled()) {
            k kVar = new k(this.f17136b, this.f17143i, z10);
            if (z11) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(kVar);
                    Future<Boolean> future2 = (Future) this.f17140f.invokeAll(arrayList).get(0);
                    this.f17141g = future2;
                    if (future2.get().booleanValue()) {
                        return;
                    } else {
                        throw new Exception("requestLease() FAILED could not acquire the lease");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    throw new IOException(e2.getMessage());
                }
            }
            this.f17141g = this.f17140f.submit(kVar);
        }
    }

    @Override // com.apple.android.music.playback.c.c.c
    public void a(PlayerMediaItem playerMediaItem, com.apple.android.music.playback.model.i iVar) {
        synchronized (this) {
            try {
                String strA = a(playerMediaItem);
                this.k.size();
                List<c> listRemove = this.f17145l.remove(strA);
                if (listRemove != null) {
                    Iterator<c> it = listRemove.iterator();
                    while (it.hasNext()) {
                        it.next().a(playerMediaItem, iVar);
                    }
                }
                this.k.remove(strA);
                this.k.size();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.c.c.c
    public void a(PlayerMediaItem playerMediaItem, IOException iOException) {
        synchronized (this) {
            try {
                String strA = a(playerMediaItem);
                this.k.size();
                List<c> listRemove = this.f17145l.remove(strA);
                if (listRemove != null) {
                    Iterator<c> it = listRemove.iterator();
                    while (it.hasNext()) {
                        it.next().a(playerMediaItem, iOException);
                    }
                }
                this.k.remove(strA);
                this.k.size();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private d a(PlayerMediaItem playerMediaItem, Looper looper, c cVar, boolean z10) {
        int iB = playerMediaItem.b();
        if (iB == 1) {
            return new q(this, playerMediaItem, this.f17136b, this.f17143i, z10, this.f17138d, this.f17137c, looper, cVar, this.f17144j);
        }
        if (iB == 2) {
            return new g(this, playerMediaItem, this.f17136b, this.f17143i, z10, this.f17138d, this.f17137c, looper, cVar, this.f17144j);
        }
        if (iB != 3) {
            return null;
        }
        if (this.f17136b.e()) {
            return new f(this, playerMediaItem, this.f17136b, this.f17138d, this.f17143i, z10, this.f17137c, looper, cVar, this.f17144j);
        }
        return new a(this, playerMediaItem, this.f17136b, this.f17143i, this.f17138d, this.f17137c, looper, cVar, this.f17144j);
    }

    private static String a(PlayerMediaItem playerMediaItem) {
        return playerMediaItem.b() + "_" + playerMediaItem.a();
    }
}
