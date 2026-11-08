package p084h8;

import android.media.MediaDataSource;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f20339a;

    public c(byte[] bArr) {
        this.f20339a = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f20339a.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f20339a;
        if (j10 >= bArr2.length) {
            return -1;
        }
        if (((long) i11) + j10 > bArr2.length) {
            i11 = (int) (((long) bArr2.length) - j10);
        }
        System.arraycopy(bArr2, (int) j10, bArr, i10, i11);
        return i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
