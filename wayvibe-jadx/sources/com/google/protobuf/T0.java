package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends AbstractList implements InterfaceC1233b0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1231a0 f18702a;

    public T0(C1231a0 c1231a0) {
        this.f18702a = c1231a0;
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final void b(AbstractC1252l abstractC1252l) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final List g() {
        return Collections.unmodifiableList(this.f18702a.f18727b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f18702a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        S0 s8 = new S0();
        s8.f18701a = this.f18702a.iterator();
        return s8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        R0 r10 = new R0();
        r10.f18700a = this.f18702a.listIterator(i10);
        return r10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18702a.f18727b.size();
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final Object w(int i10) {
        return this.f18702a.f18727b.get(i10);
    }

    @Override // com.google.protobuf.InterfaceC1233b0
    public final InterfaceC1233b0 v() {
        return this;
    }
}
