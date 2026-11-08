package O6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f9247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f9248b;

    public D(Iterator it, Iterator it2) {
        this.f9247a = it;
        this.f9248b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9247a.hasNext() || this.f9248b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f9247a;
        return it.hasNext() ? it.next() : this.f9248b.next();
    }
}
