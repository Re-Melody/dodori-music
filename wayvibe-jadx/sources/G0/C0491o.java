package G0;

/* JADX INFO: renamed from: G0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0491o extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0491o f5253b = new C0491o(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0491o f5254c = new C0491o(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0491o f5255d = new C0491o(1, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0491o f5256e = new C0491o(1, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0491o f5257f = new C0491o(1, 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0491o(int i10, int i11) {
        super(i10);
        this.f5258a = i11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f5258a) {
            case 0:
                return M8.D.f8402a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Boolean.valueOf(V.k(obj));
            default:
                return M8.D.f8402a;
        }
    }
}
