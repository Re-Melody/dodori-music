package p127l5;

/* JADX INFO: loaded from: classes.dex */
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f22043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f22044b;

    public n(u uVar, t tVar) {
        this.f22043a = uVar;
        this.f22044b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f22043a;
            if (uVar != null ? uVar.equals(((n) vVar).f22043a) : ((n) vVar).f22043a == null) {
                t tVar = this.f22044b;
                if (tVar != null ? tVar.equals(((n) vVar).f22044b) : ((n) vVar).f22044b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f22043a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f22044b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f22043a + ", mobileSubtype=" + this.f22044b + "}";
    }
}
