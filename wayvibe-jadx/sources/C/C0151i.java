package C;

/* JADX INFO: renamed from: C.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0151i extends kotlin.jvm.internal.n implements Z8.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0151i f1010b = new C0151i(2, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0151i f1011c = new C0151i(2, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0151i f1012d = new C0151i(2, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1013a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0151i(int i10, int i11) {
        super(i10);
        this.f1013a = i11;
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1013a) {
            case 0:
                return Integer.valueOf(Math.round((1 + (((p028c1.k) obj2) != p028c1.k.Ltr ? (-1.0f) * (-1) : -1.0f)) * (((Number) obj).intValue() / 2.0f)));
            case 1:
                return Integer.valueOf(((u0) obj).a((p028c1.b) obj2));
            default:
                return Integer.valueOf(((u0) obj).c((p028c1.b) obj2));
        }
    }
}
