package B8;

/* JADX INFO: renamed from: B8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0129p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0128o f844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f845b;

    public C0129p(EnumC0128o enumC0128o, r0 r0Var) {
        p229v9.a.k(enumC0128o, "state is null");
        this.f844a = enumC0128o;
        p229v9.a.k(r0Var, "status is null");
        this.f845b = r0Var;
    }

    public static C0129p a(EnumC0128o enumC0128o) {
        p229v9.a.g("state is TRANSIENT_ERROR. Use forError() instead", enumC0128o != EnumC0128o.TRANSIENT_FAILURE);
        return new C0129p(enumC0128o, r0.f848e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0129p)) {
            return false;
        }
        C0129p c0129p = (C0129p) obj;
        return this.f844a.equals(c0129p.f844a) && this.f845b.equals(c0129p.f845b);
    }

    public final int hashCode() {
        return this.f844a.hashCode() ^ this.f845b.hashCode();
    }

    public final String toString() {
        r0 r0Var = this.f845b;
        boolean zE = r0Var.e();
        EnumC0128o enumC0128o = this.f844a;
        if (zE) {
            return enumC0128o.toString();
        }
        return enumC0128o + "(" + r0Var + ")";
    }
}
