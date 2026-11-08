package P0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9478c;

    public n(int i10, int i11, boolean z10) {
        this.f9476a = i10;
        this.f9477b = i11;
        this.f9478c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f9476a == nVar.f9476a && this.f9477b == nVar.f9477b && this.f9478c == nVar.f9478c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9478c) + p134m1.b.c(this.f9477b, Integer.hashCode(this.f9476a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.f9476a);
        sb.append(", end=");
        sb.append(this.f9477b);
        sb.append(", isRtl=");
        return p134m1.b.o(sb, this.f9478c, ')');
    }
}
