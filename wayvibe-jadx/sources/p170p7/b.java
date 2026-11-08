package p170p7;

import B2.AbstractC0112b;
import E3.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f25249d = new b(q.f25278b, h.b(), -1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f25250e = new d(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f25251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f25252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25253c;

    public b(q qVar, h hVar, int i10) {
        if (qVar == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f25251a = qVar;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f25252b = hVar;
        this.f25253c = i10;
    }

    public static b b(n nVar) {
        return new b(nVar.f25272d, nVar.f25269a, -1);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        int iCompareTo = this.f25251a.compareTo(bVar.f25251a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f25252b.compareTo(bVar.f25252b);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(this.f25253c, bVar.f25253c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f25251a.equals(bVar.f25251a) && this.f25252b.equals(bVar.f25252b) && this.f25253c == bVar.f25253c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f25251a.f25279a.hashCode() ^ 1000003) * 1000003) ^ this.f25252b.f25264a.hashCode()) * 1000003) ^ this.f25253c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexOffset{readTime=");
        sb.append(this.f25251a);
        sb.append(", documentKey=");
        sb.append(this.f25252b);
        sb.append(", largestBatchId=");
        return AbstractC0112b.i(sb, this.f25253c, "}");
    }
}
