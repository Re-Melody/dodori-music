package H5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6061b;

    public p(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f6061b = bArr;
    }

    @Override // H5.o
    public final byte[] O() {
        return this.f6061b;
    }
}
