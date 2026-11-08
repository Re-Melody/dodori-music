package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f20956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f20958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f20959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f20960e;

    public static B a(ArrayList arrayList) {
        Long lValueOf;
        B b10 = new B();
        b10.f20956a = (Boolean) arrayList.get(0);
        b10.f20957b = (String) arrayList.get(1);
        b10.f20958c = (Boolean) arrayList.get(2);
        Object obj = arrayList.get(3);
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        b10.f20959d = lValueOf;
        Boolean bool = (Boolean) arrayList.get(4);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
        }
        b10.f20960e = bool;
        return b10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f20956a);
        arrayList.add(this.f20957b);
        arrayList.add(this.f20958c);
        arrayList.add(this.f20959d);
        arrayList.add(this.f20960e);
        return arrayList;
    }
}
