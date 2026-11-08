package R2;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10681b;

    public M(int i10, boolean z10) {
        this.f10680a = i10;
        this.f10681b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m8 = (M) obj;
        return this.f10680a == m8.f10680a && this.f10681b == m8.f10681b;
    }

    public final int hashCode() {
        return (this.f10680a * 31) + (this.f10681b ? 1 : 0);
    }
}
