package U7;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12327b;

    public o(String str, Map map) {
        this.f12326a = str;
        this.f12327b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f12326a.equals(oVar.f12326a) && Objects.equals(this.f12327b, oVar.f12327b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12326a, this.f12327b);
    }
}
