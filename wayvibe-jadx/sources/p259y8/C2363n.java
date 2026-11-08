package p259y8;

import M8.D;
import R8.a;
import p069g2.d;
import p151n9.InterfaceC2105g;
import p151n9.InterfaceC2106h;

/* JADX INFO: renamed from: y8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2363n implements InterfaceC2105g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2105g f29169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f29170c;

    public /* synthetic */ C2363n(InterfaceC2105g interfaceC2105g, d dVar, int i10) {
        this.f29168a = i10;
        this.f29169b = interfaceC2105g;
        this.f29170c = dVar;
    }

    @Override // p151n9.InterfaceC2105g
    public final Object collect(InterfaceC2106h interfaceC2106h, Q8.d dVar) {
        switch (this.f29168a) {
            case 0:
                Object objCollect = this.f29169b.collect(new C2362m(interfaceC2106h, this.f29170c, 0), dVar);
                return objCollect == a.COROUTINE_SUSPENDED ? objCollect : D.f8402a;
            case 1:
                Object objCollect2 = this.f29169b.collect(new C2362m(interfaceC2106h, this.f29170c, 1), dVar);
                return objCollect2 == a.COROUTINE_SUSPENDED ? objCollect2 : D.f8402a;
            case 2:
                Object objCollect3 = this.f29169b.collect(new C2362m(interfaceC2106h, this.f29170c, 2), dVar);
                return objCollect3 == a.COROUTINE_SUSPENDED ? objCollect3 : D.f8402a;
            default:
                Object objCollect4 = this.f29169b.collect(new C2362m(interfaceC2106h, this.f29170c, 3), dVar);
                return objCollect4 == a.COROUTINE_SUSPENDED ? objCollect4 : D.f8402a;
        }
    }
}
