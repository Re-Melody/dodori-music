package p064f9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19898d;

    public f(int i10, int i11, int i12) {
        this.f19895a = i12;
        this.f19896b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f19897c = z10;
        this.f19898d = z10 ? i10 : i11;
    }

    public final int a() {
        int i10 = this.f19898d;
        if (i10 != this.f19896b) {
            this.f19898d = this.f19895a + i10;
            return i10;
        }
        if (!this.f19897c) {
            throw new NoSuchElementException();
        }
        this.f19897c = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19897c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
