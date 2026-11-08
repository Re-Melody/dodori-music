package p184r3;

import Z2.k;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f25879d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f25880a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25882c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f25879d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int b(int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if ((f25879d[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public final long c(k kVar, boolean z10, boolean z11, int i10) throws EOFException, InterruptedIOException {
        int i11 = this.f25881b;
        byte[] bArr = this.f25880a;
        if (i11 == 0) {
            if (!kVar.d(bArr, 0, 1, z10)) {
                return -1L;
            }
            int iB = b(bArr[0] & ForkServer.ERROR);
            this.f25882c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f25881b = 1;
        }
        int i12 = this.f25882c;
        if (i12 > i10) {
            this.f25881b = 0;
            return -2L;
        }
        if (i12 != 1) {
            kVar.d(bArr, 1, i12 - 1, false);
        }
        this.f25881b = 0;
        return a(bArr, this.f25882c, z11);
    }
}
