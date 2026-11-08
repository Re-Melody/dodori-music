package p255y2;

import B2.AbstractC0111a;
import B2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f28847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f28849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f28850e;

    static {
        C.D(0);
        C.D(1);
        C.D(3);
        C.D(4);
    }

    public V(P p10, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = p10.f28802a;
        this.f28846a = i10;
        boolean z11 = false;
        AbstractC0111a.d(i10 == iArr.length && i10 == zArr.length);
        this.f28847b = p10;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f28848c = z11;
        this.f28849d = (int[]) iArr.clone();
        this.f28850e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V.class == obj.getClass()) {
            V v3 = (V) obj;
            if (this.f28848c == v3.f28848c && this.f28847b.equals(v3.f28847b) && Arrays.equals(this.f28849d, v3.f28849d) && Arrays.equals(this.f28850e, v3.f28850e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28850e) + ((Arrays.hashCode(this.f28849d) + (((this.f28847b.hashCode() * 31) + (this.f28848c ? 1 : 0)) * 31)) * 31);
    }
}
