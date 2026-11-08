package p005a1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f14109c = new q(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f14110d = new q(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14112b;

    public q(int i10, boolean z10) {
        this.f14111a = i10;
        this.f14112b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f14111a == qVar.f14111a && this.f14112b == qVar.f14112b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14112b) + (Integer.hashCode(this.f14111a) * 31);
    }

    public final String toString() {
        if (equals(f14109c)) {
            return "TextMotion.Static";
        }
        return equals(f14110d) ? "TextMotion.Animated" : "Invalid";
    }
}
