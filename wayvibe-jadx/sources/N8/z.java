package N8;

import D7.W;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements ListIterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8658a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8660c;

    public z(A a10, int i10) {
        this.f8660c = a10;
        this.f8659b = a10.f8620a.listIterator(n.t0(a10, i10));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8658a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f8659b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8658a) {
            case 0:
                return ((ListIterator) this.f8659b).hasPrevious();
            default:
                return ((kotlin.jvm.internal.w) this.f8659b).f21871a < ((p048e0.D) this.f8660c).f19458d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8658a) {
            case 0:
                return ((ListIterator) this.f8659b).hasNext();
            default:
                return ((kotlin.jvm.internal.w) this.f8659b).f21871a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8658a) {
            case 0:
                return ((ListIterator) this.f8659b).previous();
            default:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f8659b;
                int i10 = wVar.f21871a + 1;
                p048e0.D d10 = (p048e0.D) this.f8660c;
                p048e0.t.a(i10, d10.f19458d);
                wVar.f21871a = i10;
                return d10.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8658a) {
            case 0:
                return W.G((A) this.f8660c) - ((ListIterator) this.f8659b).previousIndex();
            default:
                return ((kotlin.jvm.internal.w) this.f8659b).f21871a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8658a) {
            case 0:
                return ((ListIterator) this.f8659b).next();
            default:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f8659b;
                int i10 = wVar.f21871a;
                p048e0.D d10 = (p048e0.D) this.f8660c;
                p048e0.t.a(i10, d10.f19458d);
                wVar.f21871a = i10 - 1;
                return d10.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f8658a) {
            case 0:
                return W.G((A) this.f8660c) - ((ListIterator) this.f8659b).nextIndex();
            default:
                return ((kotlin.jvm.internal.w) this.f8659b).f21871a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8658a) {
            case 0:
                ((ListIterator) this.f8659b).remove();
                return;
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8658a) {
            case 0:
                ((ListIterator) this.f8659b).set(obj);
                return;
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public z(kotlin.jvm.internal.w wVar, p048e0.D d10) {
        this.f8659b = wVar;
        this.f8660c = d10;
    }
}
