package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1764c = p025b9.a.f(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1765d = Z.f1770a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1766e = 0;

    public Object J() {
        return null;
    }

    public abstract int k0(C0189o c0189o);

    public final int l0() {
        return (int) (this.f1764c >> 32);
    }

    public final void m0() {
        this.f1762a = R3.a.n((int) (this.f1764c >> 32), p028c1.a.j(this.f1765d), p028c1.a.h(this.f1765d));
        int iN = R3.a.n((int) (this.f1764c & 4294967295L), p028c1.a.i(this.f1765d), p028c1.a.g(this.f1765d));
        this.f1763b = iN;
        int i10 = this.f1762a;
        long j10 = this.f1764c;
        this.f1766e = S9.b.a((i10 - ((int) (j10 >> 32))) / 2, (iN - ((int) (j10 & 4294967295L))) / 2);
    }

    public abstract void o0(long j10, float f10, Z8.c cVar);

    public final void p0(long j10) {
        if (p028c1.j.a(this.f1764c, j10)) {
            return;
        }
        this.f1764c = j10;
        m0();
    }

    public final void q0(long j10) {
        if (p028c1.a.b(this.f1765d, j10)) {
            return;
        }
        this.f1765d = j10;
        m0();
    }
}
