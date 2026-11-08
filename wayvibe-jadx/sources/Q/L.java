package Q;

import U.C0906q;
import U.InterfaceC0898m;

/* JADX INFO: loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.n implements Z8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f9931b = new L(3, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L f9932c = new L(3, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L f9933d = new L(3, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L f9934e = new L(3, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i10, int i11) {
        super(i10);
        this.f9935a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    @Override // Z8.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9935a) {
            case 0:
                InterfaceC0898m interfaceC0898m = (InterfaceC0898m) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    C0906q c0906q = (C0906q) interfaceC0898m;
                    if (c0906q.z()) {
                        c0906q.N();
                    }
                }
                return M8.D.f8402a;
            case 1:
                InterfaceC0898m interfaceC0898m2 = (InterfaceC0898m) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    C0906q c0906q2 = (C0906q) interfaceC0898m2;
                    if (c0906q2.z()) {
                        c0906q2.N();
                    }
                }
                return M8.D.f8402a;
            case 2:
                L0 l10 = (L0) obj;
                InterfaceC0898m interfaceC0898m3 = (InterfaceC0898m) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C0906q) interfaceC0898m3).f(l10) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    C0906q c0906q3 = (C0906q) interfaceC0898m3;
                    if (c0906q3.z()) {
                        c0906q3.N();
                    } else {
                        c1.b(l10, null, null, 0L, 0L, 0L, 0L, 0L, interfaceC0898m3, iIntValue & 14, 510);
                    }
                } else {
                    c1.b(l10, null, null, 0L, 0L, 0L, 0L, 0L, interfaceC0898m3, iIntValue & 14, 510);
                }
                return M8.D.f8402a;
            default:
                D0.O o10 = (D0.O) obj;
                long j10 = ((p028c1.a) obj3).f15843a;
                int iY = o10.Y(AbstractC0764v0.f10501a);
                int i10 = iY * 2;
                D0.X xE = ((D0.L) obj2).E(D7.W.X(j10, 0, i10));
                return o10.S(xE.f1762a, xE.f1763b - i10, N8.t.f8651a, new D.w(xE, iY, 2));
        }
    }
}
