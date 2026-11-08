package A6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractC0100z implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f299b = new C(W.f329e, 0);

    public static W p(int i10, Object[] objArr) {
        return i10 == 0 ? W.f329e : new W(objArr, i10);
    }

    public static B q() {
        return new B(4);
    }

    public static E r(Collection collection) {
        if (!(collection instanceof AbstractC0100z)) {
            Object[] array = collection.toArray();
            AbstractC0093s.b(array.length, array);
            return p(array.length, array);
        }
        E eF = ((AbstractC0100z) collection).f();
        if (!eF.o()) {
            return eF;
        }
        Object[] array2 = eF.toArray(AbstractC0100z.f407a);
        return p(array2.length, array2);
    }

    public static W s(Object[] objArr) {
        if (objArr.length == 0) {
            return W.f329e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC0093s.b(objArr2.length, objArr2);
        return p(objArr2.length, objArr2);
    }

    public static W u(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        AbstractC0093s.b(5, objArr);
        return p(5, objArr);
    }

    public static W x(Object obj) {
        Object[] objArr = {obj};
        AbstractC0093s.b(1, objArr);
        return p(1, objArr);
    }

    public static W y(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC0093s.b(2, objArr);
        return p(2, objArr);
    }

    public static W z(V v3, List list) {
        v3.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        AbstractC0093s.b(array.length, array);
        Arrays.sort(array, v3);
        return p(array.length, array);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public E subList(int i10, int i11) {
        p229v9.a.m(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? W.f329e : new D(this, i10, i12);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // A6.AbstractC0100z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && p228v8.c.d(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (p228v8.c.d(get(i10), list.get(i10))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // A6.AbstractC0100z
    public int h(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final C listIterator(int i10) {
        p229v9.a.l(i10, size());
        return isEmpty() ? f299b : new C(this, i10);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // A6.AbstractC0100z
    public final E f() {
        return this;
    }
}
