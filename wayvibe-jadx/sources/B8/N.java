package B8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0115b f750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f751c;

    public N(List list, C0115b c0115b, Object obj) {
        p229v9.a.k(list, "addresses");
        this.f749a = Collections.unmodifiableList(new ArrayList(list));
        p229v9.a.k(c0115b, "attributes");
        this.f750b = c0115b;
        this.f751c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return p228v8.c.d(this.f749a, n6.f749a) && p228v8.c.d(this.f750b, n6.f750b) && p228v8.c.d(this.f751c, n6.f751c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f749a, this.f750b, this.f751c});
    }

    public final String toString() {
        U.P pF = p228v8.a.f(this);
        pF.c(this.f749a, "addresses");
        pF.c(this.f750b, "attributes");
        pF.c(this.f751c, "loadBalancingPolicyConfig");
        return pF.toString();
    }
}
