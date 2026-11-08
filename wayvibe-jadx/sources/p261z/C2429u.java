package p261z;

import M8.D;
import Q8.d;
import R8.a;
import U.C0880d;
import U.C0891i0;
import U.U;
import Z8.c;
import Z8.e;
import kotlin.jvm.internal.n;
import p119k9.F;
import p241x.k0;
import p241x.n0;

/* JADX INFO: renamed from: z.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2429u implements InterfaceC2432v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f29672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2427t f29673b = new C2427t(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f29674c = new n0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0891i0 f29675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0891i0 f29676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0891i0 f29677f;

    /* JADX WARN: Multi-variable type inference failed */
    public C2429u(c cVar) {
        this.f29672a = (n) cVar;
        Boolean bool = Boolean.FALSE;
        U u10 = U.f11815f;
        this.f29675d = C0880d.K(bool, u10);
        this.f29676e = C0880d.K(bool, u10);
        this.f29677f = C0880d.K(bool, u10);
    }

    @Override // p261z.InterfaceC2432v0
    public final boolean a() {
        return ((Boolean) this.f29675d.getValue()).booleanValue();
    }

    @Override // p261z.InterfaceC2432v0
    public final Object b(k0 k0Var, e eVar, d dVar) {
        Object objH = F.h(new C2425s(this, k0Var, eVar, null), dVar);
        return objH == a.COROUTINE_SUSPENDED ? objH : D.f8402a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // p261z.InterfaceC2432v0
    public final float e(float f10) {
        return ((Number) this.f29672a.invoke(Float.valueOf(f10))).floatValue();
    }
}
