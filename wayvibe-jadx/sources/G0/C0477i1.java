package G0;

/* JADX INFO: renamed from: G0.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0477i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5235b;

    public C0477i1(String str, Object obj) {
        this.f5234a = str;
        this.f5235b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0477i1)) {
            return false;
        }
        C0477i1 c0477i1 = (C0477i1) obj;
        return kotlin.jvm.internal.m.b(this.f5234a, c0477i1.f5234a) && kotlin.jvm.internal.m.b(this.f5235b, c0477i1.f5235b);
    }

    public final int hashCode() {
        int iHashCode = this.f5234a.hashCode() * 31;
        Object obj = this.f5235b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f5234a + ", value=" + this.f5235b + ')';
    }
}
