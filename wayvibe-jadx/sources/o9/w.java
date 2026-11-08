package o9;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Q8.d, S8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q8.d f23889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q8.i f23890b;

    public w(Q8.d dVar, Q8.i iVar) {
        this.f23889a = dVar;
        this.f23890b = iVar;
    }

    @Override // S8.d
    public final S8.d getCallerFrame() {
        Q8.d dVar = this.f23889a;
        if (dVar instanceof S8.d) {
            return (S8.d) dVar;
        }
        return null;
    }

    @Override // Q8.d
    public final Q8.i getContext() {
        return this.f23890b;
    }

    @Override // Q8.d
    public final void resumeWith(Object obj) {
        this.f23889a.resumeWith(obj);
    }
}
