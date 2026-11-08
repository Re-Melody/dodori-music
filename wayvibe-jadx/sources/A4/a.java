package A4;

import X4.j;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f256g = new byte[4096];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W4.c f257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f260d = new byte[ETagPayloadStore.CHUNK_CHARS];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f262f;

    public a(W4.c cVar, long j10, long j11) {
        this.f257a = cVar;
        this.f259c = j10;
        this.f258b = j11;
    }

    public final int a(byte[] bArr, int i10, int i11) throws InterruptedException, EOFException {
        a aVar;
        int i12 = this.f262f;
        int iB = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f260d, 0, bArr, i10, iMin);
            g(iMin);
            iB = iMin;
        }
        if (iB == 0) {
            aVar = this;
            iB = aVar.b(bArr, i10, i11, 0, true);
        } else {
            aVar = this;
        }
        if (iB != -1) {
            aVar.f259c += (long) iB;
        }
        return iB;
    }

    public final int b(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iA = this.f257a.a(bArr, i10 + i12, i11 - i12);
        if (iA != -1) {
            return i12 + iA;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, EOFException {
        int iMin;
        int i12 = this.f262f;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f260d, 0, bArr, i10, iMin);
            g(iMin);
        }
        int iB = iMin;
        while (iB < i11 && iB != -1) {
            iB = b(bArr, i10, i11, iB, z10);
        }
        if (iB != -1) {
            this.f259c += (long) iB;
        }
        return iB != -1;
    }

    public final void d(int i10) throws InterruptedException, EOFException {
        int iMin = Math.min(this.f262f, i10);
        g(iMin);
        int iB = iMin;
        while (iB < i10 && iB != -1) {
            iB = b(f256g, -iB, Math.min(i10, iB + 4096), iB, false);
        }
        if (iB != -1) {
            this.f259c += (long) iB;
        }
    }

    public final boolean e(int i10, boolean z10) throws InterruptedException, EOFException {
        int i11 = this.f261e + i10;
        byte[] bArr = this.f260d;
        if (i11 > bArr.length) {
            this.f260d = Arrays.copyOf(this.f260d, j.b(bArr.length * 2, ETagPayloadStore.CHUNK_CHARS + i11, i11 + 524288));
        }
        int iMin = Math.min(this.f262f - this.f261e, i10);
        while (iMin < i10) {
            int i12 = i10;
            boolean z11 = z10;
            iMin = b(this.f260d, this.f261e, i12, iMin, z11);
            if (iMin == -1) {
                return false;
            }
            i10 = i12;
            z10 = z11;
        }
        int i13 = this.f261e + i10;
        this.f261e = i13;
        this.f262f = Math.max(this.f262f, i13);
        return true;
    }

    public final boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        if (!e(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f260d, this.f261e - i11, bArr, i10, i11);
        return true;
    }

    public final void g(int i10) {
        int i11 = this.f262f - i10;
        this.f262f = i11;
        this.f261e = 0;
        byte[] bArr = this.f260d;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[ETagPayloadStore.CHUNK_CHARS + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f260d = bArr2;
    }
}
