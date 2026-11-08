package p064f9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19903d;

    public h(long j10, long j11, long j12) {
        this.f19900a = j12;
        this.f19901b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f19902c = z10;
        this.f19903d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19902c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j10 = this.f19903d;
        if (j10 != this.f19901b) {
            this.f19903d = this.f19900a + j10;
        } else {
            if (!this.f19902c) {
                throw new NoSuchElementException();
            }
            this.f19902c = false;
        }
        return Long.valueOf(j10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
