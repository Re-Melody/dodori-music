package J4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6600c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6601d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f6602e = new b[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6603f = true;

    public c(e eVar) {
        this.f6598a = eVar;
    }

    @Override // J4.e
    public final void a(d dVar, long j10) {
        this.f6599b = dVar;
        this.f6598a.a(this, this.f6600c + j10);
    }

    @Override // J4.e
    public final q b() {
        return this.f6598a.b();
    }

    @Override // J4.e
    public final long c() {
        if (!this.f6603f) {
            long jC = this.f6598a.c();
            if (jC == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            X4.a.q(jC >= this.f6600c);
            long j10 = this.f6601d;
            X4.a.q(j10 == Long.MIN_VALUE || jC <= j10);
            return jC - this.f6600c;
        }
        for (b bVar : this.f6602e) {
            if (bVar != null) {
                bVar.f6596e = false;
            }
        }
        this.f6603f = false;
        long jC2 = c();
        if (jC2 != -9223372036854775807L) {
            return jC2;
        }
        return 0L;
    }

    @Override // J4.n
    public final long d() {
        long jD = this.f6598a.d();
        if (jD != Long.MIN_VALUE) {
            long j10 = this.f6601d;
            if (j10 == Long.MIN_VALUE || jD < j10) {
                return Math.max(0L, jD - this.f6600c);
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // J4.n
    public final long e() {
        long jE = this.f6598a.e();
        if (jE != Long.MIN_VALUE) {
            long j10 = this.f6601d;
            if (j10 == Long.MIN_VALUE || jE < j10) {
                return jE - this.f6600c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // J4.e
    public final boolean f() {
        return this.f6598a.f();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    @Override // J4.e
    public final long b(long j10) {
        boolean z10 = false;
        for (b bVar : this.f6602e) {
            if (bVar != null) {
                bVar.f6597f = false;
            }
        }
        long jB = this.f6598a.b(this.f6600c + j10);
        long j11 = this.f6600c;
        if (jB == j10 + j11) {
            z10 = true;
        } else if (jB >= j11) {
            long j12 = this.f6601d;
            if (j12 == Long.MIN_VALUE || jB <= j12) {
                z10 = true;
            }
        }
        X4.a.q(z10);
        return jB - this.f6600c;
    }

    @Override // J4.e
    public final void a() {
        this.f6598a.a();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    @Override // J4.e
    public final long a(V4.g[] gVarArr, boolean[] zArr, l[] lVarArr, boolean[] zArr2, long j10) {
        boolean z10;
        this.f6602e = new b[lVarArr.length];
        l[] lVarArr2 = new l[lVarArr.length];
        int i10 = 0;
        while (true) {
            l lVar = null;
            if (i10 >= lVarArr.length) {
                break;
            }
            b[] bVarArr = this.f6602e;
            b bVar = (b) lVarArr[i10];
            bVarArr[i10] = bVar;
            if (bVar != null) {
                lVar = bVar.f6593b;
            }
            lVarArr2[i10] = lVar;
            i10++;
        }
        long jA = this.f6598a.a(gVarArr, zArr, lVarArr2, zArr2, j10 + this.f6600c);
        boolean z11 = true;
        if (this.f6603f) {
            if (this.f6600c == 0) {
                z10 = false;
                break;
            }
            int length = gVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                V4.g gVar = gVarArr[i11];
                if (gVar != null) {
                    V4.a aVar = (V4.a) gVar;
                    if (!X4.a.n(aVar.f12574d[aVar.a()].f28001f)) {
                        z10 = true;
                        break;
                    }
                }
                i11++;
            }
            this.f6603f = z10;
        }
        long j11 = this.f6600c;
        if (jA != j10 + j11) {
            if (jA >= j11) {
                long j12 = this.f6601d;
                if (j12 != Long.MIN_VALUE && jA > j12) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        X4.a.q(z11);
        for (int i12 = 0; i12 < lVarArr.length; i12++) {
            l lVar2 = lVarArr2[i12];
            if (lVar2 == null) {
                this.f6602e[i12] = null;
            } else if (lVarArr[i12] == null || this.f6602e[i12].f6593b != lVar2) {
                this.f6602e[i12] = new b(this, lVar2, this.f6600c, this.f6601d, this.f6603f);
            }
            lVarArr[i12] = this.f6602e[i12];
        }
        return jA - this.f6600c;
    }

    @Override // J4.d
    public final void b(e eVar) {
        X4.a.q((this.f6600c == -9223372036854775807L || this.f6601d == -9223372036854775807L) ? false : true);
        this.f6599b.b(this);
    }

    @Override // J4.n
    public final boolean c(long j10) {
        return this.f6598a.c(j10 + this.f6600c);
    }

    @Override // J4.e
    public final void a(long j10) {
        this.f6598a.a(j10 + this.f6600c);
    }

    @Override // J4.m
    public final void a(n nVar) {
        this.f6599b.a(this);
    }
}
