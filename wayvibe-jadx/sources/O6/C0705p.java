package O6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: O6.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0705p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0705p f9315b = new C0705p(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9316a;

    public C0705p(Map map) {
        this.f9316a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0705p) {
            return this.f9316a.equals(((C0705p) obj).f9316a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9316a.hashCode();
    }

    public final String toString() {
        return this.f9316a.toString();
    }
}
