package D0;

/* JADX INFO: renamed from: D0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0184j implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0183i f1802b = new C0183i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0183i f1803c = new C0183i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0183i f1804d = new C0183i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0187m f1805e = new C0187m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0184j f1806f = new C0184j(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1807a;

    public /* synthetic */ C0184j(int i10) {
        this.f1807a = i10;
    }

    @Override // D0.m0
    public boolean b(Object obj, Object obj2) {
        return false;
    }

    @Override // D0.m0
    public void n(l0 l0Var) {
        l0Var.clear();
    }

    public String toString() {
        switch (this.f1807a) {
            case 2:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
