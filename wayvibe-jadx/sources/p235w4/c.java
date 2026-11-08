package p235w4;

import J4.e;
import J4.g;
import J4.q;
import V4.h;
import W4.b;
import W4.f;
import X4.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f27906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27909d = 5000000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f27910e = 10000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27912g;

    public c(f fVar) {
        this.f27906a = fVar;
        long j10 = ((long) 50000) * 1000;
        this.f27907b = j10;
        this.f27908c = j10;
    }

    @Override // p235w4.p
    public final void a() {
        b(false);
    }

    @Override // p235w4.p
    public final void b() {
        b(true);
    }

    @Override // p235w4.p
    public final void c() {
        b(true);
    }

    @Override // p235w4.p
    public final b d() {
        return this.f27906a;
    }

    @Override // p235w4.p
    public final void a(v[] vVarArr, q qVar, h hVar) {
        int i10;
        this.f27911f = 0;
        for (int i11 = 0; i11 < vVarArr.length; i11++) {
            if (hVar.f12591b[i11] != null) {
                int i12 = this.f27911f;
                int iO = vVarArr[i11].o();
                int i13 = j.f13232a;
                if (iO == 0) {
                    i10 = 16777216;
                } else if (iO == 1) {
                    i10 = 3538944;
                } else if (iO != 2) {
                    i10 = 131072;
                    if (iO != 3 && iO != 4) {
                        throw new IllegalStateException();
                    }
                } else {
                    i10 = 13107200;
                }
                this.f27911f = i12 + i10;
            }
        }
        this.f27906a.a(this.f27911f);
    }

    public final void b(boolean z10) {
        this.f27911f = 0;
        this.f27912g = false;
        if (z10) {
            f fVar = this.f27906a;
            synchronized (fVar) {
                if (fVar.f12804a) {
                    fVar.a(0);
                }
            }
        }
    }

    @Override // p235w4.p
    public final boolean a(long j10, boolean z10) {
        long j11 = z10 ? this.f27910e : this.f27909d;
        return j11 <= 0 || j10 >= j11;
    }

    @Override // p235w4.p
    public final boolean a(g gVar, e eVar) {
        return false;
    }

    @Override // p235w4.p
    public final boolean a(long j10) {
        char c3;
        int i10;
        boolean z10 = false;
        if (j10 > this.f27908c) {
            c3 = 0;
        } else {
            c3 = j10 < this.f27907b ? (char) 2 : (char) 1;
        }
        f fVar = this.f27906a;
        synchronized (fVar) {
            i10 = fVar.f12808e * fVar.f12805b;
        }
        boolean z11 = i10 >= this.f27911f;
        boolean z12 = this.f27912g;
        if (c3 == 2 || (c3 == 1 && z12 && !z11)) {
            z10 = true;
        }
        this.f27912g = z10;
        return z10;
    }
}
