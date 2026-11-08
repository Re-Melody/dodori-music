package Z;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f13443a = m.f13438e.f13442d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13445c;

    public final void a(Object[] objArr, int i10, int i11) {
        this.f13443a = objArr;
        this.f13444b = i10;
        this.f13445c = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13445c < this.f13444b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
