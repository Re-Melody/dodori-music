package p064f9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19891d;

    public b(char c3, char c9, int i10) {
        this.f19888a = i10;
        this.f19889b = c9;
        boolean z10 = false;
        if (i10 <= 0 ? m.g(c3, c9) >= 0 : m.g(c3, c9) <= 0) {
            z10 = true;
        }
        this.f19890c = z10;
        this.f19891d = z10 ? c3 : c9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19890c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f19891d;
        if (i10 != this.f19889b) {
            this.f19891d = this.f19888a + i10;
        } else {
            if (!this.f19890c) {
                throw new NoSuchElementException();
            }
            this.f19890c = false;
        }
        return Character.valueOf((char) i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
