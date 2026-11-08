package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f18675g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f18677b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f18678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h0 f18680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f18681f;

    public G0(int i10) {
        this.f18676a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f18678c = map;
        this.f18681f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f18677b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((K0) this.f18677b.get(i12)).f18686a);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((K0) this.f18677b.get(i13)).f18686a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((K0) this.f18677b.get(i12)).f18686a);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f18679d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f18677b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f18677b.isEmpty()) {
            this.f18677b.clear();
        }
        if (this.f18678c.isEmpty()) {
            return;
        }
        this.f18678c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f18678c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f18678c.isEmpty() ? J0.f18684b : this.f18678c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f18678c.isEmpty() && !(this.f18678c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18678c = treeMap;
            this.f18681f = treeMap.descendingMap();
        }
        return (SortedMap) this.f18678c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f18680e == null) {
            this.f18680e = new androidx.datastore.preferences.protobuf.h0(1, this);
        }
        return this.f18680e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return super.equals(obj);
        }
        G0 g3 = (G0) obj;
        int size = size();
        if (size == g3.size()) {
            int size2 = this.f18677b.size();
            if (size2 != g3.f18677b.size()) {
                return ((AbstractSet) entrySet()).equals(g3.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(g3.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f18678c.equals(g3.f18678c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((K0) this.f18677b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f18677b.isEmpty();
        int i10 = this.f18676a;
        if (zIsEmpty && !(this.f18677b instanceof ArrayList)) {
            this.f18677b = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return e().put(comparable, obj);
        }
        if (this.f18677b.size() == i10) {
            K0 k10 = (K0) this.f18677b.remove(i10 - 1);
            e().put(k10.f18686a, k10.f18687b);
        }
        this.f18677b.add(i11, new K0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((K0) this.f18677b.get(iA)).f18687b : this.f18678c.get(comparable);
    }

    public final Object h(int i10) {
        b();
        Object obj = ((K0) this.f18677b.remove(i10)).f18687b;
        if (!this.f18678c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f18677b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new K0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f18677b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((K0) this.f18677b.get(i10)).hashCode();
        }
        return this.f18678c.size() > 0 ? this.f18678c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f18678c.isEmpty()) {
            return null;
        }
        return this.f18678c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18678c.size() + this.f18677b.size();
    }
}
