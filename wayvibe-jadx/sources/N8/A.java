package N8;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8620a;

    public A(List delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f8620a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f8620a.add(n.t0(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f8620a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f8620a.get(n.s0(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new z(this, 0);
    }

    @Override // N8.g
    public final int k() {
        return this.f8620a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new z(this, 0);
    }

    @Override // N8.g
    public final Object n(int i10) {
        return this.f8620a.remove(n.s0(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f8620a.set(n.s0(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new z(this, i10);
    }
}
