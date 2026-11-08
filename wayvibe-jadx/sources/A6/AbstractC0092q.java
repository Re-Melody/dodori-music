package A6;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: A6.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0092q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient C0091p f394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Map f395c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0092q)) {
            return false;
        }
        AbstractC0092q abstractC0092q = (AbstractC0092q) obj;
        S s8 = (S) this;
        Map mapG = s8.f395c;
        if (mapG == null) {
            mapG = s8.g();
            s8.f395c = mapG;
        }
        S s10 = (S) abstractC0092q;
        Map mapG2 = s10.f395c;
        if (mapG2 == null) {
            mapG2 = s10.g();
            s10.f395c = mapG2;
        }
        return mapG.equals(mapG2);
    }

    public final int hashCode() {
        S s8 = (S) this;
        Map mapG = s8.f395c;
        if (mapG == null) {
            mapG = s8.g();
            s8.f395c = mapG;
        }
        return mapG.hashCode();
    }

    public final String toString() {
        S s8 = (S) this;
        Map mapG = s8.f395c;
        if (mapG == null) {
            mapG = s8.g();
            s8.f395c = mapG;
        }
        return mapG.toString();
    }
}
