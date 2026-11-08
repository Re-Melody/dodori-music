package F;

import C.C0164w;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: F.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0376v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p037d0.c f3560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D.l f3561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3562c = new LinkedHashMap();

    public C0376v(p037d0.c cVar, D.l lVar) {
        this.f3560a = cVar;
        this.f3561b = lVar;
    }

    public final Z8.e a(int i10, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.f3562c;
        C0375u c0375u = (C0375u) linkedHashMap.get(obj);
        if (c0375u != null && c0375u.f3557c == i10 && kotlin.jvm.internal.m.b(c0375u.f3556b, obj2)) {
            c0.b bVar = c0375u.f3558d;
            if (bVar != null) {
                return bVar;
            }
            c0.b bVar2 = new c0.b(1403994769, new C0164w(3, c0375u.f3559e, c0375u), true);
            c0375u.f3558d = bVar2;
            return bVar2;
        }
        C0375u c0375u2 = new C0375u(this, i10, obj, obj2);
        linkedHashMap.put(obj, c0375u2);
        c0.b bVar3 = c0375u2.f3558d;
        if (bVar3 != null) {
            return bVar3;
        }
        c0.b bVar4 = new c0.b(1403994769, new C0164w(3, this, c0375u2), true);
        c0375u2.f3558d = bVar4;
        return bVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C0375u c0375u = (C0375u) this.f3562c.get(obj);
        if (c0375u != null) {
            return c0375u.f3556b;
        }
        InterfaceC0378x interfaceC0378x = (InterfaceC0378x) this.f3561b.invoke();
        int iA = interfaceC0378x.a(obj);
        if (iA != -1) {
            return interfaceC0378x.e(iA);
        }
        return null;
    }
}
