package N8;

import B2.AbstractC0112b;
import D7.W;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f8643d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f8645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8646c;

    public k() {
        this.f8645b = f8643d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f8646c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, i11, ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        u();
        p(this.f8646c + 1);
        int iT = t(this.f8644a + i10);
        int i12 = this.f8646c;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iT == 0) {
                Object[] objArr = this.f8645b;
                kotlin.jvm.internal.m.f(objArr, "<this>");
                iT = objArr.length;
            }
            int i13 = iT - 1;
            int i14 = this.f8644a;
            if (i14 == 0) {
                Object[] objArr2 = this.f8645b;
                kotlin.jvm.internal.m.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f8644a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f8645b;
                objArr3[length] = objArr3[i15];
                m.k0(objArr3, i15, objArr3, i15 + 1, i13 + 1);
            } else {
                Object[] objArr4 = this.f8645b;
                m.k0(objArr4, i15 - 1, objArr4, i15, objArr4.length);
                Object[] objArr5 = this.f8645b;
                objArr5[objArr5.length - 1] = objArr5[0];
                m.k0(objArr5, 0, objArr5, 1, i13 + 1);
            }
            this.f8645b[i13] = obj;
            this.f8644a = length;
        } else {
            int iT2 = t(i12 + this.f8644a);
            if (iT < iT2) {
                Object[] objArr6 = this.f8645b;
                m.k0(objArr6, iT + 1, objArr6, iT, iT2);
            } else {
                Object[] objArr7 = this.f8645b;
                m.k0(objArr7, 1, objArr7, 0, iT2);
                Object[] objArr8 = this.f8645b;
                objArr8[0] = objArr8[objArr8.length - 1];
                m.k0(objArr8, iT + 1, objArr8, iT, objArr8.length - 1);
            }
            this.f8645b[iT] = obj;
        }
        this.f8646c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        int i11 = this.f8646c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, i11, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f8646c) {
            return addAll(elements);
        }
        u();
        p(elements.size() + this.f8646c);
        int iT = t(this.f8646c + this.f8644a);
        int iT2 = t(this.f8644a + i10);
        int size = elements.size();
        if (i10 >= ((this.f8646c + 1) >> 1)) {
            int i12 = iT2 + size;
            if (iT2 < iT) {
                int i13 = size + iT;
                Object[] objArr = this.f8645b;
                if (i13 <= objArr.length) {
                    m.k0(objArr, i12, objArr, iT2, iT);
                } else if (i12 >= objArr.length) {
                    m.k0(objArr, i12 - objArr.length, objArr, iT2, iT);
                } else {
                    int length = iT - (i13 - objArr.length);
                    m.k0(objArr, 0, objArr, length, iT);
                    Object[] objArr2 = this.f8645b;
                    m.k0(objArr2, i12, objArr2, iT2, length);
                }
            } else {
                Object[] objArr3 = this.f8645b;
                m.k0(objArr3, size, objArr3, 0, iT);
                Object[] objArr4 = this.f8645b;
                if (i12 >= objArr4.length) {
                    m.k0(objArr4, i12 - objArr4.length, objArr4, iT2, objArr4.length);
                } else {
                    m.k0(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f8645b;
                    m.k0(objArr5, i12, objArr5, iT2, objArr5.length - size);
                }
            }
            o(iT2, elements);
            return true;
        }
        int i14 = this.f8644a;
        int length2 = i14 - size;
        if (iT2 < i14) {
            Object[] objArr6 = this.f8645b;
            m.k0(objArr6, length2, objArr6, i14, objArr6.length);
            if (size >= iT2) {
                Object[] objArr7 = this.f8645b;
                m.k0(objArr7, objArr7.length - size, objArr7, 0, iT2);
            } else {
                Object[] objArr8 = this.f8645b;
                m.k0(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.f8645b;
                m.k0(objArr9, 0, objArr9, size, iT2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f8645b;
            m.k0(objArr10, length2, objArr10, i14, iT2);
        } else {
            Object[] objArr11 = this.f8645b;
            length2 += objArr11.length;
            int i15 = iT2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                m.k0(objArr11, length2, objArr11, i14, iT2);
            } else {
                m.k0(objArr11, length2, objArr11, i14, i14 + length3);
                Object[] objArr12 = this.f8645b;
                m.k0(objArr12, 0, objArr12, this.f8644a + length3, iT2);
            }
        }
        this.f8644a = length2;
        o(r(iT2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        u();
        p(this.f8646c + 1);
        int length = this.f8644a;
        if (length == 0) {
            Object[] objArr = this.f8645b;
            kotlin.jvm.internal.m.f(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f8644a = i10;
        this.f8645b[i10] = obj;
        this.f8646c++;
    }

    public final void addLast(Object obj) {
        u();
        p(k() + 1);
        this.f8645b[t(k() + this.f8644a)] = obj;
        this.f8646c = k() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            u();
            s(this.f8644a, t(k() + this.f8644a));
        }
        this.f8644a = 0;
        this.f8646c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f8645b[this.f8644a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iK = k();
        if (i10 < 0 || i10 >= iK) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, iK, ", size: "));
        }
        return this.f8645b[t(this.f8644a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iT = t(k() + this.f8644a);
        int length = this.f8644a;
        if (length < iT) {
            while (length < iT) {
                if (kotlin.jvm.internal.m.b(obj, this.f8645b[length])) {
                    i10 = this.f8644a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iT) {
            return -1;
        }
        int length2 = this.f8645b.length;
        while (length < length2) {
            if (kotlin.jvm.internal.m.b(obj, this.f8645b[length])) {
                i10 = this.f8644a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iT; i11++) {
            if (kotlin.jvm.internal.m.b(obj, this.f8645b[i11])) {
                length = i11 + this.f8645b.length;
                i10 = this.f8644a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return k() == 0;
    }

    @Override // N8.g
    public final int k() {
        return this.f8646c;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f8645b[t(W.G(this) + this.f8644a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iT = t(this.f8646c + this.f8644a);
        int i11 = this.f8644a;
        if (i11 < iT) {
            length = iT - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.m.b(obj, this.f8645b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f8644a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iT) {
            for (int i12 = iT - 1; -1 < i12; i12--) {
                if (kotlin.jvm.internal.m.b(obj, this.f8645b[i12])) {
                    length = i12 + this.f8645b.length;
                    i10 = this.f8644a;
                    return length - i10;
                }
            }
            Object[] objArr = this.f8645b;
            kotlin.jvm.internal.m.f(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f8644a;
            if (i13 <= length) {
                while (!kotlin.jvm.internal.m.b(obj, this.f8645b[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i10 = this.f8644a;
                return length - i10;
            }
        }
        return -1;
    }

    @Override // N8.g
    public final Object n(int i10) {
        int i11 = this.f8646c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, i11, ", size: "));
        }
        if (i10 == W.G(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        u();
        int iT = t(this.f8644a + i10);
        Object[] objArr = this.f8645b;
        Object obj = objArr[iT];
        if (i10 < (this.f8646c >> 1)) {
            int i12 = this.f8644a;
            if (iT >= i12) {
                m.k0(objArr, i12 + 1, objArr, i12, iT);
            } else {
                m.k0(objArr, 1, objArr, 0, iT);
                Object[] objArr2 = this.f8645b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f8644a;
                m.k0(objArr2, i13 + 1, objArr2, i13, objArr2.length - 1);
            }
            Object[] objArr3 = this.f8645b;
            int i14 = this.f8644a;
            objArr3[i14] = null;
            this.f8644a = q(i14);
        } else {
            int iT2 = t(W.G(this) + this.f8644a);
            if (iT <= iT2) {
                Object[] objArr4 = this.f8645b;
                m.k0(objArr4, iT, objArr4, iT + 1, iT2 + 1);
            } else {
                Object[] objArr5 = this.f8645b;
                m.k0(objArr5, iT, objArr5, iT + 1, objArr5.length);
                Object[] objArr6 = this.f8645b;
                objArr6[objArr6.length - 1] = objArr6[0];
                m.k0(objArr6, 0, objArr6, 1, iT2 + 1);
            }
            this.f8645b[iT2] = null;
        }
        this.f8646c--;
        return obj;
    }

    public final void o(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f8645b.length;
        while (i10 < length && it.hasNext()) {
            this.f8645b[i10] = it.next();
            i10++;
        }
        int i11 = this.f8644a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f8645b[i12] = it.next();
        }
        this.f8646c = collection.size() + this.f8646c;
    }

    public final void p(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f8645b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f8643d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f8645b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        m.k0(objArr, 0, objArr2, this.f8644a, objArr.length);
        Object[] objArr3 = this.f8645b;
        int length2 = objArr3.length;
        int i12 = this.f8644a;
        m.k0(objArr3, length2 - i12, objArr2, 0, i12);
        this.f8644a = 0;
        this.f8645b = objArr2;
    }

    public final int q(int i10) {
        Object[] objArr = this.f8645b;
        kotlin.jvm.internal.m.f(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int r(int i10) {
        return i10 < 0 ? i10 + this.f8645b.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        n(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iT;
        kotlin.jvm.internal.m.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f8645b.length != 0) {
            int iT2 = t(this.f8646c + this.f8644a);
            int i10 = this.f8644a;
            if (i10 < iT2) {
                iT = i10;
                while (i10 < iT2) {
                    Object obj = this.f8645b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f8645b[iT] = obj;
                        iT++;
                    }
                    i10++;
                }
                m.p0(this.f8645b, iT, iT2);
            } else {
                int length = this.f8645b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f8645b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f8645b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iT = t(i11);
                for (int i12 = 0; i12 < iT2; i12++) {
                    Object[] objArr2 = this.f8645b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f8645b[iT] = obj3;
                        iT = q(iT);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                u();
                this.f8646c = r(iT - this.f8644a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        u();
        Object[] objArr = this.f8645b;
        int i10 = this.f8644a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f8644a = q(i10);
        this.f8646c = k() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        u();
        int iT = t(W.G(this) + this.f8644a);
        Object[] objArr = this.f8645b;
        Object obj = objArr[iT];
        objArr[iT] = null;
        this.f8646c = k() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        p206t6.b.k(i10, i11, this.f8646c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f8646c) {
            clear();
            return;
        }
        if (i12 == 1) {
            n(i10);
            return;
        }
        u();
        if (i10 < this.f8646c - i11) {
            int iT = t(this.f8644a + (i10 - 1));
            int iT2 = t(this.f8644a + (i11 - 1));
            while (i10 > 0) {
                int i13 = iT + 1;
                int iMin = Math.min(i10, Math.min(i13, iT2 + 1));
                Object[] objArr = this.f8645b;
                int i14 = iT2 - iMin;
                int i15 = iT - iMin;
                m.k0(objArr, i14 + 1, objArr, i15 + 1, i13);
                iT = r(i15);
                iT2 = r(i14);
                i10 -= iMin;
            }
            int iT3 = t(this.f8644a + i12);
            s(this.f8644a, iT3);
            this.f8644a = iT3;
        } else {
            int iT4 = t(this.f8644a + i11);
            int iT5 = t(this.f8644a + i10);
            int i16 = this.f8646c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f8645b;
                i11 = Math.min(i16, Math.min(objArr2.length - iT4, objArr2.length - iT5));
                Object[] objArr3 = this.f8645b;
                int i17 = iT4 + i11;
                m.k0(objArr3, iT5, objArr3, iT4, i17);
                iT4 = t(i17);
                iT5 = t(iT5 + i11);
            }
            int iT6 = t(this.f8646c + this.f8644a);
            s(r(iT6 - i12), iT6);
        }
        this.f8646c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iT;
        kotlin.jvm.internal.m.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f8645b.length != 0) {
            int iT2 = t(this.f8646c + this.f8644a);
            int i10 = this.f8644a;
            if (i10 < iT2) {
                iT = i10;
                while (i10 < iT2) {
                    Object obj = this.f8645b[i10];
                    if (elements.contains(obj)) {
                        this.f8645b[iT] = obj;
                        iT++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                m.p0(this.f8645b, iT, iT2);
            } else {
                int length = this.f8645b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f8645b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f8645b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iT = t(i11);
                for (int i12 = 0; i12 < iT2; i12++) {
                    Object[] objArr2 = this.f8645b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f8645b[iT] = obj3;
                        iT = q(iT);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                u();
                this.f8646c = r(iT - this.f8644a);
            }
        }
        return z10;
    }

    public final void s(int i10, int i11) {
        if (i10 < i11) {
            m.p0(this.f8645b, i10, i11);
            return;
        }
        Object[] objArr = this.f8645b;
        m.p0(objArr, i10, objArr.length);
        m.p0(this.f8645b, 0, i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iK = k();
        if (i10 < 0 || i10 >= iK) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, iK, ", size: "));
        }
        int iT = t(this.f8644a + i10);
        Object[] objArr = this.f8645b;
        Object obj2 = objArr[iT];
        objArr[iT] = obj;
        return obj2;
    }

    public final int t(int i10) {
        Object[] objArr = this.f8645b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[k()]);
    }

    public final void u() {
        ((AbstractList) this).modCount++;
    }

    public k(Collection collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.f8645b = array;
        this.f8646c = array.length;
        if (array.length == 0) {
            this.f8645b = f8643d;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.f(array, "array");
        int length = array.length;
        int i10 = this.f8646c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.m.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iT = t(this.f8646c + this.f8644a);
        int i11 = this.f8644a;
        if (i11 < iT) {
            m.m0(this.f8645b, i11, array, iT, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f8645b;
            m.k0(objArr, 0, array, this.f8644a, objArr.length);
            Object[] objArr2 = this.f8645b;
            m.k0(objArr2, objArr2.length - this.f8644a, array, 0, iT);
        }
        int i12 = this.f8646c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        u();
        p(elements.size() + k());
        o(t(k() + this.f8644a), elements);
        return true;
    }
}
