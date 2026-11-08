package F3;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B2.A f4472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B2.u f4473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4479i;

    public u(int i10) {
        this.f4471a = i10;
        switch (i10) {
            case 1:
                this.f4472b = new B2.A(0L);
                this.f4477g = -9223372036854775807L;
                this.f4478h = -9223372036854775807L;
                this.f4479i = -9223372036854775807L;
                this.f4473c = new B2.u();
                break;
            default:
                this.f4472b = new B2.A(0L);
                this.f4477g = -9223372036854775807L;
                this.f4478h = -9223372036854775807L;
                this.f4479i = -9223372036854775807L;
                this.f4473c = new B2.u();
                break;
        }
    }

    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & ForkServer.ERROR) | ((bArr[i10] & ForkServer.ERROR) << 24) | ((bArr[i10 + 1] & ForkServer.ERROR) << 16) | ((bArr[i10 + 2] & ForkServer.ERROR) << 8);
    }

    public static long c(B2.u uVar) {
        int i10 = uVar.f631b;
        if (uVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        uVar.e(bArr, 0, 9);
        uVar.F(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(Z2.k kVar) {
        switch (this.f4471a) {
            case 0:
                byte[] bArr = B2.C.f565f;
                B2.u uVar = this.f4473c;
                uVar.getClass();
                uVar.D(bArr, bArr.length);
                this.f4474d = true;
                kVar.f13551f = 0;
                break;
            default:
                byte[] bArr2 = B2.C.f565f;
                B2.u uVar2 = this.f4473c;
                uVar2.getClass();
                uVar2.D(bArr2, bArr2.length);
                this.f4474d = true;
                kVar.f13551f = 0;
                break;
        }
    }
}
