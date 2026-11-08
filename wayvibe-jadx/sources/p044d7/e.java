package p044d7;

import Ca.C0168a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p160o7.C2174c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f19303a;

    public e(List list, Comparator comparator) {
        c cVarU;
        Map map = Collections.EMPTY_MAP;
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i10 = 0;
            for (Object obj : list) {
                objArr[i10] = obj;
                objArr2[i10] = map.get(obj);
                i10++;
            }
            cVarU = new b(comparator, objArr, objArr2);
        } else {
            cVarU = C0168a.u(list, map, comparator);
        }
        this.f19303a = cVarU;
    }

    public final e a(Object obj) {
        return new e(this.f19303a.j(obj, null));
    }

    public final d c(C2174c c2174c) {
        return new d(this.f19303a.k(c2174c));
    }

    public final e d(Object obj) {
        c cVar = this.f19303a;
        c cVarM = cVar.m(obj);
        return cVarM == cVar ? this : new e(cVarM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f19303a.equals(((e) obj).f19303a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19303a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f19303a.iterator());
    }

    public e(c cVar) {
        this.f19303a = cVar;
    }
}
