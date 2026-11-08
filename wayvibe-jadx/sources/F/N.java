package F;

/* JADX INFO: loaded from: classes.dex */
public final class N extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f3471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(Q q5, int i10) {
        super(0);
        this.f3470a = i10;
        this.f3471b = q5;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f3470a) {
            case 0:
                Q q5 = this.f3471b;
                return Float.valueOf(q5.f3478b.a() - q5.f3478b.c());
            case 1:
                return Float.valueOf(this.f3471b.f3478b.b());
            default:
                return Float.valueOf(this.f3471b.f3478b.d());
        }
    }
}
