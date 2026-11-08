package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1277y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1275x f18820a = new C1275x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1275x f18821b;

    static {
        C1275x c1275x;
        try {
            c1275x = (C1275x) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c1275x = null;
        }
        f18821b = c1275x;
    }
}
