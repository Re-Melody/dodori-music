package com.amazon.device.iap.internal.b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16800a = "KEY_TIMESTAMP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16801b = "KEY_REQUEST_ID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16802c = "KEY_USER_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16803d = "KEY_RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f16806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f16807h;

    public c(String str, String str2, String str3, long j10) {
        this.f16804e = str;
        this.f16805f = str2;
        this.f16807h = str3;
        this.f16806g = j10;
    }

    public String a() {
        return this.f16804e;
    }

    public String b() {
        return this.f16807h;
    }

    public String c() {
        return this.f16805f;
    }

    public long d() {
        return this.f16806g;
    }

    public String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f16802c, this.f16804e);
        jSONObject.put(f16803d, this.f16805f);
        jSONObject.put(f16801b, this.f16807h);
        jSONObject.put(f16800a, this.f16806g);
        return jSONObject.toString();
    }

    public static c a(String str) throws b {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(f16802c), jSONObject.getString(f16803d), jSONObject.getString(f16801b), jSONObject.getLong(f16800a));
        } catch (Throwable th) {
            throw new b(p134m1.b.k("Input invalid for PendingReceipt Object:", str), th);
        }
    }
}
