package p255y2;

import B2.AbstractC0111a;
import B2.C;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2337m f28764a;

    static {
        new SparseBooleanArray();
        AbstractC0111a.h(!false);
        C.D(0);
    }

    public G(C2337m c2337m) {
        this.f28764a = c2337m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            return this.f28764a.equals(((G) obj).f28764a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28764a.hashCode();
    }
}
