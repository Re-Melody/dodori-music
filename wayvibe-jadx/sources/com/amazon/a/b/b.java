package com.amazon.a.b;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f16507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16508e;

    public b(com.amazon.a.a.o.b.f fVar) {
        this.f16504a = a("checksum", fVar);
        this.f16505b = a("customerId", fVar);
        this.f16506c = a("deviceId", fVar);
        this.f16508e = a("packageName", fVar);
        this.f16507d = b("expiration", fVar);
    }

    private String a(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = fVar.a(str);
        if (com.amazon.a.a.o.e.a(strA)) {
            throw com.amazon.a.a.o.b.a.b.a(str);
        }
        return strA;
    }

    private Date b(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = a(str, fVar);
        try {
            return new Date(Long.parseLong(strA));
        } catch (NumberFormatException unused) {
            throw com.amazon.a.a.o.b.a.b.a(str, strA);
        }
    }

    public String c() {
        return this.f16506c;
    }

    public Date d() {
        return this.f16507d;
    }

    public String e() {
        return this.f16508e;
    }

    public String a() {
        return this.f16504a;
    }

    public String b() {
        return this.f16505b;
    }
}
