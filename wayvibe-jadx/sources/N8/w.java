package N8;

import D7.W;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8655a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f8656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8657c;

    public w(Iterator iterator) {
        kotlin.jvm.internal.m.f(iterator, "iterator");
        this.f8656b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f8655a) {
            case 0:
                return this.f8656b.hasNext();
            case 1:
                break;
            default:
                return this.f8657c > 0 && this.f8656b.hasNext();
        }
        while (true) {
            int i10 = this.f8657c;
            it = this.f8656b;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f8657c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f8655a) {
            case 0:
                int i10 = this.f8657c;
                this.f8657c = i10 + 1;
                if (i10 >= 0) {
                    return new v(i10, this.f8656b.next());
                }
                W.k0();
                throw null;
            case 1:
                break;
            default:
                int i11 = this.f8657c;
                if (i11 == 0) {
                    throw new NoSuchElementException();
                }
                this.f8657c = i11 - 1;
                return this.f8656b.next();
        }
        while (true) {
            int i12 = this.f8657c;
            it = this.f8656b;
            if (i12 > 0 && it.hasNext()) {
                it.next();
                this.f8657c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8655a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(p085h9.b bVar, byte b10) {
        this.f8657c = bVar.f20343c;
        this.f8656b = bVar.f20342b.iterator();
    }

    public w(p085h9.b bVar) {
        this.f8656b = bVar.f20342b.iterator();
        this.f8657c = bVar.f20343c;
    }
}
