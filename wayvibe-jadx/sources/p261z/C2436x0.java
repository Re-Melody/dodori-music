package p261z;

import p241x.r0;

/* JADX INFO: renamed from: z.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2436x0 implements InterfaceC2399e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f29694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2440z0 f29695b;

    public C2436x0(C0 c3, C2440z0 c2440z0) {
        this.f29694a = c3;
        this.f29695b = c2440z0;
    }

    @Override // p261z.InterfaceC2399e0
    public final float a(float f10) {
        C0 c3 = this.f29694a;
        long jD = c3.d(c3.g(f10));
        C0 c9 = this.f29695b.f29705a;
        c9.f29370g = 2;
        r0 r0Var = c9.f29365b;
        return c3.c(c3.f((r0Var == null || !(c9.f29364a.d() || c9.f29364a.c())) ? C0.a(c9, c9.f29371h, jD, 2) : r0Var.a(jD, c9.f29370g, c9.f29373j)));
    }
}
