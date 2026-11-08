package p160o7;

/* JADX INFO: renamed from: o7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2181j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2185n f23760b;

    public /* synthetic */ RunnableC2181j(C2185n c2185n, int i10) {
        this.f23759a = i10;
        this.f23760b = c2185n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23759a) {
            case 0:
                this.f23760b.f23773b.start();
                break;
            case 1:
                this.f23760b.f23774c.start();
                break;
            default:
                this.f23760b.f23773b.l();
                break;
        }
    }
}
