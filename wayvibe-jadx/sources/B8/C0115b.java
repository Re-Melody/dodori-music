package B8;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: renamed from: B8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0115b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0115b f768b = new C0115b(new IdentityHashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f769a;

    public C0115b(IdentityHashMap identityHashMap) {
        this.f769a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0115b.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.f769a;
        int size = identityHashMap.size();
        IdentityHashMap identityHashMap2 = ((C0115b) obj).f769a;
        if (size != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !p228v8.c.d(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f769a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f769a.toString();
    }
}
