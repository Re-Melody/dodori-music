package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f20843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f20844c;

    public static N a(ArrayList arrayList) {
        N n6 = new N();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        n6.f20842a = str;
        n6.f20843b = (List) arrayList.get(1);
        n6.f20844c = (Map) arrayList.get(2);
        return n6;
    }
}
