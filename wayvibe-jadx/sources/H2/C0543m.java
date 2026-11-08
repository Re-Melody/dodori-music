package H2;

/* JADX INFO: renamed from: H2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0543m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0543m f5922d = new C0542l().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5925c;

    public C0543m(C0542l c0542l) {
        this.f5923a = c0542l.f5919a;
        this.f5924b = c0542l.f5920b;
        this.f5925c = c0542l.f5921c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0543m.class != obj.getClass()) {
            return false;
        }
        C0543m c0543m = (C0543m) obj;
        return this.f5923a == c0543m.f5923a && this.f5924b == c0543m.f5924b && this.f5925c == c0543m.f5925c;
    }

    public final int hashCode() {
        return ((this.f5923a ? 1 : 0) << 2) + ((this.f5924b ? 1 : 0) << 1) + (this.f5925c ? 1 : 0);
    }
}
