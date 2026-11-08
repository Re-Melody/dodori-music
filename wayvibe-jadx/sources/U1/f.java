package U1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1.c f12061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P1.e f12062c;

    public /* synthetic */ f(O1.c cVar, P1.e eVar, int i10) {
        this.f12060a = i10;
        this.f12061b = cVar;
        this.f12062c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12060a) {
            case 0:
                this.f12061b.a(this.f12062c);
                break;
            default:
                Object dVar = this.f12062c;
                if (dVar == null) {
                    dVar = new P1.d("No provider data returned");
                }
                this.f12061b.a(dVar);
                break;
        }
    }
}
