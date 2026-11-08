package W4;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12793b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12797f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12795d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12796e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12794c = new byte[1];

    public d(c cVar, e eVar) {
        this.f12792a = cVar;
        this.f12793b = eVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12796e) {
            return;
        }
        this.f12792a.b();
        this.f12796e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f12794c;
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
        X4.a.q(!this.f12796e);
        boolean z10 = this.f12795d;
        c cVar = this.f12792a;
        if (!z10) {
            cVar.a(this.f12793b);
            this.f12795d = true;
        }
        int iA = cVar.a(bArr, i10, i11);
        if (iA == -1) {
            return -1;
        }
        this.f12797f += (long) iA;
        return iA;
    }
}
