package N8;

import B2.AbstractC0112b;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: N8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0646c extends M8.t implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f8637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0646c(e eVar, int i10) {
        super(eVar, 4);
        this.f8637d = eVar;
        int iK = eVar.k();
        if (i10 < 0 || i10 > iK) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("index: ", i10, iK, ", size: "));
        }
        this.f8428b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8428b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8428b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8428b - 1;
        this.f8428b = i10;
        return this.f8637d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8428b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
