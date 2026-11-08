package p068g1;

import M8.D;
import U.C0906q;
import U.InterfaceC0898m;
import Z8.e;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f20003b = new l(2, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f20004c = new l(2, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11) {
        super(i10);
        this.f20005a = i11;
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20005a) {
            case 0:
                InterfaceC0898m interfaceC0898m = (InterfaceC0898m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0906q c0906q = (C0906q) interfaceC0898m;
                    if (c0906q.z()) {
                        c0906q.N();
                    }
                }
                break;
            default:
                InterfaceC0898m interfaceC0898m2 = (InterfaceC0898m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0906q c0906q2 = (C0906q) interfaceC0898m2;
                    if (c0906q2.z()) {
                        c0906q2.N();
                    }
                }
                break;
        }
        return D.f8402a;
    }
}
