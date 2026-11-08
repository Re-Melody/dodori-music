package p236w5;

import android.util.SparseArray;
import java.util.HashMap;
import p104j5.c;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f28044a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f28045b;

    static {
        HashMap map = new HashMap();
        f28045b = map;
        map.put(c.DEFAULT, 0);
        map.put(c.VERY_LOW, 1);
        map.put(c.HIGHEST, 2);
        for (c cVar : map.keySet()) {
            f28044a.append(((Integer) f28045b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f28045b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i10) {
        c cVar = (c) f28044a.get(i10);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(b.j(i10, "Unknown Priority for value "));
    }
}
