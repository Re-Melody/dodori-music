package X1;

import P1.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f13050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f13051c;

    public /* synthetic */ a(b bVar, e eVar, int i10) {
        this.f13049a = i10;
        this.f13050b = bVar;
        this.f13051c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13049a) {
            case 0:
                this.f13050b.e().a(this.f13051c);
                break;
            case 1:
                this.f13050b.e().a(this.f13051c);
                break;
            default:
                this.f13050b.e().a(this.f13051c);
                break;
        }
    }
}
