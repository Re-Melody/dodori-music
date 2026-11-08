package F2;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f4176c = new j0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4178b;

    public j0(int i10, boolean z10) {
        this.f4177a = i10;
        this.f4178b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f4177a == j0Var.f4177a && this.f4178b == j0Var.f4178b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4177a << 1) + (this.f4178b ? 1 : 0);
    }
}
