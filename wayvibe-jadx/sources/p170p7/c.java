package p170p7;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25255b;

    public c(long j10, b bVar) {
        this.f25254a = j10;
        if (bVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f25255b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f25254a == cVar.f25254a && this.f25255b.equals(cVar.f25255b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f25254a;
        return ((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f25255b.hashCode();
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.f25254a + ", offset=" + this.f25255b + "}";
    }
}
