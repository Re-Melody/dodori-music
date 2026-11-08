package p085h9;

import java.util.Iterator;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f20363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f20364b;

    public m(g gVar) {
        this.f20364b = gVar;
        this.f20363a = gVar.f20354b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20363a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f20364b.f20355c.invoke(this.f20363a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
