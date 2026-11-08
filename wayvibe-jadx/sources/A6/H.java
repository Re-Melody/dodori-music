package A6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0099y {
    @Override // A6.AbstractC0099y
    public final AbstractC0099y b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final I f() {
        int i10 = this.f405b;
        if (i10 == 0) {
            int i11 = I.f307c;
            return c0.f355j;
        }
        if (i10 != 1) {
            I iQ = I.q(i10, this.f404a);
            this.f405b = iQ.size();
            this.f406c = true;
            return iQ;
        }
        Object obj = this.f404a[0];
        Objects.requireNonNull(obj);
        int i12 = I.f307c;
        return new i0(obj);
    }
}
