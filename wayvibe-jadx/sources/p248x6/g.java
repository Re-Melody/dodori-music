package p248x6;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28621c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile h f28622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f28623b;

    /* JADX WARN: Multi-variable type inference failed */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        g gVar = new g();
        gVar.f28623b = f28621c;
        gVar.f28622a = hVar;
        return gVar;
    }

    @Override // p248x6.i
    public final Object a() {
        Object objA;
        Object obj = this.f28623b;
        Object obj2 = f28621c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f28623b;
                if (objA == obj2) {
                    objA = this.f28622a.a();
                    Object obj3 = this.f28623b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f28623b = objA;
                    this.f28622a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
