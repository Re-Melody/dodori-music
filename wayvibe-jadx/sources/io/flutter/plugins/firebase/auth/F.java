package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f20807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f20810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20812h;

    public static F a(ArrayList arrayList) {
        F f10 = new F();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }
        f10.f20805a = str;
        f10.f20806b = (String) arrayList.get(1);
        Boolean bool = (Boolean) arrayList.get(2);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
        }
        f10.f20807c = bool;
        f10.f20808d = (String) arrayList.get(3);
        f10.f20809e = (String) arrayList.get(4);
        Boolean bool2 = (Boolean) arrayList.get(5);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
        }
        f10.f20810f = bool2;
        f10.f20811g = (String) arrayList.get(6);
        f10.f20812h = (String) arrayList.get(7);
        return f10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(this.f20805a);
        arrayList.add(this.f20806b);
        arrayList.add(this.f20807c);
        arrayList.add(this.f20808d);
        arrayList.add(this.f20809e);
        arrayList.add(this.f20810f);
        arrayList.add(this.f20811g);
        arrayList.add(this.f20812h);
        return arrayList;
    }
}
