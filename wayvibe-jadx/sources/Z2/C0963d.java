package Z2;

/* JADX INFO: renamed from: Z2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0963d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0965f f13515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13520f;

    public C0963d(InterfaceC0965f interfaceC0965f, long j10, long j11, long j12, long j13, long j14) {
        this.f13515a = interfaceC0965f;
        this.f13516b = j10;
        this.f13517c = j11;
        this.f13518d = j12;
        this.f13519e = j13;
        this.f13520f = j14;
    }

    @Override // Z2.z
    public final boolean d() {
        return true;
    }

    @Override // Z2.z
    public final y i(long j10) {
        A a10 = new A(j10, C0964e.a(this.f13515a.e(j10), 0L, this.f13517c, this.f13518d, this.f13519e, this.f13520f));
        return new y(a10, a10);
    }

    @Override // Z2.z
    public final long l() {
        return this.f13516b;
    }
}
