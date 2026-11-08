package F9;

import E9.C0348i;
import E9.M;
import E9.s;
import V0.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4635d;

    public g(M m8, long j10, boolean z10) {
        super(m8);
        this.f4633b = j10;
        this.f4634c = z10;
    }

    @Override // E9.s, E9.M
    public final long d(long j10, C0348i sink) throws IOException {
        kotlin.jvm.internal.m.f(sink, "sink");
        long j11 = this.f4635d;
        long j12 = this.f4633b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f4634c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jD = super.d(j10, sink);
        if (jD != -1) {
            this.f4635d += jD;
        }
        long j14 = this.f4635d;
        if ((j14 >= j12 || jD != -1) && j14 <= j12) {
            return jD;
        }
        if (jD > 0 && j14 > j12) {
            long j15 = sink.f3387b - (j14 - j12);
            C0348i c0348i = new C0348i();
            c0348i.J(sink);
            sink.r(j15, c0348i);
            c0348i.b();
        }
        StringBuilder sbS = p.s("expected ", j12, " bytes but got ");
        sbS.append(this.f4635d);
        throw new IOException(sbS.toString());
    }
}
