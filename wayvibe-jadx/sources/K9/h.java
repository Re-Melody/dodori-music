package K9;

import java.io.InputStream;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends InputStream {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7404e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7408d;

    public h(g gVar) {
        int i10 = g.f7403l;
        H9.a aVar = gVar.f6242j;
        if (aVar == null) {
            throw new IllegalStateException("origin == null");
        }
        byte[] bArr = (byte[]) aVar.f6241j;
        int i11 = gVar.k;
        b(0, "offset");
        b(i11, "length");
        Objects.requireNonNull(bArr, "data");
        this.f7405a = bArr;
        b(0, "defaultValue");
        this.f7406b = Math.min(Math.min(0, bArr.length > 0 ? bArr.length : 0) + i11, bArr.length);
        b(0, "defaultValue");
        this.f7407c = Math.min(0, bArr.length > 0 ? bArr.length : 0);
        b(0, "defaultValue");
        this.f7408d = Math.min(0, bArr.length > 0 ? bArr.length : 0);
    }

    public static void b(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(str.concat(" cannot be negative"));
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        int i10 = this.f7407c;
        int i11 = this.f7406b;
        if (i10 < i11) {
            return i11 - i10;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f7408d = this.f7407c;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10 = this.f7407c;
        if (i10 >= this.f7406b) {
            return -1;
        }
        this.f7407c = i10 + 1;
        return this.f7405a[i10] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f7407c = this.f7408d;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i10 = this.f7407c;
        long j11 = this.f7406b - i10;
        if (j10 < j11) {
            j11 = j10;
        }
        this.f7407c = Math.addExact(i10, Math.toIntExact(j10));
        return j11;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "dest");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int i12 = this.f7407c;
            int i13 = this.f7406b;
            if (i12 >= i13) {
                return -1;
            }
            int i14 = i13 - i12;
            if (i11 >= i14) {
                i11 = i14;
            }
            if (i11 <= 0) {
                return 0;
            }
            System.arraycopy(this.f7405a, i12, bArr, i10, i11);
            this.f7407c += i11;
            return i11;
        }
        throw new IndexOutOfBoundsException();
    }

    public h(byte[] bArr) {
        int length = bArr.length;
        this.f7405a = bArr;
        this.f7406b = length;
        this.f7407c = 0;
        this.f7408d = 0;
    }
}
