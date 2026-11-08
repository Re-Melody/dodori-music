package D8;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: D8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0266d implements Closeable {
    public abstract void A(int i10);

    public final void b(int i10) {
        if (x() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean e() {
        return this instanceof M1;
    }

    public abstract AbstractC0266d g(int i10);

    public abstract void l(OutputStream outputStream, int i10);

    public abstract void q(ByteBuffer byteBuffer);

    public abstract void v(byte[] bArr, int i10, int i11);

    public abstract int w();

    public abstract int x();

    public void z() {
        throw new UnsupportedOperationException();
    }

    public void c() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
