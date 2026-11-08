package p140m7;

import p170p7.k;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f22377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f22378b;

    public D(C c3, k kVar) {
        this.f22377a = c3;
        this.f22378b = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof D)) {
            D d10 = (D) obj;
            if (this.f22377a == d10.f22377a && this.f22378b.equals(d10.f22378b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22378b.hashCode() + ((this.f22377a.hashCode() + 899) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22377a == C.ASCENDING ? "" : "-");
        sb.append(this.f22378b.c());
        return sb.toString();
    }
}
