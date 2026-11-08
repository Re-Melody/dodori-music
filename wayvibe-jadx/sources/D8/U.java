package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f2386c;

    public /* synthetic */ U(X x10, int i10, int i11) {
        this.f2384a = i11;
        this.f2386c = x10;
        this.f2385b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2384a) {
            case 0:
                this.f2386c.f2406c.i(this.f2385b);
                break;
            case 1:
                this.f2386c.f2406c.j(this.f2385b);
                break;
            default:
                this.f2386c.f2406c.c(this.f2385b);
                break;
        }
    }
}
