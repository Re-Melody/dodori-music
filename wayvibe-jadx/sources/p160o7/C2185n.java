package p160o7;

import E8.A;
import F2.T;
import S9.b;
import W4.m;
import W6.p;
import W9.j;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p044d7.e;
import p117k7.d;
import p129l7.a;
import p140m7.C2061m;
import p140m7.F;
import p140m7.N;
import p152o.U0;
import p170p7.h;
import p170p7.l;
import p170p7.n;
import p170p7.q;
import p207t7.r;
import p242x0.c;
import s7.u;

/* JADX INFO: renamed from: o7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2185n implements a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f23771n = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2178g f23773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f23774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2173b f23775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f23776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2061m f23777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U0 f23778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f23779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V f23780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2172a f23781j;
    public final SparseArray k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f23782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A f23783m;

    public C2185n(b bVar, U0 u10, d dVar) {
        c.z("LocalStore was passed an unstarted persistence implementation", bVar.Y(), new Object[0]);
        this.f23772a = bVar;
        this.f23778g = u10;
        V vM = bVar.M();
        this.f23780i = vM;
        this.f23781j = bVar.w();
        A a10 = new A(0, vM.e());
        a10.f3181a += 2;
        this.f23783m = a10;
        this.f23776e = bVar.J();
        j jVar = new j(27);
        this.f23779h = jVar;
        this.k = new SparseArray();
        this.f23782l = new HashMap();
        bVar.I().O(jVar);
        c(dVar);
    }

    public static boolean e(W w10, W w11, u uVar) {
        if (w10.f23740g.isEmpty()) {
            return true;
        }
        long j10 = w11.f23738e.f25279a.f12883a - w10.f23738e.f25279a.f12883a;
        long j11 = f23771n;
        if (j10 >= j11) {
            return true;
        }
        if (w11.f23739f.f25279a.f12883a - w10.f23739f.f25279a.f12883a >= j11) {
            return true;
        }
        if (uVar == null) {
            return false;
        }
        return uVar.f26242e.f19303a.size() + (uVar.f26241d.f19303a.size() + uVar.f26240c.f19303a.size()) > 0;
    }

    public final W a(N n6) {
        int i10;
        W wI = this.f23780i.i(n6);
        if (wI != null) {
            i10 = wI.f23735b;
        } else {
            C2189s c2189s = new C2189s();
            this.f23772a.j0("Allocate target", new T(this, c2189s, n6, 27));
            i10 = c2189s.f23792a;
            wI = (W) c2189s.f23793b;
        }
        SparseArray sparseArray = this.k;
        if (sparseArray.get(i10) == null) {
            sparseArray.put(i10, wI);
            this.f23782l.put(n6, Integer.valueOf(i10));
        }
        return wI;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public final m b(F f10, boolean z10) {
        q qVar;
        N nI = f10.i();
        Integer num = (Integer) this.f23782l.get(nI);
        V v3 = this.f23780i;
        W wI = num != null ? (W) this.k.get(num.intValue()) : v3.i(nI);
        q qVar2 = q.f25278b;
        e eVarF = h.f25263c;
        if (wI != null) {
            eVarF = v3.f(wI.f23735b);
            qVar = wI.f23739f;
        } else {
            qVar = qVar2;
        }
        if (!z10) {
            qVar = qVar2;
        }
        U0 u10 = this.f23778g;
        c.z("initialize() not called", u10.f23280a, new Object[0]);
        p044d7.c cVarD = u10.d(f10);
        if (cVarD == null) {
            if (f10.h() || qVar.equals(qVar2)) {
                cVarD = null;
            } else {
                e eVarB = U0.b(f10, ((C2061m) u10.f23282c).p(eVarF));
                if (U0.c(f10, eVarF.f19303a.size(), eVarB, qVar)) {
                    cVarD = null;
                } else {
                    if (r.c()) {
                        r.a("QueryEngine", "Re-using previous result from %s to execute query: %s", qVar.toString(), f10.toString());
                    }
                    p170p7.b bVar = p170p7.b.f25249d;
                    p pVar = qVar.f25279a;
                    int i10 = pVar.f12884b + 1;
                    double d10 = i10;
                    long j10 = pVar.f12883a;
                    cVarD = u10.a(eVarB, f10, new p170p7.b(new q(d10 == 1.0E9d ? new p(0, j10 + 1) : new p(i10, j10)), h.b(), -1));
                }
            }
            if (cVarD == null) {
                A a10 = new A();
                a10.f3181a = 0;
                if (r.c()) {
                    r.a("QueryEngine", "Using full collection scan to execute query: %s", f10.toString());
                }
                cVarD = ((C2061m) u10.f23282c).r(f10, p170p7.b.f25249d, a10);
                if (cVarD != null && u10.f23281b) {
                    int size = cVarD.size();
                    if (a10.f3181a < 100) {
                        r.a("QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", f10.toString(), 100);
                    } else {
                        r.a("QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", f10.toString(), Integer.valueOf(a10.f3181a), Integer.valueOf(size));
                        if (a10.f3181a > 2.0d * ((double) size)) {
                            ((InterfaceC2178g) u10.f23283d).w(f10.i());
                            r.a("QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", f10.toString());
                        }
                    }
                }
            }
        }
        return new m(27, cVarD, eVarF);
    }

    public final void c(d dVar) {
        b bVar = this.f23772a;
        InterfaceC2178g interfaceC2178gZ = bVar.z(dVar);
        this.f23773b = interfaceC2178gZ;
        this.f23774c = bVar.C(dVar, interfaceC2178gZ);
        InterfaceC2173b interfaceC2173bY = bVar.y(dVar);
        this.f23775d = interfaceC2173bY;
        x xVar = this.f23774c;
        InterfaceC2178g interfaceC2178g = this.f23773b;
        C c3 = this.f23776e;
        this.f23777f = new C2061m(c3, xVar, interfaceC2173bY, interfaceC2178g);
        c3.D(interfaceC2178g);
        C2061m c2061m = this.f23777f;
        InterfaceC2178g interfaceC2178g2 = this.f23773b;
        U0 u10 = this.f23778g;
        u10.f23282c = c2061m;
        u10.f23283d = interfaceC2178g2;
        u10.f23280a = true;
    }

    public final j d(Map map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Set setKeySet = map.keySet();
        C c3 = this.f23776e;
        HashMap mapW = c3.w(setKeySet);
        for (Map.Entry entry : map.entrySet()) {
            h hVar = (h) entry.getKey();
            n nVar = (n) entry.getValue();
            n nVar2 = (n) mapW.get(hVar);
            if (nVar.d() != nVar2.d()) {
                hashSet.add(hVar);
            }
            if (nVar.e() && nVar.f25271c.equals(q.f25278b)) {
                arrayList.add(nVar.f25269a);
                map2.put(hVar, nVar);
            } else if (nVar2.f25270b.equals(p170p7.m.INVALID) || nVar.f25271c.compareTo(nVar2.f25271c) > 0 || (nVar.f25271c.compareTo(nVar2.f25271c) == 0 && (nVar2.c() || nVar2.f25274f.equals(l.HAS_COMMITTED_MUTATIONS)))) {
                c.z("Cannot add a document when the remote version is zero", !q.f25278b.equals(nVar.f25272d), new Object[0]);
                c3.N(nVar, nVar.f25272d);
                map2.put(hVar, nVar);
            } else {
                r.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", hVar, nVar2.f25271c, nVar.f25271c);
            }
        }
        c3.x(arrayList);
        return new j(25, map2, hashSet);
    }
}
