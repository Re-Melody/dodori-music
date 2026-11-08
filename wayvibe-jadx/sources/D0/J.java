package D0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1755c;

    public /* synthetic */ J(Object obj, int i10) {
        this.f1754b = i10;
        this.f1755c = obj;
    }

    @Override // D0.W
    public final p028c1.k b() {
        switch (this.f1754b) {
            case 0:
                return ((F0.V) this.f1755c).getLayoutDirection();
            default:
                return ((G0.A) this.f1755c).getLayoutDirection();
        }
    }

    @Override // D0.W
    public final int c() {
        switch (this.f1754b) {
            case 0:
                return ((F0.V) this.f1755c).l0();
            default:
                return ((G0.A) this.f1755c).getRoot().f3610z.r.f1762a;
        }
    }
}
