package N4;

import com.apple.android.music.playback.model.MediaPlayerException;
import java.nio.ByteBuffer;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e, p256y4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.i f8594a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i[] f8599f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p256y4.d f8602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8603j;
    public boolean k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8595b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f8596c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f8597d = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p256y4.d[] f8598e = new h[2];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8600g = 2;

    public b() {
        i[] iVarArr = new i[2];
        for (int i10 = 0; i10 < this.f8600g; i10++) {
            this.f8598e[i10] = new h(2);
        }
        this.f8599f = iVarArr;
        this.f8601h = 2;
        for (int i11 = 0; i11 < this.f8601h; i11++) {
            this.f8599f[i11] = new c(this, 0);
        }
        E2.i iVar = new E2.i(this, 2);
        this.f8594a = iVar;
        iVar.start();
        int i12 = this.f8600g;
        p256y4.d[] dVarArr = this.f8598e;
        X4.a.q(i12 == dVarArr.length);
        for (p256y4.d dVar : dVarArr) {
            dVar.j(1024);
        }
    }

    public abstract d a(byte[] bArr, int i10, int i11, boolean z10);

    @Override // p256y4.b
    public final void a(Object obj) {
        p256y4.d dVar = (p256y4.d) obj;
        synchronized (this.f8595b) {
            X4.a.k(dVar == this.f8602i);
            this.f8596c.addLast(dVar);
            if (!this.f8596c.isEmpty() && this.f8601h > 0) {
                this.f8595b.notify();
            }
            this.f8602i = null;
        }
    }

    @Override // p256y4.b
    public final i b() {
        synchronized (this.f8595b) {
            if (this.f8597d.isEmpty()) {
                return null;
            }
            return (i) this.f8597d.removeFirst();
        }
    }

    public final void c(i iVar) {
        iVar.f3017b = 0;
        iVar.f8609d = null;
        int i10 = this.f8601h;
        this.f8601h = i10 + 1;
        this.f8599f[i10] = iVar;
    }

    @Override // p256y4.b
    public final void d() {
        synchronized (this.f8595b) {
            this.k = true;
            this.f8595b.notify();
        }
        try {
            this.f8594a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean e() {
        synchronized (this.f8595b) {
            while (!this.k) {
                try {
                    if (!this.f8596c.isEmpty() && this.f8601h > 0) {
                        break;
                    }
                    this.f8595b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k) {
                return false;
            }
            p256y4.d dVar = (p256y4.d) this.f8596c.removeFirst();
            i[] iVarArr = this.f8599f;
            int i10 = this.f8601h - 1;
            this.f8601h = i10;
            i iVar = iVarArr[i10];
            boolean z10 = this.f8603j;
            this.f8603j = false;
            if (dVar.c(4)) {
                iVar.f3017b = 4 | iVar.f3017b;
            } else {
                if (dVar.c(MediaPlayerException.ERROR_UNKNOWN)) {
                    iVar.f3017b |= MediaPlayerException.ERROR_UNKNOWN;
                }
                h hVar = (h) dVar;
                try {
                    ByteBuffer byteBuffer = hVar.f29074e;
                    d dVarA = a(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit(), z10);
                    long j10 = hVar.f29075f;
                    long j11 = hVar.f8607h;
                    iVar.f8608c = j10;
                    iVar.f8609d = dVarA;
                    if (j11 != Long.MAX_VALUE) {
                        j10 = j11;
                    }
                    iVar.f8610e = j10;
                    iVar.f3017b &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    e = null;
                } catch (f e2) {
                    e = e2;
                }
                if (e != null) {
                    synchronized (this.f8595b) {
                    }
                    return false;
                }
            }
            synchronized (this.f8595b) {
                try {
                    if (this.f8603j || iVar.c(MediaPlayerException.ERROR_UNKNOWN)) {
                        c(iVar);
                    } else {
                        this.f8597d.addLast(iVar);
                    }
                    dVar.i();
                    int i11 = this.f8600g;
                    this.f8600g = i11 + 1;
                    this.f8598e[i11] = dVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p256y4.b
    public final void c() {
        synchronized (this.f8595b) {
            try {
                this.f8603j = true;
                p256y4.d dVar = this.f8602i;
                if (dVar != null) {
                    dVar.i();
                    int i10 = this.f8600g;
                    this.f8600g = i10 + 1;
                    this.f8598e[i10] = dVar;
                    this.f8602i = null;
                }
                while (!this.f8596c.isEmpty()) {
                    p256y4.d dVar2 = (p256y4.d) this.f8596c.removeFirst();
                    dVar2.i();
                    int i11 = this.f8600g;
                    this.f8600g = i11 + 1;
                    this.f8598e[i11] = dVar2;
                }
                while (!this.f8597d.isEmpty()) {
                    c((i) this.f8597d.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N4.e
    public final void a(long j10) {
    }

    @Override // p256y4.b
    public final Object a() {
        p256y4.d dVar;
        synchronized (this.f8595b) {
            X4.a.q(this.f8602i == null);
            int i10 = this.f8600g;
            if (i10 == 0) {
                dVar = null;
            } else {
                p256y4.d[] dVarArr = this.f8598e;
                int i11 = i10 - 1;
                this.f8600g = i11;
                dVar = dVarArr[i11];
            }
            this.f8602i = dVar;
        }
        return dVar;
    }
}
