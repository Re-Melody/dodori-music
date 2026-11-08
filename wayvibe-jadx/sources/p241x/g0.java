package p241x;

import D0.InterfaceC0195v;
import M8.D;
import Z8.a;
import kotlin.jvm.internal.n;
import p133m0.c;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f28196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(i0 i0Var, int i10) {
        super(0);
        this.f28195a = i10;
        this.f28196b = i0Var;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f28195a) {
            case 0:
                InterfaceC0195v interfaceC0195v = (InterfaceC0195v) this.f28196b.f28209g.getValue();
                return new c(interfaceC0195v != null ? interfaceC0195v.d0(0L) : 9205357640488583168L);
            case 1:
                return new c(this.f28196b.f28211i);
            default:
                this.f28196b.q0();
                return D.f8402a;
        }
    }
}
