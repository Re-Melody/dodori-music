package p172q;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f25371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25372b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f25373c;

    public d(f fVar) {
        this.f25373c = fVar;
    }

    @Override // p172q.e
    public final void a(c cVar) {
        c cVar2 = this.f25371a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f25370d;
            this.f25371a = cVar3;
            this.f25372b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f25372b) {
            return this.f25373c.f25374a != null;
        }
        c cVar = this.f25371a;
        return (cVar == null || cVar.f25369c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f25372b) {
            this.f25372b = false;
            this.f25371a = this.f25373c.f25374a;
        } else {
            c cVar = this.f25371a;
            this.f25371a = cVar != null ? cVar.f25369c : null;
        }
        return this.f25371a;
    }
}
