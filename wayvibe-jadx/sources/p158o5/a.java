package p158o5;

/* JADX INFO: loaded from: classes.dex */
public final class a implements L8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f23659c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f23660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f23661b;

    public static L8.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f23661b = f23659c;
        aVar.f23660a = bVar;
        return aVar;
    }

    @Override // L8.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f23661b;
        Object obj3 = f23659c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f23661b;
                if (obj == obj3) {
                    obj = this.f23660a.get();
                    Object obj4 = this.f23661b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f23661b = obj;
                    this.f23660a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
