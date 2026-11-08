package p172q;

import com.amazon.a.a.o.b.f;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f25369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f25370d;

    public c(Object obj, Object obj2) {
        this.f25367a = obj;
        this.f25368b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25367a.equals(cVar.f25367a) && this.f25368b.equals(cVar.f25368b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f25367a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25368b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f25367a.hashCode() ^ this.f25368b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f25367a + f.f16452b + this.f25368b;
    }
}
