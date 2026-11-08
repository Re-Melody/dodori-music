package I2;

import B2.AbstractC0111a;
import R2.C0774b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S2.d f6339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.m f6340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.b f6341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f6342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6344f;

    public k(long j10, J2.m mVar, J2.b bVar, S2.d dVar, long j11, j jVar) {
        this.f6343e = j10;
        this.f6340b = mVar;
        this.f6341c = bVar;
        this.f6344f = j11;
        this.f6339a = dVar;
        this.f6342d = jVar;
    }

    public final k a(long j10, J2.m mVar) throws C0774b {
        long jK;
        long jK2;
        j jVarD = this.f6340b.d();
        j jVarD2 = mVar.d();
        if (jVarD == null) {
            return new k(j10, mVar, this.f6341c, this.f6339a, this.f6344f, jVarD);
        }
        if (!jVarD.q()) {
            return new k(j10, mVar, this.f6341c, this.f6339a, this.f6344f, jVarD2);
        }
        long jU = jVarD.u(j10);
        if (jU == 0) {
            return new k(j10, mVar, this.f6341c, this.f6339a, this.f6344f, jVarD2);
        }
        AbstractC0111a.i(jVarD2);
        long jT = jVarD.t();
        long jA = jVarD.a(jT);
        long j11 = jU + jT;
        long j12 = j11 - 1;
        long jC = jVarD.c(j12, j10) + jVarD.a(j12);
        long jT2 = jVarD2.t();
        long jA2 = jVarD2.a(jT2);
        long j13 = this.f6344f;
        if (jC != jA2) {
            if (jC < jA2) {
                throw new C0774b();
            }
            if (jA2 < jA) {
                jK2 = j13 - (jVarD2.k(jA, j10) - jT);
            } else {
                jK = jVarD.k(jA2, j10) - jT2;
            }
            return new k(j10, mVar, this.f6341c, this.f6339a, jK2, jVarD2);
        }
        jK = j11 - jT2;
        jK2 = jK + j13;
        return new k(j10, mVar, this.f6341c, this.f6339a, jK2, jVarD2);
    }

    public final long b(long j10) {
        j jVar = this.f6342d;
        AbstractC0111a.i(jVar);
        return jVar.e(this.f6343e, j10) + this.f6344f;
    }

    public final long c(long j10) {
        long jB = b(j10);
        j jVar = this.f6342d;
        AbstractC0111a.i(jVar);
        return (jVar.v(this.f6343e, j10) + jB) - 1;
    }

    public final long d() {
        j jVar = this.f6342d;
        AbstractC0111a.i(jVar);
        return jVar.u(this.f6343e);
    }

    public final long e(long j10) {
        long jF = f(j10);
        j jVar = this.f6342d;
        AbstractC0111a.i(jVar);
        return jVar.c(j10 - this.f6344f, this.f6343e) + jF;
    }

    public final long f(long j10) {
        j jVar = this.f6342d;
        AbstractC0111a.i(jVar);
        return jVar.a(j10 - this.f6344f);
    }

    public final boolean g(long j10, long j11) {
        j jVar = this.f6342d;
        AbstractC0111a.i(jVar);
        return jVar.q() || j11 == -9223372036854775807L || e(j10) <= j11;
    }
}
