package F;

import D0.h0;
import D0.j0;
import android.os.Trace;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f3504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0 f3505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X f3509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.t f3511j;

    public Y(android.support.v4.media.session.t tVar, int i10, long j10, Z z10) {
        this.f3511j = tVar;
        this.f3502a = i10;
        this.f3503b = j10;
        this.f3504c = z10;
    }

    @Override // F.J
    public final void a() {
        this.f3510i = true;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [Z8.c, kotlin.jvm.internal.n] */
    public final boolean b(C0356a c0356a) {
        List list;
        X x10;
        if (c()) {
            Object objE = ((InterfaceC0378x) ((C0376v) this.f3511j.f14411b).f3561b.invoke()).e(this.f3502a);
            boolean z10 = this.f3505d != null;
            Z z11 = this.f3504c;
            if (!z10) {
                long jC = (objE == null || ((p199t.x) z11.f3514c).b(objE) < 0) ? z11.f3512a : ((p199t.x) z11.f3514c).c(objE);
                long jA = c0356a.a();
                if ((!this.f3510i || jA <= 0) && jC >= jA) {
                    return true;
                }
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    d();
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (objE != null) {
                        p199t.x xVar = (p199t.x) z11.f3514c;
                        int iB = xVar.b(objE);
                        ((p199t.x) z11.f3514c).e(Z.c(z11, jNanoTime2, iB >= 0 ? xVar.f26347c[iB] : 0L), objE);
                    }
                    z11.f3512a = Z.c(z11, jNanoTime2, z11.f3512a);
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (!this.f3510i) {
                if (!this.f3508g) {
                    if (c0356a.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        h0 h0Var = this.f3505d;
                        if (h0Var == null) {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                        h0Var.c(new A9.I(yVar, 1));
                        List list2 = (List) yVar.f21873a;
                        if (list2 != null) {
                            x10 = new X();
                            x10.f3501e = this;
                            x10.f3499c = list2;
                            x10.f3500d = new List[list2.size()];
                            if (list2.isEmpty()) {
                                throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                            }
                        } else {
                            x10 = null;
                        }
                        this.f3509h = x10;
                        this.f3508g = true;
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                X x11 = this.f3509h;
                if (x11 != null) {
                    List[] listArr = (List[]) x11.f3500d;
                    int i10 = x11.f3497a;
                    List list3 = (List) x11.f3499c;
                    if (i10 < list3.size()) {
                        if (((Y) x11.f3501e).f3507f) {
                            throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (x11.f3497a < list3.size()) {
                            try {
                                if (listArr[x11.f3497a] == null) {
                                    if (c0356a.a() <= 0) {
                                        Trace.endSection();
                                        return true;
                                    }
                                    int i11 = x11.f3497a;
                                    K k = (K) list3.get(i11);
                                    ?? r11 = k.f3465a;
                                    if (r11 == 0) {
                                        list = N8.s.f8650a;
                                    } else {
                                        I i12 = new I(k);
                                        r11.invoke(i12);
                                        list = i12.f3463a;
                                    }
                                    listArr[i11] = list;
                                }
                                List list4 = listArr[x11.f3497a];
                                kotlin.jvm.internal.m.c(list4);
                                while (x11.f3498b < list4.size()) {
                                    if (((Y) list4.get(x11.f3498b)).b(c0356a)) {
                                        Trace.endSection();
                                        return true;
                                    }
                                    x11.f3498b++;
                                }
                                x11.f3498b = 0;
                                x11.f3497a++;
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                        Trace.endSection();
                    }
                }
            }
            if (!this.f3506e) {
                long j10 = this.f3503b;
                if (!p028c1.a.k(j10)) {
                    long jC2 = (objE == null || ((p199t.x) z11.f3515d).b(objE) < 0) ? z11.f3513b : ((p199t.x) z11.f3515d).c(objE);
                    long jA2 = c0356a.a();
                    if ((!this.f3510i || jA2 <= 0) && jC2 >= jA2) {
                        return true;
                    }
                    long jNanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j10);
                        Trace.endSection();
                        long jNanoTime4 = System.nanoTime() - jNanoTime3;
                        if (objE != null) {
                            p199t.x xVar2 = (p199t.x) z11.f3515d;
                            int iB2 = xVar2.b(objE);
                            ((p199t.x) z11.f3515d).e(Z.c(z11, jNanoTime4, iB2 >= 0 ? xVar2.f26347c[iB2] : 0L), objE);
                        }
                        z11.f3513b = Z.c(z11, jNanoTime4, z11.f3513b);
                        return false;
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.f3507f) {
            return false;
        }
        int iB = ((InterfaceC0378x) ((C0376v) this.f3511j.f14411b).f3561b.invoke()).b();
        int i10 = this.f3502a;
        return i10 >= 0 && i10 < iB;
    }

    @Override // F.J
    public final void cancel() {
        if (this.f3507f) {
            return;
        }
        this.f3507f = true;
        h0 h0Var = this.f3505d;
        if (h0Var != null) {
            h0Var.dispose();
        }
        this.f3505d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f3505d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        android.support.v4.media.session.t tVar = this.f3511j;
        InterfaceC0378x interfaceC0378x = (InterfaceC0378x) ((C0376v) tVar.f14411b).f3561b.invoke();
        int i10 = this.f3502a;
        Object objC = interfaceC0378x.c(i10);
        this.f3505d = ((j0) tVar.f14412c).a().f(objC, ((C0376v) tVar.f14411b).a(i10, objC, interfaceC0378x.e(i10)));
    }

    public final void e(long j10) {
        if (this.f3507f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f3506e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f3506e = true;
        h0 h0Var = this.f3505d;
        if (h0Var == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int iA = h0Var.a();
        for (int i10 = 0; i10 < iA; i10++) {
            h0Var.b(i10, j10);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f3502a);
        sb.append(", constraints = ");
        sb.append((Object) p028c1.a.l(this.f3503b));
        sb.append(", isComposed = ");
        sb.append(this.f3505d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f3506e);
        sb.append(", isCanceled = ");
        sb.append(this.f3507f);
        sb.append(" }");
        return sb.toString();
    }
}
