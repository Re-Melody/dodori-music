package p170p7;

import D7.C0217f0;
import D7.C0221h0;
import D7.W;
import D7.n1;
import D7.o1;
import D7.p1;
import com.google.protobuf.G;
import com.google.protobuf.I;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p179q7.f;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p1 f25275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f25276b;

    public o(p1 p1Var) {
        this.f25276b = new HashMap();
        c.z("ObjectValues should be backed by a MapValue", p1Var.P() == o1.MAP_VALUE, new Object[0]);
        c.z("ServerTimestamps should not be used as an ObjectValue", !W.N(p1Var), new Object[0]);
        this.f25275a = p1Var;
    }

    public static f c(C0221h0 c0221h0) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : c0221h0.w().entrySet()) {
            k kVar = new k(Collections.singletonList((String) entry.getKey()));
            p1 p1Var = (p1) entry.getValue();
            p1 p1Var2 = t.f25282a;
            if (p1Var == null || p1Var.P() != o1.MAP_VALUE) {
                hashSet.add(kVar);
            } else {
                HashSet hashSet2 = c(((p1) entry.getValue()).L()).f25685a;
                if (hashSet2.isEmpty()) {
                    hashSet.add(kVar);
                } else {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        hashSet.add((k) kVar.b((k) it.next()));
                    }
                }
            }
        }
        return new f(hashSet);
    }

    public static p1 d(p1 p1Var, k kVar) {
        if (kVar.h()) {
            return p1Var;
        }
        for (int i10 = 0; i10 < kVar.f25258a.size() - 1; i10++) {
            p1Var = p1Var.L().x(kVar.g(i10));
            p1 p1Var2 = t.f25282a;
            if (p1Var == null || p1Var.P() != o1.MAP_VALUE) {
                return null;
            }
        }
        return p1Var.L().x(kVar.f());
    }

    public static o e(Map map) {
        n1 n1VarR = p1.R();
        C0217f0 c0217f0Z = C0221h0.z();
        c0217f0Z.d();
        C0221h0.t((C0221h0) c0217f0Z.f18674b).putAll(map);
        n1VarR.i(c0217f0Z);
        return new o((p1) n1VarR.b());
    }

    public final C0221h0 a(k kVar, Map map) {
        C0217f0 c0217f0Z;
        p1 p1VarD = d(this.f25275a, kVar);
        p1 p1Var = t.f25282a;
        if (p1VarD == null || p1VarD.P() != o1.MAP_VALUE) {
            c0217f0Z = C0221h0.z();
        } else {
            C0221h0 c0221h0L = p1VarD.L();
            G g3 = (G) c0221h0L.h(I.NEW_BUILDER);
            if (!g3.f18673a.equals(c0221h0L)) {
                g3.d();
                G.e(g3.f18674b, c0221h0L);
            }
            c0217f0Z = (C0217f0) g3;
        }
        boolean z10 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C0221h0 c0221h0A = a((k) kVar.a(str), (Map) value);
                if (c0221h0A != null) {
                    n1 n1VarR = p1.R();
                    n1VarR.j(c0221h0A);
                    c0217f0Z.f((p1) n1VarR.b(), str);
                    z10 = true;
                }
            } else {
                if (value instanceof p1) {
                    c0217f0Z.f((p1) value, str);
                } else {
                    c0217f0Z.getClass();
                    str.getClass();
                    if (((C0221h0) c0217f0Z.f18674b).w().containsKey(str)) {
                        c.z("Expected entry to be a Map, a Value or null", value == null, new Object[0]);
                        c0217f0Z.d();
                        C0221h0.t((C0221h0) c0217f0Z.f18674b).remove(str);
                    }
                }
                z10 = true;
            }
        }
        if (z10) {
            return (C0221h0) c0217f0Z.b();
        }
        return null;
    }

    public final p1 b() {
        synchronized (this.f25276b) {
            try {
                C0221h0 c0221h0A = a(k.f25268c, this.f25276b);
                if (c0221h0A != null) {
                    n1 n1VarR = p1.R();
                    n1VarR.j(c0221h0A);
                    this.f25275a = (p1) n1VarR.b();
                    this.f25276b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f25275a;
    }

    public final Object clone() {
        return new o(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return t.e(b(), ((o) obj).b());
        }
        return false;
    }

    public final p1 f(k kVar) {
        return d(b(), kVar);
    }

    public final void g(p1 p1Var, k kVar) {
        c.z("Cannot set field for empty path on ObjectValue", !kVar.h(), new Object[0]);
        i(p1Var, kVar);
    }

    public final void h(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            k kVar = (k) entry.getKey();
            if (entry.getValue() == null) {
                c.z("Cannot delete field for empty path on ObjectValue", !kVar.h(), new Object[0]);
                i(null, kVar);
            } else {
                g((p1) entry.getValue(), kVar);
            }
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(p1 p1Var, k kVar) {
        Map map;
        Map map2 = this.f25276b;
        for (int i10 = 0; i10 < kVar.f25258a.size() - 1; i10++) {
            String strG = kVar.g(i10);
            Object obj = map2.get(strG);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof p1) {
                    p1 p1Var2 = (p1) obj;
                    if (p1Var2.P() == o1.MAP_VALUE) {
                        HashMap map3 = new HashMap(p1Var2.L().w());
                        map2.put(strG, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap();
                map2.put(strG, map);
            }
            map2 = map;
        }
        map2.put(kVar.f(), p1Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectValue{internalValue=");
        p1 p1VarB = b();
        p1 p1Var = t.f25282a;
        StringBuilder sb2 = new StringBuilder();
        t.a(sb2, p1VarB);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o() {
        n1 n1VarR = p1.R();
        n1VarR.j(C0221h0.u());
        this((p1) n1VarR.b());
    }
}
