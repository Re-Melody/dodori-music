package U;

/* JADX INFO: renamed from: U.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0904p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11900b;

    public /* synthetic */ C0904p(Object obj, int i10) {
        this.f11899a = i10;
        this.f11900b = obj;
    }

    public final void a() {
        switch (this.f11899a) {
            case 0:
                ((C0906q) this.f11900b).f11946z--;
                break;
            default:
                ((p048e0.w) this.f11900b).f19542j--;
                break;
        }
    }

    public final void b() {
        switch (this.f11899a) {
            case 0:
                ((C0906q) this.f11900b).f11946z++;
                break;
            default:
                ((p048e0.w) this.f11900b).f19542j++;
                break;
        }
    }
}
