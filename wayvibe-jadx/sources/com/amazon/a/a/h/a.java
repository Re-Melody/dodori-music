package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16114a = "name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16115b = "time";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16116c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f16117d;

    public a(String str) {
        HashMap map = new HashMap();
        this.f16117d = map;
        map.put("name", str);
        map.put(f16115b, String.valueOf(System.currentTimeMillis()));
    }

    public a a(String str, String str2) {
        this.f16117d.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.f16117d.toString() + "]";
    }

    public Map<String, String> a() {
        return this.f16117d;
    }
}
