package G;

import U.C0880d;
import U.C0891i0;
import U.U;

/* JADX INFO: renamed from: G.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0439d extends H {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final W4.m f4753H = p206t6.b.J(C0437b.f4749a, C0438c.f4750b);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0891i0 f4754G;

    public C0439d(int i10, float f10, Z8.a aVar) {
        super(i10, f10);
        this.f4754G = C0880d.K(aVar, U.f11815f);
    }

    @Override // G.H
    public final int l() {
        return ((Number) ((Z8.a) this.f4754G.getValue()).invoke()).intValue();
    }
}
