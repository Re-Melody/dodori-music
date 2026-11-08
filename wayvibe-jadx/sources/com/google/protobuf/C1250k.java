package com.google.protobuf;

import B2.AbstractC0112b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1250k extends AbstractC1252l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18749d;

    public C1250k(byte[] bArr) {
        bArr.getClass();
        this.f18749d = bArr;
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final void A(AbstractC1267t abstractC1267t) {
        abstractC1267t.x(this.f18749d, C(), size());
    }

    public final boolean B(C1250k c1250k, int i10, int i11) {
        if (i11 > c1250k.size()) {
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }
        int i12 = i10 + i11;
        if (i12 > c1250k.size()) {
            StringBuilder sbP = AbstractC0112b.p("Ran off end of other: ", i10, ", ", i11, ", ");
            sbP.append(c1250k.size());
            throw new IllegalArgumentException(sbP.toString());
        }
        if (!(c1250k instanceof C1250k)) {
            return c1250k.x(i10, i12).equals(x(0, i11));
        }
        int iC = C() + i11;
        int iC2 = C();
        int iC3 = c1250k.C() + i10;
        while (iC2 < iC) {
            if (this.f18749d[iC2] != c1250k.f18749d[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    public int C() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1252l) && size() == ((AbstractC1252l) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C1250k)) {
                return obj.equals(this);
            }
            C1250k c1250k = (C1250k) obj;
            int i10 = this.f18754a;
            int i11 = c1250k.f18754a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                return B(c1250k, 0, size());
            }
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final ByteBuffer f() {
        return ByteBuffer.wrap(this.f18749d, C(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC1252l
    public byte i(int i10) {
        return this.f18749d[i10];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1242g(this);
    }

    @Override // com.google.protobuf.AbstractC1252l
    public void n(int i10, byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f18749d, i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final int o() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC1252l
    public byte p(int i10) {
        return this.f18749d[i10];
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final boolean q() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final boolean r() {
        int iC = C();
        return b1.f18729a.s(this.f18749d, iC, size() + iC);
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final AbstractC1260p s() {
        return AbstractC1260p.f(this.f18749d, C(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC1252l
    public int size() {
        return this.f18749d.length;
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final int t(int i10, int i11, int i12) {
        int iC = C() + i11;
        Charset charset = V.f18703a;
        for (int i13 = iC; i13 < iC + i12; i13++) {
            i10 = (i10 * 31) + this.f18749d[i13];
        }
        return i10;
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final int u(int i10, int i11, int i12) {
        int iC = C() + i11;
        return b1.f18729a.v(i10, this.f18749d, iC, i12 + iC);
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final AbstractC1252l x(int i10, int i11) {
        int iK = AbstractC1252l.k(i10, i11, size());
        if (iK == 0) {
            return AbstractC1252l.f18752b;
        }
        return new C1248j(this.f18749d, C() + i10, iK);
    }

    @Override // com.google.protobuf.AbstractC1252l
    public final String z(Charset charset) {
        return new String(this.f18749d, C(), size(), charset);
    }
}
