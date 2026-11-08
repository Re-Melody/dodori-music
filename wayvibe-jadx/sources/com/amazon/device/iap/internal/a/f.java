package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16782a = 3715222306172636179L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16785d;

    public f(String str, String str2, String str3) {
        this.f16783b = str;
        this.f16784c = str2;
        this.f16785d = str3;
    }

    public String a() {
        return this.f16783b;
    }

    public String b() {
        return this.f16784c;
    }

    public String c() {
        return this.f16785d;
    }

    public f(String str, String str2, String str3, Throwable th) {
        super(th);
        this.f16783b = str;
        this.f16784c = str2;
        this.f16785d = str3;
    }
}
