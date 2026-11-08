package D8;

import B8.C0114a;
import B8.InterfaceC0126m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r2 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0114a f2774a = new C0114a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0114a f2775b = new C0114a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static N0 n() {
        return O1.f2307e == null ? new O1() : new C0278h(0);
    }

    public static Set o(String str, Map map) {
        B8.q0 q0VarValueOf;
        List listC = H0.c(str, map);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(B8.q0.class);
        for (Object obj : listC) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int iIntValue = d10.intValue();
                p240w9.b.e(obj, "Status code %s is not integral", ((double) iIntValue) == d10.doubleValue());
                q0VarValueOf = B8.r0.c(iIntValue).f859a;
                p240w9.b.e(obj, "Status code %s is not valid", q0VarValueOf.g() == d10.intValue());
            } else {
                if (!(obj instanceof String)) {
                    throw new B8.V("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    q0VarValueOf = B8.q0.valueOf((String) obj);
                } catch (IllegalArgumentException e2) {
                    throw new B8.V("Status code " + obj + " is not valid", e2);
                }
            }
            enumSetNoneOf.add(q0VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List p(Map map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = H0.c("loadBalancingConfig", map);
            if (listC == null) {
                listC = null;
            } else {
                H0.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = H0.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static B8.j0 t(List list, B8.T t10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p2 p2Var = (p2) it.next();
            String str = p2Var.f2740a;
            B8.S sB = t10.b(str);
            if (sB != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(r2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                B8.j0 j0VarC = sB.c(p2Var.f2741b);
                return j0VarC.f826a != null ? j0VarC : new B8.j0(new q2(sB, j0VarC.f827b));
            }
            arrayList.add(str);
        }
        return new B8.j0(B8.r0.f850g.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List u(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new p2(str, H0.g(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // D8.w2
    public void b(InterfaceC0126m interfaceC0126m) {
        ((AbstractC0263c) this).f2496d.b(interfaceC0126m);
    }

    @Override // D8.w2
    public void d(H8.a aVar) {
        try {
            if (!((AbstractC0263c) this).f2496d.d()) {
                ((AbstractC0263c) this).f2496d.e(aVar);
            }
        } finally {
            AbstractC0291l0.b(aVar);
        }
    }

    @Override // D8.w2
    public void flush() {
        InterfaceC0282i0 interfaceC0282i0 = ((AbstractC0263c) this).f2496d;
        if (interfaceC0282i0.d()) {
            return;
        }
        interfaceC0282i0.flush();
    }

    @Override // D8.w2
    public void i(int i10) {
        E8.l lVar = ((E8.m) this).f3256n;
        lVar.getClass();
        K8.b.b();
        RunnableC0269e runnableC0269e = new RunnableC0269e(lVar, i10, 0);
        synchronized (lVar.f3249w) {
            runnableC0269e.run();
        }
    }

    @Override // D8.w2
    public void m() {
        E8.l lVar = ((E8.m) this).f3256n;
        C0307q1 c0307q1 = lVar.f2452d;
        c0307q1.f2746a = lVar;
        lVar.f2449a = c0307q1;
    }

    public abstract int q();

    public abstract boolean r(o2 o2Var);

    public abstract void s(o2 o2Var);
}
