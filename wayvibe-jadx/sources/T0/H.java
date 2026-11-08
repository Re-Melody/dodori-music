package T0;

import B2.AbstractC0112b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11450a;

    public H(E... eArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (E e2 : eArr) {
            String strB = e2.b();
            Object arrayList = linkedHashMap.get(strB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strB, arrayList);
            }
            ((List) arrayList).add(e2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(AbstractC0112b.j(V0.p.u("'", str, "' must be unique. Actual [ ["), N8.n.H0(list, null, null, null, null, 63), ']').toString());
            }
            N8.n.u0(arrayList2, list);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.f11450a = arrayList3;
        int size = arrayList3.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((E) arrayList3.get(i10)).getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && kotlin.jvm.internal.m.b(this.f11450a, ((H) obj).f11450a);
    }

    public final int hashCode() {
        return this.f11450a.hashCode();
    }
}
