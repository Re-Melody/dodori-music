package com.apple.android.music.playback.queue;

import D7.p1;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.LongSparseArray;
import android.util.LruCache;
import android.util.Pair;
import android.util.SparseArray;
import com.apple.android.music.playback.model.PlayerMediaItem;
import com.apple.android.music.playback.model.PlayerQueueItem;
import com.apple.android.music.playback.model.m;
import com.apple.android.music.playback.model.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Handler.Callback, com.apple.android.music.playback.c.d.a, com.apple.android.music.playback.c.d.a.InterfaceC0014a, PlaybackQueueItemProvider.a, e, ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.c.a.a f17516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f17517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f17518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f17519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f17520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f17521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<e.a> f17522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.apple.android.music.playback.queue.a.b f17523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f17524j;
    private final AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ConditionVariable f17525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LruCache<Long, PlayerQueueItem> f17526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.apple.android.music.playback.f.d f17527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SparseArray<PlaybackQueueItemProvider> f17528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<PlayerQueueItem> f17529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17530q;
    private int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PlaybackQueueItemProvider f17532t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SparseArray<Pair<PlaybackQueueItemProvider, Integer>> f17533u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<PlaybackQueueItemProvider> f17534v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LongSparseArray<Long> f17535w;

    public b(com.apple.android.music.playback.c.d dVar, com.apple.android.music.playback.c.a.a aVar, Handler handler, Handler handler2) {
        this.f17515a = dVar;
        dVar.a(this);
        this.f17516b = aVar;
        this.f17523i = new com.apple.android.music.playback.queue.a.b(dVar);
        HandlerThread handlerThread = new HandlerThread("PlaybackQueueManager:Handler", 10);
        this.f17518d = handlerThread;
        handlerThread.start();
        this.f17517c = new Handler(handlerThread.getLooper(), this);
        this.f17519e = Executors.newCachedThreadPool(this);
        this.f17520f = new Handler(handler.getLooper(), this);
        this.f17521g = new Handler(handler2.getLooper(), this);
        this.f17522h = new CopyOnWriteArraySet();
        this.k = new AtomicInteger(-1);
        this.f17525l = new ConditionVariable();
        this.f17527n = new com.apple.android.music.playback.f.d();
        this.f17528o = new SparseArray<>();
        this.f17526m = new LruCache<>(256);
        this.f17529p = Collections.EMPTY_LIST;
        this.f17530q = -1;
        this.r = 0;
        this.f17531s = 0;
        this.f17524j = new f(dVar, this);
        this.f17533u = new SparseArray<>();
        this.f17534v = new ArrayList();
        this.f17535w = new LongSparseArray<>(4);
    }

    private static int f(long j10) {
        return (int) (j10 >> 32);
    }

    private static int g(long j10) {
        return (int) (j10 & 4294967295L);
    }

    private void p() {
        synchronized (this) {
            try {
                if (this.f17530q == -1 && this.f17527n.a() == 0) {
                    return;
                }
                this.f17530q = e(this.f17530q, this.f17527n.a());
                this.f17529p = null;
                this.f17521g.obtainMessage(18).sendToTarget();
                this.f17521g.obtainMessage(14, 0, 0).sendToTarget();
                if (this.f17530q == -1) {
                    this.f17521g.obtainMessage(21, new com.apple.android.music.playback.model.f()).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void q() throws Throwable {
        this.f17524j.a();
    }

    private void r() {
        synchronized (this) {
            this.f17524j.b();
        }
    }

    private void s() {
        synchronized (this) {
            this.f17524j.c();
        }
    }

    private boolean t() {
        int i10 = this.f17530q;
        return i10 >= 0 && i10 < this.f17527n.a() && this.f17532t != null && f(this.f17527n.b(this.f17530q)) == this.f17532t.a();
    }

    private void u() {
        synchronized (this) {
            this.f17529p = b(this.f17530q, this.f17527n, this.f17528o, this.f17526m);
        }
    }

    private int v() {
        this.k.compareAndSet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0);
        return this.k.incrementAndGet();
    }

    @Override // com.apple.android.music.playback.queue.e
    public void a(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        if (this.k.get() < 0) {
            this.f17517c.obtainMessage(22).sendToTarget();
        }
        this.f17517c.obtainMessage(23, i10, 0, playbackQueueItemProvider).sendToTarget();
    }

    @Override // com.apple.android.music.playback.queue.e
    public void c(int i10) {
        if (this.f17517c.hasMessages(5)) {
            return;
        }
        this.f17517c.obtainMessage(5, i10, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.queue.e
    public int d() {
        int iE;
        synchronized (this) {
            iE = e(0, this.f17527n.a());
        }
        return iE;
    }

    @Override // com.apple.android.music.playback.queue.e
    public int e() {
        int iA;
        synchronized (this) {
            iA = this.f17527n.a();
        }
        return iA;
    }

    @Override // com.apple.android.music.playback.queue.e
    public int h(int i10) {
        synchronized (this) {
            if (i10 >= 0) {
                try {
                    if (i10 < this.f17527n.a()) {
                        return g(this.f17527n.b(i10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return -1;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        switch (message.what) {
            case 1:
                d((PlaybackQueueItemProvider) message.obj, message.arg1);
                return true;
            case 2:
                d(com.apple.android.music.playback.f.b.a(message));
                return true;
            case 3:
                Pair pair = (Pair) message.obj;
                b(com.apple.android.music.playback.f.b.a(message), ((Long) pair.first).longValue(), ((Integer) pair.second).intValue());
                return true;
            case 4:
                o(message.arg1);
                return true;
            case 5:
                p(message.arg1);
                return true;
            case 6:
                b(message.arg1, message.arg2);
                return true;
            case 7:
                c((PlaybackQueueItemProvider) message.obj);
                return true;
            case 8:
                p();
                return true;
            case 9:
                q();
                return true;
            case 10:
                r();
                return true;
            case 11:
                s();
                return true;
            case 12:
                a(message.arg1, message.arg2, (List<com.apple.android.music.playback.c.d.b>) message.obj);
                return true;
            case 13:
                Iterator<e.a> it = this.f17522h.iterator();
                while (it.hasNext()) {
                    it.next().a(this, message.arg1);
                }
                return true;
            case 14:
                Iterator<e.a> it2 = this.f17522h.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this, message.arg1);
                }
                return true;
            case 15:
                Iterator<e.a> it3 = this.f17522h.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this, ((Integer) message.obj).intValue(), message.arg1, message.arg2);
                }
                return true;
            case 16:
                Iterator<e.a> it4 = this.f17522h.iterator();
                while (it4.hasNext()) {
                    it4.next().c(this, message.arg1);
                }
                return true;
            case 17:
                Iterator<e.a> it5 = this.f17522h.iterator();
                while (it5.hasNext()) {
                    it5.next().d(this, message.arg1);
                }
                return true;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                Iterator<e.a> it6 = this.f17522h.iterator();
                while (it6.hasNext()) {
                    it6.next().a(this);
                }
                return true;
            case 19:
                Iterator<e.a> it7 = this.f17522h.iterator();
                while (it7.hasNext()) {
                    it7.next().a(this, (PlayerQueueItem) message.obj);
                }
                return true;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                Pair pair2 = (Pair) message.obj;
                Iterator<e.a> it8 = this.f17522h.iterator();
                while (it8.hasNext()) {
                    it8.next().a(this, (PlaybackQueueItemProvider) pair2.first, (Exception) pair2.second);
                }
                return true;
            case 21:
                Exception exc = (Exception) message.obj;
                Iterator<e.a> it9 = this.f17522h.iterator();
                while (it9.hasNext()) {
                    it9.next().a(this, exc);
                }
                return true;
            case 22:
                this.f17523i.a();
                this.k.set(0);
                return true;
            case 23:
                c((PlaybackQueueItemProvider) message.obj, message.arg1);
                return true;
            default:
                return false;
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public int i(int i10) {
        return c(i10, g());
    }

    @Override // com.apple.android.music.playback.queue.e
    public int j(int i10) {
        return d(i10, g());
    }

    @Override // com.apple.android.music.playback.queue.e
    public int k(int i10) {
        synchronized (this) {
            try {
                int iA = this.f17527n.a();
                if (i10 < 0) {
                    if (g() == 0) {
                        return 0;
                    }
                    return (i10 + iA) % iA;
                }
                if (i10 < iA) {
                    return i10;
                }
                if (g() == 0) {
                    return iA - 1;
                }
                return i10 % iA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public int l(int i10) {
        synchronized (this) {
            try {
                if (g() == 1) {
                    return i10;
                }
                return i(i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    @Override // com.apple.android.music.playback.queue.e
    public boolean m(int i10) {
        boolean z10;
        synchronized (this) {
            if (i10 >= 0) {
                try {
                    if (i10 >= this.f17527n.a() || !a(d(i10))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.apple.android.music.playback.queue.e
    public boolean n(int i10) {
        PlaybackQueueItemProvider playbackQueueItemProvider;
        if (i10 == 1 || i10 == 5 || i10 == 6 || (playbackQueueItemProvider = this.f17532t) == null) {
            return true;
        }
        if (playbackQueueItemProvider.a(i10)) {
            return i10 != 2 || this.f17532t.h() <= 50;
        }
        return false;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "PlaybackQueueManager:Executor");
    }

    public void o() {
        synchronized (this) {
            try {
                if (this.k.get() < 0) {
                    this.k.set(0);
                }
                int size = this.f17528o.size();
                for (int i10 = 0; i10 < size; i10++) {
                    PlaybackQueueItemProvider playbackQueueItemProviderValueAt = this.f17528o.valueAt(i10);
                    playbackQueueItemProviderValueAt.a();
                    this.f17534v.add(playbackQueueItemProviderValueAt);
                    try {
                        playbackQueueItemProviderValueAt.a(this, this.f17515a, this.f17519e, this.f17517c, this);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                if (size == 0) {
                    this.f17525l.open();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static long f(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    @Override // com.apple.android.music.playback.queue.e
    public void b(int i10) {
        this.f17517c.obtainMessage(4, i10, 0).sendToTarget();
    }

    @Override // com.apple.android.music.playback.queue.e
    public int g(int i10) {
        synchronized (this) {
            if (i10 >= 0) {
                try {
                    if (i10 < this.f17527n.a()) {
                        PlaybackQueueItemProvider playbackQueueItemProvider = this.f17528o.get(f(this.f17527n.b(i10)));
                        if (playbackQueueItemProvider == null) {
                            return 0;
                        }
                        return playbackQueueItemProvider.j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return 0;
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public boolean i() {
        return t() && !this.f17532t.b();
    }

    @Override // com.apple.android.music.playback.queue.e
    public boolean j() {
        return t() && !this.f17532t.b();
    }

    @Override // com.apple.android.music.playback.queue.e
    public int b(long j10) {
        int iB;
        synchronized (this) {
            iB = this.f17527n.b(j10);
        }
        return iB;
    }

    @Override // com.apple.android.music.playback.queue.e
    public int c() {
        int i10;
        synchronized (this) {
            i10 = this.f17530q;
        }
        return i10;
    }

    @Override // com.apple.android.music.playback.queue.e
    public String f(int i10) {
        synchronized (this) {
            if (i10 >= 0) {
                try {
                    if (i10 < this.f17527n.a()) {
                        PlaybackQueueItemProvider playbackQueueItemProvider = this.f17528o.get(f(this.f17527n.b(i10)));
                        if (playbackQueueItemProvider == null) {
                            return null;
                        }
                        return playbackQueueItemProvider.i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public void a(long j10) {
        Message messageObtainMessage = this.f17517c.obtainMessage(2);
        com.apple.android.music.playback.f.b.a(messageObtainMessage, j10);
        messageObtainMessage.sendToTarget();
    }

    @Override // com.apple.android.music.playback.queue.e
    public PlayerQueueItem d(int i10) {
        PlayerQueueItem playerQueueItemA;
        synchronized (this) {
            playerQueueItemA = a(i10, this.f17527n, this.f17528o, this.f17526m);
        }
        return playerQueueItemA;
    }

    @Override // com.apple.android.music.playback.queue.e
    public long e(int i10) {
        synchronized (this) {
            if (i10 >= 0) {
                try {
                    if (i10 < this.f17527n.a()) {
                        return this.f17527n.b(i10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return -1L;
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public void m() {
        this.f17517c.obtainMessage(9).sendToTarget();
        this.f17525l.close();
        this.f17525l.block(2000L);
    }

    @Override // com.apple.android.music.playback.queue.e
    public void n() {
        this.f17517c.removeCallbacksAndMessages(null);
        this.f17521g.removeCallbacksAndMessages(null);
        this.f17520f.removeCallbacksAndMessages(null);
        this.f17518d.quitSafely();
        synchronized (this) {
            try {
                int size = this.f17528o.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f17528o.valueAt(i10).a(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17523i.close();
        this.f17515a.b(this);
    }

    @Override // com.apple.android.music.playback.queue.e
    public void b(e.a aVar) {
        this.f17522h.remove(aVar);
    }

    @Override // com.apple.android.music.playback.queue.e
    public int c(long j10) {
        synchronized (this) {
            try {
                Long l10 = this.f17535w.get(j10);
                if (l10 != null) {
                    return b(l10.longValue());
                }
                return b(j10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public SQLiteDatabase l() {
        return this.f17523i.getWritableDatabase();
    }

    private void d(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        c gVar;
        int iA;
        playbackQueueItemProvider.a();
        playbackQueueItemProvider.c();
        playbackQueueItemProvider.h();
        synchronized (this) {
            try {
                if (!n(i10)) {
                    playbackQueueItemProvider.a(true);
                    return;
                }
                int iH = playbackQueueItemProvider.h();
                if (iH == 0) {
                    playbackQueueItemProvider.a(true);
                    return;
                }
                int i11 = this.f17527n.a() == 0 ? 1 : i10;
                if (i11 == 1 && this.f17528o.size() > 1 && this.f17530q < this.f17527n.a() - 1 && !playbackQueueItemProvider.b()) {
                    this.f17528o.size();
                    this.f17527n.a();
                    playbackQueueItemProvider.b();
                    playbackQueueItemProvider.a(false);
                    this.f17521g.obtainMessage(21, new o(playbackQueueItemProvider, (this.f17527n.a() - this.f17530q) - 1)).sendToTarget();
                    return;
                }
                int iC = playbackQueueItemProvider.c();
                if (e(playbackQueueItemProvider, i11)) {
                    gVar = new h(iC, iH);
                    iC = 0;
                } else {
                    gVar = new g(iH);
                }
                int iA2 = gVar.a();
                if (i11 == 1 || i11 == 5) {
                    if (!f(playbackQueueItemProvider, playbackQueueItemProvider.c() == -1 ? iA2 : playbackQueueItemProvider.c())) {
                        playbackQueueItemProvider.a(true);
                        this.f17521g.obtainMessage(20, Pair.create(playbackQueueItemProvider, new m("Network is unreachable with current settings"))).sendToTarget();
                        return;
                    }
                }
                if (i11 == 1 || i11 == 5 || i11 == 7) {
                    a(iH, i11, playbackQueueItemProvider.a());
                }
                boolean z10 = i11 == 1 || i11 == 5 || i11 == 6;
                if (z10 || i11 == 7) {
                    this.f17532t = playbackQueueItemProvider;
                }
                if (i11 == 3) {
                    iA = 1 + this.f17530q;
                } else if (i11 != 4 && i11 != 6) {
                    iA = this.f17527n.a();
                } else {
                    iA = this.f17530q;
                }
                int iMax = Math.max(Math.min(iA, this.f17527n.a()), 0);
                int iA3 = playbackQueueItemProvider.a();
                this.f17528o.put(iA3, playbackQueueItemProvider);
                com.apple.android.music.playback.f.d dVar = this.f17527n;
                dVar.c(dVar.a() + iH);
                int i12 = iMax;
                for (int i13 = -1; iA2 != i13; i13 = -1) {
                    this.f17527n.a(i12, f(iA3, iA2));
                    iA2 = gVar.a();
                    i12++;
                }
                if (i10 == 6) {
                    iC = iC == -1 ? iMax : iC + iMax;
                    iH = this.f17527n.a();
                }
                if (z10 || i11 == 7) {
                    this.f17530q = e(iC, iH);
                    if (playbackQueueItemProvider.e() != -1) {
                        this.f17531s = playbackQueueItemProvider.e();
                    }
                }
                if (iMax - this.f17530q <= 100) {
                    this.f17529p = null;
                }
                PlayerMediaItem playerMediaItemD = playbackQueueItemProvider.d(0);
                this.f17521g.obtainMessage(15, i10, playbackQueueItemProvider.j(), Integer.valueOf(playerMediaItemD != null ? playerMediaItemD.getType() : 0)).sendToTarget();
                if (z10) {
                    this.f17521g.obtainMessage(13, i11, 0).sendToTarget();
                    this.f17521g.obtainMessage(17, h(), 0).sendToTarget();
                    this.f17521g.obtainMessage(16, g(), 0).sendToTarget();
                } else {
                    this.f17521g.obtainMessage(18).sendToTarget();
                    this.f17521g.obtainMessage(14, i11, 0).sendToTarget();
                }
                if (this.f17530q == -1) {
                    this.f17521g.obtainMessage(21, new com.apple.android.music.playback.model.f()).sendToTarget();
                }
                this.f17517c.removeMessages(11);
                this.f17517c.obtainMessage(11).sendToTarget();
                if (z10 || i11 == 7) {
                    this.f17517c.removeMessages(10);
                    this.f17517c.obtainMessage(10).sendToTarget();
                }
                this.f17527n.a();
                this.f17528o.size();
                this.f17526m.size();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public void a(long j10, long j11, int i10) {
        Message messageObtainMessage = this.f17517c.obtainMessage(3);
        com.apple.android.music.playback.f.b.a(messageObtainMessage, j10);
        messageObtainMessage.obj = Pair.create(Long.valueOf(j11), Integer.valueOf(i10));
        messageObtainMessage.sendToTarget();
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider.a
    public void b(PlaybackQueueItemProvider playbackQueueItemProvider) {
        if (playbackQueueItemProvider.b() && playbackQueueItemProvider == this.f17532t) {
            this.f17520f.obtainMessage(7, playbackQueueItemProvider).sendToTarget();
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public int h() {
        synchronized (this) {
            try {
                PlaybackQueueItemProvider playbackQueueItemProvider = this.f17532t;
                if (playbackQueueItemProvider != null && playbackQueueItemProvider.b()) {
                    return 0;
                }
                if (t() && this.f17532t.d() != 0) {
                    return this.f17532t.d();
                }
                return this.f17531s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean e(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        if (playbackQueueItemProvider.b()) {
            return false;
        }
        if ((playbackQueueItemProvider.e() != -1 ? playbackQueueItemProvider.e() : this.f17531s) == 1) {
            return true;
        }
        return (i10 == 1 || i10 == 5 || i10 == 6) && playbackQueueItemProvider.d() == 1;
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider.a
    public void b(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        PlayerMediaItem playerMediaItemD;
        synchronized (this) {
            try {
                long jF = f(playbackQueueItemProvider.a(), i10);
                if (this.f17527n.b(jF) != -1 && (playerMediaItemD = playbackQueueItemProvider.d(i10)) != null) {
                    d dVar = new d(playerMediaItemD, jF);
                    this.f17526m.put(Long.valueOf(jF), dVar);
                    this.f17521g.obtainMessage(19, dVar).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) throws Throwable {
        Throwable th;
        playbackQueueItemProvider.a();
        if (playbackQueueItemProvider.a() == -1) {
            playbackQueueItemProvider.b(v());
        }
        synchronized (this) {
            if (i10 == 1) {
                try {
                    this.f17533u.clear();
                } catch (Throwable th2) {
                    th = th2;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        th = th3;
                    }
                }
            }
            try {
                this.f17533u.put(playbackQueueItemProvider.a(), Pair.create(playbackQueueItemProvider, Integer.valueOf(i10)));
                playbackQueueItemProvider.a(this, this.f17515a, this.f17519e, this.f17517c, this);
            } catch (Throwable th4) {
                th = th4;
                while (true) {
                    throw th;
                    th = th3;
                }
            }
        }
    }

    private void o(int i10) {
        synchronized (this) {
            try {
                if (i() && i10 != this.r) {
                    this.r = i10;
                    this.f17521g.obtainMessage(18).sendToTarget();
                    this.f17521g.obtainMessage(16, g(), 0).sendToTarget();
                    this.f17517c.removeMessages(10);
                    this.f17517c.obtainMessage(10).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public void a(int i10) {
        synchronized (this) {
            try {
                if (this.f17530q != i10 && i10 >= 0 && i10 < this.f17527n.a()) {
                    this.f17530q = i10;
                    this.f17529p = null;
                    this.f17517c.removeMessages(10);
                    this.f17517c.obtainMessage(10).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public int g() {
        synchronized (this) {
            try {
                PlaybackQueueItemProvider playbackQueueItemProvider = this.f17532t;
                if (playbackQueueItemProvider != null && playbackQueueItemProvider.b()) {
                    return 0;
                }
                return this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public boolean k() {
        PlaybackQueueItemProvider playbackQueueItemProvider = this.f17532t;
        if (playbackQueueItemProvider == null) {
            return false;
        }
        return !playbackQueueItemProvider.b();
    }

    private int e(int i10, int i11) {
        int i12 = i11 - 1;
        int iMin = Math.min(Math.max(0, i10), i12);
        int i13 = 0;
        while (!m(iMin)) {
            if (i13 >= i11) {
                return -1;
            }
            iMin = iMin == i12 ? 0 : iMin + 1;
            i13++;
        }
        return iMin;
    }

    private void p(int i10) throws Throwable {
        Throwable th;
        c gVar;
        int iG;
        synchronized (this) {
            try {
                try {
                    int iH = h();
                    if (!j() || i10 == iH) {
                        return;
                    }
                    this.f17531s = i10;
                    this.f17532t.c(i10);
                    long jB = this.f17527n.b(this.f17530q);
                    PlaybackQueueItemProvider playbackQueueItemProvider = this.f17532t;
                    int i11 = 0;
                    boolean z10 = i10 == 1;
                    int iH2 = playbackQueueItemProvider.h();
                    int iA = playbackQueueItemProvider.a();
                    int size = this.f17528o.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        try {
                            PlaybackQueueItemProvider playbackQueueItemProviderValueAt = this.f17528o.valueAt(i12);
                            if (playbackQueueItemProviderValueAt != playbackQueueItemProvider) {
                                playbackQueueItemProviderValueAt.a(true);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    this.f17532t = playbackQueueItemProvider;
                    this.f17521g.obtainMessage(17, this.f17531s, 0).sendToTarget();
                    LruCache<Long, PlayerQueueItem> lruCache = new LruCache<>(256);
                    com.apple.android.music.playback.f.d dVar = new com.apple.android.music.playback.f.d(iH2);
                    SparseArray<PlaybackQueueItemProvider> sparseArray = new SparseArray<>();
                    sparseArray.put(playbackQueueItemProvider.a(), playbackQueueItemProvider);
                    if (z10) {
                        gVar = new h(g(jB), iH2);
                        iG = 0;
                    } else {
                        gVar = new g(iH2);
                        iG = g(jB);
                    }
                    int iA2 = gVar.a();
                    while (iA2 != -1) {
                        dVar.a(i11, f(iA, iA2));
                        iA2 = gVar.a();
                        i11++;
                    }
                    a(b(iG, dVar, sparseArray, lruCache), iG, dVar, sparseArray, lruCache);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public List<PlayerQueueItem> f() {
        List<PlayerQueueItem> list;
        synchronized (this) {
            try {
                if (this.f17529p == null) {
                    u();
                }
                list = this.f17529p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    private int e(long j10) {
        int size = this.f17535w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f17535w.valueAt(i10).longValue() == j10) {
                return i10;
            }
        }
        return -1;
    }

    private boolean f(PlaybackQueueItemProvider playbackQueueItemProvider, int i10) {
        String.format("checkAssetAvailability: index = %d", Integer.valueOf(i10));
        PlayerMediaItem playerMediaItemD = playbackQueueItemProvider.d(i10);
        if (playerMediaItemD == null) {
            return false;
        }
        if (this.f17515a.i()) {
            return true;
        }
        String strD = playerMediaItemD.d();
        if (strD != null && !strD.isEmpty() && com.apple.android.music.playback.f.h.b(Uri.parse(strD))) {
            return true;
        }
        com.apple.android.music.playback.c.a.a aVar = this.f17516b;
        return aVar != null && aVar.a(playerMediaItemD);
    }

    public void b(ObjectInputStream objectInputStream) throws IOException {
        int i10 = objectInputStream.readInt();
        com.apple.android.music.playback.f.d dVar = new com.apple.android.music.playback.f.d(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.a(objectInputStream.readLong());
        }
        dVar.a();
        int i12 = objectInputStream.readInt();
        SparseArray<PlaybackQueueItemProvider> sparseArray = new SparseArray<>(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            PlaybackQueueItemProvider playbackQueueItemProvider = (PlaybackQueueItemProvider) objectInputStream.readObject();
            playbackQueueItemProvider.a();
            sparseArray.put(playbackQueueItemProvider.a(), playbackQueueItemProvider);
        }
        int i14 = objectInputStream.readInt();
        int i15 = objectInputStream.readInt();
        synchronized (this) {
            try {
                this.f17527n = dVar;
                this.f17528o = sparseArray;
                this.f17532t = sparseArray.get(i14);
                this.k.set(i15);
                List<PlayerQueueItem> list = this.f17529p;
                if (list != null) {
                    list.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public void a(int i10, int i11) {
        this.f17517c.obtainMessage(6, i10, i11).sendToTarget();
    }

    @Override // com.apple.android.music.playback.queue.e
    public void a(com.apple.android.music.playback.reporting.b bVar, int i10) {
        synchronized (this) {
            if (i10 >= 0) {
                try {
                    if (i10 < this.f17527n.a()) {
                        long jB = this.f17527n.b(i10);
                        int iF = f(jB);
                        int iG = g(jB);
                        PlaybackQueueItemProvider playbackQueueItemProvider = this.f17528o.get(iF);
                        if (playbackQueueItemProvider != null) {
                            playbackQueueItemProvider.a(bVar, iG);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void c(PlaybackQueueItemProvider playbackQueueItemProvider) {
        c gVar;
        synchronized (this) {
            try {
                int iA = this.f17527n.a();
                int iH = playbackQueueItemProvider.h();
                int i10 = iH - iA;
                if (i10 > 0) {
                    this.f17527n.c(iH);
                    com.apple.android.music.playback.f.d dVar = this.f17527n;
                    int iG = g(dVar.b(dVar.a() - 1)) + 1;
                    if (e(playbackQueueItemProvider, 2)) {
                        gVar = new h(iG, i10);
                    } else {
                        gVar = new g(iG, i10);
                    }
                    int iA2 = playbackQueueItemProvider.a();
                    int iA3 = this.f17527n.a();
                    int iA4 = gVar.a();
                    int i11 = iA3;
                    while (iA4 != -1) {
                        this.f17527n.a(i11, f(iA2, iA4));
                        iA4 = gVar.a();
                        i11++;
                    }
                    if (iA3 - this.f17530q <= 100) {
                        this.f17529p = null;
                    }
                    this.f17521g.obtainMessage(18).sendToTarget();
                    this.f17521g.obtainMessage(14, 0, 0).sendToTarget();
                    this.f17517c.removeMessages(11);
                    this.f17517c.obtainMessage(11).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.c.d.a
    public void b() {
    }

    public PlayerQueueItem a(int i10, com.apple.android.music.playback.f.d dVar, SparseArray<PlaybackQueueItemProvider> sparseArray, LruCache<Long, PlayerQueueItem> lruCache) {
        if (i10 >= 0 && i10 < dVar.a()) {
            long jB = dVar.b(i10);
            PlayerQueueItem playerQueueItem = lruCache.get(Long.valueOf(jB));
            if (playerQueueItem != null) {
                return playerQueueItem;
            }
            PlayerMediaItem playerMediaItemD = sparseArray.get(f(jB)).d(g(jB));
            if (playerMediaItemD == null) {
                return null;
            }
            d dVar2 = new d(playerMediaItemD, jB);
            lruCache.put(Long.valueOf(jB), dVar2);
            return dVar2;
        }
        dVar.a();
        return null;
    }

    public void b(ObjectOutputStream objectOutputStream) {
        synchronized (this) {
            try {
                int iA = this.f17527n.a();
                objectOutputStream.writeInt(iA);
                for (int i10 = 0; i10 < iA; i10++) {
                    objectOutputStream.writeLong(this.f17527n.b(i10));
                }
                int size = this.f17528o.size();
                objectOutputStream.writeInt(size);
                for (int i11 = 0; i11 < size; i11++) {
                    objectOutputStream.writeObject(this.f17528o.valueAt(i11));
                }
                objectOutputStream.writeInt(this.f17532t.a());
                objectOutputStream.writeInt(this.k.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.e
    public void a(e.a aVar) {
        this.f17522h.add(aVar);
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider.a
    public void a(PlaybackQueueItemProvider playbackQueueItemProvider) {
        playbackQueueItemProvider.a();
        synchronized (this) {
            try {
                Pair<PlaybackQueueItemProvider, Integer> pair = this.f17533u.get(playbackQueueItemProvider.a());
                if (pair != null) {
                    this.f17533u.remove(playbackQueueItemProvider.a());
                    this.f17520f.obtainMessage(1, ((Integer) pair.second).intValue(), 0, pair.first).sendToTarget();
                } else if (this.f17534v.contains(playbackQueueItemProvider)) {
                    this.f17534v.remove(playbackQueueItemProvider);
                    if (this.f17534v.isEmpty()) {
                        this.f17529p = null;
                        this.f17521g.obtainMessage(13, 1, 0).sendToTarget();
                        this.f17521g.obtainMessage(17, h(), 0).sendToTarget();
                        this.f17521g.obtainMessage(16, g(), 0).sendToTarget();
                        this.f17525l.open();
                    }
                } else {
                    playbackQueueItemProvider.a(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int c(int i10, int i11) throws Throwable {
        synchronized (this) {
            try {
                try {
                    return a(i10, i11, this.f17527n, this.f17528o, this.f17526m);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private void b(long j10, long j11, int i10) {
        if (j10 == j11) {
            return;
        }
        synchronized (this) {
            try {
                if (k()) {
                    int iB = this.f17527n.b(j10);
                    if (iB >= 0 && iB != this.f17530q) {
                        int iB2 = this.f17527n.b(j11);
                        if (iB2 >= 0 && iB2 != this.f17530q) {
                            long jA = this.f17527n.a(iB);
                            if (iB < iB2 && i10 == 2) {
                                iB2--;
                            }
                            this.f17527n.a(iB2, jA);
                            int i11 = this.f17530q;
                            if (iB > i11 || iB2 > i11) {
                                this.f17529p = null;
                            }
                            this.f17521g.obtainMessage(18).sendToTarget();
                            this.f17521g.obtainMessage(14, 0, 0).sendToTarget();
                            this.f17517c.removeMessages(11);
                            this.f17517c.obtainMessage(11).sendToTarget();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.queue.PlaybackQueueItemProvider.a
    public void a(PlaybackQueueItemProvider playbackQueueItemProvider, IOException iOException) {
        String.format("onProviderError: %s", playbackQueueItemProvider);
        synchronized (this) {
            try {
                this.f17533u.remove(playbackQueueItemProvider.a());
                if (this.f17534v.contains(playbackQueueItemProvider)) {
                    this.f17534v.remove(playbackQueueItemProvider);
                    if (this.f17534v.isEmpty()) {
                        this.f17529p = null;
                        this.f17521g.obtainMessage(13, 1, 0).sendToTarget();
                        this.f17521g.obtainMessage(17, h(), 0).sendToTarget();
                        this.f17521g.obtainMessage(16, g(), 0).sendToTarget();
                        this.f17525l.open();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        playbackQueueItemProvider.a(true);
        this.f17521g.obtainMessage(20, Pair.create(playbackQueueItemProvider, iOException)).sendToTarget();
    }

    private void b(int i10, int i11) {
        synchronized (this) {
            if (i10 >= 0) {
                try {
                    if (i10 < this.f17527n.a()) {
                        this.f17528o.get(f(this.f17527n.b(i10)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.apple.android.music.playback.c.d.a.InterfaceC0014a
    public void a(List<com.apple.android.music.playback.c.d.b> list) {
        synchronized (this) {
            long jB = this.f17527n.b(this.f17530q);
            this.f17517c.obtainMessage(12, f(jB), g(jB), list).sendToTarget();
        }
    }

    private ArrayList<PlayerQueueItem> b(int i10, com.apple.android.music.playback.f.d dVar, SparseArray<PlaybackQueueItemProvider> sparseArray, LruCache<Long, PlayerQueueItem> lruCache) {
        ArrayList<PlayerQueueItem> arrayList = new ArrayList<>();
        System.currentTimeMillis();
        dVar.a();
        sparseArray.size();
        lruCache.size();
        b bVar = this;
        int iA = bVar.a(i10, 0, dVar, sparseArray, lruCache);
        while (iA != -1 && arrayList.size() < 100) {
            arrayList.add(a(iA, dVar, sparseArray, lruCache));
            iA = bVar.a(iA, 0, dVar, sparseArray, lruCache);
            bVar = this;
        }
        arrayList.trimToSize();
        System.currentTimeMillis();
        arrayList.size();
        return arrayList;
    }

    private void d(long j10) {
        synchronized (this) {
            try {
                if (k()) {
                    int iB = this.f17527n.b(j10);
                    if (iB >= 0 && iB != this.f17530q) {
                        this.f17527n.a(iB);
                        this.f17526m.remove(Long.valueOf(j10));
                        if (iB > this.f17530q) {
                            this.f17529p = null;
                        }
                        this.f17521g.obtainMessage(18).sendToTarget();
                        this.f17521g.obtainMessage(14, 0, 0).sendToTarget();
                        this.f17517c.removeMessages(11);
                        this.f17517c.obtainMessage(11).sendToTarget();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.apple.android.music.playback.c.d.a
    public void a() {
        this.f17517c.obtainMessage(8).sendToTarget();
    }

    public void a(ObjectInputStream objectInputStream) throws IOException {
        int i10 = objectInputStream.readInt();
        int i11 = objectInputStream.readInt();
        int i12 = objectInputStream.readInt();
        synchronized (this) {
            this.f17530q = i10;
            this.r = i11;
            this.f17531s = i12;
        }
    }

    public void a(ObjectOutputStream objectOutputStream) {
        synchronized (this) {
            objectOutputStream.writeInt(this.f17530q);
            objectOutputStream.writeInt(this.r);
            objectOutputStream.writeInt(this.f17531s);
        }
    }

    private int d(int i10, int i11) {
        synchronized (this) {
            try {
                if (i10 <= 0 && i11 == 0) {
                    return -1;
                }
                int iA = this.f17527n.a();
                int i12 = i10 - 1;
                if (i11 != 0 && i12 < 0) {
                    i12 = iA - 1;
                }
                PlayerQueueItem playerQueueItemD = d(i12);
                while (!a(playerQueueItemD)) {
                    i12--;
                    if (i11 != 0 && i12 < 0) {
                        i12 = iA - 1;
                    }
                    if (i12 < 0) {
                        return -1;
                    }
                    playerQueueItemD = d(i12);
                }
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Exception exc) {
        synchronized (this) {
            this.f17527n = new com.apple.android.music.playback.f.d();
            this.f17528o = new SparseArray<>();
            this.k.set(0);
            this.f17530q = -1;
            this.r = 0;
            this.f17531s = 0;
            this.f17523i.getWritableDatabase().delete("provider_media_item", null, null);
            this.f17525l.open();
        }
    }

    private void a(ArrayList<PlayerQueueItem> arrayList, int i10, com.apple.android.music.playback.f.d dVar, SparseArray<PlaybackQueueItemProvider> sparseArray, LruCache<Long, PlayerQueueItem> lruCache) {
        synchronized (this) {
            arrayList.size();
            this.f17529p = arrayList;
            this.f17530q = i10;
            this.f17527n = dVar;
            this.f17528o = sparseArray;
            this.f17526m.evictAll();
            this.f17526m = lruCache;
            this.f17521g.obtainMessage(18).sendToTarget();
            this.f17521g.obtainMessage(14, 0, 0).sendToTarget();
            this.f17517c.removeMessages(11);
            this.f17517c.obtainMessage(11).sendToTarget();
            this.f17517c.removeMessages(10);
            this.f17517c.obtainMessage(10).sendToTarget();
        }
    }

    private void a(int i10, int i11, List<com.apple.android.music.playback.c.d.b> list) {
        synchronized (this) {
            this.f17528o.get(i10);
        }
    }

    private void a(int i10, int i11, int i12) {
        this.f17517c.removeCallbacksAndMessages(null);
        this.f17520f.removeCallbacksAndMessages(null);
        this.f17521g.removeCallbacksAndMessages(null);
        if (i11 == 7) {
            long jB = this.f17527n.b(this.f17530q);
            long jF = f(i12, 0);
            int iE = e(jB);
            if (iE != -1) {
                this.f17535w.setValueAt(iE, Long.valueOf(jF));
            } else {
                this.f17535w.put(jB, Long.valueOf(jF));
            }
        } else {
            this.f17535w.clear();
        }
        int size = this.f17528o.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f17528o.valueAt(i13).a(true);
        }
        this.f17528o.clear();
        this.f17526m.evictAll();
        if (Math.abs(this.f17527n.a() - i10) <= 100) {
            this.f17527n.b();
            this.f17527n.c(i10);
        } else {
            this.f17527n = new com.apple.android.music.playback.f.d(i10);
        }
        this.f17529p = null;
        this.f17532t = null;
        this.f17530q = -1;
    }

    private int a(int i10, int i11, com.apple.android.music.playback.f.d dVar, SparseArray<PlaybackQueueItemProvider> sparseArray, LruCache<Long, PlayerQueueItem> lruCache) {
        if (i10 >= dVar.a() - 1 && i11 == 0) {
            return -1;
        }
        int iA = dVar.a();
        int i12 = i10 + 1;
        if (i11 != 0 && i12 >= iA) {
            i12 = 0;
        }
        PlayerQueueItem playerQueueItemA = a(i12, dVar, sparseArray, lruCache);
        while (!a(playerQueueItemA)) {
            i12++;
            if (i11 != 0 && i12 >= iA) {
                i12 = 0;
            }
            if (i12 >= iA) {
                return -1;
            }
            playerQueueItemA = d(i12);
        }
        return i12;
    }

    private boolean a(PlayerQueueItem playerQueueItem) {
        if (playerQueueItem == null) {
            return false;
        }
        PlayerMediaItem item = playerQueueItem.getItem();
        return item.isPlayableContent() && this.f17515a.a(item);
    }
}
