package D8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B8.S f2762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2763b;

    public q2(B8.S s8, Object obj) {
        this.f2762a = s8;
        this.f2763b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q2.class == obj.getClass()) {
            q2 q2Var = (q2) obj;
            if (p228v8.c.d(this.f2762a, q2Var.f2762a) && p228v8.c.d(this.f2763b, q2Var.f2763b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2762a, this.f2763b});
    }

    public final String toString() {
        U.P pF = p228v8.a.f(this);
        pF.c(this.f2762a, "provider");
        pF.c(this.f2763b, "config");
        return pF.toString();
    }
}
