package F2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements B2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4225b;

    public /* synthetic */ r(boolean z10, int i10) {
        this.f4224a = i10;
        this.f4225b = z10;
    }

    @Override // B2.j
    public final void invoke(Object obj) {
        p255y2.H h10 = (p255y2.H) obj;
        switch (this.f4224a) {
            case 0:
                h10.s(this.f4225b);
                break;
            case 1:
                h10.j(this.f4225b);
                break;
            default:
                h10.s(this.f4225b);
                break;
        }
    }
}
