package Q8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10590a;

    public a(h hVar) {
        this.f10590a = hVar;
    }

    @Override // Q8.i
    public final Object fold(Object obj, Z8.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Q8.i
    public /* bridge */ g get(h hVar) {
        return p025b9.a.z(this, hVar);
    }

    @Override // Q8.g
    public final h getKey() {
        return this.f10590a;
    }

    @Override // Q8.i
    public /* bridge */ i minusKey(h hVar) {
        return p025b9.a.G(this, hVar);
    }

    @Override // Q8.i
    public final /* bridge */ i plus(i iVar) {
        return p025b9.a.Q(this, iVar);
    }
}
