package G7;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f5665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f5666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f5667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f5668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f5669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5673i;

    public l(boolean z10) {
        this.f5670f = null;
        this.f5671g = z10;
        this.f5669e = this;
        this.f5668d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f5670f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f5672h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5670f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5672h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5670f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f5672h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f5671g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f5672h;
        this.f5672h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f5670f + com.amazon.a.a.o.b.f.f16452b + this.f5672h;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.f5665a = lVar;
        this.f5670f = obj;
        this.f5671g = z10;
        this.f5673i = 1;
        this.f5668d = lVar2;
        this.f5669e = lVar3;
        lVar3.f5668d = this;
        lVar2.f5669e = this;
    }
}
