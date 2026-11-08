package Q;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D0.X f9993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D0.X f9995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.X f9998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(D0.X x10, int i10, D0.X x11, int i11, int i12, D0.X x12, int i13, int i14) {
        super(1);
        this.f9993a = x10;
        this.f9994b = i10;
        this.f9995c = x11;
        this.f9996d = i11;
        this.f9997e = i12;
        this.f9998f = x12;
        this.f9999g = i13;
        this.f10000h = i14;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        D0.W w10 = (D0.W) obj;
        D0.W.f(w10, this.f9993a, 0, this.f9994b);
        D0.X x10 = this.f9995c;
        if (x10 != null) {
            D0.W.f(w10, x10, this.f9996d, this.f9997e);
        }
        D0.X x11 = this.f9998f;
        if (x11 != null) {
            D0.W.f(w10, x11, this.f9999g, this.f10000h);
        }
        return M8.D.f8402a;
    }
}
