package p127l5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22025a;

    public i(ArrayList arrayList) {
        this.f22025a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f22025a.equals(((i) ((o) obj)).f22025a);
    }

    public final int hashCode() {
        return this.f22025a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f22025a + "}";
    }
}
