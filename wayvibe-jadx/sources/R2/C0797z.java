package R2;

import B2.AbstractC0111a;
import F2.h0;
import android.util.Pair;
import p255y2.C2346w;

/* JADX INFO: renamed from: R2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0797z extends f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p255y2.N f10888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p255y2.M f10889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0795x f10890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0794w f10891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10892q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10893s;

    public C0797z(AbstractC0773a abstractC0773a, boolean z10) {
        super(abstractC0773a);
        this.f10887l = z10 && abstractC0773a.i();
        this.f10888m = new p255y2.N();
        this.f10889n = new p255y2.M();
        p255y2.O oG = abstractC0773a.g();
        if (oG == null) {
            this.f10890o = new C0795x(new C0796y(abstractC0773a.h()), p255y2.N.f28785q, C0795x.f10883e);
        } else {
            this.f10890o = new C0795x(oG, null, null);
            this.f10893s = true;
        }
    }

    @Override // R2.f0
    public final void A() {
        if (this.f10887l) {
            return;
        }
        this.f10892q = true;
        x(null, this.k);
    }

    @Override // R2.AbstractC0773a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final C0794w b(D d10, V2.e eVar, long j10) {
        C0794w c0794w = new C0794w(d10, eVar, j10);
        AbstractC0111a.h(c0794w.f10879d == null);
        AbstractC0773a abstractC0773a = this.k;
        c0794w.f10879d = abstractC0773a;
        if (!this.r) {
            this.f10891p = c0794w;
            if (!this.f10892q) {
                this.f10892q = true;
                x(null, abstractC0773a);
            }
            return c0794w;
        }
        Object obj = this.f10890o.f10885d;
        Object obj2 = d10.f10651a;
        if (obj != null && obj2.equals(C0795x.f10883e)) {
            obj2 = this.f10890o.f10885d;
        }
        c0794w.a(d10.a(obj2));
        return c0794w;
    }

    public final boolean C(long j10) {
        C0794w c0794w = this.f10891p;
        int iB = this.f10890o.b(c0794w.f10876a.f10651a);
        if (iB == -1) {
            return false;
        }
        C0795x c0795x = this.f10890o;
        p255y2.M m8 = this.f10889n;
        c0795x.f(iB, m8, false);
        long j11 = m8.f28781d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c0794w.f10882g = j10;
        return true;
    }

    @Override // R2.AbstractC0773a
    public final void n(C c3) {
        C0794w c0794w = (C0794w) c3;
        if (c0794w.f10880e != null) {
            AbstractC0773a abstractC0773a = c0794w.f10879d;
            abstractC0773a.getClass();
            abstractC0773a.n(c0794w.f10880e);
        }
        if (c3 == this.f10891p) {
            this.f10891p = null;
        }
    }

    @Override // R2.AbstractC0782j, R2.AbstractC0773a
    public final void p() {
        this.r = false;
        this.f10892q = false;
        super.p();
    }

    @Override // R2.f0, R2.AbstractC0773a
    public final void s(C2346w c2346w) {
        if (this.f10893s) {
            C0795x c0795x = this.f10890o;
            this.f10890o = new C0795x(new h0(this.f10890o.f10868b, c2346w), c0795x.f10884c, c0795x.f10885d);
        } else {
            this.f10890o = new C0795x(new C0796y(c2346w), p255y2.N.f28785q, C0795x.f10883e);
        }
        this.k.s(c2346w);
    }

    @Override // R2.f0
    public final D y(D d10) {
        Object obj = d10.f10651a;
        Object obj2 = this.f10890o.f10885d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0795x.f10883e;
        }
        return d10.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // R2.f0
    public final void z(p255y2.O o10) {
        long j10;
        C0795x c0795x;
        D dA;
        C0795x c0795x2;
        if (this.r) {
            C0795x c0795x3 = this.f10890o;
            this.f10890o = new C0795x(o10, c0795x3.f10884c, c0795x3.f10885d);
            C0794w c0794w = this.f10891p;
            if (c0794w != null) {
                C(c0794w.f10882g);
            }
        } else {
            if (!o10.p()) {
                p255y2.N n6 = this.f10888m;
                o10.n(0, n6);
                long j11 = n6.f28796l;
                Object obj = n6.f28786a;
                C0794w c0794w2 = this.f10891p;
                if (c0794w2 != null) {
                    C0795x c0795x4 = this.f10890o;
                    Object obj2 = c0794w2.f10876a.f10651a;
                    p255y2.M m8 = this.f10889n;
                    c0795x4.g(obj2, m8);
                    long j12 = m8.f28782e + c0794w2.f10877b;
                    this.f10890o.m(0, n6, 0L);
                    if (j12 != n6.f28796l) {
                        j10 = j12;
                    } else {
                        j10 = j11;
                    }
                } else {
                    j10 = j11;
                }
                Pair pairI = o10.i(this.f10888m, this.f10889n, 0, j10);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.f10893s) {
                    C0795x c0795x5 = this.f10890o;
                    c0795x = new C0795x(o10, c0795x5.f10884c, c0795x5.f10885d);
                } else {
                    c0795x = new C0795x(o10, obj, obj3);
                }
                this.f10890o = c0795x;
                C0794w c0794w3 = this.f10891p;
                if (c0794w3 != null && C(jLongValue)) {
                    D d10 = c0794w3.f10876a;
                    Object obj4 = this.f10890o.f10885d;
                    Object obj5 = d10.f10651a;
                    if (obj4 != null && obj5.equals(C0795x.f10883e)) {
                        obj5 = this.f10890o.f10885d;
                    }
                    dA = d10.a(obj5);
                }
                this.f10893s = true;
                this.r = true;
                m(this.f10890o);
                if (dA != null) {
                    C0794w c0794w4 = this.f10891p;
                    c0794w4.getClass();
                    c0794w4.a(dA);
                }
            }
            if (this.f10893s) {
                C0795x c0795x6 = this.f10890o;
                c0795x2 = new C0795x(o10, c0795x6.f10884c, c0795x6.f10885d);
            } else {
                c0795x2 = new C0795x(o10, p255y2.N.f28785q, C0795x.f10883e);
            }
            this.f10890o = c0795x2;
        }
        dA = null;
        this.f10893s = true;
        this.r = true;
        m(this.f10890o);
        if (dA != null) {
            C0794w c0794w5 = this.f10891p;
            c0794w5.getClass();
            c0794w5.a(dA);
        }
    }

    @Override // R2.AbstractC0782j, R2.AbstractC0773a
    public final void j() {
    }
}
