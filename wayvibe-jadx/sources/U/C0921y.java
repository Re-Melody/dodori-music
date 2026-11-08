package U;

/* JADX INFO: renamed from: U.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0921y extends AbstractC0903o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12001b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0921y(Z8.a aVar) {
        super(aVar);
        U u10 = U.f11815f;
        this.f12002c = u10;
    }

    @Override // U.AbstractC0903o0
    public final C0905p0 a(Object obj) {
        switch (this.f12001b) {
            case 0:
                return new C0905p0(this, obj, obj == null, null, true);
            default:
                return new C0905p0(this, obj, obj == null, (M0) this.f12002c, true);
        }
    }

    @Override // U.AbstractC0903o0
    public b1 b() {
        switch (this.f12001b) {
            case 0:
                return (C0923z) this.f12002c;
            default:
                return super.b();
        }
    }

    public C0921y() {
        super(C0874a.f11839c);
        this.f12002c = new C0923z();
    }
}
