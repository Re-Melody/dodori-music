package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q f20850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G f20851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f20852c;

    public static P a(ArrayList arrayList) {
        P p10 = new P();
        p10.f20850a = (Q) arrayList.get(0);
        p10.f20851b = (G) arrayList.get(1);
        p10.f20852c = (H) arrayList.get(2);
        return p10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f20850a);
        arrayList.add(this.f20851b);
        arrayList.add(this.f20852c);
        return arrayList;
    }
}
