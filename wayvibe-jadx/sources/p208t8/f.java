package p208t8;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f26976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f26977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f26978d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f26975a.equals(fVar.f26975a) && this.f26976b.equals(fVar.f26976b) && Objects.equals(this.f26977c, fVar.f26977c) && this.f26978d.equals(fVar.f26978d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26975a, this.f26976b, this.f26977c, this.f26978d);
    }
}
