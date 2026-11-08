package U;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p199t.B f11818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U0(p199t.B b10, int i10) {
        super(1);
        this.f11817a = i10;
        this.f11818b = b10;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f11817a) {
            case 0:
                if (obj instanceof p048e0.B) {
                    ((p048e0.B) obj).f(4);
                }
                this.f11818b.a(obj);
                return M8.D.f8402a;
            default:
                return obj == this.f11818b ? "(this)" : String.valueOf(obj);
        }
    }
}
