package p267z6;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29883a;

    public l(List list) {
        this.f29883a = list;
    }

    @Override // p267z6.k
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f29883a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((k) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f29883a.equals(((l) obj).f29883a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29883a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f29883a) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
