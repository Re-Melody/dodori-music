package K;

/* JADX INFO: renamed from: K.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0571j0 extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0583p0 f7012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0571j0(InterfaceC0583p0 interfaceC0583p0, int i10) {
        super(0);
        this.f7011a = i10;
        this.f7012b = interfaceC0583p0;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f7011a) {
            case 0:
                this.f7012b.b();
                break;
            default:
                this.f7012b.onCancel();
                break;
        }
        return M8.D.f8402a;
    }
}
