package p016b0;

import V0.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15713a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f15713a == ((a) obj).f15713a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15713a);
    }

    public final String toString() {
        return p.q(new StringBuilder("DeltaCounter(count="), this.f15713a, ')');
    }
}
