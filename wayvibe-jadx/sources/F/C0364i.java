package F;

/* JADX INFO: renamed from: F.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0364i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3537b;

    public C0364i(int i10, int i11) {
        this.f3536a = i10;
        this.f3537b = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0364i)) {
            return false;
        }
        C0364i c0364i = (C0364i) obj;
        return this.f3536a == c0364i.f3536a && this.f3537b == c0364i.f3537b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3537b) + (Integer.hashCode(this.f3536a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f3536a);
        sb.append(", end=");
        return V0.p.q(sb, this.f3537b, ')');
    }
}
