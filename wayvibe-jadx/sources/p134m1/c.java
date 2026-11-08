package p134m1;

import V0.p;
import io.flutter.plugins.firebase.firestore.C1977b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f22197e;

    public c(char[] cArr) {
        super(cArr);
        this.f22197e = new ArrayList();
    }

    public final boolean A(String str) {
        for (d dVar : this.f22197e) {
            if ((dVar instanceof e) && ((e) dVar).c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList B() {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f22197e) {
            if (dVar instanceof e) {
                arrayList.add(((e) dVar).c());
            }
        }
        return arrayList;
    }

    public final void C(String str, d dVar) {
        Iterator it = this.f22197e.iterator();
        while (it.hasNext()) {
            e eVar = (e) ((d) it.next());
            if (eVar.c().equals(str)) {
                if (eVar.f22197e.size() > 0) {
                    eVar.f22197e.set(0, dVar);
                    return;
                } else {
                    eVar.f22197e.add(dVar);
                    return;
                }
            }
        }
        e eVar2 = new e(str.toCharArray());
        eVar2.f22199b = 0L;
        eVar2.i(str.length() - 1);
        if (eVar2.f22197e.size() > 0) {
            eVar2.f22197e.set(0, dVar);
        } else {
            eVar2.f22197e.add(dVar);
        }
        this.f22197e.add(eVar2);
    }

    @Override // p134m1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f22197e.equals(((c) obj).f22197e);
        }
        return false;
    }

    @Override // p134m1.d
    public int hashCode() {
        return Objects.hash(this.f22197e, Integer.valueOf(super.hashCode()));
    }

    public final void j(d dVar) {
        this.f22197e.add(dVar);
    }

    @Override // p134m1.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = (c) super.clone();
        ArrayList arrayList = new ArrayList(this.f22197e.size());
        Iterator it = this.f22197e.iterator();
        while (it.hasNext()) {
            d dVarClone = ((d) it.next()).clone();
            dVarClone.f22201d = cVar;
            arrayList.add(dVarClone);
        }
        cVar.f22197e = arrayList;
        return cVar;
    }

    public final d m(int i10) throws C1977b {
        if (i10 < 0 || i10 >= this.f22197e.size()) {
            throw new C1977b(b.j(i10, "no element at index "), this);
        }
        return (d) this.f22197e.get(i10);
    }

    public final d n(String str) throws C1977b {
        Iterator it = this.f22197e.iterator();
        while (it.hasNext()) {
            e eVar = (e) ((d) it.next());
            if (eVar.c().equals(str)) {
                if (eVar.f22197e.size() > 0) {
                    return (d) eVar.f22197e.get(0);
                }
                return null;
            }
        }
        throw new C1977b(p.o("no element for key <", str, ">"), this);
    }

    public final float o(int i10) throws C1977b {
        d dVarM = m(i10);
        if (dVarM != null) {
            return dVarM.d();
        }
        throw new C1977b(b.j(i10, "no float at index "), this);
    }

    public final float p(String str) throws C1977b {
        d dVarN = n(str);
        if (dVarN != null) {
            return dVarN.d();
        }
        StringBuilder sbU = p.u("no float found for key <", str, ">, found [");
        sbU.append(dVarN.h());
        sbU.append("] : ");
        sbU.append(dVarN);
        throw new C1977b(sbU.toString(), this);
    }

    public final int r(int i10) throws C1977b {
        d dVarM = m(i10);
        if (dVarM != null) {
            return dVarM.f();
        }
        throw new C1977b(b.j(i10, "no int at index "), this);
    }

    public final d s(int i10) {
        if (i10 < 0 || i10 >= this.f22197e.size()) {
            return null;
        }
        return (d) this.f22197e.get(i10);
    }

    public final d t(String str) {
        Iterator it = this.f22197e.iterator();
        while (it.hasNext()) {
            e eVar = (e) ((d) it.next());
            if (eVar.c().equals(str)) {
                if (eVar.f22197e.size() <= 0) {
                    break;
                }
                return (d) eVar.f22197e.get(0);
            }
        }
        return null;
    }

    @Override // p134m1.d
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (d dVar : this.f22197e) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(dVar);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final String u(int i10) throws C1977b {
        d dVarM = m(i10);
        if (dVarM instanceof i) {
            return dVarM.c();
        }
        throw new C1977b(b.j(i10, "no string at index "), this);
    }

    public final String y(String str) throws C1977b {
        d dVarN = n(str);
        if (dVarN instanceof i) {
            return dVarN.c();
        }
        StringBuilder sbQ = b.q("no string found for key <", str, ">, found [", dVarN != null ? dVarN.h() : null, "] : ");
        sbQ.append(dVarN);
        throw new C1977b(sbQ.toString(), this);
    }

    public final String z(String str) {
        d dVarT = t(str);
        if (dVarT instanceof i) {
            return dVarT.c();
        }
        return null;
    }
}
