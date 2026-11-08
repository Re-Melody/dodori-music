package com.amazon.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16091a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16094d;

    public b(String str) {
        this(str, (String) null);
    }

    public final String a() {
        return this.f16092b;
    }

    public final String b() {
        return this.f16093c;
    }

    public final String c() {
        return this.f16094d;
    }

    public b(String str, String str2) {
        this(str, str2, (String) null);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        Throwable thC = c(th);
        StringBuilder sb = new StringBuilder();
        sb.append(b(th));
        sb.append(":");
        sb.append(th.getMessage());
        if (th != thC) {
            sb.append("/");
            sb.append(b(thC));
            sb.append(":");
            sb.append(thC.getMessage());
        }
        return sb.toString();
    }

    private static String b(Throwable th) {
        return th.getClass().getName();
    }

    private static Throwable c(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public b(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.f16092b = str;
        this.f16093c = str2;
        this.f16094d = str3;
    }

    public b(String str, Throwable th) {
        this(str, b(th), th);
    }

    public b(String str, String str2, Throwable th) {
        this(str, str2, a(th));
    }
}
