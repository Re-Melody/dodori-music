package A6;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class C extends k0 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f295c;

    public C(E e2, int i10) {
        int size = e2.size();
        p229v9.a.l(i10, size);
        this.f293a = size;
        this.f294b = i10;
        this.f295c = e2;
    }

    public final Object a(int i10) {
        return this.f295c.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f294b < this.f293a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f294b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f294b;
        this.f294b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f294b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f294b - 1;
        this.f294b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f294b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
