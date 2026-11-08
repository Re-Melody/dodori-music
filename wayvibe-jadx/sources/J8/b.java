package J8;

import B8.A;
import B8.AbstractC0120g;
import U.P;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends A {
    @Override // B8.A
    public final List b() {
        return q().b();
    }

    @Override // B8.A
    public final AbstractC0120g d() {
        return q().d();
    }

    @Override // B8.A
    public final Object e() {
        return q().e();
    }

    @Override // B8.A
    public final void m() {
        q().m();
    }

    @Override // B8.A
    public void n() {
        q().n();
    }

    @Override // B8.A
    public void p(List list) {
        q().p(list);
    }

    public abstract A q();

    public String toString() {
        P pF = p228v8.a.f(this);
        pF.c(q(), "delegate");
        return pF.toString();
    }
}
