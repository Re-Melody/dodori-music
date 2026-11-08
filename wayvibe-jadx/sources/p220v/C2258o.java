package p220v;

import Z8.a;
import kotlin.jvm.internal.n;
import p230w.k0;

/* JADX INFO: renamed from: v.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2258o extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f27399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2258o(k0 k0Var, int i10) {
        super(0);
        this.f27398a = i10;
        this.f27399b = k0Var;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f27398a) {
            case 0:
                k0 k0Var = this.f27399b;
                Object objC = k0Var.c();
                EnumC2266x enumC2266x = EnumC2266x.PostExit;
                return Boolean.valueOf(objC == enumC2266x && k0Var.f27727d.getValue() == enumC2266x);
            default:
                return Long.valueOf(this.f27399b.b());
        }
    }
}
