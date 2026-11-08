package p128l6;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f22048f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, int i10) {
        super(gVar);
        this.f22047e = i10;
        this.f22048f = gVar;
    }

    @Override // p128l6.d
    public final float a() {
        switch (this.f22047e) {
            case 0:
                g gVar = this.f22048f;
                return gVar.f22070l + gVar.f22071m;
            case 1:
                g gVar2 = this.f22048f;
                return gVar2.f22070l + gVar2.f22072n;
            default:
                return this.f22048f.f22070l;
        }
    }
}
