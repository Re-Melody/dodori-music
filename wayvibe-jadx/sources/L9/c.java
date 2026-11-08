package L9;

import K9.e;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7918f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f7921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7923e;

    public c(e eVar) {
        eVar.getClass();
        this.f7919a = new ArrayList();
        this.f7922d = -1;
        b(8192);
    }

    public final void b(int i10) {
        int i11 = this.f7922d;
        ArrayList arrayList = this.f7919a;
        if (i11 < arrayList.size() - 1) {
            this.f7923e += this.f7921c.length;
            int i12 = this.f7922d + 1;
            this.f7922d = i12;
            this.f7921c = (byte[]) arrayList.get(i12);
            return;
        }
        byte[] bArr = this.f7921c;
        if (bArr == null) {
            if (i10 <= 0) {
                i10 = 1024;
            }
            this.f7923e = 0;
        } else {
            i10 = Math.max(bArr.length << 1, i10 - this.f7923e);
            this.f7923e += this.f7921c.length;
        }
        this.f7922d++;
        byte[] bArr2 = G9.c.f5698a;
        byte[] bArr3 = new byte[i10];
        this.f7921c = bArr3;
        arrayList.add(bArr3);
    }

    public final byte[] c() {
        int i10 = this.f7920b;
        if (i10 == 0) {
            return G9.c.f5698a;
        }
        byte[] bArr = G9.c.f5698a;
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr3 : this.f7919a) {
            int iMin = Math.min(bArr3.length, i10);
            System.arraycopy(bArr3, 0, bArr2, i11, iMin);
            i11 += iMin;
            i10 -= iMin;
            if (i10 == 0) {
                break;
            }
        }
        return bArr2;
    }

    public final String toString() {
        return new String(c(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.f7920b;
        int i14 = i13 + i11;
        int i15 = i13 - this.f7923e;
        while (i11 > 0) {
            int iMin = Math.min(i11, this.f7921c.length - i15);
            System.arraycopy(bArr, i12 - i11, this.f7921c, i15, iMin);
            i11 -= iMin;
            if (i11 > 0) {
                b(i14);
                i15 = 0;
            }
        }
        this.f7920b = i14;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        int i11 = this.f7920b;
        int i12 = i11 - this.f7923e;
        if (i12 == this.f7921c.length) {
            b(i11 + 1);
            i12 = 0;
        }
        this.f7921c[i12] = (byte) i10;
        this.f7920b++;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
