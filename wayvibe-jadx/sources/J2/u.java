package J2;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6549c;

    public u(String str) {
        this.f6547a = 1;
        this.f6548b = "LibraryVersion";
        this.f6549c = (str == null || str.length() <= 0) ? null : str;
    }

    public String toString() {
        switch (this.f6547a) {
            case 0:
                return this.f6548b + ", " + this.f6549c;
            default:
                return super.toString();
        }
    }

    public u(String str, String str2) {
        this.f6547a = 0;
        this.f6548b = str;
        this.f6549c = str2;
    }
}
