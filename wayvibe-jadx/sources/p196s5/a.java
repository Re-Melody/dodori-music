package p196s5;

import java.util.HashMap;
import p104j5.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p225v5.a f26122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f26123b;

    public a(p225v5.a aVar, HashMap map) {
        this.f26122a = aVar;
        this.f26123b = map;
    }

    public final long a(c cVar, long j10, int i10) {
        long jC = j10 - this.f26122a.c();
        b bVar = (b) this.f26123b.get(cVar);
        long j11 = bVar.f26124a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) i11)))), jC), bVar.f26125b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26122a.equals(aVar.f26122a) && this.f26123b.equals(aVar.f26123b);
    }

    public final int hashCode() {
        return ((this.f26122a.hashCode() ^ 1000003) * 1000003) ^ this.f26123b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f26122a + ", values=" + this.f26123b + "}";
    }
}
