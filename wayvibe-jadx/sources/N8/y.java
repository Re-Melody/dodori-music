package N8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends Q5.b {
    public static O8.e a0(O8.e eVar) {
        eVar.g();
        eVar.f9359m = true;
        if (eVar.f9356i > 0) {
            return eVar;
        }
        O8.e eVar2 = O8.e.f9347n;
        kotlin.jvm.internal.m.d(eVar2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar2;
    }

    public static O8.e b0() {
        return new O8.e(8);
    }

    public static Object c0(Object obj, Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        if (map instanceof x) {
            return ((x) map).f();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap d0(M8.l... lVarArr) {
        HashMap map = new HashMap(e0(lVarArr.length));
        m0(map, lVarArr);
        return map;
    }

    public static int e0(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map f0(M8.l pair) {
        kotlin.jvm.internal.m.f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f8413a, pair.f8414b);
        kotlin.jvm.internal.m.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map g0(M8.l... lVarArr) {
        if (lVarArr.length <= 0) {
            return t.f8651a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0(lVarArr.length));
        m0(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static Map h0(Map map, Iterable keys) {
        kotlin.jvm.internal.m.f(keys, "keys");
        LinkedHashMap linkedHashMapR0 = r0(map);
        Set setKeySet = linkedHashMapR0.keySet();
        kotlin.jvm.internal.m.f(setKeySet, "<this>");
        setKeySet.removeAll(keys instanceof Collection ? (Collection) keys : n.W0(keys));
        return j0(linkedHashMapR0);
    }

    public static LinkedHashMap i0(M8.l... lVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0(lVarArr.length));
        m0(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static final Map j0(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : s0(linkedHashMap);
        }
        return t.f8651a;
    }

    public static LinkedHashMap k0(Map map, Map map2) {
        kotlin.jvm.internal.m.f(map, "<this>");
        kotlin.jvm.internal.m.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map l0(M8.l lVar, Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        if (map.isEmpty()) {
            return f0(lVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(lVar.f8413a, lVar.f8414b);
        return linkedHashMap;
    }

    public static final void m0(HashMap map, M8.l[] lVarArr) {
        for (M8.l lVar : lVarArr) {
            map.put(lVar.f8413a, lVar.f8414b);
        }
    }

    public static void n0(Map map, ArrayList arrayList) {
        kotlin.jvm.internal.m.f(map, "<this>");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            M8.l lVar = (M8.l) it.next();
            map.put(lVar.f8413a, lVar.f8414b);
        }
    }

    public static Map o0(p085h9.g gVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = gVar.f20354b.iterator();
        while (it.hasNext()) {
            M8.l lVar = (M8.l) gVar.f20355c.invoke(it.next());
            linkedHashMap.put(lVar.f8413a, lVar.f8414b);
        }
        return j0(linkedHashMap);
    }

    public static Map p0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return t.f8651a;
        }
        if (size == 1) {
            return f0((M8.l) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0(arrayList.size()));
        n0(linkedHashMap, arrayList);
        return linkedHashMap;
    }

    public static Map q0(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? r0(map) : s0(map);
        }
        return t.f8651a;
    }

    public static LinkedHashMap r0(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map s0(Map map) {
        kotlin.jvm.internal.m.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.m.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
