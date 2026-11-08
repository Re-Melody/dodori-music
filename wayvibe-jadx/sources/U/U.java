package U;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Q8.h, M0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ U f11811b = new U(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f11812c = new U(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U f11813d = new U(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final U f11814e = new U(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final U f11815f = new U(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11816a;

    public /* synthetic */ U(int i10) {
        this.f11816a = i10;
    }

    public static final void b(U u10) {
        p151n9.U u11;
        X.e eVar;
        p004a0.b bVar;
        p151n9.U u12 = C0924z0.f12013v;
        do {
            u11 = C0924z0.f12013v;
            eVar = (X.e) u11.getValue();
            bVar = (p004a0.b) eVar;
            Z.c cVarB = bVar.f14076c;
            p004a0.a aVar = (p004a0.a) cVarB.get(u10);
            if (aVar != null) {
                int iHashCode = u10 != null ? u10.hashCode() : 0;
                Z.m mVar = cVarB.f13415a;
                Z.m mVarV = mVar.v(iHashCode, u10, 0);
                if (mVar != mVarV) {
                    cVarB = mVarV == null ? Z.c.f13414c : new Z.c(mVarV, cVarB.f13416b - 1);
                }
                p016b0.b bVar2 = p016b0.b.f15714a;
                Object obj = aVar.f14071a;
                boolean z10 = obj != bVar2;
                Object obj2 = aVar.f14072b;
                if (z10) {
                    Object obj3 = cVarB.get(obj);
                    kotlin.jvm.internal.m.c(obj3);
                    cVarB = cVarB.b(obj, new p004a0.a(((p004a0.a) obj3).f14071a, obj2));
                }
                if (obj2 != bVar2) {
                    Object obj4 = cVarB.get(obj2);
                    kotlin.jvm.internal.m.c(obj4);
                    cVarB = cVarB.b(obj2, new p004a0.a(obj, ((p004a0.a) obj4).f14072b));
                }
                Object obj5 = obj != bVar2 ? bVar.f14074a : obj2;
                if (obj2 != bVar2) {
                    obj = bVar.f14075b;
                }
                bVar = new p004a0.b(obj5, obj, cVarB);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!u11.g(eVar, bVar));
    }

    @Override // U.M0
    public boolean a(Object obj, Object obj2) {
        switch (this.f11816a) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.m.b(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f11816a) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
