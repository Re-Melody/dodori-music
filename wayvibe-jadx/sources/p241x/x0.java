package p241x;

import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f28307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i10) {
        super(0);
        this.f28306a = i10;
        this.f28307b = y0Var;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f28306a) {
            case 0:
                return Float.valueOf(this.f28307b.f28313a.f28094a.m());
            default:
                return Float.valueOf(this.f28307b.f28313a.f28097d.m());
        }
    }
}
