package p044d7;

import java.util.Comparator;
import java.util.Iterator;
import p170p7.h;
import p170p7.n;

/* JADX INFO: loaded from: classes.dex */
public final class m extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f19312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f19313b;

    public m(i iVar, Comparator comparator) {
        this.f19312a = iVar;
        this.f19313b = comparator;
    }

    @Override // p044d7.c
    public final boolean a(Object obj) {
        return n(obj) != null;
    }

    @Override // p044d7.c
    public final Object c(h hVar) {
        i iVarN = n(hVar);
        if (iVarN != null) {
            return iVarN.getValue();
        }
        return null;
    }

    @Override // p044d7.c
    public final Comparator d() {
        return this.f19313b;
    }

    @Override // p044d7.c
    public final Object f() {
        return this.f19312a.g().getKey();
    }

    @Override // p044d7.c
    public final Object h() {
        return this.f19312a.e().getKey();
    }

    @Override // p044d7.c
    public final int i(n nVar) {
        i iVarC = this.f19312a;
        int i10 = 0;
        while (!iVarC.isEmpty()) {
            int iCompare = this.f19313b.compare(nVar, iVarC.getKey());
            if (iCompare == 0) {
                return iVarC.c().size() + i10;
            }
            if (iCompare < 0) {
                iVarC = iVarC.c();
            } else {
                int size = iVarC.c().size() + 1 + i10;
                iVarC = iVarC.n();
                i10 = size;
            }
        }
        return -1;
    }

    @Override // p044d7.c
    public final boolean isEmpty() {
        return this.f19312a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f19312a, null, this.f19313b);
    }

    @Override // p044d7.c
    public final c j(Object obj, Object obj2) {
        i iVar = this.f19312a;
        Comparator comparator = this.f19313b;
        return new m(((k) iVar.a(obj, obj2, comparator)).f(h.BLACK, null, null), comparator);
    }

    @Override // p044d7.c
    public final Iterator k(Object obj) {
        return new d(this.f19312a, obj, this.f19313b);
    }

    @Override // p044d7.c
    public final c m(Object obj) {
        if (!a(obj)) {
            return this;
        }
        i iVar = this.f19312a;
        Comparator comparator = this.f19313b;
        return new m(iVar.b(obj, comparator).f(h.BLACK, null, null), comparator);
    }

    public final i n(Object obj) {
        i iVarC = this.f19312a;
        while (!iVarC.isEmpty()) {
            int iCompare = this.f19313b.compare(obj, iVarC.getKey());
            if (iCompare < 0) {
                iVarC = iVarC.c();
            } else {
                if (iCompare == 0) {
                    return iVarC;
                }
                iVarC = iVarC.n();
            }
        }
        return null;
    }

    @Override // p044d7.c
    public final int size() {
        return this.f19312a.size();
    }
}
