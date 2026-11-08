package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1130z extends A implements InterfaceC1123s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f15579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130z(B b10, InterfaceC1125u interfaceC1125u, D d10) {
        super(b10, d10);
        this.f15579f = b10;
        this.f15578e = interfaceC1125u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    @Override // androidx.lifecycle.A
    public final void b() {
        this.f15578e.getLifecycle().removeObserver(this);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.u, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC1123s
    public final void c(InterfaceC1125u interfaceC1125u, EnumC1119n enumC1119n) {
        ?? r10 = this.f15578e;
        EnumC1120o currentState = r10.getLifecycle().getCurrentState();
        if (currentState == EnumC1120o.DESTROYED) {
            this.f15579f.g(this.f15465a);
            return;
        }
        EnumC1120o enumC1120o = null;
        while (enumC1120o != currentState) {
            a(e());
            enumC1120o = currentState;
            currentState = r10.getLifecycle().getCurrentState();
        }
    }

    @Override // androidx.lifecycle.A
    public final boolean d(InterfaceC1125u interfaceC1125u) {
        return this.f15578e == interfaceC1125u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    @Override // androidx.lifecycle.A
    public final boolean e() {
        return this.f15578e.getLifecycle().getCurrentState().a(EnumC1120o.STARTED);
    }
}
