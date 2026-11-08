package D8;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class L1 extends InputStream implements B8.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0266d f2290a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f2290a.x();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2290a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f2290a.c();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f2290a.e();
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC0266d abstractC0266d = this.f2290a;
        if (abstractC0266d.x() == 0) {
            return -1;
        }
        return abstractC0266d.w();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f2290a.z();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        AbstractC0266d abstractC0266d = this.f2290a;
        int iMin = (int) Math.min(abstractC0266d.x(), j10);
        abstractC0266d.A(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC0266d abstractC0266d = this.f2290a;
        if (abstractC0266d.x() == 0) {
            return -1;
        }
        int iMin = Math.min(abstractC0266d.x(), i11);
        abstractC0266d.v(bArr, i10, iMin);
        return iMin;
    }
}
