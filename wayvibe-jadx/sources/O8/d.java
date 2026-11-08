package O8;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Map.Entry, p013a9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9346c;

    public d(e map, int i10) {
        m.f(map, "map");
        this.f9344a = map;
        this.f9345b = i10;
        this.f9346c = map.f9355h;
    }

    public final void a() {
        if (this.f9344a.f9355h != this.f9346c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m.b(entry.getKey(), getKey()) && m.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f9344a.f9348a[this.f9345b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f9344a.f9349b;
        m.c(objArr);
        return objArr[this.f9345b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.f9344a;
        eVar.g();
        Object[] objArr = eVar.f9349b;
        if (objArr == null) {
            int length = eVar.f9348a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f9349b = objArr;
        }
        int i10 = this.f9345b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
