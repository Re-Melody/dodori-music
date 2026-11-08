package Z7;

import U.P;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f14026b;

    public /* synthetic */ c(P p10, int i10) {
        this.f14025a = i10;
        this.f14026b = p10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14025a) {
            case 0:
                P.a(this.f14026b);
                break;
            default:
                P.a(this.f14026b);
                break;
        }
    }
}
