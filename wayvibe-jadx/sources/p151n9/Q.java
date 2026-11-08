package p151n9;

import B2.AbstractC0112b;
import D7.W;
import N8.n;
import O8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23077a;

    public Q(long j10) {
        this.f23077a = j10;
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q) {
            return this.f23077a == ((Q) obj).f23077a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.f23077a) * 31);
    }

    public final String toString() {
        b bVar = new b(2);
        long j10 = this.f23077a;
        if (j10 > 0) {
            bVar.add("stopTimeout=" + j10 + "ms");
        }
        return AbstractC0112b.j(new StringBuilder("SharingStarted.WhileSubscribed("), n.H0(W.m(bVar), null, null, null, null, 63), ')');
    }
}
