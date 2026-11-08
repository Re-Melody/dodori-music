package Z2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13468d;

    public E(int i10, byte[] bArr, int i11, int i12) {
        this.f13465a = i10;
        this.f13466b = bArr;
        this.f13467c = i11;
        this.f13468d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e2 = (E) obj;
            if (this.f13465a == e2.f13465a && this.f13467c == e2.f13467c && this.f13468d == e2.f13468d && Arrays.equals(this.f13466b, e2.f13466b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f13466b) + (this.f13465a * 31)) * 31) + this.f13467c) * 31) + this.f13468d;
    }
}
