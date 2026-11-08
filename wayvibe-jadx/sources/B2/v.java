package B2;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f633c = new v(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f635b;

    static {
        new v(0, 0);
    }

    public v(int i10, int i11) {
        AbstractC0111a.d((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f634a = i10;
        this.f635b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f634a == vVar.f634a && this.f635b == vVar.f635b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f634a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f635b;
    }

    public final String toString() {
        return this.f634a + "x" + this.f635b;
    }
}
