package p037d0;

import D7.W;
import N8.y;
import U.W0;
import Z8.a;
import Z8.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import p046da.b;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f19044c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(c cVar, Map map) {
        this.f19042a = (n) cVar;
        this.f19043b = map != null ? y.r0(map) : new LinkedHashMap();
        this.f19044c = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // p037d0.k
    public final boolean a(Object obj) {
        return ((Boolean) this.f19042a.invoke(obj)).booleanValue();
    }

    @Override // p037d0.k
    public final j b(String str, a aVar) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!b.O(str.charAt(i10))) {
                LinkedHashMap linkedHashMap = this.f19044c;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(aVar);
                return new W0(this, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // p037d0.k
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f19043b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    public final Map d() {
        LinkedHashMap linkedHashMapR0 = y.r0(this.f19043b);
        for (Map.Entry entry : this.f19044c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((a) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException(p242x0.c.n(objInvoke).toString());
                    }
                    linkedHashMapR0.put(str, W.j(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = ((a) list.get(i10)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException(p242x0.c.n(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMapR0.put(str, arrayList);
            }
        }
        return linkedHashMapR0;
    }
}
