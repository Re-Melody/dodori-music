package p213u3;

import B2.AbstractC0111a;
import B2.C;
import Z2.k;
import Z2.z;
import java.io.EOFException;
import java.io.IOException;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f27177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f27180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f27183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f27186j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f27187l;

    public b(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        AbstractC0111a.d(j10 >= 0 && j11 > j10);
        this.f27180d = hVar;
        this.f27178b = j10;
        this.f27179c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f27182f = j13;
            this.f27181e = 4;
        } else {
            this.f27181e = 0;
        }
        this.f27177a = new e();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // p213u3.f
    public final long f(k kVar) throws IOException {
        long j10;
        ?? r10;
        long j11;
        long j12;
        long jK;
        int i10 = this.f27181e;
        long j13 = this.f27179c;
        e eVar = this.f27177a;
        if (i10 == 0) {
            j10 = 0;
            long j14 = kVar.f13549d;
            this.f27183g = j14;
            this.f27181e = 1;
            long j15 = j13 - 65307;
            if (j15 > j14) {
                return j15;
            }
            r10 = 0;
        } else if (i10 != 1) {
            if (i10 == 2) {
                j11 = 2;
                long j16 = this.f27185i;
                long j17 = this.f27186j;
                if (j16 == j17) {
                    jK = -1;
                    j12 = -1;
                } else {
                    long j18 = kVar.f13549d;
                    if (eVar.b(kVar, j17)) {
                        eVar.a(kVar, false);
                        kVar.f13551f = 0;
                        long j19 = this.f27184h;
                        long j20 = eVar.f27194b;
                        long j21 = j19 - j20;
                        int i11 = eVar.f27196d + eVar.f27197e;
                        if (0 > j21 || j21 >= 72000) {
                            if (j21 < 0) {
                                this.f27186j = j18;
                                this.f27187l = j20;
                            } else {
                                this.f27185i = kVar.f13549d + ((long) i11);
                                this.k = j20;
                            }
                            long j22 = this.f27186j;
                            long j23 = this.f27185i;
                            if (j22 - j23 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) {
                                this.f27186j = j23;
                                j12 = -1;
                                jK = j23;
                            } else {
                                j12 = -1;
                                jK = C.k((((j22 - j23) * j21) / (this.f27187l - this.k)) + (kVar.f13549d - (((long) i11) * (j21 <= 0 ? 2L : 1L))), j23, j22 - 1);
                            }
                        } else {
                            jK = -1;
                            j12 = -1;
                        }
                    } else {
                        jK = this.f27185i;
                        if (jK == j18) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j12 = -1;
                    }
                }
                if (jK != j12) {
                    return jK;
                }
                this.f27181e = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j12 = -1;
                eVar = eVar;
                j11 = 2;
            }
            long j24 = j12;
            while (true) {
                eVar.b(kVar, j24);
                eVar.a(kVar, false);
                if (eVar.f27194b > this.f27184h) {
                    kVar.f13551f = 0;
                    this.f27181e = 4;
                    return -(this.k + j11);
                }
                kVar.p(eVar.f27196d + eVar.f27197e);
                this.f27185i = kVar.f13549d;
                this.k = eVar.f27194b;
                j24 = -1;
            }
        } else {
            j10 = 0;
            r10 = 0;
        }
        eVar.f27193a = r10;
        eVar.f27194b = j10;
        eVar.f27195c = r10;
        eVar.f27196d = r10;
        eVar.f27197e = r10;
        if (!eVar.b(kVar, -1L)) {
            throw new EOFException();
        }
        eVar.a(kVar, r10);
        kVar.p(eVar.f27196d + eVar.f27197e);
        long j25 = eVar.f27194b;
        while ((eVar.f27193a & 4) != 4 && eVar.b(kVar, -1L) && kVar.f13549d < j13 && eVar.a(kVar, true)) {
            try {
                kVar.p(eVar.f27196d + eVar.f27197e);
                j25 = eVar.f27194b;
            } catch (EOFException unused) {
            }
        }
        this.f27182f = j25;
        this.f27181e = 4;
        return this.f27183g;
    }

    @Override // p213u3.f
    public final z h() {
        if (this.f27182f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // p213u3.f
    public final void k(long j10) {
        this.f27184h = C.k(j10, 0L, this.f27182f - 1);
        this.f27181e = 2;
        this.f27185i = this.f27178b;
        this.f27186j = this.f27179c;
        this.k = 0L;
        this.f27187l = this.f27182f;
    }
}
