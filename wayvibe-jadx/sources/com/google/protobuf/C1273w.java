package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1273w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C1273w f18818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1273w f18819b;

    static {
        C1273w c1273w = new C1273w();
        Map map = Collections.EMPTY_MAP;
        f18819b = c1273w;
    }

    public static C1273w a() {
        C1273w c1273w;
        C1273w c1273w2 = f18818a;
        if (c1273w2 != null) {
            return c1273w2;
        }
        synchronized (C1273w.class) {
            try {
                c1273w = f18818a;
                if (c1273w == null) {
                    Class cls = AbstractC1271v.f18817a;
                    C1273w c1273w3 = null;
                    if (cls != null) {
                        try {
                            c1273w3 = (C1273w) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c1273w = c1273w3 != null ? c1273w3 : f18819b;
                    f18818a = c1273w;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1273w;
    }
}
