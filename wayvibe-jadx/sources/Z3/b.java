package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f13609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f13610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f13611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f13612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f13613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f13614j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13616b;

    static {
        int i10 = 0;
        f13607c = new b("NONE", i10);
        f13608d = new b("FULL", i10);
        int i11 = 1;
        f13609e = new b("VERTICAL", i11);
        f13610f = new b("HORIZONTAL", i11);
        int i12 = 2;
        f13611g = new b("FLAT", i12);
        f13612h = new b("HALF_OPENED", i12);
        int i13 = 3;
        f13613i = new b("FOLD", i13);
        f13614j = new b("HINGE", i13);
    }

    public /* synthetic */ b(String str, int i10) {
        this.f13615a = i10;
        this.f13616b = str;
    }

    public String toString() {
        switch (this.f13615a) {
            case 0:
                return (String) this.f13616b;
            case 1:
                return (String) this.f13616b;
            case 2:
                return (String) this.f13616b;
            case 3:
                return (String) this.f13616b;
            default:
                return super.toString();
        }
    }

    public b(p008a4.a aVar) {
        this.f13615a = 4;
        o oVar = o.f13644b;
        this.f13616b = aVar;
    }
}
