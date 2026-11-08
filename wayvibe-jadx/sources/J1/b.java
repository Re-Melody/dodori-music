package J1;

import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6457b;

    public b(Object obj, Object obj2) {
        this.f6456a = obj;
        this.f6457b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f6456a, this.f6456a) && Objects.equals(bVar.f6457b, this.f6457b);
    }

    public final int hashCode() {
        Object obj = this.f6456a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6457b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f6456a + StringUtils.SPACE + this.f6457b + "}";
    }
}
