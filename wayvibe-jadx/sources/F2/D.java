package F2;

/* JADX INFO: loaded from: classes.dex */
public final class D implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D f3863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D f3864b;

    public final void a() {
        D d10 = this.f3864b;
        if (d10 != null) {
            d10.a();
        }
    }

    public final void b() {
        D d10 = this.f3864b;
        if (d10 != null) {
            d10.b();
        }
    }

    public final void c() {
        D d10 = this.f3863a;
        if (d10 != null) {
            d10.c();
        }
    }

    @Override // F2.f0
    public final void d(int i10, Object obj) {
        if (i10 == 7) {
            this.f3863a = (D) obj;
        } else if (i10 == 8) {
            this.f3864b = (D) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
