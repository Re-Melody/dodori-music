package p148n5;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f22953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22954b;

    public a(c cVar, long j10) {
        if (cVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f22953a = cVar;
        this.f22954b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f22953a.equals(aVar.f22953a) && this.f22954b == aVar.f22954b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22953a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f22954b;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f22953a);
        sb.append(", nextRequestWaitMillis=");
        return p.k(this.f22954b, "}", sb);
    }
}
