package p255y2;

import A6.C;
import A6.E;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f28851b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f28852a;

    static {
        C c3 = E.f299b;
        f28851b = new W(A6.W.f329e);
        B2.C.D(0);
    }

    public W(E e2) {
        this.f28852a = E.r(e2);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            E e2 = this.f28852a;
            if (i11 >= e2.size()) {
                return false;
            }
            V v3 = (V) e2.get(i11);
            for (boolean z10 : v3.f28850e) {
                if (z10) {
                    if (v3.f28847b.f28804c != i10) {
                        break;
                    }
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        return this.f28852a.equals(((W) obj).f28852a);
    }

    public final int hashCode() {
        return this.f28852a.hashCode();
    }
}
