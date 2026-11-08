package S8;

import Q8.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends a {
    public g(Q8.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f10595a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // Q8.d
    public Q8.i getContext() {
        return j.f10595a;
    }
}
