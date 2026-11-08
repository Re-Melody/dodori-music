package N8;

import B2.AbstractC0112b;
import C.w0;
import D7.W;
import G0.C0480j1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends q {
    public static Object A0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return B0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object B0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object C0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object D0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object E0(int i10, List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final void F0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Z8.c cVar) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            org.slf4j.helpers.i.k(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void G0(List list, StringBuilder sb, w0 w0Var, int i10) {
        if ((i10 & 64) != 0) {
            w0Var = null;
        }
        F0(list, sb, "\n", "", "", "...", w0Var);
    }

    public static String H0(Iterable iterable, String str, String str2, String str3, Z8.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i10 & 2) != 0 ? "" : str2;
        String str5 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            cVar = null;
        }
        kotlin.jvm.internal.m.f(iterable, "<this>");
        kotlin.jvm.internal.m.f(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        F0(iterable, sb, str4, prefix, str5, "...", cVar);
        return sb.toString();
    }

    public static Object I0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(W.G(list));
    }

    public static Object J0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable K0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList L0(Object obj, List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList M0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        kotlin.jvm.internal.m.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            u0(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static void N0(List list, Z8.c predicate) {
        int iG;
        kotlin.jvm.internal.m.f(list, "<this>");
        kotlin.jvm.internal.m.f(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof p013a9.a) || (list instanceof p013a9.b)) {
                z0(list, predicate, true);
                return;
            } else {
                kotlin.jvm.internal.B.h(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iG2 = W.G(list);
        int i10 = 0;
        if (iG2 >= 0) {
            int i11 = 0;
            while (true) {
                Object obj = list.get(i10);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i11 != i10) {
                        list.set(i11, obj);
                    }
                    i11++;
                }
                if (i10 == iG2) {
                    break;
                } else {
                    i10++;
                }
            }
            i10 = i11;
        }
        if (i10 >= list.size() || i10 > (iG = W.G(list))) {
            return;
        }
        while (true) {
            list.remove(iG);
            if (iG == i10) {
                return;
            } else {
                iG--;
            }
        }
    }

    public static List O0(List list) {
        if (list.size() <= 1) {
            return W0(list);
        }
        List listZ0 = Z0(list);
        Collections.reverse(listZ0);
        return listZ0;
    }

    public static Object P0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List Q0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listZ0 = Z0(iterable);
            q.q0(listZ0);
            return listZ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return W0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.m.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return m.e0(array);
    }

    public static List R0(Comparator comparator, Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listZ0 = Z0(iterable);
            q.r0(listZ0, comparator);
            return listZ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return W0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.m.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return m.e0(array);
    }

    public static List S0(int i10, List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.f8650a;
        }
        if (i10 >= list.size()) {
            return W0(list);
        }
        if (i10 == 1) {
            return W.T(A0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return W.b0(arrayList);
    }

    public static byte[] T0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void U0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] V0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List W0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return W.b0(Z0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f8650a;
        }
        if (size != 1) {
            return Y0(collection);
        }
        return W.T(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] X0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static ArrayList Y0(Collection collection) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List Z0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Y0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        U0(iterable, arrayList);
        return arrayList;
    }

    public static Set a1(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        U0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set b1(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        u uVar = u.f8652a;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return R3.a.b0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(y.e0(collection.size()));
                U0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            U0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : R3.a.b0(linkedHashSet2.iterator().next());
            }
        }
        return uVar;
    }

    public static ArrayList c1(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        kotlin.jvm.internal.m.f(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(o.o0(iterable, 10), o.o0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new M8.l(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int s0(A a10, int i10) {
        if (i10 >= 0 && i10 <= W.G(a10)) {
            return W.G(a10) - i10;
        }
        StringBuilder sbP = p134m1.b.p(i10, "Element index ", " must be in range [");
        sbP.append(new p064f9.g(0, W.G(a10), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public static final int t0(A a10, int i10) {
        if (i10 >= 0 && i10 <= a10.size()) {
            return a10.size() - i10;
        }
        StringBuilder sbP = p134m1.b.p(i10, "Position index ", " must be in range [");
        sbP.append(new p064f9.g(0, a10.size(), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public static void u0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        kotlin.jvm.internal.m.f(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static C0480j1 v0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        return new C0480j1(iterable, 2);
    }

    public static boolean w0(Iterable iterable, Object obj) {
        int iIndexOf;
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i10 = 0;
            for (Object obj2 : iterable) {
                if (i10 < 0) {
                    W.k0();
                    throw null;
                }
                if (kotlin.jvm.internal.m.b(obj, obj2)) {
                    iIndexOf = i10;
                } else {
                    i10++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List x0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return s.f8650a;
        }
        if (size == 1) {
            return W.T(I0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i10 = 1; i10 < size2; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List y0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return S0(size, list);
    }

    public static final boolean z0(Iterable iterable, Z8.c cVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) cVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }
}
