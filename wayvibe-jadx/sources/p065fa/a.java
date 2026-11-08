package p065fa;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19908b;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("https://www.mapbox.com/feedback/");
        arrayList.add("https://www.mapbox.com/map-feedback/");
        arrayList.add("https://apps.mapbox.com/feedback/");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.f19907a;
            String str2 = this.f19907a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = aVar.f19908b;
            String str4 = this.f19908b;
            if (str4 != null) {
                return str4.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19907a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19908b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
