package p253y0;

import F0.A0;
import F0.AbstractC0388f;
import Q5.b;
import Q8.d;
import R8.a;
import com.apple.android.music.playback.model.MediaPlayerException;
import p028c1.o;
import p067g0.q;
import p119k9.C;
import p133m0.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q implements A0, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f28749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f28750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28751c;

    public g(a aVar, d dVar) {
        this.f28749a = aVar;
        this.f28750b = dVar == null ? new d() : dVar;
        this.f28751c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r12 == r1) goto L32;
     */
    @Override // p253y0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(long r10, Q8.d r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p253y0.f
            if (r0 == 0) goto L13
            r0 = r12
            y0.f r0 = (p253y0.f) r0
            int r1 = r0.f28748e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28748e = r1
            goto L1a
        L13:
            y0.f r0 = new y0.f
            S8.c r12 = (S8.c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.f28746c
            R8.a r1 = R8.a.COROUTINE_SUSPENDED
            int r2 = r0.f28748e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            long r10 = r0.f28745b
            Q5.b.T(r12)
            goto L85
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            long r10 = r0.f28745b
            y0.g r2 = r0.f28744a
            Q5.b.T(r12)
            goto L66
        L3f:
            Q5.b.T(r12)
            boolean r12 = r9.isAttached()
            if (r12 == 0) goto L55
            boolean r12 = r9.isAttached()
            if (r12 == 0) goto L55
            F0.A0 r12 = F0.AbstractC0388f.k(r9)
            y0.g r12 = (p253y0.g) r12
            goto L56
        L55:
            r12 = r3
        L56:
            if (r12 == 0) goto L6e
            r0.f28744a = r9
            r0.f28745b = r10
            r0.f28748e = r5
            java.lang.Object r12 = r12.P(r10, r0)
            if (r12 != r1) goto L65
            goto L84
        L65:
            r2 = r9
        L66:
            c1.o r12 = (p028c1.o) r12
            long r5 = r12.f15864a
        L6a:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L72
        L6e:
            r5 = 0
            r2 = r9
            goto L6a
        L72:
            y0.a r12 = r2.f28749a
            long r5 = p028c1.o.d(r5, r10)
            r0.f28744a = r3
            r0.f28745b = r10
            r0.f28748e = r4
            java.lang.Object r12 = r12.P(r5, r0)
            if (r12 != r1) goto L85
        L84:
            return r1
        L85:
            c1.o r12 = (p028c1.o) r12
            long r0 = r12.f15864a
            long r10 = p028c1.o.e(r10, r0)
            c1.o r12 = new c1.o
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p253y0.g.P(long, Q8.d):java.lang.Object");
    }

    @Override // p253y0.a
    public final long W(int i10, long j10, long j11) {
        long jW = this.f28749a.W(i10, j10, j11);
        g gVar = null;
        if (isAttached() && isAttached()) {
            gVar = (g) AbstractC0388f.k(this);
        }
        g gVar2 = gVar;
        return c.h(jW, gVar2 != null ? gVar2.W(i10, c.h(j10, jW), c.g(j11, jW)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p253y0.a
    public final Object Z(long j10, long j11, d dVar) {
        e eVar;
        g gVar;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f28743f;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                eVar.f28743f = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                eVar = new e(this, (S8.c) dVar);
            }
        } else {
            eVar = new e(this, (S8.c) dVar);
        }
        e eVar2 = eVar;
        Object objZ = eVar2.f28741d;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = eVar2.f28743f;
        if (i11 != 0) {
            if (i11 == 1) {
                j13 = eVar2.f28740c;
                j12 = eVar2.f28739b;
                gVar = eVar2.f28738a;
                b.T(objZ);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j16 = eVar2.f28739b;
                b.T(objZ);
            }
            j15 = ((o) objZ).f15864a;
            j14 = j16;
            return new o(o.e(j14, j15));
        }
        b.T(objZ);
        a aVar2 = this.f28749a;
        eVar2.f28738a = this;
        eVar2.f28739b = j10;
        eVar2.f28740c = j11;
        eVar2.f28743f = 1;
        objZ = aVar2.Z(j10, j11, eVar2);
        if (objZ != aVar) {
            gVar = this;
            j12 = j10;
            j13 = j11;
        }
        return aVar;
        j14 = ((o) objZ).f15864a;
        g gVar2 = (gVar.isAttached() && gVar.isAttached()) ? (g) AbstractC0388f.k(gVar) : null;
        if (gVar2 != null) {
            long jE = o.e(j12, j14);
            long jD = o.d(j13, j14);
            eVar2.f28738a = null;
            eVar2.f28739b = j14;
            eVar2.f28743f = 2;
            objZ = gVar2.Z(jE, jD, eVar2);
            if (objZ != aVar) {
                j16 = j14;
                j15 = ((o) objZ).f15864a;
                j14 = j16;
            }
            return aVar;
        }
        j15 = 0;
        return new o(o.e(j14, j15));
    }

    @Override // F0.A0
    public final Object g() {
        return this.f28751c;
    }

    public final C o0() {
        g gVar = isAttached() ? (g) AbstractC0388f.k(this) : null;
        if (gVar != null) {
            return gVar.o0();
        }
        C c3 = this.f28750b.f28737c;
        if (c3 != null) {
            return c3;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // p067g0.q
    public final void onAttach() {
        d dVar = this.f28750b;
        dVar.f28735a = this;
        dVar.f28736b = new Z0.b(this, 18);
        dVar.f28737c = getCoroutineScope();
    }

    @Override // p067g0.q
    public final void onDetach() {
        d dVar = this.f28750b;
        if (dVar.f28735a == this) {
            dVar.f28735a = null;
        }
    }

    @Override // p253y0.a
    public final long w(int i10, long j10) {
        g gVar = null;
        if (isAttached() && isAttached()) {
            gVar = (g) AbstractC0388f.k(this);
        }
        long jW = gVar != null ? gVar.w(i10, j10) : 0L;
        return c.h(jW, this.f28749a.w(i10, c.g(j10, jW)));
    }
}
