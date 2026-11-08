package D0;

/* JADX INFO: renamed from: D0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187m implements InterfaceC0185k {
    @Override // D0.InterfaceC0185k
    public final long a(long j10, long j11) {
        return g0.b(1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0187m)) {
            return false;
        }
        ((C0187m) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
