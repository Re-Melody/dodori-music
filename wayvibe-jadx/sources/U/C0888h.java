package U;

/* JADX INFO: renamed from: U.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0888h extends kotlin.jvm.internal.n implements Z8.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0888h f11867b = new C0888h(2, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0888h f11868c = new C0888h(2, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11869a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0888h(int i10, int i11) {
        super(i10);
        this.f11869a = i11;
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11869a) {
            case 0:
                InterfaceC0898m interfaceC0898m = (InterfaceC0898m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0906q c0906q = (C0906q) interfaceC0898m;
                    if (c0906q.z()) {
                        c0906q.N();
                    }
                }
                break;
            case 1:
                InterfaceC0898m interfaceC0898m2 = (InterfaceC0898m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0906q c0906q2 = (C0906q) interfaceC0898m2;
                    if (c0906q2.z()) {
                        c0906q2.N();
                    }
                }
                break;
            default:
                ((F0.H) obj).f3608x = true;
                break;
        }
        return M8.D.f8402a;
    }
}
