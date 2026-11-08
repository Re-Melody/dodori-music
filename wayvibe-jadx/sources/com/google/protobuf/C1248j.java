package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1248j extends C1250k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18745f;

    public C1248j(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC1252l.k(i10, i10 + i11, bArr.length);
        this.f18744e = i10;
        this.f18745f = i11;
    }

    @Override // com.google.protobuf.C1250k
    public final int C() {
        return this.f18744e;
    }

    @Override // com.google.protobuf.C1250k, com.google.protobuf.AbstractC1252l
    public final byte i(int i10) {
        AbstractC1252l.j(i10, this.f18745f);
        return this.f18749d[this.f18744e + i10];
    }

    @Override // com.google.protobuf.C1250k, com.google.protobuf.AbstractC1252l
    public final void n(int i10, byte[] bArr, int i11, int i12) {
        System.arraycopy(this.f18749d, this.f18744e + i10, bArr, i11, i12);
    }

    @Override // com.google.protobuf.C1250k, com.google.protobuf.AbstractC1252l
    public final byte p(int i10) {
        return this.f18749d[this.f18744e + i10];
    }

    @Override // com.google.protobuf.C1250k, com.google.protobuf.AbstractC1252l
    public final int size() {
        return this.f18745f;
    }
}
