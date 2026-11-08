package p216u6;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f27225c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c f27226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f27227b;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f27227b = f27225c;
        bVar.f27226a = cVar;
        return bVar;
    }

    @Override // p216u6.c
    public final Object zza() {
        Object objZza;
        Object obj = this.f27227b;
        Object obj2 = f27225c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f27227b;
                if (objZza == obj2) {
                    objZza = this.f27226a.zza();
                    Object obj3 = this.f27227b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f27227b = objZza;
                    this.f27226a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
