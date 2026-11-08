package p199t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2229d implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2230e f26282a;

    public C2229d(C2230e c2230e) {
        this.f26282a = c2230e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f26282a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f26282a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f26282a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2226a(this.f26282a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2230e c2230e = this.f26282a;
        int iA = c2230e.a(obj);
        if (iA < 0) {
            return false;
        }
        c2230e.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2230e c2230e = this.f26282a;
        int i10 = c2230e.f26268c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (collection.contains(c2230e.j(i11))) {
                c2230e.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2230e c2230e = this.f26282a;
        int i10 = c2230e.f26268c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (!collection.contains(c2230e.j(i11))) {
                c2230e.h(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f26282a.f26268c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2230e c2230e = this.f26282a;
        int i10 = c2230e.f26268c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c2230e.j(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2230e c2230e = this.f26282a;
        int i10 = c2230e.f26268c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c2230e.j(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
