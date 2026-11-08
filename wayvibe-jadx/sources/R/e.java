package R;

import N8.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10611b;

    public e(ArrayList arrayList, boolean z10) {
        this.f10610a = z10;
        this.f10611b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10610a == eVar.f10610a && this.f10611b.equals(eVar.f10611b);
    }

    public final int hashCode() {
        return this.f10611b.hashCode() + (Boolean.hashCode(this.f10610a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Posture(isTabletop=");
        sb.append(this.f10610a);
        sb.append(", hinges=[");
        return p134m1.b.m(sb, n.H0(this.f10611b, ", ", null, null, null, 62), "])");
    }
}
