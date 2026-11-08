package N2;

import B2.AbstractC0111a;
import E2.h;
import E2.i;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p234w3.j;
import p234w3.m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p234w3.f, E2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f8551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f8552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E2.g[] f8553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h[] f8554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public E2.g f8557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E2.e f8558j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f8562o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(m mVar) {
        this(new j[2], new p234w3.d[2]);
        this.f8561n = 1;
        int i10 = this.f8555g;
        E2.g[] gVarArr = this.f8553e;
        AbstractC0111a.h(i10 == gVarArr.length);
        for (E2.g gVar : gVarArr) {
            gVar.k(1024);
        }
        this.f8562o = mVar;
    }

    @Override // E2.d
    public final void a(long j10) {
        synchronized (this.f8550b) {
            try {
                AbstractC0111a.h(this.f8555g == this.f8553e.length || this.k);
                this.f8560m = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E2.d
    public final Object d() {
        E2.g gVar;
        synchronized (this.f8550b) {
            try {
                E2.e eVar = this.f8558j;
                if (eVar != null) {
                    throw eVar;
                }
                AbstractC0111a.h(this.f8557i == null);
                int i10 = this.f8555g;
                if (i10 == 0) {
                    gVar = null;
                } else {
                    E2.g[] gVarArr = this.f8553e;
                    int i11 = i10 - 1;
                    this.f8555g = i11;
                    gVar = gVarArr[i11];
                }
                this.f8557i = gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public final E2.e f(Throwable th) {
        switch (this.f8561n) {
            case 0:
                return new d("Unexpected decode error", th);
            default:
                return new p234w3.g("Unexpected decode error", th);
        }
    }

    @Override // E2.d
    public final void flush() {
        synchronized (this.f8550b) {
            try {
                this.k = true;
                E2.g gVar = this.f8557i;
                if (gVar != null) {
                    gVar.i();
                    int i10 = this.f8555g;
                    this.f8555g = i10 + 1;
                    this.f8553e[i10] = gVar;
                    this.f8557i = null;
                }
                while (!this.f8551c.isEmpty()) {
                    E2.g gVar2 = (E2.g) this.f8551c.removeFirst();
                    gVar2.i();
                    int i11 = this.f8555g;
                    this.f8555g = i11 + 1;
                    this.f8553e[i11] = gVar2;
                }
                while (!this.f8552d.isEmpty()) {
                    ((h) this.f8552d.removeFirst()).j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final E2.e g(E2.g gVar, h hVar, boolean z10) {
        switch (this.f8561n) {
            case 0:
                a aVar = (a) hVar;
                try {
                    ByteBuffer byteBuffer = gVar.f3030e;
                    byteBuffer.getClass();
                    AbstractC0111a.h(byteBuffer.hasArray());
                    AbstractC0111a.d(byteBuffer.arrayOffset() == 0);
                    H6.i iVar = (H6.i) this.f8562o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    iVar.getClass();
                    aVar.f8547e = H6.i.h(bArrArray, iRemaining);
                    aVar.f3035c = gVar.f3032g;
                    return null;
                } catch (d e2) {
                    return e2;
                }
            default:
                j jVar = (j) gVar;
                p234w3.d dVar = (p234w3.d) hVar;
                try {
                    ByteBuffer byteBuffer2 = jVar.f3030e;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    m mVar = (m) this.f8562o;
                    if (z10) {
                        mVar.k();
                    }
                    p234w3.e eVarC = mVar.c(bArrArray2, 0, iLimit);
                    long j10 = jVar.f3032g;
                    long j11 = jVar.f27870j;
                    dVar.f3035c = j10;
                    dVar.f27854e = eVarC;
                    if (j11 != Long.MAX_VALUE) {
                        j10 = j11;
                    }
                    dVar.f27855f = j10;
                    dVar.f3036d = false;
                    return null;
                } catch (p234w3.g e4) {
                    return e4;
                }
        }
    }

    public final boolean h() {
        boolean z10;
        E2.e eVarF;
        synchronized (this.f8550b) {
            while (!this.f8559l) {
                try {
                    if (!this.f8551c.isEmpty() && this.f8556h > 0) {
                        break;
                    }
                    this.f8550b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f8559l) {
                return false;
            }
            E2.g gVar = (E2.g) this.f8551c.removeFirst();
            h[] hVarArr = this.f8554f;
            int i10 = this.f8556h - 1;
            this.f8556h = i10;
            h hVar = hVarArr[i10];
            boolean z11 = this.k;
            this.k = false;
            if (gVar.e(4)) {
                hVar.b(4);
            } else {
                hVar.f3035c = gVar.f3032g;
                if (gVar.e(134217728)) {
                    hVar.b(134217728);
                }
                long j10 = gVar.f3032g;
                synchronized (this.f8550b) {
                    long j11 = this.f8560m;
                    z10 = j11 == -9223372036854775807L || j10 >= j11;
                }
                if (!z10) {
                    hVar.f3036d = true;
                }
                try {
                    eVarF = g(gVar, hVar, z11);
                } catch (OutOfMemoryError e2) {
                    eVarF = f(e2);
                } catch (RuntimeException e4) {
                    eVarF = f(e4);
                }
                if (eVarF != null) {
                    synchronized (this.f8550b) {
                        this.f8558j = eVarF;
                    }
                    return false;
                }
            }
            synchronized (this.f8550b) {
                try {
                    if (this.k || hVar.f3036d) {
                        hVar.j();
                    } else {
                        this.f8552d.addLast(hVar);
                    }
                    gVar.i();
                    int i11 = this.f8555g;
                    this.f8555g = i11 + 1;
                    this.f8553e[i11] = gVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // E2.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final h c() {
        synchronized (this.f8550b) {
            try {
                E2.e eVar = this.f8558j;
                if (eVar != null) {
                    throw eVar;
                }
                if (this.f8552d.isEmpty()) {
                    return null;
                }
                return (h) this.f8552d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E2.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(E2.g gVar) {
        synchronized (this.f8550b) {
            try {
                E2.e eVar = this.f8558j;
                if (eVar != null) {
                    throw eVar;
                }
                AbstractC0111a.d(gVar == this.f8557i);
                this.f8551c.addLast(gVar);
                if (!this.f8551c.isEmpty() && this.f8556h > 0) {
                    this.f8550b.notify();
                }
                this.f8557i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(h hVar) {
        synchronized (this.f8550b) {
            hVar.i();
            int i10 = this.f8556h;
            this.f8556h = i10 + 1;
            this.f8554f[i10] = hVar;
            if (!this.f8551c.isEmpty() && this.f8556h > 0) {
                this.f8550b.notify();
            }
        }
    }

    @Override // E2.d
    public final void release() {
        synchronized (this.f8550b) {
            this.f8559l = true;
            this.f8550b.notify();
        }
        try {
            this.f8549a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public b(E2.g[] gVarArr, h[] hVarArr) {
        h aVar;
        E2.g gVar;
        this.f8550b = new Object();
        this.f8560m = -9223372036854775807L;
        this.f8551c = new ArrayDeque();
        this.f8552d = new ArrayDeque();
        this.f8553e = gVarArr;
        this.f8555g = gVarArr.length;
        for (int i10 = 0; i10 < this.f8555g; i10++) {
            E2.g[] gVarArr2 = this.f8553e;
            switch (this.f8561n) {
                case 0:
                    gVar = new E2.g(1);
                    break;
                default:
                    gVar = new j(1);
                    break;
            }
            gVarArr2[i10] = gVar;
        }
        this.f8554f = hVarArr;
        this.f8556h = hVarArr.length;
        for (int i11 = 0; i11 < this.f8556h; i11++) {
            h[] hVarArr2 = this.f8554f;
            switch (this.f8561n) {
                case 0:
                    aVar = new a(this);
                    break;
                default:
                    aVar = new p234w3.d(this);
                    break;
            }
            hVarArr2[i11] = aVar;
        }
        i iVar = new i(this);
        this.f8549a = iVar;
        iVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(H6.i iVar) {
        this(new E2.g[1], new a[1]);
        this.f8561n = 0;
        this.f8562o = iVar;
    }

    @Override // p234w3.f
    public void b(long j10) {
    }
}
