package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f21033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f21034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f21035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f21036d;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(4);
        p pVar = this.f21033a;
        arrayList.add(pVar == null ? null : Integer.valueOf(pVar.index));
        A a10 = this.f21034b;
        arrayList.add(a10 != null ? a10.b() : null);
        arrayList.add(this.f21035c);
        arrayList.add(this.f21036d);
        return arrayList;
    }
}
