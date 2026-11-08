package S;

import p230w.h0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f10976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(h0 h0Var, int i10) {
        super(0);
        this.f10975a = i10;
        this.f10976b = h0Var;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f10975a) {
            case 0:
                return Boolean.valueOf(((Number) this.f10976b.f27713h.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) this.f10976b.f27713h.getValue()).floatValue() > 0.0f);
        }
    }
}
