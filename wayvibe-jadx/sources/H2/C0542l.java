package H2;

/* JADX INFO: renamed from: H2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0542l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5921c;

    public final C0543m a() {
        if (this.f5919a || !(this.f5920b || this.f5921c)) {
            return new C0543m(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
