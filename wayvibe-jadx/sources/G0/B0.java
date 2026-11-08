package G0;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M3.f f4946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(boolean z10, M3.f fVar, String str) {
        super(0);
        this.f4945a = z10;
        this.f4946b = fVar;
        this.f4947c = str;
    }

    @Override // Z8.a
    public final Object invoke() {
        if (this.f4945a) {
            M3.f fVar = this.f4946b;
            fVar.getClass();
            String key = this.f4947c;
            kotlin.jvm.internal.m.f(key, "key");
            fVar.f8263a.c(key);
        }
        return M8.D.f8402a;
    }
}
