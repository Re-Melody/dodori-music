package Z;

import java.util.Iterator;
import java.util.Map;
import p200t0.F;
import p200t0.H;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13432a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f13433b;

    public h(e eVar) {
        n[] nVarArr = new n[8];
        for (int i10 = 0; i10 < 8; i10++) {
            nVarArr[i10] = new p(this);
        }
        this.f13433b = new f(eVar, nVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13432a) {
            case 0:
                return ((f) this.f13433b).f13419c;
            default:
                return this.f13433b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13432a) {
            case 0:
                return (Map.Entry) ((f) this.f13433b).next();
            default:
                return (H) this.f13433b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13432a) {
            case 0:
                ((f) this.f13433b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(F f10) {
        this.f13433b = f10.f26394j.iterator();
    }
}
