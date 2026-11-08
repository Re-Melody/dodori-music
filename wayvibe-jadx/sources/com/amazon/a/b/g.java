package com.amazon.a.b;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16530a = "license";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16531b = "customerId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16532c = "deviceId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16535f;

    public g(Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        if (map == null) {
            throw com.amazon.a.a.n.a.a.g.d();
        }
        this.f16533d = a(f16530a, map);
        this.f16534e = a(f16531b, map);
        this.f16535f = a(f16532c, map);
    }

    private String a(String str, Map<String, String> map) throws com.amazon.a.a.n.a.a.g {
        String str2 = map.get(str);
        if (a(str2)) {
            throw com.amazon.a.a.n.a.a.g.a(str);
        }
        return str2;
    }

    public String b() {
        return this.f16535f;
    }

    public String c() {
        return this.f16533d;
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public String a() {
        return this.f16534e;
    }
}
