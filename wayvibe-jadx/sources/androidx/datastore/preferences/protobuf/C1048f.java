package androidx.datastore.preferences.protobuf;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048f extends C1049g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15088f;

    public C1048f(byte[] bArr, int i10, int i11) {
        super(bArr);
        C1049g.h(i10, i10 + i11, bArr.length);
        this.f15087e = i10;
        this.f15088f = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.C1049g
    public final byte f(int i10) {
        int i11 = this.f15088f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f15095b[this.f15087e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(p134m1.b.j(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0112b.e("Index > length: ", i10, i11, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C1049g
    public final void j(byte[] bArr, int i10) {
        System.arraycopy(this.f15095b, this.f15087e, bArr, 0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.C1049g
    public final int k() {
        return this.f15087e;
    }

    @Override // androidx.datastore.preferences.protobuf.C1049g
    public final byte m(int i10) {
        return this.f15095b[this.f15087e + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C1049g
    public final int size() {
        return this.f15088f;
    }
}
