package com.revenuecat.purchases.ui.revenuecatui.helpers;

import B2.AbstractC0112b;
import N8.n;
import N8.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class NonEmptySet<A> implements Set<A>, a {
    public static final int $stable = 8;
    private final Set<A> all;
    private final A head;

    /* JADX WARN: Multi-variable type inference failed */
    private NonEmptySet(A a10, Set<? extends A> set) {
        this.head = a10;
        this.all = set;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(A a10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.all.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        m.f(elements, "elements");
        return this.all.containsAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof NonEmptySet ? m.b(this.all, ((NonEmptySet) obj).all) : m.b(this.all, obj);
    }

    public final /* synthetic */ Object getHead() {
        return this.head;
    }

    public int getSize() {
        return this.all.size();
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.all.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<A> iterator() {
        return this.all.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return l.a(this);
    }

    public final /* synthetic */ Set toSet() {
        return this.all;
    }

    public String toString() {
        return AbstractC0112b.j(new StringBuilder("NonEmptySet("), n.H0(this.all, null, null, null, null, 63), ')');
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        m.f(array, "array");
        return (T[]) l.b(this, array);
    }

    public NonEmptySet(A a10, Iterable<? extends A> rest) {
        m.f(rest, "rest");
        Set setB1 = n.b1(rest);
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.e0(setB1.size() + 1));
        linkedHashSet.addAll(setB1);
        linkedHashSet.add(a10);
        this((Object) a10, (Set) linkedHashSet);
    }
}
