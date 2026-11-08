package p170p7;

import B2.AbstractC0112b;
import R3.a;
import W6.n;
import W6.o;
import W6.p;
import Z8.c;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f25278b = new q(new p(0, 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f25279a;

    public q(p pVar) {
        this.f25279a = pVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q qVar) {
        p pVar = this.f25279a;
        p pVar2 = qVar.f25279a;
        c[] cVarArr = {n.f12881b, o.f12882b};
        for (int i10 = 0; i10 < 2; i10++) {
            c cVar = cVarArr[i10];
            int iV = a.v((Comparable) cVar.invoke(pVar), (Comparable) cVar.invoke(pVar2));
            if (iV != 0) {
                return iV;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof q) && compareTo((q) obj) == 0;
    }

    public final int hashCode() {
        return this.f25279a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotVersion(seconds=");
        p pVar = this.f25279a;
        sb.append(pVar.f12883a);
        sb.append(", nanos=");
        return AbstractC0112b.i(sb, pVar.f12884b, ")");
    }
}
