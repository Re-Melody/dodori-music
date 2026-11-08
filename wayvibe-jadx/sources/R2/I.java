package R2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f10664b;

    public /* synthetic */ I(N n6, int i10) {
        this.f10663a = i10;
        this.f10664b = n6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10663a) {
            case 0:
                this.f10664b.x();
                break;
            case 1:
                N n6 = this.f10664b;
                if (!n6.f10697N) {
                    B b10 = n6.r;
                    b10.getClass();
                    b10.f(n6);
                }
                break;
            default:
                this.f10664b.f10691H = true;
                break;
        }
    }
}
