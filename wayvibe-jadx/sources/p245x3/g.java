package p245x3;

import p234w3.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (e(4) != gVar.e(4)) {
            return e(4) ? 1 : -1;
        }
        long j10 = this.f3032g - gVar.f3032g;
        if (j10 == 0) {
            j10 = this.k - gVar.k;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
