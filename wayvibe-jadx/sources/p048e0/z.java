package p048e0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p013a9.a;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f19556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f19557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f19559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry f19560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19561f;

    public z(v vVar, Iterator it, int i10) {
        this.f19561f = i10;
        this.f19556a = vVar;
        this.f19557b = it;
        this.f19558c = vVar.a().f19528d;
        a();
    }

    public final void a() {
        this.f19559d = this.f19560e;
        Iterator it = this.f19557b;
        this.f19560e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19560e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19561f) {
            case 0:
                a();
                if (this.f19559d != null) {
                    return new y(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f19560e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f19560e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        v vVar = this.f19556a;
        if (vVar.a().f19528d != this.f19558c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f19559d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        vVar.remove(entry.getKey());
        this.f19559d = null;
        this.f19558c = vVar.a().f19528d;
    }
}
