package K;

/* JADX INFO: loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O.P f6839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(O.P p10, int i10) {
        super(0);
        this.f6838a = i10;
        this.f6839b = p10;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f6838a) {
            case 0:
                this.f6839b.l();
                return Boolean.TRUE;
            case 1:
                this.f6839b.f(true);
                return Boolean.TRUE;
            case 2:
                this.f6839b.b(true);
                return Boolean.TRUE;
            case 3:
                this.f6839b.d();
                return Boolean.TRUE;
            case 4:
                O.P p10 = this.f6839b;
                p10.b(true);
                p10.k();
                return M8.D.f8402a;
            case 5:
                O.P p11 = this.f6839b;
                p11.d();
                p11.k();
                return M8.D.f8402a;
            case 6:
                O.P p12 = this.f6839b;
                p12.l();
                p12.k();
                return M8.D.f8402a;
            default:
                this.f6839b.m();
                return M8.D.f8402a;
        }
    }
}
