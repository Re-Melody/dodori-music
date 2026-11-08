package D8;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class M1 extends AbstractC0266d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f2296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2297d = -1;

    public M1(byte[] bArr, int i10, int i11) {
        p229v9.a.g("offset must be >= 0", i10 >= 0);
        p229v9.a.g("length must be >= 0", i11 >= 0);
        int i12 = i11 + i10;
        p229v9.a.g("offset + length exceeds array boundary", i12 <= bArr.length);
        this.f2296c = bArr;
        this.f2294a = i10;
        this.f2295b = i12;
    }

    @Override // D8.AbstractC0266d
    public final void A(int i10) {
        b(i10);
        this.f2294a += i10;
    }

    @Override // D8.AbstractC0266d
    public final void c() {
        this.f2297d = this.f2294a;
    }

    @Override // D8.AbstractC0266d
    public final AbstractC0266d g(int i10) {
        b(i10);
        int i11 = this.f2294a;
        this.f2294a = i11 + i10;
        return new M1(this.f2296c, i11, i10);
    }

    @Override // D8.AbstractC0266d
    public final void l(OutputStream outputStream, int i10) throws IOException {
        b(i10);
        outputStream.write(this.f2296c, this.f2294a, i10);
        this.f2294a += i10;
    }

    @Override // D8.AbstractC0266d
    public final void q(ByteBuffer byteBuffer) {
        p229v9.a.k(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        b(iRemaining);
        byteBuffer.put(this.f2296c, this.f2294a, iRemaining);
        this.f2294a += iRemaining;
    }

    @Override // D8.AbstractC0266d
    public final void v(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f2296c, this.f2294a, bArr, i10, i11);
        this.f2294a += i11;
    }

    @Override // D8.AbstractC0266d
    public final int w() {
        b(1);
        int i10 = this.f2294a;
        this.f2294a = i10 + 1;
        return this.f2296c[i10] & ForkServer.ERROR;
    }

    @Override // D8.AbstractC0266d
    public final int x() {
        return this.f2295b - this.f2294a;
    }

    @Override // D8.AbstractC0266d
    public final void z() {
        int i10 = this.f2297d;
        if (i10 == -1) {
            throw new InvalidMarkException();
        }
        this.f2294a = i10;
    }
}
