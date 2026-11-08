package p199t;

import N8.m;
import N8.n;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p013a9.b;
import p013a9.f;
import p209u.a;

/* JADX INFO: renamed from: t.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2231f implements Collection, Set, b, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f26286a = a.f27013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26287b = a.f27015c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26288c;

    public C2231f(int i10) {
        if (i10 > 0) {
            m.a(this, i10);
        }
    }

    public final Object a(int i10) {
        int i11 = this.f26288c;
        Object[] objArr = this.f26287b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f26286a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                m.h0(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.f26287b;
                m.k0(objArr2, i10, objArr2, i13, i11);
            }
            this.f26287b[i12] = null;
        } else {
            m.a(this, i11 > 8 ? i11 + (i11 >> 1) : 8);
            if (i10 > 0) {
                m.l0(0, i10, 6, iArr, this.f26286a);
                m.m0(objArr, 0, this.f26287b, i10, 6);
            }
            if (i10 < i12) {
                int i14 = i10 + 1;
                m.h0(i10, i14, i11, iArr, this.f26286a);
                m.k0(objArr, i10, this.f26287b, i14, i11);
            }
        }
        if (i11 != this.f26288c) {
            throw new ConcurrentModificationException();
        }
        this.f26288c = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iB;
        int i11 = this.f26288c;
        if (obj == null) {
            iB = m.b(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iB = m.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i12 = ~iB;
        int[] iArr = this.f26286a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f26287b;
            m.a(this, i13);
            if (i11 != this.f26288c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f26286a;
            if (iArr2.length != 0) {
                m.l0(0, iArr.length, 6, iArr, iArr2);
                m.m0(objArr, 0, this.f26287b, objArr.length, 6);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f26286a;
            int i14 = i12 + 1;
            m.h0(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f26287b;
            m.k0(objArr2, i14, objArr2, i12, i11);
        }
        int i15 = this.f26288c;
        if (i11 == i15) {
            int[] iArr4 = this.f26286a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f26287b[i12] = obj;
                this.f26288c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        int size = elements.size() + this.f26288c;
        int i10 = this.f26288c;
        int[] iArr = this.f26286a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f26287b;
            m.a(this, size);
            int i11 = this.f26288c;
            if (i11 > 0) {
                m.l0(0, i11, 6, iArr, this.f26286a);
                m.m0(objArr, 0, this.f26287b, this.f26288c, 6);
            }
        }
        if (this.f26288c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f26288c != 0) {
            this.f26286a = a.f27013a;
            this.f26287b = a.f27015c;
            this.f26288c = 0;
        }
        if (this.f26288c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m.b(this, null, 0) : m.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f26288c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f26288c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f26287b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f26286a;
        int i10 = this.f26288c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f26288c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2226a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? m.b(this, null, 0) : m.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        a(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        boolean z10 = false;
        for (int i10 = this.f26288c - 1; -1 < i10; i10--) {
            if (!n.w0(elements, this.f26287b[i10])) {
                a(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f26288c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return m.o0(this.f26287b, 0, this.f26288c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26288c * 14);
        sb.append('{');
        int i10 = this.f26288c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = this.f26287b[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.f(array, "array");
        int i10 = this.f26288c;
        if (array.length < i10) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i10);
        } else if (array.length > i10) {
            array[i10] = null;
        }
        m.k0(this.f26287b, 0, array, 0, this.f26288c);
        return array;
    }
}
