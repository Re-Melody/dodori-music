package p207t7;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f26929d = new k(null, null, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f26931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26932c;

    public k(k kVar, String str, int i10) {
        this.f26931b = kVar;
        this.f26932c = str;
        this.f26930a = i10;
    }

    public final String toString() {
        int i10 = this.f26930a;
        if (i10 == 0) {
            return "";
        }
        String str = this.f26932c;
        if (i10 == 1) {
            return str;
        }
        return this.f26931b.toString() + "." + str;
    }
}
