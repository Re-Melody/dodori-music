package C;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f956d;

    public S(int i10, int i11, int i12, int i13) {
        this.f953a = i10;
        this.f954b = i11;
        this.f955c = i12;
        this.f956d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        return this.f953a == s8.f953a && this.f954b == s8.f954b && this.f955c == s8.f955c && this.f956d == s8.f956d;
    }

    public final int hashCode() {
        return (((((this.f953a * 31) + this.f954b) * 31) + this.f955c) * 31) + this.f956d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f953a);
        sb.append(", top=");
        sb.append(this.f954b);
        sb.append(", right=");
        sb.append(this.f955c);
        sb.append(", bottom=");
        return V0.p.q(sb, this.f956d, ')');
    }
}
