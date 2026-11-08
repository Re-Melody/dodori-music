package M;

import M8.D;

/* JADX INFO: renamed from: M.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0636a extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0636a f7934b = new C0636a(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0636a f7935c = new C0636a(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0636a f7936d = new C0636a(1, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0636a(int i10, int i11) {
        super(i10);
        this.f7937a = i11;
    }

    @Override // Z8.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f7937a) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i10 = ((V0.k) obj).f12434a;
                break;
        }
        return D.f8402a;
    }
}
