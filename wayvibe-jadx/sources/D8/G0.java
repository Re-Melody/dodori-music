package D8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f2249a = Logger.getLogger(G0.class.getName());

    public static Object a(M7.b bVar) {
        p229v9.a.o("unexpected end of JSON", bVar.A());
        switch (F0.f2247a[bVar.N().ordinal()]) {
            case 1:
                bVar.b();
                ArrayList arrayList = new ArrayList();
                while (bVar.A()) {
                    arrayList.add(a(bVar));
                }
                p229v9.a.o("Bad token: " + bVar.x(false), bVar.N() == M7.c.END_ARRAY);
                bVar.l();
                return Collections.unmodifiableList(arrayList);
            case 2:
                bVar.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (bVar.A()) {
                    linkedHashMap.put(bVar.H(), a(bVar));
                }
                p229v9.a.o("Bad token: " + bVar.x(false), bVar.N() == M7.c.END_OBJECT);
                bVar.q();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return bVar.L();
            case 4:
                return Double.valueOf(bVar.E());
            case 5:
                return Boolean.valueOf(bVar.D());
            case 6:
                bVar.J();
                return null;
            default:
                throw new IllegalStateException("Bad token: " + bVar.x(false));
        }
    }
}
