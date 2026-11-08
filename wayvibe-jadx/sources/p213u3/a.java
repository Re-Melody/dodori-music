package p213u3;

import B2.C;
import Z2.A;
import Z2.y;
import Z2.z;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f27176a;

    public a(b bVar) {
        this.f27176a = bVar;
    }

    @Override // Z2.z
    public final boolean d() {
        return true;
    }

    @Override // Z2.z
    public final y i(long j10) {
        b bVar = this.f27176a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) bVar.f27180d.f27211i) * j10) / 1000000);
        long j11 = bVar.f27179c;
        long j12 = bVar.f27178b;
        A a10 = new A(j10, C.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j11 - j12)).divide(BigInteger.valueOf(bVar.f27182f)).longValue() + j12) - 30000, bVar.f27178b, j11 - 1));
        return new y(a10, a10);
    }

    @Override // Z2.z
    public final long l() {
        b bVar = this.f27176a;
        return (bVar.f27182f * 1000000) / ((long) bVar.f27180d.f27211i);
    }
}
