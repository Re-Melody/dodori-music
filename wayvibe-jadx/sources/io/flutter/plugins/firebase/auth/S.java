package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f20860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f20861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f20863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20864j;
    public Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f20865l;

    public static S a(ArrayList arrayList) {
        Long lValueOf;
        S s8 = new S();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        s8.f20855a = str;
        s8.f20856b = (String) arrayList.get(1);
        s8.f20857c = (String) arrayList.get(2);
        s8.f20858d = (String) arrayList.get(3);
        s8.f20859e = (String) arrayList.get(4);
        Boolean bool = (Boolean) arrayList.get(5);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
        }
        s8.f20860f = bool;
        Boolean bool2 = (Boolean) arrayList.get(6);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
        }
        s8.f20861g = bool2;
        s8.f20862h = (String) arrayList.get(7);
        s8.f20863i = (String) arrayList.get(8);
        s8.f20864j = (String) arrayList.get(9);
        Object obj = arrayList.get(10);
        Long lValueOf2 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        s8.k = lValueOf;
        Object obj2 = arrayList.get(11);
        if (obj2 != null) {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        s8.f20865l = lValueOf2;
        return s8;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(this.f20855a);
        arrayList.add(this.f20856b);
        arrayList.add(this.f20857c);
        arrayList.add(this.f20858d);
        arrayList.add(this.f20859e);
        arrayList.add(this.f20860f);
        arrayList.add(this.f20861g);
        arrayList.add(this.f20862h);
        arrayList.add(this.f20863i);
        arrayList.add(this.f20864j);
        arrayList.add(this.k);
        arrayList.add(this.f20865l);
        return arrayList;
    }
}
