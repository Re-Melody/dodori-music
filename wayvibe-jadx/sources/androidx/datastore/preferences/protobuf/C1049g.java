package androidx.datastore.preferences.protobuf;

import B2.AbstractC0112b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1049g implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1049g f15092c = new C1049g(A.f15024b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1047e f15093d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15094a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15095b;

    static {
        f15093d = AbstractC1045c.a() ? new C1047e(1) : new C1047e(0);
    }

    public C1049g(byte[] bArr) {
        bArr.getClass();
        this.f15095b = bArr;
    }

    public static int h(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0112b.d(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC0112b.e("Beginning index larger than ending index: ", i10, i11, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0112b.e("End index: ", i11, i12, " >= "));
    }

    public static C1049g i(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        h(i10, i10 + i11, bArr.length);
        switch (f15093d.f15080a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C1049g(bArrCopyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1049g) || size() != ((C1049g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1049g)) {
            return obj.equals(this);
        }
        C1049g c1049g = (C1049g) obj;
        int i10 = this.f15094a;
        int i11 = c1049g.f15094a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c1049g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1049g.size()) {
            StringBuilder sbP = p134m1.b.p(size, "Ran off end of other: 0, ", ", ");
            sbP.append(c1049g.size());
            throw new IllegalArgumentException(sbP.toString());
        }
        int iK = k() + size;
        int iK2 = k();
        int iK3 = c1049g.k();
        while (iK2 < iK) {
            if (this.f15095b[iK2] != c1049g.f15095b[iK3]) {
                return false;
            }
            iK2++;
            iK3++;
        }
        return true;
    }

    public byte f(int i10) {
        return this.f15095b[i10];
    }

    public final int hashCode() {
        int i10 = this.f15094a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int iK = k();
        int i11 = size;
        for (int i12 = iK; i12 < iK + size; i12++) {
            i11 = (i11 * 31) + this.f15095b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f15094a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1046d(this);
    }

    public void j(byte[] bArr, int i10) {
        System.arraycopy(this.f15095b, 0, bArr, 0, i10);
    }

    public int k() {
        return 0;
    }

    public byte m(int i10) {
        return this.f15095b[i10];
    }

    public int size() {
        return this.f15095b.length;
    }

    public final String toString() {
        C1049g c1048f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = S5.d.v(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iH = h(0, 47, size());
            if (iH == 0) {
                c1048f = f15092c;
            } else {
                c1048f = new C1048f(this.f15095b, k(), iH);
            }
            sb.append(S5.d.v(c1048f));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return p134m1.b.m(sb2, string, "\">");
    }
}
