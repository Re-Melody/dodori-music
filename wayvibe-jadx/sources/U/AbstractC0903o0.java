package U;

/* JADX INFO: renamed from: U.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0903o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f11898a;

    public AbstractC0903o0(Z8.a aVar) {
        this.f11898a = new S(aVar);
    }

    public abstract C0905p0 a(Object obj);

    public b1 b() {
        return this.f11898a;
    }

    public final b1 c(C0905p0 c0905p0, b1 b1Var) {
        b1 b1Var2;
        Object obj;
        Object obj2 = null;
        if (!(b1Var instanceof H)) {
            if (b1Var instanceof a1) {
                boolean z10 = c0905p0.f11902b;
                Object obj3 = c0905p0.f11905e;
                if ((z10 || obj3 != null) && !c0905p0.f11904d) {
                    if (z10) {
                        obj3 = null;
                    } else if (obj3 == null) {
                        C0880d.x("Unexpected form of a provided value");
                        throw null;
                    }
                    a1 a1Var = (a1) b1Var;
                    boolean zB = kotlin.jvm.internal.m.b(obj3, a1Var.f11842a);
                    b1Var2 = a1Var;
                    if (!zB) {
                    }
                }
            } else if (b1Var instanceof C0923z) {
                c0905p0.getClass();
                ((C0923z) b1Var).getClass();
            }
            b1Var2 = null;
        } else if (c0905p0.f11904d) {
            H h10 = (H) b1Var;
            C0891i0 c0891i0 = h10.f11733a;
            if (c0905p0.f11902b) {
                obj = null;
            } else {
                obj = c0905p0.f11905e;
                if (obj == null) {
                    C0880d.x("Unexpected form of a provided value");
                    throw null;
                }
            }
            c0891i0.setValue(obj);
            b1Var2 = h10;
        } else {
            b1Var2 = null;
        }
        if (b1Var2 != null) {
            return b1Var2;
        }
        boolean z11 = c0905p0.f11904d;
        Object obj4 = c0905p0.f11905e;
        if (z11) {
            M0 m8 = c0905p0.f11903c;
            if (m8 == null) {
                m8 = U.f11815f;
            }
            return new H(C0880d.K(obj4, m8));
        }
        if (!c0905p0.f11902b) {
            if (obj4 == null) {
                C0880d.x("Unexpected form of a provided value");
                throw null;
            }
            obj2 = obj4;
        }
        return new a1(obj2);
    }
}
