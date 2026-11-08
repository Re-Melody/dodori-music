package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1257n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1255m0 f18773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1255m0 f18774b;

    static {
        C1255m0 c1255m0;
        try {
            c1255m0 = (C1255m0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c1255m0 = null;
        }
        f18773a = c1255m0;
        f18774b = new C1255m0();
    }
}
