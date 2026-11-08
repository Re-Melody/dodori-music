package N8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: N8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0645b implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8636b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f8635a;
        if (i10 == 0) {
            this.f8635a = 3;
            a();
            return this.f8635a == 1;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f8635a;
        if (i10 == 1) {
            this.f8635a = 0;
            return this.f8636b;
        }
        if (i10 != 2) {
            this.f8635a = 3;
            a();
            if (this.f8635a == 1) {
                this.f8635a = 0;
                return this.f8636b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
