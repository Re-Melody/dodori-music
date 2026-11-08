package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f20813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f20817e;

    public static G a(ArrayList arrayList) {
        G g3 = new G();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
        }
        g3.f20813a = bool;
        g3.f20814b = (String) arrayList.get(1);
        g3.f20815c = (String) arrayList.get(2);
        g3.f20816d = (String) arrayList.get(3);
        g3.f20817e = (Map) arrayList.get(4);
        return g3;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f20813a);
        arrayList.add(this.f20814b);
        arrayList.add(this.f20815c);
        arrayList.add(this.f20816d);
        arrayList.add(this.f20817e);
        return arrayList;
    }
}
