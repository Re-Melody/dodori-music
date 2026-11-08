package p194s3;

import B2.C;
import Z2.A;
import Z2.y;
import java.math.RoundingMode;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.b f26078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0.b f26079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26081e;

    public b(long j10, long j11, long j12) {
        this.f26081e = j10;
        this.f26077a = j12;
        A0.b bVar = new A0.b();
        this.f26078b = bVar;
        A0.b bVar2 = new A0.b();
        this.f26079c = bVar2;
        bVar.a(0L);
        bVar2.a(j11);
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f26080d = -2147483647;
            return;
        }
        long jQ = C.Q(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jQ > 0 && jQ <= 2147483647L) {
            i10 = (int) jQ;
        }
        this.f26080d = i10;
    }

    @Override // p194s3.f
    public final long a(long j10) {
        return this.f26078b.d(C.c(this.f26079c, j10));
    }

    public final boolean b(long j10) {
        A0.b bVar = this.f26078b;
        return j10 - bVar.d(bVar.f88a - 1) < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH;
    }

    @Override // p194s3.f
    public final long c() {
        return this.f26077a;
    }

    @Override // Z2.z
    public final boolean d() {
        return true;
    }

    @Override // Z2.z
    public final y i(long j10) {
        A0.b bVar = this.f26078b;
        int iC = C.c(bVar, j10);
        long jD = bVar.d(iC);
        A0.b bVar2 = this.f26079c;
        A a10 = new A(jD, bVar2.d(iC));
        if (jD == j10 || iC == bVar.f88a - 1) {
            return new y(a10, a10);
        }
        int i10 = iC + 1;
        return new y(a10, new A(bVar.d(i10), bVar2.d(i10)));
    }

    @Override // p194s3.f
    public final int j() {
        return this.f26080d;
    }

    @Override // Z2.z
    public final long l() {
        return this.f26081e;
    }
}
