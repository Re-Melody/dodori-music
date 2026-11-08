package P3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9628b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9627a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9629c = new ArrayList();

    public z(View view) {
        this.f9628b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f9628b == zVar.f9628b && this.f9627a.equals(zVar.f9627a);
    }

    public final int hashCode() {
        return this.f9627a.hashCode() + (this.f9628b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbT = V0.p.t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbT.append(this.f9628b);
        sbT.append("\n");
        String strN = V0.p.n(sbT.toString(), "    values:");
        HashMap map = this.f9627a;
        for (String str : map.keySet()) {
            strN = strN + "    " + str + ": " + map.get(str) + "\n";
        }
        return strN;
    }
}
