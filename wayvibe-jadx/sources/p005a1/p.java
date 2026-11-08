package p005a1;

import p028c1.m;
import p028c1.n;
import p046da.b;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f14106c = new p(b.G(0), b.G(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14108b;

    public p(long j10, long j11) {
        this.f14107a = j10;
        this.f14108b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return m.a(this.f14107a, pVar.f14107a) && m.a(this.f14108b, pVar.f14108b);
    }

    public final int hashCode() {
        n[] nVarArr = m.f15860b;
        return Long.hashCode(this.f14108b) + (Long.hashCode(this.f14107a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) m.d(this.f14107a)) + ", restLine=" + ((Object) m.d(this.f14108b)) + ')';
    }
}
