package F0;

/* JADX INFO: renamed from: F0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0383b extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0385c f3726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0383b(C0385c c0385c, int i10) {
        super(0);
        this.f3725a = i10;
        this.f3726b = c0385c;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f3725a) {
            case 0:
                this.f3726b.q0();
                break;
            default:
                C0385c c0385c = this.f3726b;
                p067g0.p pVar = c0385c.f3727a;
                kotlin.jvm.internal.m.d(pVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((E0.c) pVar).g(c0385c);
                break;
        }
        return M8.D.f8402a;
    }
}
