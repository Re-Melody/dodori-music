package E7;

/* JADX INFO: loaded from: classes.dex */
public final class k extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f3156a;

    @Override // E7.y
    public final Object read(M7.b bVar) {
        y yVar = this.f3156a;
        if (yVar != null) {
            return yVar.read(bVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // E7.y
    public final void write(M7.d dVar, Object obj) {
        y yVar = this.f3156a;
        if (yVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        yVar.write(dVar, obj);
    }
}
