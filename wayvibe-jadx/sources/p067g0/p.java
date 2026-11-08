package p067g0;

import Z8.c;
import Z8.e;

/* JADX INFO: loaded from: classes.dex */
public interface p extends r {
    @Override // p067g0.r
    default boolean all(c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }

    @Override // p067g0.r
    default Object foldIn(Object obj, e eVar) {
        return eVar.invoke(obj, this);
    }
}
