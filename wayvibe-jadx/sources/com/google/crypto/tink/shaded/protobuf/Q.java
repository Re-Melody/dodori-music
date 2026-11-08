package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f18389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f18390b;

    static {
        P p10;
        b0 b0Var = b0.f18412c;
        try {
            p10 = (P) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            p10 = null;
        }
        f18389a = p10;
        f18390b = new P();
    }
}
