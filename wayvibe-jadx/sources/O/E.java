package O;

import p230w.C2281n;

/* JADX INFO: loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2281n f8674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(C2281n c2281n, int i10) {
        super(0);
        this.f8673a = i10;
        this.f8674b = c2281n;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f8673a) {
            case 0:
                return new p133m0.c(((p133m0.c) this.f8674b.f27746b.getValue()).f22182a);
            case 1:
                this.f8674b.f27750f = false;
                return M8.D.f8402a;
            default:
                this.f8674b.f27750f = false;
                return M8.D.f8402a;
        }
    }
}
