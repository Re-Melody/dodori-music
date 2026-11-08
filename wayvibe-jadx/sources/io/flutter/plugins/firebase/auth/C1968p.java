package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: renamed from: io.flutter.plugins.firebase.auth.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1968p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20932c;

    public static C1968p a(ArrayList arrayList) {
        C1968p c1968p = new C1968p();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"appName\" is null.");
        }
        c1968p.f20930a = str;
        c1968p.f20931b = (String) arrayList.get(1);
        c1968p.f20932c = (String) arrayList.get(2);
        return c1968p;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f20930a);
        arrayList.add(this.f20931b);
        arrayList.add(this.f20932c);
        return arrayList;
    }
}
