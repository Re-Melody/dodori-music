package L9;

import G6.t;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7913a = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J9.a f7914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J9.b f7915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7917e;

    public b(t tVar, A8.b bVar) {
        this.f7914b = tVar;
        this.f7915c = bVar;
    }

    public final void b(int i10) {
        if (this.f7917e || this.f7916d + ((long) i10) <= this.f7913a) {
            return;
        }
        this.f7917e = true;
        this.f7914b.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f7915c.b(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((OutputStream) this.f7915c.b(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        b(bArr.length);
        ((OutputStream) this.f7915c.b(this)).write(bArr);
        this.f7916d += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        b(i11);
        ((OutputStream) this.f7915c.b(this)).write(bArr, i10, i11);
        this.f7916d += (long) i11;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        b(1);
        ((OutputStream) this.f7915c.b(this)).write(i10);
        this.f7916d++;
    }
}
