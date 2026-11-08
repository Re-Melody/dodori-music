package p241x;

import B.n;
import Q8.d;
import R8.a;
import U.C0880d;
import U.C0885f0;
import U.C0914u0;
import U.D;
import W4.m;
import Z8.e;
import com.google.android.gms.common.api.f;
import p037d0.o;
import p261z.C2429u;
import p261z.InterfaceC2432v0;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements InterfaceC2432v0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f28093i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0885f0 f28094a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f28098e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0885f0 f28095b = C0880d.J(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f28096c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0885f0 f28097d = C0880d.J(f.API_PRIORITY_OTHER);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2429u f28099f = new C2429u(new C0914u0(this, 18));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f28100g = C0880d.D(new A0(this, 1));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D f28101h = C0880d.D(new A0(this, 0));

    static {
        z0 z0Var = z0.f28315a;
        r rVar = r.f28285f;
        m mVar = o.f19046a;
        f28093i = new m(10, z0Var, rVar);
    }

    public B0(int i10) {
        this.f28094a = C0880d.J(i10);
    }

    @Override // p261z.InterfaceC2432v0
    public final boolean a() {
        return this.f28099f.a();
    }

    @Override // p261z.InterfaceC2432v0
    public final Object b(k0 k0Var, e eVar, d dVar) {
        Object objB = this.f28099f.b(k0Var, eVar, dVar);
        return objB == a.COROUTINE_SUSPENDED ? objB : M8.D.f8402a;
    }

    @Override // p261z.InterfaceC2432v0
    public final boolean c() {
        return ((Boolean) this.f28101h.getValue()).booleanValue();
    }

    @Override // p261z.InterfaceC2432v0
    public final boolean d() {
        return ((Boolean) this.f28100g.getValue()).booleanValue();
    }

    @Override // p261z.InterfaceC2432v0
    public final float e(float f10) {
        return this.f28099f.e(f10);
    }
}
