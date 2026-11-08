package A6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f380a;

    public j0(Iterator it) {
        it.getClass();
        this.f380a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f380a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f380a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f380a.remove();
    }
}
