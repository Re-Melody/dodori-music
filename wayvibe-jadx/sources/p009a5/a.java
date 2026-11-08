package p009a5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14134c;

    public a(String str, String str2, String str3) {
        this.f14132a = str;
        this.f14133b = str2;
        this.f14134c = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f14133b;
    }
}
