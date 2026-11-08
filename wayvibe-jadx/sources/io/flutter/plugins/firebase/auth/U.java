package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f20872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f20875f;

    public static U a(ArrayList arrayList) {
        Long lValueOf;
        U u10 = new U();
        u10.f20870a = (String) arrayList.get(0);
        Object obj = arrayList.get(1);
        Long lValueOf2 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        if (lValueOf == null) {
            throw new IllegalStateException("Nonnull field \"timeout\" is null.");
        }
        u10.f20871b = lValueOf;
        Object obj2 = arrayList.get(2);
        if (obj2 != null) {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        u10.f20872c = lValueOf2;
        u10.f20873d = (String) arrayList.get(3);
        u10.f20874e = (String) arrayList.get(4);
        u10.f20875f = (String) arrayList.get(5);
        return u10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(this.f20870a);
        arrayList.add(this.f20871b);
        arrayList.add(this.f20872c);
        arrayList.add(this.f20873d);
        arrayList.add(this.f20874e);
        arrayList.add(this.f20875f);
        return arrayList;
    }
}
