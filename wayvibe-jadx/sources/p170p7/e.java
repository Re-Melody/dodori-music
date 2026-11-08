package p170p7;

import java.util.ArrayList;
import java.util.List;
import p207t7.u;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25258a;

    public e(List list) {
        this.f25258a = list;
    }

    public final e a(String str) {
        ArrayList arrayList = new ArrayList(this.f25258a);
        arrayList.add(str);
        return e(arrayList);
    }

    public final e b(e eVar) {
        ArrayList arrayList = new ArrayList(this.f25258a);
        arrayList.addAll(eVar.f25258a);
        return e(arrayList);
    }

    public abstract String c();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        int size = this.f25258a.size();
        int size2 = eVar.f25258a.size();
        for (int i10 = 0; i10 < size && i10 < size2; i10++) {
            String strG = g(i10);
            String strG2 = eVar.g(i10);
            int iCompare = 1;
            boolean z10 = strG.startsWith("__id") && strG.endsWith("__");
            boolean z11 = strG2.startsWith("__id") && strG2.endsWith("__");
            if (z10 && !z11) {
                iCompare = -1;
            } else if (z10 || !z11) {
                iCompare = (z10 && z11) ? Long.compare(Long.parseLong(strG.substring(4, strG.length() - 2)), Long.parseLong(strG2.substring(4, strG2.length() - 2))) : u.f(strG, strG2);
            }
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return u.d(size, size2);
    }

    public abstract e e(List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public final String f() {
        List list = this.f25258a;
        return (String) list.get(list.size() - 1);
    }

    public final String g(int i10) {
        return (String) this.f25258a.get(i10);
    }

    public final boolean h() {
        return this.f25258a.size() == 0;
    }

    public final int hashCode() {
        return this.f25258a.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public final boolean i(e eVar) {
        List list = this.f25258a;
        if (list.size() <= eVar.f25258a.size()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (g(i10).equals(eVar.g(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public final e j() {
        List list = this.f25258a;
        int size = list.size();
        c.z("Can't call popFirst with count > length() (%d > %d)", size >= 5, 5, Integer.valueOf(size));
        return new p(list.subList(5, size));
    }

    public final e k() {
        List list = this.f25258a;
        return e(list.subList(0, list.size() - 1));
    }

    public final String toString() {
        return c();
    }
}
