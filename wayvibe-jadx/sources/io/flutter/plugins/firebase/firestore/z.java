package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f21037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f21038b;

    public static z a(ArrayList arrayList) {
        z zVar = new z();
        zVar.f21037a = (Boolean) arrayList.get(0);
        zVar.f21038b = (List) arrayList.get(1);
        return zVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f21037a);
        arrayList.add(this.f21038b);
        return arrayList;
    }
}
