package F6;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f4551e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4553b;

    static {
        int i10 = 0;
        f4549c = new c("ENABLED", i10);
        f4550d = new c("DISABLED", i10);
        f4551e = new c("DESTROYED", i10);
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f4552a = i10;
        this.f4553b = obj;
    }

    public String toString() {
        switch (this.f4552a) {
            case 0:
                return (String) this.f4553b;
            default:
                return super.toString();
        }
    }
}
