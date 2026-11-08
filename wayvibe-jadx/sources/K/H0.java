package K;

import U.C0880d;
import U.C0883e0;
import U.C0891i0;
import p261z.EnumC2391a0;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W4.m f6866f = p206t6.b.J(G0.f6860a, C0570j.f7009l);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0883e0 f6867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0883e0 f6868b = C0880d.I(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p133m0.d f6869c = p133m0.d.f22183e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6870d = O0.K.f8890b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0891i0 f6871e;

    public H0(EnumC2391a0 enumC2391a0, float f10) {
        this.f6867a = C0880d.I(f10);
        this.f6871e = C0880d.K(enumC2391a0, U.U.f11815f);
    }

    public final void a(EnumC2391a0 enumC2391a0, p133m0.d dVar, int i10, int i11) {
        float f10;
        float f11 = i11 - i10;
        this.f6868b.r(f11);
        p133m0.d dVar2 = this.f6869c;
        float f12 = dVar2.f22184a;
        float f13 = dVar.f22184a;
        C0883e0 c0883e0 = this.f6867a;
        float f14 = dVar.f22185b;
        if (f13 != f12 || f14 != dVar2.f22185b) {
            boolean z10 = enumC2391a0 == EnumC2391a0.Vertical;
            if (z10) {
                f13 = f14;
            }
            float f15 = z10 ? dVar.f22187d : dVar.f22186c;
            float fM = c0883e0.m();
            float f16 = i10;
            float f17 = fM + f16;
            if (f15 <= f17 && (f13 >= fM || f15 - f13 <= f16)) {
                f10 = (f13 >= fM || f15 - f13 > f16) ? 0.0f : f13 - fM;
            } else {
                f10 = f15 - f17;
            }
            c0883e0.r(c0883e0.m() + f10);
            this.f6869c = dVar;
        }
        c0883e0.r(R3.a.m(c0883e0.m(), 0.0f, f11));
    }
}
