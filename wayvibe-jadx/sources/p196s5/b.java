package p196s5;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f26126c;

    public b(long j10, long j11, Set set) {
        this.f26124a = j10;
        this.f26125b = j11;
        this.f26126c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f26124a == bVar.f26124a && this.f26125b == bVar.f26125b && this.f26126c.equals(bVar.f26126c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f26124a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f26125b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f26126c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f26124a + ", maxAllowedDelay=" + this.f26125b + ", flags=" + this.f26126c + "}";
    }
}
