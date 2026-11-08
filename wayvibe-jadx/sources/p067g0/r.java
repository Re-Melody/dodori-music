package p067g0;

import Z8.c;
import Z8.e;

/* JADX INFO: loaded from: classes.dex */
public interface r {
    boolean all(c cVar);

    Object foldIn(Object obj, e eVar);

    default r then(r rVar) {
        return rVar == o.f19964a ? this : new k(this, rVar);
    }
}
