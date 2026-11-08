package C;

import G0.C0480j1;
import G0.K0;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(float f10, float f11, int i10) {
        super(1);
        this.f965a = i10;
        this.f966b = f10;
        this.f967c = f11;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f965a) {
            case 0:
                K0 k10 = (K0) obj;
                k10.f5040a = "offset";
                p028c1.e eVar = new p028c1.e(this.f966b);
                C0480j1 c0480j1 = k10.f5042c;
                c0480j1.c(eVar, "x");
                c0480j1.c(new p028c1.e(this.f967c), "y");
                break;
            default:
                K0 k11 = (K0) obj;
                k11.f5040a = "padding";
                p028c1.e eVar2 = new p028c1.e(this.f966b);
                C0480j1 c0480j2 = k11.f5042c;
                c0480j2.c(eVar2, "horizontal");
                c0480j2.c(new p028c1.e(this.f967c), "vertical");
                break;
        }
        return M8.D.f8402a;
    }
}
