package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f13376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13377e;

    public g(h hVar, int i10, int i11, int i12, float f10) {
        this.f13377e = hVar;
        this.f13373a = i10;
        this.f13374b = i11;
        this.f13375c = i12;
        this.f13376d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13377e.f13379b.a(this.f13373a, this.f13374b, this.f13375c, this.f13376d);
    }
}
