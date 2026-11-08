package Z;

/* JADX INFO: loaded from: classes.dex */
public class c extends N8.f implements X.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f13414c = new c(m.f13438e, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f13415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13416b;

    public c(m mVar, int i10) {
        this.f13415a = mVar;
        this.f13416b = i10;
    }

    @Override // X.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e m() {
        return new e(this);
    }

    public final c b(Object obj, p004a0.a aVar) {
        A1.d dVarU = this.f13415a.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return dVarU == null ? this : new c((m) dVarU.f117c, this.f13416b + dVarU.f116b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f13415a.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f13415a.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
