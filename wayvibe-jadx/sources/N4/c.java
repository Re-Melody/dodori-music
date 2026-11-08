package N4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f8605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i10) {
        super(2, (byte) 0);
        this.f8604f = i10;
        this.f8605g = eVar;
    }

    @Override // N4.i
    public final void i() {
        switch (this.f8604f) {
            case 0:
                b bVar = (b) this.f8605g;
                synchronized (bVar.f8595b) {
                    bVar.c(this);
                    if (!bVar.f8596c.isEmpty() && bVar.f8601h > 0) {
                        bVar.f8595b.notify();
                    }
                    break;
                }
                return;
            default:
                O4.g gVar = (O4.g) this.f8605g;
                gVar.getClass();
                this.f3017b = 0;
                this.f8609d = null;
                gVar.f9225b.add(this);
                return;
        }
    }
}
