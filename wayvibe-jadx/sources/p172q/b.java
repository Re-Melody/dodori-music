package p172q;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f25364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f25365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25366c;

    public b(c cVar, c cVar2, int i10) {
        this.f25366c = i10;
        this.f25364a = cVar2;
        this.f25365b = cVar;
    }

    @Override // p172q.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f25364a == cVar && cVar == this.f25365b) {
            this.f25365b = null;
            this.f25364a = null;
        }
        c cVar3 = this.f25364a;
        if (cVar3 == cVar) {
            switch (this.f25366c) {
                case 0:
                    cVar2 = cVar3.f25370d;
                    break;
                default:
                    cVar2 = cVar3.f25369c;
                    break;
            }
            this.f25364a = cVar2;
        }
        c cVar4 = this.f25365b;
        if (cVar4 == cVar) {
            c cVar5 = this.f25364a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f25365b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f25366c) {
            case 0:
                return cVar.f25369c;
            default:
                return cVar.f25370d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25365b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f25365b;
        c cVar2 = this.f25364a;
        this.f25365b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
