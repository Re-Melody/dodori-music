package D8;

import B8.C0132t;
import B8.C0134v;
import B8.InterfaceC0126m;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 implements X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2364b;

    public /* synthetic */ S1(Object obj, int i10) {
        this.f2363a = i10;
        this.f2364b = obj;
    }

    @Override // D8.X1
    public final void a(e2 e2Var) {
        switch (this.f2363a) {
            case 0:
                e2Var.f2591a.b((InterfaceC0126m) this.f2364b);
                break;
            case 1:
                e2Var.f2591a.f((C0132t) this.f2364b);
                break;
            default:
                e2Var.f2591a.l((C0134v) this.f2364b);
                break;
        }
    }
}
