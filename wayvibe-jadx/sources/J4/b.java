package J4;

/* JADX INFO: loaded from: classes.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f6593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6597f;

    public b(c cVar, l lVar, long j10, long j11, boolean z10) {
        this.f6592a = cVar;
        this.f6593b = lVar;
        this.f6594c = j10;
        this.f6595d = j11;
        this.f6596e = z10;
    }

    @Override // J4.l
    public final int a(long j10) {
        return this.f6593b.a(this.f6594c + j10);
    }

    @Override // J4.l
    public final int b(p235w4.o oVar, p256y4.d dVar, boolean z10) {
        if (this.f6596e) {
            return -3;
        }
        if (this.f6597f) {
            dVar.f3017b = 4;
            return -4;
        }
        int iB = this.f6593b.b(oVar, dVar, z10);
        long j10 = this.f6595d;
        long j11 = this.f6594c;
        if (iB == -5) {
            p235w4.n nVar = oVar.f28020a;
            oVar.f28020a = nVar.a(j11 != 0 ? 0 : nVar.f28014u, j10 == Long.MIN_VALUE ? nVar.f28015v : 0);
            return -5;
        }
        if (j10 == Long.MIN_VALUE || ((iB != -4 || dVar.f29075f < j10) && !(iB == -3 && this.f6592a.d() == Long.MIN_VALUE))) {
            if (iB == -4 && !dVar.c(4)) {
                dVar.f29075f -= j11;
            }
            return iB;
        }
        dVar.i();
        dVar.f3017b = 4;
        this.f6597f = true;
        return -4;
    }

    @Override // J4.l
    public final boolean c() {
        return this.f6593b.c();
    }

    @Override // J4.l
    public final void d() {
        this.f6593b.d();
    }
}
