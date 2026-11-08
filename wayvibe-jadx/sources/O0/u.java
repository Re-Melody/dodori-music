package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f8963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8964b = 0;

    static {
        p028c1.n[] nVarArr = p028c1.m.f15860b;
        f8963a = p028c1.m.f15861c;
    }

    public static final t a(t tVar, int i10, int i11, long j10, p005a1.p pVar, v vVar, p005a1.g gVar, int i12, int i13, p005a1.q qVar) {
        long j11;
        p005a1.p pVar2 = pVar;
        v vVar2 = vVar;
        p005a1.g gVar2 = gVar;
        int i14 = i12;
        int i15 = i13;
        if (i10 == Integer.MIN_VALUE || i10 == tVar.f8954a) {
            if (p046da.b.N(j10)) {
                j11 = j10;
            } else {
                j11 = j10;
                if (p028c1.m.a(j11, tVar.f8956c)) {
                }
            }
            if ((pVar2 == null || pVar2.equals(tVar.f8957d)) && ((i11 == Integer.MIN_VALUE || i11 == tVar.f8955b) && ((vVar2 == null || vVar2.equals(tVar.f8958e)) && ((gVar2 == null || gVar2.equals(tVar.f8959f)) && ((i14 == 0 || i14 == tVar.f8960g) && ((i15 == Integer.MIN_VALUE || i15 == tVar.f8961h) && (qVar == null || qVar.equals(tVar.f8962i)))))))) {
                return tVar;
            }
        } else {
            j11 = j10;
        }
        long j12 = p046da.b.N(j11) ? tVar.f8956c : j11;
        if (pVar2 == null) {
            pVar2 = tVar.f8957d;
        }
        if (i10 == Integer.MIN_VALUE) {
            i10 = tVar.f8954a;
        }
        int i16 = i11 == Integer.MIN_VALUE ? tVar.f8955b : i11;
        v vVar3 = tVar.f8958e;
        if (vVar3 != null && vVar2 == null) {
            vVar2 = vVar3;
        }
        if (gVar2 == null) {
            gVar2 = tVar.f8959f;
        }
        if (i14 == 0) {
            i14 = tVar.f8960g;
        }
        if (i15 == Integer.MIN_VALUE) {
            i15 = tVar.f8961h;
        }
        return new t(i10, i16, j12, pVar2, vVar2, gVar2, i14, i15, qVar == null ? tVar.f8962i : qVar);
    }
}
