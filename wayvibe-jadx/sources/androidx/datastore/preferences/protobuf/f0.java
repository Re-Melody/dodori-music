package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f15089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f15091c;

    public f0(e0 e0Var, Comparable comparable, Object obj) {
        this.f15091c = e0Var;
        this.f15089a = comparable;
        this.f15090b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f15089a.compareTo(((f0) obj).f15089a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f15089a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f15090b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15089a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15090b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f15089a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15090b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f15091c.b();
        Object obj2 = this.f15090b;
        this.f15090b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f15089a + com.amazon.a.a.o.b.f.f16452b + this.f15090b;
    }
}
