package com.google.crypto.tink.shaded.protobuf;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1186g extends C1187h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18434f;

    public C1186g(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC1188i.h(i10, i10 + i11, bArr.length);
        this.f18433e = i10;
        this.f18434f = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1187h, com.google.crypto.tink.shaded.protobuf.AbstractC1188i
    public final byte f(int i10) {
        int i11 = this.f18434f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f18435d[this.f18433e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(p134m1.b.j(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0112b.e("Index > length: ", i10, i11, ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1187h, com.google.crypto.tink.shaded.protobuf.AbstractC1188i
    public final void j(byte[] bArr, int i10) {
        System.arraycopy(this.f18435d, this.f18433e, bArr, 0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1187h
    public final int m() {
        return this.f18433e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1187h
    public final byte n(int i10) {
        return this.f18435d[this.f18433e + i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1187h, com.google.crypto.tink.shaded.protobuf.AbstractC1188i
    public final int size() {
        return this.f18434f;
    }
}
