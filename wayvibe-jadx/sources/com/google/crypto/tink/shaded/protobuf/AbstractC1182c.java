package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1182c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f18415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f18416b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f18415a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f18416b = cls2 != null;
    }

    public static boolean a() {
        return (f18415a == null || f18416b) ? false : true;
    }
}
