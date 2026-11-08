package p170p7;

import E3.d;
import java.util.Collections;
import java.util.List;
import p044d7.e;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f25262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f25263c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f25264a;

    static {
        d dVar = new d(27);
        f25262b = dVar;
        f25263c = new e(Collections.EMPTY_LIST, dVar);
    }

    public h(p pVar) {
        c.z("Not a document key path: %s", e(pVar), pVar);
        this.f25264a = pVar;
    }

    public static h b() {
        List list = Collections.EMPTY_LIST;
        p pVar = p.f25277b;
        return new h(list.isEmpty() ? p.f25277b : new p(list));
    }

    public static h c(String str) {
        p pVarL = p.l(str);
        boolean z10 = false;
        if (pVarL.f25258a.size() > 4 && pVarL.g(0).equals("projects") && pVarL.g(2).equals("databases") && pVarL.g(4).equals("documents")) {
            z10 = true;
        }
        c.z("Tried to parse an invalid key: %s", z10, pVarL);
        return new h((p) pVarL.j());
    }

    public static boolean e(p pVar) {
        return pVar.f25258a.size() % 2 == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        return this.f25264a.compareTo(hVar.f25264a);
    }

    public final p d() {
        return (p) this.f25264a.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f25264a.equals(((h) obj).f25264a);
    }

    public final int hashCode() {
        return this.f25264a.hashCode();
    }

    public final String toString() {
        return this.f25264a.c();
    }
}
