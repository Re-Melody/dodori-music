package R2;

/* JADX INFO: renamed from: R2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795x extends AbstractC0791t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f10883e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10885d;

    public C0795x(p255y2.O o10, Object obj, Object obj2) {
        super(o10);
        this.f10884c = obj;
        this.f10885d = obj2;
    }

    @Override // R2.AbstractC0791t, p255y2.O
    public final int b(Object obj) {
        Object obj2;
        if (f10883e.equals(obj) && (obj2 = this.f10885d) != null) {
            obj = obj2;
        }
        return this.f10868b.b(obj);
    }

    @Override // R2.AbstractC0791t, p255y2.O
    public final p255y2.M f(int i10, p255y2.M m8, boolean z10) {
        this.f10868b.f(i10, m8, z10);
        if (B2.C.a(m8.f28779b, this.f10885d) && z10) {
            m8.f28779b = f10883e;
        }
        return m8;
    }

    @Override // R2.AbstractC0791t, p255y2.O
    public final Object l(int i10) {
        Object objL = this.f10868b.l(i10);
        return B2.C.a(objL, this.f10885d) ? f10883e : objL;
    }

    @Override // R2.AbstractC0791t, p255y2.O
    public final p255y2.N m(int i10, p255y2.N n6, long j10) {
        this.f10868b.m(i10, n6, j10);
        if (B2.C.a(n6.f28786a, this.f10884c)) {
            n6.f28786a = p255y2.N.f28785q;
        }
        return n6;
    }
}
