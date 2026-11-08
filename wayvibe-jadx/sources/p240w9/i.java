package p240w9;

import O.C0663p;
import V0.p;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import p023b7.a;
import p023b7.q;
import p075g9.c;
import p097i9.k;
import p097i9.l;
import p206t6.b;
import p260y9.V;
import p260y9.W;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final V a(String str, f fVar) {
        if (k.x0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = W.f29262a.keySet().iterator();
        while (it.hasNext()) {
            String strC = ((e) ((c) it.next())).c();
            m.c(strC);
            String strA = W.a(strC);
            if (str.equalsIgnoreCase("kotlin." + strA) || str.equalsIgnoreCase(strA)) {
                StringBuilder sbU = p.u("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exist ");
                sbU.append(W.a(strA));
                sbU.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(l.W(sbU.toString()));
            }
        }
        return new V(str, fVar);
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p248x6.l lVar = (p248x6.l) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", lVar.f28625a);
            bundle.putLong("event_timestamp", lVar.f28626b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final h c(String str, g[] gVarArr, Z8.c builderAction) {
        m.f(builderAction, "builderAction");
        if (k.x0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(str);
        builderAction.invoke(aVar);
        return new h(str, m.f28084b, aVar.f28055c.size(), N8.m.B0(gVarArr), aVar);
    }

    public static final h d(String serialName, l lVar, g[] gVarArr, Z8.c cVar) {
        m.f(serialName, "serialName");
        if (k.x0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (lVar.equals(m.f28084b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        cVar.invoke(aVar);
        return new h(serialName, lVar, aVar.f28055c.size(), N8.m.B0(gVarArr), aVar);
    }

    public static h e(String serialName, l lVar, g[] gVarArr) {
        m.f(serialName, "serialName");
        if (k.x0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (lVar.equals(m.f28084b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        return new h(serialName, lVar, aVar.f28055c.size(), N8.m.B0(gVarArr), aVar);
    }

    public static a f(String str, String str2) {
        p268z7.a aVar = new p268z7.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(p268z7.a.class));
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 1, new G2.c(aVar), hashSet3);
    }

    public static a g(String str, C0663p c0663p) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(p268z7.a.class));
        for (Class cls : new Class[0]) {
            b.j(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        p023b7.i iVarA = p023b7.i.a(Context.class);
        if (hashSet.contains(iVarA.f15793a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVarA);
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 1, new A7.a(26, str, c0663p), hashSet3);
    }
}
