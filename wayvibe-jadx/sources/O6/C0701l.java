package O6;

import B2.AbstractC0112b;
import T6.Z0;

/* JADX INFO: renamed from: O6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0701l extends F6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z0 f9311b;

    public C0701l(String str, Z0 z1) {
        this.f9310a = str;
        this.f9311b = z1;
    }

    @Override // F6.j
    public final boolean a() {
        return this.f9311b != Z0.RAW;
    }

    public final String toString() {
        String str;
        int i10 = AbstractC0700k.f9308a[this.f9311b.ordinal()];
        if (i10 == 1) {
            str = "TINK";
        } else if (i10 == 2) {
            str = "LEGACY";
        } else if (i10 != 3) {
            str = i10 != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return AbstractC0112b.l(new StringBuilder("(typeUrl="), this.f9310a, ", outputPrefixType=", str, ")");
    }
}
