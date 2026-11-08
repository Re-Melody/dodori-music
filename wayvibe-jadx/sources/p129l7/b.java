package p129l7;

import p170p7.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f22081a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f22081a.equals(((b) obj).f22081a);
    }

    public final int hashCode() {
        return this.f22081a.hashCode();
    }
}
