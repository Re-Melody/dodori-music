package Z2;

import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p255y2.AbstractC2347x;
import p255y2.InterfaceC2333i;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2333i f13547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13549d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13552g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f13550e = new byte[ETagPayloadStore.CHUNK_CHARS];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13546a = new byte[4096];

    static {
        AbstractC2347x.a("media3.extractor");
    }

    public k(InterfaceC2333i interfaceC2333i, long j10, long j11) {
        this.f13547b = interfaceC2333i;
        this.f13549d = j10;
        this.f13548c = j11;
    }

    public final boolean a(int i10, boolean z10) throws EOFException, InterruptedIOException {
        b(i10);
        int iE = this.f13552g - this.f13551f;
        while (iE < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iE = e(this.f13550e, this.f13551f, i11, iE, z11);
            if (iE == -1) {
                return false;
            }
            this.f13552g = this.f13551f + iE;
            i10 = i11;
            z10 = z11;
        }
        this.f13551f += i10;
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f13551f + i10;
        byte[] bArr = this.f13550e;
        if (i11 > bArr.length) {
            this.f13550e = Arrays.copyOf(this.f13550e, B2.C.j(bArr.length * 2, ETagPayloadStore.CHUNK_CHARS + i11, i11 + 524288));
        }
    }

    public final int c(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        k kVar;
        int iMin;
        b(i11);
        int i12 = this.f13552g;
        int i13 = this.f13551f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            kVar = this;
            iMin = kVar.e(this.f13550e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            kVar.f13552g += iMin;
        } else {
            kVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(kVar.f13550e, kVar.f13551f, bArr, i10, iMin);
        kVar.f13551f += iMin;
        return iMin;
    }

    @Override // Z2.p
    public final boolean d(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.f13552g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f13550e, 0, bArr, i10, iMin);
            h(iMin);
        }
        int iE = iMin;
        while (iE < i11 && iE != -1) {
            iE = e(bArr, i10, i11, iE, z10);
        }
        if (iE != -1) {
            this.f13549d += (long) iE;
        }
        return iE != -1;
    }

    public final int e(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f13547b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // Z2.p
    public final boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f13550e, this.f13551f - i11, bArr, i10, i11);
        return true;
    }

    public final int g(int i10) throws EOFException, InterruptedIOException {
        k kVar;
        int iMin = Math.min(this.f13552g, i10);
        h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f13546a;
            kVar = this;
            iMin = kVar.e(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            kVar = this;
        }
        if (iMin != -1) {
            kVar.f13549d += (long) iMin;
        }
        return iMin;
    }

    public final void h(int i10) {
        int i11 = this.f13552g - i10;
        this.f13552g = i11;
        this.f13551f = 0;
        byte[] bArr = this.f13550e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[ETagPayloadStore.CHUNK_CHARS + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f13550e = bArr2;
    }

    @Override // Z2.p
    public final long i() {
        return this.f13549d + ((long) this.f13551f);
    }

    @Override // Z2.p
    public final void j(int i10) throws EOFException, InterruptedIOException {
        a(i10, false);
    }

    @Override // Z2.p
    public final long m() {
        return this.f13548c;
    }

    @Override // Z2.p
    public final void o() {
        this.f13551f = 0;
    }

    @Override // Z2.p
    public final void p(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f13552g, i10);
        h(iMin);
        int iE = iMin;
        while (iE < i10 && iE != -1) {
            byte[] bArr = this.f13546a;
            iE = e(bArr, -iE, Math.min(i10, bArr.length + iE), iE, false);
        }
        if (iE != -1) {
            this.f13549d += (long) iE;
        }
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        k kVar;
        int i12 = this.f13552g;
        int iE = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f13550e, 0, bArr, i10, iMin);
            h(iMin);
            iE = iMin;
        }
        if (iE == 0) {
            kVar = this;
            iE = kVar.e(bArr, i10, i11, 0, true);
        } else {
            kVar = this;
        }
        if (iE != -1) {
            kVar.f13549d += (long) iE;
        }
        return iE;
    }

    @Override // Z2.p
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        d(bArr, i10, i11, false);
    }

    @Override // Z2.p
    public final void w(byte[] bArr, int i10, int i11) {
        f(bArr, i10, i11, false);
    }

    @Override // Z2.p
    public final long x() {
        return this.f13549d;
    }
}
