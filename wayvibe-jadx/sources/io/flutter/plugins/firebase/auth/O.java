package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f20845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f20847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20849e;

    public static O a(ArrayList arrayList) {
        Long lValueOf;
        Long lValueOf2;
        O o10 = new O();
        Object obj = arrayList.get(0);
        Long lValueOf3 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        o10.f20845a = lValueOf;
        Object obj2 = arrayList.get(1);
        if (obj2 == null) {
            lValueOf2 = null;
        } else {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        o10.f20846b = lValueOf2;
        Object obj3 = arrayList.get(2);
        if (obj3 != null) {
            lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
        }
        o10.f20847c = lValueOf3;
        o10.f20848d = (String) arrayList.get(3);
        String str = (String) arrayList.get(4);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
        }
        o10.f20849e = str;
        return o10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f20845a);
        arrayList.add(this.f20846b);
        arrayList.add(this.f20847c);
        arrayList.add(this.f20848d);
        arrayList.add(this.f20849e);
        return arrayList;
    }
}
