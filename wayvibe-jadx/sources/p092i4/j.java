package p092i4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f20502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20503b = 1073741824;

    public j(InputStream inputStream) {
        this.f20502a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f20503b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20502a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f20502a.read();
        if (i10 == -1) {
            this.f20503b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f20502a.skip(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f20502a.read(bArr);
        if (i10 == -1) {
            this.f20503b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f20502a.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f20503b = 0;
        }
        return i12;
    }
}
