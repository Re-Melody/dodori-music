package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f18380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f18381b;

    static {
        I i10;
        b0 b0Var = b0.f18412c;
        try {
            i10 = (I) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            i10 = null;
        }
        f18380a = i10;
        f18381b = new I();
    }
}
