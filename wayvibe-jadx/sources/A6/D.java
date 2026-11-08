package A6;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f298e;

    public D(E e2, int i10, int i11) {
        this.f298e = e2;
        this.f296c = i10;
        this.f297d = i11;
    }

    @Override // A6.E, java.util.List
    /* JADX INFO: renamed from: A */
    public final E subList(int i10, int i11) {
        p229v9.a.m(i10, i11, this.f297d);
        int i12 = this.f296c;
        return this.f298e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p229v9.a.j(i10, this.f297d);
        return this.f298e.get(i10 + this.f296c);
    }

    @Override // A6.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // A6.AbstractC0100z
    public final Object[] k() {
        return this.f298e.k();
    }

    @Override // A6.E, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // A6.AbstractC0100z
    public final int m() {
        return this.f298e.n() + this.f296c + this.f297d;
    }

    @Override // A6.AbstractC0100z
    public final int n() {
        return this.f298e.n() + this.f296c;
    }

    @Override // A6.AbstractC0100z
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f297d;
    }

    @Override // A6.E, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
