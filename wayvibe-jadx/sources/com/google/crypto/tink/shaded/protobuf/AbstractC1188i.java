package com.google.crypto.tink.shaded.protobuf;

import B2.AbstractC0112b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1188i implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1187h f18442b = new C1187h(E.f18378b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1185f f18443c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18444a;

    static {
        f18443c = AbstractC1182c.a() ? new C1185f(1) : new C1185f(0);
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

    public static C1187h i(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        h(i10, i10 + i11, bArr.length);
        switch (f18443c.f18429a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C1187h(bArrCopyOfRange);
    }

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public final int hashCode() {
        int i10 = this.f18444a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        C1187h c1187h = (C1187h) this;
        int iM = c1187h.m();
        int i11 = size;
        for (int i12 = iM; i12 < iM + size; i12++) {
            i11 = (i11 * 31) + c1187h.f18435d[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f18444a = i11;
        return i11;
    }

    public abstract void j(byte[] bArr, int i10);

    public final byte[] k() {
        int size = size();
        if (size == 0) {
            return E.f18378b;
        }
        byte[] bArr = new byte[size];
        j(bArr, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        C1187h c1186g;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = S9.b.r(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C1187h c1187h = (C1187h) this;
            int iH = h(0, 47, c1187h.size());
            if (iH == 0) {
                c1186g = f18442b;
            } else {
                c1186g = new C1186g(c1187h.f18435d, c1187h.m(), iH);
            }
            sb.append(S9.b.r(c1186g));
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
