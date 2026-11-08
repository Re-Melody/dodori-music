package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16196a = "RESPONSE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16197b = "RESET_OFFSET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16198d = "RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16199e = "KIWI_EXECUTION_RESULT_CODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16200f = "RECEIPT_DELIVERED";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16201g = "PURCHASE_REQUEST_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f16202h = "userId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f16203i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f16204c = new HashMap();

    public Object a(String str) {
        return this.f16204c.get(str);
    }

    public boolean b(String str) {
        return this.f16204c.containsKey(str);
    }

    public Object c(String str) {
        return this.f16204c.remove(str);
    }

    public void a(String str, Object obj) {
        this.f16204c.put(str, obj);
    }

    public Object b() {
        return this.f16204c.get(f16196a);
    }

    public void c() {
        this.f16204c.remove(f16196a);
    }

    public boolean a(Class cls) {
        return b(f16196a) && a(f16196a).getClass().equals(cls);
    }

    public void a() {
        this.f16204c.clear();
    }

    public void a(Object obj) {
        if (!f16203i && obj == null) {
            throw new AssertionError();
        }
        this.f16204c.put(f16196a, obj);
    }
}
