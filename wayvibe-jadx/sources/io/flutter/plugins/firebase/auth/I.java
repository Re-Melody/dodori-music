package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f20822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f20826e;

    public static I a(ArrayList arrayList) {
        I i10 = new I();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
        }
        i10.f20822a = bool;
        i10.f20823b = (String) arrayList.get(1);
        i10.f20824c = (String) arrayList.get(2);
        i10.f20825d = (String) arrayList.get(3);
        i10.f20826e = (Boolean) arrayList.get(4);
        return i10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f20822a);
        arrayList.add(this.f20823b);
        arrayList.add(this.f20824c);
        arrayList.add(this.f20825d);
        arrayList.add(this.f20826e);
        return arrayList;
    }
}
