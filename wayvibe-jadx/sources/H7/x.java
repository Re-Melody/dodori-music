package H7;

/* JADX INFO: loaded from: classes.dex */
public final class x implements E7.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E7.y f6228c;

    public /* synthetic */ x(Object obj, E7.y yVar, int i10) {
        this.f6226a = i10;
        this.f6227b = obj;
        this.f6228c = yVar;
    }

    @Override // E7.z
    public final E7.y create(E7.l lVar, L7.a aVar) {
        switch (this.f6226a) {
            case 0:
                if (aVar.f7909a == ((Class) this.f6227b)) {
                    return this.f6228c;
                }
                return null;
            case 1:
                Class cls = (Class) this.f6227b;
                Class<?> cls2 = aVar.f7909a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0550b(this, cls2);
                }
                return null;
            default:
                if (aVar.equals((L7.a) this.f6227b)) {
                    return this.f6228c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f6226a) {
            case 0:
                return "Factory[type=" + ((Class) this.f6227b).getName() + ",adapter=" + this.f6228c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f6227b).getName() + ",adapter=" + this.f6228c + "]";
            default:
                return super.toString();
        }
    }
}
