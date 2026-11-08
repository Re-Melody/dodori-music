package p261z;

import p230w.AbstractC2272e;
import p230w.C2289w;
import p230w.InterfaceC2280m;
import p230w.n0;

/* JADX INFO: renamed from: z.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2400f implements InterfaceC2396d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f29581b = AbstractC2272e.p(125, 0, new C2289w(0.25f, 0.1f, 0.25f, 1.0f), 2);

    @Override // p261z.InterfaceC2396d
    public final float a(float f10, float f11, float f12) {
        float fAbs = Math.abs((f11 + f10) - f10);
        float f13 = (0.3f * f12) - (0.0f * fAbs);
        float f14 = f12 - f13;
        if ((fAbs <= f12) && f14 < fAbs) {
            f13 = f12 - fAbs;
        }
        return f10 - f13;
    }

    @Override // p261z.InterfaceC2396d
    public final InterfaceC2280m b() {
        return this.f29581b;
    }
}
