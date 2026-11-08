package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C1046d;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1187h extends AbstractC1188i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18435d;

    public C1187h(byte[] bArr) {
        this.f18444a = 0;
        bArr.getClass();
        this.f18435d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1188i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1188i) || size() != ((AbstractC1188i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1187h)) {
            return obj.equals(this);
        }
        C1187h c1187h = (C1187h) obj;
        int i10 = this.f18444a;
        int i11 = c1187h.f18444a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c1187h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1187h.size()) {
            StringBuilder sbP = p134m1.b.p(size, "Ran off end of other: 0, ", ", ");
            sbP.append(c1187h.size());
            throw new IllegalArgumentException(sbP.toString());
        }
        int iM = m() + size;
        int iM2 = m();
        int iM3 = c1187h.m();
        while (iM2 < iM) {
            if (this.f18435d[iM2] != c1187h.f18435d[iM3]) {
                return false;
            }
            iM2++;
            iM3++;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1188i
    public byte f(int i10) {
        return this.f18435d[i10];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1046d(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1188i
    public void j(byte[] bArr, int i10) {
        System.arraycopy(this.f18435d, 0, bArr, 0, i10);
    }

    public int m() {
        return 0;
    }

    public byte n(int i10) {
        return this.f18435d[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1188i
    public int size() {
        return this.f18435d.length;
    }
}
