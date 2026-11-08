package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1270u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1268t0 f18815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1268t0 f18816b;

    static {
        C1268t0 c1268t0;
        try {
            c1268t0 = (C1268t0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c1268t0 = null;
        }
        f18815a = c1268t0;
        f18816b = new C1268t0();
    }
}
