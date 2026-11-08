package o9;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Q8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q8.i f23877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f23878b;

    public o(Q8.i iVar, Throwable th) {
        this.f23877a = iVar;
        this.f23878b = th;
    }

    @Override // Q8.i
    public final Object fold(Object obj, Z8.e eVar) {
        return this.f23877a.fold(obj, eVar);
    }

    @Override // Q8.i
    public final Q8.g get(Q8.h hVar) {
        return this.f23877a.get(hVar);
    }

    @Override // Q8.i
    public final Q8.i minusKey(Q8.h hVar) {
        return this.f23877a.minusKey(hVar);
    }

    @Override // Q8.i
    public final Q8.i plus(Q8.i iVar) {
        return this.f23877a.plus(iVar);
    }
}
