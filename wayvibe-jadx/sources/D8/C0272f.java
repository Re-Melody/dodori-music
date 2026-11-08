package D8;

import B2.AbstractC0111a;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p261z.EnumC2391a0;
import s7.AbstractC2221b;

/* JADX INFO: renamed from: D8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0272f implements I2.j, Z2.p, Z2.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2597c;

    public /* synthetic */ C0272f(long j10, Object obj, int i10) {
        this.f2595a = i10;
        this.f2596b = j10;
        this.f2597c = obj;
    }

    @Override // Z2.q
    public void A() {
        ((Z2.q) this.f2597c).A();
    }

    public void B() {
        this.f2596b = 0L;
        C0272f c0272f = (C0272f) this.f2597c;
        if (c0272f != null) {
            c0272f.B();
        }
    }

    public void C(Runnable runnable) {
        AbstractC2221b abstractC2221b = (AbstractC2221b) this.f2597c;
        abstractC2221b.f26177f.d();
        if (abstractC2221b.f26181j == this.f2596b) {
            runnable.run();
        } else {
            p207t7.r.a(abstractC2221b.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
        }
    }

    public void D(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f2597c) == null) {
            this.f2597c = exc;
            this.f2596b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f2596b) {
            Exception exc2 = (Exception) this.f2597c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f2597c;
            this.f2597c = null;
            throw exc3;
        }
    }

    @Override // Z2.q
    public Z2.F L(int i10, int i11) {
        return ((Z2.q) this.f2597c).L(i10, i11);
    }

    @Override // I2.j
    public long a(long j10) {
        return ((Z2.i) this.f2597c).f13537e[(int) j10] - this.f2596b;
    }

    @Override // Z2.q
    public void b(Z2.z zVar) {
        ((Z2.q) this.f2597c).b(new p079h3.c(this, zVar, zVar));
    }

    @Override // I2.j
    public long c(long j10, long j11) {
        return ((Z2.i) this.f2597c).f13536d[(int) j10];
    }

    @Override // Z2.p
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((Z2.k) this.f2597c).d(bArr, 0, i11, z10);
    }

    @Override // I2.j
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // Z2.p
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        return ((Z2.k) this.f2597c).f(bArr, i10, i11, z10);
    }

    @Override // I2.j
    public long g(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // I2.j
    public J2.j h(long j10) {
        Z2.i iVar = (Z2.i) this.f2597c;
        int i10 = (int) j10;
        return new J2.j(null, iVar.f13535c[i10], iVar.f13534b[i10]);
    }

    @Override // Z2.p
    public long i() {
        return ((Z2.k) this.f2597c).i() - this.f2596b;
    }

    @Override // Z2.p
    public void j(int i10) throws EOFException, InterruptedIOException {
        ((Z2.k) this.f2597c).a(i10, false);
    }

    @Override // I2.j
    public long k(long j10, long j11) {
        return B2.C.f(((Z2.i) this.f2597c).f13537e, j10 + this.f2596b, true);
    }

    @Override // Z2.p
    public long m() {
        return ((Z2.k) this.f2597c).f13548c - this.f2596b;
    }

    @Override // Z2.p
    public void o() {
        ((Z2.k) this.f2597c).f13551f = 0;
    }

    @Override // Z2.p
    public void p(int i10) throws EOFException, InterruptedIOException {
        ((Z2.k) this.f2597c).p(i10);
    }

    @Override // I2.j
    public boolean q() {
        return true;
    }

    @Override // p255y2.InterfaceC2333i
    public int read(byte[] bArr, int i10, int i11) {
        return ((Z2.k) this.f2597c).read(bArr, i10, i11);
    }

    @Override // Z2.p
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        ((Z2.k) this.f2597c).d(bArr, i10, i11, false);
    }

    @Override // I2.j
    public long t() {
        return 0L;
    }

    public String toString() {
        switch (this.f2595a) {
            case 3:
                if (((C0272f) this.f2597c) == null) {
                    return Long.toBinaryString(this.f2596b);
                }
                return ((C0272f) this.f2597c).toString() + "xx" + Long.toBinaryString(this.f2596b);
            default:
                return super.toString();
        }
    }

    @Override // I2.j
    public long u(long j10) {
        return ((Z2.i) this.f2597c).f13533a;
    }

    @Override // I2.j
    public long v(long j10, long j11) {
        return ((Z2.i) this.f2597c).f13533a;
    }

    @Override // Z2.p
    public void w(byte[] bArr, int i10, int i11) {
        ((Z2.k) this.f2597c).f(bArr, i10, i11, false);
    }

    @Override // Z2.p
    public long x() {
        return ((Z2.k) this.f2597c).f13549d - this.f2596b;
    }

    public int y(int i10) {
        C0272f c0272f = (C0272f) this.f2597c;
        if (c0272f == null) {
            return i10 >= 64 ? Long.bitCount(this.f2596b) : Long.bitCount(this.f2596b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f2596b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f2596b) + c0272f.y(i10 - 64);
    }

    public boolean z(int i10) {
        if (i10 < 64) {
            return (this.f2596b & (1 << i10)) != 0;
        }
        if (((C0272f) this.f2597c) == null) {
            this.f2597c = new C0272f(3);
        }
        return ((C0272f) this.f2597c).z(i10 - 64);
    }

    public /* synthetic */ C0272f(Object obj, long j10, int i10) {
        this.f2595a = i10;
        this.f2597c = obj;
        this.f2596b = j10;
    }

    public C0272f(Z2.k kVar, long j10) {
        this.f2595a = 5;
        this.f2597c = kVar;
        AbstractC0111a.d(kVar.f13549d >= j10);
        this.f2596b = j10;
    }

    public C0272f(int i10) {
        this.f2595a = i10;
        switch (i10) {
            case 3:
                this.f2596b = 0L;
                break;
        }
    }

    public C0272f(EnumC2391a0 enumC2391a0) {
        this.f2595a = 8;
        this.f2597c = enumC2391a0;
        this.f2596b = 0L;
    }
}
