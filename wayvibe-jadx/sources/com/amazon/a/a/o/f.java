package com.amazon.a.a.o;

import V0.p;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(p.n(str, " must not be null"));
        }
    }

    public static void a(String str, String str2) {
        if (a(str)) {
            throw new IllegalArgumentException(p.n(str2, " must not be null or empty"));
        }
    }

    public static void a(Collection<? extends Object> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(p.n(str, " must not be empty"));
        }
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }
}
