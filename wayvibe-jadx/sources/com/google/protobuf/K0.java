package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f18686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f18688c;

    public K0(G0 g3, Comparable comparable, Object obj) {
        this.f18688c = g3;
        this.f18686a = comparable;
        this.f18687b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18686a.compareTo(((K0) obj).f18686a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f18686a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f18687b;
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
        return this.f18686a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18687b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18686a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18687b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f18688c.b();
        Object obj2 = this.f18687b;
        this.f18687b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f18686a + com.amazon.a.a.o.b.f.f16452b + this.f18687b;
    }
}
