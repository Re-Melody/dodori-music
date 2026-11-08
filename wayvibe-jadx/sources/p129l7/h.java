package p129l7;

import p140m7.E;
import p140m7.N;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f22104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f22105b;

    public h(N n6, E e2) {
        this.f22104a = n6;
        this.f22105b = e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f22104a.equals(hVar.f22104a) && this.f22105b == hVar.f22105b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22105b.hashCode() + (this.f22104a.hashCode() * 31);
    }
}
