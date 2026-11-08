package p143n0;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import kotlin.jvm.internal.m;
import p028c1.b;
import p028c1.k;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22734j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f22735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f22736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c0 f22738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f22740q;
    public b r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f22741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2090q f22742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Q f22743u;

    public final void A(float f10) {
        if (this.f22729e == f10) {
            return;
        }
        this.f22725a |= 8;
        this.f22729e = f10;
    }

    public final void E(float f10) {
        if (this.f22730f == f10) {
            return;
        }
        this.f22725a |= 16;
        this.f22730f = f10;
    }

    @Override // p028c1.b
    public final float K() {
        return this.r.K();
    }

    @Override // p028c1.b
    public final float a() {
        return this.r.a();
    }

    public final void b(float f10) {
        if (this.f22728d == f10) {
            return;
        }
        this.f22725a |= 4;
        this.f22728d = f10;
    }

    public final void d(long j10) {
        if (C2096x.c(this.f22732h, j10)) {
            return;
        }
        this.f22725a |= 64;
        this.f22732h = j10;
    }

    public final void g(boolean z10) {
        if (this.f22739p != z10) {
            this.f22725a |= 16384;
            this.f22739p = z10;
        }
    }

    public final void h(X x10) {
        if (m.b(this.f22742t, x10)) {
            return;
        }
        this.f22725a |= 131072;
        this.f22742t = (C2090q) x10;
    }

    public final void l(float f10) {
        if (this.f22734j == f10) {
            return;
        }
        this.f22725a |= 256;
        this.f22734j = f10;
    }

    public final void m(float f10) {
        if (this.k == f10) {
            return;
        }
        this.f22725a |= 512;
        this.k = f10;
    }

    public final void n(float f10) {
        if (this.f22735l == f10) {
            return;
        }
        this.f22725a |= 1024;
        this.f22735l = f10;
    }

    public final void q(float f10) {
        if (this.f22726b == f10) {
            return;
        }
        this.f22725a |= 1;
        this.f22726b = f10;
    }

    public final void s(float f10) {
        if (this.f22727c == f10) {
            return;
        }
        this.f22725a |= 2;
        this.f22727c = f10;
    }

    public final void t(float f10) {
        if (this.f22731g == f10) {
            return;
        }
        this.f22725a |= 32;
        this.f22731g = f10;
    }

    public final void v(c0 c0Var) {
        if (m.b(this.f22738o, c0Var)) {
            return;
        }
        this.f22725a |= 8192;
        this.f22738o = c0Var;
    }

    public final void w(long j10) {
        if (C2096x.c(this.f22733i, j10)) {
            return;
        }
        this.f22725a |= ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
        this.f22733i = j10;
    }

    public final void x(long j10) {
        if (g0.a(this.f22737n, j10)) {
            return;
        }
        this.f22725a |= 4096;
        this.f22737n = j10;
    }
}
