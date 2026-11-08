package U;

import p151n9.InterfaceC2106h;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements InterfaceC2106h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0901n0 f11801b;

    public /* synthetic */ R0(C0901n0 c0901n0, int i10) {
        this.f11800a = i10;
        this.f11801b = c0901n0;
    }

    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, Q8.d dVar) {
        switch (this.f11800a) {
            case 0:
                this.f11801b.setValue(obj);
                break;
            case 1:
                this.f11801b.setValue(obj);
                break;
            case 2:
                this.f11801b.setValue(obj);
                break;
            default:
                this.f11801b.setValue(obj);
                break;
        }
        return M8.D.f8402a;
    }
}
