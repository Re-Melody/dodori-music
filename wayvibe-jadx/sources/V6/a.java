package V6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12712a;

    public a(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f12712a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static a a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new a(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f12712a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f12712a, this.f12712a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12712a);
    }

    public final String toString() {
        return "Bytes(" + p003a.a.s(this.f12712a) + ")";
    }
}
