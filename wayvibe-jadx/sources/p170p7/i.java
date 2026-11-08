package p170p7;

import java.util.Iterator;
import p044d7.c;
import p044d7.d;
import p044d7.e;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f25266b;

    public i(c cVar, e eVar) {
        this.f25265a = cVar;
        this.f25266b = eVar;
    }

    public final i a(h hVar) {
        c cVar = this.f25265a;
        n nVar = (n) cVar.c(hVar);
        return nVar == null ? this : new i(cVar.m(hVar), this.f25266b.d(nVar));
    }

    public final boolean equals(Object obj) {
        d dVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f25265a.size() != iVar.f25265a.size()) {
            return false;
        }
        Iterator it = this.f25266b.iterator();
        Iterator it2 = iVar.f25266b.iterator();
        do {
            dVar = (d) it;
            if (!((Iterator) dVar.f19302b).hasNext()) {
                return true;
            }
        } while (((n) dVar.next()).equals((n) ((d) it2).next()));
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f25266b.iterator();
        int iHashCode = 0;
        while (true) {
            d dVar = (d) it;
            if (!((Iterator) dVar.f19302b).hasNext()) {
                return iHashCode;
            }
            n nVar = (n) dVar.next();
            iHashCode = nVar.f25273e.hashCode() + ((nVar.f25269a.f25264a.hashCode() + (iHashCode * 31)) * 31);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f25266b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f25266b.iterator();
        boolean z10 = true;
        while (true) {
            d dVar = (d) it;
            if (!((Iterator) dVar.f19302b).hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            n nVar = (n) dVar.next();
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(nVar);
        }
    }
}
