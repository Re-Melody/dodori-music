package D;

import F.InterfaceC0378x;
import U.InterfaceC0877b0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0877b0 f1632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(InterfaceC0877b0 interfaceC0877b0, int i10) {
        super(0);
        this.f1631a = i10;
        this.f1632b = interfaceC0877b0;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f1631a) {
            case 0:
                return new h((Z8.c) this.f1632b.getValue());
            case 1:
                return new E.h((Z8.c) this.f1632b.getValue());
            case 2:
                return (InterfaceC0378x) ((Z8.a) this.f1632b.getValue()).invoke();
            case 3:
                InterfaceC0877b0 interfaceC0877b0 = this.f1632b;
                if (interfaceC0877b0 != null) {
                    return (List) interfaceC0877b0.getValue();
                }
                return null;
            case 4:
                Boolean bool = (Boolean) this.f1632b.getValue();
                bool.booleanValue();
                return bool;
            default:
                return (P.h) this.f1632b.getValue();
        }
    }
}
