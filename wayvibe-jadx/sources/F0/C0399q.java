package F0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: F0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0399q implements ListIterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3824e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0399q(C0400s c0400s, int i10, int i11) {
        this(c0400s, (i11 & 1) != 0 ? 0 : i10, 0, c0400s.f3839d);
        this.f3820a = 0;
    }

    public void a() {
        if (((AbstractList) ((O8.a) this.f3824e).f9338e).modCount != this.f3823d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f3820a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i10 = this.f3821b;
                this.f3821b = i10 + 1;
                O8.a aVar = (O8.a) this.f3824e;
                aVar.add(i10, obj);
                this.f3822c = -1;
                this.f3823d = ((AbstractList) aVar).modCount;
                return;
            case 2:
                b();
                int i11 = this.f3821b;
                this.f3821b = i11 + 1;
                O8.b bVar = (O8.b) this.f3824e;
                bVar.add(i11, obj);
                this.f3822c = -1;
                this.f3823d = ((AbstractList) bVar).modCount;
                return;
            default:
                c();
                int i12 = this.f3821b + 1;
                p048e0.s sVar = (p048e0.s) this.f3824e;
                sVar.add(i12, obj);
                this.f3822c = -1;
                this.f3821b++;
                this.f3823d = sVar.c();
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((O8.b) this.f3824e)).modCount != this.f3823d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((p048e0.s) this.f3824e).c() != this.f3823d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3820a) {
            case 0:
                return this.f3821b < this.f3823d;
            case 1:
                return this.f3821b < ((O8.a) this.f3824e).f9336c;
            case 2:
                return this.f3821b < ((O8.b) this.f3824e).f9341b;
            default:
                return this.f3821b < ((p048e0.s) this.f3824e).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3820a) {
            case 0:
                return this.f3821b > this.f3822c;
            case 1:
                return this.f3821b > 0;
            case 2:
                return this.f3821b > 0;
            default:
                return this.f3821b >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3820a) {
            case 0:
                Object[] objArr = ((C0400s) this.f3824e).f3836a;
                int i10 = this.f3821b;
                this.f3821b = i10 + 1;
                Object obj = objArr[i10];
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (p067g0.q) obj;
            case 1:
                a();
                int i11 = this.f3821b;
                O8.a aVar = (O8.a) this.f3824e;
                if (i11 >= aVar.f9336c) {
                    throw new NoSuchElementException();
                }
                this.f3821b = i11 + 1;
                this.f3822c = i11;
                return aVar.f9334a[aVar.f9335b + i11];
            case 2:
                b();
                int i12 = this.f3821b;
                O8.b bVar = (O8.b) this.f3824e;
                if (i12 >= bVar.f9341b) {
                    throw new NoSuchElementException();
                }
                this.f3821b = i12 + 1;
                this.f3822c = i12;
                return bVar.f9340a[i12];
            default:
                c();
                int i13 = this.f3821b + 1;
                this.f3822c = i13;
                p048e0.s sVar = (p048e0.s) this.f3824e;
                p048e0.t.a(i13, sVar.size());
                Object obj2 = sVar.get(i13);
                this.f3821b = i13;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3820a) {
            case 0:
                return this.f3821b - this.f3822c;
            case 1:
                return this.f3821b;
            case 2:
                return this.f3821b;
            default:
                return this.f3821b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3820a) {
            case 0:
                Object[] objArr = ((C0400s) this.f3824e).f3836a;
                int i10 = this.f3821b - 1;
                this.f3821b = i10;
                Object obj = objArr[i10];
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (p067g0.q) obj;
            case 1:
                a();
                int i11 = this.f3821b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f3821b = i12;
                this.f3822c = i12;
                O8.a aVar = (O8.a) this.f3824e;
                return aVar.f9334a[aVar.f9335b + i12];
            case 2:
                b();
                int i13 = this.f3821b;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.f3821b = i14;
                this.f3822c = i14;
                return ((O8.b) this.f3824e).f9340a[i14];
            default:
                c();
                int i15 = this.f3821b;
                p048e0.s sVar = (p048e0.s) this.f3824e;
                p048e0.t.a(i15, sVar.size());
                int i16 = this.f3821b;
                this.f3822c = i16;
                Object obj2 = sVar.get(i16);
                this.f3821b--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f3820a) {
            case 0:
                return (this.f3821b - this.f3822c) - 1;
            case 1:
                return this.f3821b - 1;
            case 2:
                return this.f3821b - 1;
            default:
                return this.f3821b;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f3820a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i10 = this.f3822c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                O8.a aVar = (O8.a) this.f3824e;
                aVar.n(i10);
                this.f3821b = this.f3822c;
                this.f3822c = -1;
                this.f3823d = ((AbstractList) aVar).modCount;
                return;
            case 2:
                b();
                int i11 = this.f3822c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                O8.b bVar = (O8.b) this.f3824e;
                bVar.n(i11);
                this.f3821b = this.f3822c;
                this.f3822c = -1;
                this.f3823d = ((AbstractList) bVar).modCount;
                return;
            default:
                c();
                int i12 = this.f3821b;
                p048e0.s sVar = (p048e0.s) this.f3824e;
                sVar.remove(i12);
                this.f3821b--;
                this.f3822c = -1;
                this.f3823d = sVar.c();
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f3820a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i10 = this.f3822c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((O8.a) this.f3824e).set(i10, obj);
                return;
            case 2:
                b();
                int i11 = this.f3822c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((O8.b) this.f3824e).set(i11, obj);
                return;
            default:
                c();
                int i12 = this.f3822c;
                if (i12 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                p048e0.s sVar = (p048e0.s) this.f3824e;
                sVar.set(i12, obj);
                this.f3823d = sVar.c();
                return;
        }
    }

    public C0399q(C0400s c0400s, int i10, int i11, int i12) {
        this.f3820a = 0;
        this.f3824e = c0400s;
        this.f3821b = i10;
        this.f3822c = i11;
        this.f3823d = i12;
    }

    public C0399q(O8.b bVar, int i10) {
        this.f3820a = 2;
        this.f3824e = bVar;
        this.f3821b = i10;
        this.f3822c = -1;
        this.f3823d = ((AbstractList) bVar).modCount;
    }

    public C0399q(p048e0.s sVar, int i10) {
        this.f3820a = 3;
        this.f3824e = sVar;
        this.f3821b = i10 - 1;
        this.f3822c = -1;
        this.f3823d = sVar.c();
    }

    public C0399q(O8.a aVar, int i10) {
        this.f3820a = 1;
        this.f3824e = aVar;
        this.f3821b = i10;
        this.f3822c = -1;
        this.f3823d = ((AbstractList) aVar).modCount;
    }
}
