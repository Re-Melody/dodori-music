package N8;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8654b;

    public v(int i10, Object obj) {
        this.f8653a = i10;
        this.f8654b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f8653a == vVar.f8653a && kotlin.jvm.internal.m.b(this.f8654b, vVar.f8654b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8653a) * 31;
        Object obj = this.f8654b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f8653a + ", value=" + this.f8654b + ')';
    }
}
