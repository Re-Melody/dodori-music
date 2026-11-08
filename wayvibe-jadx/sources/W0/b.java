package W0;

import B2.AbstractC0112b;
import N8.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, p013a9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12771c = new b(s.f8650a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12773b;

    public b(List list) {
        this.f12772a = list;
        this.f12773b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f12772a.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f12772a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.b(this.f12772a, ((b) obj).f12772a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f12772a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12772a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f12772a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12773b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return AbstractC0112b.m(new StringBuilder("LocaleList(localeList="), this.f12772a, ')');
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return l.b(this, objArr);
    }
}
