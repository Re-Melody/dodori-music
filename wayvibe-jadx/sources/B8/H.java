package B8;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLong f732d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f735c;

    public H(String str, long j10, String str2) {
        p229v9.a.k(str, "typeName");
        p229v9.a.g("empty type", !str.isEmpty());
        this.f733a = str;
        this.f734b = str2;
        this.f735c = j10;
    }

    public static H a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new H(simpleName, f732d.incrementAndGet(), str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f733a + "<" + this.f735c + ">");
        String str = this.f734b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
