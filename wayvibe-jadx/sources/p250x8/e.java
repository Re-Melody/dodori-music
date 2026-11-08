package p250x8;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28635b;

    public e(String str, String str2) {
        this.f28634a = str;
        this.f28635b = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f28635b;
    }
}
