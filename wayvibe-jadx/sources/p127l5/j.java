package p127l5;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f22026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22027b;

    public j(p pVar, h hVar) {
        this.f22026a = pVar;
        this.f22027b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        p pVar = this.f22026a;
        if (pVar == null) {
            if (((j) qVar).f22026a != null) {
                return false;
            }
        } else if (!pVar.equals(((j) qVar).f22026a)) {
            return false;
        }
        return this.f22027b.equals(((j) qVar).f22027b);
    }

    public final int hashCode() {
        p pVar = this.f22026a;
        return (((pVar == null ? 0 : pVar.hashCode()) ^ 1000003) * 1000003) ^ this.f22027b.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f22026a + ", androidClientInfo=" + this.f22027b + "}";
    }
}
