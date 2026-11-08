package C;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1008d;

    public g0(float f10, float f11, float f12, float f13) {
        this.f1005a = f10;
        this.f1006b = f11;
        this.f1007c = f12;
        this.f1008d = f13;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override // C.f0
    public final float a() {
        return this.f1008d;
    }

    @Override // C.f0
    public final float b(p028c1.k kVar) {
        return kVar == p028c1.k.Ltr ? this.f1005a : this.f1007c;
    }

    @Override // C.f0
    public final float c(p028c1.k kVar) {
        return kVar == p028c1.k.Ltr ? this.f1007c : this.f1005a;
    }

    @Override // C.f0
    public final float d() {
        return this.f1006b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p028c1.e.a(this.f1005a, g0Var.f1005a) && p028c1.e.a(this.f1006b, g0Var.f1006b) && p028c1.e.a(this.f1007c, g0Var.f1007c) && p028c1.e.a(this.f1008d, g0Var.f1008d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1008d) + p134m1.b.b(this.f1007c, p134m1.b.b(this.f1006b, Float.hashCode(this.f1005a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        p134m1.b.r(this.f1005a, ", top=", sb);
        p134m1.b.r(this.f1006b, ", end=", sb);
        p134m1.b.r(this.f1007c, ", bottom=", sb);
        sb.append((Object) p028c1.e.b(this.f1008d));
        sb.append(')');
        return sb.toString();
    }
}
