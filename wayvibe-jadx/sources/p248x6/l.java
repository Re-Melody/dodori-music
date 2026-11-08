package p248x6;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28626b;

    public l(int i10, long j10) {
        this.f28625a = i10;
        this.f28626b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f28625a == lVar.f28625a && this.f28626b == lVar.f28626b;
    }

    public final int hashCode() {
        long j10 = this.f28626b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f28625a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f28625a);
        sb.append(", eventTimestamp=");
        return p.k(this.f28626b, "}", sb);
    }
}
