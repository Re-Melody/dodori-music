package N8;

import D7.W;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends W {
    public static int o0(Iterable iterable, int i10) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static ArrayList p0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            n.u0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
