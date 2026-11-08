package P3;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f9552a;

    public G(ViewGroup viewGroup) {
        this.f9552a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && ((G) obj).f9552a.equals(this.f9552a);
    }

    public final int hashCode() {
        return this.f9552a.hashCode();
    }
}
