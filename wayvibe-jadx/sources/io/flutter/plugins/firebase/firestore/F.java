package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f20975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f20976b;

    public static F a(ArrayList arrayList) {
        F f10 = new F();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
        }
        f10.f20975a = bool;
        Boolean bool2 = (Boolean) arrayList.get(1);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
        }
        f10.f20976b = bool2;
        return f10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f20975a);
        arrayList.add(this.f20976b);
        return arrayList;
    }
}
