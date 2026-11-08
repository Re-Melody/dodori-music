package K;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f6837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(H0 h10, int i10) {
        super(0);
        this.f6836a = i10;
        this.f6837b = h10;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f6836a) {
            case 0:
                return Boolean.valueOf(this.f6837b.f6867a.m() > 0.0f);
            default:
                H0 h10 = this.f6837b;
                return Boolean.valueOf(h10.f6867a.m() < h10.f6868b.m());
        }
    }
}
