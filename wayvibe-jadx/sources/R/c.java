package R;

import M8.D;
import p151n9.InterfaceC2105g;
import p151n9.InterfaceC2106h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC2105g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2105g f10604b;

    public /* synthetic */ c(InterfaceC2105g interfaceC2105g, int i10) {
        this.f10603a = i10;
        this.f10604b = interfaceC2105g;
    }

    @Override // p151n9.InterfaceC2105g
    public final Object collect(InterfaceC2106h interfaceC2106h, Q8.d dVar) {
        switch (this.f10603a) {
            case 0:
                Object objCollect = this.f10604b.collect(new b(interfaceC2106h, 0), dVar);
                return objCollect == R8.a.COROUTINE_SUSPENDED ? objCollect : D.f8402a;
            default:
                Object objCollect2 = this.f10604b.collect(new b(interfaceC2106h, 4), dVar);
                return objCollect2 == R8.a.COROUTINE_SUSPENDED ? objCollect2 : D.f8402a;
        }
    }
}
