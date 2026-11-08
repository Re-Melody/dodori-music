package J4;

import F2.l0;
import java.io.EOFException;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements A4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W4.b f6626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f6628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f6629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X4.f f6630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f6631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f6632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l0 f6633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p235w4.n f6634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6635j;
    public p235w4.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public L4.k f6639o;

    public k(W4.b bVar) {
        this.f6626a = bVar;
        int i10 = ((W4.f) bVar).f12805b;
        this.f6627b = i10;
        j jVar = new j();
        jVar.f6610a = PipesIterator.DEFAULT_QUEUE_SIZE;
        jVar.f6611b = new int[PipesIterator.DEFAULT_QUEUE_SIZE];
        jVar.f6612c = new long[PipesIterator.DEFAULT_QUEUE_SIZE];
        jVar.f6615f = new long[PipesIterator.DEFAULT_QUEUE_SIZE];
        jVar.f6614e = new int[PipesIterator.DEFAULT_QUEUE_SIZE];
        jVar.f6613d = new int[PipesIterator.DEFAULT_QUEUE_SIZE];
        jVar.f6616g = new A4.f[PipesIterator.DEFAULT_QUEUE_SIZE];
        jVar.f6617h = new p235w4.n[PipesIterator.DEFAULT_QUEUE_SIZE];
        jVar.f6621m = Long.MIN_VALUE;
        jVar.f6622n = Long.MIN_VALUE;
        jVar.f6624p = true;
        jVar.f6623o = true;
        this.f6628c = jVar;
        this.f6629d = new i();
        this.f6630e = new X4.f(32);
        l0 l0Var = new l0(i10, 0L);
        this.f6631f = l0Var;
        this.f6632g = l0Var;
        this.f6633h = l0Var;
    }

    @Override // A4.g
    public final void a(long j10, int i10, int i11, int i12, A4.f fVar) {
        boolean z10;
        if (this.f6635j) {
            c(this.k);
        }
        if (this.f6638n) {
            if ((i10 & 1) == 0) {
                return;
            }
            j jVar = this.f6628c;
            synchronized (jVar) {
                if (jVar.f6618i == 0) {
                    z10 = j10 > jVar.f6621m;
                } else if (Math.max(jVar.f6621m, jVar.d(jVar.f6620l)) >= j10) {
                    z10 = false;
                } else {
                    int i13 = jVar.f6618i;
                    int iF = jVar.f(i13 - 1);
                    while (i13 > jVar.f6620l && jVar.f6615f[iF] >= j10) {
                        i13--;
                        iF--;
                        if (iF == -1) {
                            iF = jVar.f6610a - 1;
                        }
                    }
                    jVar.b(jVar.f6619j + i13);
                    z10 = true;
                }
            }
            if (!z10) {
                return;
            } else {
                this.f6638n = false;
            }
        }
        long j11 = j10 + this.f6636l;
        long j12 = (this.f6637m - ((long) i11)) - ((long) i12);
        j jVar2 = this.f6628c;
        synchronized (jVar2) {
            try {
                if (jVar2.f6623o) {
                    if ((i10 & 1) == 0) {
                        return;
                    } else {
                        jVar2.f6623o = false;
                    }
                }
                X4.a.q(!jVar2.f6624p);
                synchronized (jVar2) {
                    jVar2.f6622n = Math.max(jVar2.f6622n, j11);
                    int iF2 = jVar2.f(jVar2.f6618i);
                    jVar2.f6615f[iF2] = j11;
                    long[] jArr = jVar2.f6612c;
                    jArr[iF2] = j12;
                    jVar2.f6613d[iF2] = i11;
                    jVar2.f6614e[iF2] = i10;
                    jVar2.f6616g[iF2] = fVar;
                    jVar2.f6617h[iF2] = jVar2.f6625q;
                    jVar2.f6611b[iF2] = jVar2.r;
                    int i14 = jVar2.f6618i + 1;
                    jVar2.f6618i = i14;
                    int i15 = jVar2.f6610a;
                    if (i14 == i15) {
                        int i16 = i15 + PipesIterator.DEFAULT_QUEUE_SIZE;
                        int[] iArr = new int[i16];
                        long[] jArr2 = new long[i16];
                        long[] jArr3 = new long[i16];
                        int[] iArr2 = new int[i16];
                        int[] iArr3 = new int[i16];
                        A4.f[] fVarArr = new A4.f[i16];
                        p235w4.n[] nVarArr = new p235w4.n[i16];
                        int i17 = jVar2.k;
                        int i18 = i15 - i17;
                        System.arraycopy(jArr, i17, jArr2, 0, i18);
                        System.arraycopy(jVar2.f6615f, jVar2.k, jArr3, 0, i18);
                        System.arraycopy(jVar2.f6614e, jVar2.k, iArr2, 0, i18);
                        System.arraycopy(jVar2.f6613d, jVar2.k, iArr3, 0, i18);
                        System.arraycopy(jVar2.f6616g, jVar2.k, fVarArr, 0, i18);
                        System.arraycopy(jVar2.f6617h, jVar2.k, nVarArr, 0, i18);
                        System.arraycopy(jVar2.f6611b, jVar2.k, iArr, 0, i18);
                        int i19 = jVar2.k;
                        System.arraycopy(jVar2.f6612c, 0, jArr2, i18, i19);
                        System.arraycopy(jVar2.f6615f, 0, jArr3, i18, i19);
                        System.arraycopy(jVar2.f6614e, 0, iArr2, i18, i19);
                        System.arraycopy(jVar2.f6613d, 0, iArr3, i18, i19);
                        System.arraycopy(jVar2.f6616g, 0, fVarArr, i18, i19);
                        System.arraycopy(jVar2.f6617h, 0, nVarArr, i18, i19);
                        System.arraycopy(jVar2.f6611b, 0, iArr, i18, i19);
                        jVar2.f6612c = jArr2;
                        jVar2.f6615f = jArr3;
                        jVar2.f6614e = iArr2;
                        jVar2.f6613d = iArr3;
                        jVar2.f6616g = fVarArr;
                        jVar2.f6617h = nVarArr;
                        jVar2.f6611b = iArr;
                        jVar2.k = 0;
                        jVar2.f6618i = jVar2.f6610a;
                        jVar2.f6610a = i16;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(A4.a aVar, int i10, boolean z10) throws InterruptedException, EOFException {
        int iF = f(i10);
        l0 l0Var = this.f6633h;
        W4.a aVar2 = (W4.a) l0Var.f4193d;
        int iA = aVar.a(aVar2.f12790a, ((int) (this.f6637m - l0Var.f4190a)) + aVar2.f12791b, iF);
        if (iA == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = this.f6637m + ((long) iA);
        this.f6637m = j10;
        l0 l0Var2 = this.f6633h;
        if (j10 == l0Var2.f4191b) {
            this.f6633h = (l0) l0Var2.f4194e;
        }
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final void c(p235w4.n nVar) {
        p235w4.n nVarB;
        boolean z10;
        long j10 = this.f6636l;
        if (nVar == null) {
            nVarB = null;
        } else if (j10 != 0) {
            long j11 = nVar.f28016w;
            if (j11 != Long.MAX_VALUE) {
                nVarB = nVar.b(j11 + j10);
            } else {
                nVarB = nVar;
            }
        } else {
            nVarB = nVar;
        }
        j jVar = this.f6628c;
        synchronized (jVar) {
            z10 = true;
            try {
                if (nVarB == null) {
                    jVar.f6624p = true;
                } else {
                    jVar.f6624p = false;
                    p235w4.n nVar2 = jVar.f6625q;
                    int i10 = X4.j.f13232a;
                    if (!nVarB.equals(nVar2)) {
                        jVar.f6625q = nVarB;
                    }
                }
                z10 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k = nVar;
        this.f6635j = false;
        L4.k kVar = this.f6639o;
        if (kVar == null || !z10) {
            return;
        }
        kVar.f7857j.post(kVar.f7856i);
    }

    @Override // A4.g
    public final void d(int i10, X4.f fVar) {
        while (i10 > 0) {
            int iF = f(i10);
            l0 l0Var = this.f6633h;
            W4.a aVar = (W4.a) l0Var.f4193d;
            fVar.d(aVar.f12790a, ((int) (this.f6637m - l0Var.f4190a)) + aVar.f12791b, iF);
            i10 -= iF;
            long j10 = this.f6637m + ((long) iF);
            this.f6637m = j10;
            l0 l0Var2 = this.f6633h;
            if (j10 == l0Var2.f4191b) {
                this.f6633h = (l0) l0Var2.f4194e;
            }
        }
    }

    public final void e(byte[] bArr, long j10, int i10) {
        while (true) {
            l0 l0Var = this.f6632g;
            if (j10 < l0Var.f4191b) {
                break;
            } else {
                this.f6632g = (l0) l0Var.f4194e;
            }
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (this.f6632g.f4191b - j10));
            l0 l0Var2 = this.f6632g;
            W4.a aVar = (W4.a) l0Var2.f4193d;
            System.arraycopy(aVar.f12790a, ((int) (j10 - l0Var2.f4190a)) + aVar.f12791b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            l0 l0Var3 = this.f6632g;
            if (j10 == l0Var3.f4191b) {
                this.f6632g = (l0) l0Var3.f4194e;
            }
        }
    }

    public final int f(int i10) {
        W4.a aVar;
        l0 l0Var = this.f6633h;
        if (!l0Var.f4192c) {
            W4.f fVar = (W4.f) this.f6626a;
            synchronized (fVar) {
                try {
                    fVar.f12808e++;
                    int i11 = fVar.f12809f;
                    if (i11 > 0) {
                        W4.a[] aVarArr = fVar.f12810g;
                        int i12 = i11 - 1;
                        fVar.f12809f = i12;
                        aVar = aVarArr[i12];
                        aVarArr[i12] = null;
                    } else {
                        aVar = new W4.a(new byte[fVar.f12805b], 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            l0 l0Var2 = new l0(this.f6627b, this.f6633h.f4191b);
            l0Var.f4193d = aVar;
            l0Var.f4194e = l0Var2;
            l0Var.f4192c = true;
        }
        return Math.min(i10, (int) (this.f6633h.f4191b - this.f6637m));
    }

    public final int g(long j10, boolean z10) {
        j jVar = this.f6628c;
        synchronized (jVar) {
            int iF = jVar.f(jVar.f6620l);
            if (jVar.e() && j10 >= jVar.f6615f[iF] && (j10 <= jVar.f6622n || z10)) {
                int iA = jVar.a(iF, jVar.f6618i - jVar.f6620l, j10, true);
                if (iA == -1) {
                    return -1;
                }
                jVar.f6620l += iA;
                return iA;
            }
            return -1;
        }
    }

    public final void h(long j10) {
        l0 l0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            l0Var = this.f6631f;
            if (j10 < l0Var.f4191b) {
                break;
            }
            W4.b bVar = this.f6626a;
            W4.a aVar = (W4.a) l0Var.f4193d;
            W4.f fVar = (W4.f) bVar;
            synchronized (fVar) {
                W4.a[] aVarArr = fVar.f12806c;
                aVarArr[0] = aVar;
                fVar.b(aVarArr);
            }
            l0 l0Var2 = this.f6631f;
            l0Var2.f4193d = null;
            l0 l0Var3 = (l0) l0Var2.f4194e;
            l0Var2.f4194e = null;
            this.f6631f = l0Var3;
        }
        if (this.f6632g.f4190a < l0Var.f4190a) {
            this.f6632g = l0Var;
        }
    }

    public final p235w4.n i() {
        p235w4.n nVar;
        j jVar = this.f6628c;
        synchronized (jVar) {
            nVar = jVar.f6624p ? null : jVar.f6625q;
        }
        return nVar;
    }
}
