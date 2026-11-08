package X2;

import p255y2.Z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f13059b;

    public /* synthetic */ c(d dVar, x xVar, int i10) {
        this.f13058a = i10;
        this.f13059b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13058a) {
            case 0:
                this.f13059b.getClass();
                break;
            case 1:
                this.f13059b.l();
                break;
            default:
                this.f13059b.g();
                break;
        }
    }

    public /* synthetic */ c(d dVar, x xVar, Z z10) {
        this.f13058a = 0;
        this.f13059b = xVar;
    }
}
