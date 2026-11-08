package A6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: A6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0080e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f363a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f366d;

    public C0080e(C0089n c0089n) {
        this.f366d = c0089n;
        Collection collection = c0089n.f386b;
        this.f365c = collection;
        this.f364b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C0089n c0089n = (C0089n) this.f366d;
        c0089n.c();
        if (c0089n.f386b != ((Collection) this.f365c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f363a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f364b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f363a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f364b.next();
                this.f365c = (Collection) entry.getValue();
                return ((C0081f) this.f366d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f364b.next();
                this.f365c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f364b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f363a) {
            case 0:
                p229v9.a.o("no calls to next() since the last call to remove()", ((Collection) this.f365c) != null);
                this.f364b.remove();
                C0081f c0081f = (C0081f) this.f366d;
                c0081f.f372d.f324e -= ((Collection) this.f365c).size();
                ((Collection) this.f365c).clear();
                this.f365c = null;
                break;
            case 1:
                p229v9.a.o("no calls to next() since the last call to remove()", ((Map.Entry) this.f365c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f365c).getValue();
                this.f364b.remove();
                C0082g c0082g = (C0082g) this.f366d;
                c0082g.f376b.f324e -= collection.size();
                collection.clear();
                this.f365c = null;
                break;
            default:
                this.f364b.remove();
                C0089n c0089n = (C0089n) this.f366d;
                c0089n.f389e.f324e--;
                c0089n.d();
                break;
        }
    }

    public C0080e(C0089n c0089n, ListIterator listIterator) {
        this.f366d = c0089n;
        this.f365c = c0089n.f386b;
        this.f364b = listIterator;
    }

    public C0080e(C0082g c0082g, Iterator it) {
        this.f366d = c0082g;
        this.f364b = it;
    }

    public C0080e(C0081f c0081f) {
        this.f366d = c0081f;
        this.f364b = c0081f.f371c.entrySet().iterator();
    }
}
