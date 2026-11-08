package p205t5;

import p138m5.h;
import p138m5.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f26841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f26842c;

    public b(long j10, i iVar, h hVar) {
        this.f26840a = j10;
        this.f26841b = iVar;
        this.f26842c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f26840a == bVar.f26840a && this.f26841b.equals(bVar.f26841b) && this.f26842c.equals(bVar.f26842c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f26840a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f26841b.hashCode()) * 1000003) ^ this.f26842c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f26840a + ", transportContext=" + this.f26841b + ", event=" + this.f26842c + "}";
    }
}
