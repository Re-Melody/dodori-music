package V1;

import P1.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f12466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f12467c;

    public /* synthetic */ a(c cVar, e eVar, int i10) {
        this.f12465a = i10;
        this.f12466b = cVar;
        this.f12467c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12465a) {
            case 0:
                this.f12466b.d().a(this.f12467c);
                break;
            case 1:
                this.f12466b.d().a(this.f12467c);
                break;
            default:
                this.f12466b.d().a(this.f12467c);
                break;
        }
    }
}
