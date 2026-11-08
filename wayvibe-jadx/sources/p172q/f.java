package p172q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f25374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f25375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f25376c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25377d = 0;

    public c a(Object obj) {
        c cVar = this.f25374a;
        while (cVar != null && !cVar.f25367a.equals(obj)) {
            cVar = cVar.f25369c;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f25377d--;
        WeakHashMap weakHashMap = this.f25376c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.f25370d;
        if (cVar != null) {
            cVar.f25369c = cVarA.f25369c;
        } else {
            this.f25374a = cVarA.f25369c;
        }
        c cVar2 = cVarA.f25369c;
        if (cVar2 != null) {
            cVar2.f25370d = cVar;
        } else {
            this.f25375b = cVar;
        }
        cVarA.f25369c = null;
        cVarA.f25370d = null;
        return cVarA.f25368b;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f25377d != fVar.f25377d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f25374a, this.f25375b, 0);
        this.f25376c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
