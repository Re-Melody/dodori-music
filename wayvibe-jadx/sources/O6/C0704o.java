package O6;

import B2.AbstractC0112b;
import T6.A0;
import T6.Z0;
import java.util.Objects;

/* JADX INFO: renamed from: O6.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704o extends F6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f9314a;

    public C0704o(M m8) {
        this.f9314a = m8;
    }

    @Override // F6.j
    public final boolean a() {
        return this.f9314a.f9267b.D() != Z0.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0704o)) {
            return false;
        }
        M m8 = ((C0704o) obj).f9314a;
        M m10 = this.f9314a;
        if (m10.f9267b.D().equals(m8.f9267b.D())) {
            String strE = m10.f9267b.E();
            A0 a10 = m8.f9267b;
            if (strE.equals(a10.E()) && m10.f9267b.F().equals(a10.F())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        M m8 = this.f9314a;
        return Objects.hash(m8.f9267b, m8.f9266a);
    }

    public final String toString() {
        String str;
        M m8 = this.f9314a;
        String strE = m8.f9267b.E();
        int i10 = AbstractC0703n.f9313a[m8.f9267b.D().ordinal()];
        if (i10 == 1) {
            str = "TINK";
        } else if (i10 == 2) {
            str = "LEGACY";
        } else if (i10 != 3) {
            str = i10 != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return AbstractC0112b.h("(typeUrl=", strE, ", outputPrefixType=", str, ")");
    }
}
