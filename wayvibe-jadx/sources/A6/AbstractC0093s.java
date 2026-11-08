package A6;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: A6.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0093s {
    public static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(((double) i10) / 0.75d) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        c(i10, "expectedSize");
        return i10 + 1;
    }

    public static void b(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(p134m1.b.j(i11, "at index "));
            }
        }
    }

    public static void c(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static boolean d(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static f0 f(Set set, p267z6.k kVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof f0)) {
                set.getClass();
                return new f0(set, kVar);
            }
            f0 f0Var = (f0) set;
            p267z6.k kVar2 = f0Var.f374b;
            kVar2.getClass();
            return new f0(f0Var.f373a, new p267z6.l(Arrays.asList(kVar2, kVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof f0)) {
            set2.getClass();
            return new g0(set2, kVar);
        }
        f0 f0Var2 = (f0) set2;
        p267z6.k kVar3 = f0Var2.f374b;
        kVar3.getClass();
        return new g0((SortedSet) f0Var2.f373a, new p267z6.l(Arrays.asList(kVar3, kVar)));
    }

    public static Object g(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object h(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int i(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static e0 j(I i10, I i11) {
        p229v9.a.k(i10, "set1");
        p229v9.a.k(i11, "set2");
        return new e0(i10, i11);
    }

    public static ArrayList k(Object... objArr) {
        int length = objArr.length;
        c(length, "arraySize");
        ArrayList arrayList = new ArrayList(R3.a.Y(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static void l(List list, p267z6.k kVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (kVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int m(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static AbstractList n(List list, p267z6.i iVar) {
        return list != null ? new N(list, iVar) : new O(list, iVar);
    }
}
