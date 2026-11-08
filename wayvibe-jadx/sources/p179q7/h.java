package p179q7;

import D7.p1;
import W6.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p170p7.k;
import p170p7.n;
import p170p7.o;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p170p7.h f25688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f25689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25690c;

    public h(p170p7.h hVar, m mVar) {
        this(hVar, mVar, new ArrayList());
    }

    public static h c(n nVar, f fVar) {
        if (!nVar.c()) {
            return null;
        }
        if (fVar != null && fVar.f25685a.isEmpty()) {
            return null;
        }
        p170p7.h hVar = nVar.f25269a;
        if (fVar == null) {
            return nVar.e() ? new e(hVar, m.f25700c) : new o(hVar, nVar.f25273e, m.f25700c, new ArrayList());
        }
        o oVar = nVar.f25273e;
        o oVar2 = new o();
        HashSet hashSet = new HashSet();
        for (k kVar : fVar.f25685a) {
            if (!hashSet.contains(kVar)) {
                if (oVar.f(kVar) == null && kVar.f25258a.size() > 1) {
                    kVar = (k) kVar.k();
                }
                oVar2.g(oVar.f(kVar), kVar);
                hashSet.add(kVar);
            }
        }
        return new l(hVar, oVar2, new f(hashSet), m.f25700c);
    }

    public abstract f a(n nVar, f fVar, p pVar);

    public abstract void b(n nVar, j jVar);

    public abstract f d();

    public final boolean e(h hVar) {
        return this.f25688a.equals(hVar.f25688a) && this.f25689b.equals(hVar.f25689b);
    }

    public final int f() {
        return this.f25689b.hashCode() + (this.f25688a.f25264a.hashCode() * 31);
    }

    public final String g() {
        return "key=" + this.f25688a + ", precondition=" + this.f25689b;
    }

    public final HashMap h(p pVar, n nVar) {
        List<g> list = this.f25690c;
        HashMap map = new HashMap(list.size());
        for (g gVar : list) {
            p pVar2 = gVar.f25687b;
            o oVar = nVar.f25273e;
            k kVar = gVar.f25686a;
            map.put(kVar, pVar2.c(oVar.f(kVar), pVar));
        }
        return map;
    }

    public final HashMap i(n nVar, ArrayList arrayList) {
        List list = this.f25690c;
        HashMap map = new HashMap(list.size());
        c.z("server transform count (%d) should match field transform count (%d)", list.size() == arrayList.size(), Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g gVar = (g) list.get(i10);
            p pVar = gVar.f25687b;
            o oVar = nVar.f25273e;
            k kVar = gVar.f25686a;
            map.put(kVar, pVar.b(oVar.f(kVar), (p1) arrayList.get(i10)));
        }
        return map;
    }

    public final void j(n nVar) {
        c.z("Can only apply a mutation to a document with the same key", nVar.f25269a.equals(this.f25688a), new Object[0]);
    }

    public h(p170p7.h hVar, m mVar, List list) {
        this.f25688a = hVar;
        this.f25689b = mVar;
        this.f25690c = list;
    }
}
