package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20841b;

    public static M a(ArrayList arrayList) {
        M m8 = new M();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
        }
        m8.f20840a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
        }
        m8.f20841b = str2;
        return m8;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f20840a);
        arrayList.add(this.f20841b);
        return arrayList;
    }
}
