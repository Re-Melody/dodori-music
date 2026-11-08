package Q8;

import B2.AbstractC0112b;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f10593b;

    public c(g element, i left) {
        m.f(left, "left");
        m.f(element, "element");
        this.f10592a = left;
        this.f10593b = element;
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                i iVar = cVar2.f10592a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f10592a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f10593b;
                    if (!m.b(cVar.get(gVar.getKey()), gVar)) {
                        zB = false;
                        break;
                    }
                    i iVar3 = cVar4.f10592a;
                    if (!(iVar3 instanceof c)) {
                        m.d(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        zB = m.b(cVar.get(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Q8.i
    public final Object fold(Object obj, Z8.e eVar) {
        return eVar.invoke(this.f10592a.fold(obj, eVar), this.f10593b);
    }

    @Override // Q8.i
    public final g get(h key) {
        m.f(key, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f10593b.get(key);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f10592a;
            if (!(iVar instanceof c)) {
                return iVar.get(key);
            }
            cVar = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.f10593b.hashCode() + this.f10592a.hashCode();
    }

    @Override // Q8.i
    public final i minusKey(h key) {
        m.f(key, "key");
        g gVar = this.f10593b;
        g gVar2 = gVar.get(key);
        i iVar = this.f10592a;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(key);
        if (iVarMinusKey == iVar) {
            return this;
        }
        return iVarMinusKey == j.f10595a ? gVar : new c(gVar, iVarMinusKey);
    }

    @Override // Q8.i
    public final i plus(i context) {
        m.f(context, "context");
        return context == j.f10595a ? this : (i) context.fold(this, new b(1));
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("["), (String) fold("", new b(0)), ']');
    }
}
