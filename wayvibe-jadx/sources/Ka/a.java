package Ka;

import android.media.MediaDataSource;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7409a;

    public a(byte[] bArr) {
        this.f7409a = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public final synchronized long getSize() {
        return this.f7409a.length;
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j10, byte[] buffer, int i10, int i11) {
        m.f(buffer, "buffer");
        byte[] bArr = this.f7409a;
        if (j10 >= bArr.length) {
            return -1;
        }
        long length = i11;
        long j11 = j10 + length;
        if (j11 > bArr.length) {
            length -= j11 - ((long) bArr.length);
        }
        int i12 = (int) length;
        System.arraycopy(bArr, (int) j10, buffer, i10, i12);
        return i12;
    }
}
