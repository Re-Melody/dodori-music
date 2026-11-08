package K1;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: K1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f7303a;

    public C0606h(DisplayCutout displayCutout) {
        this.f7303a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0606h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f7303a, ((C0606h) obj).f7303a);
    }

    public final int hashCode() {
        return this.f7303a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f7303a + "}";
    }
}
