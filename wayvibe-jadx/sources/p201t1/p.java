package p201t1;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26681c = 0.0f;

    public final void f() {
        this.f26683b = 0;
        this.f26682a.clear();
        this.f26681c = 0.0f;
    }

    public final void g(int i10) {
        int i11 = this.f26683b;
        if (i11 == 0 || this.f26681c != i10) {
            this.f26681c = i10;
            if (i11 == 1) {
                c();
            }
            b();
        }
    }
}
