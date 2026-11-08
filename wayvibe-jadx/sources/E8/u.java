package E8;

import B2.AbstractC0112b;
import D8.AbstractC0266d;
import E9.C0348i;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC0266d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0348i f3320a;

    public u(C0348i c0348i) {
        this.f3320a = c0348i;
    }

    @Override // D8.AbstractC0266d
    public final void A(int i10) {
        try {
            this.f3320a.skip(i10);
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // D8.AbstractC0266d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f3320a.b();
    }

    @Override // D8.AbstractC0266d
    public final AbstractC0266d g(int i10) {
        C0348i c0348i = new C0348i();
        c0348i.r(i10, this.f3320a);
        return new u(c0348i);
    }

    @Override // D8.AbstractC0266d
    public final void l(OutputStream outputStream, int i10) throws IOException {
        this.f3320a.P(outputStream, i10);
    }

    @Override // D8.AbstractC0266d
    public final void q(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // D8.AbstractC0266d
    public final void v(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int i12 = this.f3320a.read(bArr, i10, i11);
            if (i12 == -1) {
                throw new IndexOutOfBoundsException(AbstractC0112b.d(i11, "EOF trying to read ", " bytes"));
            }
            i11 -= i12;
            i10 += i12;
        }
    }

    @Override // D8.AbstractC0266d
    public final int w() {
        try {
            return this.f3320a.readByte() & ForkServer.ERROR;
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // D8.AbstractC0266d
    public final int x() {
        return (int) this.f3320a.f3387b;
    }
}
