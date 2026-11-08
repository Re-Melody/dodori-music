package F;

/* JADX INFO: renamed from: F.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0363h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0371p f3535c;

    public C0363h(int i10, int i11, InterfaceC0371p interfaceC0371p) {
        this.f3533a = i10;
        this.f3534b = i11;
        this.f3535c = interfaceC0371p;
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "startIndex should be >= 0, but was ").toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(p134m1.b.j(i11, "size should be >0, but was ").toString());
        }
    }
}
