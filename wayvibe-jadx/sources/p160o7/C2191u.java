package p160o7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p170p7.h;
import p170p7.p;
import p179q7.d;

/* JADX INFO: renamed from: o7.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2191u implements InterfaceC2173b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f23798a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23799b = new HashMap();

    @Override // p160o7.InterfaceC2173b
    public final HashMap F(TreeSet treeSet) {
        HashMap map = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            d dVar = (d) this.f23798a.get(hVar);
            if (dVar != null) {
                map.put(hVar, dVar);
            }
        }
        return map;
    }

    @Override // p160o7.InterfaceC2173b
    public final void K(int i10) {
        HashMap map = this.f23799b;
        if (map.containsKey(Integer.valueOf(i10))) {
            Set set = (Set) map.get(Integer.valueOf(i10));
            map.remove(Integer.valueOf(i10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f23798a.remove((h) it.next());
            }
        }
    }

    @Override // p160o7.InterfaceC2173b
    public final HashMap P(p pVar, int i10) {
        HashMap map = new HashMap();
        int size = pVar.f25258a.size() + 1;
        for (d dVar : this.f23798a.tailMap(new h((p) pVar.a(""))).values()) {
            h hVar = dVar.f25683b.f25688a;
            if (!pVar.i(hVar.f25264a)) {
                break;
            }
            if (hVar.f25264a.f25258a.size() == size && dVar.f25682a > i10) {
                map.put(dVar.f25683b.f25688a, dVar);
            }
        }
        return map;
    }

    @Override // p160o7.InterfaceC2173b
    public final void a(int i10, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            p179q7.h hVar = (p179q7.h) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (hVar == null) {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
            TreeMap treeMap = this.f23798a;
            h hVar2 = hVar.f25688a;
            d dVar = (d) treeMap.get(hVar2);
            HashMap map2 = this.f23799b;
            if (dVar != null) {
                ((Set) map2.get(Integer.valueOf(dVar.f25682a))).remove(hVar2);
            }
            treeMap.put(hVar2, new d(i10, hVar));
            if (map2.get(Integer.valueOf(i10)) == null) {
                map2.put(Integer.valueOf(i10), new HashSet());
            }
            ((Set) map2.get(Integer.valueOf(i10))).add(hVar2);
        }
    }

    @Override // p160o7.InterfaceC2173b
    public final HashMap e(int i10, int i11, String str) {
        int i12;
        TreeMap treeMap = new TreeMap();
        for (d dVar : this.f23798a.values()) {
            p pVar = dVar.f25683b.f25688a.f25264a;
            if (pVar.g(pVar.f25258a.size() - 2).equals(str) && (i12 = dVar.f25682a) > i10) {
                Map map = (Map) treeMap.get(Integer.valueOf(i12));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(i12), map);
                }
                map.put(dVar.f25683b.f25688a, dVar);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i11) {
                break;
            }
        }
        return map2;
    }

    @Override // p160o7.InterfaceC2173b
    public final d q(h hVar) {
        return (d) this.f23798a.get(hVar);
    }
}
