package M0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z8.e f8109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8110c;

    public u(String str, Z8.e eVar) {
        this.f8108a = str;
        this.f8109b = eVar;
    }

    public final void a(v vVar, Object obj) {
        ((j) vVar).c(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f8108a;
    }

    public /* synthetic */ u(String str) {
        this(str, q.f8073m);
    }

    public u(String str, boolean z10, Z8.e eVar) {
        this(str, eVar);
        this.f8110c = z10;
    }
}
