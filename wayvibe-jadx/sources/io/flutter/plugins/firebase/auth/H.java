package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f20820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20821d;

    public static H a(ArrayList arrayList) {
        Long lValueOf;
        H h10 = new H();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        h10.f20818a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        h10.f20819b = str2;
        Object obj = arrayList.get(2);
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        if (lValueOf == null) {
            throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
        }
        h10.f20820c = lValueOf;
        h10.f20821d = (String) arrayList.get(3);
        return h10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.f20818a);
        arrayList.add(this.f20819b);
        arrayList.add(this.f20820c);
        arrayList.add(this.f20821d);
        return arrayList;
    }
}
