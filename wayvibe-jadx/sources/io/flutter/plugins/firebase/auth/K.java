package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f20835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20838e;

    public static K a(ArrayList arrayList) {
        K k = new K();
        k.f20834a = (String) arrayList.get(0);
        Double d10 = (Double) arrayList.get(1);
        if (d10 == null) {
            throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
        }
        k.f20835b = d10;
        k.f20836c = (String) arrayList.get(2);
        String str = (String) arrayList.get(3);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        k.f20837d = str;
        k.f20838e = (String) arrayList.get(4);
        return k;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f20834a);
        arrayList.add(this.f20835b);
        arrayList.add(this.f20836c);
        arrayList.add(this.f20837d);
        arrayList.add(this.f20838e);
        return arrayList;
    }
}
