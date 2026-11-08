package com.amazon.a.a.o.b.a;

import V0.p;
import com.amazon.a.a.n.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.amazon.a.a.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f16435a = 1;

    private b(String str, String str2) {
        super("SIGNED_TOKEN_PARSE_FAILURE", str, str2);
    }

    public static b a(Throwable th) {
        return new b("DECODE", th.getMessage());
    }

    public static b d() {
        return new b("INVALID_FORMAT", null);
    }

    public static b a(String str) {
        return new b(g.f16259b, str);
    }

    public static b a(String str, String str2) {
        return new b("INVALID_FIELD_VALUE", p.B(str, ":", str2));
    }
}
