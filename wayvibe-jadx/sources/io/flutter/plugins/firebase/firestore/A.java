package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f20954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f20955c;

    public static A a(ArrayList arrayList) {
        A a10 = new A();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }
        a10.f20953a = str;
        a10.f20954b = (Map) arrayList.get(1);
        Object obj = arrayList.get(2);
        F fA = obj == null ? null : F.a((ArrayList) obj);
        if (fA == null) {
            throw new IllegalStateException("Nonnull field \"metadata\" is null.");
        }
        a10.f20955c = fA;
        return a10;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f20953a);
        arrayList.add(this.f20954b);
        F f10 = this.f20955c;
        arrayList.add(f10 == null ? null : f10.b());
        return arrayList;
    }
}
