package F0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: F0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0400s implements List, p013a9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3839d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f3836a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f3837b = new long[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3838c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3840e = true;

    public final long a() {
        long jA = AbstractC0388f.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f3838c + 1;
        int iG = D7.W.G(this);
        if (i10 <= iG) {
            while (true) {
                long j10 = this.f3837b[i10];
                if (AbstractC0388f.h(j10, jA) < 0) {
                    jA = j10;
                }
                if (Float.intBitsToFloat((int) (jA >> 32)) < 0.0f && ((int) (4294967295L & jA)) != 0) {
                    return jA;
                }
                if (i10 != iG) {
                    i10++;
                }
            }
        }
        return jA;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c(p067g0.q qVar, float f10, boolean z10, Z8.a aVar) {
        int i10 = this.f3838c;
        int i11 = i10 + 1;
        this.f3838c = i11;
        Object[] objArr = this.f3836a;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f3836a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f3837b, length);
            kotlin.jvm.internal.m.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f3837b = jArrCopyOf;
        }
        Object[] objArr2 = this.f3836a;
        int i12 = this.f3838c;
        objArr2[i12] = qVar;
        this.f3837b[i12] = AbstractC0388f.a(f10, z10);
        d();
        aVar.invoke();
        this.f3838c = i10;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f3838c = -1;
        d();
        this.f3840e = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof p067g0.q) && indexOf((p067g0.q) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((p067g0.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        int i10 = this.f3838c + 1;
        int iG = D7.W.G(this);
        if (i10 <= iG) {
            while (true) {
                this.f3836a[i10] = null;
                if (i10 == iG) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f3839d = this.f3838c + 1;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f3836a[i10];
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (p067g0.q) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof p067g0.q)) {
            return -1;
        }
        p067g0.q qVar = (p067g0.q) obj;
        int iG = D7.W.G(this);
        if (iG >= 0) {
            int i10 = 0;
            while (!kotlin.jvm.internal.m.b(this.f3836a[i10], qVar)) {
                if (i10 != iG) {
                    i10++;
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3839d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0399q(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof p067g0.q)) {
            return -1;
        }
        p067g0.q qVar = (p067g0.q) obj;
        for (int iG = D7.W.G(this); -1 < iG; iG--) {
            if (kotlin.jvm.internal.m.b(this.f3836a[iG], qVar)) {
                return iG;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0399q(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3839d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return new r(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C0399q(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.b(this, objArr);
    }
}
