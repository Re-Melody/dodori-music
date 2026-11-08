package A1;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f133b;

    public j(Resources resources, Resources.Theme theme) {
        this.f132a = resources;
        this.f133b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f132a.equals(jVar.f132a) && Objects.equals(this.f133b, jVar.f133b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f132a, this.f133b);
    }
}
