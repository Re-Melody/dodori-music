package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 implements X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2390b;

    public /* synthetic */ U1(int i10, int i11) {
        this.f2389a = i11;
        this.f2390b = i10;
    }

    @Override // D8.X1
    public final void a(e2 e2Var) {
        switch (this.f2389a) {
            case 0:
                e2Var.f2591a.j(this.f2390b);
                break;
            case 1:
                e2Var.f2591a.c(this.f2390b);
                break;
            default:
                e2Var.f2591a.i(this.f2390b);
                break;
        }
    }
}
