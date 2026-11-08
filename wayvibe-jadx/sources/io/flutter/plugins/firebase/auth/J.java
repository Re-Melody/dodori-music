package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f20829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f20830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f20832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20833g;

    public static J a(ArrayList arrayList) {
        Long lValueOf;
        Long lValueOf2;
        J j10 = new J();
        j10.f20827a = (String) arrayList.get(0);
        Object obj = arrayList.get(1);
        Long lValueOf3 = null;
        if (obj == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        j10.f20828b = lValueOf;
        Object obj2 = arrayList.get(2);
        if (obj2 == null) {
            lValueOf2 = null;
        } else {
            lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        j10.f20829c = lValueOf2;
        Object obj3 = arrayList.get(3);
        if (obj3 != null) {
            lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
        }
        j10.f20830d = lValueOf3;
        j10.f20831e = (String) arrayList.get(4);
        j10.f20832f = (Map) arrayList.get(5);
        j10.f20833g = (String) arrayList.get(6);
        return j10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(this.f20827a);
        arrayList.add(this.f20828b);
        arrayList.add(this.f20829c);
        arrayList.add(this.f20830d);
        arrayList.add(this.f20831e);
        arrayList.add(this.f20832f);
        arrayList.add(this.f20833g);
        return arrayList;
    }
}
