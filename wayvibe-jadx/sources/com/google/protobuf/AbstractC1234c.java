package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1234c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f18730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f18731b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f18730a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f18731b = cls2 != null;
    }

    public static boolean a() {
        return (f18730a == null || f18731b) ? false : true;
    }
}
