package C;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f1016a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1017b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0143c f1018c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Float.compare(this.f1016a, j0Var.f1016a) == 0 && this.f1017b == j0Var.f1017b && kotlin.jvm.internal.m.b(this.f1018c, j0Var.f1018c);
    }

    public final int hashCode() {
        int iF = p134m1.b.f(Float.hashCode(this.f1016a) * 31, 31, this.f1017b);
        AbstractC0143c abstractC0143c = this.f1018c;
        return (iF + (abstractC0143c == null ? 0 : abstractC0143c.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f1016a + ", fill=" + this.f1017b + ", crossAxisAlignment=" + this.f1018c + ", flowLayoutData=null)";
    }
}
