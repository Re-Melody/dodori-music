package G0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f5005b = new H(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f5006c = new H(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f5007d = new H(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5008a;

    public /* synthetic */ H(int i10) {
        this.f5008a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5008a) {
            case 0:
                p133m0.d dVarF = ((M0.o) obj).f();
                p133m0.d dVarF2 = ((M0.o) obj2).f();
                int iCompare = Float.compare(dVarF.f22184a, dVarF2.f22184a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(dVarF.f22185b, dVarF2.f22185b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(dVarF.f22187d, dVarF2.f22187d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(dVarF.f22186c, dVarF2.f22186c);
            case 1:
                p133m0.d dVarF3 = ((M0.o) obj).f();
                p133m0.d dVarF4 = ((M0.o) obj2).f();
                int iCompare4 = Float.compare(dVarF4.f22186c, dVarF3.f22186c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(dVarF3.f22185b, dVarF4.f22185b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(dVarF3.f22187d, dVarF4.f22187d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(dVarF4.f22184a, dVarF3.f22184a);
            default:
                M8.l lVar = (M8.l) obj;
                M8.l lVar2 = (M8.l) obj2;
                int iCompare7 = Float.compare(((p133m0.d) lVar.f8413a).f22185b, ((p133m0.d) lVar2.f8413a).f22185b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((p133m0.d) lVar.f8413a).f22187d, ((p133m0.d) lVar2.f8413a).f22187d);
        }
    }
}
