package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f2392b;

    public /* synthetic */ V(X x10, int i10) {
        this.f2391a = i10;
        this.f2392b = x10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2391a) {
            case 0:
                this.f2392b.f2406c.m();
                break;
            case 1:
                this.f2392b.o();
                break;
            case 2:
                this.f2392b.f2406c.flush();
                break;
            default:
                this.f2392b.f2406c.h();
                break;
        }
    }
}
