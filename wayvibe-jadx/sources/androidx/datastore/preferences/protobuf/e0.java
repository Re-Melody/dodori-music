package androidx.datastore.preferences.protobuf;

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
public final class e0 extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15081f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f15082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f15083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h0 f15085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f15086e;

    public static e0 g() {
        e0 e0Var = new e0();
        e0Var.f15082a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        e0Var.f15083b = map;
        e0Var.f15086e = map;
        return e0Var;
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
        int size = this.f15082a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((f0) this.f15082a.get(i12)).f15089a);
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
            int iCompareTo2 = comparable.compareTo(((f0) this.f15082a.get(i13)).f15089a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((f0) this.f15082a.get(i12)).f15089a);
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
        if (this.f15084c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f15082a.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f15082a.isEmpty()) {
            this.f15082a.clear();
        }
        if (this.f15083b.isEmpty()) {
            return;
        }
        this.f15083b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f15083b.containsKey(comparable);
    }

    public final Set d() {
        return this.f15083b.isEmpty() ? Collections.EMPTY_SET : this.f15083b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f15083b.isEmpty() && !(this.f15083b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15083b = treeMap;
            this.f15086e = treeMap.descendingMap();
        }
        return (SortedMap) this.f15083b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f15085d == null) {
            this.f15085d = new h0(0, this);
        }
        return this.f15085d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return super.equals(obj);
        }
        e0 e0Var = (e0) obj;
        int size = size();
        if (size == e0Var.size()) {
            int size2 = this.f15082a.size();
            if (size2 != e0Var.f15082a.size()) {
                return ((AbstractSet) entrySet()).equals(e0Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(e0Var.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f15083b.equals(e0Var.f15083b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((f0) this.f15082a.get(iA)).f15090b : this.f15083b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((f0) this.f15082a.get(iA)).setValue(obj);
        }
        b();
        if (this.f15082a.isEmpty() && !(this.f15082a instanceof ArrayList)) {
            this.f15082a = new ArrayList(16);
        }
        int i10 = -(iA + 1);
        if (i10 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f15082a.size() == 16) {
            f0 f0Var = (f0) this.f15082a.remove(15);
            e().put(f0Var.f15089a, f0Var.f15090b);
        }
        this.f15082a.add(i10, new f0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f15082a.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((f0) this.f15082a.get(i10)).hashCode();
        }
        return this.f15083b.size() > 0 ? this.f15083b.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i10) {
        b();
        Object obj = ((f0) this.f15082a.remove(i10)).f15090b;
        if (!this.f15083b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f15082a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f15083b.isEmpty()) {
            return null;
        }
        return this.f15083b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15083b.size() + this.f15082a.size();
    }
}
