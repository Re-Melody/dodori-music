package p005a1;

import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f14102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i10) {
        super(0);
        this.f14101a = i10;
        this.f14102b = nVar;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f14101a) {
            case 0:
                return Float.valueOf(this.f14102b.a());
            default:
                return this.f14102b;
        }
    }
}
