package K;

/* JADX INFO: renamed from: K.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0569i0 extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0583p0 f6999b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0569i0(InterfaceC0583p0 interfaceC0583p0, int i10) {
        super(1);
        this.f6998a = i10;
        this.f6999b = interfaceC0583p0;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f6998a) {
            case 0:
                this.f6999b.a(((p133m0.c) obj).f22182a);
                break;
            default:
                p262z0.r rVar = (p262z0.r) obj;
                this.f6999b.e(p262z0.p.g(rVar, false));
                rVar.a();
                break;
        }
        return M8.D.f8402a;
    }
}
