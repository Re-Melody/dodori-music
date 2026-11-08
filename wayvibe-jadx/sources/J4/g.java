package J4;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6606c;

    public g(int i10, int i11, int i12) {
        this.f6604a = i10;
        this.f6605b = i11;
        this.f6606c = i12;
    }

    public final boolean a() {
        return this.f6605b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f6604a == gVar.f6604a && this.f6605b == gVar.f6605b && this.f6606c == gVar.f6606c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f6604a) * 31) + this.f6605b) * 31) + this.f6606c;
    }
}
