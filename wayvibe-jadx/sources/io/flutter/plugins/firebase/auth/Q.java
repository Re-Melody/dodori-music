package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S f20853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f20854b;

    public static Q a(ArrayList arrayList) {
        Q q5 = new Q();
        S s8 = (S) arrayList.get(0);
        if (s8 == null) {
            throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
        }
        q5.f20853a = s8;
        List list = (List) arrayList.get(1);
        if (list == null) {
            throw new IllegalStateException("Nonnull field \"providerData\" is null.");
        }
        q5.f20854b = list;
        return q5;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f20853a);
        arrayList.add(this.f20854b);
        return arrayList;
    }
}
