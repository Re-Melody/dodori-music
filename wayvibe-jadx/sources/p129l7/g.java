package p129l7;

import java.util.ArrayList;
import p170p7.h;
import p170p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f22100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f22101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22103d;

    public g(h hVar, q qVar, boolean z10, ArrayList arrayList) {
        this.f22100a = hVar;
        this.f22101b = qVar;
        this.f22102c = z10;
        this.f22103d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f22102c == gVar.f22102c && this.f22100a.equals(gVar.f22100a) && this.f22101b.equals(gVar.f22101b)) {
            return this.f22103d.equals(gVar.f22103d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22103d.hashCode() + ((((this.f22101b.f25279a.hashCode() + (this.f22100a.f25264a.hashCode() * 31)) * 31) + (this.f22102c ? 1 : 0)) * 31);
    }
}
