package p241x;

import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0 f28091b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(B0 b10, int i10) {
        super(0);
        this.f28090a = i10;
        this.f28091b = b10;
    }

    @Override // Z8.a
    public final Object invoke() {
        switch (this.f28090a) {
            case 0:
                return Boolean.valueOf(this.f28091b.f28094a.m() > 0);
            default:
                B0 b10 = this.f28091b;
                return Boolean.valueOf(b10.f28094a.m() < b10.f28097d.m());
        }
    }
}
