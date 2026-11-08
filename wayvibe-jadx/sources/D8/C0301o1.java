package D8;

import B8.AbstractC0124k;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: D8.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0301o1 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f2726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2729e;

    public C0301o1(InputStream inputStream, int i10, v2 v2Var) {
        super(inputStream);
        this.f2729e = -1L;
        this.f2725a = i10;
        this.f2726b = v2Var;
    }

    public final void b() {
        long j10 = this.f2728d;
        long j11 = this.f2727c;
        if (j10 > j11) {
            long j12 = j10 - j11;
            for (AbstractC0124k abstractC0124k : this.f2726b.f2824a) {
                abstractC0124k.f(j12);
            }
            this.f2727c = this.f2728d;
        }
    }

    public final void c() {
        long j10 = this.f2728d;
        int i10 = this.f2725a;
        if (j10 <= i10) {
            return;
        }
        throw new B8.t0(B8.r0.k.g("Decompressed gRPC message exceeds maximum size " + i10));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f2729e = this.f2728d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f2728d++;
        }
        c();
        b();
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f2729e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f2728d = this.f2729e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j10);
        this.f2728d += jSkip;
        c();
        b();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f2728d += (long) i12;
        }
        c();
        b();
        return i12;
    }
}
