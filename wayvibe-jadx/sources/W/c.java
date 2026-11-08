package W;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ListIterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12755b;

    public c(int i10, List list) {
        this.f12754a = list;
        this.f12755b = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f12754a.add(this.f12755b, obj);
        this.f12755b++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12755b < this.f12754a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12755b > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f12755b;
        this.f12755b = i10 + 1;
        return this.f12754a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12755b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f12755b - 1;
        this.f12755b = i10;
        return this.f12754a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12755b - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f12755b - 1;
        this.f12755b = i10;
        this.f12754a.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f12754a.set(this.f12755b, obj);
    }
}
