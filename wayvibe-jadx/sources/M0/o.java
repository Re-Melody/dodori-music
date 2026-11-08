package M0;

import A9.C0102b;
import D0.g0;
import F0.AbstractC0388f;
import F0.H;
import F0.InterfaceC0394l;
import F0.h0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p067g0.q f8054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H f8056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f8057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f8059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8060g;

    public o(p067g0.q qVar, boolean z10, H h10, j jVar) {
        this.f8054a = qVar;
        this.f8055b = z10;
        this.f8056c = h10;
        this.f8057d = jVar;
        this.f8060g = h10.f3588b;
    }

    public static /* synthetic */ List h(o oVar, int i10) {
        return oVar.g((i10 & 1) != 0 ? !oVar.f8055b : false, (i10 & 2) == 0);
    }

    public final o a(g gVar, Z8.c cVar) {
        j jVar = new j();
        jVar.f8048b = false;
        jVar.f8049c = false;
        cVar.invoke(jVar);
        o oVar = new o(new n(cVar), false, new H(true, this.f8060g + (gVar != null ? 1000000000 : 2000000000)), jVar);
        oVar.f8058e = true;
        oVar.f8059f = this;
        return oVar;
    }

    public final void b(H h10, ArrayList arrayList) {
        W.d dVarV = h10.v();
        int i10 = dVarV.f12758c;
        if (i10 > 0) {
            Object[] objArr = dVarV.f12756a;
            int i11 = 0;
            do {
                H h11 = (H) objArr[i11];
                if (h11.E() && !h11.f3586I) {
                    if (h11.f3609y.j(8)) {
                        arrayList.add(org.slf4j.helpers.i.e(h11, this.f8055b));
                    } else {
                        b(h11, arrayList);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    public final h0 c() {
        if (this.f8058e) {
            o oVarJ = j();
            if (oVarJ != null) {
                return oVarJ.c();
            }
            return null;
        }
        InterfaceC0394l interfaceC0394lA = org.slf4j.helpers.i.A(this.f8056c);
        if (interfaceC0394lA == null) {
            interfaceC0394lA = this.f8054a;
        }
        return AbstractC0388f.p(interfaceC0394lA, 8);
    }

    public final void d(ArrayList arrayList) {
        List listO = o(false);
        int size = listO.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) listO.get(i10);
            if (oVar.l()) {
                arrayList.add(oVar);
            } else if (!oVar.f8057d.f8049c) {
                oVar.d(arrayList);
            }
        }
    }

    public final p133m0.d e() {
        h0 h0VarC = c();
        if (h0VarC != null) {
            if (!h0VarC.q()) {
                h0VarC = null;
            }
            if (h0VarC != null) {
                return g0.g(h0VarC).t(h0VarC, true);
            }
        }
        return p133m0.d.f22183e;
    }

    public final p133m0.d f() {
        h0 h0VarC = c();
        if (h0VarC != null) {
            if (!h0VarC.q()) {
                h0VarC = null;
            }
            if (h0VarC != null) {
                return g0.f(h0VarC);
            }
        }
        return p133m0.d.f22183e;
    }

    public final List g(boolean z10, boolean z11) {
        if (!z10 && this.f8057d.f8049c) {
            return N8.s.f8650a;
        }
        if (!l()) {
            return o(z11);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final j i() {
        boolean zL = l();
        j jVar = this.f8057d;
        if (!zL) {
            return jVar;
        }
        j jVar2 = new j();
        jVar2.f8048b = jVar.f8048b;
        jVar2.f8049c = jVar.f8049c;
        jVar2.f8047a.putAll(jVar.f8047a);
        n(jVar2);
        return jVar2;
    }

    public final o j() {
        H hT;
        o oVar = this.f8059f;
        if (oVar != null) {
            return oVar;
        }
        H h10 = this.f8056c;
        boolean z10 = this.f8055b;
        if (!z10) {
            hT = null;
            break;
        }
        hT = h10.t();
        while (true) {
            if (hT == null) {
                hT = null;
                break;
            }
            j jVarP = hT.p();
            if (jVarP != null && jVarP.f8048b) {
                break;
            }
            hT = hT.t();
        }
        if (hT == null) {
            for (H hT2 = h10.t(); hT2 != null; hT2 = hT2.t()) {
                if (hT2.f3609y.j(8)) {
                    hT = hT2;
                }
            }
            hT = null;
        }
        if (hT == null) {
            return null;
        }
        return org.slf4j.helpers.i.e(hT, z10);
    }

    public final j k() {
        return this.f8057d;
    }

    public final boolean l() {
        return this.f8055b && this.f8057d.f8048b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean m() {
        if (this.f8058e || !h(this, 4).isEmpty()) {
            return false;
        }
        H hT = this.f8056c.t();
        while (hT != null) {
            j jVarP = hT.p();
            if (jVarP != null && jVarP.f8048b) {
                if (hT == null) {
                    return true;
                }
                return false;
            }
            hT = hT.t();
        }
        hT = null;
        if (hT == null) {
            return true;
        }
        return false;
    }

    public final void n(j jVar) {
        if (this.f8057d.f8049c) {
            return;
        }
        List listO = o(false);
        int size = listO.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) listO.get(i10);
            if (!oVar.l()) {
                for (Map.Entry entry : oVar.f8057d.f8047a.entrySet()) {
                    u uVar = (u) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = jVar.f8047a;
                    Object obj = linkedHashMap.get(uVar);
                    kotlin.jvm.internal.m.d(uVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object objInvoke = uVar.f8109b.invoke(obj, value);
                    if (objInvoke != null) {
                        linkedHashMap.put(uVar, objInvoke);
                    }
                }
                oVar.n(jVar);
            }
        }
    }

    public final List o(boolean z10) {
        if (this.f8058e) {
            return N8.s.f8650a;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f8056c, arrayList);
        if (z10) {
            u uVar = r.f8098s;
            j jVar = this.f8057d;
            LinkedHashMap linkedHashMap = jVar.f8047a;
            Object obj = linkedHashMap.get(uVar);
            if (obj == null) {
                obj = null;
            }
            g gVar = (g) obj;
            if (gVar != null && jVar.f8048b && !arrayList.isEmpty()) {
                arrayList.add(a(gVar, new C0102b(gVar, 22)));
            }
            u uVar2 = r.f8082a;
            if (linkedHashMap.containsKey(uVar2) && !arrayList.isEmpty() && jVar.f8048b) {
                Object obj2 = linkedHashMap.get(uVar2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) N8.n.D0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new m(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
