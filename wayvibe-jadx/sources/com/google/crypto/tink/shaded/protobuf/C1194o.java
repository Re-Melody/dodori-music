package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1194o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C1194o f18477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1194o f18478b;

    static {
        C1194o c1194o = new C1194o();
        Map map = Collections.EMPTY_MAP;
        f18478b = c1194o;
    }

    public static C1194o a() {
        C1194o c1194o;
        b0 b0Var = b0.f18412c;
        C1194o c1194o2 = f18477a;
        if (c1194o2 != null) {
            return c1194o2;
        }
        synchronized (C1194o.class) {
            try {
                c1194o = f18477a;
                if (c1194o == null) {
                    Class cls = AbstractC1193n.f18469a;
                    C1194o c1194o3 = null;
                    if (cls != null) {
                        try {
                            c1194o3 = (C1194o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c1194o = c1194o3 != null ? c1194o3 : f18478b;
                    f18477a = c1194o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1194o;
    }
}
