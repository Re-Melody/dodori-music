package C;

import G0.C0480j1;
import G0.K0;

/* JADX INFO: renamed from: C.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0144c0 extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144c0(float f10, float f11, float f12, float f13) {
        super(1);
        this.f988a = f10;
        this.f989b = f11;
        this.f990c = f12;
        this.f991d = f13;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        K0 k10 = (K0) obj;
        k10.f5040a = "padding";
        p028c1.e eVar = new p028c1.e(this.f988a);
        C0480j1 c0480j1 = k10.f5042c;
        c0480j1.c(eVar, "start");
        c0480j1.c(new p028c1.e(this.f989b), "top");
        c0480j1.c(new p028c1.e(this.f990c), "end");
        c0480j1.c(new p028c1.e(this.f991d), "bottom");
        return M8.D.f8402a;
    }
}
