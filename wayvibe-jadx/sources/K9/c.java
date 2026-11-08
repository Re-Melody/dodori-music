package K9;

import H6.i;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends FilterInputStream {
    private final J9.c afterRead;
    private volatile boolean closed;
    private final J9.a exceptionHandler;

    public c(InputStream inputStream) {
        super(inputStream);
        this.exceptionHandler = new i(18);
        this.afterRead = J9.c.f6742T;
    }

    public void afterRead(int i10) {
        this.afterRead.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null || isClosed()) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e2) {
            handleIOException(e2);
            return 0;
        }
    }

    public void checkOpen() throws IOException {
        if (isClosed()) {
            throw new IOException("Closed");
        }
    }

    public void handleIOException(IOException iOException) {
        this.exceptionHandler.accept(iOException);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10 = 1;
        try {
            beforeRead(1);
            int i11 = ((FilterInputStream) this).in.read();
            if (i11 == -1) {
                i10 = -1;
            }
            afterRead(i10);
            return i11;
        } catch (IOException e2) {
            handleIOException(e2);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e2) {
            handleIOException(e2);
        }
    }

    public c setReference(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        try {
            return ((FilterInputStream) this).in.skip(j10);
        } catch (IOException e2) {
            handleIOException(e2);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            byte[] bArr2 = G9.c.f5698a;
            beforeRead(bArr == null ? 0 : bArr.length);
            int i10 = ((FilterInputStream) this).in.read(bArr);
            afterRead(i10);
            return i10;
        } catch (IOException e2) {
            handleIOException(e2);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            beforeRead(i11);
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            afterRead(i12);
            return i12;
        } catch (IOException e2) {
            handleIOException(e2);
            return -1;
        }
    }

    public void beforeRead(int i10) {
    }
}
