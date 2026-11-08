package p067g0;

import C.C0152j;
import U.C0906q;
import U.InterfaceC0898m;
import Z8.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19935a = new f(-1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f19936b = new f(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f19937c = new StackTraceElement[0];

    public static final r a(r rVar, f fVar) {
        return rVar.then(new l(fVar));
    }

    public static final r b(InterfaceC0898m interfaceC0898m, r rVar) {
        if (rVar.all(m.f19962a)) {
            return rVar;
        }
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.U(1219399079);
        r rVar2 = (r) rVar.foldIn(o.f19964a, new C0152j(c0906q, 18));
        c0906q.q(false);
        return rVar2;
    }

    public static final r c(InterfaceC0898m interfaceC0898m, r rVar) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.T(439770924);
        r rVarB = b(c0906q, rVar);
        c0906q.q(false);
        return rVarB;
    }
}
