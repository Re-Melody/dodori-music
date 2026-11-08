package D8;

import Ca.C0168a;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class z2 implements B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x2 f2869d = new x2(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2872c;

    public /* synthetic */ z2(int i10, Object obj, Object obj2) {
        this.f2870a = i10;
        this.f2872c = obj;
        this.f2871b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x022f  */
    @Override // D8.B
    public void q(B8.r0 r0Var, A a10, B8.e0 e0Var) {
        boolean z10;
        Z1 z1;
        S0 s8;
        D4.u uVar;
        switch (this.f2870a) {
            case 2:
                C0168a c0168a = ((C0329y0) this.f2872c).f2859b.f2866b;
                if (r0Var.e()) {
                    ((N0) c0168a.f1503d).a();
                } else {
                    ((N0) c0168a.f1504e).a();
                }
                ((B) this.f2871b).q(r0Var, a10, e0Var);
                return;
            default:
                synchronized (((S0) this.f2872c).f2347i) {
                    S0 s10 = (S0) this.f2872c;
                    s10.f2352o = s10.f2352o.d((e2) this.f2871b);
                    ((S0) this.f2872c).f2351n.f2787b.add(String.valueOf(r0Var.f859a));
                    break;
                }
                if (((S0) this.f2872c).r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((S0) this.f2872c).f2341c.execute(new d2(this, 0));
                    return;
                }
                e2 e2Var = (e2) this.f2871b;
                if (e2Var.f2593c) {
                    S0 s11 = (S0) this.f2872c;
                    R1 r1O = s11.o(e2Var);
                    if (r1O != null) {
                        s11.f2340b.execute(r1O);
                    }
                    if (((S0) this.f2872c).f2352o.f2491f == ((e2) this.f2871b)) {
                        ((S0) this.f2872c).u(r0Var, a10, e0Var);
                        return;
                    }
                    return;
                }
                A a11 = A.MISCARRIED;
                if (a10 == a11 && ((S0) this.f2872c).f2354q.incrementAndGet() > 1000) {
                    S0 s12 = (S0) this.f2872c;
                    R1 r1O2 = s12.o((e2) this.f2871b);
                    if (r1O2 != null) {
                        s12.f2340b.execute(r1O2);
                    }
                    if (((S0) this.f2872c).f2352o.f2491f == ((e2) this.f2871b)) {
                        ((S0) this.f2872c).u(B8.r0.f855m.g("Too many transparent retries. Might be a bug in gRPC").f(new B8.t0(r0Var)), a10, e0Var);
                        return;
                    }
                    return;
                }
                if (((S0) this.f2872c).f2352o.f2491f == null) {
                    if (a10 == a11 || (a10 == A.REFUSED && ((S0) this.f2872c).f2353p.compareAndSet(false, true))) {
                        e2 e2VarP = ((S0) this.f2872c).p(((e2) this.f2871b).f2594d, true);
                        if (e2VarP == null) {
                            return;
                        }
                        S0 s13 = (S0) this.f2872c;
                        if (s13.f2346h) {
                            synchronized (s13.f2347i) {
                                S0 s14 = (S0) this.f2872c;
                                s14.f2352o = s14.f2352o.c((e2) this.f2871b, e2VarP);
                                break;
                            }
                        }
                        ((S0) this.f2872c).f2340b.execute(new c2(this, e2VarP, 1));
                        return;
                    }
                    if (a10 != A.DROPPED) {
                        ((S0) this.f2872c).f2353p.set(true);
                        S0 s15 = (S0) this.f2872c;
                        Integer numValueOf = null;
                        if (!s15.f2346h) {
                            g2 g2Var = s15.f2344f;
                            long nanos = 0;
                            if (g2Var == null) {
                                z1 = new Z1(false, 0L);
                            } else {
                                boolean zContains = g2Var.f2649f.contains(r0Var.f859a);
                                String str = (String) e0Var.c(S0.f2332F);
                                if (str != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str);
                                    } catch (NumberFormatException unused) {
                                        numValueOf = -1;
                                    }
                                }
                                boolean z11 = (s15.f2350m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !s15.f2350m.a();
                                if (s15.f2344f.f2644a <= ((e2) this.f2871b).f2594d + 1 || z11) {
                                    z10 = false;
                                } else if (numValueOf == null) {
                                    if (zContains) {
                                        nanos = (long) (S0.f2334H.nextDouble() * s15.f2360x);
                                        double d10 = s15.f2360x;
                                        g2 g2Var2 = s15.f2344f;
                                        s15.f2360x = Math.min((long) (d10 * g2Var2.f2647d), g2Var2.f2646c);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                } else if (numValueOf.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                    s15.f2360x = s15.f2344f.f2645b;
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z1 = new Z1(z10, nanos);
                            }
                            if (z1.f2437b) {
                                e2 e2VarP2 = ((S0) this.f2872c).p(((e2) this.f2871b).f2594d + 1, false);
                                if (e2VarP2 == null) {
                                    return;
                                }
                                synchronized (((S0) this.f2872c).f2347i) {
                                    s8 = (S0) this.f2872c;
                                    uVar = new D4.u(s8.f2347i);
                                    s8.f2358v = uVar;
                                    break;
                                }
                                uVar.r(s8.f2342d.schedule(new c2(this, e2VarP2, 0), z1.f2438c, TimeUnit.NANOSECONDS));
                                return;
                            }
                            break;
                        } else {
                            String str2 = (String) e0Var.c(S0.f2332F);
                            if (str2 != null) {
                                try {
                                    numValueOf = Integer.valueOf(str2);
                                } catch (NumberFormatException unused2) {
                                    numValueOf = -1;
                                }
                            }
                            S0 s16 = (S0) this.f2872c;
                            boolean zContains2 = s16.f2345g.f2724c.contains(r0Var.f859a);
                            boolean z12 = (s16.f2350m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !s16.f2350m.a();
                            if (zContains2 && !z12 && !r0Var.e() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            boolean z13 = zContains2 && !z12;
                            if (z13) {
                                S0.n((S0) this.f2872c, numValueOf);
                            }
                            synchronized (((S0) this.f2872c).f2347i) {
                                try {
                                    S0 s17 = (S0) this.f2872c;
                                    s17.f2352o = s17.f2352o.b((e2) this.f2871b);
                                    if (z13) {
                                        S0 s18 = (S0) this.f2872c;
                                        if (!s18.t(s18.f2352o)) {
                                            if (!((S0) this.f2872c).f2352o.f2489d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } else {
                        S0 s19 = (S0) this.f2872c;
                        if (s19.f2346h) {
                            s19.s();
                        }
                    }
                    break;
                }
                S0 s20 = (S0) this.f2872c;
                R1 r1O3 = s20.o((e2) this.f2871b);
                if (r1O3 != null) {
                    s20.f2340b.execute(r1O3);
                }
                if (((S0) this.f2872c).f2352o.f2491f == ((e2) this.f2871b)) {
                    ((S0) this.f2872c).u(r0Var, a10, e0Var);
                    return;
                }
                return;
        }
    }

    @Override // D8.B
    public void t(B8.e0 e0Var) {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        switch (this.f2870a) {
            case 2:
                ((B) this.f2871b).t(e0Var);
                break;
            default:
                if (((e2) this.f2871b).f2594d > 0) {
                    B8.Z z10 = S0.f2331E;
                    e0Var.a(z10);
                    e0Var.f(z10, String.valueOf(((e2) this.f2871b).f2594d));
                }
                S0 s8 = (S0) this.f2872c;
                e2 e2Var = (e2) this.f2871b;
                B8.Z z11 = S0.f2331E;
                R1 r1O = s8.o(e2Var);
                if (r1O != null) {
                    s8.f2340b.execute(r1O);
                }
                if (((S0) this.f2872c).f2352o.f2491f == ((e2) this.f2871b)) {
                    f2 f2Var = ((S0) this.f2872c).f2350m;
                    if (f2Var != null) {
                        do {
                            atomicInteger = f2Var.f2633d;
                            i10 = atomicInteger.get();
                            i11 = f2Var.f2630a;
                            if (i10 == i11) {
                            }
                        } while (!atomicInteger.compareAndSet(i10, Math.min(f2Var.f2632c + i10, i11)));
                    }
                    ((S0) this.f2872c).f2341c.execute(new K(22, this, e0Var));
                }
                break;
        }
    }

    public String toString() {
        switch (this.f2870a) {
            case 2:
                U.P pF = p228v8.a.f(this);
                pF.c((B) this.f2871b, "delegate");
                return pF.toString();
            default:
                return super.toString();
        }
    }

    @Override // D8.B
    public void u() {
        switch (this.f2870a) {
            case 2:
                ((B) this.f2871b).u();
                break;
            default:
                S0 s8 = (S0) this.f2872c;
                if (s8.a()) {
                    s8.f2341c.execute(new d2(this, 1));
                    break;
                }
                break;
        }
    }

    @Override // D8.B
    public void x(F5.i iVar) {
        switch (this.f2870a) {
            case 2:
                ((B) this.f2871b).x(iVar);
                break;
            default:
                b2 b2Var = ((S0) this.f2872c).f2352o;
                p229v9.a.o("Headers should be received prior to messages.", b2Var.f2491f != null);
                if (b2Var.f2491f == ((e2) this.f2871b)) {
                    ((S0) this.f2872c).f2341c.execute(new K(23, this, iVar));
                } else {
                    Logger logger = AbstractC0291l0.f2684a;
                    while (true) {
                        InputStream inputStreamA = iVar.A();
                        if (inputStreamA != null) {
                            AbstractC0291l0.b(inputStreamA);
                        }
                    }
                }
                break;
        }
    }

    public z2() {
        this.f2870a = 0;
        x2 x2Var = x2.f2840b;
        this.f2872c = r2.n();
        this.f2871b = x2Var;
    }

    public z2(String str) {
        this.f2870a = 1;
        B8.T tA = B8.T.a();
        p229v9.a.k(tA, "registry");
        this.f2871b = tA;
        p229v9.a.k(str, "defaultPolicy");
        this.f2872c = str;
    }
}
