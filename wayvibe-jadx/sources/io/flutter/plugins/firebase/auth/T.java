package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f20868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f20869d;

    public static T a(ArrayList arrayList) {
        T t10 = new T();
        t10.f20866a = (String) arrayList.get(0);
        t10.f20867b = (String) arrayList.get(1);
        Boolean bool = (Boolean) arrayList.get(2);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
        }
        t10.f20868c = bool;
        Boolean bool2 = (Boolean) arrayList.get(3);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
        }
        t10.f20869d = bool2;
        return t10;
    }
}
