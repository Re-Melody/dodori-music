package T0;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11447a;

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            return this.f11447a == ((D) obj).f11447a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11447a);
    }

    public final String toString() {
        int i10 = this.f11447a;
        if (i10 == 0) {
            return OfficeOpenXMLExtended.SECURITY_NONE;
        }
        if (i10 == 1) {
            return "All";
        }
        if (i10 == 2) {
            return "Weight";
        }
        return i10 == 3 ? "Style" : "Invalid";
    }
}
