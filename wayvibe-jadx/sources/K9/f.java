package K9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ByteArrayInputStream f7397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte[] f7398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7402f;

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f7397a;
        if (this.f7398b == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        return byteArrayInputStream.available() + (this.f7399c - this.f7402f);
    }

    public final int b(ByteArrayInputStream byteArrayInputStream, byte[] bArr) throws IOException {
        int i10 = this.f7401e;
        if (i10 != -1) {
            int i11 = this.f7402f - i10;
            int i12 = this.f7400d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f7398b = bArr2;
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f7402f - this.f7401e;
                this.f7402f = i13;
                this.f7401e = 0;
                this.f7399c = 0;
                int i14 = byteArrayInputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f7402f;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f7399c = i15;
                return i14;
            }
        }
        int i16 = byteArrayInputStream.read(bArr);
        if (i16 > 0) {
            this.f7401e = -1;
            this.f7402f = 0;
            this.f7399c = i16;
        }
        return i16;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7398b = null;
        ByteArrayInputStream byteArrayInputStream = this.f7397a;
        this.f7397a = null;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f7400d = i10;
        this.f7401e = this.f7402f;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.f7398b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f7401e;
        if (-1 == i10) {
            throw new IOException("Mark has been invalidated");
        }
        this.f7402f = i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        byte[] bArr = this.f7398b;
        ByteArrayInputStream byteArrayInputStream = this.f7397a;
        if (bArr == null) {
            throw new IOException("Stream is closed");
        }
        if (j10 < 1) {
            return 0L;
        }
        if (byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f7399c;
        int i11 = this.f7402f;
        int i12 = i10 - i11;
        long j11 = i12;
        if (j11 >= j10) {
            this.f7402f = i11 + ((int) j10);
            return j10;
        }
        this.f7402f = i10;
        if (this.f7401e == -1 || j10 > this.f7400d) {
            return byteArrayInputStream.skip(j10 - j11) + j11;
        }
        if (b(byteArrayInputStream, bArr) == -1) {
            return j11;
        }
        int i13 = this.f7399c;
        int i14 = this.f7402f;
        int i15 = i13 - i14;
        if (i15 >= j10 - j11) {
            this.f7402f = (((int) j10) - i12) + i14;
            return j10;
        }
        this.f7402f = i13;
        return i15 + i12;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f7398b;
        ByteArrayInputStream byteArrayInputStream = this.f7397a;
        if (bArr == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        if (this.f7402f < this.f7399c || b(byteArrayInputStream, bArr) != -1) {
            if (bArr != this.f7398b && (bArr = this.f7398b) == null) {
                throw new IOException("Stream is closed");
            }
            int i10 = this.f7399c;
            int i11 = this.f7402f;
            if (i10 - i11 > 0) {
                this.f7402f = i11 + 1;
                return bArr[i11] & ForkServer.ERROR;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0078  */
    /* JADX WARN: Code duplicated, block: B:60:0x0080 A[LOOP:0: B:26:0x0037->B:60:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x007e A[SYNTHETIC] */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f7398b;
        if (bArr2 != null) {
            if (i10 > bArr.length - i11 || i10 < 0 || i11 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return 0;
            }
            ByteArrayInputStream byteArrayInputStream = this.f7397a;
            if (byteArrayInputStream != null) {
                int i14 = this.f7402f;
                int i15 = this.f7399c;
                if (i14 < i15) {
                    int i16 = i15 - i14;
                    if (i16 >= i11) {
                        i16 = i11;
                    }
                    System.arraycopy(bArr2, i14, bArr, i10, i16);
                    this.f7402f += i16;
                    if (i16 == i11 || byteArrayInputStream.available() == 0) {
                        return i16;
                    }
                    i10 += i16;
                    i12 = i11 - i16;
                } else {
                    i12 = i11;
                }
                while (true) {
                    if (this.f7401e == -1 && i12 >= bArr2.length) {
                        i13 = byteArrayInputStream.read(bArr, i10, i12);
                        if (i13 == -1) {
                            if (i12 == i11) {
                                break;
                            }
                            return i11 - i12;
                        }
                        i12 -= i13;
                        if (i12 == 0) {
                            return i11;
                        }
                        if (byteArrayInputStream.available() == 0) {
                            return i11 - i12;
                        }
                        i10 += i13;
                    } else {
                        if (b(byteArrayInputStream, bArr2) == -1) {
                            if (i12 == i11) {
                                break;
                            }
                            return i11 - i12;
                        }
                        if (bArr2 != this.f7398b && (bArr2 = this.f7398b) == null) {
                            throw new IOException("Stream is closed");
                        }
                        int i17 = this.f7399c;
                        int i18 = this.f7402f;
                        i13 = i17 - i18;
                        if (i13 >= i12) {
                            i13 = i12;
                        }
                        System.arraycopy(bArr2, i18, bArr, i10, i13);
                        this.f7402f += i13;
                        i12 -= i13;
                        if (i12 == 0) {
                            return i11;
                        }
                        if (byteArrayInputStream.available() == 0) {
                            return i11 - i12;
                        }
                        i10 += i13;
                    }
                }
                return -1;
            }
            throw new IOException("Stream is closed");
        }
        throw new IOException("Stream is closed");
    }
}
