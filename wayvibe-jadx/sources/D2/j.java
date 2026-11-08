package D2;

import B2.AbstractC0111a;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f1859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1860b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1862d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1863e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1861c = new byte[1];

    public j(h hVar, k kVar) {
        this.f1859a = hVar;
        this.f1860b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1863e) {
            return;
        }
        this.f1859a.close();
        this.f1863e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f1861c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC0111a.h(!this.f1863e);
        boolean z10 = this.f1862d;
        h hVar = this.f1859a;
        if (!z10) {
            hVar.l(this.f1860b);
            this.f1862d = true;
        }
        int i12 = hVar.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        return i12;
    }
}
