package U;

/* JADX INFO: renamed from: U.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0901n0 implements InterfaceC0877b0, p119k9.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q8.i f11889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0877b0 f11890b;

    public C0901n0(InterfaceC0877b0 interfaceC0877b0, Q8.i iVar) {
        this.f11889a = iVar;
        this.f11890b = interfaceC0877b0;
    }

    @Override // p119k9.C
    public final Q8.i c() {
        return this.f11889a;
    }

    @Override // U.Y0
    public final Object getValue() {
        return this.f11890b.getValue();
    }

    @Override // U.InterfaceC0877b0
    public final void setValue(Object obj) {
        this.f11890b.setValue(obj);
    }
}
