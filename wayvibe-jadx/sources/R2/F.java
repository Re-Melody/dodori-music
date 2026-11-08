package R2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K2.f f10657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0793v f10659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f10660e;

    public /* synthetic */ F(K2.f fVar, H h10, C0793v c0793v, A a10, int i10) {
        this.f10656a = i10;
        this.f10657b = fVar;
        this.f10658c = h10;
        this.f10659d = c0793v;
        this.f10660e = a10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R2.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [R2.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [R2.H, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10656a) {
            case 0:
                K2.f fVar = this.f10657b;
                int i10 = fVar.f7358a;
                this.f10658c.x(i10, fVar.f7359b, this.f10659d, this.f10660e);
                break;
            case 1:
                K2.f fVar2 = this.f10657b;
                int i11 = fVar2.f7358a;
                this.f10658c.y(i11, fVar2.f7359b, this.f10659d, this.f10660e);
                break;
            default:
                K2.f fVar3 = this.f10657b;
                int i12 = fVar3.f7358a;
                this.f10658c.r(i12, fVar3.f7359b, this.f10659d, this.f10660e);
                break;
        }
    }
}
