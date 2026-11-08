package com.amazon.device.iap.internal.a;

/* JADX INFO: loaded from: classes.dex */
public class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16772a = 7955687159702952249L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16774c;

    public e(String str, String str2) {
        this.f16773b = str;
        this.f16774c = str2;
    }

    public String a() {
        return this.f16773b;
    }

    public String b() {
        return this.f16774c;
    }

    public e(String str, String str2, Throwable th) {
        super(th);
        this.f16773b = str;
        this.f16774c = str2;
    }
}
