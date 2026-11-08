package U;

/* JADX INFO: renamed from: U.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0894k extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11879a;

    public C0894k(String str) {
        this.f11879a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f11879a;
    }
}
