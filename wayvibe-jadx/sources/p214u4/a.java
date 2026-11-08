package p214u4;

import p080h4.q;
import p092i4.f;
import p185r4.j;
import p185r4.o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    @Override // p214u4.e
    public final f a(q qVar, j jVar) {
        if (jVar instanceof o) {
            return ((o) jVar).f25964c == f.MEMORY_CACHE ? new d(qVar, jVar) : new b(qVar, jVar);
        }
        return new d(qVar, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + 6200;
    }
}
