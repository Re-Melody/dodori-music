package F2;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final R2.D f4079u = new R2.D(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p255y2.O f4080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R2.D f4081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0420m f4085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R2.d0 f4087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U2.u f4088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f4089j;
    public final R2.D k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p255y2.F f4093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f4094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f4095q;
    public volatile long r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f4096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f4097t;

    public d0(p255y2.O o10, R2.D d10, long j10, long j11, int i10, C0420m c0420m, boolean z10, R2.d0 d0Var, U2.u uVar, List list, R2.D d11, boolean z11, int i11, int i12, p255y2.F f10, long j12, long j13, long j14, long j15, boolean z12) {
        this.f4080a = o10;
        this.f4081b = d10;
        this.f4082c = j10;
        this.f4083d = j11;
        this.f4084e = i10;
        this.f4085f = c0420m;
        this.f4086g = z10;
        this.f4087h = d0Var;
        this.f4088i = uVar;
        this.f4089j = list;
        this.k = d11;
        this.f4090l = z11;
        this.f4091m = i11;
        this.f4092n = i12;
        this.f4093o = f10;
        this.f4095q = j12;
        this.r = j13;
        this.f4096s = j14;
        this.f4097t = j15;
        this.f4094p = z12;
    }

    public static d0 i(U2.u uVar) {
        p255y2.L l10 = p255y2.O.f28801a;
        R2.D d10 = f4079u;
        return new d0(l10, d10, -9223372036854775807L, 0L, 1, null, false, R2.d0.f10813d, uVar, A6.W.f329e, d10, false, 1, 0, p255y2.F.f28760d, 0L, 0L, 0L, 0L, false);
    }

    public final d0 a() {
        return new d0(this.f4080a, this.f4081b, this.f4082c, this.f4083d, this.f4084e, this.f4085f, this.f4086g, this.f4087h, this.f4088i, this.f4089j, this.k, this.f4090l, this.f4091m, this.f4092n, this.f4093o, this.f4095q, this.r, j(), SystemClock.elapsedRealtime(), this.f4094p);
    }

    public final d0 b(R2.D d10) {
        return new d0(this.f4080a, this.f4081b, this.f4082c, this.f4083d, this.f4084e, this.f4085f, this.f4086g, this.f4087h, this.f4088i, this.f4089j, d10, this.f4090l, this.f4091m, this.f4092n, this.f4093o, this.f4095q, this.r, this.f4096s, this.f4097t, this.f4094p);
    }

    public final d0 c(R2.D d10, long j10, long j11, long j12, long j13, R2.d0 d0Var, U2.u uVar, List list) {
        return new d0(this.f4080a, d10, j11, j12, this.f4084e, this.f4085f, this.f4086g, d0Var, uVar, list, this.k, this.f4090l, this.f4091m, this.f4092n, this.f4093o, this.f4095q, j13, j10, SystemClock.elapsedRealtime(), this.f4094p);
    }

    public final d0 d(int i10, int i11, boolean z10) {
        return new d0(this.f4080a, this.f4081b, this.f4082c, this.f4083d, this.f4084e, this.f4085f, this.f4086g, this.f4087h, this.f4088i, this.f4089j, this.k, z10, i10, i11, this.f4093o, this.f4095q, this.r, this.f4096s, this.f4097t, this.f4094p);
    }

    public final d0 e(C0420m c0420m) {
        return new d0(this.f4080a, this.f4081b, this.f4082c, this.f4083d, this.f4084e, c0420m, this.f4086g, this.f4087h, this.f4088i, this.f4089j, this.k, this.f4090l, this.f4091m, this.f4092n, this.f4093o, this.f4095q, this.r, this.f4096s, this.f4097t, this.f4094p);
    }

    public final d0 f(p255y2.F f10) {
        return new d0(this.f4080a, this.f4081b, this.f4082c, this.f4083d, this.f4084e, this.f4085f, this.f4086g, this.f4087h, this.f4088i, this.f4089j, this.k, this.f4090l, this.f4091m, this.f4092n, f10, this.f4095q, this.r, this.f4096s, this.f4097t, this.f4094p);
    }

    public final d0 g(int i10) {
        return new d0(this.f4080a, this.f4081b, this.f4082c, this.f4083d, i10, this.f4085f, this.f4086g, this.f4087h, this.f4088i, this.f4089j, this.k, this.f4090l, this.f4091m, this.f4092n, this.f4093o, this.f4095q, this.r, this.f4096s, this.f4097t, this.f4094p);
    }

    public final d0 h(p255y2.O o10) {
        return new d0(o10, this.f4081b, this.f4082c, this.f4083d, this.f4084e, this.f4085f, this.f4086g, this.f4087h, this.f4088i, this.f4089j, this.k, this.f4090l, this.f4091m, this.f4092n, this.f4093o, this.f4095q, this.r, this.f4096s, this.f4097t, this.f4094p);
    }

    public final long j() {
        long j10;
        long j11;
        if (!k()) {
            return this.f4096s;
        }
        do {
            j10 = this.f4097t;
            j11 = this.f4096s;
        } while (j10 != this.f4097t);
        return B2.C.I(B2.C.T(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f4093o.f28761a)));
    }

    public final boolean k() {
        return this.f4084e == 3 && this.f4090l && this.f4092n == 0;
    }
}
