package Z;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13411b;

    public a(Object obj, Object obj2) {
        this.f13410a = obj;
        this.f13411b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.m.b(entry.getKey(), this.f13410a) && kotlin.jvm.internal.m.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13410a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f13411b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f13410a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13410a);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
