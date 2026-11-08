package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X f18409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f18410b;

    static {
        X x10;
        b0 b0Var = b0.f18412c;
        try {
            x10 = (X) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x10 = null;
        }
        f18409a = x10;
        f18410b = new X();
    }
}
